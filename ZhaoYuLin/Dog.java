package ZhaoYuLin;

public class Dog {
    String name;
    String breed;
    int age;
    boolean rabies;

    public Dog() {
        name = "Fred";
        breed = "Husky";
        age = 3;
        rabies = true;
    }

    public Dog(String name, String type, int age) {
        this.name = name;
        breed = type;
        this.age = age;
        rabies = false;
    }

    public void bark() {
        System.out.println("bork");
    }

    public int getAge() {
        return age;
    }

    public int getAgeInDogYears() {
        return (age * 7);
    }

    public boolean hasRabies() {
        return rabies;
    }

    public void setRabies(boolean gotRabies) {
        rabies = gotRabies;
    }

    public static void main(String[] args) {
        Dog foo = new Dog("foo", "golden retriever", 5);
        foo.bark();
        Dog fred = new Dog();
        fred.bark();
        System.out.println("Fred's age: " + fred.getAge());
        fred.setRabies(true);
        Dog bar = new Dog("Bar", "dachshund", 1);
        System.out.println("Bar's age in dog years: " + bar.getAgeInDogYears());
        bar.setRabies(true);
        System.out.println("Does Bar have rabies: " + bar.hasRabies());
    }

}
