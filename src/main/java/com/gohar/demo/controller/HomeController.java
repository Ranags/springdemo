package com.gohar.demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
   public  String sayhelloGet() {
        return "hello from get";

    }
        @PostMapping("/")
        public  String sayhelloPost() {
            return "hello from post";
        }
            @PutMapping("/")
            public  String sayhelloput() {
                return "hello put";
            }
                @DeleteMapping("/")
                public  String sayhelloDelete(){
                    return "hello delete" ;

}
}
