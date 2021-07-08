package com.example.map.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    @OneToMany
    private List<Subject> subjects;

    @NotNull
    @OneToOne
    private Subject coreSubject;
}
