package at.fhtw.marking;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {

    @GetMapping("/api/password-generator")
    public String getPassword(@RequestParam int input) {
        if (input == 1) {
            return "A";
        } else if (input == 2) {
            return "BC";
        } else if (input == 3) {
            return "DEF";
        } else if (input == 0) {
            return "";
        } else {
            return "<invalid>";
        }
    }
}