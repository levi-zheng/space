package com.levizheng.space.controller;

import com.levizheng.space.service.IFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author levi
 * @since 2023/12/23
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("file")
public class FileController {

    private final IFileService fileService;

    @PostMapping("upload")
    public void upload(@RequestParam("file") MultipartFile file) {
        this.fileService.upload(file,file.getOriginalFilename());
    }
}
