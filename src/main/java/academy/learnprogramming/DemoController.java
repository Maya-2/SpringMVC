package academy.learnprogramming;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import academy.learnprogramming.dao.AlienDao;
import academy.learnprogramming.model.Alien;


@Controller
public class DemoController {
	@Autowired
	private AlienDao dao;
	
	@ModelAttribute
	public void home(Model m)
	{
		m.addAttribute("name","Aliens");
	}
	@GetMapping("/")
    public String demo()
    {
        return "index";
    }
	@GetMapping("getAliens")
    public String getAliens(Model m)
    {
		m.addAttribute("result",dao.getAliens());
        return "showAliens";
    }
	
	@GetMapping("getAlien")
    public String getAlien(@RequestParam int id, Model m)
    {
		m.addAttribute("Alien",dao.getAlien(id));
        return "showAliens";
    }
	
	@GetMapping("addAlien")
    public String addAlien(@ModelAttribute("result") Alien a)
    {
		dao.addAlien(a);
		
        return "showAliens";
    }
	
    @GetMapping("welcome")
    public String welcome(Model model)
    {
//        log.info("welcome method is calling");
        model.addAttribute("message","welcome to spring booot!");
        return "index";
    }
    @GetMapping("add")
    public ModelAndView add(@RequestParam ("num1") int a, @RequestParam("num2") int b)
    {
    	ModelAndView mv=new ModelAndView("result");
    	int num=a+b;
    	mv.addObject("num",num);
    	return mv;
    }
}
