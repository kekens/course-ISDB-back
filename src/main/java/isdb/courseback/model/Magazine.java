package isdb.courseback.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@IdClass(MagazineKey.class)
@Table(name = "magazine")
public class Magazine{

    @Id
    @Column(name = "miner_id")
    private int minerId;

    @Id
    @Column(name = "mine_name")
    private String mineName;

    @Column(name = "brigade_id")
    private int  brigadeId;

    @Column(name = "part")
    private String part;

    @Column(name = "date_work")
    private Date date_work;

    @Column(name = "rating")
    private int rating;
}
