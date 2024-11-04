package com.example.test.controller;

import com.example.test.service.GitInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/git")
@RequiredArgsConstructor
public class GitInfoController {

    private final GitInfoService gitInfoService;

    @GetMapping("/commit-hash")
    public String getCommitHash() {
        return gitInfoService.getCommitHash();
    }

    @GetMapping("/build-time")
    public Instant getBuildTime() {
        return gitInfoService.getBuildTime();
    }
}
