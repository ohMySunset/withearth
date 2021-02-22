package com.withearth.tumbler.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.withearth.tumbler.domain.Cafe;
import com.withearth.tumbler.service.CafeListSerivce;

import lombok.extern.log4j.Log4j;

@RestController	
@RequestMapping("/tumbler/tumlist1")
@Log4j
public class CafeListController {

	@Autowired
	private CafeListSerivce cafelistSerivce;
	

	@RequestMapping(value="/tumbler/tumlist1", method = RequestMethod.GET)
	public String cafeList(Model model,HttpServletRequest request) {

		List<Cafe> result = cafelistSerivce.cafeView();
		// System.out.println("result!!!" + result); 카페리스트 나옴 

		//model.addAttribute("result", result);
		model.addAttribute("list",cafelistSerivce.cafeView());
		//model.addAttribute("cafelistView",cafelistSerivce.cafelistView());

		return "tumbler/tumlist1";
	}
	
	/*
	@RequestMapping(value="/tumbler/tumlist1", method = RequestMethod.GET)
	public String cafeList(Model model,HttpServletRequest request) {

		List<Cafe> result = cafelistSerivce.cafeView();
		// System.out.println("result!!!" + result); 카페리스트 나옴 

		//model.addAttribute("result", result);
		model.addAttribute("list",cafelistSerivce.cafeView());
		//model.addAttribute("cafelistView",cafelistSerivce.cafelistView());

		return "tumbler/tumlist1";
	}
	
	*/
	
	/*
	@GetMapping("map")
	@ResponseBody 
	public Map<Integer, Cafe> cafeInfo(){
		 Map<Integer, Cafe> cafeMap = new HashMap<Integer, Cafe>();
		 
		 for(Cafe cafe : cafelistSerivce.cafeInfo()) {
			 cafeMap.put(cafe.getCafe_idx(),cafe);
			
		 }

		 
		return cafeMap;
	} */
	
	@GetMapping("map")
	@CrossOrigin
	public List<Cafe> cafeList(){
		
		return cafelistSerivce.cafeView();
	}
	 
	
	/*
	@GetMapping("/tumbler")
	@CrossOrigin
	public String cafelistView(Cafe cafe, ModelMap model){
		
		List<Cafe> result = cafelistSerivce.cafelistView();
		
		model.addAttribute("list",cafelistSerivce.cafelistView());
		//model.addAttribute("cafelistView",cafelistSerivce.cafelistView());

		return "tumbler/tumlist1";
	}
	
	*/


}
