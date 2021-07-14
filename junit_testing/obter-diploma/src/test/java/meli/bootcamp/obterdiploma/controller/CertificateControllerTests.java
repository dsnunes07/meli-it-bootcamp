package meli.bootcamp.obterdiploma.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import meli.bootcamp.obterdiploma.domain.Student;
import meli.bootcamp.obterdiploma.service.CertificateService;
import meli.bootcamp.obterdiploma.utils.StudentCreator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class CertificateControllerTests {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private CertificateService certificateService;

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void should_CreateCertificate_when_sendValidFieldsAreSent() throws Exception {
        Student s = StudentCreator.createValidStudent();
        String requestPayload = mapper.writeValueAsString(s);
        mockMvc.perform(post("/analyzeNotes").contentType("application/json").content(requestPayload)).andExpect(status().isOk());
    }

    @Test
    void should_ThrowException_when_sendStudentWithShortName() throws Exception {
        Student s = StudentCreator.createShortNamedStudent();
        String requestPayload = mapper.writeValueAsString(s);
        mockMvc.perform(post("/analyzeNotes")
                .contentType("application/json")
                .content(requestPayload))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.name").exists());
    }

    @Test
    void should_ThrowException_when_sendStudentWithoutName() throws Exception {
        Student s = StudentCreator.createUnnamedStudent();
        String requestPayload = mapper.writeValueAsString(s);
        mockMvc.perform(post("/analyzeNotes")
                .contentType("application/json")
                .content(requestPayload))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.name").exists());
    }
}
