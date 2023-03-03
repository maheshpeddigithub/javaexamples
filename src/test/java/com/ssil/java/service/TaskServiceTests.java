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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTests {

    @Mock
    TaskRepository repository;

    @InjectMocks
    TaskService service;

    @Test
    void testRetrieveLengthyTasks() throws TaskRetrievalException {
        when(repository.getTasks()).thenReturn(Arrays.asList("task1", "task11", "task111"));

        List<String> lengthyTasks = service.retrieveLengthyTasks();

        assertNotNull(lengthyTasks);
        assertEquals(2, lengthyTasks.size());
    }

    @Test
    void testRetrieveLengthyTasksWhenTaskRetrievalException() throws TaskRetrievalException {
        when(repository.getTasks()).thenThrow(new TaskRetrievalException("Task retrieval failed"));

        TaskRetrievalException ex = assertThrows(TaskRetrievalException.class, () -> service.retrieveLengthyTasks());
        assertTrue(ex.getMessage().contentEquals("Task retrieval failed"));
    }

}
