import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RPG {
    private static int process= 0;
    private KeyboardPanel keyboardPanel = new KeyboardPanel();
    public KeyEventDemo(){
        add( keyboardPanel);
        keyboardPanel.setFocusable(true);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String again = "y";
        while (again.equals("y")){
        System.out.println("intro\n" +
                "\n" +
                " ____        _   _   _              _                    \n" +
                "| __ )  __ _| |_| |_| | ___    __ _| |__   _____   _____ \n" +
                "|  _ \\ / _` | __| __| |/ _ \\  / _` | '_ \\ / _ \\ \\ / / _ \\\n" +
                "| |_) | (_| | |_| |_| |  __/ | (_| | |_) | (_) \\ V /  __/\n" +
                "|____/ \\__,_|\\__|\\__|_|\\___|  \\__,_|_.__/ \\___/ \\_/ \\___|\n" +
                "| __ ) _ __(_) |_(_)___| |__                             \n" +
                "|  _ \\| '__| | __| / __| '_ \\                            \n" +
                "| |_) | |  | | |_| \\__ \\ | | |                           \n" +
                "|____/|_|  |_|\\__|_|___/_| |_|                           \n" +
                "\n");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String press = getKeychar
            if (process==0){

            }


        }
    }
    public void task1(Scanner scan){
        System.out.println("Task1");
        System.out.println("1941, Europe.\n" +
                "Nazi Germany invade most country in west europe. Now they aim their goal to British, \n" +
                "but Royal airforce and Royal navy block them in east coast of atlantic ocean. \n" +
                "To invade British, Hitler make a plan: \n" +
                "Operation Sea Lion");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (process==0) {
            process = 1;
        }
    }
    public void task2(Scanner scan){
        System.out.println("Task2");

        if (process==1) {
            process = 2;
        }
    }
    public void task3(Scanner scan){
        System.out.println("Task3");

        if (process==2) {
            process = 3;
        }
    }
    public void train(Scanner scan){
        System.out.println("Welcome to training task");
    }

    private class KeyboardPanel {
    }
}