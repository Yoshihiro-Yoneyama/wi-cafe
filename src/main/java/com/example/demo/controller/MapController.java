package com.example.demo.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//テスト
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import com.example.demo.entity.User;
import com.example.demo.repository.MapRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import antlr.collections.List;

@Controller
public class MapController {
	
	@Autowired
	MapRepository repository;
	
	@ResponseBody
	@RequestMapping("")
	public String mapDisp() {
		
		List list = (List) repository.findAll();
		
		
		
		
		
		
		return "homemap";
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
