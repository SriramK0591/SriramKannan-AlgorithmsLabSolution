package TravelerDenomination.client;
import java.util.Scanner;
import TravelerDenomination.service.Travelerinfo;

public class Traveler_transaction {
        public static void main(String[] args)
        {
            //Calling the Transaction class for the users to provide transaction and target information
            Travelerinfo trans = new Travelerinfo();
            trans.input();
        }
    }
