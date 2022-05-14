package in.siddharthmishra.springmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.siddharthmishra.springmybatis.dao.EmployeeMapper;
import in.siddharthmishra.springmybatis.entity.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeMapper mapper;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("ListEmployees");
		mav.addObject("listemployees", mapper.getAllEmployees());
		return mav;
	}

	@RequestMapping("showFormForAddEmployee")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("");
		mav.addObject("employee", new Employee());
		return mav;
	}

}
