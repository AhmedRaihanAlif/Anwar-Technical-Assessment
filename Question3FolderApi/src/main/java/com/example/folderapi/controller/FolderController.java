package com.example.folderapi.controller;

import com.example.folderapi.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FolderController {

    @Autowired
    private FolderService folderService;

    @PostMapping("/getidbyfolderid/{folderId}")
    public List<Integer> getFolderIdsByFolderId(@PathVariable int folderId) {
        return folderService.getFolderIdsByParentId(folderId);
    }
}
