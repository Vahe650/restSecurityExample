package shoppingcart;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import shoppingcart.model.Event;
import shoppingcart.model.EventType;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventDto {
    private int eventId;
    private EventType eventType;
    private int amount;
    private int category;
    private LocalDate date;
    private String description;

    public static Event convertDtoToEntity(EventDto dto){
        Event event = new Event();
        event.setEventId(dto.getEventId());
        event.setEventType(dto.getEventType());
        event.setAmount(dto.getAmount());
        return  event;
    }

}
