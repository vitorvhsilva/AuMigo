package br.com.aumigo.users.application.core.domain;

import java.time.LocalDate;

public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private String description;
    private String username;
    private String email;
    private String password;
    private LocalDate birthDate;
    private LocalDate accountCreationDate;
    private Address address;
    private Gender gender;

    public User() {
    }

    public User(String userId, String firstName, String lastName, String description, String username, String email, String password, LocalDate birthDate, LocalDate accountCreationDate, Address address, Gender gender) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
        this.accountCreationDate = accountCreationDate;
        this.address = address;
        this.gender = gender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", description='" + description + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthDate=" + birthDate +
                ", accountCreationDate=" + accountCreationDate +
                ", address=" + address +
                ", gender=" + gender +
                '}';
    }
}
