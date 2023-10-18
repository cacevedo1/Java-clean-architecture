package co.com.crudtest.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class ProductEntity {

  @Id
  private String id;
  @Column
  private String name;
  @Column
  private int price;

  @Column
  private String animal;

  @Column
  private int patas;


  @Column
  private String genero;

  @Column
  private String especie;

  @Column
  private String habitad;

  @Column
  private boolean domestico;


}
