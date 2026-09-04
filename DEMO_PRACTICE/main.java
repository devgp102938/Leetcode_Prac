class animal{
    public void makeSound(){
        System.out.println("Animal makes Sound");
    }
}

class Dog extends animal{

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends animal{

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends animal{

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}

class main{
    public static void main(String[] args) {

        animal[] animals = {
            new Dog(),
            new Cat(),
            new Cow()
        };

        for(animal animal : animals){
            animal.makeSound();
        }
    }
}