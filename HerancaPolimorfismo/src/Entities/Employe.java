package Entities;

import java.util.Calendar;

public class Employe extends Person {
  protected String Enrolment;
  private Calendar Data_admissao, Data_demissao;

  public Employe(String name, Calendar birth_date, long CPF, Adress adress) {
    super(name, birth_date, CPF, adress);
    this.Enrolment = createEnrolment();
    Data_admissao = Calendar.getInstance();
  }

  public void dismissEmploye() {
    Data_demissao = Calendar.getInstance();
  }

  protected String createEnrolment() {
    return this.Enrolment = "Enrolment not defined.";
  }

  protected String getEnrolment() {
    return this.Enrolment;
  }
  
}
