package personalstock.restapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Video {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String videoUrl;

    private String description;

    @ManyToOne
    private Account creator;

    @ManyToOne
    private VideoOrder order;

}
