
public class Alertmethod {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		Alert alert =driver.switchTo.alert();
		System.out.println("the text inside the alert is:"+alert.getText());
		alert.sleep(2000);
		alert.accept();
		alert.dismiss();

	}

}
