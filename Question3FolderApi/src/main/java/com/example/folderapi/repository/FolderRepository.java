package com.example.folderapi.repository;

import com.example.folderapi.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Integer> {
    // Method to find folders by their parentId
    List<Folder> findByParentId(Integer parentId);
}

