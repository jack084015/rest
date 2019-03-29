package JJTest.utils;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class httputil {
    Cookie cookie = new Cookie();
    public void getHttp(String uri){

        Response response = given().config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .cookies(cookie.getCookie())
                .get(uri);
        response.print();
    }
    public void postHttp(String uri,String body){
        Response response = given().config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .contentType("application/x-www-form-urlencoded")
                .cookies(cookie.getCookie())
                .body(body)
                .post(uri);
        response.print();
    }
}
