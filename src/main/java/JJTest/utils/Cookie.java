package JJTest.utils;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Cookie {
    public Map getCookie(){
        Response response = given().config((RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation())))
                .contentType("application/x-www-form-urlencoded")
                .body("email=lxj%40123&password=admin")
                .post("http://localhost:8080/login");
        Map cookies = response.getCookies();
        return cookies;
    }
}
