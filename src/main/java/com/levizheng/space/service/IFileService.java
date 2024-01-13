package com.levizheng.space.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author levi
 * @since 2023/12/23
 */
public interface IFileService {

    /**
     * 上传文件
     */
    void upload(MultipartFile file,String objectName);
}
