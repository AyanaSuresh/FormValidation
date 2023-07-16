import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormPageTest {

    public static void main(String[] args) {
        // Set the path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the form page
        driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");

        // Test Case 1: Provide values for other fields except Name and try submitting the form
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("test@example.com");
        WebElement phoneNumberField = driver.findElement(By.id("phone"));
        phoneNumberField.sendKeys("1234567890");
        WebElement noticePeriodField = driver.findElement(By.id("noticePeriod"));
        noticePeriodField.sendKeys("30");
        WebElement experienceField = driver.findElement(By.id("experience"));
        experienceField.sendKeys("5");
        WebElement descriptionField = driver.findElement(By.id("description"));
        descriptionField.sendKeys("Test Descrption wqje bdw cbei.");
        WebElement submitButton = driver.findElement(By.id("submit-button"));
        submitButton.click();
        // Add assertions or validation to check if the form submission is successful or not

        // Test Case 2: Try giving Numeric and special characters in the name field
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("123#@");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 3: Try giving Name with 40+ characters and submit the form
        nameField.clear();
        nameField.sendKeys("Test Descrption wqje bdw cbei, qweer nvklnvlein klnlvkasnvk lkjnavsrnv, jnvboiwhdvbsdn, bvisndvklsdnv, jbbkjbvsjdvnsvdsvsdv.");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 4: Provide values for other fields except Email and try submitting the form
        nameField.clear();
        nameField.sendKeys("Bella Swan");
        emailField.clear();
        phoneNumberField.sendKeys("1234567890");
        noticePeriodField.sendKeys("30");
        experienceField.sendKeys("5");
        descriptionField.sendKeys("Test Descrption wqje bdw cbei.");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 5: Try Giving Invalid email address in email id field
        emailField.sendKeys("invalid_email");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 6: Try giving Valid email with 40+ characters and submit the form
        emailField.clear();
        emailField.sendKeys("qwertytutyjtyjrdjtjtrjtyjmfgnfnfgngfnfgnfgnnfnn@domain.com");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 7: Provide values for other fields except Phone and try submitting the form
        emailField.clear();
        emailField.sendKeys("test@example.com");
        phoneNumberField.clear();
        noticePeriodField.sendKeys("30");
        experienceField.sendKeys("5");
        descriptionField.sendKeys("Test Descrption wqje bdw cbei.");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 8: Try Giving Alphabets or special Characters in the Phone field
        phoneNumberField.sendKeys("abc@#$");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 9: Try giving Phone Number with more than 10 numbers
        phoneNumberField.clear();
        phoneNumberField.sendKeys("123456789012");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 10: Provide values for other fields except Notice Period and try submitting the form
        phoneNumberField.clear();
        phoneNumberField.sendKeys("1234567890");
        noticePeriodField.clear();
        experienceField.sendKeys("5");
        descriptionField.sendKeys("Test Descrption wqje bdw cbei.");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 11: Try Giving Alphabets or special Characters in the Notice Period field
        noticePeriodField.sendKeys("abc@#$");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 12: Try giving Notice Period with more than 3 numbers
        noticePeriodField.clear();
        noticePeriodField.sendKeys("1234");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 13: Provide values for other fields except Experience and try submitting the form
        noticePeriodField.clear();
        noticePeriodField.sendKeys("30");
        experienceField.clear();
        experienceField.sendKeys("abc@#$");
        descriptionField.sendKeys("Test Descrption wqje bdw cbei.");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 14: Try Giving Alphabets or special Characters in the Experience field
        experienceField.sendKeys("abc@#$");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 15: Try giving Experience with more than 4 numbers
        experienceField.clear();
        experienceField.sendKeys("12345");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 16: Provide values for other fields and try submitting the form without uploading resume
        experienceField.clear();
        experienceField.sendKeys("5");
        WebElement resumeField = driver.findElement(By.id("resume"));
        // Do not upload a resume file
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 17: Try uploading files without .doc, .docx, or .pdf extensions
        resumeField.sendKeys("path_to_invalid_file.txt");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 18: Try uploading multiple files in the resume field
        resumeField.sendKeys("path_to_resume_file1.docx" + "\n" + "path_to_resume_file2.pdf");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 19: Provide values for other fields and try submitting the form without providing Description
        resumeField.clear();
        resumeField.sendKeys("path_to_resume_file.doc");
        descriptionField.clear();
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 20: Try Giving Alphabets or special Characters in the Description field
        descriptionField.sendKeys("asdfn fvdvvv @#$");
        submitButton.click();
        // Add assertions or validation to check if appropriate error message is displayed

        // Test Case 21: Provide Name in the field provided for name in the form
        descriptionField.clear();
        descriptionField.sendKeys("Test Descrption wqje bdw cbei.");
        nameField.clear();
        nameField.sendKeys("Bella Swan");
        submitButton.click();
        // Add assertions or validation to check if the form submission is successful or not

        // Test Case 22: Provide Email id in the field provided for email in the form
        nameField.clear();
        nameField.sendKeys("Bella Swan");
        emailField.clear();
        emailField.sendKeys("test@example.com");
        submitButton.click();
        // Add assertions or validation to check if the form submission is successful or not

        // Test Case 23: Provide Phone Number in the field provided for Number in the form
        emailField.clear();
        emailField.sendKeys("test@example.com");
        phoneNumberField.clear();
        phoneNumberField.sendKeys("1234567890");
        submitButton.click();
        // Add assertions or validation to check if the form submission is successful or not

        // Test Case 24: Provide Notice Period in the field provided for Notice Period in the form
        phoneNumberField.clear();
        phoneNumberField.sendKeys("1234567890");
        noticePeriodField.clear();
        noticePeriodField.sendKeys("30");
        submitButton.click();
        // Add assertions or validation to check if the form submission is successful or not

        // Test Case 25: Provide Experience in the field provided for Experience in the form
        noticePeriodField.clear();
        noticePeriodField.sendKeys("30");
        experienceField.clear();
        experienceField.sendKeys("5");
        submitButton.click();
        // Add assertions or validation to check if the form submission is successful or not

        // Test Case 26: Upload Resume in the field provided to upload resume in the form
        experienceField.clear();
        experienceField.sendKeys("5");
        resumeField.sendKeys("path_to_resume_file.doc");
        submitButton.click();
        // Add assertions or validation to check if the form submission is successful or not

        // Test Case 27: Write description in the field provided to add description in the form
        resumeField.clear();
        resumeField.sendKeys("path_to_resume_file.doc");
        descriptionField.clear();
        descriptionField.sendKeys("Test Descrption wqje bdw cbei.");
        submitButton.click();
        // Add assertions or validation to check if the form submission is successful or not

        // Test Case 28: Click on Apply Button after providing all details
        descriptionField.sendKeys("Test Descrption wqje bdw cbei.");
        submitButton.click();
        // Add assertions or validation to check if the form submission is successful or not

        // Close the browser
        driver.quit();
    }
}
