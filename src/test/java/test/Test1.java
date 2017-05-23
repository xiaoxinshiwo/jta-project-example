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
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Controller
public class Test1 {
    @Autowired
    private TestService testService;



    @Test
    public void test2(){
        testService.update();
    }


}