package org.example.controller;

import org.example.service.NewsHeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/headline")
public class NewsHeadlineController {
    @Autowired
    private NewsHeadlineService headlineService;
    @GetMapping("/listMap")
    public List<Map<String,Object>> selectAll() {
        List<Map<String, Object>> maps = headlineService.listMaps();
        return maps;
    }
}
