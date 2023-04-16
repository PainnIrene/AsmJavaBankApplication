package Model;

import java.io.Serializable;

public class Customer implements Serializable {
    private int cusID;
    private String name;
    private String phoneNum;
    private String accountNum;
    private double accountBalance;
    private boolean gender;
    private int yearBorn;
    private String password;

    // init Customer with automactic gene CusID
    public Customer(String name, String phoneNum, String accountNum, double accountBalance, boolean gender,
            String password, int yearBorn, ListOfCustomer list) {
        // set cusID auto gene
        if (list.getLength() == 0) {
            this.cusID = 1;
        } else {
            this.cusID = list.getListCusi(list.getLength() - 1).getCusID() + 1;

        }
        this.name = name;
        this.phoneNum = phoneNum;
        this.accountNum = accountNum;
        this.accountBalance = accountBalance;
        this.gender = gender;
        this.password = password;
        this.yearBorn = yearBorn;

    }

    public boolean getGender() {
        return gender;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String isGender() {
        if (gender == true) {
            return "Male";
        } else {
            return "Female";
        }

    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    @Override
    public String toString() {
        return "Customer [cusID=" + cusID + ", name=" + name + ", phoneNum=" + phoneNum + ", accountNum=" + accountNum
                + ", accountBalance=" + accountBalance + ", gender=" + gender + ", yearBorn=" + yearBorn + ", password="
                + password + "]";
    }

}
