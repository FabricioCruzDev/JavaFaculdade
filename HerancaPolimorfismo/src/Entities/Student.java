package Entities;

import java.util.Calendar;

public class Student extends Person {
  private String Enrolment;

  public Student(String name, Calendar birth_date, long CPF, Adress adress) {
    super(name, birth_date, CPF, adress);
  }
}
