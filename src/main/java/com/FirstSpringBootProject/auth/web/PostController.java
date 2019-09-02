package com.FirstSpringBootProject.auth.web;

import com.FirstSpringBootProject.auth.model.Post;
import com.FirstSpringBootProject.auth.service.PostService;
import com.FirstSpringBootProject.auth.validator.PostValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PostController {


    @Autowired
    private PostService postService;

    @Autowired
    private PostValidator postValidator;


    @GetMapping("/postAdd")
        public String postAdd(Model model){
       model.addAttribute("postForm", new Post());
        return "postAdd";
    }

    @PostMapping("/postAdd")
    public String postAdd(@ModelAttribute("postForm") Post postForm, BindingResult bindingResult) {
        postValidator.validate(postForm, bindingResult);

      if (bindingResult.hasErrors()) {
            return "postAdd";
        }

        postService.save(postForm);
        return "redirect:/welcome";
    }


    @RequestMapping("/posts")
    public ModelAndView getPostsPage() {
        return new ModelAndView("posts", "posts", postService.getPosts());
    }


    @RequestMapping(value="/deleteByPost/{post}", method=RequestMethod.GET)
    public ModelAndView  deleteByUsername(@PathVariable String post) {
        ModelAndView model = new ModelAndView("/posts");
        postService.deleteByPost(post);
        return model;

    }

}
