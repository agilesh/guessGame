/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Player
{
    int number;
    
    void guess()
    {
        number = (int)(Math.Random()*10);
        System.out.println("I guessed"+number);
    }
}


public class Guess
{
    player p1;
    player p2;
    player p3;
    
    
    public void startGame()
    {
    p1=new player();
    p2=new player();
    p3=new player();
    
    int guessp1=0;
    int guessp2=0;
    int guessp3=0;
    
    boolean x=false;
    boolean y=false;
    boolean z=false;
    
    int target = (int)(Math.random()*10);
    System.out.println("I am guessing"+target);
    
    while(true)
    {
        p1.guess();
        p2.guess();
        p3.guess();
        guessp1=p1.number;
        guessp2=p2.number;
        guessp3=p3.number;
        
        System.out.print("Player 1 guessing"+guessp1);
        System.out.println("Player 2 guessing"+guessp2);
        System.out.println("Player 3 guessing "+guessp3);
        
        
        
        if(guessp1==target)
        {
            x=true;
        }
        if(guessp2==target)
        {
            y=true;
        }
        if(guessp3==target)
        {
            z=true;
        }
        if(x||y||z)
        {
          System.out.println("Atleast Any one has correctly guessed");
          System.out.println("Player 1 guessed"+guessp1);
          System.out.println("Player 2 guessed"+guessp2);
          System.out.println("Player 3 Guess"+guessp3);
          System.out.println("Game over");
        }
    }
    }
}


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Guess g = new Guess();
		g.start();
	}
}
