import java.util.Scanner;

public class Game {   // 1. Has firstPlayer and secondPlayer as attributes.
    Player firstPlayer;
    Player secondPlayer;

    public void requestPlayerNames() {    //2. Has a method requestPlayerNames() that asks the users to enter
       // their names and creates two players with the given names.
         var scan = new Scanner(System.in);

        System.out.println("enter the first name");
        String name1 = scan.nextLine();
        firstPlayer = new Player(name1); // building a new object with the constructor from player class
        System.out.println("enter the second name");
           String name2 = scan.nextLine();
            secondPlayer=new Player(name2);
    }

    /*
     Has a method requestPlayerThrows() with a player as parameter.
        Each player should throw the dice three times. The method
        requires the user to press a key for throwing the dice at each
     */
    public Player requestPlayerThrows (Player player){
        var scan = new Scanner(System.in);
        Dice dice = new Dice();
        for (int i =0; i<3;i++){
            System.out.println("if you want to throw a dice press enter");
             scan.nextLine();
            player.setTotalPoints(player.getTotalPoints()+dice.throwDice()); //the original value number =0+ the random number
            System.out.println("du fick"+ dice.getValue());
          //  System.out.println(firstPlayer.getName()+"fick"+dice.getValue());

          //  if (press==1){
          //      player.getTotalPoints();
           // }
        }
     return player;
    }
    public void comparePointsOfPlayers(Player firstPlayer,Player secondPlayer){
        if(firstPlayer.getTotalPoints()>secondPlayer.getTotalPoints())
            System.out.println(firstPlayer.getName()+"\n"+"the first player vann");
        else if (secondPlayer.getTotalPoints()>firstPlayer.getTotalPoints())
            System.out.println(secondPlayer.getName()+"\n"+ "the Second player vann");
        else
            System.out.println("it is a draw");
    }
public void runGame(){
        requestPlayerNames();
        System.out.println("---"+firstPlayer.getName()+"----");
        System.out.println("----"+secondPlayer.getName()+"----");
        requestPlayerThrows(firstPlayer);
        System.out.println("total points för"+ firstPlayer.getName()+firstPlayer.getTotalPoints() +"----");
        requestPlayerThrows(secondPlayer);
        System.out.println("total points för "+secondPlayer.getName()+secondPlayer.getTotalPoints()+"---");
        comparePointsOfPlayers(firstPlayer,secondPlayer);

}
}


