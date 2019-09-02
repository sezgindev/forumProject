package com.FirstSpringBootProject.auth.web;




import com.FirstSpringBootProject.auth.model.User;

import com.FirstSpringBootProject.auth.service.SecurityService;
import com.FirstSpringBootProject.auth.service.UserService;
import com.FirstSpringBootProject.auth.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {

        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @GetMapping("/ddd")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "ddd";
    }

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }



    @RequestMapping("/users")
    public ModelAndView getUsersPage() {
        return new ModelAndView("users", "users", userService.getUsername());
    }


    @RequestMapping(value="/deleteByUsername/{username}", method=RequestMethod.GET)
    public ModelAndView  deleteByUsername(@PathVariable String username) {
        ModelAndView model = new ModelAndView("/users");
        userService.deleteByUsername(username);
        return model;

    }

    @GetMapping("/UserEdit")
    public String UserEdit(Model model) {
        model.addAttribute("editForm");
        return "UserEdit";
    }

    @PostMapping("/UserEdit")
    public String UserEdit(@ModelAttribute("editForm") User editForm, BindingResult bindingResult) {

        userValidator.validate(editForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "userEdit";
        }

        userService.save(editForm);

        securityService.autoLogin(editForm.getUsername(), editForm.getPasswordConfirm());

        return "redirect:/users";
    }






}







