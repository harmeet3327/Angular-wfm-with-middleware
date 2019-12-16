package com.wfm.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

@Controller
@CrossOrigin(value="http://localhost:4200")
public class ManagerController {
	
@Autowired RequestAssignmentDaoService reqService;
@Autowired ResourcesRoleService roleService;
@Autowired ResourceService resService;
@Autowired SkillService skillService;
@Autowired SuggestionsByAdminDaoService suggService;
@Autowired HttpSession session;

public boolean checkSession(ModelMap map) {

    if(session.getAttribute("rObj")==null)
    {
           map.addAttribute("msg"," Please login again");
                                                    

    return true;
    }
    return false;
    }

@RequestMapping(value="/req",method=RequestMethod.GET)

public String reqForm(ModelMap map)

{
	if(checkSession(map)) {
        
        return "SignIn";
        }

	
	List<ResourcesRoles> rlist=roleService.getAllRoles();
	List<Skills> slist=skillService.getAllSkills();
	map.addAttribute("reqObj",new ResAssignmentReq());
	map.addAttribute("rlist",rlist);
	map.addAttribute("slist",slist);
	return "ManagerRequest";
}

@RequestMapping(value="/managerReqSubmit",method=RequestMethod.POST)

//public  ModelAndView Addrequest(@Valid @ModelAttribute("reqObj") ResAssignmentReq reqObj ,BindingResult result,ModelMap map)
//
//{
//	if(checkSession(map)) {
//        
//        return new ModelAndView("SignIn");
//        }
//    if (result.hasErrors()) {
//        ModelAndView Error = new ModelAndView("ManagerRequest");
//        Error.addObject("slist", skillService.getAllSkills());
//        Error.addObject("rlist", roleService.getAllRoles());
//        return Error;
// }
//
//	Boolean flag=reqService.raiseRequest(reqObj);
//	if(flag==true)
//	{
//	ModelAndView mv=new ModelAndView("WelcomeManager");
//	mv.addObject("msg","Req raised succesfully.");
//	return mv;
//	}
//	else 
//	{
//		ModelAndView mv=new ModelAndView("ManagerRequest");
//		mv.addObject("msg","Problem in raising req.");
//		return mv;
//	}
//	
public  ResponseEntity<?>  RaiseRequest(@RequestBody ResAssignmentReq reqObj){
	
	Boolean flag=reqService.raiseRequest(reqObj);
	if(flag)
	{
		return new ResponseEntity<String>("Req Success ",HttpStatus.OK);
	}
	else
	{
		return new ResponseEntity<String>("dikkt h",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

@RequestMapping(value="/adminSugg/{projectId}",method=RequestMethod.GET)

//public  ModelAndView adminSuggestions(@PathVariable("projectId") int  projectId ,ModelMap map)
//
//{	
//		if(checkSession(map)) {
//        
//        return new ModelAndView("SignIn");
//        }
//	List<ResAssignmentReq> reqList=reqService.getRequestByProjectId(projectId);
//	
//
//	System.out.println("in Project id suggested list"+reqList);
//	ModelAndView mv=new ModelAndView("AllSuggestionReq");
//	
//
//	mv.addObject("reqList",reqList);
//	return mv;
//
//}
@ResponseBody
public  List<ResAssignmentReq>  adminSuggestions(@PathVariable("projectId") int  projectId )
{
	List<ResAssignmentReq> reqList=reqService.getRequestByProjectId(projectId);
	
	return reqList;
}
@RequestMapping(value="/managerReq/{projectId}",method=RequestMethod.GET)


public  ModelAndView managerRequest(@PathVariable("projectId") int  projectId ,ModelMap map)

{	
		if(checkSession(map)) {
        
        return new ModelAndView("SignIn");
        }
	List<ResAssignmentReq> reqList=reqService.getStartRequestByProjectId(projectId);
	System.out.println("in start project id"+reqList);

	
	ModelAndView mv=new ModelAndView("AllManagerRequest");
	
	mv.addObject("reqList",reqList);
	return mv;

}


//public  ModelAndView adminSuggestion(@PathVariable("reqId") int  reqId,ModelMap map )
//	
//{
//		if(checkSession(map)) {
//        
//        return new ModelAndView("SignIn");
//        }
//	List<Integer> sugggResList=suggService.getSuggestinsByRequestId(reqId);
//	System.out.println("sgList"+sugggResList);
//    List<ResourcesDetail> resList = resService.getResourcesById(sugggResList);
//	
//	ModelAndView mv=new ModelAndView("AdminSuggestionToManager");
//	mv.addObject("resList",resList);
//	mv.addObject("reqId",reqId);
//	return mv;
//}
@RequestMapping(value="/suggestionByAdmin/{reqId}",method=RequestMethod.GET)
@ResponseBody
public  List<ResourcesDetail> adminSuggestion(@PathVariable("reqId") int  reqId )
{
	List<Integer> sugggResList=suggService.getSuggestinsByRequestId(reqId);
	
	 List<ResourcesDetail> resList = resService.getResourcesById(sugggResList);
	 
	 return resList;
	
	}
@RequestMapping(value="/lockSuggestion/{reqId}/{rId}",method=RequestMethod.GET)
@ResponseBody
public   ResponseEntity<?>  lockSuggestion(@PathVariable("reqId") int  reqId ,@PathVariable("rId") int  rId)
{
	List<Integer> suggResList=suggService.getSuggestinsByRequestId(reqId);
	
	ResAssignmentReq reqObj=reqService.getReqById(reqId);
	int pId=reqObj.getProjectId();
	Date sDate=reqObj.getReqProjStartDate();
	Date eDate=reqObj.getReqProjEndDate();
	reqObj.setReqFlag("END");
	reqService.updateRequest(reqObj);
	
	ResourcesDetail rObj=resService.getResourceById(rId);
	if(rObj!=null)
	{
	rObj.setrStatus("LOCKED");
	rObj.setProjectId(pId);
	rObj.setrProStartDate(sDate);
	rObj.setrProEndDate(eDate);
	resService.updateResource(rObj);
	}
	else 
	{
		System.out.println("update nhi ho rha loack valy mai locked resource ka ");
	}
	System.out.println(suggResList);
	try {
		System.out.println("in remove try");
	boolean remove=suggResList.remove(new Integer(rId));
	
	System.out.println(suggResList);
	if(remove==true)
	{
		System.out.println("in remove true");
		resService.updateResourceListStatusToBench(suggResList);
		List<SuggestionsByAdmin> suggObj=suggService.getSuggestionsByRequestId(reqId);
		//suggService.deleteSuggestion(suggObj);
		
		System.out.println("sb ho gya");
	}
	else {
	System.out.println("nhi ho rha");
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
	return new ResponseEntity<String>("Success in addition of Resource ", HttpStatus.OK);
}

//public  String lockSuggestion(@PathVariable("reqId") int  reqId ,@PathVariable("rId") int  rId,ModelMap map)
//	
//{
//		if(checkSession(map)) {
//        
//        return "SignIn";
//        }
//			List<Integer> suggResList=suggService.getSuggestinsByRequestId(reqId);
//			
//			
//			ResAssignmentReq reqObj=reqService.getReqById(reqId);
//			int pId=reqObj.getProjectId();
//			Date sDate=reqObj.getReqProjStartDate();
//			Date eDate=reqObj.getReqProjEndDate();
//			reqObj.setReqFlag("END");
//			reqService.updateRequest(reqObj);
//			
//			
//			ResourcesDetail rObj=resService.getResourceById(rId);
//			if(rObj!=null)
//			{
//			rObj.setrStatus("LOCKED");
//			rObj.setProjectId(pId);
//			rObj.setrProStartDate(sDate);
//			rObj.setrProEndDate(eDate);
//			resService.updateResource(rObj);
//			}
//			else 
//			{
//				System.out.println("update nhi ho rha loack valy mai locked resource ka ");
//			}
//			System.out.println(suggResList);
//			try {
//				System.out.println("in remove try");
//			boolean remove=suggResList.remove(new Integer(rId));
//			
//			System.out.println(suggResList);
//			if(remove==true)
//			{
//				System.out.println("in remove true");
//				resService.updateResourceListStatusToBench(suggResList);
//				List<SuggestionsByAdmin> suggObj=suggService.getSuggestionsByRequestId(reqId);
//				//suggService.deleteSuggestion(suggObj);
//				
//				System.out.println("sb ho gya");
//			}
//			else {
//			System.out.println("nhi ho rha");
//			}
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//	
//	return "WelcomeManager";
//}


}
