package co.com.crudtest.api;

import co.com.crudtest.model.animal.Animal;
import co.com.crudtest.usecase.crudanimal.CrudAnimalUseCase;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@ResponseBody
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
  private final CrudAnimalUseCase crudAnimalUseCase;

  @GetMapping(path = "/animal/{id}")
  public Animal read(@PathVariable String id) {
    return crudAnimalUseCase.read(id);
  }

  @PostMapping(path = "/animal")
  public Animal create(@RequestBody Animal animal) {
    return crudAnimalUseCase.create(animal);
  }

  @PutMapping(path = "/animal/{id}")
  public Animal update(@PathVariable String id, @RequestBody Animal animal) {
    try {
      return crudAnimalUseCase.update(id, animal);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
    }
  }

  @DeleteMapping(path = "/animal/{id}")
  public void delete(@PathVariable String id) {
    try {
      crudAnimalUseCase.delete(id);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
    }
  }

  @GetMapping(path = "/animales")
  public List<Animal> getAll() {
    return crudAnimalUseCase.getAll();
  }
}
