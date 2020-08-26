package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Rest {


    @BeforeAll
    public static void setup(){
       baseURI = "https://cybertek-ui-names.herokuapp.com/api/";
    }

    @DisplayName("No param test")
    @Test
    public void noParamTest(){
//        items : [
//                {
//                "name": "Florența",
//                "surname": "Bodescu",
//                "gender": "female",
//                "region": "Romania"
//                }
//                ]

        when().
                get().prettyPeek().
        then().
                assertThat().
                statusCode(200).
                contentType("application/json; charset=utf-8").
                header("Content-Type","application/json; charset=utf-8").
                body("name", notNullValue()).
                and().
                body("surname",notNullValue()).
                body("gender",notNullValue()).
                body("region",notNullValue());
//
//
//        String data = "{\n" +
//                "  \"name\"   : \"Bootcamp user\",\n" +
//                "  \"gender\" : \"Male\",\n" +
//                "  \"phone\"  : 2131231231\n" +
//                "}" ;
//
//        given()
//                .log().all()
//                .contentType(ContentType.JSON) // extremely important for server to know whats the contenttpe you are sending
//                .body(data).
//                when()
//                .post("/spartans").
//                then()
//                .log().all()
//                .statusCode(201)
//                .body("success",is("A Spartan is Born!"))
//                .body("data.name",is("Bootcamp user") )
//                .body("data.gender",equalTo("Male"))
//        ;

    }

    @DisplayName("Amount and regions test")
    @Test
    public void amountAndRegionsTest(){

        Response response = given().
                                    queryParam("region","Albania").
                                    queryParam("amount",300).
                            when().
                                    get().prettyPeek();

        List<User> listOfUsers = response.jsonPath().getList("",User.class);

        System.out.println(listOfUsers);

        Set<String>fullNameList = new HashSet<>();

        for (User eachUser:listOfUsers) {
            String fullName = eachUser.getName() + " " + eachUser.getSurname();
            fullNameList.add(fullName);
        }

        response.then().
                        assertThat().
                    statusCode(200).
                    contentType("application/json; charset=utf-8").
                    body("size()",is(fullNameList.size()));



//  items: [
//    person : {
//                        "name": "Ufuk",
//                "surname": "Mustafa",
//                "gender": "male",
//                "region": "Turkey"
//    },
//      person:  {
//            "name": "Osman",
//                "surname": "Avcı",
//                "gender": "male",
//                "region": "Turkey"
//        },
//        {
//            "name": "Ercüment",
//                "surname": "Özkes",
//                "gender": "male",
//                "region": "Turkey"
//        },
//        {
//            "name": "Nesrin",
//                "surname": "Aydoğdu",
//                "gender": "female",
//                "region": "Turkey"
//        }
//]


    }




}

