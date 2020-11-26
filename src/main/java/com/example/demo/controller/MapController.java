package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//テスト

@Controller
public class MapController {
	@RequestMapping("")
	public String mapDisp() {
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
}
