package shoppingcart.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@Table(name = "product")
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
   private int id;
   @Column
   private String name ;
   @Column
   private String type ;
   @Column
   private int price ;
   @Column(columnDefinition = "datetime")
   private Date addedDate;
   @Column(columnDefinition = "datetime")
   private Date updatedDate;
   @Column
   private int countInStock;

}
