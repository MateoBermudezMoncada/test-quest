package test_quest.riwi.domain.models.relations;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import test_quest.riwi.domain.models.Missions;
import test_quest.riwi.domain.models.Skills;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mission_skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_skill")
    private Skills skills;

    @ManyToOne
    @JoinColumn(name = "id_mission")
    private Missions mission;

}
