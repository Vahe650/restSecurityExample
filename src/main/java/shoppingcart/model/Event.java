package shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int eventId;
    @Column
    @Enumerated(EnumType.STRING)
    private EventType eventType;
    @Column
    private int amount;
    @RestResource(exported = false)
    @ManyToOne
    private Category category;
    @Column
    private String date;
    @Column
    private String description;


}
