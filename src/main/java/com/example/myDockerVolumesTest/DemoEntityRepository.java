package com.example.myDockerVolumesTest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoEntityRepository extends JpaRepository<DemoEntity, Long> {
}
