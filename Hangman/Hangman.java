/* Hangman.java
 * Plays a game of hangman with computing careers as the words
 * February 21, 2018
 * @author Raymond Wang
 */

import java.util.Scanner;
import java.util.Random;

class Hangman {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    Random myRandom= new Random();
    
    String[] careers; //List where the secret words are picked from
    careers = new String[15];
    careers[0]="web developer";
    careers[1]="video game developer";
    careers[2]="database developer";
    careers[3]="computer support specialist";
    careers[4]="computer science teacher";
    careers[5]="bioinformatics specialist";
    careers[6]="it project manager";
    careers[7]="multimedia developer";
    careers[8]="network administrator";
    careers[9]="it security specialist";
    careers[10]="computer systems analyst";
    careers[11]="health information technician";
    careers[12]="computer hardware engineer";
    careers[13]="seo specialist";
    careers[14]="ux designer";
    
    int[] completedCareers; //List used to ensure secret words are not repeated in a session
    completedCareers = new int[15];
    
    String[] hint; //List containing 6 hints for each career
    hint = new String[90];
    //Career 0 (Web Developer) Hints
    hint[0]="Builds and maintains websites and web applications.";
    hint[1]="Works on back end, front end or both.";
    hint[2]="Has to stay up to date with new trends and advancements in web development.";
    hint[3]="Creates reliable applications and services which can be accessed over the Internet.";
    hint[4]="Has to cooperate with web designers.";
    hint[5]="Determines a website’s contents and adds the necessary tools and links.";
    
    //Career 1 (Video Game Developer) Hints
    hint[6]="Involved in game’s conception and execution.";
    hint[7]="Creates video games for computers and consoles.";
    hint[8]="Creates story lines and character biographies.";
    hint[9]="Is required to fix graphical glitches and bugs.";
    hint[10]="Converts art, audio and text assets into a format that can be used by the game engine.";
    hint[11]="Has to balance game mechanics so finished product is fun and enjoyable to the player.";
    
    //Career 2 (Database Developer) Hints
    hint[12]="Designs and builds databases.";
    hint[13]="Imports data into databases.";
    hint[14]="Meets with analysts, executives and managers to discuss what information needs to be stored.";
    hint[15]="Decides the best format to record and manage data.";
    hint[16]="Also known as a ‘database designer’ or ‘database programmer’.";
    hint[17]="Deploys data table structures, forms, reports and queries.";
    
    //Career 3 (Computer Support Specialist) Hints
    hint[18]="Assists users who are having problems with software and hardware.";
    hint[19]="Also known as a ‘technical support specialist’.";
    hint[20]="Can assist companies’ customers or provide support to an organization’s IT staff.";
    hint[21]="Installs, updates and troubleshoots software.";
    hint[22]="Can recommend new equipment and software.";
    hint[23]="Runs diagnostic programs to determine causes of problems.";
    
    //Career 4 (Computer Science Teacher) Hints
    hint[24]="Supports students and encourages them to do their best.";
    hint[25]="Assigns homework, projects and assignments.";
    hint[26]="Effectively delivers the curriculum.";
    hint[27]="Needs to be engaging and helpful to students.";
    hint[28]="Available to provide help and answer students’ questions.";
    hint[29]="Able to prepare and mark tests and quizzes.";
    
    //Career 5 (Bioinformatics Specialist) Hints
    hint[30]="Creates and maintains databases to store biological data, such as DNA sequences.";
    hint[31]="Some help design and operate clinical trials to test new drugs or medical services.";
    hint[32]="Analyzes and stores biological data.";
    hint[33]="Can create algorithms to process, analyze, visualize or interpret information.";
    hint[34]="Needed to support wildlife biologists and environmental scientists.";
    hint[35]="Able to analyze large amounts of data and explain biological phenomena.";
    
    //Career 6 (IT Project Manager) Hints
    hint[36]="Coordinates activities of professionals who develop computer programs.";
    hint[37]="Estimates how long a project will take.";
    hint[38]="Ensures that projects are finished on time and on budget.";
    hint[39]="Assigns tasks to team members.";
    hint[40]="Oversees team members and monitors progress.";
    hint[41]="Coaches and counsels employees while maintaining a professional composure.";
    
    //Career 7 (Multimedia Developer) Hints
    hint[42]="Creates elements for websites, smartphones apps, and video games.";
    hint[43]="Develops concepts and finds investors for multimedia products.";
    hint[44]="Combines computer programming and visual artist skills to design programs for various purposes.";
    hint[45]="May develop programs for CD-ROMs, websites or touch-screen kiosks.";
    hint[46]="Also known as a ‘multimedia artist’.";
    hint[47]="Needs to think about cross-platform integration.";
    
