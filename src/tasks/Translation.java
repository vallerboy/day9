package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translation {
    private static Map<String, String> transatle = new HashMap<>();

    static {
        addWordToMap("mama", "mom");
        addWordToMap("tata", "dad");
    }

    private Scanner scanner;

    public Translation() {
        scanner = new Scanner(System.in);
    }

    public void runMainLoop(){
        printWelcome();
        while (true){
            printMenu();
        }
    }

    private void printWelcome(){
        System.out.println("Witaj w slowniku polsko-angielskim!");
    }


    private void printMenu() {
        System.out.println("Wybierz: ");
        System.out.println("1 - aby dodać nowe słowo");
        System.out.println("2 - aby przetłumaczyć słowo");

        System.out.print("Wybór: ");
        rejectChoose(scanner.nextLine());
    }

    private void rejectChoose(String s) {
        switch (s){
            case "1": {
                getAndAddWord();
                break;
            }
            case "2":{
                transatleWord();
                break;
            }
            case "exit":{
                System.exit(0);
            }
            default: {
                System.out.println("Nie ma takiej komendy");
            }
        }
    }

    private void transatleWord() {
        String polish = getPolishWord();
        System.out.println("Tłumaczenie na angielski to: " + transatle.get(polish));
    }

    private void getAndAddWord() {
        String polish = getPolishWord();
        String english = getEnglishWord();
        addWordToMap(polish, english);
    }

    private String getEnglishWord() {
        System.out.print("Podaj slowo po Angielsku: ");
        return scanner.nextLine();
    }

    private String getPolishWord() {
        System.out.print("Podaj slowo po Polsku: ");
        return scanner.nextLine();
    }

    private static void addWordToMap(String polish, String english) {
        transatle.put(polish, english);
    }
}
