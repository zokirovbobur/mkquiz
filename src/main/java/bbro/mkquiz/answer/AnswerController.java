package bbro.mkquiz.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("answer")
public class AnswerController {

    @Autowired
    AnswerRepo repo;

    @GetMapping
    public AnswerSample sample(){return new AnswerSample();}

    @GetMapping("all")
    public List<Answer> getAll(){
        return repo.findAll();
    }
}
