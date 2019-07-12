package com.pet.persistence.dao;

import org.apache.ibatis.annotations.Mapper;

import com.pet.persistence.model.VerificationToken;

@Mapper
public interface VerificationTokenMapper {

	int save(VerificationToken token);

	VerificationToken findByToken(String token);

	VerificationToken findByUserId(Long userId);

}