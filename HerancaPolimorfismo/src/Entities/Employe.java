package Entities;

import java.util.Calendar;

public class Employe extends Person {
  protected String enrolment;
  private Calendar data_admissao, data_demissao;

  public Employe(String name, Calendar birth_date, long CPF, Adress adress) {
    super(name, birth_date, CPF, adress);
    this.enrolment = createEnrolment();
    this.data_admissao = Calendar.getInstance();
  }

  public void dismissEmploye() {
    this.data_demissao = Calendar.getInstance();
  }

  protected String createEnrolment() {
    return enrolment = "Enrolment not defined.";
  }  
}
