package com.upaio.democodecov;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.ApplicationContext;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemocodecovApplicationTests {

	@Autowired
    private ApplicationContext context;

	@Test
	void contextLoads() {
		// Simply by being here, this test will fail if the application context fails to load
        assertNotNull(context, "Application context should be loaded");
	}

    @Test
    void applicationStarts() {
        // This test will attempt to start the full application
        String[] args = {};
        DemocodecovApplication.main(args);
        // Add at least one assertion here
        // For example:
        assertNotNull(context, "Application context should not be null");
    }

}
