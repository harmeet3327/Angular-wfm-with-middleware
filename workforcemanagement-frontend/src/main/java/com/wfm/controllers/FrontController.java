package com.wfm.controllers;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wfm.models.ResAssignmentReq;
import com.wfm.models.ResourcesDetail;
import com.wfm.models.ResourcesRoles;
import com.wfm.models.Skills;
import com.wfm.models.SuggestionsByAdmin;
import com.wfm.services.RequestAssignmentDaoService;
import com.wfm.services.ResourceService;
import com.wfm.services.ResourcesRoleService;
import com.wfm.services.SkillService;
import com.wfm.services.SuggestionsByAdminDaoService;



@RestController
@CrossOrigin("http://localhost:4200")
public class FrontController {
	
	@Autowired HttpSession session;
	@Autowired ResourceService resService;
	@Autowired ResourcesRoleService roleService;
	@Autowired SkillService skillService;
	@Autowired RequestAssignmentDaoService reqService;
	@Autowired SuggestionsByAdminDaoService suggService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	
	public String hello(ModelMap map)
	
	{
		map.addAttribute("msg","Welcome To MVC User");
		
		return "Home";
	}


@RequestMapping(value="/signin",method=RequestMethod.GET)

public String signInForm()

{
	
	return "SignIn";


}

@RequestMapping(value="/admin",method=RequestMethod.GET)

public String adminPage(ModelMap map)

{
if(checkSession(map)) {
        
        return "SignIn";
        }
	return "WelcomeAdmin";


}
@RequestMapping(value="/manager",method=RequestMethod.GET)

public String managerPage(ModelMap map )

{
if(checkSession(map)) {
        
        return "SignIn";
        }
	return "WelcomeManager";


}
@RequestMapping(value="/resource",method=RequestMethod.GET)

public String resourcePage(ModelMap map)

{
if(checkSession(map)) {
        
        return "SignIn";
        }
	return "WelcomeEmployee";


}


@RequestMapping(value="/login",method=RequestMethod.POST)
public ResponseEntity<?>  loginResource(@RequestParam int rId,@RequestParam String rPassward,ModelMap map){
	
	ResourcesDetail rObj=resService.validateResource(rId,rPassward);
	System.out.println("I m here.... 1");
	
	if(rObj!=null )
	{
        System.out.println("I m here.... 2");
        return new ResponseEntity<ResourcesDetail>(rObj,HttpStatus.OK);
//		session.setAttribute("rObj", rObj);
//		if(rObj.getRole().getRoleType().equalsIgnoreCase("MANAGER"))
//		{
//		return "WelcomeManager";
//		}
//		if(rObj.getRole().getRoleType().equalsIgnoreCase("ADMIN"))
//		{
//		return "WelcomeAdmin";
//		}
//		else
//		{
//		return "WelcomeEmployee";
//		}
//	
//	}
//	map.addAttribute("msg","Wrong id passward");
//	return "SignIn";
//	
}
	
    else {
        System.out.println("I m here.... 3");
        return new ResponseEntity<String>("User is Invalid",HttpStatus.UNAUTHORIZED);
        
}

}

@RequestMapping(value="/getAllSkills",method=RequestMethod.GET)
@ResponseBody
public List<Skills>  getAllSkills()
{
       
       return skillService.getAllSkills(); 
       
}
@RequestMapping(value="/getAllRes",method=RequestMethod.GET)
@ResponseBody
public List<ResourcesDetail>  getAllResource()
{
       
       return resService.getAllResources(); 
       
}

@RequestMapping(value="/getAllRoles",method=RequestMethod.GET)
@ResponseBody
public List<ResourcesRoles>  getAllRoles()
{
       
       return roleService.getAllRoles(); 
       
}
@RequestMapping(value="/start",method=RequestMethod.GET)
@ResponseBody
public List<ResAssignmentReq>  getStartRequest()
{
  
       return reqService.getStartRequest(); 
       
}
@RequestMapping(value="/end",method=RequestMethod.GET)
@ResponseBody
public List<ResAssignmentReq>  getCloseRequest()
{
        
       return reqService.getEndRequest(); 
 
       
}


public boolean checkSession(ModelMap map) {

    if(session.getAttribute("rObj")==null)
    {
           map.addAttribute("msg",", Please login again");
                                                    

    return true;
    }
    return false;
    }


@RequestMapping(value="/detail",method=RequestMethod.GET)
public String detailsForm( ModelMap map)
{
	if(checkSession(map)) {
        
        return "SignIn";
        }

	
	return "EmployeeDetails";
	
}


@RequestMapping(value="/Addres",method=RequestMethod.GET)

public String resForm(ModelMap map)

{
	if(checkSession(map)) {
        
        return "SignIn";
        }

	List<ResourcesRoles> rlist=roleService.getAllRoles();
	List<Skills> slist=skillService.getAllSkills();
	map.addAttribute("rObj", new ResourcesDetail());
	map.addAttribute("rlist",rlist);
	map.addAttribute("slist", slist);

	
	return "AddResource";
}
@RequestMapping(value="/addRes",method=RequestMethod.POST)

//public  ModelAndView RegisterResource(@Valid @ModelAttribute("rObj") ResourcesDetail rObj ,BindingResult result,ModelMap map)
public  ResponseEntity<?>  RegisterResource(@RequestBody ResourcesDetail rObj)
{
//if(checkSession(map)) {
//        
//        return new ModelAndView("SignIn");
//        }
//	if (result.hasErrors()) {
//    ModelAndView Error = new ModelAndView("AddResource");
//    Error.addObject("slist", skillService.getAllSkills());
//    Error.addObject("rlist", roleService.getAllRoles());
//    return Error;
//	}
	boolean flag=resService.addResourse(rObj);
	if(flag==true)
	{
	//ModelAndView mv=new ModelAndView("WelcomeAdmin");
		return new ResponseEntity<String>("Add Success ",HttpStatus.OK);

	//mv.addObject("msg","Resource has been registered succesfully.");
	//return mv;
	}
	else 
	{
		return new ResponseEntity<String>("dikkt h",HttpStatus.INTERNAL_SERVER_ERROR);
//		ModelAndView mv=new ModelAndView("AddResource");
//		mv.addObject("msg","Problem in adding resource.");
//		return mv;
	}
	
	}

@RequestMapping(value="/requestdetail",method=RequestMethod.GET)
public ModelAndView reqDetail(ModelMap map)

{
	if(checkSession(map)) {
        
        return new ModelAndView("SignIn");
        }
	List<ResAssignmentReq> reqList=reqService.getStartRequest();
	ModelAndView mv=new ModelAndView("RequestDetails");
	mv.addObject("reqList",reqList);
	session.setAttribute("reqList", reqList);
	return mv;
	
}
@RequestMapping(value="/suggestReqForm/{reqId}",method=RequestMethod.GET)
@ResponseBody
//public ModelAndView suggestionForm(@PathVariable int reqId ,ModelMap map )
//{
//	if(checkSession(map)) {
//        
//        return new ModelAndView("SignIn");
//        }
//	ResAssignmentReq reqObj=reqService.getReqById(reqId);
//	int rlId=reqObj.getRarRoleId();
//	int exp=reqObj.getReqRequiredExp();
//	String skill=reqObj.getReqSkills();
//	
//	System.out.println("SKILL"+ skill);
//	
//	List<ResourcesDetail> suggList=resService.getResourceByTypes(rlId, exp, skill);
//	System.out.println("hello"+ suggList);
//	ModelAndView mv=new ModelAndView("SuggestionForm");
//	mv.addObject("suggList",suggList);
//	mv.addObject("reqId",reqId);
//	mv.addObject("sObj", new SuggestionsByAdmin() );
//
//	return mv;
//	
//}
public List<ResourcesDetail> suggestionForm(@PathVariable int reqId  ) {

	ResAssignmentReq reqObj=reqService.getReqById(reqId);
	int rlId=reqObj.getRarRoleId();
	int exp=reqObj.getReqRequiredExp();
	String skill=reqObj.getReqSkills();
	
	System.out.println("SKILL"+ skill);
	
	List<ResourcesDetail> suggList=resService.getResourceByTypes(rlId, exp, skill);
	System.out.println("suggList"+ suggList);
	return suggList;
}
@RequestMapping(value="/addSuggestion/{rId}/{reqId}",method=RequestMethod.GET)

//public String addSuggestions(@PathVariable int rId,@PathVariable int reqId,SuggestionsByAdmin sObj,ResourcesDetail rObj,ResAssignmentReq reqObj,ModelMap map)	
//{                
//	
//	if(checkSession(map)) {
//        
//        return "SignIn";
//        }
//
//	 rObj=resService.getResourceById(rId);
//	 reqObj=reqService.getReqById(reqId);
//	
//	
//	suggService.addSuggestions(sObj,reqId,rId,rObj,reqObj);
//	
//	
//	return "redirect:/suggestReqForm/"+reqId;
//	
//}
@ResponseBody
public  ResponseEntity<?> addSuggestions(@PathVariable int rId,@PathVariable int reqId,SuggestionsByAdmin sObj,ResourcesDetail rObj,ResAssignmentReq reqObj)
{
	rObj=resService.getResourceById(rId);
	 reqObj=reqService.getReqById(reqId);
	 
	 suggService.addSuggestions(sObj,reqId,rId,rObj,reqObj);
	 
	 return  new ResponseEntity<String>("Add Success ",HttpStatus.OK);
}

@RequestMapping(value="/logout",method=RequestMethod.GET)

public String signFormOnlogOut(ModelMap map)

{
	if (session != null ) {
		  map.addAttribute("msg","you are sucessfully LogOut");
		  session.invalidate();
		 }
	return "SignIn";


}
@RequestMapping(value="/allDetails",method=RequestMethod.GET)

public String allDetails(ModelMap map)

{

	if(checkSession(map)) {
        
        return "SignIn";
        }
	List<ResourcesDetail> resList=resService.getAllResources();
	map.addAttribute("resList",resList);
	return "AllResourceDetails";
	


}
@RequestMapping(value="/allReq",method=RequestMethod.GET)

public String allrequest(ModelMap map)

{
	System.out.println("all req");
	if(checkSession(map)) {
        
        return "SignIn";
        }
	System.out.println("all req");
	List<ResAssignmentReq> reqList=reqService.getAllRequest();
	System.out.println(reqList);
	map.addAttribute("reqList",reqList);
	return "AllRequest";
	


}


}
