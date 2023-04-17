package Controller;

import java.util.List;

import javax.swing.JOptionPane;

import Model.ListOfCustomer;
import Model.Transaction;
import View.CreateTransaction;

public class TransactionController {
    public TransactionController() {

    }

    public void CheckAllField(String type, String from, String to, Double value) {
        //
        System.out.println(type + " " + from + " " + to + " " + value);
        if (type.equals("Send")) {
            // Check is there any empty fields
            if (CheckEmptySend(value, to, from) && (checkExistSend(from, to)) && (CheckSendBalance(from, value))
                    && (checkEqualSend(from, to))) {
                Transaction tran = new Transaction(type, from, to, value, 0);
                if (SendMoney(tran)) {
                    JOptionPane.showMessageDialog(null, "Successful");
                }
            }

        }
        // type="Receive From Bank"
        else {

            if (CheckEmptyReceive(value, to) && (CheckFromEmpty(from)) && (checkExistReceive(to))) {
                Transaction tran = new Transaction(type, from, to, value, 0);

                if (ReceiveFromBank(tran)) {
                    JOptionPane.showMessageDialog(null, "Successful");

                }

            }
        }
    }

    // Check number send and receive equal or not
    public boolean checkEqualSend(String from, String to) {
        if (from.equals(to)) {
            JOptionPane.showMessageDialog(null, "Account Send and Account Receive Must be Different!");
            return false;
        } else {
            return true;
        }
    }

    // Check is there any empty field
    public boolean CheckEmptySend(Double value, String to, String from) {
        if ((value == 0) || (to.trim().equals("")) || (from.equals(""))) {
            JOptionPane.showMessageDialog(null, "Some Fields empty! and value >0");

            return false;
        } else {
            return true;
        }
    }

    public boolean CheckEmptyReceive(Double value, String to) {
        if ((value == 0) || (to.equals(""))) {
            JOptionPane.showMessageDialog(null, "Some Fields empty!(Value=0 or To PhoneNum = 0)");

            return false;
        } else {

            return true;
        }
    }

    public boolean CheckFromEmpty(String from) {
        if (!from.equals("")) {
            JOptionPane.showMessageDialog(null, "Send by Bank-> FromField must be empty");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkExistSend(String from, String to) {
        ListOfCustomer list = new ListOfCustomer();
        CustomerController controller = new CustomerController();
        controller.ReadFile(list);
        boolean num1 = false;
        boolean num2 = false;
        for (int i = 0; i < list.getLength(); i++) {
            if (list.getListCusi(i).getPhoneNum().equals(from)) {
                num1 = true;
            }
        }
        ;
        for (int i = 0; i < list.getLength(); i++) {
            if (list.getListCusi(i).getPhoneNum().equals(to)) {
                num2 = true;
            }
        }
        ;
        if (num1 && num2) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Send Account or Receive Account not exists");
            return false;
        }
    }

    public boolean checkExistReceive(String to) {
        ListOfCustomer list = new ListOfCustomer();
        CustomerController controller = new CustomerController();
        controller.ReadFile(list);
        boolean check = false;
        for (int i = 0; i < list.getLength(); i++) {
            if (list.getListCusi(i).getPhoneNum().equals(to)) {
                check = true;

            }

        }
        if (check == true) {
            return check;

        } else {
            JOptionPane.showMessageDialog(null, "Can not find Receive Account");
            return check;
        }

    }

    public boolean CheckSendBalance(String fromNum, double value) {
        ListOfCustomer list = new ListOfCustomer();
        CustomerController controller = new CustomerController();
        controller.ReadFile(list);
        for (int i = 0; i < list.getLength(); i++) {
            if (fromNum.equals(list.getListCusi(i).getPhoneNum())) {
                if (list.getListCusi(i).getAccountBalance() >= value) {
                    return true;

                }

            }
        }
        JOptionPane.showMessageDialog(null, "Account Do not have enough money");

        return false;
    }

    public boolean SendMoney(Transaction tran) {// from to/ value
        ListOfCustomer list = new ListOfCustomer();
        CustomerController controller = new CustomerController();
        controller.ReadFile(list);

        boolean send = false;
        boolean receive = false;
        for (int i = 0; i < list.getLength(); i++) {
            if (tran.getFromPhoneNum().equals(list.getListCusi(i).getPhoneNum())) {
                Transaction SendTran = new Transaction("Send", tran.getFromPhoneNum(), tran.getToPhoneNum(),
                        tran.getValue(), list.getListCusi(i).getAccountBalance() - tran.getValue());
                list.getListCusi(i).setAccountBalance(list.getListCusi(i).getAccountBalance() - tran.getValue());
                list.getListCusi(i).getListTransaction().add(SendTran);

                send = true;
            }

            if (tran.getToPhoneNum().equals(list.getListCusi(i).getPhoneNum())) {
                Transaction ReceiveTran = new Transaction("Receive", tran.getFromPhoneNum(), tran.getToPhoneNum(),
                        tran.getValue(), list.getListCusi(i).getAccountBalance() + tran.getValue());
                list.getListCusi(i).setAccountBalance(list.getListCusi(i).getAccountBalance() + tran.getValue());
                list.getListCusi(i).getListTransaction().add(ReceiveTran);

                receive = true;
            }
        }
        if (send && receive) {

            controller.WriteFile(list);

            return true;

        } else {
            return false;
        }
    }

    public boolean ReceiveFromBank(Transaction tran) {
        ListOfCustomer list = new ListOfCustomer();
        CustomerController controller = new CustomerController();
        controller.ReadFile(list);
        for (int i = 0; i < list.getLength(); i++) {
            if (tran.getToPhoneNum().equals(list.getListCusi(i).getPhoneNum())) {
                Transaction ReceiveTran = new Transaction("Receive From Bank", tran.getFromPhoneNum(),
                        tran.getToPhoneNum(),
                        tran.getValue(), list.getListCusi(i).getAccountBalance() + tran.getValue());
                list.getListCusi(i).setAccountBalance(list.getListCusi(i).getAccountBalance() + tran.getValue());
                list.getListCusi(i).getListTransaction().add(ReceiveTran);

                controller.WriteFile(list);

                return true;
            }
        }
        return false;

    }

}
