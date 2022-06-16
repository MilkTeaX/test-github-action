package com.lemonsoul.testgithubaction.controller;


import com.lemonsoul.testgithubaction.service.InfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    private final InfoService logsService;

    public DockerController(InfoService logsService) {
        this.logsService = logsService;
    }

    @RequestMapping("/")
    public String index() {
        return "Hello Github!";
    }

    @GetMapping("/getAllLogs")
    public String getAllLogs(){
        return this.logsService.getAllLogs();
    }
}