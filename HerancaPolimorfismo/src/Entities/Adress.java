package Entities;

public class Adress{
  protected String country;
  protected String state;
  protected String city;
  protected String street;
  protected String number;
  protected long zip_code;
  protected String complement;

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public long getZip_code() {
    return zip_code;
  }

  public void setZip_code(long zip_code) {
    this.zip_code = zip_code;
  }

  public String getComplement() {
    return complement;
  }

  public void setComplement(String complement) {
    this.complement = complement;
  }

  public String printAdress(){
    return street + ", " + number + "\nComplemento: " + complement + "\nCEP: " + zip_code;
  }
}
