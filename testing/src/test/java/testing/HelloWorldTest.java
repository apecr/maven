package testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldTest {
    
    @InjectMocks
    private HelloWorld helloWorld;
    
    @Test
    public void testHello(){
        this.helloWorld.hello();
    }
    
}
