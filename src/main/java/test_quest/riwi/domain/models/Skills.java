package test_quest.riwi.domain.models;

import jakarta.persistence.*;
import lombok.*;
import test_quest.riwi.domain.models.relations.Mission_skill;
import test_quest.riwi.domain.models.relations.User_skill;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String description;

    @OneToMany(mappedBy = "skill")
    private Set<User_skill> users = new HashSet<>();

    @OneToMany(mappedBy = "skill")
    private Set<Mission_skill> missions = new HashSet<>();
}
