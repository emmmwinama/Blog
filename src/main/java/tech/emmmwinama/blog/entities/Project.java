package tech.emmmwinama.blog.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class Project {
    // Class attributes || Properties
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;

    private String name;
    private String stage;
    private String description;

    @OneToMany(mappedBy="theProject")
    private List<Employee> employees;


    // Constructors
    public Project() {
    }

    public Project(String name, String stage, String description) {
        super();
        this.name = name;
        this.stage = stage;
        this.description = description;
    }

    //Getters and Setters


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

