package org.example;

import org.example.models.Elector;
import org.example.models.Voter;
import org.example.models.VotesCounter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VotesCounter counter = new VotesCounter();
        Elector elector1 = new Elector(1, "abc");
        Elector elector2 = new Elector(2, "pqr");
        Elector elector3 = new Elector(3, "xyz");
        Elector elector4 = new Elector(4, "wxyz");


        Voter voter1 = new Voter(1, "123", counter);
        Voter voter2 = new Voter(2, "1232", counter);
        Voter voter3 = new Voter(3, "23", counter);
        Voter voter4 = new Voter(4, "3", counter);
        Voter voter5 = new Voter(5, "12dfds3", counter);

        voter1.addVote(elector1);
        voter1.addVote(elector2);
        voter2.addVote(elector2);
        voter3.addVote(elector2);
        voter4.addVote(elector3);
        voter5.addVote(elector1);
        System.out.println( "Hello World!" );
        counter.printResults();


    }
}
