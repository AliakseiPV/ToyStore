import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws Exception {

        GamePlay game = new GamePlay();
        game.startPack();
        game.print();
        System.out.println();

        FileWriter writer = new FileWriter("win.txt", false);
        Scanner in = new Scanner(System.in);

        while (game.gameEndCheck() != 0)
        {
            System.out.print("If you want play write - 'play'\n" +
                    "If you want add toys write a number: 1 - Teddy Bear, 2 - Plush Cat, 3 - Rubber Duck\n" +
                    "If you want to change the toys chance write a number: 4 - Teddy Bear, 5 - Plush Cat, 6 - Rubber Duck");
            System.out.println();

            String choise = in.next();

            switch (choise){
                case "play":
                    System.out.println();
                    System.out.println("-----Wou win: " + game.play() + "!-----");
                    game.print();
                    break;
                case "1":
                    System.out.println("Enter the number what you want to add: ");
                    game.addToy(Integer.parseInt((in.next())),"Teddy Bear");
                    game.print();
                    break;
                case "2":
                    System.out.println("Enter the number what you want to add: ");
                    game.addToy(Integer.parseInt((in.next())),"Plush Cat");
                    game.print();
                    break;
                case "3":
                    System.out.println("Enter the number what you want to add: ");
                    game.addToy(Integer.parseInt((in.next())),"Rubber Duck");
                    game.print();
                    break;
                case "4":
                    System.out.println("Enter the number that you want change from 10 to 90: ");
                    game.receiveToyChange((Double.parseDouble(in.next()) / 100), "Teddy Bear");
                    game.print();
                    break;
                case "5":
                    System.out.println("Enter the number that you want change from 10 to 90: ");
                    game.receiveToyChange((Double.parseDouble(in.next()) / 100), "Plush Cat");
                    game.print();
                    break;
                case "6":
                    System.out.println("Enter the number that you want change from 10 to 90: ");
                    game.receiveToyChange((Double.parseDouble(in.next()) / 100), "Rubber Duck");
                    game.print();
                    break;
            }
        }




    }
}