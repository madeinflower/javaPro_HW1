public class Phone {

    // create variables number, model, weight
    private String number;
    private String model;
    private double weight;

    // create constructor to set variables values while creating an instance of a class
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    // add method receiveCall with 1 value (name of who is calling) and output to console the message (Звонит {name})
    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling");
    }

    // create getters to receive variables values


    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }


    // create instances of class Phone with different values and make output to console
    public static void main(String[] args) {
        Phone phone1 = new Phone("111111111", "MI9 Note", 0.3);
        Phone phone2 = new Phone("222222222", "Samsung Galaxy S20", 0.2);
        Phone phone3 = new Phone("333333333", "IPhone 15", 0.4);

        System.out.println("Phone 1:");
        System.out.println("number - " + phone1.getNumber());
        System.out.println("model - " + phone1.getModel());
        System.out.println("weight - " + phone1.getWeight());

        System.out.println();

        System.out.println("Phone 2:");
        System.out.println("number - " + phone2.getNumber());
        System.out.println("model - " + phone2.getModel());
        System.out.println("weight - " + phone2.getWeight());

        System.out.println();

        System.out.println("Phone 3:");
        System.out.println("number - " + phone3.getNumber());
        System.out.println("model - " + phone3.getModel());
        System.out.println("weight - " + phone3.getWeight());

        System.out.println();

        phone1.receiveCall("Tetiana");
        phone2.receiveCall("Leonardo");
        phone3.receiveCall("Anna");

        }
}
