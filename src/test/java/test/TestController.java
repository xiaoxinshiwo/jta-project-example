package test;

import com.xiaoxin.service.PersonService;
import com.xiaoxin.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mybatis.xml")
@Controller
public class TestController {   

    @Autowired
    private PersonService personService;

    @Test
    public void testMybatisAdd(){
        double name=Math.random();
        personService.addOnePerson(String.valueOf(name));
    }
}