package com.paulhan.practice.test;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paulhan.practice.domain.Person;

@Controller
@RequestMapping("/")
public class Home {
    @GetMapping
    public String home(Model model){
        Person person = new Person();
        person.setName("test");
        person.setAge(16);

        model.addAttribute("person", person);
        return "index";
    }

    @GetMapping("test")
    public String test(){
        return "test";
    }
    
    @PostConstruct
    public void init(){
        System.out.println("주소 -> http://localhost:9090");
    }
}
