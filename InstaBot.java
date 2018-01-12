
//Fast Instagram Bot

import java.util.TreeSet;
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
	String followers = "//*[@id=\"react-root\"]/section/main/article/header/section/ul/li[2]/a";
	String unfollow = "/html/body/div[4]/div/div[2]/div/div[2]/ul/div/li[]/div/div[2]";

	String Tagfinder = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/div[2]/div[2]/div/a[1]";

	String[] s1 = { "This", "The", "Your" };
	String[] s2 = { "photo", "picture", "pic", "shot", "snapshot", "photograph", "portrait" };
	String[] s3 = { "is", "looks", "feels", "is really" };
	String[] s4 = { "appealing", "attractive", "eye-catching", "charming", "impressive", "pleasant", "pleasing",
			"impressive", "marvelous", "stunning", "astonishing", "authentic", "delightful", "exquisite", "admirable",
			"impeccable", "super", "wow", "cool", "GREAT", "magnificent", "magical", "stylish", "so beautiful",
			"so professional", "so lovely", "wonderful", "adorable", "excellent", "amazing", "elegant", "fascinating",
			"glorious", "lovable", "delightful" };
	String[] s5 = { ".", "..", "...", "!", "!!", "!!!" };

	static int Like = 0;

	static int Comment = 0;

	static int Follow = 0;

	static int UnFollow = 0;

	int docomment;

	int numberoffollowers;

	int numberoffollowing;

	int c = 200;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("https://www.instagram.com/");
		}

		catch (Exception e) {
		}

	}

	public void signin() {
		try {

			driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/p/a")).click();

			Thread.sleep((int) (1000 * Math.random() * 2));

			driver.switchTo().activeElement().sendKeys("vivi_an563");
			// driver.switchTo().activeElement().sendKeys("Aakansha_Agarwal7");

			Actions action = new Actions(driver);
			action.sendKeys(Keys.TAB).build().perform();

			Thread.sleep((int) (1000 * Math.random() * 2));

			driver.switchTo().activeElement().sendKeys("ohmygod");

			Thread.sleep((int) (1000 * Math.random() * 2));

			action.sendKeys(Keys.RETURN).build().perform();

			Thread.sleep((int) (1000 * Math.random() * 2));
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
			for (int i = 1; i < numberoffollowing; i += 1) {
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
		while (a < 0 || a > s1.length - 1) {
			a = (int) (Math.random() * 3);
		}
		int b = -1;
		while (b < 0 || b > s2.length - 1) {
			b = (int) (Math.random() * 8);
		}
		int c = -1;
		while (c < 0 || c > s3.length - 1) {
			c = (int) (Math.random() * 4);
		}
		int f = -1;
		while (f < 0 || f > s4.length - 1) {
			f = (int) ((Math.random() * s4.length / 2) + (Math.random() * 20));
		}
		int e = -1;
		while (e < 0 || e > s5.length - 1) {
			e = (int) (Math.random() * 7);
		}
		comment = s1[a] + " " + s2[b] + " " + s3[c] + " " + s4[f] + " " + s5[e];

		return comment;
	}

	public void toLikeCommentFollow() {
		while (true) {
			try {

				if (Comment == 0) {
					driver.findElement(By.xpath(xpathsearch)).click();
					driver.switchTo().activeElement().sendKeys("#followforfollow");
					Thread.sleep((int) (1000 * Math.random() * 4));

					driver.findElement(By.xpath(Tagfinder)).click();
				}

				Thread.sleep((int) (1000 * Math.random() * 3));
				driver.navigate().refresh();
				Thread.sleep((int) (1000 * Math.random() * 5));

				// Like The Random Picture

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
					p = (int) (Math.random() * 4);
				}

				Thread.sleep((int) (1000 * 4));

				String element = "//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div[2]/div[" + p + "]";
				driver.findElement(By.xpath(element)).click();

				Thread.sleep((int) (1000 * Math.random() * 5));

				WebElement element1 = driver
						.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/article/div[1]/div/div/div[2]"));
				Actions action = new Actions(driver);
				action.doubleClick(element1).perform();

				Like += 1;

				// Comment On Liked Picture

				docomment = (int) (Math.random() * 10);

				String xpathfollow;

				if (true) {

					Thread.sleep((int) (1000 * Math.random() * 7));

					String xpathcomment = "/html/body/div[4]/div/div[2]/div/article/div[2]/section[3]/form/textarea";

					driver.findElement(By.xpath(xpathcomment)).click();

					Thread.sleep((int) (1000 * Math.random() * 4));

					driver.switchTo().activeElement().sendKeys(Commentcreator());

					Thread.sleep((int) (1000 * Math.random() * 4));

					action.sendKeys(Keys.RETURN).build().perform();

					Comment += 1;
				}

				Thread.sleep((int) (1000 * Math.random() * 10));

				// Follow

				xpathfollow = "/html/body/div[4]/div/div[2]/div/article/header/div[2]/div[1]/div[2]/span[2]/button";
				driver.findElement(By.xpath(xpathfollow)).click();

				Thread.sleep((int) (1000 * Math.random() * 7));

				Follow += 1;

				// To Go Back

				Thread.sleep((int) (1000 * Math.random() * 4));

				driver.navigate().back();

				Thread.sleep((int) (1000 * Math.random() * 4));

				// driver.navigate().back();

				// Thread.sleep((int) (1000 * Math.random() * 4));

				// To Unfollow Someone Who Is Not Following You

				// checkandUnfollow();

				// Thread.sleep((int) (1000 * Math.random() * 5));

				// driver.navigate().back();

				// End

				System.out.println("\nFollow : " + Follow);

				Thread.sleep((int) (1000 * Math.random() * 17));

				if (Follow % 30 == 0 && Follow != 0) {
					int q = 200 + (int) (Math.random() * 200);
					System.out.println("\nSleeping For " + q + " Seconds.\n");
					Thread.sleep((int) (1000 * q));
				}

			} catch (Exception e) {
				Comment = 0;
				driver.get("https://www.instagram.com/");
				System.out.println("\nLike: " + Like + ", Follow: " + Follow + ", Unfollow: " + UnFollow);
			}
		}
	}

	public void checkandUnfollow() {
		while (true) {
			try {
				Thread.sleep((int) (1000 * Math.random() * 3));

				Actions action = new Actions(driver);

				driver.findElement(By.xpath(profile)).click();

				numberoffollowers = Integer.parseInt(driver
						.findElement(
								By.xpath("//*[@id=\"react-root\"]/section/main/article/header/section/ul/li[2]/a/span"))
						.getAttribute("title"));

				numberoffollowing = Integer.parseInt(driver
						.findElement(
								By.xpath("//*[@id=\"react-root\"]/section/main/article/header/section/ul/li[3]/a/span"))
						.getText());

				int v = c;
				int x = c;
				int r = c;

				TreeSet<String> followersarray = new TreeSet<String>();

				Thread.sleep((int) (1000 * Math.random() * 3));

				while (c <= numberoffollowing && c > 0) {
					int u = 0;

					driver.findElement(By.xpath(following)).click();

					Thread.sleep((int) (1000 * Math.random() * 2));

					driver.findElement(
							By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/ul/div/li[1]/div/div[1]/div/div[1]"))
							.click();

					if (v == c) {
						for (int d = 1; d <= c; d += 4) {
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							Thread.sleep((int) (1000 * Math.random() * 1));
						}
					}

					String xpathUserfollowing = "/html/body/div[5]/div/div[2]/div/div[2]/ul/div/li[" + c
							+ "]/div/div[1]/div/div[1]/a";

					WebElement Usernamefollowing = driver.findElement(By.xpath(xpathUserfollowing));
					String followingtitle = Usernamefollowing.getAttribute("title");

					System.out.println("\nFollowing : " + followingtitle);

					Thread.sleep((int) (1000 * Math.random() * 2));

					driver.navigate().back();

					Thread.sleep((int) (1000 * Math.random() * 2));

					if (r == c) {
						driver.findElement(By.xpath(followers)).click();

						Thread.sleep((int) (1000 * Math.random() * 3));

						driver.findElement(
								By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/ul/div/li[1]/div/div[1]/div/div[1]"))
								.click();

						Thread.sleep((int) (1000 * Math.random() * 3));

						for (int d = 1; d <= numberoffollowers; d += 4) {
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							Thread.sleep((int) (1000 * Math.random() * 1));
						}
						for (int j = 1; j <= numberoffollowers - 2; j += 1) {

							String xpathUserfollower = "/html/body/div[5]/div/div[2]/div/div[2]/ul/div/li[" + j
									+ "]/div/div[1]/div/div[1]/a";
							WebElement Usernamefollower = driver.findElement(By.xpath(xpathUserfollower));
							String followertitle = Usernamefollower.getAttribute("title");

							followersarray.add(followertitle);

						}

						Thread.sleep((int) (1000 * Math.random() * 5));

						driver.navigate().back();

						Thread.sleep((int) (1000 * Math.random() * 3));

						r = -1;
					}

					for (int a = 1; a < followersarray.size(); a += 1) {
						if (followersarray.contains(followingtitle)) {
							System.out.println("\nMatch : " + followingtitle + "\n");
							u += 1;
							break;
						}
					}

					if (u == 0) {

						driver.findElement(By.xpath(following)).click();

						Thread.sleep((int) (1000 * Math.random() * 3));

						String Unfollowuser = "/html/body/div[5]/div/div[2]/div/div[2]/ul/div/li[" + c
								+ "]/div/div[2]/span/button";

						System.out.println("\nUnfollowing : " + followingtitle + "\n");

						driver.findElement(By.xpath(Unfollowuser)).click();

						action.sendKeys(Keys.ARROW_DOWN).build().perform();
						action.sendKeys(Keys.ARROW_DOWN).build().perform();
						action.sendKeys(Keys.ARROW_DOWN).build().perform();

						Thread.sleep((int) (1000 * Math.random() * 3));

						System.out.println("Done\n");

						Thread.sleep((int) (1000 * Math.random() * 7));

						driver.navigate().back();

						UnFollow += 1;

						Thread.sleep((int) (1000 * Math.random() * 20));

						// break;

					}

					else {
						x -= 1;
					}

					c -= 1;
					System.out.println("\nUnfollow: " + UnFollow);
					System.out.println("\nMatch: " + (v - x));
					System.out.println("\nC : " + c + "\n");

					if (UnFollow % 20 == 0 && UnFollow != 0) {
						int q = 300 + (int) (Math.random() * 400);
						System.out.println("\nSleeping For " + q + " Seconds.\n");
						Thread.sleep((int) (1000 * q));
					}

				}

			} catch (

			Exception e) {
				driver.get("https://www.instagram.com/");
				System.out.println("\nLike: " + Like + ", Follow: " + Follow + ", Unfollow: " + UnFollow);
			}
		}

	}

	public static void main(String[] args) {

		try {
			InstaBot instabot = new InstaBot();
			instabot.invokeBrowser();
			instabot.signin();

			// instabot.toFollow();

			instabot.toLikeCommentFollow();

			instabot.checkandUnfollow();

			// instabot.toUnfollow();

		} catch (Exception e) {
			driver.get("https://www.instagram.com/");
			System.out.println("\nLike: " + Like + ", Follow: " + Follow + ", Unfollow: " + UnFollow);
		}

	}

}