    //Career 8 (Network Administrator) Hints
    hint[48]="Responsible for keeping an organization’s computer network updated and running smoothly.";
    hint[49]="Installs network and computer systems.";
    hint[50]="Maintains, repairs, and upgrades network and computer systems.";
    hint[51]="Diagnoses and fixes problems with the network and its hardware, software and systems.";
    hint[52]="Also known as ‘systems administrator’.";
    hint[53]="Monitors network and systems to improve performance.";
    
    //Career 9 (IT Security Analyst) Hints
    hint[54]="Analyzes and establishes security requirements for systems or networks.";
    hint[55]="Defends systems against unauthorized access, modification and destruction.";
    hint[56]="Configures and supports security tools such as firewalls, anti-virus software.";
    hint[57]="Performs vulnerability testing, risk analyses and security assessments.";
    hint[58]="Trains fellow employees in security awareness, protocols and procedures.";
    hint[59]="Researches and recommends security upgrades.";
    
    //Career 10 (Computer Systems Analyst) Hints
    hint[60]="Studies an organization’s current computer system and procedures, and looks for improvements.";
    hint[61]="Devises ways to add new functionality to existing computer systems.";
    hint[62]="Calculates how much memory, storage and computing power the computer system needs.";
    hint[63]="Specialists in this career include ‘software quality assurance analysts’ and ‘programmer analysts’.";
    hint[64]="Also known as a ‘system architect’.";
    hint[65]="Determines the role of the IT system in an organization with its managers.";
    
    //Career 11 (Health Information Specialist) Hints
    hint[66]="Manages and organizes medical data.";
    hint[67]="Verifies the completeness and accuracy of medical records.";
    hint[68]="Uses computer application to collect and analyze patient data to improve care or control costs.";
    hint[69]="Since health records are increasingly kept electronically, this career is in high demand.";
    hint[70]="Can specialize in types of information, such as in medical coding.";
    hint[71]="Ensures the security of medical records.";
    
    //Career 12 (Computer Hardware Engineer) Hints
    hint[72]="Designs and creates computers and related parts.";
    hint[73]="Analyzes the requirements for new products.";
    hint[74]="Makes and tests prototypes.";
    hint[75]="Created products may include circuit boards and monitors.";
    hint[76]="Presents completed designs to clients and oversees the manufacturing process.";
    hint[77]="Creates blueprints of computer equipment to build.";
    
    //Career 13 (SEO Specialist) Hints
    hint[78]="Responsible for increasing number of visitors to a website.";
    hint[79]="Work is also known as ‘content marketing’ or ‘conversion rate optimisation work’.";
    hint[80]="Title may alternatively be ‘online marketer’ or ‘digital account executive’.";
    hint[81]="Runs pay-per-click campaigns to increase revenue through sponsored online advertising.";
    hint[82]="Works to obtain a high-ranking placement in the search results page of search engines.";
    hint[83]="Researches and analyzes the competitor’s advertising links.";
    
    //Career 14 (UX Designer) Hints
    hint[84]="Improves user experience of websites and apps.";
    hint[85]="Creates application and sites that are usable, intuitive and aesthetically pleasing.";
    hint[86]="Works to make experience pleasant so the user wishes to re-visit.";
    hint[87]="Analyzes requirement of client and behavior of users to incorporate in design of user interface.";
    hint[88]="Roles include UI designer, information architect and visual designer.";
    hint[89]="Creates storyboards to replicate a typical customer’s experience.";
    
    //Variables
    char guessChar=' ';
    char guessCharUpperCase=' ';
    
    String guess;
    String guessCharToString;
    String secretWord;
    String blanks;
    String anotherTry;
    
    int numPlays=0;
    int listIndex=0;
    int change;
    int lives;
    
    Boolean guessCorrect;
    Boolean win;
    
    //Instructions
    System.out.println("<=========================== HANGMAN ===========================>");
    System.out.println("Directions: Guess the computing career!");
    System.out.println("Guess individual letters or the whole phrase.");
    System.out.println("Guessing special characters and numbers will lose you a life.");
    System.out.println("You start at 6 lives.");
    System.out.println("<========================== HAVE FUN! ==========================>");
    
