package com.ssil.java.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTests {

    @Mock
    TaskRepository repository;

    @InjectMocks
    TaskService service;

    @Test
    void testRetrieveLengthyTasks() {
        when(repository.getTasks()).thenReturn(Arrays.asList("task1", "task11", "task111"));

        List<String> lengthyTasks = service.retrieveLengthyTasks();

        assertNotNull(lengthyTasks);
        assertEquals(2, lengthyTasks.size());
    }

}
