package kalk;

import java.util.Scanner;

import javax.swing.JFrame;

public class Main {

	  public static void main(String[] args) 
	    {
		 
	       int pierwsza_l; 
	       int druga_l;
	       char znak;      
	       Scanner wej = new Scanner(System.in);   
	       System.out.println("Podaj pierwsz¹ liczbê:"); 
	       pierwsza_l = wej.nextInt();
	       System.out.println("Podaj drug¹ liczbê:");
	       druga_l = wej.nextInt();
	 
	       System.out.println("Dodawanie dwóch liczb - wciœnij +");
	       System.out.println("Odejmowanie dwóch liczb - wciœnij -");
	       System.out.println("Mno¿enie dwóch liczb - wciœnij *");
	       System.out.println("Dzielenie dwóch liczb - wciœnij /");
	       System.out.println("Operacaja modulo - wciœnij %");
	 
	       znak = wej.next().charAt(0);  
	       switch(znak)     
	       {
	           case '+':    
	           {
	               System.out.println(pierwsza_l + druga_l);
	               break;
	           }
	           case '-':    
	           {
	               System.out.println(pierwsza_l - druga_l);
	               break;
	           }
	           case '*':    
	           {
	               System.out.println(pierwsza_l * druga_l);
	               break;
	           }
	           case '/':   
	           {           
	               if(druga_l !=0)
	               {
	                 System.out.println(pierwsza_l / druga_l + "oraz reszty: " +
	                         pierwsza_l % druga_l);
	               }
	               else
	               {
	                   System.out.println("Nie dzielimy przez zero!!!");
	               }
	               break;
	           }
	           case '%':  
	           {
	               if(druga_l !=0)  
	               {
	                   System.out.println(pierwsza_l % druga_l);
	               }
	               else
	               {
	                   System.out.println("Nie dzielimy przez zero!!");
	               }
	           }
	 
	       }
	 
	    }
	}
