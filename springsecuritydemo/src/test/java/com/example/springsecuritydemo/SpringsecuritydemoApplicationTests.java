package com.example.springsecuritydemo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@WebMvcTest(SecurityDemoController.class)
@ContextConfiguration(classes = {UserConfigurationDetails.class})

class SpringsecuritydemoApplicationTests {
	
	@Mock
	MockMvc mockMvc;

	@Test
    @WithMockUser(roles = {"admin"})
    public void accountSummary_with_invalid_role_should_return_403() throws Exception {
       mockMvc.perform(get("/myAccount"))
                        .andExpect(status().isForbidden());
     }
	/*
    @Test
    @WithMockUser(roles = {"ADMIN"})
    public void accountDetails_with_ADMIN_role_should_return_200() throws Exception {
       mockMvc.perform(get("/accounts/0")).andExpect(status().isOk())
                        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                        .andExpect(jsonPath("name").value("John   Doe"))
                        .andExpect(jsonPath("number").value("1234567890"))
    }
    */
}
