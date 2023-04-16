
package Controller;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Model.Customer;
import Model.ListOfCustomer;
import View.*;

public class CustomerController {
    public CustomerController() {
    }

    public void Update(int CusID, Customer cus) {
        ListOfCustomer list = new ListOfCustomer();
        ReadFile(list);

        for (int i = 0; i < list.getLength(); i++) {
            if (list.getListCusi(i).getCusID() == CusID) {
                list.setListCusi(cus, i);
            }
        }
        System.out.println(list.getListCustomer().toString());
        try {
            WriteFile(list);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void Delete(int cusID) {
        ListOfCustomer list = new ListOfCustomer();
        ReadFile(list);

        ArrayList<Customer> temp = new ArrayList<>();
        for (int i = 0; i < list.getLength(); i++) {
            if (list.getListCusi(i).getCusID() != cusID) {
                temp.add(list.getListCusi(i));
            }
        }
        list.setListCustomer(temp);
        try {
            WriteFile(list);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void Display(ListOfCustomer list) throws IOException {
        CheckFileExist();
        try {
            ReadFile(list);

        } catch (Exception e) {
        }

        String header[] = { "Name", "Age", "Gender", "Account Number", "Account Balance" };

        DefaultTableModel CustomerTable = new DefaultTableModel(header, 0);
        JTable tableCus = new JTable(CustomerTable);

    }

    public void CheckFileExist() {
        File temp = new File("Customer.txt");
        if (temp.exists()) {
            System.out.println("Customer.txt Exist");
        } else {
            File file = new File("Customer.txt");
            try {
                Boolean exist = file.createNewFile();

            } catch (IOException e) {

            } catch (Exception e) {
            }
            System.out.println("Customer.txt Created");
        }
    }

    public void AddNewCustomer(ListOfCustomer list) throws Exception {
        // Enter information

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNum = sc.nextLine();
        System.out.println("Account Number: ");
        String accountNum = sc.nextLine();
        System.out.println("Enter Balance:  ");
        double accountBalance = Double.parseDouble(sc.nextLine());
        System.out.println("Enter gender(Male/Female): ");
        String genderString = sc.nextLine();
        System.out.println("Enter year born: ");
        int yearBorn = sc.nextInt();
        boolean gender;
        if (genderString.equals("male")) {
            gender = true;
        } else

        {
            gender = false;
        }

        System.out.println("Enter Password:");
        String password = sc.nextLine();
        // Check file exist
        CheckFileExist();
        // Create Object
        Customer c = new Customer(name, phoneNum, accountNum, accountBalance, gender,
                password, yearBorn, list);

        // UpdateList
        try {
            ReadFile(list);

        } catch (Exception e) {

        }
        // addObject Into ListOfCustomer
        list.getListCustomer().add(c);
        // addList Into File
        WriteFile(list);

    }

    // Add/Update Customer
    public void WriteFile(ListOfCustomer list) throws Exception {

        // Write Object into File
        FileOutputStream fo = new FileOutputStream("Customer.txt");
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        for (int i = 0; i < list.getLength(); i++) {
            oo.writeObject(list.getListCusi(i));
        }
        oo.close();

    }

    public void ReadFile(ListOfCustomer list) {
        // Check file empty or not(Avoid EOFEException)
        list.getListCustomer().clear();
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;
        try {
            fileIn = new FileInputStream("Customer.txt");
            objectIn = new ObjectInputStream(fileIn);
            while (true) {
                Customer obj = (Customer) objectIn.readObject();
                list.getListCustomer().add(obj);
            }
        } catch (ClassNotFoundException | IOException e) {

        } finally {
            if (objectIn != null) {
                try {
                    objectIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileIn != null) {
                try {
                    fileIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void FindCustomer(ListOfCustomer list) throws IOException {
        Scanner sc = new Scanner(System.in);
        ReadFile(list);

        String option = " ";
        String search;
        do {
            System.out.println("1: Find by name");
            System.out.println("2: Find by phoneNum");
            System.out.println("3: Find by accountNum");
            System.out.println("Enter Your Option: ");
            option = sc.nextLine();

            search = sc.nextLine();
            switch (option) {
                case "1":
                    for (Customer c : list.getListCustomer()) {
                        if (c.getName().contains(search)) {
                            System.out.println(c);
                        }
                    }
                    break;
                case "2":
                    for (Customer c : list.getListCustomer()) {
                        if (c.getPhoneNum().contains(search)) {
                            System.out.println(c);
                        }
                    }
                    break;
                case "3":
                    for (Customer c : list.getListCustomer()) {
                        if (c.getAccountNum().contains(search)) {
                            System.out.println(c);
                        }
                    }
                    break;
                default:
                    System.out.println("No Result");
                    break;
            }
        } while (!option.equals(""));
    }

}
