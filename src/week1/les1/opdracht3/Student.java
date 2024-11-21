package week1.les1.opdracht3;

public class Student {
    private String naam;
    private Integer studentNummer;

    public Student(String nm, Integer stNr) {
        naam = nm;
        studentNummer = stNr;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        String s = "Deze student heet " + naam;
        return s;
    }

    public Integer getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(Integer stnr) {
        studentNummer = stnr;
    };
}
