import java.util.Calendar;

import Entities.Adress;
import Entities.Student;

public class App {

    private static Student student;
    private static Adress adress = new Adress();
    public static void main(String[] args) throws Exception {
        Calendar date = Calendar.getInstance();
        date.set(1980, 10, 23);
        adress.setCountry("Brasil");
        adress.setState("RJ");
        adress.setCity("Rio de Janeiro");
        adress.setStreet("Avenida Rio Branco");
        adress.setNumber("156A");
        adress.setZip_code(20040901);
        adress.setComplement("Bloco 03 - Ap 20.005");
        student = new Student("Marco Antônio", date, 901564098, adress);

        System.out.println(student.getAge());
        System.out.println(student.print());
     }
}
