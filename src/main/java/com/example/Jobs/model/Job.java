package com.example.Jobs.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "JOB")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_of_site")
    private String name_of_site;

    @Column(name="criteria")
    private String criteria;

    @Column(name="criteria_value")
    private String criteria_value;

    @Column(name="priority")
    private int priority;

    @Column(name="tmp_priority")
    private int tmp_priority;

    @Column(name="time_of_last_fetch")
    private Date last_fetched;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_of_site() {
        return name_of_site;
    }

    public void setName_of_site(String name_of_site) {
        this.name_of_site = name_of_site;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public String getCriteria_value() {
        return criteria_value;
    }

    public void setCriteria_value(String criteria_value) {
        this.criteria_value = criteria_value;
    }

    public Job() {
    }

    public Job(Long id, String name_of_site, String criteria, String criteria_value, int priority) {
        this.id = id;
        this.name_of_site = name_of_site;
        this.criteria = criteria;
        this.criteria_value = criteria_value;
        this.priority = priority;
    }
}
