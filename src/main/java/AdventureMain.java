import java.util.Scanner;

public class AdventureMain {
    /**
     * Created by Guest on 8/3/17.
     */
    public static void main(String[] args) {

        Scanner rep = new Scanner(System.in);                           //Scanner variable
        String playerName;                                               //Stores the name of the player.
        String decision1, decision2, decision3;                       //Store the decisions of player.
        int age;                                                       //Stores the age of player.
        String line2, line3, line4;                                     //Text for the lines.

        line2 = "What in the Heck!!! *They are closed. So you starve and die* GAMEOVER";
        line3 = "Good. Lets GO! *As you both proceed, suddenly a ninja enters the \nscene with a sword and holds the man at bay. You are terrified*";
        line4 = "You slowly raise your arms in surrender. As you are getting down on your knees, another man shouts from\nwindow" + " outside'HEY! NEAL! MAKE IT QUICK!'. The ninja gets distracted. You see this as an opportunity";

        System.out.println("Please enter your age.");
        age = rep.nextInt();

        if (age > 13) {
           System.out.println("Hello. Please Enter your Name :");

        } else {
            System.out.println("You are not old enough.");
            System.exit(0);
        }

        playerName = rep.next();


        //Next lines print out the first dialogues and decision.
        System.out.print("[note-type exit at any time to exit] Wake UP!      I'm Starving!\n Looks like you are wasting away a bit. You are ");
        System.out.print(playerName);
        System.out.println(" right? Cmon, lets get something to eat.");
        System.out.println("What do you do? A. Head towards Alder Street foodcarts.");
        System.out.println("B. Follow him.");
        decision1 = rep.next();

        switch (decision1) {

            case "exit":
                System.exit(0); /*user termination.*/
                break;

            case "A":
                System.out.println(line2);
                System.exit(0);
                break;
            case "B":
                System.out.println(line3);
                break;

        }

        System.out.println("What do you do? ");
        System.out.println("A. You attempt to disarm the ninja.");
        System.out.println("B. You slowly raise your arms to display that you pose no danger.");

        decision2 = rep.next();

        switch (decision2) {

            case "exit":
                System.exit(0);
                break;
            case "A":
                System.out.println(" He slices you in half and you die. *GAME OVER*");
                System.exit(0);
                break;
            case "B":
                System.out.println(line4);
                break;
        }

        System.out.println(" What do you do?\n A.Kick the ninja in the nuts and take his sword.\n B.Make a run for it through the intersection.\n C.Do nothing and remain in the surrender position.");

        decision3 = rep.next();

        switch (decision3) {

            case "exit":
                System.exit(0);
                break;

            case "A":
                System.out.println(" You succesfully kick him in the nuts. The Ninja shouts in agony and you easily grab the sword that slipped form his hands.\n You now have the sword, so you make your way to 5th and Oak St and grab a nasty burrito from the first cart you find.*WINNER WINNER BURRITO DINNER");
                break;

            case "B":
                System.out.println(" You try to make a run for it through the door, but the Ninja notices your escape attempt.\n He immediately swings his sword at you, but misses. He swings at you again. It hits you right in the bottom and you fall on the ground,\n shouting in agony holding your but, you bleed out and die hungry in the street.*GAME OVER*");
                System.exit(0);
                break;

            case "C":
                System.out.println("You decide its better to comply. You and your buddy are down on your knees. The ninja then turns to you buddy\nand says\"Hope you had a fun little life. HA! just kidding! Hope you DIDN'T\"\n*BOOM* Your friends severed head lies next to you. The man now shifts his gaze onto you.*GAME OVER*");

//The game is not complete but I only made this to learn. I would love if you guys told me my mistakes and things i could've done differently and better. I would appreciate it . }

        }

    }
}



//    public void playAdventure(){
//
//        for (AdventureStage stage : adventureStages) {
//            System.out.print(stage.getDescription());
//            for (String decision : stage.getDecisions()) {
//                System.out.print("     "+ decision.toString());
//
//            }
//            String userInput + rep.next();
//            stage.setUserInput(userInput);
//            if (stage.isAdventureOver()) {
//                System.out.print(stage.getAdventureOverText());
//
//            }
//        }
//        System.out.println(" You Win!!!!!!");
//    }
//
//    static Scanner rep = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        new AdventureMain().playAdventure();
//    }
//}

//    Scanner keyboard = new Scanner(System.in);
//
//        String Go, Look, Truck, Eat;
//
//        System.out.println(" WELCOME TO THE ADVENTURE");
//        System.out.println("  ");
//        System.out.println(" You are downtown! Would you like to go 'east' or 'west'? ");
//        System.out.print("> ");
//        Go = keyboard.next();
//
//        if (Go.equalsIgnoreCase("west")) {
//            System.out.println("There is a long walk going 'west'. Off to one side there is, as you'd expect, a mexican foodtruck . You may chose 'Mexican' or look for another 'truck'. ");
//            System.out.print(">  ");
//            Look = keyboard.next();
//
//            if (Look.equalsIgnoreCase("Mexican")) {
//                System.out.println("On the menu you see burritos and stuff. It looks pretty nasty. Would you like to eat some of the food, 'Yes' or 'No'?");
//                System.out.print(">  ");
//                Eat = keyboard.next();
//
//                if (Eat.equalsIgnoreCase("Yes")) {
//                    System.out.println("  ");
//                    System.out.println("You live!");
//                } else if (Eat.equalsIgnoreCase("No")) {
//                    System.out.println("  ");
//                    System.out.println("You die of starvation!");
//                }
//            }
//            } else if (Look.equalsIgnoreCase("truck")) {
//                System.out.println("There is a killer ninja inside the eastside trucks. Do you want to 'fight' them, or 'run away'?");
//                System.out.print(">  ");
//                 Truck= keyboard.next();
//
//                if (Truck.equalsIgnoreCase("fight")) {
//                    System.out.println("  ");
//                    System.out.println("You're weak and die");
//                } else if (Truck.equalsIgnoreCase("run away")) {
//                    System.out.println("  ");
//                    System.out.println("You died because your too slow & can't run");
//                }
//            }
//        }
//    }