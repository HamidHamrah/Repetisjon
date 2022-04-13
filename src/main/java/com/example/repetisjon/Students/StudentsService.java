package com.example.repetisjon.Students;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    public List<Students> getStudents(){
        return List.of(new Students("Hamid", 21,"Male"));
    }
}
