package hu.unideb.inf;

import java.util.List;

public interface AnimalDAO {
    //C
    public void saveAnimal(Animal a);

    //R
    public List<Animal> getAllAnimals();

    //U
    public void updateAnimal(Animal a);

    //D
    public void deleteAnimal(Animal a);

    public void saveZoo(Zoo zoo);
}
