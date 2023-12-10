import linear.List;
import linear.Stack;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Stack<Muenze> stapel1Cent = new Stack<>();
        Stack<Muenze> stapel2Cent = new Stack<>();
        Stack<Muenze> stapel5Cent = new Stack<>();
        Stack<Muenze> stapel10Cent = new Stack<>();
        Stack<Muenze> stapel20Cent = new Stack<>();
        Stack<Muenze> stapel50Cent = new Stack<>();
        Stack<Muenze> stapel1Euro = new Stack<>();
        Stack<Muenze> stapel2Euro = new Stack<>();

        List<Muenze> muenzen = new List<>();
        Random random = new Random();

        //add 50 random coins
        for (int i = 0; i < 50; i++) {
            addRandomMuenze(muenzen, random);
        }

        muenzen.toFirst();

        while (muenzen.hasAccess()) {
            Muenze currentCoin = muenzen.getContent();
            Muenze newCoin = new Muenze(currentCoin.getWert(), currentCoin.getArt());

            switch (currentCoin.getWert()) {
                case 1 -> stapel1Cent.push(newCoin);
                case 2 -> stapel2Cent.push(newCoin);
                case 5 -> stapel5Cent.push(newCoin);
                case 10 -> stapel10Cent.push(newCoin);
                case 20 -> stapel20Cent.push(newCoin);
                case 50 -> stapel50Cent.push(newCoin);
                case 100 -> stapel1Euro.push(newCoin);
                case 200 -> stapel2Euro.push(newCoin);
            }

            muenzen.next();
        }

        System.out.println("Inhalt von muenzen:");
        printListContents(muenzen);
        System.out.println("Inhalt von stapel1Cent:");
        printStackContents(stapel1Cent);
        System.out.println("Inhalt von stapel2Cent:");
        printStackContents(stapel2Cent);
        System.out.println("Inhalt von stapel5Cent:");
        printStackContents(stapel5Cent);
        System.out.println("Inhalt von stapel10Cent:");
        printStackContents(stapel10Cent);
        System.out.println("Inhalt von stapel20Cent:");
        printStackContents(stapel20Cent);
        System.out.println("Inhalt von stapel50Cent:");
        printStackContents(stapel50Cent);
        System.out.println("Inhalt von stapel1Euro:");
        printStackContents(stapel1Euro);
        System.out.println("Inhalt von stapel2Euro:");
        printStackContents(stapel2Euro);


    }

    private static void addRandomMuenze(List<Muenze> muenzen, Random random) {
        int[] moeglicheWerte = new int[]{1, 2, 5, 10, 20, 50, 100, 200};

        int randomIndex = random.nextInt(moeglicheWerte.length);
        int randomWert = moeglicheWerte[randomIndex];

        Muenze.ART randomArt = (randomWert >= 100) ? Muenze.ART.EURO : Muenze.ART.CENT;
        if (randomArt == Muenze.ART.EURO) {
            randomWert /= 100;
        }

        Muenze muenze = new Muenze(randomWert, randomArt);
        muenzen.append(muenze);
    }

    private static void printListContents(List<Muenze> list) {
        list.toFirst();
        while (list.hasAccess()) {
            System.out.println(list.getContent());
            list.next();
        }
    }

    private static void printStackContents(Stack<Muenze> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.top());
            stack.pop();
        }
    }
}
