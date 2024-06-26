package com.example.myDockerVolumesTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoEntityController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/all")
    public List<DemoEntity> getAll() {
        return demoService.getAll();
    }

    @PostMapping("/create")
    public void createDemoEntity(@RequestBody DemoEntity demoEntity) {
        demoService.createDemoEntity(demoEntity);
    }

}
