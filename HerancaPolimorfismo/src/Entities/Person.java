package Entities;

import java.util.Calendar;

public class Person {
  private String Name;
  private int Age;
  private Calendar Birth_date;
  private long CPF;
  private Adress Adress;

  public Person(String name, Calendar birth_date, long CPF, Adress adress) {
    this.Name = name;
    this.Birth_date = birth_date;
    this.CPF = CPF;
    this.Adress = adress;
    calculateAge();
  }

  protected void setName(String name) {
    this.Name = name;
  }

  public String getName() {
    return this.Name;
  }

  protected void setAge() {
    this.Age = calculateAge();
  }

  public int getAge() {
    return this.Age;
  }

  protected void setCPF(long CPF) {
    this.CPF = CPF;
  }

  public long getCPF() {
    return this.CPF;
  }

  protected void setAdress(Adress adress) {
    this.Adress = adress;
  }

  public int calculateAge() {
    int lapset;
    Calendar today = Calendar.getInstance();
    lapset = today.get(Calendar.YEAR) - Birth_date.get(Calendar.YEAR);
    if ((Birth_date.get(Calendar.MONTH) > today.get(Calendar.MONTH))
        || (Birth_date.get(Calendar.MONTH) == today.get(Calendar.MONTH) && Birth_date.get(Calendar.DATE) > today.get(Calendar.DATE)))
      lapset--;
    return lapset;
  }

}
