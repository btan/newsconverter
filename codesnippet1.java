//Use selenium to parse the html feeds on any news you would like to parse. 
private void find_articles(WebDriver driver, String url) {
		System.out.println("---find article: " + url);
		try {
			driver.get(url);
			Thread.sleep(15000);
		} catch (Exception e) {
			// Ignore the exception.
			System.out.println("Timeout--Proceed");
		}
//using xpath to parse any interested portion
		List<WebElement> aa = driver
				.findElements(By.xpath("descendant::div[contains(@class, \"Section you wish to parse\")]"));

	}
