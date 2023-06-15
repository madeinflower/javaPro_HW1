public class Person {
   // create variables
    private String fullName;
    private int age;

    // create methods walk and talk, out put some text to console ("Person {такой-то} говорит" и
    //"Person {такой-то} идет" (замените {такой-то} на fullName)
    public void move() {
        System.out.println("Person " + fullName + " is moving");
    }
    public void talk() {
        System.out.println("Person " + fullName + " is talking");
    }

    // create constructors (Person empty and Person + fullName, age)
    public Person() {

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // add getters ans setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // create an object by using of constructor Person() and setters
        Person person1 = new Person();
        person1.setFullName("Tetiana Tatsenko");
        person1.setAge(35);
        person1.move(); // Tetiana Tatsenko move output
        person1.talk(); // Tetiana Tatsenko talk output

        // create an object by using of constructor Person(fullName, age)
        Person person2 = new Person("Tetiana Tatsenko", 35);
        person2.move(); // Tetiana Tatsenko move output
        person2.talk(); // Tetiana Tatsenko talk output
    }
}
