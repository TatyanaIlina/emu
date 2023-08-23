package com.example.emu.Controller;
import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class UserController {
    @GetMapping("/user")
    public static User getUser() {
        return new User("Tanya", "373345");
    }

    @PostMapping("/user")
    public ResponseEntity<Object> postUser(@RequestBody User user) {
        user.setDate();
        try {
            if (user.getLogin() == null || user.getLogin().isEmpty() || user.getPassword() == null || user.getPassword().isEmpty()) {
                throw new IllegalArgumentException("Неверный формат данных");
            }

            return ResponseEntity.ok(user);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

    }
}



