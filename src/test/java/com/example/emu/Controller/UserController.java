package com.example.emu.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import java.util.Date;
import java.time.LocalDate;


@RestController
    public class ApiController {

    @GetMapping("/User")
    public USER getUser() {
        USER User = new USER("admin", "password");
        return User;
    }

    @PostMapping("/User")
    public USER postUser(@RequestBody USER User) {
        User.getClass(new Date());
        return User;
//
//
//    }
//}

//        @GetMapping("/json")
//        public String getJson() {
//            return "{\"Tanya\": \"1789j\"}";
//
//
//        }
//
//        @PostMapping("/json")
//        public ApiResponse postJson(@RequestBody UserCredentials credentials) {
//            return new ApiResponse(credentials.getLogin(), credentials.getPassword(), LocalDateTime.now());
//        }

//
//        public String getData() {
//            return "{\"key\": \"value\"}";
//        }

//    public USER get() {
//        return new USER(this.login, this.password);
//    }
//
//    public USER post(String login, String password) {
//        USER user = new User(login, password);
//        user.currentDate = new Date();
//        return user;
//    }


//        public static class UserCredentials {
//            private String login;
//            private String password;

            // getters and setters

//            public String getLogin() {
//                return login;
//            }
//
//            public void setLogin(String login) {
//                this.login = login;
//            }
//
//            public String getPassword() {
//                return password;
//            }
//
//            public void setPassword(String password) {
//                this.password = password;
//            }
//        }

//        public static class ApiResponse {
//            private String login;
//            private String password;
//             private LocalDateTime date;

            // constructors, getters and setters

           // public ApiResponse(String login, String password, LocalDateTime date) {
             //   this.login = login;
             //   this.password = password;
             //   this.date = date;
          //  }

//            public String getLogin() {
//                return login;
//            }
//
//            public void setLogin(String login) {
//                this.login = login;
//            }
//
//            public String getPassword() {
//                return password;
//            }
//
//            public void setPassword(String password) {
//                this.password = password;
//            }
//
//            public LocalDateTime getDate() {
//                return date;
//            }

           // public void setDate(LocalDateTime date) {
            //    this.date = date;
           // }
        }



