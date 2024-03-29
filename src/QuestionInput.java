import java.util.Scanner;

public class QuestionInput {
	// Declare the object and initialize with 
    // predefined standard input object 
    
    // According to https://www.java-made-easy.com/java-scanner.html
    // we need two scanners.
    
    static Scanner scText = new Scanner(System.in); 
    static Scanner scInteger = new Scanner(System.in); 

 // Ask user for their name, then greet. Store in name
 public static void userName() {
    System.out.println("Please enter your name: ");
    String name = scText.nextLine(); 
    System.out.println("Hello, " + name);
    };
   
    // Ask if they want to continue. store in contin
  public static void keepGoing() {
       System.out.println("Would you like to continue? ");
       String keepGoing = scText.nextLine();
       char contin= keepGoing.charAt(0); 
       };
    		   
       // Need to add Check for Y or N, any variations of, and invalid forms
    
    // Ask if they have a red car, store in carColor
  public static void carColor() {
       System.out.println("Do you have a red car? ");
       String redCarAnswer = scText.nextLine();
       char redCar= redCarAnswer.charAt(0); 
       };
    // Need to add Check for Y or N, any variations of, and invalid forms // Need to add Check for Y or N, any variations of, and invalid forms 
     
    // Ask the name of their favorite pet, store in petName
   public static void namePet() {
       System.out.println("What is the name of your favorite pet? ");
       String petName = scText.nextLine(); 
       System.out.println("Your Pet's name is '" + petName + "'.");
       };

    // Ask the age of their pet, store in petAge
   public static void petsAge() {
       System.out.println("What is the age of your pet?");
       int petAge = scInteger.nextInt(); 
       };
   
    // Ask for their lucky number, store in luckyNum
   public static void luckyNumber() {
       System.out.println("What is your lucky number? ");
       int luckyNum = scInteger.nextInt(); 
       };
  
    // Do they have a favorite Quarterback, store in qbQuestion
   public static void QBack() {
       System.out.println("Do you have a favorite Quarterback? ");
       String qBack = scText.nextLine();
       char qbQuestion= qBack.charAt(0);
         };    		         
    
     //Need to add Check for Y or N, any variations of, and invalid forms
         //If yes, ask for jersey number and store in jerseyNum
   public static void jerseyNum() {
           System.out.println("What is their jersey number? ");
           int jerseyNum= scInteger.nextInt();
             };
             
    // Ask for car year and store in carYear. Verify it is only 2 digits.
   public static void yearOfCar() {
       System.out.println("What is the year of your car? Please input the 2-digit number. ");
       int carYear = scInteger.nextInt(); 
       if (carYear>99)  {
          System.out.println("Invalid input. Please enter 2 digit number for your car year");
             for(int i=0; i<10; i++) {
                carYear = scInteger.nextInt(); 
       }
       }
       };
       
    // Ask for favorite actress or actor, store in actorName
       public static void actName() {
       System.out.println("Who is  your favorite actor or actress? ");
       String actorName = scText.nextLine();
       };
  
    // Ask for a random number, store in randNum
       public static void numRand() {
       System.out.println("Please enter a random number between 1 and 50? ");
       int randNum = scInteger.nextInt(); 
       };
       
       Scanner in,close;

}

	