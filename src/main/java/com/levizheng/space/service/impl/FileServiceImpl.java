package com.levizheng.space.service.impl;

import com.levizheng.space.service.IFileService;
import io.minio.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author levi
 * @since 2023/12/28
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class FileServiceImpl implements IFileService {

    private final MinioClient minioClient;

    @Value("${minio.bucketName}")
    private String bucketName;

    @Override
    public void upload(MultipartFile file, String objectName) {
        try {
            if (!minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build())) {
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
            }
            this.minioClient.putObject(PutObjectArgs.builder()
                    .bucket(bucketName)
                    .stream(file.getInputStream(), file.getSize(), -1)
                    .object(objectName)
                    .build());
        } catch (Exception e) {
            log.error("发生异常:{}", e.getMessage());
        }
    }
}
