package yjjeondlvry.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import yjjeondlvry.domain.*;
import yjjeondlvry.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Tsted extends AbstractEvent {

    private Long id;

    public Tsted(Tst aggregate) {
        super(aggregate);
    }

    public Tsted() {
        super();
    }
}
//>>> DDD / Domain Event
