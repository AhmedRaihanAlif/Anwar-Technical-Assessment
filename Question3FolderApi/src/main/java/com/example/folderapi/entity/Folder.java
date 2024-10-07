package com.example.folderapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Folder {

    @Id
    private int id;
    private Integer parentId;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
