package Model;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

public class Transaction implements Serializable {
    private LocalDate date;
    private String typeOfTransaction;
    private String fromPhoneNum;
    private String toPhoneNum;
    private double value;
    private double afterBalance;

    public Transaction(String type, String from, String to, double value, double afterBalance) {
        this.date = LocalDate.now();
        this.typeOfTransaction = type;
        this.fromPhoneNum = from;
        this.toPhoneNum = to;
        this.value = value;
        this.afterBalance = afterBalance;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(String typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    public String getFromPhoneNum() {
        return fromPhoneNum;
    }

    public void setFromPhoneNum(String fromPhoneNum) {
        this.fromPhoneNum = fromPhoneNum;
    }

    public String getToPhoneNum() {
        return toPhoneNum;
    }

    public void setToPhoneNum(String toPhoneNum) {
        this.toPhoneNum = toPhoneNum;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getAfterBalance() {
        return afterBalance;
    }

    public void setAfterBalance(double afterBalance) {
        this.afterBalance = afterBalance;
    }

    @Override
    public String toString() {
        return "Transaction [date=" + date + ", typeOfTransaction=" + typeOfTransaction + ", fromPhoneNum="
                + fromPhoneNum + ", toPhoneNum=" + toPhoneNum + ", value=" + value + ", afterBalance=" + afterBalance
                + "]";
    }

}
