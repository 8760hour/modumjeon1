package com.test02.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class ChatController {
    @RequestMapping("/chat")
    public String chat(){
        return "redirect:http://groupbattle.duckdns.org:8892/chat";
    }
}
