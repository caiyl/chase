package com.league.chase;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.stream.IntStream;

@Service
public class TestService {
    Random r = new Random();
    @SentinelResource(value = "sayHello",fallback = "sayHelloFallback")
    public String sayHello(String name) {
        try {
            Thread.sleep(r.nextInt(20));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello, " + name;
    }
    public String sayHelloFallback(String name) {

        return "sayHelloFallback, " + name;
    }

    public static void main(String[] args) {
        Random r = new Random();

        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.println(r.nextInt(20));
        }
    }
}