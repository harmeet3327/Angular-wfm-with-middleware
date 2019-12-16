package com.wfm.controllers;

@Controller
public class FrontController {
	
	@Autowired ResourcesDetail resDao;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	
	public String hello(ModelMap map)
	
	{
		map.addAttribute("msg","Welcome To MVC User");
		
		return "";
	}

}
