package JDBC;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.List;


public class DatabaseConnectionGUI extends JFrame {

    // DB Login Credentials
    JTextField usernameField;
    JPasswordField passwordField;

    // Connect Button
    JButton connectButton;

    // Establish a connection
    Connection connection;

    // Creating a Tab Panel With in the Window
    JTabbedPane tabbedPane;

    // Creating a Table
    JTable studentTable;

    // Creating the necessary Fields for the Table
    JTextField rollNoField;
    JTextField firstNameField;
    JTextField dobField;
    JTextField percentageField;
    JTextField contactNoField;

    // Creating a Refresh Button to Check again in the DB and Prints..
    JButton refreshButton;

    public DatabaseConnectionGUI() {
        setTitle("Database Connection");
        setSize(500, 375);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel loginPanel = new JPanel(new GridLayout(3, 2));
        loginPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        connectButton = new JButton("Connect");

        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                try {
                    // Loading the Oracle JDBC driver
                    Class.forName("oracle.jdbc.driver.OracleDriver");

                    // Establishing connection
                    connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", username, password);
                    JOptionPane.showMessageDialog(DatabaseConnectionGUI.this, "Connected to the database!");

                    // Create tabs for displaying data and adding new data
                    createTabs();
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(DatabaseConnectionGUI.this, "Oracle JDBC driver not found!", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(DatabaseConnectionGUI.this, "Failed to connect to the database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(new JLabel());  // Empty cell for better alignment
        loginPanel.add(connectButton);

        add(loginPanel, BorderLayout.NORTH);

        tabbedPane = new JTabbedPane();
        add(tabbedPane, BorderLayout.CENTER);
    }

    private void createTabs() {
        // Create tab for displaying existing data
        JPanel studentPanel = new JPanel(new BorderLayout());
        retrieveStudentDetails(studentPanel);
        tabbedPane.addTab("Student Details", studentPanel);

        // Create tab for adding new data
        JPanel addStudentPanel = new JPanel(new GridLayout(6, 2));
        addStudentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel rollNoLabel = new JLabel("Roll No:");
        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel dobLabel = new JLabel("DOB:");
        JLabel percentageLabel = new JLabel("Percentage:");
        JLabel contactNoLabel = new JLabel("Contact No:");

        rollNoField = new JTextField();
        firstNameField = new JTextField();
        dobField = new JTextField();
        percentageField = new JTextField();
        contactNoField = new JTextField();

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int rollNo = Integer.parseInt(rollNoField.getText());
                    String firstName = firstNameField.getText();
                    String dob = dobField.getText();
                    int percentage = Integer.parseInt(percentageField.getText());
                    String contactNo = contactNoField.getText();

                    // Insert data into the table
                    String query = "INSERT INTO STUDENTS (rollNo, firstName, DOB, percentage, contactNo) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement statement = connection.prepareStatement(query);
                    statement.setInt(1, rollNo);
                    statement.setString(2, firstName);
                    statement.setString(3, dob);
                    statement.setInt(4, percentage);
                    statement.setString(5, contactNo);

                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(DatabaseConnectionGUI.this, "Student added successfully!");
                        // Refresh the table
                        retrieveStudentDetails((JPanel) tabbedPane.getComponentAt(0));
                    }
                } catch (NumberFormatException | SQLException ex) {
                    JOptionPane.showMessageDialog(DatabaseConnectionGUI.this, "Failed to add student: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        addStudentPanel.add(rollNoLabel);
        addStudentPanel.add(rollNoField);
        addStudentPanel.add(firstNameLabel);
        addStudentPanel.add(firstNameField);
        addStudentPanel.add(dobLabel);
        addStudentPanel.add(dobField);
        addStudentPanel.add(percentageLabel);
        addStudentPanel.add(percentageField);
        addStudentPanel.add(contactNoLabel);
        addStudentPanel.add(contactNoField);
        addStudentPanel.add(new JLabel());  // Empty cell for better alignment
        addStudentPanel.add(addButton);

        tabbedPane.addTab("Add Student", addStudentPanel);
    }

    private void retrieveStudentDetails(JPanel panel) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENTS");

            // Create table model
            DefaultTableModel tableModel = new DefaultTableModel();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }

            // Clear existing data in the table model
            tableModel.setRowCount(0);

            // Populate table model with data
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                tableModel.addRow(row);
            }

            // Create JTable with table model
            if (studentTable == null) {
                studentTable = new JTable(tableModel);
                JScrollPane scrollPane = new JScrollPane(studentTable);
                panel.add(scrollPane, BorderLayout.CENTER);

                // Add refresh button
                refreshButton = new JButton("Refresh");
                refreshButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        retrieveStudentDetails(panel);
                    }
                });
                panel.add(refreshButton, BorderLayout.SOUTH);
            } else {
                studentTable.setModel(tableModel);
            }

            // Adding filter/sort buttons for each column
            JPanel filterPanel = new JPanel(new GridLayout(1, columnCount));
            for (int i = 0; i < columnCount; i++) {
                JButton filterButton = new JButton("Sort A-Z");
                int columnIndex = i;
                filterButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
                        sorter.setSortKeys(List.of(new RowSorter.SortKey(columnIndex, SortOrder.ASCENDING)));
                        studentTable.setRowSorter(sorter);
                    }
                });
                filterPanel.add(filterButton);
            }
            panel.add(filterPanel, BorderLayout.NORTH);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(DatabaseConnectionGUI.this, "Error fetching student details: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Print stack trace for debugging
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DatabaseConnectionGUI().setVisible(true);
            }
        });
    }
}

