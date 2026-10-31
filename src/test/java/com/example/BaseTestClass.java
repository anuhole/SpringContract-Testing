package com.example;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestClass {
    @BeforeEach
    void setUp(){
        RestAssured.baseURI="http://localhost:8080";
    }
}
