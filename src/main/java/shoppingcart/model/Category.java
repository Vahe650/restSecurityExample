package shoppingcart.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int categoryId;
    @Column
    private String name;
    @Column
    private int capacity;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Event> events = new ArrayList<>();


}
