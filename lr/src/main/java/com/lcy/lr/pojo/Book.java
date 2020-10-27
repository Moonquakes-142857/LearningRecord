package com.lcy.lr.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book")
@JsonIgnoreProperties({"handler","hiberbateLazyInitializer"})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @ManyToOne
    @JoinColumn(name="cid")
    private Category category;

    String cover;
    String title;
    String author;
    String date;
    String press;
    String abs;
}
