package com.example.folderapi.service;

import com.example.folderapi.entity.Folder;
import com.example.folderapi.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FolderService {

    @Autowired
    private FolderRepository folderRepository;

    // Method to get all folder IDs recursively
    public List<Integer> getFolderIdsByParentId(int folderId) {
        List<Integer> folderIds = new ArrayList<>();
        recursiveFolderIdFetch(folderId, folderIds);
        return folderIds;
    }

    // Recursive method to find folder IDs
    private void recursiveFolderIdFetch(int folderId, List<Integer> folderIds) {
        folderIds.add(folderId);
        List<Folder> children = folderRepository.findByParentId(folderId);
        for (Folder folder : children) {
            recursiveFolderIdFetch(folder.getId(), folderIds);
        }
    }
}
