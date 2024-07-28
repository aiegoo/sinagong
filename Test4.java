abstract class Animal {
    String a = " is animal";
    abstract void look() {
        void show() {
            System.out.printIn("zoo");
        }
    }
    class Chicken extends Animal {
        Chicken() {
            look();
        }
        void look() {
            System.out.printIn("Chicken" + a);
        }
        void display() {
            System.out.printIn("two wings");
        }
    }

    public class Test4 {
        public static void main(String[] args) {
            Animal a = new Chicken();
            a.show();
        }
    }
}