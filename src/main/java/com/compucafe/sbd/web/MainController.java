
package com.compucafe.sbd.web;

import com.compucafe.sbd.jpa.dto.Account;
import com.compucafe.sbd.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    AccountService accountService;
    Logger log = LoggerFactory.getLogger(MainController.class.getName());

    MainController(@Autowired AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/hello")
    public String getHello(@RequestParam("name") String name, ModelMap model) {
        model.addAttribute("name", name);
        log.info("Name: {}", name);
        return "hello";
    }
    @GetMapping("/account")
    public String getAccount(@RequestParam("name") String name, ModelMap model) {
        log.info("Name: {}", name);
        Account account = accountService.getAccountByName(name);
        model.addAttribute("accountName", name);
        model.addAttribute("accountString", ToStringBuilder.reflectionToString(account));
        return "account";
    }
}