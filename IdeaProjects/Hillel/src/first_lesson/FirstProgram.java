package first_lesson;

import static java.awt.Color.black;

public class FirstProgram {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Siam", "John", 1, "black");
        Cat secondCat = new Cat("British", "Boris", 58, "white");
        System.out.println("First cat breed:");


        firstCat.sleep();
    }
}
