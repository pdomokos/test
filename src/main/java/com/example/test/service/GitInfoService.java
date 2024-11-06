package com.example.test.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

@Service
public class GitInfoService implements IGitInfoService{

    @Value("${git.commit.id.full}")
    private String gitCommitId;

    @Value("${git.build.time}")
    private String gitBuildTime;

    private static final DateTimeFormatter GIT_BUILD_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");

    public String getCommitHash() {
        return gitCommitId+"-"+gitBuildTime;
    }

    public Instant getBuildTime() {
        TemporalAccessor accessor = GIT_BUILD_TIME_FORMATTER.parse(gitBuildTime);
        return Instant.from(accessor);
    }

}
