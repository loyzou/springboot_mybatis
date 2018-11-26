package org.xxjr.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xxjr.test.service.LoyService;

@RestController
public class LoyController {
    @Autowired
    private LoyService loyService;
    @RequestMapping("/loy")
    public String loy(int id){
        String loy = loyService.queryNameById(id);
        return  loy;
    }

}
