package Entities;

public class Adress {
  protected String Country;
  protected String State;
  protected String City;
  protected String Street;
  protected String Number;
  protected long Zip_code;
  protected String Complement;


    public Adress(String country, String state, String city, String street, String number, long zip_code) {
    this.Country = country;
    this.State = state;
    this.City = city;
    this.Street = street;
    this.Number = number;
    this.Zip_code = zip_code;
  }

  public String getCountry() {
    return this.Country;
  }

  public void setCountry(String country) {
    this.Country = country;
  }

  public String getState() {
    return this.State;
  }

  public void setState(String state) {
    this.State = state;
  }

  public String getCity() {
    return this.City;
  }

  public void setCity(String city) {
    this.City = city;
  }

  public String getStreet() {
    return this.Street;
  }

  public void setStreet(String street) {
    this.Street = street;
  }

  public String getNumber() {
    return this.Number;
  }

  public void setNumber(String number) {
    this.Number = number;
  }

  public long getZip_code() {
    return this.Zip_code;
  }

  public void setZip_code(long zip_code) {
    this.Zip_code = zip_code;
  }

  public String getComplement() {
    return this.Complement;
  }

  public void setComplement(String complement) {
    this.Complement = complement;
  }
}
