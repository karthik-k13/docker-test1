package org.docker_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DockerController {

    @GetMapping("message")
    public String welcome() {
        return "docker container is running";
    }

}
