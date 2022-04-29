package co.edu.escuelaing.dtos;

import java.util.Date;

public class TaskDto {
    private String name;
    private Date creationDate;

    public TaskDto(String name, Date creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
