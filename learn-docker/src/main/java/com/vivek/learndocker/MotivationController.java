package com.vivek.learndocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MotivationController {

    @GetMapping("motivate")
    public String motivate() {
        List<String> motivationQoutes = Arrays.asList(
                "When you have a dream, you've got to grab it and never let go.",
                "Nothing is impossible. The word itself says 'I'm possible!",
                "There is nothing impossible to they who will try.",
                "The bad news is time flies. The good news is you're the pilot.",
                "Life has got all those twists and turns. You've got to hold on tight and off you go.");

        Random random = new Random();
        int randomNumber = random.nextInt(5);
        return motivationQoutes.get(randomNumber);
    }

}
