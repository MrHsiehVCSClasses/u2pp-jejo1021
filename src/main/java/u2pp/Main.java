package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * YOUR COMMENTS HERE
 */

class Main {
  public static void main(String[] args) {
    
    //YOUR CODE HERE
	  //MPG user input
	  
	  	
	  	  Scanner car = new Scanner(System.in);
	  	  System.out.print("Enter a fuel efficiency: ");
	  	  Double milesPer = Double.parseDouble(car.nextLine());

	  	  
	  	  //make user input
	  	  

	  	  System.out.print("Enter a make: ");
	  	  String make = car.nextLine();

	  	  
	  	  //user model input
	  	  
	  	  
	  	  System.out.print("Enter a model: ");
	  	  String model = car.nextLine();

	  	  
	  	  //gas amt user imput

	  	  System.out.print("Enter amount of gas to add: ");
	  	  Double newGas = Double.parseDouble(car.nextLine());
	  	  
	  	  
	  	  
	  	  System.out.print("Enter distance to drive: ");
	  	  Double distance = Double.parseDouble(car.nextLine());
	  	  car.close();
	  	  
	  	  //making the car
	  	  Car myCar = new Car(milesPer, make, model);
	  	  
	  	  //updating car values
	  	  myCar.addGas(newGas);
	  	  myCar.drive(distance);
	  	  
	  	  //printing car stuff
	  	  System.out.println("Your " + myCar.getMakeAndModel() + " currently has " + myCar.getGasInTank() + " gallons of gas left in the tank");
	  	  
	  	  
	  	  //word change
	  	
	  	  
	  	  //WordChanger word = new WordChanger("Brian", 2, 3, "Wade", 0, 2);
	  	  
	  	  //System.out.println(word.wordchange());
	  	  String newWord = wordChanger("Brian", 2, 3, "Wade", 0, 2);
	  	  
	  	  //System.out.println(newWord);
  	}

  
  /**
   * YOUR COMMENT HERE
   * @param word1 The first string to take a piece out of
   * @param start1 The starting index of the substring of word1
   * @param end1 The ending index of the substring of word1 (inclusive)
   * @param word2 The second string to take a piece out of
   * @param start2 The starting index of the substring of word2
   * @param end2 The ending index of the substring of word2 (inclusive)
   * @return YOUR COMMENT HERE
   * 
   */
	public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
    //YOUR CODE HERE
		end1 += 1;
		end2 += 1;
		
		String str1 = word1.substring(start1,end1);
		String str2 = word2.substring(start2,end2);
		
		String str3 = str1 + str2;

		
		return str3;
		
	}
}
