package sample.templates.clients;

import java.util.ArrayList;


public class Customers extends Person{

    private String workPlace;
    private ArrayList<Integer> accounts = new ArrayList<Integer>();


    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workplace) {
        this.workPlace = workplace;
    }

    public ArrayList<Integer> getAccounts() {
        return accounts;
    }

    public void setAccounts(int accountNumber) {
        accounts.add(accountNumber);
    }
}
