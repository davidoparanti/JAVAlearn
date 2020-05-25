class DDog {
    String name;
    int size;

    void bark() {
        if(size > 60) {
            System.out.println( this.name + " says Woof Woof");
        } else if (size > 40) {
            System.out.println("Rauf Rauf");
        } else {
            System.out.println("yip yip yip");
        }
    }
}

class Dog {
    public static void main(String[] arg) {

        DDog dog = new DDog();
        dog.name = "Malik";
        dog.size = 100;
        dog.bark();
        
    }
}