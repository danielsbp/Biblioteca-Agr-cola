package application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import application.repositories.AutorRepository;

@Controller
@RequestMapping("/Autor")
public class AutorController{

    @Autowired
    private AutorRepository autorRepo;

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("Autores", autorRepo.findAll());
        return "list.jsp";
    }


}