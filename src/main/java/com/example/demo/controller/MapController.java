package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.MapForm;
import com.example.demo.form.User;
import com.example.demo.service.MapService;

@Controller
public class MapController {
	
	@Autowired MapService mapService;
	
	@RequestMapping("")
	public String mapDisp(Model model, User user, MapForm mapForm) {
		String test = mapService.exJSON();
		mapForm.setJsonRslt(test);
		model.addAttribute("mapForm" ,mapForm);
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
