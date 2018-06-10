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
@NoArgsConstructor
@AllArgsConstructor
public class VideoOrder {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String location1;

    private String location2;

    private float price;

    private String description;

    @ManyToOne
    private Account poster;

}
