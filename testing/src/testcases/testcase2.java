package testcases;

import org.openqa.selenium.By;

public class testcase2 {

	public By hompage = By.xpath("//i[contains(@class, 'fa fa-home')]");
	public By btnlogin = By.xpath("//a[@href=\"/login\"]");
	public By txtsign = By.xpath("//h2[text()='New User Signup!']");
	public By txtname = By.xpath("//input[@placeholder=\"Name\"]");
	public By txtemail = By.xpath("(//form[@action=\"/signup\"])//input[@placeholder=\"Email Address\"]");
	public By btnsubmit = By.xpath("//button[@data-qa=\"signup-button\"]");
	public By txtaccount = By.xpath("//b[text()='Enter Account Information']");
}
