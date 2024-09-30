package test_quest.riwi.domain.models.relations;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import test_quest.riwi.domain.models.Missions;
import test_quest.riwi.domain.models.User;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mission_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_mission")
    private Missions missions;
}
