import java.util.Random;
import java.util.Scanner;
import java.lang.String;

import java.io.FileReader;
import java.io.*;
/** 
 *  COSC220_QuaShaun_Thurston_heroFight2.0.1.java
 *  Qua'Shaun Thurston
 *  24 October 2019
 *  This java program is a simple java fighting game that 
 *  determines a winner using switch cases, nesed if statements, 
 *  and random number generators.
 */
public class Hero_Fight2_0_1 {
/** 
 *  Main code; Declared both characters as char, 
 *  int three variables for P1 and P2 added together to
 *  determine which character wins.
 *  if statements tallies P1 vs P2's rounds together to
 *  dictate overal winner. 
 *  included do-while loop to easily replay game.
 */
   Scanner s = new Scanner(System.in);
   public static void main(String args[]) throws IOException {
   /**
    *  @TODO 
    *  Add a method to condense the for loop in each of the 36 conditions.
    *
    *  Add input validation before switch.
    */
      String answer;                               // Used for do-while loop answer.
      Scanner keyboard = new Scanner(System.in);   // Used for do-while loop keyboard input.
      
      String readFile = "results.txt";
      PrintWriter outFile = new PrintWriter(readFile);
      
      outFile.println("~~~~~~~~~~~~~~~\n" +
                      " MATCH RESULTS \n" +
                      "~~~~~~~~~~~~~~~\n");
      do {
         Random randomN = new Random();
         String char1 = char1Select();    
         String char2 = char2Select(); 

         switch(char2) {
            case "starlord":                         // Cases for character 1.
            case "Starlord":
               if (char2.equalsIgnoreCase("starlord")) {
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("P1's Starlord blasts P2's Starlord back to Missouri! P1's Starlord wins! ");
                     outFile.println("P1's Starlord blasts P2's Starlord back to Missouri! P1's Starlord wins! ");
                  }
                  else {
                     System.out.println("P2's Starlord blasts P1's Starlord back to Missouri! P2's Starlord wins! ");
                     outFile.println("P2's Starlord blasts P1's Starlord back to Missouri! P2's Starlord wins! ");
                  }               
               }
               else if (char2.equalsIgnoreCase("thor")) {
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Starlord blasts Thor back to Asgard! Starlord wins! ");
                     outFile.println("Starlord blasts Thor back to Asgard! Starlord wins! ");
                  }
                  else {
                     System.out.println("Thor banishes Starlord from the nine realms! Thor wins! ");
                     outFile.println("Thor banishes Starlord from the nine realms! Thor wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("deadpool")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Starlord blasts Deadpool back to New York! Starlord wins! ");
                     outFile.println("Starlord blasts Deadpool back to New York! Starlord wins! ");
                  }
                  else {
                     System.out.println("Deadpool makes friends with Starlord-- Nevermind! Deadpool wins! "); 
                     outFile.println("Deadpool makes friends with Starlord-- Nevermind! Deadpool wins! "); 
                  }      
               }
               else if (char2.equalsIgnoreCase("ironman")) {
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Starlord blasts Ironman back to New York! Starlord wins! ");
                     outFile.println("Starlord blasts Ironman back to New York! Starlord wins! ");
                  }
                  else {
                     System.out.println("Even dead, Ironman's the hero! Ironman wins! ");   
                     outFile.println("Even dead, Ironman's the hero! Ironman wins! ");                 
                  }
               }
               else if (char2.equalsIgnoreCase("groot")) {
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Starlord blasts Groot back to Planet X! Starlord wins! ");
                     outFile.println("Starlord blasts Groot back to Planet X! Starlord wins! ");
                  }
                  else {
                     System.out.println("I am groot! Groot Wins! ");
                     outFile.println("I am groot! Groot Wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("benny the bull")) {
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Starlord blasts Benny the Bull back to the slaughter house! Starlord wins!  ");
                     outFile.println("Starlord blasts Benny the Bull back to the slaughter house! Starlord wins!  ");
                  }
                  else {
                     System.out.println("Benny still out here making Starlord late for his 4 PM! Benny wins! ");
                     outFile.println("Benny still out here making Starlord late for his 4 PM! Benny wins! ");
                  }
               }      
               else
                  System.out.println("Please select a valid hero!");         
               break;
            case "thor":                           // Cases for character 2.
            case "Thor":
               if (char2.equalsIgnoreCase("thor")) {
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("P1's Thor banishes P2's Thor from the nine realms! P1's Thor wins! ");
                     outFile.println("P1's Thor banishes P2's Thor from the nine realms! P1's Thor wins! ");
                  }
                  else {
                     System.out.println("P2's Thor banishes P1's Thor from the nine realms! P2's Thor wins! ");
                     outFile.println("P2's Thor banishes P1's Thor from the nine realms! P2's Thor wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("starlord")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Thor banishes Starlord from the nine realms! Thor wins! ");
                     outFile.println("Thor banishes Starlord from the nine realms! Thor wins! ");
                  }
                  else {
                     System.out.println("Starlord blasts Thor back to Asgard! Starlord wins! ");
                     outFile.println("Starlord blasts Thor back to Asgard! Starlord wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("deadpool")) {
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Thor banishes Deadpool from the nine realms! Thor wins! ");
                     outFile.println("Thor banishes Deadpool from the nine realms! Thor wins! ");
                  }
                  else {
                     System.out.println("Deadpool makes friends with Thor-- Nevermind! Deadpool wins! ");   
                     outFile.println("Deadpool makes friends with Thor-- Nevermind! Deadpool wins! ");  
                  }              
               }
               else if (char2.equalsIgnoreCase("ironman")) {
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Thor banishes Ironman from the nine realms! Thor wins! ");
                     outFile.println("Thor banishes Ironman from the nine realms! Thor wins! ");
                  }
                  else {
                     System.out.println("Even dead, Ironman's the hero! Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! Ironman wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("groot")) {
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Thor banishes Groot from the nine realms! Thor wins! ");
                     outFile.println("Thor banishes Groot from the nine realms! Thor wins! ");
                  }
                  else {
                     System.out.println("I am groot! Groot Wins! ");
                     outFile.println("I am groot! Groot Wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("benny the bull")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Thor banishes lor Benny from the nine realms! Thor wins! ");
                     outFile.println("Thor banishes lor Benny from the nine realms! Thor wins! ");
                  }
                  else {
                     System.out.println("Benny still out here making Thor late for his 4 PM! Benny wins! ");
                     outFile.println("Benny still out here making Thor late for his 4 PM! Benny wins! ");
                  }
               }   
               else
                  System.out.println("Please select a valid hero!");     
               break;
            case "deadpool":                       // Cases for character 3.
            case "Deadpool":
               if (char2.equalsIgnoreCase("deadpool")) {
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("P1's Deadpool makes friends with P2's Deadpool-- Nevermind! P1's Deadpool wins! ");
                     outFile.println("P1's Deadpool makes friends with P2's Deadpool-- Nevermind! P1's Deadpool wins! ");
                  }
                  else {
                     System.out.println("P2's Deadpool makes friends with P1's Deadpool-- Nevermind! P2's Deadpool wins! ");
                     outFile.println("P2's Deadpool makes friends with P1's Deadpool-- Nevermind! P2's Deadpool wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("thor")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Deadpool makes friends with Thor-- Nevermind! Deadpool wins! ");
                     outFile.println("Deadpool makes friends with Thor-- Nevermind! Deadpool wins! ");
                  }
                  else {
                     System.out.println("Thor banishes Deadpool from the nine realms! Thor wins! ");
                     outFile.println("Thor banishes Deadpool from the nine realms! Thor wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("starlord")) {      
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Deadpool makes friends with Starlord-- Nevermind! Deadpool wins! ");
                     outFile.println("Deadpool makes friends with Starlord-- Nevermind! Deadpool wins! ");
                  }
                  else {
                     System.out.println("Starlord blasts Deadpool back to New York! Starlord wins! "); 
                     outFile.println("Starlord blasts Deadpool back to New York! Starlord wins! "); 
                  }             
               }
               else if (char2.equalsIgnoreCase("ironman")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Deadpool makes friends with Ironman-- Nevermind! Deadpool wins! ");
                     outFile.println("Deadpool makes friends with Ironman-- Nevermind! Deadpool wins! ");
                  }
                  else {
                     System.out.println("Even dead, Ironman's the hero! Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! Ironman wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("groot")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Deadpool makes friends with Groot-- Nevermind! Deadpool wins! ");
                     outFile.println("Deadpool makes friends with Groot-- Nevermind! Deadpool wins! ");
                  }
                  else {
                     System.out.println("I am groot! Groot Wins! ");
                     outFile.println("I am groot! Groot Wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("benny the bull")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Deadpool makes friends with lor Benny-- Nevermind! Deadpool wins! ");
                     outFile.println("Deadpool makes friends with lor Benny-- Nevermind! Deadpool wins! ");
                  }
                  else {
                     System.out.println("Benny still out here making Deadpool late for his 4 PM! Benny wins! ");
                     outFile.println("Benny still out here making Deadpool late for his 4 PM! Benny wins! ");
                  }
               }     
               else
                  System.out.println("Please select a valid hero!"); 
               break;
            case "ironman":                        //Cases for character 4.
            case "Ironman":
               if (char2.equalsIgnoreCase("ironman")) {                 
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Even dead, Ironman's the hero! P1's Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! P1's Ironman wins! ");
                  }
                  else {
                     System.out.println("Even dead, Ironman's the hero! P2's Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! P2's Ironman wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("thor")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Even dead, Ironman's the hero! Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! Ironman wins! ");
                  }
                  else {
                     System.out.println("Thor banishes Ironman from the nine realms! Thor wins! ");
                     outFile.println("Thor banishes Ironman from the nine realms! Thor wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("deadpool")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Even dead, Ironman's the hero! Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! Ironman wins! ");
                  }
                  else {
                     System.out.println("Deadpool makes friends with Ironman-- Nevermind! Deadpool wins! "); 
                     outFile.println("Deadpool makes friends with Ironman-- Nevermind! Deadpool wins! "); 
                  }             
               }
               else if (char2.equalsIgnoreCase("starlord")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Even dead, Ironman's the hero! Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! Ironman wins! ");
                  }
                  else {
                     System.out.println("Starlord blasts Ironman back to New York! Starlord wins! ");
                     outFile.println("Starlord blasts Ironman back to New York! Starlord wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("groot")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Even dead, Ironman's the hero! Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! Ironman wins! ");
                  }
                  else {
                     System.out.println("I am groot! Groot Wins! ");
                     outFile.println("I am groot! Groot Wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("benny the bull")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Even dead, Ironman's the hero! Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! Ironman wins! ");
                  }
                  else {
                     System.out.println("Benny still out here making Ironman late for his 4 PM! Benny wins! ");
                     outFile.println("Benny still out here making Ironman late for his 4 PM! Benny wins! ");
                  }
               }   
               else 
                  System.out.println("Please select a valid hero!");     
               break;
            case "groot":                          // Cases for character 5.
            case "Groot":
               if (char2.equalsIgnoreCase("groot")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("I am groot! P1's Groot Wins! ");
                     outFile.println("I am groot! P1's Groot Wins! ");
                  }
                  else {
                     System.out.println("I am groot! P2's Groot Wins");
                     outFile.println("I am groot! P2's Groot Wins");
                  }
               }
               else if (char2.equalsIgnoreCase("thor")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("I am groot! Groot Wins! ");
                     outFile.println("I am groot! Groot Wins! ");
                  }
                  else {
                     System.out.println("Thor banishes Groot from the nine realms! Thor wins! ");
                     outFile.println("Thor banishes Groot from the nine realms! Thor wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("deadpool")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("I am groot! Groot Wins! ");
                     outFile.println("I am groot! Groot Wins! ");
                  }
                  else {
                     System.out.println("Deadpool makes friends with Groot-- Nevermind! Deadpool wins! ");   
                     outFile.println("Deadpool makes friends with Groot-- Nevermind! Deadpool wins! ");   
                  }            
               }
               else if (char2.equalsIgnoreCase("ironman")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("I am groot! Groot Wins! ");
                     outFile.println("I am groot! Groot Wins! ");
                  }
                  else {
                     System.out.println("Even dead, Ironman's the hero! Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! Ironman wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("starlord")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("I am groot! Groot Wins! ");
                     outFile.println("I am groot! Groot Wins! ");
                  }
                  else {
                     System.out.println("Starlord blasts Groot back to Planet X! Starlord wins! ");
                     outFile.println("Starlord blasts Groot back to Planet X! Starlord wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("benny the bull")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("I am groot! Groot Wins! ");
                     outFile.println("I am groot! Groot Wins! ");
                  }
                  else {
                     System.out.println("Benny still out here making Groot late for his 4 PM! Benny wins! ");
                     outFile.println("Benny still out here making Groot late for his 4 PM! Benny wins! ");
                  }
               }
               else
                  System.out.println("Please select a valid hero!");  
               break;
            case "benny the bull":                          // Cases for character 6.
            case "Benny":
               if (char2.equalsIgnoreCase("benny the bull")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("P1's Benny still out here making P2's Benny late for his 4 PM! P1's Benny wins! ");
                     outFile.println("P1's Benny still out here making P2's Benny late for his 4 PM! P1's Benny wins! ");
                  }
                  else {
                     System.out.println("P2's Benny still out here making P1's Benny late for his 4 PM! P2's Benny wins! ");
                     outFile.println("P2's Benny still out here making P1's Benny late for his 4 PM! P2's Benny wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("thor")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Benny still out here making Thor late for his 4 PM! Benny wins! ");
                     outFile.println("Benny still out here making Thor late for his 4 PM! Benny wins! ");
                  }
                  else {
                     System.out.println("Thor banishes Starlord from the nine realms! Thor wins! ");
                     outFile.println("Thor banishes Starlord from the nine realms! Thor wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("deadpool")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Benny still out here making Deadpool late for his 4 PM! Benny wins! ");
                     outFile.println("Benny still out here making Deadpool late for his 4 PM! Benny wins! ");
                  }
                  else {
                     System.out.println("Deadpool makes friends with Starlord-- Nevermind! Deadpool wins! ");  
                     outFile.println("Deadpool makes friends with Starlord-- Nevermind! Deadpool wins! ");  
                  }             
               }
               else if (char2.equalsIgnoreCase("ironman")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Benny still out here making Ironman late for his 4 PM! Benny wins! ");
                     outFile.println("Benny still out here making Ironman late for his 4 PM! Benny wins! ");
                  }
                  else {
                     System.out.println("Even dead, Ironman's the hero! Ironman wins! ");
                     outFile.println("Even dead, Ironman's the hero! Ironman wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("groot")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Benny still out here making Groot late for his 4 PM! Benny wins! ");
                     outFile.println("Benny still out here making Groot late for his 4 PM! Benny wins! ");
                  }
                  else {
                     System.out.println("I am groot! Groot Wins! ");
                     outFile.println("I am groot! Groot Wins! ");
                  }
               }
               else if (char2.equalsIgnoreCase("starlord")) {                  
                  if (fightLoop(char1, char2) == true) {
                     System.out.println("Benny still out here making Starlord late for his 4 PM! Benny wins! ");
                     outFile.println("Benny still out here making Starlord late for his 4 PM! Benny wins! ");
                  }
                  else {
                     System.out.println("Starlord blasts Benny the Bull back to the slaughter house! Starlord wins! ");
                     outFile.println("Starlord blasts Benny the Bull back to the slaughter house! Starlord wins! ");
                  }
               }
               else
                  System.out.println("\nPlease select a valid hero!");
               break;
            default:
               System.out.println("\nPlease select a valid hero!");
               break;
         }
         System.out.print("\nWould you like to repeat the program? (Y/N): ");
         answer = keyboard.next();
         System.out.print(".\n.\n.\n.\n.\n");       //Spaces out screen a little so it is easier to read.
     }
      while (answer.equalsIgnoreCase("y"));
      if (answer != ("y")) {
      System.out.print("\nThanks for playing! ");
      outFile.close();
      }                              // Closes file.
   }
   /******************************
    * Character selection "menu" *
    ******************************/
   public static String char1Select() {          // Character selection screen.
      Scanner s = new Scanner(System.in);       // Used for character string inputs.
   
      System.out.print ("----------------------------" +
                        "\n- Choose your fighter, P1! -" + 
                        "\n----------------------------" +
                        "\nStarlord\n" +
                        "Thor\n" +
                        "Deadpool\n" +
                        "Ironman\n" +
                        "Groot\n" +
                        "Benny the Bull\n");
      String char1 = s.nextLine();              // Asks for input for character 1.
      return char1;
   }
   
   public static String char2Select () {
      Scanner s = new Scanner(System.in);
      System.out.print ("----------------------------" +
                        "\n- Choose your fighter, P2! -" + 
                        "\n----------------------------" +
                        "\nStarlord\n" +
                        "Thor\n" +
                        "Deadpool\n" +
                        "Ironman\n" +
                        "Groot\n" +
                        "Benny the Bull\n");
      String char2 = s.nextLine();              // Asks for input for character 2
      return char2;
   }
   
  /*****************************************
   *  Initializes the three variables      *
   *  for each player for each repitition  *
   *                                       *
   *  Returns bool value depending on the  *
   *  player stat value.                   *
   *****************************************/
   
   public static boolean charRNG() {            // Character randoms initilization
      Random randomN = new Random();
         
      int speedP1 = randomN.nextInt(5) + 1;     // Super 1
      int speedP2 = randomN.nextInt(5) + 1;
          
      int defP1 = randomN.nextInt(5) + 1;       // Super 2
      int defP2 = randomN.nextInt(5) + 1;
            
      int attackP1 = randomN.nextInt(5) + 1;    // Super 3
      int attackP2 = randomN.nextInt(5) + 1;
         
      int P1stats = ((speedP1 + defP1) + attackP1);
      int P2stats = ((speedP2 + defP2) + attackP2);
         
      return (P1stats > P2stats);
   }
   
   public static boolean fightLoop(String char1, String char2) throws IOException{     // Loops the fighting rounds 7 times.
      int P1Win = 0;
      int P2Win = 0;
      PrintWriter outFile = new PrintWriter("results.txt");

      for (int roundC = 0; roundC <= 6; roundC++) {
         if (charRNG() == true) {
            System.out.println("* " + char1.toUpperCase() + " (P1) wins round " + (roundC + 1) + "! *");
            outFile.println("* " + char1.toUpperCase() + " (P1) wins round " + (roundC + 1) + "! *");
            P1Win++;
         }
         else {
            System.out.println("* " + char2.toUpperCase() +  " (P2) wins round " + (roundC + 1) + "! *");
            outFile.println("* " + char2.toUpperCase() +  " (P2) wins round " + (roundC + 1) + "! *");
            P2Win++;
         }
      }
      return (P1Win > P2Win);
   }
}