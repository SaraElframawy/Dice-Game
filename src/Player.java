public class Player {
 private  String name;// 1. Has an attribute name that stores the name of a player.
  private int totalPoints ;  // 2. Has an attribute totalPoints that stores the sum of the points of a player.
    public Player(String name){ // 3. Create  a constructor method that requires a string name to be used as the
       // name of the player.

        setName(name);

      //  setTotalPoints(totalPoints);

    }
    public void setName(String n){   //Create getters and setters methods for the attributes
        this.name= n;

    }
    public String getName(){
        return this.name;

    }
    public void setTotalPoints(int total){
        this.totalPoints=total;
    }
   public int getTotalPoints(){

        return totalPoints;

   }
}
