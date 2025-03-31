package br.com.aumigo.users.application.core.domain;

public class Address {
    private String zipCode;
    private String city;
    private String state;
    private String neighborhood;

    public Address(String zipCode, String city, String state, String neighborhood) {
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.neighborhood = neighborhood;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                '}';
    }
}
