package org.sda.todolist;

public class Messages {
    
    public static final String RESET_TEXT = "\u001B[0m";   
    public static final String RED_TEXT = "\u001B[31m";   
    public static final String GREEN_TEXT = "\u001B[32m";

    public static void mainMenu(int incompleteTaskCount, int completedTaskCount) {
        System.out.println("\nMAIN MENU");
        System.out.println("===========\n");
        System.out.println("You have " + Messages.RED_TEXT + incompleteTaskCount + " task(s) todo " + Messages.RESET_TEXT + " and " + Messages.GREEN_TEXT
                + completedTaskCount + " completed task(s)\n" + Messages.RESET_TEXT);
        System.out.println("Pick an option:");
        System.out.println("(1) Show Task List (by date or project)");
        System.out.println("(2) Add New Task");
        System.out.println("(3) Edit Task (update, mark as done, remove)");
        System.out.println("(4) Save and Quit\n");
        System.out.print("Please enter your choice [1-4]: ");
    }

    public static void listAllTasksMenu() {
        System.out.println("\nDisplay All Tasks");
        System.out.println("===================\n");
        System.out.println("Pick an option:");
        System.out.println("(1) Show Task List by date" +
                Messages.RED_TEXT + " [default choice, just press ENTER key]" + Messages.RESET_TEXT);
        System.out.println("(2) Show Task List by project");
        System.out.print("\nPlease enter your choice [1-2]: ");
    }

    public static void editTaskSelection() {
        System.out.println(GREEN_TEXT);
        System.out.print(">>> Type a task number to EDIT and press ENTER key: ");
        System.out.print(RESET_TEXT);
    }

    public static void editTaskMenu() {
        System.out.println("\nTask Edit Options");
        System.out.println("======================\n");
        System.out.println("Pick an option:");
        System.out.println("(1) Modify selected task");
        System.out.println("(2) Mark selected task as COMPLETED");
        System.out.println("(3) Delete selected task");
        System.out.println("(4) Return to main menu "
                + Messages.RED_TEXT + " [default choice, just press ENTER]"+Messages.RESET_TEXT);
        System.out.print("\nPlease enter your choice [1-4]: ");
    }

    public static void  byeMessage() {
        System.out.println(GREEN_TEXT);
        System.out.println(">>> All tasks are saved to data file");
        System.out.println(">>> Good Bye");
        System.out.println(RESET_TEXT);
    }

    public static void unknownMessage() {
        System.out.println(RED_TEXT);
        System.out.println(">>> Incorrect choice: Please type a number from given choices ");
        System.out.print(RESET_TEXT);
    }

    public static void showMessage(String message, boolean warning) {
        System.out.println(warning?RED_TEXT:GREEN_TEXT);
        System.out.println(">>> " + message);
        System.out.println(RESET_TEXT);
    }
    
    public static void separator (char charToPrint, int times) {
        for (int index=0; index<times; index++) System.out.print(charToPrint);
        System.out.println("");
    }

}
