package com.hib.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    private int UserID;

    @Column(name = "UserEmail")
    private String UserEmail;

    @Column(name = "UserPassword")
    private String UserPassword;

    @Column(name = "UserFirstName")
    private String UserFirstName;

    @Column(name = "UserLastName")
    private String UserLastName;

    @Column(name = "UserCity")
    private String UserCity;

    @Column(name = "UserState")
    private String UserState;

    @Column(name = "UserZip")
    private String UserZip;

    @Column(name = "UserEmailVerified")
    private int UserEmailVerified;

    @Column(name = "UserRegistrationDate")
    private Timestamp UserRegistrationDate;

    @Column(name = "UserVerificationCode")
    private String UserVerificationCode;

    @Column(name = "UserIP")
    private String UserIP;

    @Column(name = "UserPhone")
    private String UserPhone;

    @Column(name = "UserFax")
    private String UserFax;

    @Column(name = "UserCountry")
    private String UserCountry;

    @Column(name = "UserAddress")
    private String UserAddress;

    @Column(name = "UserAddress2")
    private String UserAddress2;

    public User() {
        
    }

    public User(int userID, String userEmail, String userPassword, String userFirstName,
                String userLastName, String userCity, String userState, String userZip,
                int userEmailVerified, Timestamp userRegistrationDate, String userVerificationCode,
                String userIP, String userPhone, String userFax, String userCountry, String userAddress,
                String userAddress2) {
        UserID = userID;
        UserEmail = userEmail;
        UserPassword = userPassword;
        UserFirstName = userFirstName;
        UserLastName = userLastName;
        UserCity = userCity;
        UserState = userState;
        UserZip = userZip;
        UserEmailVerified = userEmailVerified;
        UserRegistrationDate = userRegistrationDate;
        UserVerificationCode = userVerificationCode;
        UserIP = userIP;
        UserPhone = userPhone;
        UserFax = userFax;
        UserCountry = userCountry;
        UserAddress = userAddress;
        UserAddress2 = userAddress2;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserFirstName() {
        return UserFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        UserFirstName = userFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String userLastName) {
        UserLastName = userLastName;
    }

    public String getUserCity() {
        return UserCity;
    }

    public void setUserCity(String userCity) {
        UserCity = userCity;
    }

    public String getUserState() {
        return UserState;
    }

    public void setUserState(String userState) {
        UserState = userState;
    }

    public String getUserZip() {
        return UserZip;
    }

    public void setUserZip(String userZip) {
        UserZip = userZip;
    }

    public int getUserEmailVerified() {
        return UserEmailVerified;
    }

    public void setUserEmailVerified(int userEmailVerified) {
        UserEmailVerified = userEmailVerified;
    }

    public Timestamp getUserRegistrationDate() {
        return UserRegistrationDate;
    }

    public void setUserRegistrationDate(Timestamp userRegistrationDate) {
        UserRegistrationDate = userRegistrationDate;
    }

    public String getUserVerificationCode() {
        return UserVerificationCode;
    }

    public void setUserVerificationCode(String userVerificationCode) {
        UserVerificationCode = userVerificationCode;
    }

    public String getUserIP() {
        return UserIP;
    }

    public void setUserIP(String userIP) {
        UserIP = userIP;
    }

    public String getUserPhone() {
        return UserPhone;
    }

    public void setUserPhone(String userPhone) {
        UserPhone = userPhone;
    }

    public String getUserFax() {
        return UserFax;
    }

    public void setUserFax(String userFax) {
        UserFax = userFax;
    }

    public String getUserCountry() {
        return UserCountry;
    }

    public void setUserCountry(String userCountry) {
        UserCountry = userCountry;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String userAddress) {
        UserAddress = userAddress;
    }

    public String getUserAddress2() {
        return UserAddress2;
    }

    public void setUserAddress2(String userAddress2) {
        UserAddress2 = userAddress2;
    }


}
