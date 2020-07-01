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
@Table(name = "bill")
public class Bill {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
   private int billId;
   @Column
   private long value ;
   @Column
   private String currency ;


}
