package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

public class ListOfCustomer implements Serializable {
    private ArrayList<Customer> ListCustomer;

    public ListOfCustomer() {
        ListCustomer = new ArrayList<Customer>();
    }

    // GetsetList
    public ArrayList<Customer> getListCustomer() {
        return ListCustomer;
    }

    public void setListCustomer(ArrayList<Customer> listCustomer) {
        ListCustomer = listCustomer;
    }

    public void addElement(Customer c) {
        ListCustomer.add(c);
    }

    // Get Set List[i]
    public void setListCusi(Customer cus, int i) {
        getListCustomer().get(i).setName(cus.getName());
        getListCustomer().get(i).setPhoneNum(cus.getPhoneNum());
        getListCustomer().get(i).setAccountNum(cus.getAccountNum());
        getListCustomer().get(i).setAccountBalance(cus.getAccountBalance());
        getListCustomer().get(i).setGender(cus.getGender());
        getListCustomer().get(i).setPassword(cus.getPassword());
        getListCustomer().get(i).setYearBorn(cus.getYearBorn());

    }

    public Customer getListCusi(int i) {
        return ListCustomer.get(i);
    }

    public int getLength() {
        return ListCustomer.size();
    }

    public void Display() {
        System.out.println(ListCustomer);
    }

}
