package com.withearth.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.withearth.member.service.LeaveIdCheckService;
import com.withearth.member.service.MemberIdCheckService;

@RestController
public class LeaveIdCheckController {

	@Autowired
	private LeaveIdCheckService idcheckService;
	
	@GetMapping("/member/leaveidcheck")
	public String idcheck(
			@RequestParam("id") String id
			) {
		return idcheckService.checkId(id);
	}
	
	
	
	
}
