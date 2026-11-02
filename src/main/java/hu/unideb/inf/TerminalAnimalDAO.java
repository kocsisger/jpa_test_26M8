package hu.unideb.inf;

import java.util.List;

public class TerminalAnimalDAO implements AnimalDAO{
    @Override
    public void saveAnimal(Animal a) {
        System.out.println("Saving " + a.name);
    }

    @Override
    public List<Animal> getAllAnimals() {
        return List.of();
    }

    @Override
    public void updateAnimal(Animal a) {

    }

    @Override
    public void deleteAnimal(Animal a) {

    }

    @Override
    public void saveZoo(Zoo zoo) {

    }
}
