package seleniumBasics;

public class BrowserAndNavigationCommands extends Base {
public void browserCommands() {
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
     System.out.println(url);
     String id =driver.getWindowHandle();
     System.out.println(id);
     String source = driver.getPageSource();
     System.out.println(source);
}
public void navigationCommands (){
	driver.navigate().to("https://www.amazon.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserAndNavigationCommands cmds = new BrowserAndNavigationCommands();
		cmds.initializeBrowser();
		//cmds.browserCommands();
		cmds.navigationCommands();
	}

}
