package com.FirstSpringBootProject.auth.web;

import com.FirstSpringBootProject.auth.model.Post;
import com.FirstSpringBootProject.auth.service.PostService;
import com.FirstSpringBootProject.auth.validator.PostValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class PostController {


    @Autowired
    private PostService postService;

    @Autowired
    private PostValidator postValidator;


    @RequestMapping(value = "/postAdd",method = RequestMethod.GET)
        public String postAdd(Model model){
        model.addAttribute("postForm", new Post());
        return "postAdd";
    }

    @RequestMapping(value = "/postAdd",method = RequestMethod.POST)
    public String postAdd(@ModelAttribute("postForm") Post postForm, BindingResult bindingResult) {
        postValidator.validate(postForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "postAdd";
        }

        postService.save(postForm);
        return "redirect:/welcome";
    }
}
