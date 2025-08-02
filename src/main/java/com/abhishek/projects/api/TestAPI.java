package com.abhishek.projects.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp")
public interface TestAPI {

    @GetMapping("test-app")
    public String testApplication();
}
