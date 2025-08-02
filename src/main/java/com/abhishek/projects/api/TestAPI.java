package com.abhishek.projects.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/myapp")
public interface TestAPI {

    @GetMapping("test-app")
    String testApplication();
}
