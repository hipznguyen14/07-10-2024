interface  Animal {
    void swim();
    void walk();
}

class Duck implements Animal {

     public void walk() {
         System.out.println("Duckzz");
     }

     public void swim() {
         System.out.println("Duckzzz");
     }

}

class Pig implements Animal {
    public void walk() {
        System.out.println("Pig");
    }
    public void swim() {

    }
}

class Fish implements Animal {
    public void swim() {
        System.out.println("Fish");
    }
    public void walk() {

    }
}


