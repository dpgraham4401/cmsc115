package com.vimpirate.week8;

/**
 * Create an example class that is capable of instantiating objects and a constructor for the object based on
 * a real-world use case.  Include at least two data fields and one method.
 *
 * @Author: David Graham
 * CMSC 115 - Week 7 Discussion
 */
public class Org {
    private int id;
    private String name;
    private String description;
    private Org parentOrg;

    /**
     * No Arg constructor required by spring boot
     */
    public Org() {
    }

    /**
     * constructor that allows us to initialize the organization
     * with the ID and name data fields.
     */
    public Org(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Org{" +
                "parentOrg=" + parentOrg +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Org getParentOrg() {
        return parentOrg;
    }

    public void setParentOrg(Org parentOrg) {
        this.parentOrg = parentOrg;
    }
}
