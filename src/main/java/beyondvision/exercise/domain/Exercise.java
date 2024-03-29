package beyondvision.exercise.domain;

import beyondvision.global.BaseEntity;
import beyondvision.record.domain.Record;
import beyondvision.detail.domain.RoutineDetail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
public class Exercise extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    private Integer caloriesBurned;

    @Column(nullable = false)
    private Integer difficulty;

    @Column(nullable = false)
    private Integer categoryNumber;

    private String exerciseImageUrl;

    @OneToMany(mappedBy = "exercise")
    private List<Record> records = new ArrayList<>();

    @OneToMany(mappedBy = "exercise", cascade = CascadeType.ALL)
    private List<RoutineDetail> routineDetails = new ArrayList<>();

    public Exercise(
            final String name,
            final String description,
            final Integer caloriesBurned,
            final Integer difficulty,
            final Integer categoryNumber
    ) {
        this.name = name;
        this.description = description;
        this.caloriesBurned = caloriesBurned;
        this.difficulty = difficulty;
        this.categoryNumber = categoryNumber;
    }
}
