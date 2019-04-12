package js.springexamples.jokesapp.controllers;

import js.springexamples.jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokesService jokesService;

    public JokeController(JokesService jokesService){
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());

        return "chucknorris";
    }
}
