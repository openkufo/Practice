package com.paulhan.practice.test;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class Delete {
    @DeleteMapping
    public void deleteTest(HttpServletResponse response) throws IOException{
        System.out.println("delete");
        response.sendRedirect("/test");
    }
}
