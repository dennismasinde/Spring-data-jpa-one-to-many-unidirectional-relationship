package io.tulan.spring.data.jpa.one.to.many.unidirectional.mapping.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "University")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "university_id")
    private List<Student> student = new ArrayList<>();

    public University() {

    }

    public University(String name, List<Student> student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudent() {
        return student;
    }
}
