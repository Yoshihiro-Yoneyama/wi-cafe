package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;


@Repository
public interface MapRepository extends JpaRepository<User, Long> {

	 /**
	  * 検索IDを引数にUserDataオブジェクトを取得する
	  * @param id 検索ID
	  * @return UserDataオブジェクト
	  */
	 User findUserDataById(Long store_id);

	}