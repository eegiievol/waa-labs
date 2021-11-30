package ORM.ormdemo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Movie {

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private int year;
    private String genre;
}
