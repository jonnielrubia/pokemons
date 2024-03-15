package com.pokemons.pokemon.common.util;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.EncodedResource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class YamlPropertySourceFactoryTest {

  @Test
  void createPropertySource() throws IOException {
    // Arrange
    YamlPropertySourceFactory factory = new YamlPropertySourceFactory();
    EncodedResource resource = mock(EncodedResource.class);
    // Use DefaultResourceLoader to create a ResourceLoader
    DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
    when(resource.getResource()).thenReturn(resourceLoader.getResource("classpath:test.yml"));

    // Act
    PropertySource<?> propertySource = factory.createPropertySource("test-source", resource);

    // Assert
    assertNotNull(propertySource);
    assertTrue(propertySource.containsProperty("test.property"), "Property 'test.property' not found in the created PropertySource");
  }
}
