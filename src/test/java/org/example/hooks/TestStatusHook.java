package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.example.pageClasses.sendEmail;

public class TestStatusHook {

    @After
    public void afterScenario(Scenario scenario) {
        String testName = scenario.getName();
        String status = scenario.getStatus().toString();
        String emailBody = "Test Name: " + testName + "\nStatus: " + status;

        // Determine the recipient based on the status
        String recipient = "vnlkumar1208@gmail.com";

        // Send email based on test status
        try {
            if (status.equals("FAILED")) {
                sendEmail.sendStatusEmail("Cucumber Test Failure", emailBody, recipient);
            } else if (status.equals("PASSED")) {
                sendEmail.sendStatusEmail("Cucumber Test Success", emailBody, recipient);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}