package com.wicafe.demo.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wicafe.demo.entity.User;
import com.wicafe.demo.repository.MapRepository;

@Controller
public class MapController {
	
	@Autowired
	MapRepository repository;
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	/*@ResponseBody*/
	@RequestMapping("")
	public String mapDisp() {
		return "wi-cafe_map";
	}
		
	/*User user = (User) jdbctemplate.queryForList("select latitude from map_marker");
		return getJson(user);
    }*/
    @ResponseBody
    @RequestMapping("/setMarker")
    public String jsontest(){
        List<Map<String,Object>> location = jdbctemplate.queryForList("select * from map_marker where delete_flg not in (1)");

    	// Location location = new Location();
    	
    	// location.setLatitude(35.7102);
    	// location.setLongitude(139.8132);
		// String json = "{\"latitude\":35.7102,\"longitude\":139.8132}";
    	// JSON変換用クラス
    	ObjectMapper mapper = new ObjectMapper();
    	
    	try {
    		String json = mapper.writeValueAsString(location); 
    		return json;
    	}catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
        
    }

/*********テスト用ページ***************/
	/*マップ表示のみ
	 * 
	 * @RequestMapping("leafmap")
	public String leafmapDisp() {
		return "leafmap";
	}
	
	/*マーカー色変更
	@RequestMapping("marker_colorTest")
	public String markerDisp() {
		return "marker_colorTest";
	}
	
	/*アイコン変更
	@RequestMapping("icon")
	public String iconDisp() {
		return "icon";
	}*/
    
    @RequestMapping("wi-cafe_map")
	public String markerDisp2() {
		return "wi-cafe_map";
	}

	/*ハンバーガーメニューホーム画面*/
	@RequestMapping("home")
	public String homeDisp(){
		return "home";
	}
	
	/*ハンバーガーメニュープライバシーポリシー*/
	@RequestMapping("privacypolicy")
	public String policyDisp(){
		return "privacypolicy";
	}

	/*ハンバーガーメニュー自己紹介*/
	@RequestMapping("person")
	public String personDisp(){
		return "person";
	}

/*------共通------*/
	private String encode(String data){
        // 引数がnullまたは空文字の場合は、その値を返す
        if(StringUtils.isEmpty(data)){
            return data;
        }
        String retVal = null;
        try{
            retVal = URLEncoder.encode(data, "UTF-8");
        }catch (UnsupportedEncodingException e) {
            System.err.println(e);
        }
        return retVal;
    }
	
	/**
     * 引数のUserDataオブジェクトをJSON文字列に変換する
     * @param userData UserDataオブジェクト
     * @return 変換後JSON文字列
     */
    private String getJson(User user){
        String retVal = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            retVal = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            System.err.println(e);
        }
        return retVal;
    }
}
