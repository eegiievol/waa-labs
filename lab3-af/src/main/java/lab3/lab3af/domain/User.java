package lab3.lab3af.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private String id;
    private String fname;
    private String lname;
    private String email;
    private String password;
    private int weight;
}
