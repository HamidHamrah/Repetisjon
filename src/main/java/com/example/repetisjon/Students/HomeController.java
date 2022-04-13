package com.example.repetisjon.Students;

import com.example.repetisjon.Students.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    public final StudentsService studentsService;

    @Autowired
    public HomeController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

}
