package com.wicafe.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wicafe.demo.entity.User;



@Repository
public interface MapRepository extends JpaRepository<User,Integer> {

	 /**
	  * 検索IDを引数にUserDataオブジェクトを取得する
	  * @param id 検索ID
	  * @return UserDataオブジェクト
	  */
		/*public List<User> findByStore_id(Integer store_id);
		public List<User> findByStore_name(String store_name);*/

	}