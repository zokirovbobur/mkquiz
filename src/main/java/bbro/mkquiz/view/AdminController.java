package bbro.mkquiz.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("admin")
public class AdminController {

    @GetMapping
    public ModelAndView mainPage(){return new ModelAndView("admin.html");}

    @GetMapping("category")
    public ModelAndView addCategory(){return new ModelAndView("addCategory.html");}
    @GetMapping("subject")
    public ModelAndView addSubject(){return new ModelAndView("addSubject.html");}
    @GetMapping("section")
    public ModelAndView addSection(){return new ModelAndView("addSection.html");}
    @GetMapping("test")
    public ModelAndView addTest(){return new ModelAndView("addTest.html");}



}
