package co.com.crudtest.jpa;

import co.com.crudtest.model.animal.Animal;
import co.com.crudtest.model.animal.gateways.AnimalRepository;

import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JpaAnimalImpl implements AnimalRepository {

  private JPARepositoryAdapter jpaRepositoryAdapter;

  @Override
  public Animal create(Animal animal) {
    //String id = UUID.randomUUID().toString();
    //animal.setId(id);
    jpaRepositoryAdapter.save(animal);
    return animal;
  }

  @Override
  public Animal read(String id) {
    return jpaRepositoryAdapter.findById(id);
  }

  @Override
  public Animal update(String id, Animal animal) throws Exception {
    Animal animalDb = jpaRepositoryAdapter.findById(id);

    if (animalDb == null) throw new Exception("Product Not Found : " + id);

    //animalDb.setAnimal(animal.getAnimal());
    animalDb.setPatas(animal.getPatas());
    animalDb.setHabitad(animal.getHabitad());
    animalDb.setGenero(animal.getGenero());
    animalDb.setEspecie(animal.getEspecie());
    animalDb.setDomestico(animal.isDomestico());

    jpaRepositoryAdapter.save(animalDb);
    return animal;
  }

  @Override
  public void delete(String id) throws Exception  {
    Animal animalDb = jpaRepositoryAdapter.findById(id);
    if (animalDb == null) throw new Exception("Product Not Found : " + id);
    jpaRepositoryAdapter.deleteById(id);
  }

  @Override
  public List<Animal> getAll() {
    return jpaRepositoryAdapter.findAll();
  }
}
