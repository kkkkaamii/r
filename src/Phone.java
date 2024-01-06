public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is ringing");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is ringing from number: " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.print("Sending message to: ");
        for (String num : phoneNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("1234567890", "iPhone", 0.5);
        Phone phone2 = new Phone("9876543210", "Samsung Galaxy", 0.28);
        Phone phone3 = new Phone("1112223333", "Xiaomi", 0.83);


        phone1.receiveCall("Kamila");
        System.out.println("Phone 1 number: " + phone1.getNumber());

        phone2.receiveCall("Alida");
        System.out.println("Phone 2 number: " + phone2.getNumber());


        phone1.sendMessage("1112223333", "9998887777");
        phone2.sendMessage("1234567890", "1112223333", "9998887777");
    }
}