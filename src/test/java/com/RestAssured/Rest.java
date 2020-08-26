package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class Rest {


    @BeforeAll
    public static void setup(){
        RestAssured.baseURI = "https://cybertek-ui-names.herokuapp.com/api/";

    }
    @Test
    public void add1SpartanTest1(){

        String data = "{\n" +
                "  \"name\"   : \"Bootcamp user\",\n" +
                "  \"gender\" : \"Male\",\n" +
                "  \"phone\"  : 2131231231\n" +
                "}" ;

        given()
                .log().all()
                .contentType(ContentType.JSON) // extremely important for server to know whats the contenttpe you are sending
                .body(data).
                when()
                .post("/spartans").
                then()
                .log().all()
                .statusCode(201)
                .body("success",is("A Spartan is Born!"))
                .body("data.name",is("Bootcamp user") )
                .body("data.gender",equalTo("Male"))
        ;

    }




}

