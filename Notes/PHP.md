## 1. Introduction to PHP

### What is PHP?

**PHP** stands for **"Hypertext Preprocessor"**. It is a popular server-side scripting language designed for web development but also used as a general-purpose language. PHP code is embedded within HTML and executed on the server to produce dynamic web pages.

**Key Features:**
- **Server-Side Execution:** PHP scripts run on the server, and the result is sent to the client's browser.
- **Integration with Databases:** PHP can easily interact with databases such as MySQL, PostgreSQL, and SQLite.
- **Cross-Platform:** PHP is compatible with various operating systems, including Windows, Linux, and macOS.
- **Open Source:** PHP is freely available and widely supported by a large community.

### History of PHP

- **1994:** PHP was created by Rasmus Lerdorf as a set of Common Gateway Interface (CGI) binaries written in C. It was initially called "Personal Home Page Tools."
- **1995:** The first version of PHP/FI (Forms Interpreter) was released, providing basic scripting capabilities.
- **1997:** PHP 3 was released, significantly enhancing its capabilities and introducing the PHP scripting language.
- **1998:** PHP 4 was introduced, which included the Zend Engine, improving performance and adding support for various web technologies.
- **2004:** PHP 5 was released with significant improvements such as enhanced object-oriented programming support and the introduction of the PDO (PHP Data Objects) extension.
- **2015:** PHP 7 was released, offering major performance improvements and new language features.
- **2020:** PHP 8 introduced Just-In-Time (JIT) compilation and other advanced features for improved performance and functionality.

### How to Set Up the Environment for PHP?

