package Controller;

import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

import View.CreateForm;
import View.CreateTransaction;
import View.DashBoard;
import View.Details;
import View.Login;
import Model.Customer;
import Model.ListOfCustomer;
import Model.Transaction;

public class MainController {

    public static void main(String[] args) {

        Login login = new Login();
        login.setVisible(true);

    }

}
