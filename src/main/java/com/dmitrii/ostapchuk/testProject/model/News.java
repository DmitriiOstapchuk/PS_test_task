package com.dmitrii.ostapchuk.testProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="news")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class News extends HasSystemFields {

    @Column
    String text;
}
