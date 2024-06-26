package com.example.myDockerVolumesTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoEntityRepository demoEntityRepository;

    public DemoEntity getDemoEntityById(Long id) {
        return demoEntityRepository.findById(id).orElseThrow();
    }

    public List<DemoEntity> getAll() {
        return demoEntityRepository.findAll();
    }

    public void createDemoEntity(DemoEntity demoEntity) {
        demoEntityRepository.save(demoEntity);
    }

}
