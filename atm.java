import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloNikhilApp {

    @GetMapping("/")
    public String hello() {
        // ANSI colors work only in console, not browsers,
        // so we'll use simple HTML with colors instead
        return "<span style='color:red'>Hello, </span>" +
               "<span style='color:green'>I am </span>" +
               "<span style='color:blue'>NIKHIL DevOps Engineer</span>";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloNikhilApp.class, args);
    }
}
