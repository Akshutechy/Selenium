import driver.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class createSingleInsurance extends BaseTest {
    @Test
    public void createSingleInsurancePolicy() {
        Driver.driver.get("https://insurance-manager.sb-qa-candidatetask.sisu.sh/login");
        Driver.driver.findElement(By.id("login_username")).sendKeys("testsellingpartner4@simplesurance.de");
        Driver.driver.findElement(By.id("login_password")).sendKeys("TestSellingPartner4Pass");
        Driver.driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

}
