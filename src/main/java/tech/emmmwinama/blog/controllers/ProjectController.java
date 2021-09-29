package tech.emmmwinama.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.emmmwinama.blog.entities.Employee;
import tech.emmmwinama.blog.entities.Project;
import tech.emmmwinama.blog.repository.EmployeeRepository;
import tech.emmmwinama.blog.repository.ProjectRepository;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    ProjectRepository prorep;

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/new")
    public String displayProjectForm(Model model){
        Project aProject = new Project();
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("project", aProject);
        model.addAttribute("allEmployees", employees);
        return "/projects/new-project";
    }

    @RequestMapping("/")
    public String displayProjectsList(Model model){
        List<Project> projects = prorep.findAll();
        model.addAttribute("aProjects", projects);
        return "/projects/list-projects";
    }

    @PostMapping("/save")
    public String createProject(Project project, @RequestParam List<Long> employees, Model model){
        prorep.save(project);

        Iterable<Employee> chosenEmployees = employeeRepository.findAllById(employees);
        for(Employee emp: chosenEmployees){
            emp.setTheProject(project);
            employeeRepository.save(emp);
        }

        //user redirection to prevent duplicate submissions
        return "redirect:/projects/";
    }
}
