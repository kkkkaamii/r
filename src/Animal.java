class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("The animal makes a noise.");
    }

    public void eat() {
        System.out.println("The animal eats " + food);
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }

    public String getLocation() {
        return location;
    }
}


class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog barks.");
    }

    public void fetch() {
        System.out.println("The dog is fetching.");
    }
}


class Cat extends Animal {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("The cat meows.");
    }

    public void scratch() {
        System.out.println("The cat is scratching.");
    }
}


class Horse extends Animal {
    private String breed;

    public Horse(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("The horse neighs.");
    }

    public void gallop() {
        System.out.println("The horse is galloping.");
    }
}


class Veterinary {
    public void treatAnimal(Animal animal) {
        System.out.println("Treating animal located in: " + animal.getLocation());
        animal.makeNoise();
        animal.eat();
        animal.sleep();
        if (animal instanceof Dog) {
            ((Dog) animal).fetch();
        } else if (animal instanceof Cat) {
            ((Cat) animal).scratch();
        } else if (animal instanceof Horse) {
            ((Horse) animal).gallop();
        }
        System.out.println("--------------------");
    }
}



