package corona.project.app.controler;



import corona.project.app.model.Corona;
import corona.project.app.service.CoronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Controller
public class MainController {

    CoronaService coronaService;
    @Autowired
    public void setCoronaService(CoronaService coronaService) {
        this.coronaService = coronaService;
    }




    @GetMapping("/")
    public String root(Model model){
        List<Corona> allStats = coronaService.getAllStats();

        model.addAttribute("coronaCases",allStats);

        return "mainTemplate";
    }


}
