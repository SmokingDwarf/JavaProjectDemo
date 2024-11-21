package week1.les1.opdracht3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sylvester", 987654321);
        System.out.println("naam: " + student1.getNaam() );
        System.out.println("nummer: " + student1.getStudentNummer() );
        student1.setStudentNummer(12345678);
        System.out.println("toString: " + student1.toString());
        System.out.println();

        Student student2 = new Student("Karel", 98765432);
        System.out.println("naam: " + student2.getNaam());
        System.out.println("nummer: " + student2.getStudentNummer());
        System.out.println("toString: " + student2.toString());
    }
}