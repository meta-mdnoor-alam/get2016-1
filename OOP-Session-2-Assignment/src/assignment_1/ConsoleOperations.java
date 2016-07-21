/**
 * 
 */
package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author vaibhav
 *
 */
public class ConsoleOperations {
	
	private BufferedReader bufferedReader;
	
	public ConsoleOperations(){
		
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public int getPositiveInteger(String message){
		
		int inputNumber = 0;
		
		try{
			
			System.out.println(message);
			
			inputNumber = Integer.parseInt(bufferedReader.readLine());
			
			if(inputNumber <= 0){
				
				inputNumber = getPositiveInteger(message);
			}
		}catch(Exception ex){
			
			System.out.println("Something went wrong"+ ex.getMessage());
			
			inputNumber = getPositiveInteger(message);
		}
		
		return inputNumber;
		
	}
	
	public String getString(String message){
		
		String inputString="";
		
		try{
			
			System.out.println(message);
			
			inputString = bufferedReader.readLine();
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
			
		}
		
		return inputString;
		
	}
	
	public String getString(){
		
		String inputString="";
		
		try{
			
			inputString = bufferedReader.readLine();
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
		
		return inputString;
	}
	
	public void printMessage(String displayString){
		
		System.out.println(displayString);
	}
}