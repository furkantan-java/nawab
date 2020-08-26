package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features/Jwt.feature",
            glue = "com/vytrack/step_definitions",
            dryRun = false,
            strict = false,
            tags = "",
            plugin = {
                    "html:target/default-report",
                    "json:target/cucumber.json",
                    "rerun:target/rerun.txt"
            }
    )

    public class JwtRunner {

    }


