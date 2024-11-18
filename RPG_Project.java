import java.util.*;
public class RPG_Project {
    private static int process = 0;
    private static int achievement = 0;
    private static int con = 1;
    private static String anykey;
    private static int timesa = 0;
    private static int timesb = 0;
    private static int task2con = 0;
    private static int task3t = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (con == 1) {
            introduction(scan);
        }
        System.out.println("Thanks for playing");
    }


    public static void task1(Scanner scan) {
        String quit = "n";
        if ((process%100)%10==4||(process%100)%10==6||(process%100)%10==8){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("You have done this task, you want to:\n" +
                    "1.Redo this task(the process of this task will be restart)\n" +
                    "2.quit\n"+"Make your choise in number.");
            int choise = scan.nextInt();
            if (choise==1)
                process=process-(process%100)%10;
            else
                System.out.println("You will back to manu");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if ((process%100)%10>0&&(process%100)%10<6||(process%100)%10==7) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("You are in the middle of the task, you want to:\n" +
                    "1.Continue your task\n" +
                    "2.Restart your task(this will restart your game process of this task)\n" +
                    "3.Quit this task\n" +
                    "Make your choise in number.");
            int choise = scan.nextInt();
            if (choise==1);
            else if (choise==2)
                process=process-(process%100)%10;
            else {
                quit = "y";
                System.out.println("You will back to manu.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        while ((process%100)%10==0&&quit.equals("n")){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("1941, Europe.\n" +
                    "Nazi Germany invade most country in west europe. Now they aim their goal to British, \n" +
                    "but Royal air force and Royal navy block them in east coast of atlantic ocean. \n" +
                    "To invade British, Hitler make a plan: \n" +
                    "Operation Sea Lion");

            System.out.println("Press any key");
            anykey = scan.next();
            if (anykey.equals("q")||anykey.equals("Q"))
                quit="y";
            else
                process = process + 1;
        }
        while ((process%100)%10==1&&quit.equals("n")) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("You are a pilot of Supermarine Walrus, as usual, you take off from sea to " +
                    "scouting the german front coast");
            plane1(scan);
            System.out.println("Press any key");
            anykey = scan.next();
            if (anykey.equals("q")||anykey.equals("Q"))
                quit="y";
            else
                process = process + 1;
        }

        while ((process%100)%10==2&&quit.equals("n")) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("you saw some black point in the sky of the coast.");
            coast(scan);
            System.out.println("\nBefore this mission, your assistant told you British and Germany are in war, \n" +
                    "but you look down upon. Now you treat this as a truth. You ask your copilot take a picture, \n");
            System.out.println("Press any key");
            anykey = scan.next();
            if (anykey.equals("q")||anykey.equals("Q"))
                quit="y";
            else
                process = process + 1;
        }
        while ((process%100)%10==3&&quit.equals("n")){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("The picture need time to show up, but you can already saw \n" +
                    "Ju-87 Stuka\n" +
                    " ------\n" +
                    "| | # \\                                      |\n" +
                    "| ____ \\_________|----^\"|\"\"\"\"\"|\"\\___________ |\n" +
                    " \\___\\   FO + 94 >>    `\"\"\"\"\"\"\"\"     =====  \"|D\n" +
                    "         ^^-------____--\"\"\"\"\"\"\"\"\"\"+\"\"--_  __--\"|\n" +
                    "                     `\"\"|\"-->####)+---|`\"\"     |\n" +
                    "                                      \\  \\\n" +
                    "                                     <- O -)\n" +
                    "                                       `\"'");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("And BF-109 \n" +
                    " !              ____         /`|`\\\n" +
                    " ! _......_/|__|____\\..___../  |  |\n" +
                    "<|~oooo    _____           c===-  |\n" +
                    " !-...____/~~~~~\\_____...-___-.|._/\n" +
                    " !        / |~~|__..=      o\n" +
                    "         <  |\n" +
                    "          (o)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Now is time to do the decision, Your plane doesn't have any weapon.\n" +
                    "You decide to:\n" +
                    "1.Run! Run as fast as you can.\n" +
                    "2.Try to decrease your elevation and fly close to sea surface.\n" +
                    "3.Act like a Medieval Knight, fly close and say Hello to them\n" +
                    "Make your decision by enter the number.");
            int deci = scan.nextInt();
            if (deci==1)
                process=process+2;
            else if (deci==2)
                process=process+4;
            else if (deci==3) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("You try to act like a medieval knight, but this is WWII.\n" +
                        "You been shoot down by 20mm cannon, The shell broke your wing and your plane \n" +
                        "crash into the sea. The investigation result of German are going to attack British \n" +
                        "won't send to British anymore. ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if ((achievement%100)%10==0||(achievement%100)%10==2||(achievement%100)%10==4||(achievement%100)%10==6) {
                    System.out.println("*\n" +
                            "You get the Achievement: Knights of old");
                    achievement = achievement + 1;
                }
                process=process+1;
                System.out.println("You are going to quit this task, try another section to win this task \n" +
                        "and be able to start the next one.");
                System.out.println("Press any key to continue");
                anykey = scan.next();
            }
            else
                System.out.println("You will quit this task");
        }
        while ((process%100)%10==5&&quit.equals("n")){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("You tell your assistant to turn the booster of engine on, the engine of supermarine \n" +
                    "start to roar, these german pilot also find you, because the blue plane under the white \n" +
                    "cloud is as conspicuous as a mole.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("They are coming for you.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            coastplane(scan);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Fortunately your plane captain take care your plane from dead engine, you\n" +
                    "break away from these planes. 30 min later, you send the message to royal airforce.");
            task1finish(scan);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if ((achievement%100)%10==0||(achievement%100)%10==1||(achievement%100)%10==4||(achievement%100)%10==5) {
                System.out.println("*\n" +
                        "You get the Achievement: Flee in a dilemma");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                achievement = achievement + 2;
            }
            System.out.println("Press any key to continue");
            anykey = scan.next();
            if (anykey.equals("q")||anykey.equals("Q"))
                quit="y";
            else
                process = process + 1;
        }
        while ((process%100)%10==7&&quit.equals("n")){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("You told your plane captain slow down the engine and decrease the elevation.\n" +
                    "Ultra low elevation is dangerous for plane but as a good pilot, you can hold it.\n" +
                    "These hostile plane didn't saw you because blue plane is completely hide on the surface of \n" +
                    "North Atlantic ocean. You successfully back to British island and send the scout report to \n" +
                    "Royal airforce. They are now prepare for it.");
            task1finish(scan);

            if ((achievement%100)%10==0||(achievement%100)%10==1||(achievement%100)%10==2||(achievement%100)%10==3) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("*\n" +
                        "You get the Achievement: Live for fight another day");
                achievement = achievement + 4;
            }
            System.out.println("Press any key to continue");
            anykey = scan.next();
            process=process+1;
        }
    }


    public static void task2(Scanner scan) {
        int cprocess = process-process%10;
        if (cprocess%100==10||cprocess%100==20||cprocess%100==30||cprocess%100==40){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("You have done this task, you want to:\n" +
                    "1.Redo this task(the process of this task will be restart)\n" +
                    "2.Redo this task(jump teaching level)"+
                    "3.quit\n"+"Make your choise in number.");
            task2con = scan.nextInt();
            if (task2con==1||task2con==2) {
                process = process - cprocess % 100;
                testflight(scan);
            }
            else
                System.out.println("You will back to manu");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            task2con=1;
            testflight(scan);
        }
    }


    public static void task3(Scanner scan) {
        int aga = 1;
        int tra = 0;
        int con = 1;
        int exp = 0;
        int l1=0;
        int l2=0;
        int l3=0;
        int l4=0;
        int l5=0;
        int l =0;
        int r =0;
        int cona=0;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        if (task3t>0){
            System.out.println("You have finish this task, you want to:\n1.Try the task again with tutorial\n2.Try the task again without tutorial\n" +
                    "3.quit the task\nEnter your choise in number.");
            cona=scan.nextInt();
            if (cona==1)
                tra = 1;
            else if (cona==2);
            else
                con=0;

        }
        while (aga==1&&task3t==0&&con==1||aga==1&&tra==1&&con==1) {
            System.out.println("You are a Royal Engineers, people like you don't kill in the air like these pilots, but " +
                    "\nyou also have important missions on you:dismantling the bomb didn't explode or have delay fuse.");
            System.out.println("Here is the bomb dismantling guidebook:\nThe bomb control panel looks like this:\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                    "X                                                              X\n" +
                    "X                                                              X\n" +
                    "X------                                                  ------X\n" +
                    "X     1                                                  1     X\n" +
                    "X------                                                  ------X\n" +
                    "X                                                              X\n" +
                    "X------                                                  ------X\n" +
                    "X     2                                                  2     X\n" +
                    "X------                                                  ------X\n" +
                    "X                                                              X\n" +
                    "X------                                                  ------X\n" +
                    "X     3                                                  3     X\n" +
                    "X------                                                  ------X\n" +
                    "X                                                              X\n" +
                    "X------                                                  ------X\n" +
                    "X     4                                                  4     X\n" +
                    "X------                                                  ------X\n" +
                    "X                                                              X\n" +
                    "X------                                                  ------X\n" +
                    "X     5                                                  5     X\n" +
                    "X------                                                  ------X\n" +
                    "X                                                              X\n" +
                    "X                                                              X\n" +
                    "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                    "There is 10 terminals in both sides, each side has 5 terminals. The terminals will filled by " +
                    "characters in real bomb.");
            System.out.println("Press any key to continue");
            anykey = scan.next();
            System.out.println("By the sacrifice of dozens of sappers, we make this guidebook to help engineers to dismantling\n" +
                    "bombs. Here is the rule:");
            System.out.println("press any key to continue");
            anykey = scan.next();
            System.out.println("1.? terminal must be connect to ! terminal, if there's multiple way to connect, you need" +
                    " to make sure the path you connect are crossed.");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("2.# terminal must be connect to | terminal, if there's multiple way to connect, you need" +
                    " to make sure the path you connect are parallel.");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("3.? terminal can connect to any terminal, but if you connect it to the terminal should " +
                    "be connected with specific terminal, the bomb will explode.");
            System.out.println("\nYou want to:\n1.Enter the task\n2.Redo the train\n3.quit this task ");
            cona=scan.nextInt();
            if (cona==1)
                aga=0;
            else if (cona==2);

            else
                con=0;
        }
        if (con==1)
            t00000(scan);
        while (con==1){
            System.out.println("This is the bomb control panel now.\n Here is the rule:\n\n" +
                    "1.? terminal must be connect to ! terminal, if there's multiple way to connect, you need\" +\n" +
                    "                    \" to make sure the path you connect are crossed.\n" +
                    "2.# terminal must be connect to | terminal, if there's multiple way to connect, you need\" +\n" +
                    "                    \" to make sure the path you connect are parallel.\n" +
                    "3.? terminal can connect to any terminal, but if you connect it to the terminal should \" +\n" +
                    "                    \"be connected with specific terminal, the bomb will explode.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Select the left terminal you want to connect");
            l=scan.nextInt();
            System.out.println("Select the right terminal you want to connect with");
            r=scan.nextInt();
            if (l==1){
                if (r==1){
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==2) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==3) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==4) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==5) {
                    l1 = 1;
                }
                else{
                    explode(scan);
                    exp=1;
                    con=0;
                }
            }
            else if (l==2){
                if (r==1){
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==2) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==3) {
                    l2=1;
                }
                else if (r==4) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==5) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else{
                    explode(scan);
                    exp=1;
                    con=0;
                }
            }
            else if (l==3){
                if (r==1){
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==2) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==3) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==4) {
                    l3=1;
                }
                else if (r==5) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else{
                    explode(scan);
                    exp=1;
                    con=0;
                }
            }
            else if (l==4){
                if (r==1){
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==2) {
                    l4=1;
                }
                else if (r==3) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==4) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==5) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else{
                    explode(scan);
                    exp=1;
                    con=0;
                }
            }
            else if (l==5){
                if (r==1){
                    l5=1;
                }
                else if (r==2) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==3) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==4) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else if (r==5) {
                    explode(scan);
                    exp=1;
                    con=0;
                }
                else{
                    explode(scan);
                    exp=1;
                    con=0;
                }
            }
            else {
                explode(scan);
                exp=1;
                con=0;
            }

            //panel show process
            if (con==1){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                if (l1==0){

                    if (l2==0){

                        if (l3==0){

                            if (l4==0){

                                if (l5==0){
                                    t00000(scan);
                                }
                                else if (l5==1) {
                                    t10000(scan);
                                }
                            }
                            else if (l4==1) {
                                if (l5==0){
                                    t01000(scan);
                                }
                                else if (l5==1) {
                                    t11000(scan);
                                }
                            }
                        }
                        else if (l3==1) {
                            if (l4==0){
                                if (l5==0){
                                    t00100(scan);
                                }
                                else if (l5==1) {
                                    t10100(scan);
                                }
                            }
                            else if (l4==1) {
                                if (l5==0){
                                    t01100(scan);
                                }
                                else if (l5==1) {
                                    t11100(scan);
                                }
                            }
                        }
                    }
                    else if (l2==1) {
                        if (l3==0){
                            if (l4==0){
                                if (l5==0){
                                    t00010(scan);
                                }
                                else if (l5==1) {
                                    t10010(scan);
                                }
                            }
                            else if (l4==1) {
                                if (l5==0){
                                    t01010(scan);
                                }
                                else if (l5==1) {
                                    t11010(scan);
                                }
                            }
                        }
                        else if (l3==1) {
                            if (l4==0){
                                if (l5==0){
                                    t00110(scan);
                                }
                                else if (l5==1) {
                                    t10110(scan);
                                }
                            }
                            else if (l4==1) {
                                if (l5==0){
                                    t01110(scan);
                                }
                                else if (l5==1) {
                                    t11110(scan);
                                }
                            }
                        }
                    }
                }
                else if (l1==1) {
                    if (l2==0){
                        if (l3==0){
                            if (l4==0){
                                if (l5==0){
                                    t00001(scan);
                                }
                                else if (l5==1) {
                                    t10001(scan);
                                }
                            }
                            else if (l4==1) {
                                if (l5==0){
                                    t01001(scan);
                                }
                                else if (l5==1) {
                                    t11001(scan);
                                }
                            }
                        }
                        else if (l3==1) {
                            if (l4==0){
                                if (l5==0){
                                    t00101(scan);
                                }
                                else if (l5==1) {
                                    t10101(scan);
                                }
                            }
                            else if (l4==1) {
                                if (l5==0){
                                    t01101(scan);
                                }
                                else if (l5==1) {
                                    t11101(scan);
                                }
                            }
                        }
                    }
                    else if (l2==1) {
                        if (l3==0){
                            if (l4==0){
                                if (l5==0){
                                    t00011(scan);
                                }
                                else if (l5==1) {
                                    t10011(scan);
                                }
                            }
                            else if (l4==1) {
                                if (l5==0){
                                    t01011(scan);
                                }
                                else if (l5==1) {
                                    t11011(scan);
                                }
                            }
                        }
                        else if (l3==1) {
                            if (l4==0){
                                if (l5==0){
                                    t00111(scan);
                                }
                                else if (l5==1) {
                                    t10111(scan);
                                }
                            }
                            else if (l4==1) {
                                if (l5==0){
                                    t01111(scan);
                                }
                                else if (l5==1) {
                                    t11111(scan);
                                    con=0;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (exp==1){
            System.out.println("You die because the bomb explosion, remember, follow the guidebook.");
            if (task3t==0&&achievement-achievement%100==0||task3t==0&&achievement-achievement%100==100||task3t==0&&achievement-achievement%100==400){
                achievement=achievement+200;
                System.out.println("*\nYou got the achievement Kill Assist");
            }
            task3t=task3t+1;
        }
        else {
            System.out.println("You dismantle the bomb successfully");
            System.out.println("\n" +
                    "\n" +
                    " _____         _    _____   _____ _       _     _     \n" +
                    "|_   _|_ _ ___| | _|___ /  |  ___(_)_ __ (_)___| |__  \n" +
                    "  | |/ _` / __| |/ / |_ \\  | |_  | | '_ \\| / __| '_ \\ \n" +
                    "  | | (_| \\__ \\   < ___) | |  _| | | | | | \\__ \\ | | |\n" +
                    "  |_|\\__,_|___/_|\\_\\____/  |_|   |_|_| |_|_|___/_| |_|\n" +
                    "\n");
            if (task3t==0&&achievement-achievement%100==0||task3t==0&&achievement-achievement%100==200||task3t==0&&achievement-achievement%100==500){
                System.out.println("*\nYou get the achievement Advanced Engineer");
                achievement=achievement+100;
            }
            task3t=task3t+1;
        }
        System.out.println("Press anykey to continue.");
        anykey=scan.next();
    }

    private static void conclusion(Scanner scan) {

        System.out.println("you have done the game, good job.");
    }

    public static void introduction(Scanner scan) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(" ____        _   _   _              _                    \n" +
                "| __ )  __ _| |_| |_| | ___    __ _| |__   _____   _____ \n" +
                "|  _ \\ / _` | __| __| |/ _ \\  / _` | '_ \\ / _ \\ \\ / / _ \\\n" +
                "| |_) | (_| | |_| |_| |  __/ | (_| | |_) | (_) \\ V /  __/\n" +
                "|____/ \\__,_|\\__|\\__|_|\\___|  \\__,_|_.__/ \\___/ \\_/ \\___|\n" +
                "| __ ) _ __(_) |_(_)___| |__                             \n" +
                "|  _ \\| '__| | __| / __| '_ \\                            \n" +
                "| |_) | |  | | |_| \\__ \\ | | |                           \n" +
                "|____/|_|  |_|\\__|_|___/_| |_|                           \n" +
                "\n");

        System.out.println("1.Nightfall");
        if (process%100%10==6||process%100%10==8)
            timesa=1;
        System.out.println("2.Eagle Day");
        if (timesa==0)
            System.out.println(" (Not available now)\n");
        System.out.println("3.Aftermath");
        if (process%100>9&&process<50)
            timesb=1;
        if (timesb==0)
            System.out.println(" (Not available now)\n");
        System.out.println("\n\n4. Show the achieve  "+"5.Save the game"+"   6.Restore the game"+"   7.Test mode(all task will be available)" +
                "\n8.Exit the game");
        System.out.println("select the task and enter its number\nRemember, in all any key step, press q or Q to quit " +
                "the task and back to menu.");

        int select = scan.nextInt();
        if (select == 1)
            task1(scan);
        else if (select == 2) {
            if (timesa==0){
                System.out.println("Not able, win task1 to make it available.");
                System.out.println("Press any key");
                anykey = scan.next();
            }
            else {
                task2(scan);
            }
        }
        else if (select == 3) {
            if (timesb==0) {
                System.out.println("Not able, win task2 to make it available.");
                System.out.println("Press any key");
                anykey = scan.next();
            }
            else {
                timesb = 1;
                task3(scan);
            }
        }
        else if (select == 4) {
            Achievement(scan);
        }
        else if (select == 5) {
            System.out.println("Your game code is "+(process+achievement*1000)+", enter that in selection 6 to continue your game");
            System.out.println("Press any key");
            anykey=scan.next();
        }
        else if (select == 6) {
            System.out.println("Enter your game code");
            int num = scan.nextInt();
            process=num%1000;
            achievement=(num-num%1000)/1000;
        }
        else if (select == 7) {
            process = 7117;
        }
        else if (select == 8) {
            con = 0;
        }
    }

    public static void task1finish(Scanner scan){
        System.out.println("\n" +
                "\n" +
                " _____         _      _   _____ _       _     _     \n" +
                "|_   _|_ _ ___| | __ / | |  ___(_)_ __ (_)___| |__  \n" +
                "  | |/ _` / __| |/ / | | | |_  | | '_ \\| / __| '_ \\ \n" +
                "  | | (_| \\__ \\   <  | | |  _| | | | | | \\__ \\ | | |\n" +
                "  |_|\\__,_|___/_|\\_\\ |_| |_|   |_|_| |_|_|___/_| |_|\n" +
                "\n");
        //https://www.asciiart.eu/text-to-ascii-art
    }
    public static void testflight(Scanner scan){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        process=process-(process-process%10)%100;
        double planea=100;
        double planeb=100;
        String con = "y";
        int i = 0;
        if (task2con==1) {
            System.out.println("                          XXX                         XXXXXXXX    Ammo:480      \n" +
                    "                      XXXXX  XXXXXXXXXXXXXXXXXXXXXXXXX       XXX                \n" +
                    "                  XXXXX      X                       X         XX               \n" +
                    "          XXXXXXXXX          X                       X           XXX            \n" +
                    "      XXXX                   X                       X             XXXXXXXX     \n" +
                    "    XXX                      X                       X                    XXX   \n" +
                    "    X                        X                       X                      XXX \n" +
                    "   XX                        X XXXXXXXXXXXXXXXXXXXXX X                        X \n" +
                    "  XX                         X X        XX         X X                        X \n" +
                    " XX                          X X        XX         X X                        X \n" +
                    "XX                           X X      XXXXXX       X X                        XX\n" +
                    "X                            X XXXXX X      X XXXXXX X                         X\n" +
                    "                             X XXXXX X     X  XXXXXX X                          \n" +
                    "                             X X       X  X        X X                          \n" +
                    "                             X X        XX         X X                          \n" +
                    "                             X X        XX         X X                          \n" +
                    "                             X XXXXXXXXXXXXXXXXXXXXX X                          \n" +
                    "                             XXX                   XXXX                         \n" +
                    "                          XXXX                        XXX                       \n" +
                    "                        XXX                             XXXX                    \n" +
                    "                     XXXX                                  XXXX                 \n" +
                    "                  XXXX                                         XXX              \n" +
                    "                XXX                                              XXX            \n" +
                    "              XXX                                                  XXXX         ");
            System.out.println("This is your cabin, on the middle there is a sight ring. On the right top \n" +
                    "there is your ammo. You got 480 bullet for auto cannon, but don't waste it, it's not a \n" +
                    "large number for four cannon.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Remember, the velocity of cannon bullets are slow compare to the speed of \n" +
                    "plane and its distance, so make sure you aim the path of enemy aircraft to be passed \n" +
                    "instead aircraft itselves. ");
            System.out.println("               XXXXXXXXXXXXX               \n" +
                    "          XXXXX      X      XXXXX          \n" +
                    "        XX           X           XX        \n" +
                    "      XX             X             XX      \n" +
                    "    XX               X     XX        XX    \n" +
                    "   X                 X      XXX        X   \n" +
                    "  X                  X    XXXXXX        X  \n" +
                    " X             XX    X  XXXXXXXXX        X \n" +
                    "X               XX   X XXXXXX   X         X\n" +
                    "X                XX XXXXXXX               X\n" +
                    "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                    "X              XX XXXX                    X\n" +
                    "X             XX XXXXX                    X\n" +
                    " X           XXXXX   XX                  X \n" +
                    "  X          XXX     XXXX               X  \n" +
                    "   X                 X XXX             X   \n" +
                    "    XX               X   X           XX    \n" +
                    "      XX             X             XX      \n" +
                    "        XX           X           XX        \n" +
                    "          XXXXX      X      XXXXX          \n" +
                    "               XXXXXXXXXXXXX               ");
            System.out.println("This is not correct, do not aim the plane directly, that's wasting ammo.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Press any key to continue");
            anykey=scan.next();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Now is the correct example.");
            System.out.println("                                             XX           Ammo=480\n" +
                    "               XXXXXXXXXXXXX       XXXX       XX X    \n" +
                    "          XXXXX      X      XXXXX     XX     XXXXXX   \n" +
                    "        XX           X           XX    XX   XXXXX XXX \n" +
                    "      XX             X             XX    XXXXXX      X\n" +
                    "    XX               X               XXXXXXXX         \n" +
                    "   X                 X                 XXX  XX        \n" +
                    "  X                  X                  X    XXX      \n" +
                    " X                   X                   X     XX     \n" +
                    "X                    X                    X     X     \n" +
                    "X                    X                    X           \n" +
                    "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX           \n" +
                    "X                    X                    X           \n" +
                    "X                    X                    X           \n" +
                    " X                   X                   X            \n" +
                    "  X                  X                  X             \n" +
                    "   X                 X                 X              \n" +
                    "    XX               X               XX               \n" +
                    "      XX             X             XX                 \n" +
                    "        XX           X           XX                   \n" +
                    "          XXXXX      X      XXXXX                     \n" +
                    "               XXXXXXXXXXXXX                          ");
            System.out.println("Aim the path plane is going to pass, the deflection you need to choose depends on \n" +
                    "You distance, your speed and your gun. Normally you can just follow your hunch to shoot.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("1.Start the task\n2.Redo the training\nOther number to return the menu");
            int choise = scan.nextInt();
            if (choise == 1) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            } else if (choise == 2)
                testflight(scan);
            else {
                System.out.println("You will back to menu");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                con="n";
            }
        }
        while (con.equals("y")&&i==0) {
            fight1(scan);
            System.out.println("Choose your shooting window.");
            anykey = scan.next();
            if (anykey.equals("1")) {
                System.out.println("You hit him!");
                planea = planea - Math.random() * 70 - 50;
            } else
                System.out.println("You missed");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Enemy shoot");
            if (Math.random() > 0.5) {
                System.out.println("Enemy hit!");
                planeb = planeb - Math.random() * 70 - 50;
            } else
                System.out.println("Enemy missed");
            System.out.println("Your hp is " + planeb + "\nYour enemy's hp is " + planea);
            if (planeb < 0) {
                process = process + 50;
                System.out.println("You been shoot down. Try this task again.");
                if ((achievement - achievement % 10) % 100 == 0 || (achievement - achievement % 10) % 100 == 10 ||
                        (achievement - achievement % 10) % 100 == 40 || (achievement - achievement % 10) % 100 == 50) {
                    achievement = achievement + 20;
                    System.out.println("You got the achievement:Jinx");
                }
                con="n";
            } else if (planea < 0) {
                process = process + 10;
                System.out.println("You shoot down enemy plane. ");
                if ((achievement - achievement % 10) % 100 == 0 || (achievement - achievement % 10) % 100 == 20 ||
                        (achievement - achievement % 10) % 100 == 40 || (achievement - achievement % 10) % 100 == 60) {
                    achievement = achievement + 10;
                    System.out.println("You got the achievement:Airborne Sniper");
                }
                con="n";
            }
            System.out.println("Press any key to continue");
            anykey = scan.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            i++;
        }

        while (con.equals("y")&&i==1) {
            fight2(scan);
            System.out.println("Choose your shooting window.");
            anykey = scan.next();
            if (anykey.equals("3")) {
                System.out.println("You hit him!");
                planea = planea - Math.random() * 70 - 50;
            } else {
                System.out.println("You missed");
                System.out.println("Remember, the deflection you choose need to increase by the distance of your and enemy.");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Enemy shoot");
            if (Math.random() > 0.5) {
                System.out.println("Enemy hit!");
                planeb = planeb - Math.random() * 70 - 50;
            } else
                System.out.println("Enemy missed");
            System.out.println("Your hp is " + planeb + "\nYour enemy's hp is " + planea);
            if (planeb < 0) {
                process = process + 50;
                System.out.println("You been shoot down. Try this task again.");
                con="n";
            } else if (planea < 0) {
                System.out.println("You win this time, average royal airforce pilot.");
                process = process + 20;
                con="n";
            }
            System.out.println("Press any key to continue");
            anykey = scan.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            i++;
        }

        while (con.equals("y")&&i==2) {
            fight3(scan);
            System.out.println("Choose your shooting window.");
            anykey = scan.next();
            if (anykey.equals("2")) {
                System.out.println("You hit him!");
                planea = planea - Math.random() * 70 - 50;
            } else {
                System.out.println("You missed");
                System.out.println("Remember, the deflection you choose need to increase by the distance of your and enemy.");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Enemy shoot");
            if (Math.random() > 0.5) {
                System.out.println("Enemy hit!");
                planeb = planeb - Math.random() * 70 - 50;
            } else
                System.out.println("Enemy missed");
            System.out.println("Your hp is " + planeb + "\nYour enemy's hp is " + planea);
            if (planeb < 0) {
                process = process + 50;
                System.out.println("You been shoot down. Try this task again.");
                con="n";
            } else if (planea < 0) {
                System.out.println("You win this time, average royal airforce pilot.");
                process = process + 30;
                con="n";
            }
            System.out.println("Press any key to continue");
            anykey = scan.next();
            i++;
        }

        while (con.equals("y")&&i==3) {
            fight4(scan);
            System.out.println("Choose your shooting window.");
            anykey = scan.next();
            if (anykey.equals("1")) {
                System.out.println("You hit him!");
                planea = planea - Math.random() * 70 - 50;
            } else {
                System.out.println("You missed");
                System.out.println("Remember, the deflection you choose need to increase by the distance of your and enemy.");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Enemy shoot");
            if (Math.random() > 0.5) {
                System.out.println("Enemy hit!");
                planeb = planeb - Math.random() * 70 - 50;
            } else
                System.out.println("Enemy missed");
            System.out.println("Your hp is " + planeb + "\nYour enemy's hp is " + planea);
            if (planeb < 0) {
                process = process + 50;
                System.out.println("You been shoot down. Try this task again.");
                con="n";
            } else if (planea < 0) {
                System.out.println("You win this time, average royal airforce pilot.");
                process = process + 40;
                con="n";
            }
            System.out.println("You are out of ammo, mission failed.");
            process = process + 50;
            if ((achievement - achievement % 10) % 100 == 0 || (achievement - achievement % 10) % 100 == 10 ||
                    (achievement - achievement % 10) % 100 == 20 || (achievement - achievement % 10) % 100 == 30) {
                achievement = achievement + 40;
                System.out.println("You got the achievement:Cadet");
            }
            System.out.println("Press any key to continue");
            anykey = scan.next();
            con="n";
        }

    }
    public static void fight1(Scanner scan){
        System.out.println("                                XXX        XX    ammo=480\n" +
                "                                XX X    XXXXXXX  \n" +
                "                                 XX X XXXXXXX XXX\n" +
                "                                  XXXXXXX       X\n" +
                "                                 XXXXX X         \n" +
                "                            X   XX   XX          \n" +
                "                            X         XXXX       \n" +
                "    XXXXXXX         XXX     X           XX       \n" +
                "  XX       XX         X     X            XX      \n" +
                " X       XXX X      XXX     X                    \n" +
                "X          X  X     X                            \n" +
                "X      X XXX  X     XXX                          \n" +
                "X          X  X                                  \n" +
                " X       XXX X                                   \n" +
                "  XX       XX                                    \n" +
                "    XXXXXXX                                      ");
        //https://www.asciiart.eu/image-to-ascii
    }
    public static void fight2(Scanner scan){
        System.out.println("                                         XXXXXXX   ammo:360 \n" +
                "                                       XX       XX  \n" +
                "                                      X           X \n" +
                "                                     X      X      X\n" +
                "                       XXXX          X     XXX     X\n" +
                "                          X          X      X      X\n" +
                "                       XXXX           X           X \n" +
                "                XXXX      X            XX       XX  \n" +
                "                   X   XXXX              XXXXXXX    \n" +
                "                XXXX                                \n" +
                "           X    X                                   \n" +
                "           X    XXXX                                \n" +
                " XX        X                                        \n" +
                "  XX  XX   X                                        \n" +
                "X  XXXX    X                                        \n" +
                " XXXXX                                              \n" +
                "  X  XX                                             \n" +
                "      XX                                            ");
        //https://www.asciiart.eu/image-to-ascii
    }
    public static void fight3(Scanner scan){
        System.out.println("    X                                             ammo:240     \n" +
                " XXX                                                   \n" +
                " XXXXX         XXX                                     \n" +
                "XX XXXXX    XXXXX                                      \n" +
                "     XXXXXXXXXX                                        \n" +
                "        XXXXXX     X                                   \n" +
                "       XXXXX XXX   X                                   \n" +
                "     XXXXX         X     XXXX                          \n" +
                "     XXX           X        X                          \n" +
                "                   X     XXXX                          \n" +
                "                         X       XXX                   \n" +
                "                         XXXX      X        XXXXXXX    \n" +
                "                                 XXX      XX       XX  \n" +
                "                                   X     X           X \n" +
                "                                 XXX    X      X      X\n" +
                "                                        X     XXX     X\n" +
                "                                        X      X      X\n" +
                "                                         X           X \n" +
                "                                          XX       XX  \n" +
                "                                            XXXXXXX    ");
        //https://www.asciiart.eu/image-to-ascii
    }
    public static void fight4(Scanner scan){
        System.out.println("XXX                  XXXX               ammo:120   \n" +
                " XXXX               XXXX                   \n" +
                "  XXXX           XXXXX                     \n" +
                "   XXXX         XXXX                       \n" +
                "    XXXXX     XXXXX                        \n" +
                "      XXXXX  XXXX                          \n" +
                "       XXXXXXXXX                           \n" +
                "        XXXXXX                             \n" +
                "        XXXXXXX                            \n" +
                "      XXXXX  XX                            \n" +
                "    XXXXXX         X                       \n" +
                "  XXXXXX           X                       \n" +
                " XXXXX             X                       \n" +
                "XXX                X                       \n" +
                "XX                 X   XXXXXX              \n" +
                "                            X       XXXXX  \n" +
                "                       XXXXXX      X     X \n" +
                "                       X          X   X   X\n" +
                "                       XXXXXX      X     X \n" +
                "                                    XXXXX  ");
        //https://www.asciiart.eu/image-to-ascii
    }
    public static void emp(Scanner scan){

    }
    public static void Achievement(Scanner scan){
        int num = 0;
        if (achievement-achievement%100==100||achievement-achievement%100==200||achievement-achievement%100==400)
            num=1;
        else if (achievement-achievement%100==300||achievement-achievement%100==500||achievement-achievement%100==600)
            num=2;
        else if (achievement-achievement%100==700)
            num=3;
        if (achievement%100-achievement%10==10||achievement%100-achievement%10==20||achievement%100-achievement%10==40)
            num=num+1;
        else if (achievement%100-achievement%10==30||achievement%100-achievement%10==50||achievement%100-achievement%10==60)
            num=num+2;
        else if (achievement%100-achievement%10==70)
            num=num+3;
        if (achievement%10==1||achievement%10==2||achievement%10==4)
            num=num+1;
        else if (achievement%10==3||achievement%10==5||achievement%10==6)
            num=num+2;
        else if (achievement%10==7)
            num=num+3;
        int conA = 1;
        while (conA==1) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("1.Knights of old\n2.Live for fight another day\n3.Flee in a dilemma\n4.Jinx" +
                    "\n5.Airborne Sniper\n6.Cadet\n");
            System.out.println("Achievement(" + num + "/9)");
            System.out.println("Show detail by enter the number.");
            System.out.println("press q for quit");
            String choise = scan.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if (choise.equals("q"))
                conA=0;
            else if (choise.equals("1")) {
                if (achievement%10==1||achievement%10==3||achievement%10==5||achievement%10==7)
                    System.out.println("You have the spirit of chivalry, but this is World War II, an evil and brutal war.");
                else
                    System.out.println("You can get it in task 1");
                System.out.println("Press any key to continue.");
            }
            else if (choise.equals("2")) {
                if (achievement % 10 == 2 || achievement % 10 == 3 || achievement % 10 == 6 || achievement % 10 == 7)
                    System.out.println("You survive from the Germany plane, not bright and shiny but at least it saves your life.");
                else
                    System.out.println("You can get it in task 1");
                System.out.println("Press any key to continue.");
            }
            else if (choise.equals("3")) {
                if (achievement % 10 == 4 || achievement % 10 == 5 || achievement % 10 == 6 || achievement % 10 == 7)
                    System.out.println("Although it wasn't a good battle, you finish your mission, got message back");
                else
                    System.out.println("You can get it in task 1");
                System.out.println("Press any key to continue.");
            }
        }
    }
    //terms under are materials, logically are not code.
    public static void plane1(Scanner scan){
        System.out.println("                 `··``´   `                                                                     ´`  \n" +
                "                        `                                                                           \n" +
                "                                                                                                    \n" +
                "´ ` ``                                           `                                   `´´```  `    ``\n" +
                "   `´`¨`                                                                          `` `````          \n" +
                "      ´``´        ˆ:····´´¨…`¨¨´ `                                                         `        \n" +
                "       ¸·©LùCI¬‘¸´ `´´·˜·ˆ…’…ˆ¨ˆ·   ```                                                             \n" +
                "   ’       ´``` ’CV‰s½½¢òÌ‰sÌn3Y¨·i¦³¬“°;ˆ¸’‚ˆ˜¨´`´·…´´`´ ```                              ´        \n" +
                "               `´¸› …´  a’     …300±üOµµxOx6e4¾f5™©Í0£wL£££@r×–:…`   ```´·´¨´¨·´´                   \n" +
                "                 ·ˆ    `@;     ´’°t3ç™Sy©åe¢ãè2ôžó5õüü&&22ü&üüç©Yùµ£a0ç2w©©üüüüüçw©£©56‚´ º       ·°\n" +
                "                 l¸    ˜’  ¨ ``  ¨’“À‹¯o2®PFüš€pˆ…`´`’‚˜…¸…¸·…  …´·„O“¨´…3©4xõ54Ox¾4O54¾xµ¾‹        \n" +
                "                 Ì…    s      ´`  h³£&ù£ù¾xõ44Àg¥¸·`´       ```    ¨y````a            `             \n" +
                "                ´0     ™          ÷¹ÇÇUïŸO66ŸbÀÝv         `¨`  …<n¼2=    ú                          \n" +
                "       ¨…¨…¨     <   ` C  ``·    ·~s¿/!1+‡9È$Vpý`  `ä±¨   ´……/IrƒJCíí·  ¯÷                         `\n" +
                "       ´¨wª˜’³¨`*¨   `·@       ``´ª6ª”*+f¼ÄÚm§´       ´…¸ˆ±šûžPÀpø¶‰ÙÚn’~ºˆ……·                     `\n" +
                "             ·ˆ`O5¯„}l}½’```     za}%~!„yw|[–¼            …·´±9ñá¶ü©4…–tj§9ŸÝûäû                   `\n" +
                "                ¬“»i^*8ëåj¿¾xƒóDnnV!||/¦ü÷+”)J            ´‘%ú¾TµÎçwç   ½¨· ¨`                   ``·\n" +
                "            ´•w«©§ÿÓ9(»¿r—%ókûõ0ÀœÎVYTö¤5™9×?j’…´´       ’¸…saç5¾aÍ0»   V   `                `    ``\n" +
                "            ¨`³D¶ƒ°’*JzÏjºº²³‹*‰/>Ýç5àfh¶ŠâG¶€ãppÕêÛÔ8FUs×~º~«?i*/í)` ²Ìn˜´```                      \n" +
                "`´             ·¸suoct<L<ìíIoOŠñzCòÍ$µ5UbÒÓÒbññ¾3Íò‰uµkÏnnú4SDZëbñÓŸ¥DFýdýÓÒDá$øXC/´°´·             \n" +
                "`                b¢½‡=>w>iïtoIt¤s3CwêBWOÿñàkžžŸù½uJ½z1=‰uò¢±‡©t&š9?     ´ ´`´˜…·…°’¸…3ôx§Z          \n" +
                "´                ˜Yáÿï<î7ï=llƒjsò±Yùa4ôÎ‡vÇTy6ùü†°;›ˆ:°´`´`  ¨`óú³7aÒ²¨²·…‚                         \n" +
                "`                ¨“ªVíJÇëµº/¯»z%Cóz>¦º„“÷;’¸¨``    `´          ˜èÕ¥ó:’¹¹;˜~  ‚…’…‚´      `    ˜     \n" +
                "                    `````  ¨````````                                                   `            \n" +
                "                 ```   `   ¨````````                                                                \n" +
                "                           ´```   ```                                                               \n" +
                "                                    ´´´`````````  ```  ¨¨´´´´´´`` ``` `````    `                    \n" +
                "                                               ```     ´´·¨´       ```  ```                       ` \n" +
                "                                                        ```´´´¨`` ``   ` `     `                `` `\n" );
        //https://www.asciiart.eu/image-to-ascii11
    }
    public static void coast(Scanner scan){
        System.out.println("                                                   X                            \n" +
                "           X X  X                         X   X                      X   X      \n" +
                "         X                                       X                     X   X    \n" +
                "             X   X                         X   X                                \n" +
                "           X                                        X                           \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "XXXXXXXXXXXXXX                                                                  \n" +
                "             XXXXXXXXXXX                                                        \n" +
                "                       XXXXXXXX                                                 \n" +
                "                              XXXXXXXXXXXXX                                     \n" +
                "                                          XXXXXXXXXXXXXX                        \n" +
                "XXXXX                                                  XXXXXXXXX                \n" +
                "X   XXXXXXX                                                    XXXXX            \n" +
                "          XXXXXXXX                                                 XXXXX        \n" +
                "   XXXXX         XXXXXXXX                                              XXXXX    \n" +
                "       XX               XXXXXXXXXX                                          XXXX\n" +
                "     XXXXXXXXX                   XXXXXXXXX                                     X\n" +
                " XXX   XXX   XXXX    X                    XXXXXXXXXXXXXXX                       \n" +
                "XX XX    XXX    X    XXXX                               XXXXXXXXXXX XX          \n" +
                "    XXX    XXXX         XXXX                                         XXX        ");
        //https://www.asciiart.eu/ascii-draw-studio/app
    }
    public static void coastplane(Scanner scan){
        System.out.println("░░░░░░░░░▒░░░░░░░░░░░░░░▒▒▒▒░▒▒▒░▒░░░▒░▒▒░▒░▒▒░▒▒░▒▒▒▒▒▒░▒░▒░░░░░░░░░▒░░░░░▒▒▒▒▒▒▒▒░░░▒▒▒░▒▒░▒░▒░░▒░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓█▓▓▓▒▓▓███▓▒▓▓▓▓▒▒▓▓▓▓▓▓▓░▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓░████▓▓█▓▒▓▒█▓▓▓▓▓▓▒▓▓▓▓▓▓█░░▒▓░░▓▒▒▓▒▓▒▓░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▒░█▓█▓█████▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▒▒▒▒▓▒▓▒▒▒▓▒▒▒░░██▓▓▓░░░░░░░░░░░░░░░\n" +
                "▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓█▓█▓▒▒█▓▓▓▓▓▓▓▓▓▓▒▒▒▓▒▓▒▒▓▒▒▒▒▒███▒▒▓░░░░░░░░░░░░░░░\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓█▓▓▓▒█▒▒▒▒▓▓▓▓▓▓▓▓▓▒░▒▒▒▒▒▒▒▒█▓█▒▒▓▓▓░▒▒▓░░░░░░░░░░\n" +
                "▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▒▓▓▓▓▓▓▓▓▓▓█░░▒██▓▒▒▓▒▒▒▒▒░░░░▒░▒▒▒▒▒▓▒▒▒▒░▓██▓███████▒▒▒▒▒░▓▒░░░░░\n" +
                "▓▓▓▓▒▓▒▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▒▓▓▓▓▒░▓█▓▓▓▓█▓█▓▓▓██████▒▒█▓▓█████████████▓▓▒▒██▓▒▒▒░▒░░░▒▒▒▒▒▒\n" +
                "▓▓▒▓▒▒▒▓▓▒▓▓██▓▒▒▒▒▓▒▒▒▓░▓▓▓▓▒█▒░░▒▒▒▒▒▒██████▒▓▒▓███████▒▓█▓█▓█▓█▒▒▓▓▓▒▓█▒██▓▓█▓▒█▒▒░░░▒▒▒▒▒▒░░░░░░\n" +
                "▒▒▒▒▒▒▒▓▓▓▒███▓▒░▒▒▓░░░█▓░▒░▒▓▒▓█████████▓███▓▓▓▓▓▓█▓▓█▓▓█▒▓▓▓████████▓█▒▒▓▓▓▓█▒▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▓▒▒▒▒▒░▒░▒▒██░░░░░▒▒░▒▒▓▓▓▒█▒▓██▓▓▒▓██▒█▓▓█▓▓▓█▓▓▓█▓█▓▓█▓▒▓▓▒█░░█░▓▓▓▓▓▓▒▓▓█▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▓▓▓▓▓▓▓▓▒▓▓▒▓█▓▓█▒▓▓██████▓▓▓█▓▓▓▓▓██▓███▓█▓▓▓█▓▓▓▓▓▒▒▓▓▓▓▒▓▓▒▓▓██░▒▓▓▓▓▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▓▒▒▓▓▒▓▓▓▓▓▓████▒███████▓█▓▓█▒▒▓▓▓▓▓▒▒███████▒███▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒▒▒▒▒▒▓▒█████▓▓▓█▓███▓▓▒█▒█▒▒░██▓█▒█▓█▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒░█▓▓██▒▓▓▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒▒▒▒▒▓▓▓█▓███████▓▓▓█▓▓▒▓██▓█▓▓▓██▓▓▓▓░████▓███▒█▓██▓▓█▓██▓▓█▓▓▓▓▓▓▓░▒▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▒▓▓▓██▓░▒▒▒▓▒\n" +
                "▓▒▓▓▒▒▓▓▓██▓▓▓▓█████▒░▒▒▒▒▒▒▓▓█▓▓▓▓▒█▓░██████████▒█▓▓▒▓▒▓▓▓▒▒▒▒▒▒▒▒▓▒▓▓▓▓▒▓▓▒▓▓▒▒▒▒▒▓▓▓▒▓▓▒▒▒▓▒▓▓▓▓▓\n" +
                "▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███████▒▒▒▒▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▓▓▒▓▓▒▓▓▓▓▓▒▓▓▓▓▓▓\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▒▒▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        //https://www.asciiart.eu/image-to-ascii
    }
    public static void t00000(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X#####|                                                  |/////X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X#####|                                                  ||||||X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X%%%%%|                                                  ||||||X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t00001(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------ ***                                              ------X\n" +
                "X          ***                                                 X\n" +
                "X------       ****                                       ------X\n" +
                "X#####|           ***                                    |/////X\n" +
                "X------              ***                                 ------X\n" +
                "X                       ***                                    X\n" +
                "X------                    ***                           ------X\n" +
                "X#####|                       ****                       ||||||X\n" +
                "X------                           ***                    ------X\n" +
                "X                                    ***                       X\n" +
                "X------                                 ***              ------X\n" +
                "X%%%%%|                                    ***           ||||||X\n" +
                "X------                                       ****       ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                              *** ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t00010(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X#####*******                                            |/////X\n" +
                "X------      *************                               ------X\n" +
                "X                         ************                         X\n" +
                "X------                               *************      ------X\n" +
                "X#####|                                            *******|||||X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X%%%%%|                                                  ||||||X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t00011(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------ ***                                              ------X\n" +
                "X          ***                                                 X\n" +
                "X------       ****                                       ------X\n" +
                "X#####*******     ***                                    |/////X\n" +
                "X------      *************                               ------X\n" +
                "X                       **************                         X\n" +
                "X------                    ***        *************      ------X\n" +
                "X#####|                       ****                 *******|||||X\n" +
                "X------                           ***                    ------X\n" +
                "X                                    ***                       X\n" +
                "X------                                 ***              ------X\n" +
                "X%%%%%|                                    ***           ||||||X\n" +
                "X------                                       ****       ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                              *** ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t00100(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X#####|                                                  |/////X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X#####*******                                            ||||||X\n" +
                "X------      *************                               ------X\n" +
                "X                         ************                         X\n" +
                "X------                               *************      ------X\n" +
                "X%%%%%|                                            *******|||||X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t00101(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------ ***                                              ------X\n" +
                "X          ***                                                 X\n" +
                "X------       ****                                       ------X\n" +
                "X#####|           ***                                    |/////X\n" +
                "X------              ***                                 ------X\n" +
                "X                       ***                                    X\n" +
                "X------                    ***                           ------X\n" +
                "X#####*******                 ****                       ||||||X\n" +
                "X------      *************        ***                    ------X\n" +
                "X                         **************                       X\n" +
                "X------                               *************      ------X\n" +
                "X%%%%%|                                    ***     *******|||||X\n" +
                "X------                                       ****       ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                              *** ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t00110(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X#####*******                                            |/////X\n" +
                "X------      *************                               ------X\n" +
                "X                         ************                         X\n" +
                "X------                               *************      ------X\n" +
                "X#####*******                                      *******|||||X\n" +
                "X------      *************                               ------X\n" +
                "X                         ************                         X\n" +
                "X------                               *************      ------X\n" +
                "X%%%%%|                                            *******|||||X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t00111(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------ ***                                              ------X\n" +
                "X          ***                                                 X\n" +
                "X------       ****                                       ------X\n" +
                "X#####*******     ***                                    |/////X\n" +
                "X------      *************                               ------X\n" +
                "X                       **************                         X\n" +
                "X------                    ***        *************      ------X\n" +
                "X#####*******                 ****                 *******|||||X\n" +
                "X------      *************        ***                    ------X\n" +
                "X                         **************                       X\n" +
                "X------                               *************      ------X\n" +
                "X%%%%%|                                    ***     *******|||||X\n" +
                "X------                                       ****       ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                              *** ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t01000(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X#####|                                               ****/////X\n" +
                "X------                                         ******   ------X\n" +
                "X                                         ******               X\n" +
                "X------                            *******               ------X\n" +
                "X#####|                      ******                      ||||||X\n" +
                "X------               *******                            ------X\n" +
                "X               ******                                         X\n" +
                "X------   ******                                         ------X\n" +
                "X%%%%%****                                               ||||||X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t01001(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------ ***                                              ------X\n" +
                "X          ***                                                 X\n" +
                "X------       ****                                       ------X\n" +
                "X#####|           ***                                 ****/////X\n" +
                "X------              ***                        ******   ------X\n" +
                "X                       ***               ******               X\n" +
                "X------                    ***     *******               ------X\n" +
                "X#####|                      ******                      ||||||X\n" +
                "X------               *******     ***                    ------X\n" +
                "X               ******               ***                       X\n" +
                "X------   ******                        ***              ------X\n" +
                "X%%%%%****                                 ***           ||||||X\n" +
                "X------                                       ****       ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                              *** ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t01010(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X#####*******                                         ****/////X\n" +
                "X------      *************                      ******   ------X\n" +
                "X                         ************    ******               X\n" +
                "X------                            ****************      ------X\n" +
                "X#####|                      ******                *******|||||X\n" +
                "X------               *******                            ------X\n" +
                "X               ******                                         X\n" +
                "X------   ******                                         ------X\n" +
                "X%%%%%****                                               ||||||X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t01011(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------ ***                                              ------X\n" +
                "X          ***                                                 X\n" +
                "X------       ****                                       ------X\n" +
                "X#####*******     ***                                 ****/////X\n" +
                "X------      *************                      ******   ------X\n" +
                "X                       **************    ******               X\n" +
                "X------                    ***     ****************      ------X\n" +
                "X#####|                      ******                *******|||||X\n" +
                "X------               *******     ***                    ------X\n" +
                "X               ******               ***                       X\n" +
                "X------   ******                        ***              ------X\n" +
                "X%%%%%****                                 ***           ||||||X\n" +
                "X------                                       ****       ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                              *** ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t01100(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X#####|                                               ****/////X\n" +
                "X------                                         ******   ------X\n" +
                "X                                         ******               X\n" +
                "X------                            *******               ------X\n" +
                "X#####*******                ******                      ||||||X\n" +
                "X------      ****************                            ------X\n" +
                "X               ******    ************                         X\n" +
                "X------   ******                      *************      ------X\n" +
                "X%%%%%****                                         *******|||||X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t01101(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------ ***                                              ------X\n" +
                "X          ***                                                 X\n" +
                "X------       ****                                       ------X\n" +
                "X#####|           ***                                 ****/////X\n" +
                "X------              ***                        ******   ------X\n" +
                "X                       ***               ******               X\n" +
                "X------                    ***     *******               ------X\n" +
                "X#####*******                ******                      ||||||X\n" +
                "X------      ****************     ***                    ------X\n" +
                "X               ******    **************                       X\n" +
                "X------   ******                      *************      ------X\n" +
                "X%%%%%****                                 ***     *******|||||X\n" +
                "X------                                       ****       ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                              *** ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t01110(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X#####*******                                         ****/////X\n" +
                "X------      *************                      ******   ------X\n" +
                "X                         ************    ******               X\n" +
                "X------                            ****************      ------X\n" +
                "X#####*******                ******                *******|||||X\n" +
                "X------      ****************                            ------X\n" +
                "X               ******    ************                         X\n" +
                "X------   ******                      *************      ------X\n" +
                "X%%%%%****                                         *******|||||X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                  |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t01111(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------ ***                                              ------X\n" +
                "X          ***                                                 X\n" +
                "X------       ****                                       ------X\n" +
                "X#####*******     ***                                 ****/////X\n" +
                "X------      *************                      ******   ------X\n" +
                "X                       **************    ******               X\n" +
                "X------                    ***     ****************      ------X\n" +
                "X#####*******                ******                *******|||||X\n" +
                "X------      ****************     ***                    ------X\n" +
                "X               ******    **************                       X\n" +
                "X------   ******                      *************      ------X\n" +
                "X%%%%%****                                 ***     *******|||||X\n" +
                "X------                                       ****       ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                              *** ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t10000(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                              *** ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                       ****       ------X\n" +
                "X#####|                                    ***           |/////X\n" +
                "X------                                 ***              ------X\n" +
                "X                                    ***                       X\n" +
                "X------                           ***                    ------X\n" +
                "X#####|                       ****                       ||||||X\n" +
                "X------                    ***                           ------X\n" +
                "X                       ***                                    X\n" +
                "X------              ***                                 ------X\n" +
                "X%%%%%|           ***                                    ||||||X\n" +
                "X------       ****                                       ------X\n" +
                "X          ***                                                 X\n" +
                "X------ ***                                              ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t10001(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------ ***                                          *** ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------       ****                            ****       ------X\n" +
                "X#####|           ***                      ***           |/////X\n" +
                "X------              ***                ***              ------X\n" +
                "X                       ***          ***                       X\n" +
                "X------                    ***    ***                    ------X\n" +
                "X#####|                       ****                       ||||||X\n" +
                "X------                    ***    ***                    ------X\n" +
                "X                       ***          ***                       X\n" +
                "X------              ***                ***              ------X\n" +
                "X%%%%%|           ***                      ***           ||||||X\n" +
                "X------       ****                            ****       ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------ ***                                          *** ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t10010(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                              *** ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                       ****       ------X\n" +
                "X#####*******                              ***           |/////X\n" +
                "X------      *************              ***              ------X\n" +
                "X                         **************                       X\n" +
                "X------                           *** *************      ------X\n" +
                "X#####|                       ****                 *******|||||X\n" +
                "X------                    ***                           ------X\n" +
                "X                       ***                                    X\n" +
                "X------              ***                                 ------X\n" +
                "X%%%%%|           ***                                    ||||||X\n" +
                "X------       ****                                       ------X\n" +
                "X          ***                                                 X\n" +
                "X------ ***                                              ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t10011(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------ ***                                          *** ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------       ****                            ****       ------X\n" +
                "X#####*******     ***                      ***           |/////X\n" +
                "X------      *************              ***              ------X\n" +
                "X                       ****************                       X\n" +
                "X------                    ***    *** *************      ------X\n" +
                "X#####|                       ****                 *******|||||X\n" +
                "X------                    ***    ***                    ------X\n" +
                "X                       ***          ***                       X\n" +
                "X------              ***                ***              ------X\n" +
                "X%%%%%|           ***                      ***           ||||||X\n" +
                "X------       ****                            ****       ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------ ***                                          *** ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t10100(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                              *** ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                       ****       ------X\n" +
                "X#####|                                    ***           |/////X\n" +
                "X------                                 ***              ------X\n" +
                "X                                    ***                       X\n" +
                "X------                           ***                    ------X\n" +
                "X#####*******                 ****                       ||||||X\n" +
                "X------      ************* ***                           ------X\n" +
                "X                       **************                         X\n" +
                "X------              ***              *************      ------X\n" +
                "X%%%%%|           ***                              *******|||||X\n" +
                "X------       ****                                       ------X\n" +
                "X          ***                                                 X\n" +
                "X------ ***                                              ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t10101(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------ ***                                          *** ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------       ****                            ****       ------X\n" +
                "X#####|           ***                      ***           |/////X\n" +
                "X------              ***                ***              ------X\n" +
                "X                       ***          ***                       X\n" +
                "X------                    ***    ***                    ------X\n" +
                "X#####*******                 ****                       ||||||X\n" +
                "X------      ************* ***    ***                    ------X\n" +
                "X                       ****************                       X\n" +
                "X------              ***              *************      ------X\n" +
                "X%%%%%|           ***                      ***     *******|||||X\n" +
                "X------       ****                            ****       ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------ ***                                          *** ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t10110(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                              *** ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                       ****       ------X\n" +
                "X#####*******                              ***           |/////X\n" +
                "X------      *************              ***              ------X\n" +
                "X                         **************                       X\n" +
                "X------                           *** *************      ------X\n" +
                "X#####*******                 ****                 *******|||||X\n" +
                "X------      ************* ***                           ------X\n" +
                "X                       **************                         X\n" +
                "X------              ***              *************      ------X\n" +
                "X%%%%%|           ***                              *******|||||X\n" +
                "X------       ****                                       ------X\n" +
                "X          ***                                                 X\n" +
                "X------ ***                                              ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t10111(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------ ***                                          *** ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------       ****                            ****       ------X\n" +
                "X#####*******     ***                      ***           |/////X\n" +
                "X------      *************              ***              ------X\n" +
                "X                       ****************                       X\n" +
                "X------                    ***    *** *************      ------X\n" +
                "X#####*******                 ****                 *******|||||X\n" +
                "X------      ************* ***    ***                    ------X\n" +
                "X                       ****************                       X\n" +
                "X------              ***              *************      ------X\n" +
                "X%%%%%|           ***                      ***     *******|||||X\n" +
                "X------       ****                            ****       ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------ ***                                          *** ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t11000(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                              *** ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                       ****       ------X\n" +
                "X#####|                                    ***        ****/////X\n" +
                "X------                                 ***     ******   ------X\n" +
                "X                                    ***  ******               X\n" +
                "X------                           ********               ------X\n" +
                "X#####|                      ******                      ||||||X\n" +
                "X------               ********                           ------X\n" +
                "X               ******  ***                                    X\n" +
                "X------   ******     ***                                 ------X\n" +
                "X%%%%%****        ***                                    ||||||X\n" +
                "X------       ****                                       ------X\n" +
                "X          ***                                                 X\n" +
                "X------ ***                                              ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t11001(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------ ***                                          *** ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------       ****                            ****       ------X\n" +
                "X#####|           ***                      ***        ****/////X\n" +
                "X------              ***                ***     ******   ------X\n" +
                "X                       ***          ***  ******               X\n" +
                "X------                    ***    ********               ------X\n" +
                "X#####|                      ******                      ||||||X\n" +
                "X------               ********    ***                    ------X\n" +
                "X               ******  ***          ***                       X\n" +
                "X------   ******     ***                ***              ------X\n" +
                "X%%%%%****        ***                      ***           ||||||X\n" +
                "X------       ****                            ****       ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------ ***                                          *** ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t11010(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                              *** ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                       ****       ------X\n" +
                "X#####*******                              ***        ****|||||X\n" +
                "X------      *************              ***     ******   ------X\n" +
                "X                         **************  ******               X\n" +
                "X------                           *****************      ------X\n" +
                "X#####|                      ******                *******|||||X\n" +
                "X------               ********                           ------X\n" +
                "X               ******  ***                                    X\n" +
                "X------   ******     ***                                 ------X\n" +
                "X%%%%%****        ***                                    ||||||X\n" +
                "X------       ****                                       ------X\n" +
                "X          ***                                                 X\n" +
                "X------ ***                                              ------X\n" +
                "X?????**                                                 |?????X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t11011(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------ ***                                          *** ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------       ****                            ****       ------X\n" +
                "X#####*******     ***                      ***        ****/////X\n" +
                "X------      *************              ***     ******   ------X\n" +
                "X                       ****************  ******               X\n" +
                "X------                    ***    *****************      ------X\n" +
                "X#####|                      ******                *******|||||X\n" +
                "X------               ********    ***                    ------X\n" +
                "X               ******  ***          ***                       X\n" +
                "X------   ******     ***                ***              ------X\n" +
                "X%%%%%****        ***                      ***           ||||||X\n" +
                "X------       ****                            ****       ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------ ***                                          *** ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t11100(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                              *** ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                       ****       ------X\n" +
                "X#####|                                    ***        ****/////X\n" +
                "X------                                 ***     ******   ------X\n" +
                "X                                    ***  ******               X\n" +
                "X------                           ********               ------X\n" +
                "X#####*******                ******                      ||||||X\n" +
                "X------      *****************                           ------X\n" +
                "X               ******  **************                         X\n" +
                "X------   ******     ***              *************      ------X\n" +
                "X%%%%%****        ***                              *******|||||X\n" +
                "X------       ****                                       ------X\n" +
                "X          ***                                                 X\n" +
                "X------ ***                                              ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t11101(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------ ***                                          *** ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------       ****                            ****       ------X\n" +
                "X#####|           ***                      ***        ****/////X\n" +
                "X------              ***                ***     ******   ------X\n" +
                "X                       ***          ***  ******               X\n" +
                "X------                    ***    ********               ------X\n" +
                "X#####*******                ******                      ||||||X\n" +
                "X------      *****************    ***                    ------X\n" +
                "X               ******  ****************                       X\n" +
                "X------   ******     ***              *************      ------X\n" +
                "X%%%%%****        ***                      ***     *******|||||X\n" +
                "X------       ****                            ****       ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------ ***                                          *** ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t11110(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????|                                                 **!!!!!X\n" +
                "X------                                              *** ------X\n" +
                "X                                                 ***          X\n" +
                "X------                                       ****       ------X\n" +
                "X#####*******                              ***        ****/////X\n" +
                "X------      *************              ***     ******   ------X\n" +
                "X                         **************  ******               X\n" +
                "X------                           *****************      ------X\n" +
                "X#####*******                ******                *******|||||X\n" +
                "X------      *****************                           ------X\n" +
                "X               ******  **************                         X\n" +
                "X------   ******     ***              *************      ------X\n" +
                "X%%%%%****        ***                              *******|||||X\n" +
                "X------       ****                                       ------X\n" +
                "X          ***                                                 X\n" +
                "X------ ***                                              ------X\n" +
                "X?????**                                                 |!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void t11111(Scanner scan){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "X------                                                  ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------ ***                                          *** ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------       ****                            ****       ------X\n" +
                "X#####*******     ***                      ***        ****/////X\n" +
                "X------      *************              ***     ******   ------X\n" +
                "X                       ****************  ******               X\n" +
                "X------                    ***    *****************      ------X\n" +
                "X#####*******                ******                *******|||||X\n" +
                "X------      *****************    ***                    ------X\n" +
                "X               ******  ****************                       X\n" +
                "X------   ******     ***              *************      ------X\n" +
                "X%%%%%****        ***                      ***     *******|||||X\n" +
                "X------       ****                            ****       ------X\n" +
                "X          ***                                    ***          X\n" +
                "X------ ***                                          *** ------X\n" +
                "X?????**                                                **!!!!!X\n" +
                "X------                                                  ------X\n" +
                "X                                                              X\n" +
                "X                                                              X\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void explode(Scanner scan){
        System.out.println("          _ ._  _ , _ ._\n" +
                "        (_ ' ( `  )_  .__)\n" +
                "      ( (  (    )   `)  ) _)\n" +
                "     (__ (_   (_ . _) _) ,__)\n" +
                "         `~~`\\ ' . /`~~`\n" +
                "              ;   ;\n" +
                "              /   \\\n" +
                "_____________/_ __ \\_____________");
    }
}