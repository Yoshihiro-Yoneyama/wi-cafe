package com.example.demo.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import com.example.demo.entity.User;
import com.example.demo.repository.MapRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class MapController {
	
	@Autowired
	MapRepository repository;
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	/*@ResponseBody*/
	@RequestMapping("")
	public String mapDisp() {
		return "homemap";
	}
		
	/*User user = (User) jdbctemplate.queryForList("select latitude from map_marker");
		
		return getJson(user);
    }*/
    @ResponseBody
    @RequestMapping("/marker_colorTest2_test")
    public String jsontest(){
        String json = "{\"latitude\":35.7102,\"longitude\":139.8132}";
        return json;
    }

	
	@RequestMapping("leafmap")
	public String leafmapDisp() {
		return "leafmap";
	}
	
	@RequestMapping("marker_colorTest")
	public String markerDisp() {
		return "marker_colorTest";
	}
	
	@RequestMapping("icon")
	public String iconDisp() {
		return "icon";
    }
    
    @RequestMapping("marker_colorTest2")
	public String markerDisp2() {
		return "marker_colorTest2";
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
