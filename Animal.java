package javaQuiz5;

public abstract class Animal {

    abstract void makeSound();
    abstract void canEat();

    public Animal(){}

  public void abouMe(){
      System.out.println("I am Animel");
  }







    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.canRun();
        Cat cat = new Cat();
        cat.favouriteToy();
        Animal animal = new Animal() {
            @Override
            void makeSound() {

            }

            @Override
            void canEat() {

            }

        };
        animal.abouMe();

    }
  }


