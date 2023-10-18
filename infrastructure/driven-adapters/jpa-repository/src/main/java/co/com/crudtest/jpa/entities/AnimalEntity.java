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
@Table(name = "animal")
public class AnimalEntity {

  //@Id
  //private String id;

  @Id
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
