package yjjeondlvry.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import yjjeondlvry.BoundedContext1659_375Application;

@Entity
@Table(name = "Tst_table")
@Data
//<<< DDD / Aggregate Root
public class Tst {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static TstRepository repository() {
        TstRepository tstRepository = BoundedContext1659_375Application.applicationContext.getBean(
            TstRepository.class
        );
        return tstRepository;
    }
}
//>>> DDD / Aggregate Root
