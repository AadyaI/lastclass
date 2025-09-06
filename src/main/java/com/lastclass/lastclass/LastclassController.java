package com.lastclass.lastclass;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LastclassController {
    private final List<Feeling> feelings = new ArrayList<>();

    @GetMapping("/")
    public String home() {
        return "create";
    }

    @PostMapping("/submit")
    public String handleSubmit(@RequestParam("name") String name,
                               @RequestParam("mood") String mood,
                               @RequestParam("thoughts") String thoughts,
                               @RequestParam("vent") String vent,
                               Model model) {
        feelings.add(new Feeling(name, mood, thoughts, vent));
        model.addAttribute("feelings", feelings);
        return "feed";
    }

    @GetMapping("/feed")
    public String showFeed(Model model) {
        model.addAttribute("feelings", feelings);
        return "feed";
    }
}