    do{
      win=false;
      
      //Lives start at six, one for each body part
      lives = 6; 
      
      //Chooses a random career and picks again if chosen already
      do{
      listIndex=myRandom.nextInt(15);
      }while (completedCareers[listIndex]==listIndex+1); //Adds one since an empty array is filled with zeroes, otherwise the career at index 0 would never get picked since it would always match an element
      
      //Adds the index to the array so it will not be picked again
      completedCareers[listIndex]=listIndex+1; 
      numPlays+=1;
      
      secretWord=careers[listIndex]; 
      
      blanks="";
      change=0;
      
      //Prints a dash for every letter and a space for every space
      for (int i=0; i<secretWord.length(); i++){ 
        if (secretWord.charAt(i)==' ') {
          blanks=blanks+" ";
        } else {
          blanks=blanks+"-";
        }
      }
      
      //Draws the ASCII gallows without the hangman
      System.out.println("+---+"); //Draws the top bar
      for (int j=2; j<7; j++) {
        System.out.print("|"); //Draws the pole
        System.out.print("  ");
        if (j==2) {
          System.out.println(" |"); //Draws the noose
        } else {
          System.out.println("");
        } 
      }
      System.out.printf("%s %n", "#=======#"); //Draws the base
      
      System.out.println(blanks);
      System.out.println(hint[listIndex*6]);
      
      
      //Guessing input starts looping here
      while (lives>0 && win==false) {
        guess=input.nextLine();
        guess=guess.toLowerCase(); //Guess is always stored as lowercase for easy comparison
        
        change=0;
        guessCorrect=false;
        
        //Checker 1: Treats guess as a string and compares it directly with the secret word
        if (guess.length()!=1) { 
          if (guess.equals(secretWord.toLowerCase())){ //Wins if string matches the secret word
            win=true;
            guessCorrect=true;
            blanks=secretWord.toUpperCase();
            
          } else {
            guessCorrect=false;
          }
        }
        
        //Checker 2: Treats guess as a character and finds and replaces it in the blanks
        if (guess.length()==1) {
          guessChar=guess.charAt(0); //"Converts" the character into a string
          
          guessCharToString=Character.toString(guessChar);
          guessCharUpperCase=guessCharToString.toUpperCase().charAt(0); //Makes the character upperac
          
          for (int m=0; m<secretWord.length(); m++){
            if (guessChar == secretWord.charAt(m)) {
              secretWord=secretWord.replace(guessChar, guessCharUpperCase); //If guessChar is present in the secret word, it will turn all instances of it uppercase
              
              change=0;
              blanks="";
              
              //Displays one blank for each letter
              for (int n=0; n<secretWord.length(); n++){
                if  (Character.toString(secretWord.charAt(n)).compareTo("a")<0) { //Uses .compareTo to find the capital letters and displays those instead of blanks
                  blanks=blanks+secretWord.charAt(n);
                  change+=1;
                } else {
                  blanks=blanks+"-";
                }
              }
              //If all blanks are filled, the player wins
              if (blanks.indexOf("-")==-1) { 
                win=true;
              }
            }
          }
        }
        
        //If the guess fails both the string checker and the character checker, one life is lost
        if (!guessCorrect && change==0) { 
          lives-=1;
        }
        
        //Draws the ASCII gallow (with the hangman if incorrect), int p corresponds to the line number when printed
        System.out.println("+---+"); //Draws the top bar
        for (int p=2; p<7; p++) {
          System.out.print("|"); //Draws the vertical column
          System.out.print("  ");
          if (p==2) {
            System.out.println(" |"); //Draws the noose
          } else if (p==3 && lives<=5) {
            System.out.println(" 0"); //Draws the head
          }else if (p==4 && lives==4) {
            System.out.println(" |"); //Draws the body and arms
          }else if (p==4 && lives==3) {
            System.out.println("/|");
          }else if (p==4 && lives<=2) {
            System.out.println("/|\\");
          }else if (p==5 && lives==1) {
            System.out.println("/"); //Draws the legs
          }else if (p==5 && lives==0) {
            System.out.println("/ \\");
          } else {
            System.out.println("");
          } 
        }
        System.out.printf("%s %n", "#=======#"); //Draws the base
        
        System.out.println(blanks);
        
        if (!win){
          if (!guessCorrect && change==0) { //Fails both checkers
            System.out.println("!INCORRECT!");
            System.out.println("Lives: "+lives);
            
            if (lives!=0){
              System.out.println(hint[listIndex*6+(6-lives)]); //Displays a hint for every mistake except the last
            } 
          } else {
            System.out.println("!CORRECT!");
          }
        } else {            
          System.out.println("***!!!YOU GOT IT!!!***"); //If player guesses the entire word
        }
      }
      
      //Ends the game and reveals the word
      if (lives==0){ 
        System.out.println("");
        System.out.println("*========GAME OVER========*");
        System.out.println("The word is: "+secretWord.toUpperCase());
      }
      
      if (numPlays==15) {
        System.out.println("You played all the words! Congratulations!");
      }
      
      //Prompts the player to try again
      System.out.println("PLAY AGAIN? Y/N");
      anotherTry=input.nextLine().toUpperCase();
      while (!anotherTry.equals("Y") && !anotherTry.equals("N")){ //Repeats asking until input is either Y or N
        System.out.println("Invalid Response. Please enter Y/N");
        anotherTry=input.nextLine().toUpperCase();
      }
      
      if (numPlays==15 && anotherTry.equals("Y")); {
        for (int c=0; c<15; c++){ //Changes every element in the array to -1 so no career index matches it
          completedCareers[c]=-1;
        }
        numPlays=0;
      }
      
    } while (anotherTry.equals("Y"));
    System.out.println("You chose not to play again.");
  }
}


