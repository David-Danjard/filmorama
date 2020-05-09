package com.david.danjard.filmorama.config;

import io.quarkus.arc.config.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.Optional;

@ConfigProperties(prefix = "environment")
public interface EnvironmentProperties {

    @ConfigProperty(name = "name")
    String name();
    @ConfigProperty(defaultValue = "default")
    String getIdentifier();
    String getOs();
    String getFullName();
    Optional<Boolean> getCommentsActive();

}
