package jp.co.xxx.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestAPIController {

    @GetMapping("/article/get/{id}")
    public Map get(@PathVariable int id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", "test");
        map.put("desc", "test desc");
        return map;
    }

    @GetMapping("/session/{userId}")
    public Map login(@PathVariable String userId) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        map.put("name", "test");
        map.put("desc", "test desc");
        return map;
    }
}
