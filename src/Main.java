import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        // Phone class demonstration
        Phone phone1 = new Phone("1234567890", "iPhone", 0.35);
        Phone phone2 = new Phone("9876543210", "Samsung Galaxy", 0.28);
        Phone phone3 = new Phone("1112223333", "Xiaomi", 0.83);

        phone1.receiveCall("Kamila");
        System.out.println("Phone 1 number: " + phone1.getNumber());

        phone2.receiveCall("Alida");
        System.out.println("Phone 2 number: " + phone2.getNumber());

        phone3.receiveCall("Amina", "9998887777");

        phone1.sendMessage("1112223333", "9998887777");
        phone2.sendMessage("1234567890", "1112223333", "9998887777");


        Person person1 = new Person();
        person1.move();
        person1.talk();

        Person person2 = new Person("Alida Beisenbai", 17);
        person2.move();
        person2.talk();


        double[][] matrixArray1 = {{1, 2}, {3, 4}};
        double[][] matrixArray2 = {{5, 6}, {7, 8}};
        Matrix matrix1 = new Matrix(matrixArray1);
        Matrix matrix2 = new Matrix(matrixArray2);

        Matrix matrixAddition = matrix1.add(matrix2);
        Matrix matrixScalarMultiplication = matrix1.multiply(5);


        Phone readerPhone = new Phone("1234567890", "Some Phone");
        Readers reader1 = new Readers("Kamila Mukhammedova", 12345, "Science", "2006-10-30", readerPhone);

        reader1.takeBook(3);
        reader1.takeBook("Adventures", "Dictionary", "Encyclopedia");

        Book book1 = new Book("Adventures");
        Book book2 = new Book("Dictionary");
        Book book3 = new Book("Encyclopedia");

        reader1.returnBook(book1, book2, book3);


        int A = 5;
        int B = 10;
        System.out.print(" your recursive numbers: ");
        RecursiveNumbers.printNumbers(5, 10);


        Student student1 = new Student("Kamila", "M", "GroupA", 4.8);
        Aspirant aspirant1 = new Aspirant("Kamila", "S", "GroupB", 5.0, "Quantum Physics");

        System.out.println(student1);
        System.out.println("Scholarship: $" + student1.getScholarship());

        System.out.println(aspirant1);
        System.out.println("Scholarship: $" + aspirant1.getScholarship());


        Car car = new Car("Toyota", "SUV", 1800, new Driver("Alice", 5), new Engine(200, "ToyotaEngine"));
        System.out.println(car);

        Dog dog = new Dog("DogFood", "House", "Bulldog");
        Cat cat = new Cat("CatFood", "Garden", "Siamese");
        Horse horse = new Horse("Hay", "Stable", "Thoroughbred");

        Veterinary vet = new Veterinary();
        Animal[] animals = {dog, cat, horse};
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}

