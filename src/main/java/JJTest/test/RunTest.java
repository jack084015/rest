package JJTest.test;

import JJTest.utils.httputil;
import org.testng.annotations.Test;

public class RunTest {
    @Test
    public void test1(){
        httputil http = new httputil();
        http.postHttp("http://localhost:8080/login","email=lxj%40123&password=admin");
    }
    @Test
    public void test2(){
        httputil http = new httputil();
        http.getHttp("https://api.douban.com/v2/book/search?q=自动化测试&start= 0&count= 2");
    }
}
