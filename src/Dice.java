import java.util.Random;

public class Dice {
    int value; // Has an int attribute value that will store the value of a dice when
    //thrown.

// 2. Create getters and setters methods for the attributes and a
//        constructor method.
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    // 3. Create a method called throwDice(), that randomly returns a
    //        value from 1 through 6 to represent the throw of a dice.
    public int throwDice(){
        Random random= new Random();
        setValue(random.nextInt(1,6));
        return value;

    }


}