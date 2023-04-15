package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Tree {
	public WebDriver ldriver ;
	public int a =30;

	public Tree(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	    System.out.println("Tree class initialized successfully.");

	}
	@FindBy(linkText="Sign in")
	public WebElement loginBtn;
	@FindBy(name = "username") WebElement usernameBtn;
	@FindBy(name = "password") WebElement passwordBtn;
	@FindBy(xpath = "//input[@type='submit']") WebElement submitBtn;
	@FindBy(xpath = "//body/div/div[6]/div/div/a")WebElement selectTree;
	@FindBy(linkText = "Overview of Trees") WebElement selectOverViewOfTrees;
	@FindBy(linkText = "Try here>>>") WebElement selectTryHere;
	@FindBy(xpath ="//form[@id='answer_form']") WebElement printCode;
	@FindBy(xpath = "//button[@type='button']") WebElement clickRunBtn;
	@FindBy(id = "output") WebElement codeOutput;
	@FindBy(linkText = "Terminologies") WebElement selectTerminologies;
	@FindBy(linkText = "Types of Trees") WebElement selectTypesOfTrees;
	@FindBy(linkText = "Tree Traversals") WebElement selectTreeTraversals;
	@FindBy(linkText = "Traversals-Illustration") WebElement selectTraversals;
	@FindBy(linkText = "Binary Trees") WebElement selectBinaryTree;
	@FindBy(linkText = "Types of Trees") WebElement selectTypesOfBinaryTrees;
	@FindBy(linkText = "Implementation in Python") WebElement selectImplementationOfPython;
	@FindBy(linkText = "Binary Tree Traversals") WebElement selectBinaryTreeTrav;
    //Implementation of Binary Trees Applications of Binary trees Binary Search TreesImplementation Of BST
	@FindBy(linkText = "Implementation of Binary Trees") WebElement selectImpOfBinTre;
	@FindBy(linkText = "Applications of Binary trees") WebElement selectAppsOfBinaryTrees;
	@FindBy(linkText = "Binary Search Trees") WebElement selectBinarySearchTrees;
	@FindBy(linkText = "Implementation Of BST") WebElement selectImpOfBST;


	public void sendUsername(String uname)
	{
		usernameBtn.clear();
		usernameBtn.sendKeys(uname);
	}
	
	public void sendPassword(String pwd)
	{
		passwordBtn.clear();
		passwordBtn.sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();		
	}
	
	public void submitLoginBtn()
	{
		submitBtn.click();
	}
	
	public void clickTree() {
		selectTree.click();	
	}
	
	public void clickOverViewOfTrees(String url)
	{
		selectOverViewOfTrees.click();
	}
	
	public void clickTryHere()
	{
		selectTryHere.click();
	}
	
	public void writeCodeHere(String code)
	{
		printCode.sendKeys(code);
	}
	
	public void submitRunBtn()
	{
		clickRunBtn.click();
	}
	public void printCode(String code) throws InterruptedException
	{
		System.out.println("code we send:" + code);	
	 	Actions act = new Actions(ldriver);
	 	act.sendKeys(printCode,code).build().perform(); 
	 	Thread.sleep(5000);
		clickRunBtn.click();
	}
    public String getCodeOutput(String enteredTxt)
    {
    	String outputTxt = codeOutput.getText();
    	return outputTxt;
    }
    
    public void clickTerminologies(String url)
	{
    	selectTerminologies.click();
	}
    public void clickTypesOfTress(String url)
   	{
    	selectTypesOfTrees.click();
   	}
	
    public void clickTreeTraversals(String url)
    {
    	selectTreeTraversals.click();
    }
   
    public void clickTraversalsIllustration(String url)
    {
    selectTraversals.click();
    }
    
    public void clickBinaryTree(String url)
    {
    	selectBinaryTree.click();
    }
    public void clickTypesOfBinaryTree(String url)
    {
    	selectTypesOfBinaryTrees.click();
    }
    
    public void clickImplementationOfPyhton(String url)
    {
    	selectImplementationOfPython.click();
    }
    
    public void clickBinaryTreeTrav(String url)
    {
    	selectBinaryTreeTrav.click();
    }
    
    public void clickImpOfBinarytree(String url)
    {
    	selectImpOfBinTre.click();
    }
    
    public void clickAppsOfBinaryTrees(String url)
    {
    	selectAppsOfBinaryTrees.click();
    }
    
    public void clickBinarySearchTrees(String url)
    {
    	selectBinarySearchTrees.click();
    }
    
    public void clickImplementationOfBST(String url)
    {
    	selectImpOfBST.click();
    }
}
