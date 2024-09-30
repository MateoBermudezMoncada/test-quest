package test_quest.riwi.domain.models;

import jakarta.persistence.*;
import lombok.*;
import test_quest.riwi.domain.models.relations.Mission_User;
import test_quest.riwi.domain.models.relations.Mission_skill;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Missions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String level;

    @OneToMany(mappedBy = "mission")
    private Set<Mission_skill> skills = new HashSet<>();

    @OneToMany(mappedBy = "mission")
    private Set<Mission_User> user = new HashSet<>();
}
