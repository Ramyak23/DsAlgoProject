package stepDefinitions;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import pageFactory.AlldsPage;
import pageFactory.ArrayPage;
import pageFactory.GraphPage;
import pageFactory.HomePage;
import pageFactory.LinkedListPage;
import pageFactory.QueuePage;
import pageFactory.RegisterPage;
import pageFactory.SigninPage;
import pageFactory.StackPage;
import pageFactory.TreePage;
import java.io.FileInputStream;
import java.io.IOException;

public class BaseClass {
 
	public static WebDriver driver;
	public HomePage hp;
	public SigninPage sp;
	public AlldsPage ds;
	public GraphPage gp;
	public StackPage stp;
	public RegisterPage rp;
	public QueuePage qp;
	public TreePage tp;
	public LinkedListPage lp;
	public ArrayPage ap;
	public Properties configProp;
	public static Properties prop=null;
	
	
	
	//Reading Properties File 
	public static void loadPropertiesFile() throws IOException {
		
		prop=new Properties();
		FileInputStream fis= new FileInputStream("src/test/resources/configdata.properties");
		prop.load(fis);
	}
	
}
