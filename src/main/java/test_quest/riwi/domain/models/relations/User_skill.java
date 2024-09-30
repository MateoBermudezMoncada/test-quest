package test_quest.riwi.domain.models.relations;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import test_quest.riwi.domain.models.Skills;
import test_quest.riwi.domain.models.User;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User_skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_skill")
    private Skills skill;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
