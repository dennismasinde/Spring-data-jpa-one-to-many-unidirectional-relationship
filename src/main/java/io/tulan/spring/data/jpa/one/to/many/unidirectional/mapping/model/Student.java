package io.tulan.spring.data.jpa.one.to.many.unidirectional.mapping.model;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String indexNumber;

    public Student() {
    }

    public Student(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
