//parse any filtering html 
private String parseHtml(String content) {

		Document doc = Jsoup.parse(content);

//example of the filtering html content
		for (Element element : doc.select("span[data-country-code=True]")) {
			element.remove();
		}
		for (Element element : doc.select("span[data-ticker-code=True]")) {
			element.remove();
		}

		for (Element element : doc.select("[id=right-rail]")) {
			element.remove();
		}
		for (Element element : doc.select("[id=narrator-nav]")) {
			element.remove();
		}
		for (Element element : doc.select("div[id=ad_and_popular]")) {
			element.remove();
		}
}
