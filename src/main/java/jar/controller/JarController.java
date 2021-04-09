package jar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JarController {

    @RequestMapping("testJar")
    public String testJar(){
        return "testJar";
    }
}
