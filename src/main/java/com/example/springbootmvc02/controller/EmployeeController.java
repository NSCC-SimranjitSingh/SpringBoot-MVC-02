package com.example.springbootmvc02.controller;

import com.example.springbootmvc02.entity.Employee;
import com.example.springbootmvc02.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImply;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("allemplist", employeeServiceImply.getAllEmployee());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "newemployee";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteThroughID(@PathVariable(value = "id") long id){
        employeeServiceImply.deleteById(id);
        return "redirect";
    }

    @GetMapping("/save")
    public String  saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeServiceImply.save(employee);
        return "redirect";
    }
}
