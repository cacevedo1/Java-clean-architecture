package co.com.crudtest.model.animal.gateways;

import co.com.crudtest.model.animal.Animal;
import java.util.List;

public interface AnimalRepository {

  Animal create(Animal animal);

  Animal read(String id);

  default Animal update(String id, Animal animal) throws Exception {
    return animal;
  }

   void delete(String id) throws Exception;

  List<Animal> getAll();
}
