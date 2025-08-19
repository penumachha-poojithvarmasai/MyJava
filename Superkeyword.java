package myjava;

class Animal {
    int i = 5;
    int j = 10;

    void display() {
        System.out.println("i is " + i);
        System.out.println("j is " + j);
    }
}

class Bird extends Animal {
    int k = 20;

    void display() {
        super.display();
        System.out.println("k is " + k);
    }
}

public class Superkeyword {
    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Bird();

        System.out.println("Calling Animal display():");
        a.display();

        System.out.println("\nCalling Bird display():");
        b.display();
    }
}
