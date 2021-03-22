package sample.templates.clients;

import java.io.IOException;
import java.util.Calendar;



public class Person {


    private String name;
    private String familyName;
    private String fatherName;
    private int nationalCode;
    private boolean gender; //if it's male it's true.
    private Calendar dateOfBirth;
    private String mahaleSodoorShenasname;
    private String address;
    private int mobileNumber;
    private int homeNumber;
    private int emergencyNumber;
    private int postCode;
    private Image personalyPhoto;
    private Image copyShenasname;
    private Image copyNationalCart;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMahaleSodoorShenasname() {
        return mahaleSodoorShenasname;
    }

    public void setMahaleSodoorShenasname(String mahaleSodoorShenasname) {
        this.mahaleSodoorShenasname = mahaleSodoorShenasname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public int getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(int emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getPersonalyPhoto() {
        return copyNationalCart.getoPath();
    }

    public void setPersonalyPhoto(String iPath, int width, int height, String oPath) throws IOException {
        Image copyNationalCart = new Image(iPath, width, height, oPath);
        copyNationalCart.rw();
    }

    public String getCopyShenasname() {
        return copyNationalCart.getoPath();
    }

    public void setCopyShenasname(String iPath, int width, int height, String oPath) throws IOException {
        Image copyNationalCart = new Image(iPath, width, height, oPath);
        copyNationalCart.rw();
    }

    public String getCopyNationalCart() {
        return copyNationalCart.getoPath();
    }

    public void setCopyNationalCart(String iPath, int width, int height, String oPath) throws IOException {
        Image copyNationalCart = new Image(iPath, width, height, oPath);
        copyNationalCart.rw();
    }
}
