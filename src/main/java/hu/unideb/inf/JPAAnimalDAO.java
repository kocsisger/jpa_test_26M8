package hu.unideb.inf;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class JPAAnimalDAO implements AnimalDAO{
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    //C
    public void saveAnimal(Animal a){
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
    }

    //R
    public List<Animal> getAllAnimals(){
        return null;
    }

    //U
    public void updateAnimal(Animal a){

    }

    //D
    public void deleteAnimal(Animal a){

    }
}
