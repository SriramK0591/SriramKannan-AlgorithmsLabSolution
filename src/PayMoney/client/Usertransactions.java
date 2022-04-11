package PayMoney.client;

import PayMoney.service.Transactioninfo;

import java.util.Scanner;

public class Usertransactions {
    public static void main(String[] args)
        {
            //Calling the Transaction class for the users to provide transaction and target information
            Transactioninfo trans = new Transactioninfo();
            trans.input();
        }
    }
