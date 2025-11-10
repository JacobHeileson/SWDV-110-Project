import java.util.Scanner;

    public class Player {
    Scanner in = new Scanner(System.in);

        // Declare basic information about the Character
        private String name;
        private String proSubj;   // he / she / they
        private String proObj;    // him / her / them
        private String possAdj;   // his / her / their
        private int age;

        public String getName() {
            return name;
        }
  
        public String getProSubj() {
            return proSubj;
        }

        public String getProObj() {
            return proObj;
        }

        public String getPossAdj() {
            return possAdj;
        }

        public int getAge() {
            return age;
        }


        public Player() {
            
            // Input basic information
            System.out.print("Enter a name for the character: ");
            name = in.nextLine();

            System.out.print("Enter a pronoun subject (he/she/they): ");
            proSubj = in.nextLine().toLowerCase();

            System.out.print("Enter a pronoun object (him/her/them): ");
            proObj = in.nextLine().toLowerCase();

            System.out.print("Enter a possessive adjective (his/her/their): ");
            possAdj = in.nextLine().toLowerCase();

            System.out.print("Enter an age for the character: ");
            age = in.nextInt();

            in.nextLine();
        }
    }