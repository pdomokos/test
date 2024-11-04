package com.example.test.service;

import java.time.Instant;

public interface IGitInfoService {

    String getCommitHash();

    Instant getBuildTime();
}
