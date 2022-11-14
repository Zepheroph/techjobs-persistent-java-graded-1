package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    //make a jobs field
    //add a getter&setter to it
    //add a @ManyToMany(mappedBy="skills") annotation to it


    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message= "A description is needed")
    @Size(min=10, max=250, message="Your skill needs a  detailed description between 10 and 250 characters long")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}