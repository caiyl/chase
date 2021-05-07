package com.league.chase;

import com.alibaba.csp.sentinel.context.ContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping(value = "/hello/{name}")
    public String apiHello(@PathVariable String name) {
        ContextUtil.enter("sayHello", "cai");
        return service.sayHello(name);
    }

    public static void main(String[] args) {

        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");

        System.out.println("下月第一天: "+sdf.format(calendar.getTime()));
    }


}