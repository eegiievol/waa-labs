package ORM.ormdemo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MOVIES")
public class Movies {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;

    private int year;
    private String genre;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JsonBackReference
//    private User user;


    @ManyToOne
    @JoinColumn(name = "movie_owner")
    @JsonBackReference
    private User user;

}
