package Entities;

import java.util.Calendar;

public class Person {
  private String name;
  private int age;
  private Calendar birth_date;
  private long CPF;
  private Adress adress;

  public Person(String name, Calendar birth_date, long CPF, Adress adress) {
    this.name = name;
    this.birth_date = birth_date;
    this.CPF = CPF;
    this.adress = adress;
    this.age = calculateAge();
  }

  protected void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  protected void setAge() {
    this.age = calculateAge();
  }

  public int getAge() {
    return age;
  }

  protected void setCPF(long CPF) {
    this.CPF = CPF;
  }

  public long getCPF() {
    return CPF;
  }

  public Adress getAdress(){
    return adress;
  }

  protected void setAdress(Adress adress) {
    this.adress = adress;
  }

  public int calculateAge() {
    int lapset;
    Calendar today = Calendar.getInstance();
    lapset = today.get(Calendar.YEAR) - birth_date.get(Calendar.YEAR);
    if ((birth_date.get(Calendar.MONTH) > today.get(Calendar.MONTH))
        || (birth_date.get(Calendar.MONTH) == today.get(Calendar.MONTH) && birth_date.get(Calendar.DATE) > today.get(Calendar.DATE)))
      lapset--;
    return lapset;
  }

  public String print(){
    return name + "\nIdade:  " + age + "\nCPF: " + CPF + "\nAdress: \n" + adress.printAdress();
  }

}
