package co.simplon.apidemo.controller;

import co.simplon.apidemo.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/message")
    public ResponseEntity<Message> printMessage() {
        return ResponseEntity.ok(new Message("C'est bientôt la pause, non ?"));
    }

    @PostMapping("/message")
    public ResponseEntity<Message> addMessage(@RequestBody Message message) {
        System.out.println("Sauvegarde de message" + message);
        return ResponseEntity.ok(message);
    }
}
