package first_lesson;

public class Cat {
    private String breed;
    public String name;
    private int age;
    private String color;

    public Cat (String breed, String name, int age, String color){
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void sleep(){
        System.out.print("I am sleep");
    }
    public int meowYourAge(){
        return this.age;
    }
}
