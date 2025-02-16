package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by LaunchCode
 */
@Entity
/*flag that tells springboot that you want to store this class in the database. this tells it to store every field
within this class to be sent to a table within the database unless you designate otherwise
 */


public class Cheese {

    @Id
    @GeneratedValue
    /* @Id this tells hibernate that this should ba a primary key field within the database. @GeneratedValue says that
    the data layer should generate the value for us and it should manage that value creation.
     */
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

    @ManyToOne
    private Category category;

    @ManyToMany(mappedBy = "cheeses")
    private List<Menu> menus;

//    private CheeseType type;

    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Cheese() { }

    public int getId() {
        return id;
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

//    public CheeseType getType() {
//        return type;
//    }
//
//    public void setType(CheeseType type) {
//        this.type = type;
//    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}
