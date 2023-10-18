package co.com.crudtest.model.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  private String id;
  private String name;
  private int price;

  private String animal;

  private int patas;

  private String genero;

  private String especie;

  private String habitad;

  private boolean domestico;




}
