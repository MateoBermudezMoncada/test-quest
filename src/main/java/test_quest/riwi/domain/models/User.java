package test_quest.riwi.domain.models;

import jakarta.persistence.*;
import lombok.*;
import test_quest.riwi.domain.models.relations.Mission_User;
import test_quest.riwi.domain.models.relations.User_skill;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String role;

    @OneToMany(mappedBy = "user")
    private Set<User_skill> skills = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Mission_User> missions = new HashSet<>();

}
