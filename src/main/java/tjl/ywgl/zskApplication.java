package tjl.ywgl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class zskApplication {
    public static void main(String[] args) {
        SpringApplication.run(zskApplication.class, args);

    }
}
