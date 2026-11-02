package hu.unideb.inf;

public class AnimalManager {

    private static AnimalDAO aDAO;

    public static void setaDAO(AnimalDAO aDAO) {
        AnimalManager.aDAO = aDAO;
    }

    public static void manageAnimals(){
        Animal animal = new Animal("Elephant", 3, Animal.GenderType.FEMALE);
        Animal animal2 = new Animal("Fox", 5, Animal.GenderType.MALE);

        aDAO.saveAnimal(animal);
        aDAO.saveAnimal(animal2);
    }
}
