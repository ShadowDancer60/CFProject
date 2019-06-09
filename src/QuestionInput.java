import java.util.Scanner;

public class QuestionInput {
	// Declare the object and initialize with 
    // predefined standard input object 
    static Scanner sc = new Scanner(System.in); 

 // Ask user for their name, then greet. Store in name
 public static void userName() {
    System.out.println("Please enter your name: ");
    String name = sc.nextLine(); 
    System.out.println("Hello, " + name);
    };
   
    // Ask if they want to continue. store in contin
  public static void keepGoing() {
       System.out.println("Would you like to continue? ");
       char contin= sc.next().charAt(0); 
       };
    		   
       // Need to add Check for Y or N, any variations of, and invalid forms
    
    // Ask if they have a red car, store in carColor
  public static void carColor() {
       System.out.println("Do you have a red car? ");
       char redCar= sc.next().charAt(0); 
       };
    // Need to add Check for Y or N, any variations of, and invalid forms 
     
    // Ask the name of their favorite pet, store in petName
   public static void namePet() {
       System.out.println("What is the name of your favorite pet? ");
       String petName = sc.nextLine(); 
       };

    // Ask the age of their pet, store in petAge
   public static void petsAge() {
       System.out.println("What is the age of your pet?");
       int petAge = sc.nextInt(); 
       };
   
    // Ask for their lucky number, store in luckyNum
   public static void luckyNumber() {
       System.out.println("What is your lucky number? ");
       int luckyNum = sc.nextInt(); 
       };
  
    // Do they have a favorite Quarterback, store in qbQuestion
   public static void QBack() {
       System.out.println("Do you have a favorite Quarterback? ");
       char qbQuestion= sc.next().charAt(0);
         };    		         
    
     //Need to add Check for Y or N, any variations of, and invalid forms
         //If yes, ask for jersey number and store in jerseyNum
   public static void jerseyNum() {
           System.out.println("What is their jersey number? ");
           int jerseyNum= sc.nextInt();
             };
             
    // Ask for car year and store in carYear. Verify it is only 2 digits.
   public static void yearOfCar() {
       System.out.println("What is the year of your car? Please input the 2-digit number. ");
       int carYear = sc.nextInt(); 
       if (carYear>99)  {
          System.out.println("Invalid input. Please enter 2 digit number for your car year");
             for(int i=0; i<10; i++) {
                carYear = sc.nextInt(); 
       }
       }
       };
       
    // Ask for favorite actress or actor, store in actorName
       public static void actName() {
       System.out.println("Who is  your favorite actor or actress? ");
       String actorName = sc.nextLine();
       };
  
    // Ask for a random number, store in randNum
       public static void numRand() {
       System.out.println("Please enter a random number between 1 and 50? ");
       int randNum = sc.nextInt(); 
       };
       
       Scanner in,close;

}

	