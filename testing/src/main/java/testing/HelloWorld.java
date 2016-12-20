package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

public class HelloWorld {
    
    private Properties props;
    
    public HelloWorld() throws IOException, URISyntaxException {
        this.props = new Properties();
        URL url = HelloWorld.class.getResource( "/resources/Application.properties" );
        File file = new File( url.toURI()  );
        InputStream inStream = new FileInputStream( file  );
        this.props.load( inStream  );
    }



    public void hello(){
        System.out.println("Hello " + this.props.getProperty( "environment" ));
    }
    
}
