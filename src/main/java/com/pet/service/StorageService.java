package com.pet.service;

import org.springframework.web.multipart.MultipartFile;

import com.pet.persistence.model.User;

public interface StorageService {

	void init();

	User store(MultipartFile file, String path);

	void deleteAll();

}