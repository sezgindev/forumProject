package com.FirstSpringBootProject.auth.validator;

import com.FirstSpringBootProject.auth.model.Post;

import com.FirstSpringBootProject.auth.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


@Component
public class PostValidator  implements Validator {




    @Override
    public boolean supports(Class<?> aClass) {
        return Post.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Post post = (Post) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "post", "NotEmpty");
        if (post.getPost().length() < 40 || post.getPost().length() > 600) {
            errors.rejectValue("post", "Size.postForm.post");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "baslik", "NotEmpty");
        if (post.getBaslik().length() < 3 || post.getBaslik().length() > 60) {
            errors.rejectValue("baslik", "Size.postForm.baslik");
        }




    }


}