1. **Install a Local Server Environment:**
  - **XAMPP:** A free and open-source cross-platform web server solution stack package. It includes Apache, MySQL, and PHP.
    - **Download:** [XAMPP Official Site](https://www.apachefriends.org/index.html)
    - **Installation:** Follow the installer instructions to set up Apache and MySQL with PHP.
  - **WAMP:** Windows, Apache, MySQL, and PHP bundle for Windows.
    - **Download:** [WAMP Official Site](http://www.wampserver.com/en/)
  - **MAMP:** A free, local server environment for macOS and Windows.
    - **Download:** [MAMP Official Site](https://www.mamp.info/en/)

2. **Verify PHP Installation:**
  - **Create a Test File:**
    - Create a file named `info.php` in the `htdocs` directory (for XAMPP) or `www` directory (for WAMP/MAMP).
    - Add the following code to `info.php`:
      ```php
      <?php
      phpinfo();
      ?>
      ```
  - **Access the File via Browser:**
    - Open a web browser and navigate to `http://localhost/info.php`. This should display a page with information about the PHP configuration.

3. **Choose an IDE or Text Editor:**
  - **Visual Studio Code (VSCode):** A popular code editor with PHP support via extensions.
  - **Sublime Text:** A versatile and fast text editor with PHP syntax highlighting.
  - **PHPStorm:** A powerful commercial IDE specifically designed for PHP development.

---

## 2. Basic Syntax

### PHP Tags

PHP code is embedded in HTML using specific tags. The most common tags are:

- **Standard PHP Tags:**
  ```php
  <?php
  // PHP code goes here
  ?>
  ```
  - Used to write PHP code that will be executed on the server.

- **Short Echo Tags:**
  ```php
  <?= 'Hello, World!' ?>
  ```
  - A shorthand for `<?php echo 'Hello, World!'; ?>`. This tag is used to quickly output data.

- **Short Tags (Not Recommended):**
  ```php
  <? // PHP code here ?>
  ```
  - Short tags `<?` are not recommended because they may be disabled on some servers. Always use the full `<?php` tag for compatibility.

### Comments

Comments in PHP are used to annotate the code and are not executed. They are helpful for documentation and code clarity.

- **Single-Line Comments:**
  - **Using `//`:**
    ```php
    // This is a single-line comment
    $variable = "value";
    ```
  - **Using `#`:**
    ```php
    # This is another single-line comment
    $variable = "value";
    ```

- **Multi-Line Comments:**
  ```php
  /*
   * This is a multi-line comment.
   * It can span multiple lines.
   */
  $variable = "value";
  ```

### PHP Variables

Variables in PHP are used to store data. PHP variables are prefixed with a dollar sign (`$`).

- **Declaring Variables:**
  ```php
  $variable_name = "value";
  ```
  - Variable names start with `$` and must begin with a letter or an underscore followed by letters, numbers, or underscores.

- **Variable Types:**
  - **Strings:**
    ```php
    $string = "Hello, World!";
    ```
  - **Integers:**
    ```php
    $integer = 42;
    ```
  - **Floats:**
    ```php
    $float = 3.14;
    ```
  - **Booleans:**
    ```php
    $boolean = true;
    ```

- **Variable Scope:**
  - **Local Variables:** Declared within a function and accessible only within that function.
  - **Global Variables:** Declared outside any function and accessible throughout the script. To access a global variable inside a function, use the `global` keyword.
    ```php
    $globalVar = "I'm global";

    function myFunction() {
        global $globalVar;
        echo $globalVar;
    }
    myFunction(); // Outputs: I'm global
    ```

- **Variable Concatenation:**
  ```php
  $firstName = "John";
  $lastName = "Doe";
  $fullName = $firstName . " " . $lastName; // Concatenates strings
  ```

---


Certainly! Here's a concise guide on PHP data types and operators, ideal for beginners:

---

## Data Types and Operators in PHP

### **Data Types**

PHP supports several data types, which can be classified into scalar types and compound types.

#### **1. Scalar Data Types**

- **Integer**
  - Whole numbers without a decimal point.
  - Example:
    ```php
    $age = 25; // An integer
    ```

- **Float (or Double)**
  - Numbers with decimal points.
  - Example:
    ```php
    $price = 19.99; // A float
    ```

- **String**
  - A sequence of characters enclosed in quotes.
  - Can be enclosed in single quotes (`'`) or double quotes (`"`).
  - Example:
    ```php
    $name = "Alice"; // A string
    ```

- **Boolean**
  - Represents two possible values: `true` or `false`.
  - Example:
    ```php
    $isActive = true; // A boolean
    ```

#### **2. Compound Data Types**

- **Array**
  - A collection of values indexed by keys.
  - Indexed Arrays (numeric indices) and Associative Arrays (named keys).
  - Example:
    ```php
    $colors = array("red", "green", "blue"); // Indexed array
    $person = array("firstName" => "John", "lastName" => "Doe"); // Associative array
    ```

- **Object**
  - Instances of classes, which can hold properties and methods.
  - Example:
    ```php
    class Car {
        public $make;
        public $model;
        function __construct($make, $model) {
            $this->make = $make;
            $this->model = $model;
        }
    }
    $myCar = new Car("Toyota", "Corolla"); // An object
    ```

- **NULL**
  - Represents a variable with no value.
  - Example:
    ```php
    $empty = NULL; // NULL value
    ```

### **Operators**

Operators are used to perform operations on variables and values. PHP supports various types of operators:

#### **1. Arithmetic Operators**

- **Addition (`+`)**
  ```php
  $sum = 10 + 5; // 15
  ```

- **Subtraction (`-`)**
  ```php
  $difference = 10 - 5; // 5
  ```

- **Multiplication (`*`)**
  ```php
  $product = 10 * 5; // 50
  ```

- **Division (`/`)**
  ```php
  $quotient = 10 / 5; // 2
  ```

- **Modulus (`%`)**
  ```php
  $remainder = 10 % 3; // 1
  ```

#### **2. Comparison Operators**

- **Equal (`==`)**
  ```php
  $result = (10 == 10); // true
  ```

- **Identical (`===`)**
  ```php
  $result = (10 === "10"); // false
  ```

- **Not Equal (`!=`)**
  ```php
  $result = (10 != 5); // true
  ```

- **Not Identical (`!==`)**
  ```php
  $result = (10 !== "10"); // true
  ```

- **Greater Than (`>`)**
  ```php
  $result = (10 > 5); // true
  ```

- **Less Than (`<`)**
  ```php
  $result = (10 < 5); // false
  ```

- **Greater Than or Equal To (`>=`)**
  ```php
  $result = (10 >= 10); // true
  ```

- **Less Than or Equal To (`<=`)**
  ```php
  $result = (10 <= 5); // false
  ```

#### **3. Logical Operators**

- **And (`&&`)**
  ```php
  $result = (true && false); // false
  ```

- **Or (`||`)**
  ```php
  $result = (true || false); // true
  ```

- **Not (`!`)**
  ```php
  $result = !true; // false
  ```

#### **4. Assignment Operators**

- **Assignment (`=`)**
  ```php
  $x = 10; // Assigns 10 to $x
  ```

- **Addition Assignment (`+=`)**
  ```php
  $x += 5; // Equivalent to $x = $x + 5;
  ```

- **Subtraction Assignment (`-=`)**
  ```php
  $x -= 5; // Equivalent to $x = $x - 5;
  ```

- **Multiplication Assignment (`*=`)**
  ```php
  $x *= 5; // Equivalent to $x = $x * 5;
  ```

- **Division Assignment (`/=`)**
  ```php
  $x /= 5; // Equivalent to $x = $x / 5;
  ```

- **Modulus Assignment (`%=`)**
  ```php
  $x %= 5; // Equivalent to $x = $x % 5;
  ```

---


Certainly! Control structures in PHP allow you to control the flow of execution based on conditions and loops. Here's a basic guide covering conditional statements and loops:

---

## Control Structures in PHP

### **1. Conditional Statements**

Conditional statements allow you to execute different blocks of code based on certain conditions.

#### **a. `if` Statement**

The `if` statement evaluates a condition and executes a block of code if the condition is true.

```php
$age = 18;

if ($age >= 18) {
    echo "You are an adult.";
}
```

#### **b. `if-else` Statement**

The `if-else` statement allows you to execute one block of code if the condition is true and another block if it is false.

```php
$age = 16;

if ($age >= 18) {
    echo "You are an adult.";
} else {
    echo "You are not an adult.";
}
```

#### **c. `if-elseif-else` Statement**

The `if-elseif-else` statement checks multiple conditions in sequence. It executes the block of code for the first true condition.

```php
$score = 85;

if ($score >= 90) {
    echo "Grade: A";
} elseif ($score >= 80) {
    echo "Grade: B";
} elseif ($score >= 70) {
    echo "Grade: C";
} else {
    echo "Grade: D";
}
```

#### **d. `switch` Statement**

The `switch` statement is used to select one of many blocks of code to be executed. It is a cleaner way to handle multiple conditions based on a single variable.

```php
$day = 3;

switch ($day) {
    case 1:
        echo "Monday";
        break;
    case 2:
        echo "Tuesday";
        break;
    case 3:
        echo "Wednesday";
        break;
    case 4:
        echo "Thursday";
        break;
    case 5:
        echo "Friday";
        break;
    case 6:
        echo "Saturday";
        break;
    case 7:
        echo "Sunday";
        break;
    default:
        echo "Invalid day";
        break;
}
```

### **2. Loops**

Loops allow you to execute a block of code repeatedly as long as a specified condition is true.

#### **a. `while` Loop**

The `while` loop executes a block of code as long as a condition is true.

```php
$count = 1;

while ($count <= 5) {
    echo "Count: $count<br>";
    $count++;
}
```

#### **b. `do-while` Loop**

The `do-while` loop executes a block of code at least once, then repeats the loop as long as the condition is true.

```php
$count = 1;

do {
    echo "Count: $count<br>";
    $count++;
} while ($count <= 5);
```

#### **c. `for` Loop**

The `for` loop is used when the number of iterations is known. It consists of three parts: initialization, condition, and increment/decrement.

```php
for ($i = 1; $i <= 5; $i++) {
    echo "Number: $i<br>";
}
```

#### **d. `foreach` Loop**

The `foreach` loop is used to iterate over arrays. It is particularly useful for looping through associative arrays.

```php
$colors = array("red", "green", "blue");

foreach ($colors as $color) {
    echo "Color: $color<br>";
}
```

#### **e. `break` and `continue` Statements**

- **`break`:** Exits the current loop or `switch` statement.
  ```php
  for ($i = 1; $i <= 10; $i++) {
      if ($i == 5) {
          break; // Exits the loop when $i is 5
      }
      echo "Number: $i<br>";
  }
  ```

- **`continue`:** Skips the rest of the current loop iteration and continues with the next iteration.
  ```php
  for ($i = 1; $i <= 10; $i++) {
      if ($i % 2 == 0) {
          continue; // Skips the even numbers
      }
      echo "Odd Number: $i<br>";
  }
  ```

---



---

## Functions in PHP

### **1. Defining a Function**

A function is defined using the `function` keyword, followed by the function name, parentheses (which may include parameters), and a block of code enclosed in curly braces.

```php
function greet() {
    echo "Hello, World!";
}
```

### **2. Calling a Function**

Once a function is defined, you can call it by using its name followed by parentheses.

```php
greet(); // Outputs: Hello, World!
```

### **3. Function Parameters**

Functions can accept parameters, which are values you pass to the function when you call it. Parameters are specified inside the parentheses in the function definition.

```php
function greet($name) {
    echo "Hello, " . $name . "!";
}

greet("Alice"); // Outputs: Hello, Alice!
```

### **4. Return Values**

Functions can return a value using the `return` keyword. The returned value can then be used elsewhere in your code.

```php
function add($a, $b) {
    return $a + $b;
}

$result = add(5, 3); // $result is now 8
echo $result; // Outputs: 8
```

### **5. Default Parameter Values**

You can specify default values for function parameters. If a value is not provided for a parameter, the default value is used.

```php
function greet($name = "Guest") {
    echo "Hello, " . $name . "!";
}

greet(); // Outputs: Hello, Guest!
greet("Bob"); // Outputs: Hello, Bob!
```

### **6. Variable Scope**

Variables defined inside a function are local to that function and cannot be accessed outside of it. Similarly, to access a global variable inside a function, you must use the `global` keyword.

```php
$globalVar = "I am global";

function testScope() {
    global $globalVar;
    echo $globalVar; // Outputs: I am global
}

testScope();
```

### **7. Functions with Variable-Length Arguments**

PHP allows functions to accept a variable number of arguments using the `...` operator (also known as the variadic operator).

```php
function sum(...$numbers) {
    $total = 0;
    foreach ($numbers as $number) {
        $total += $number;
    }
    return $total;
}

echo sum(1, 2, 3, 4, 5); // Outputs: 15
```

### **8. Anonymous Functions**

Anonymous functions (or closures) are functions without a name. They are often used as callback functions or for inline use.

```php
$square = function($number) {
    return $number * $number;
};

echo $square(4); // Outputs: 16
```

### **9. Recursive Functions**

A recursive function is one that calls itself. Recursion is useful for tasks that can be divided into similar subtasks.

```php
function factorial($n) {
    if ($n <= 1) {
        return 1;
    }
    return $n * factorial($n - 1);
}

echo factorial(5); // Outputs: 120
```

### **10. Function Documentation**

Using PHPDoc comments can help document your functions, providing descriptions for parameters and return values. This is especially useful for larger projects.

```php
/**
 * Calculate the factorial of a number.
 *
 * @param int $n The number to calculate the factorial for.
 * @return int The factorial of the number.
 */
function factorial($n) {
    if ($n <= 1) {
        return 1;
    }
    return $n * factorial($n - 1);
}
```

---


### Working with Forms in PHP

Forms are a common way to collect user input in web applications. PHP provides tools for handling form submissions, validating user input, and sanitizing data to ensure it's safe for processing. Here’s a guide covering form handling with both GET and POST methods, and best practices for validation and sanitization.

---

## **1. Form Handling**

### **a. Using the GET Method**

The `GET` method appends form data to the URL, which is visible and should only be used for non-sensitive data. The data is passed via the query string.

**Example HTML Form with GET Method:**

```html
<!DOCTYPE html>
<html>
<head>
    <title>Form Handling with GET</title>
</head>
<body>
    <h1>Form Handling with GET Method</h1>
    <form method="get" action="get_form.php">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
```

**PHP Script (get_form.php):**

```php
<!DOCTYPE html>
<html>
<head>
    <title>Form Handling with GET</title>
</head>
<body>
    <h1>Form Submission Results (GET Method)</h1>
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "GET") {
        $name = isset($_GET['name']) ? htmlspecialchars($_GET['name']) : 'Unknown';
        $age = isset($_GET['age']) ? (int)$_GET['age'] : 'Not specified';
        
        echo "<p>Name: $name</p>";
        echo "<p>Age: $age</p>";
    }
    ?>
</body>
</html>
```

### **b. Using the POST Method**

The `POST` method sends form data in the request body, which is not visible in the URL. It is used for sensitive or large amounts of data.

**Example HTML Form with POST Method:**

```html
<!DOCTYPE html>
<html>
<head>
    <title>Form Handling with POST</title>
</head>
<body>
    <h1>Form Handling with POST Method</h1>
    <form method="post" action="post_form.php">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="message">Message:</label>
        <textarea id="message" name="message" rows="4" cols="50" required></textarea><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
```

**PHP Script (post_form.php):**

```php
<!DOCTYPE html>
<html>
<head>
    <title>Form Handling with POST</title>
</head>
<body>
    <h1>Form Submission Results (POST Method)</h1>
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $email = isset($_POST['email']) ? htmlspecialchars($_POST['email']) : 'Not provided';
        $message = isset($_POST['message']) ? htmlspecialchars($_POST['message']) : 'No message';
        
        echo "<p>Email: $email</p>";
        echo "<p>Message: $message</p>";
    }
    ?>
</body>
</html>
```

---

## **2. Validation and Sanitization**

**Validation** ensures that the data meets certain criteria (e.g., correct format), while **sanitization** cleans the data to remove unwanted characters.

### **a. Input Validation**

Validation checks if the data is in the expected format or within certain constraints. Common validation techniques include checking for empty fields, proper formats, or value ranges.

**Example PHP Validation:**

```php
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $email = isset($_POST['email']) ? trim($_POST['email']) : '';
    $message = isset($_POST['message']) ? trim($_POST['message']) : '';

    // Validate email format
    if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        echo "Invalid email format.<br>";
    }

    // Validate that message is not empty
    if (empty($message)) {
        echo "Message cannot be empty.<br>";
    }

    if (filter_var($email, FILTER_VALIDATE_EMAIL) && !empty($message)) {
        echo "Email: $email<br>";
        echo "Message: $message<br>";
    }
}
?>
```

### **b. Input Sanitization**

Sanitization involves cleaning user input to remove or escape any potentially dangerous characters or code.

**Example PHP Sanitization:**

```php
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve and sanitize input
    $email = isset($_POST['email']) ? filter_var(trim($_POST['email']), FILTER_SANITIZE_EMAIL) : '';
    $message = isset($_POST['message']) ? htmlspecialchars(trim($_POST['message'])) : '';

    // Output sanitized data
    echo "Sanitized Email: $email<br>";
    echo "Sanitized Message: $message<br>";
}
?>
```

### **c. Combining Validation and Sanitization**

For best practices, always combine validation and sanitization to ensure data integrity and security.

**Example Combining Both:**

```php
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Sanitize input
    $email = isset($_POST['email']) ? filter_var(trim($_POST['email']), FILTER_SANITIZE_EMAIL) : '';
    $message = isset($_POST['message']) ? htmlspecialchars(trim($_POST['message'])) : '';

    // Validate email format
    if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        echo "Invalid email format.<br>";
    }

    // Validate that message is not empty
    if (empty($message)) {
        echo "Message cannot be empty.<br>";
    }

    if (filter_var($email, FILTER_VALIDATE_EMAIL) && !empty($message)) {
        echo "Valid Email: $email<br>";
        echo "Valid Message: $message<br>";
    }
}
?>
```

---

Certainly! Working with files in PHP involves reading from and writing to files, as well as handling file uploads. Here's a guide covering these topics:

---

## **Working with Files in PHP**

### **1. Reading from Files**

PHP provides several functions to read data from files. Below are examples using `fopen()`, `fread()`, and `fclose()`.

#### **a. Opening and Reading Files with `fopen()`, `fread()`, and `fclose()`**

**Example: Reading the Entire File**

```php
<?php
// Open the file for reading
$filename = "example.txt";
$file = fopen($filename, "r"); // "r" means read-only mode

if ($file) {
    // Read the file content
    $content = fread($file, filesize($filename));
    
    // Output the content
    echo nl2br(htmlspecialchars($content)); // nl2br() converts newlines to <br> tags for HTML, htmlspecialchars() escapes HTML characters

    // Close the file
    fclose($file);
} else {
    echo "Unable to open file.";
}
?>
```

**Explanation:**

- `fopen($filename, "r")`: Opens the file in read-only mode.
- `fread($file, filesize($filename))`: Reads the entire file content.
- `fclose($file)`: Closes the file after reading.

#### **b. Reading Files Line by Line**

**Example: Reading Each Line**

```php
<?php
$filename = "example.txt";
$file = fopen($filename, "r");

if ($file) {
    while (($line = fgets($file)) !== false) {
        echo nl2br(htmlspecialchars($line)); // Output each line
    }
    fclose($file);
} else {
    echo "Unable to open file.";
}
?>
```

**Explanation:**

- `fgets($file)`: Reads one line at a time from the file.

### **2. Writing to Files**

PHP allows you to write data to files using `fwrite()` and `file_put_contents()`.

#### **a. Writing with `fwrite()`**

**Example: Writing Data to a File**

```php
<?php
$filename = "example.txt";
$file = fopen($filename, "w"); // "w" means write mode, creates file if it doesn't exist or truncates the file

if ($file) {
    $content = "Hello, World!\nThis is a new line.";
    fwrite($file, $content); // Write the content to the file
    fclose($file);
    echo "File written successfully.";
} else {
    echo "Unable to open file.";
}
?>
```

**Explanation:**

- `fopen($filename, "w")`: Opens the file for writing. Creates the file if it does not exist, and truncates it if it does.
- `fwrite($file, $content)`: Writes the specified content to the file.

#### **b. Writing with `file_put_contents()`**

**Example: Writing Data to a File**

```php
<?php
$filename = "example.txt";
$content = "Hello, World!\nThis is a new line.";

if (file_put_contents($filename, $content) !== false) {
    echo "File written successfully.";
} else {
    echo "Unable to write to file.";
}
?>
```

**Explanation:**

- `file_put_contents($filename, $content)`: Writes data to a file. Creates the file if it does not exist, and overwrites it if it does.

### **3. File Uploading**

To handle file uploads, you'll use an HTML form along with PHP to process the uploaded file.

#### **a. HTML Form for File Upload**

**Example: HTML Form**

```html
<!DOCTYPE html>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
    <h1>Upload a File</h1>
    <form action="upload.php" method="post" enctype="multipart/form-data">
        <label for="file">Choose a file:</label>
        <input type="file" id="file" name="file" required><br><br>
        <input type="submit" value="Upload">
    </form>
</body>
</html>
```

**Explanation:**

- `enctype="multipart/form-data"`: Ensures that the form can handle file uploads.
- `input type="file"`: Allows users to select a file for upload.

#### **b. PHP Script to Handle File Upload**

**Example: PHP Script (`upload.php`)**

```php
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Check if a file was uploaded
    if (isset($_FILES['file']) && $_FILES['file']['error'] == UPLOAD_ERR_OK) {
        $fileTmpPath = $_FILES['file']['tmp_name'];
        $fileName = $_FILES['file']['name'];
        $fileSize = $_FILES['file']['size'];
        $fileType = $_FILES['file']['type'];
        $fileNameCmps = explode(".", $fileName);
        $fileExtension = strtolower(end($fileNameCmps));

        // Define allowed file extensions and size limit (5MB)
        $allowedExtensions = ['jpg', 'jpeg', 'png', 'gif', 'pdf'];
        $maxFileSize = 5 * 1024 * 1024; // 5 MB

        if (in_array($fileExtension, $allowedExtensions) && $fileSize <= $maxFileSize) {
            // Directory where file will be saved
            $uploadFileDir = './uploaded_files/';
            $destFilePath = $uploadFileDir . $fileName;

            // Create directory if it doesn't exist
            if (!is_dir($uploadFileDir)) {
                mkdir($uploadFileDir, 0777, true);
            }

            // Move the file to the upload directory
            if (move_uploaded_file($fileTmpPath, $destFilePath)) {
                echo "File is successfully uploaded.";
            } else {
                echo "Error moving the uploaded file.";
            }
        } else {
            echo "Invalid file type or file size too large.";
        }
    } else {
        echo "No file was uploaded or an upload error occurred.";
    }
}
?>
```

**Explanation:**

- `$_FILES['file']`: Contains information about the uploaded file.
- `move_uploaded_file($fileTmpPath, $destFilePath)`: Moves the file from the temporary directory to the desired location.
- **Validation**: Checks file type and size before processing.

---


Certainly! Here are simple PHP programs for each of the listed tasks:

### **a) Sum of Two Numbers**

**Program: `sum.php`**

```php
<!DOCTYPE html>
<html>
<head>
    <title>Sum of Two Numbers</title>
</head>
<body>
    <h1>Sum of Two Numbers</h1>
    <form method="post" action="sum.php">
        <label for="num1">Number 1:</label>
        <input type="number" id="num1" name="num1" required><br><br>
        
        <label for="num2">Number 2:</label>
        <input type="number" id="num2" name="num2" required><br><br>
        
        <input type="submit" value="Calculate Sum">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $num1 = isset($_POST['num1']) ? (float)$_POST['num1'] : 0;
        $num2 = isset($_POST['num2']) ? (float)$_POST['num2'] : 0;
        $sum = $num1 + $num2;
        echo "<h2>Result:</h2>";
        echo "The sum of $num1 and $num2 is: $sum";
    }
    ?>
</body>
</html>
```

---

### **b) Arithmetic Operators**

**Program: `arithmetic_operators.php`**

```php
<!DOCTYPE html>
<html>
<head>
    <title>Arithmetic Operators</title>
</head>
<body>
    <h1>Arithmetic Operators</h1>
    <?php
    $a = 10;
    $b = 5;

    echo "Addition: $a + $b = " . ($a + $b) . "<br>";
    echo "Subtraction: $a - $b = " . ($a - $b) . "<br>";
    echo "Multiplication: $a * $b = " . ($a * $b) . "<br>";
    echo "Division: $a / $b = " . ($a / $b) . "<br>";
    echo "Modulus: $a % $b = " . ($a % $b) . "<br>";
    ?>
</body>
</html>
```

---

### **c) Factorial**

**Program: `factorial.php`**

```php
<!DOCTYPE html>
<html>
<head>
    <title>Factorial</title>
</head>
<body>
    <h1>Factorial</h1>
    <form method="post" action="factorial.php">
        <label for="number">Enter a Number:</label>
        <input type="number" id="number" name="number" min="0" required><br><br>
        
        <input type="submit" value="Calculate Factorial">
    </form>

    <?php
    function factorial($n) {
        if ($n <= 1) {
            return 1;
        } else {
            return $n * factorial($n - 1);
        }
    }

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $number = isset($_POST['number']) ? (int)$_POST['number'] : 0;
        $result = factorial($number);
        echo "<h2>Result:</h2>";
        echo "The factorial of $number is: $result";
    }
    ?>
</body>
</html>
```

---

### **d) Fibonacci Series**

**Program: `fibonacci.php`**

```php
<!DOCTYPE html>
<html>
<head>
    <title>Fibonacci Series</title>
</head>
<body>
    <h1>Fibonacci Series</h1>
    <form method="post" action="fibonacci.php">
        <label for="terms">Enter Number of Terms:</label>
        <input type="number" id="terms" name="terms" min="1" required><br><br>
        
        <input type="submit" value="Generate Series">
    </form>

    <?php
    function fibonacci($n) {
        $series = [];
        $a = 0;
        $b = 1;
        for ($i = 0; $i < $n; $i++) {
            $series[] = $a;
            $c = $a + $b;
            $a = $b;
            $b = $c;
        }
        return $series;
    }

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $terms = isset($_POST['terms']) ? (int)$_POST['terms'] : 0;
        $result = fibonacci($terms);
        echo "<h2>Result:</h2>";
        echo "Fibonacci series of $terms terms: " . implode(", ", $result);
    }
    ?>
</body>
</html>
```

---

### **e) Palindrome Number**

**Program: `palindrome.php`**

```php
<!DOCTYPE html>
<html>
<head>
    <title>Palindrome Number</title>
</head>
<body>
    <h1>Palindrome Number</h1>
    <form method="post" action="palindrome.php">
        <label for="number">Enter a Number:</label>
        <input type="number" id="number" name="number" required><br><br>
        
        <input type="submit" value="Check Palindrome">
    </form>

    <?php
    function isPalindrome($num) {
        $reversed = strrev($num);
        return $num == $reversed;
    }

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $number = isset($_POST['number']) ? (string)$_POST['number'] : '';
        if (isPalindrome($number)) {
            echo "<h2>Result:</h2>";
            echo "$number is a palindrome.";
        } else {
            echo "<h2>Result:</h2>";
            echo "$number is not a palindrome.";
        }
    }
    ?>
</body>
</html>
```

---

