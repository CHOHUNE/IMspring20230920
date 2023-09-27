package com.example.im_spring20230920.controller;


import com.example.im_spring20230920.domain.Mydto14;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main17")

public class Controller17 {
    @Autowired
    private ServletContext application;

    @PostConstruct
    public void init(){
        application.setAttribute("posts",new ArrayList<Mydto14>());
    }

    @GetMapping("List")
    public void list(Model model) {
        Object list = application.getAttribute("posts");
    model.addAttribute("postList",list);
    }

    @GetMapping("new")
    public void newPost() {
    }

    @GetMapping("new")
    public String newPost(Mydto14 post, RedirectAttributes rttr) {
    Object posts=application.getAttribute("posts");
    List<Mydto14> list=(List<Mydto14>)posts;
    list.add(post);

    rttr.addFlashAttribute("message","새 글이 등록 되었습니다.");

    return "redirect:/main17/list";
    }

    @GetMapping("view")
    public void view(Integer id,Model model) {
        List<Mydto14> list =(List<Mydto14>) application.getAttribute("posts");
        model.addAttribute("post",list.get(id));
    }

}
