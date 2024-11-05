import java.util.*;
public class RPG_Project {
    private static int process = 0;
    private static int achievement = 0;
    private static int con = 1;
    private static String anykey;
    private static int timesa = 0;
    private static int timesb = 0;
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

            if ((achievement%100)%10==0||(achievement%100)%10==1||(achievement%100)%10==2||(achievement%100)%10==3) {
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
        String quit = "n";
        int cprocess = process-process%10;
        if (cprocess%100==40||cprocess%100==60||cprocess%100==80){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("You have done this task, you want to:\n" +
                    "1.Redo this task(the process of this task will be restart)\n" +
                    "2.quit\n"+"Make your choise in number.");
            int choise = scan.nextInt();
            if (choise==1)
                process=process-cprocess%100;
            else
                System.out.println("You will back to manu");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if (cprocess%100>0&&cprocess%100<60||cprocess%100==70) {
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
                process=process-cprocess%100;
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
    }


    public static void task3(Scanner scan) {


        System.out.println("\nThis is the task three.");
        if (process%100==13)
            process=process+100;
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

        System.out.println("1.");
        System.out.println("2.Eagle Day");
        if (process%100%10<6||process%100%10==7)
            System.out.println(" (Not available now)\n");
        System.out.println("3.Aftermath");
        if (process % 100 < 10)
            System.out.println(" (Not available now)\n");
        System.out.println("\n\n4. Show the achieve  "+"5.Save the game"+"   6.Restore the game"+"   7.Test mode(all task will be available)" +
                "\n8.Exit the game");
        System.out.println("select the task and enter its number\nRemember, in all any key step, press q or Q to quit " +
                "the task and back to menu.");

        int select = scan.nextInt();
        if (select == 1)
            task1(scan);
        else if (select == 2) {
            if (process%100%10<6&&timesa==0||process%100%10==7&&timesa==0){
                System.out.println("Not able, win task1 to make it available.");
                System.out.println("Press any key");
                anykey = scan.next();
            }
            else {
                timesa=1;
                task2(scan);
            }
        }
        else if (select == 3) {
            if (process%100<69&&timesb==0||process%100==77&&timesa==0) {
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
            System.out.println("Your achieve code is "+achievement);
            System.out.println("Press any key");
            anykey=scan.next();
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
}