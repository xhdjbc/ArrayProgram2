/**
 *
 * Name: Zichao Liu
 * Teacher: Mr.Hardman
 * Assignment 5, Program 2
 * Date Last Modified: 11/30/2016
 *
 */

import java.util.Scanner;



/**
 * 
 */

/**
 * @author z.liu
 *
 */
public class ArrayP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				   
		int[] array = new int[10];
		int value;
		int index = 0;

		Scanner userInput = new Scanner(System.in);

		for( int i = 1; i < array.length; i++ ){

		   System.out.print( "Enter a number as an integer:  " );   
		   array[i] = userInput.nextInt();
		}
		     
		System.out.println("What element you want searching?");
		value = userInput.nextInt( );
		for( int i = 1; i < array.length; i++ ) {
		    if(array[i] == value){
		    	index ++;
		    }
		}
		System.out.println("The value " + value +" founds:" + index +" times.");
		      
		userInput.close();
	} 
}


