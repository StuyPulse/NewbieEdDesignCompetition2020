package VincentWang;

public class Dog {
    String name;
    String breed;
    int age;
    boolean rabies;

    public Dog(String name, String type, int age) {
        this.name = name;
        breed = type;
        this.age = age;
        rabies = false;
    }
    public void bark() {
        System.out.println("I dont want to bark");
    }
    public int getAge() {
        return age;
    }
    public int getAgeInDogYears() {
        return age/7;
    }
    public boolean hasRabies() {
        return rabies;
    }
    public void setRabies(boolean gotRabies) {
        rabies = gotRabies;
    }
    public static void main(String[] args) {
        Dog bar = new Dog("bar", "dachschung", 1);
        bar.bark();
        System.out.println(bar.getAge());
        bar.setRabies(true);
        System.out.println(bar.getAgeInDogYears());
        System.out.println(bar.hasRabies());
    }
}
