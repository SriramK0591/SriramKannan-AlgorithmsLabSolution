package TravelerDenomination.service;
import PayMoney.model.payMoneytarget;
import TravelerDenomination.model.Minnotes;
import TravelerDenomination.model.sorting;

import java.util.Scanner;

public class Travelerinfo {
    //Declaring the variables
    Scanner sc = new Scanner(System.in);
    private int size, amt; int [] array;

    //Input method to get all the transaction from the user
    public void input()
    {
        System.out.println("Enter the size of currency denominations");
        size = sc.nextInt();
        array = new int[size];
        System.out.println("Enter the currency denominations value");
        //Get the input elements and insert them into an array
        insertValues();
        System.out.println("Enter the amount you want to pay");
        //Check for the target inside the input array
        amt = sc.nextInt();
        //Sort the array in the descending order
        //Since the array size is smaller, we use bubblesort for the sorting
        sorting srt=new sorting();
        srt.bubblesort(array);
        //Check for the denominations for the input
        Minnotes res=new Minnotes();
        res.minnotes(array,amt);
    }
    // method to insert the input array elements entered by the user
    public void insertValues() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at position " + i + ": ");
            array[i] = sc.nextInt(); }
    }
}
