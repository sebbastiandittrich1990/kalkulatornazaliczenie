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
	       System.out.println("Podaj pierwsz� liczb�:"); 
	       pierwsza_l = wej.nextInt();
	       System.out.println("Podaj drug� liczb�:");
	       druga_l = wej.nextInt();
	 
	       System.out.println("Dodawanie dw�ch liczb - wci�nij +");
	       System.out.println("Odejmowanie dw�ch liczb - wci�nij -");
	       System.out.println("Mno�enie dw�ch liczb - wci�nij *");
	       System.out.println("Dzielenie dw�ch liczb - wci�nij /");
	       System.out.println("Operacaja modulo - wci�nij %");
	 
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
