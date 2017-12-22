
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InstaBot {

	static WebDriver driver;

	String xpathsearch = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]";
	String first = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/div[2]/div[2]/div/a[]";

	String profile = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[3]/a";
	String following = "//*[@id=\"react-root\"]/section/main/article/header/section/ul/li[3]";
	String unfollow = "/html/body/div[4]/div/div[2]/div/div[2]/ul/div/li[]/div/div[2]";

	String Tagfinder = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/div[2]/div[2]/div/a[1]";

	String[] s1 = { "This", "The", "Your" };
	String[] s2 = { "photo", "picture", "pic", "shot", "snapshot", "photograph", "portrait" };
	String[] s3 = { "is", "looks", "feels", "is really" };
	String[] s4 = { "great", "super", "good", "very good", "good", "wow", "WOW", "cool", "GREAT", "magnificent",
			"magical", "very cool", "stylish", "beautiful", "so beautiful", "so stylish", "so professional", "lovely",
			"so lovely", "very lovely", "glorious", "so glorious", "very glorious", "adorable", "excellent",
			"amazing" };
	String[] s5 = { ".", "..", "...", "!", "!!", "!!!" };

	static int Like = 0;

	static int Comment = 0;

	static int Follow = 0;

	int docomment;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

			driver.get("https://www.instagram.com/");
		}

		catch (Exception e) {
		}

	}

	public void signin() {
		try {
			String xpathusername = "//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[1]/div/input";
			String xpathpassword = "//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[2]/div/input";
			String xpthLoginButton = "//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/span/button";

			driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/p/a")).click();
			Thread.sleep((int) (1000 * Math.random() * 7));
			driver.findElement(By.xpath(xpathusername)).click();
			Thread.sleep((int) (1000 * Math.random() * 9));
			driver.findElement(By.xpath(xpathusername)).sendKeys("vivi_an563");
			// driver.findElement(By.xpath(xpathusername)).sendKeys("Aakansha_Agarwal7");
			driver.findElement(By.xpath(xpathpassword)).click();
			Thread.sleep((int) (1000 * Math.random() * 13));
			driver.findElement(By.xpath(xpathpassword)).sendKeys("wehatehackers");
			// driver.findElement(By.xpath(xpathpassword)).sendKeys("ohmygod");
			driver.findElement(By.xpath(xpthLoginButton)).click();
			Thread.sleep((int) (1000 * Math.random() * 12));
		}

		catch (Exception e) {
		}

	}

	public void toFollow() {
		try {
			for (int i = 1; i < 200; i += 1) {
				driver.findElement(By.xpath(xpathsearch)).click();
				driver.switchTo().activeElement().sendKeys("Akshay");

				StringBuilder xpthofitems = new StringBuilder(first);
				xpthofitems.insert(76, Integer.toString(i));

				driver.findElement(By.xpath(xpthofitems.toString())).click();

				if (driver.findElements(By.cssSelector("button._qv64e._gexxb._r9b8f._njrw0")).size() == 1) {
					Thread.sleep((long) (1000 * Math.random() * 62));
					driver.findElement(By.cssSelector("button._qv64e._gexxb._r9b8f._njrw0")).click();
				}
			}
		} catch (Exception e) {
		}
	}

	public void toUnfollow() {
		try {
			driver.findElement(By.xpath(profile)).click();
			driver.findElement(By.xpath(following)).click();
			for (int i = 1; i < 25; i += 1) {
				StringBuilder Unfollow = new StringBuilder(unfollow);
				Unfollow.insert(50, Integer.toString(i));
				Thread.sleep((long) (1000 * Math.random() * 54));
				driver.findElement(By.xpath(Unfollow.toString())).click();
			}

		} catch (Exception e) {
		}

	}

	public String Commentcreator() {

		String comment = "";

		int a = -1;
		while (a < 0 || a > 2) {
			a = (int) (Math.random() * 10);
		}
		int b = -1;
		while (b < 0 || b > 6) {
			b = (int) (Math.random() * 10);
		}
		int c = -1;
		while (c < 0 || c > 3) {
			c = (int) (Math.random() * 10);
		}
		int f = -1;
		while (f < 0 || f > 25) {
			f = (int) (Math.random() * 50);
		}
		int e = -1;
		while (e < 0 || e > 5) {
			e = (int) (Math.random() * 10);
		}
		comment = s1[a] + " " + s2[b] + " " + s3[c] + " " + s4[f] + " " + s5[e];

		return comment;
	}

	public void toLikeCommentFollow() {
		while (true) {
			try {
				// Like The Random Picture

				Thread.sleep((int) (1000 * 10));
				driver.navigate().refresh();
				Thread.sleep((int) (1000 * 10));

				driver.findElement(By.xpath(xpathsearch)).click();
				driver.switchTo().activeElement().sendKeys("#followforfollow");
				Thread.sleep((int) (1000 * Math.random() * 15));

				driver.findElement(By.xpath(Tagfinder)).click();

				Thread.sleep((int) (1000 * Math.random() * 20));

				long i = 7;

				int k = ((int) (Math.random() * Math.random() * 7 * 9)) + 21;

				while (i != 0 && i % k != 0) {
					Actions action = new Actions(driver);
					if (i % 3 == 0) {
						i = (long) ((Math.random() * Math.random() * 91) + (Math.random() * Math.random() * 781));
						action.sendKeys(Keys.ARROW_DOWN).build().perform();
						action.sendKeys(Keys.ARROW_DOWN).build().perform();
						action.sendKeys(Keys.ARROW_DOWN).build().perform();
						action.sendKeys(Keys.ARROW_DOWN).build().perform();
					} else {
						i = (long) ((Math.random() * Math.random() * 75) + (Math.random() * Math.random() * 519));
						action.sendKeys(Keys.ARROW_DOWN).build().perform();
					}
					if (i == 0)
						i = 5931;

					k = ((int) (Math.random() * Math.random() * 3 * 2 * 7 * 9)) + 27;
				}

				int p = 0;

				while (p <= 0 || p > 3) {
					p = (int) (Math.random() * 10);
				}

				Thread.sleep((int) (1000 * Math.random() * 15));

				Thread.sleep((int) (1000 * 4));

				String element = "//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div[2]/div[" + p + "]";
				driver.findElement(By.xpath(element)).click();
				Thread.sleep((int) (1000 * Math.random() * 51));

				WebElement element1 = driver
						.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/article/div[1]/div/div"));
				Actions action = new Actions(driver);
				action.doubleClick(element1).perform();

				Like += 1;

				// Comment On Liked Picture

				docomment = (int) (Math.random() * 20);

				String xpathfollow;

				if (true) {

					Thread.sleep((int) (1000 * Math.random() * 24));

					String xpathcomment = "/html/body/div[3]/div/div[2]/div/article/div[2]/section[3]/form";

					driver.findElement(By.xpath(xpathcomment)).click();

					Thread.sleep((int) (1000 * Math.random() * 12));

					driver.switchTo().activeElement().sendKeys(Commentcreator());

					Thread.sleep((int) (1000 * Math.random() * 10));

					Thread.sleep((int) (1000 * Math.random() * 20));

					action.sendKeys(Keys.RETURN).build().perform();

					Comment += 1;
				}

				Thread.sleep((int) (1000 * Math.random() * 26));

				// Follow

				xpathfollow = "/html/body/div[3]/div/div[2]/div/article/header/div[2]/div[1]/div[2]/span[2]";
				driver.findElement(By.xpath(xpathfollow)).click();

				Thread.sleep((int) (1000 * Math.random() * 20));

				Follow += 1;

				// To Go Back

				Thread.sleep((int) (1000 * Math.random() * 21));

				driver.navigate().back();

				Thread.sleep((int) (1000 * Math.random() * 24));

				driver.navigate().back();

				Thread.sleep((int) (1000 * Math.random() * 245));

			} catch (Exception e) {
				System.out.println("Like: " + Like + ", Comment: " + Comment + ", Follow: " + Follow);
			}
		}
	}

	public static void main(String[] args) {

		try {
			InstaBot instabot = new InstaBot();
			instabot.invokeBrowser();
			instabot.signin();

			// instabot.toFollow();
			// instabot.toUnfollow();

			instabot.toLikeCommentFollow();
			System.out.println("Like: " + Like + ", Comment: " + Comment + ", Follow: " + Follow);

		} catch (Exception e) {
			System.out.println("Like: " + Like + ", Comment: " + Comment + ", Follow: " + Follow);
		}

	}

}
