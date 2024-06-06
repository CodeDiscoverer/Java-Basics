package InterfacePKG;
import InterfacePKG.Data;
public class StudentDataMain {
    public static void main(String[] args) {

        Data d = new Data();

        d.getOfficialData();
        d.getPersonalData();
        d.displayData();
    }
}
