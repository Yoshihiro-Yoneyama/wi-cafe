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
}
