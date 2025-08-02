package com.abhishek.projects.controller;

import com.abhishek.projects.api.TestAPI;

public class TestController implements TestAPI {

    public String testApplication() {
        return "Application is up and running!!!";
    }
}
