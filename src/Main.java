public class Main
{
    public static void main(String[] args)
    {

        GamePlay game = new GamePlay();
        game.startPack();

        while(game.gameEndCheck() != 0)
        {
            game.print();
            System.out.println();
            System.out.println(game.play());

        }


//        try {
//            game.addToy(5,"Teddy Bear");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        game.print();
//        try {
//            game.receiveToyChange(0.1, "Teddy Bear");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        //game.print();
    }
}