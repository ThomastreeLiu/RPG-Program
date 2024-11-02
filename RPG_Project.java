import java.util.*;
public class RPG_Project {
    private static int process = 000;
    private static int con = 1;
    private static String anykey;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (con == 1) {
            introduction(scan);
        }
        System.out.println("Thanks for playing");
    }


    public static void task1(Scanner scan) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("1941, Europe.\n" +
                "Nazi Germany invade most country in west europe. Now they aim their goal to British, \n" +
                "but Royal air force and Royal navy block them in east coast of atlantic ocean. \n" +
                "To invade British, Hitler make a plan: \n" +
                "Operation Sea Lion");

        System.out.println("Press any key");
        anykey = scan.next();

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("You are a pilot of Supermarine Walrus, as usual, you take off from sea to " +
                "scouting the german front coast");
        System.out.println("\n" +
                "\n" +
                "                 `··``´   `                                                                     ´`  \n" +
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
                "                                                        ```´´´¨`` ``   ` `     `                `` `\n" +
                "\n");
        //https://www.asciiart.eu/image-to-ascii
        System.out.println("Press any key");
        anykey = scan.next();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


        System.out.println("you saw some black point in the sky of the coast.");
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
        System.out.println("\nBefore this mission, your assistant told you British and Germany are in war, \n" +
                "but you look down upon. Now you treat this as a truth. You ask your copilot take a picture, \n" +
                "");
        System.out.println("Press any key");
        anykey=scan.next();


        if ((process % 100) % 10 == 0)
            process = process + 1;

    }


    public static void task2(Scanner scan) {


        System.out.println("\nThis is task two.");


        if (process%100<10)
            process=process+10;
    }


    public static void task3(Scanner scan) {


        System.out.println("\nThis is the task three.");

        if (process<100)
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
        if ((process % 100) % 10 == 0)
            System.out.println(" (Not available now)\n");
        System.out.println("3.Aftermath");
        if (process % 100 < 10)
            System.out.println(" (Not available now)\n");
        System.out.println("\n\n5.Save the game"+"   6.Enter the game code"+"   7.Test mode(all task will be available)" +
                "\n8.Exit the game");
        System.out.println("select the task and enter its number");

        int select = scan.nextInt();
        if (select == 1)
            task1(scan);
        else if (select == 2) {
            if ((process % 100) % 10 == 0) {
                System.out.println("Not able, finish task1 to make it available.");
                System.out.println("Press any key");
                anykey = scan.next();
            }
            else
                task2(scan);
        }
        else if (select == 3) {
            if (process % 100 < 10) {
                System.out.println("Not able, finish task2 to make it available.");
                System.out.println("Press any key");
                anykey = scan.next();
            }
            else
                task3(scan);

        }
        else if (select == 5) {
            System.out.println("Your game code is "+process+", enter that in selection 6 to continue your game");
            System.out.println("Press any key");
            anykey=scan.next();
        }
        else if (select == 6) {
            System.out.println("Enter your game code");
            process = scan.nextInt();
        }
        else if (select == 7) {
            process = 111;
        }
        else if (select == 8) {
            con = 0;
        }
    }
}