package Controller;

import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

import View.CreateForm;
import View.DashBoard;
import View.Details;

import Model.Customer;
import Model.ListOfCustomer;

public class MainController {

    public static void main(String[] args) {

        // 1
        // CustomerController controller = new CustomerController();
        // ListOfCustomer list = new ListOfCustomer();
        // controller.CheckFileExist();
        // CreateForm cf = new CreateForm(list);
        // cf.setVisible(true);
        // 2
        CustomerController controller = new CustomerController();
        ListOfCustomer list = new ListOfCustomer();
        controller.CheckFileExist();
        controller.ReadFile(list);

        // Details hv = new Details(list);
        // hv.setVisible(true);
        DashBoard DB = new DashBoard(list);
        DB.setVisible(true);
        // DashBoard db = new DashBoard(null);
        // db.setVisible(true);

    }

}
