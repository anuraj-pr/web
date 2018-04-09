package com.rel.dft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControler {

	@RequestMapping("/hi")
	public String hi(){
		return "hi";
	}
}
