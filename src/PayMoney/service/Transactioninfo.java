package PayMoney.service;

import java.util.Scanner;
import PayMoney.model.payMoneytarget;

public class Transactioninfo {

        //Declaring the variables
        Scanner sc = new Scanner(System.in);
        private int size, tgt; int [] array;

        //Input method to get all the transaction from the user
        public void input()
        {
            System.out.println("Enter the size of transaction array");
            size = sc.nextInt();
            array = new int[size];
            System.out.println("Enter the values of array.");
            //Get the input elements and insert them into an array
            insertValues();
            System.out.println("Enter the total no of targets that need to be achieved");
            //Check for the target inside the input array
            tgt = sc.nextInt();
            entrTgts(tgt);
        }
        // method to insert the input array elements entered by the user
        public void insertValues() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at position " + i + ": ");
            array[i] = sc.nextInt(); }
    }
        //Method to get the target value and check for the targets from the entered array
        public void entrTgts(int tgt) {
        for (int i = 0; i < tgt; i++) {
            System.out.print("Enter the value of target: ");
            int tmp = sc.nextInt();
            payMoneytarget tgt_chk=new payMoneytarget();
            int result=tgt_chk.targetcheck(tmp, array);
            //Print the target result
            if(result==-1)
            {
                System.out.println("Given Target cannot be achieved");
            }
            else
            {
                System.out.println("Target achieved after " + result + " transactions" );
            }
            }
    }
}