package core;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class JSON {
	public static void main(String[] args) throws IOException

	{
		String item_01 = "Soccer Ball";
		float item_01_usd = 85.51f;
		String item_02 = "Withings Activity Tracker + Sleep";
		float item_02_usd = 73.39f;
		String item_03 = "Samsung Galaxy Unlocked Phone";
		float item_03_usd = 145.94f;
		String item_04 = "GoPro HERO3";
		float item_04_usd = 328.99f;
		String item_05 = "iPhone 6s 64 GB Unlocked";
		float item_05_usd = 829.09f;

		// WebDriver driver = new FirefoxDriver();
		// String url =
		// "http://www.amazon.com/adidas-Brazuca-World-Official-Soccer/dp/B00GSUGEBK/ref=sr_1_2?s=sporting-goods&ie=UTF8&qid=1444588067&sr=1-2&keywords=Brazuca+Top+Glider+World+Cup+Replica+Soccer+Ball+%284%29";
		// driver.get(url);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// WebElement item_01 = driver.findElement(By.id("productTitle"));
		// String item_01_name =
		// driver.findElement(By.id("productTitle")).getText();
		// String item_01_usd_price =
		// driver.findElement(By.id("priceblock_ourprice")).getText();
		// System.out.println(item_01_name+""+item_01_usd_price);
		// driver.quit();

		final String country_name = "geoplugin_countryName";
		final String currency_code = "geoplugin_currencyCode";
		final String currency_rate = "geoplugin_currencyConverter";
		String country_name_01 = null; // France
		String country_name_02 = null; // China
		String country_name_03 = null; // UK
		String country_name_04 = null; // Ukraine
		String country_name_05 = null; // Russia
		String country_code_01 = null; // France
		String country_code_02 = null; // China
		String country_code_03 = null; // UK
		String country_code_04 = null; // Ukraine
		String country_code_05 = null; // Russia
		String country_01_Rate = null; // USD/EUR
		String country_02_Rate = null; // USD/CNY
		String country_03_Rate = null; // USD/GBP
		String country_04_Rate = null; // USD/UAH
		String country_05_Rate = null; // USD/RUB

		URL url_01 = new URL(
				"http://www.geoplugin.net/json.gp?ip=88.191.179.56");
		URL url_02 = new URL(
				"http://www.geoplugin.net/json.gp?ip=61.135.248.220");
		URL url_03 = new URL(
				"http://www.geoplugin.net/json.gp?ip=92.40.254.196");
		URL url_04 = new URL(
				"http://www.geoplugin.net/json.gp?ip=93.183.203.67");
		URL url_05 = new URL(
				"http://www.geoplugin.net/json.gp?ip=213.87.141.36");

		// France
		InputStream is_01 = url_01.openStream();
		JsonParser p_01 = Json.createParser(is_01);
		while (p_01.hasNext()) {
			Event e_01 = p_01.next();
			if (e_01 == Event.KEY_NAME) {
				switch (p_01.getString()) {

				case country_name:
					p_01.next();
					country_name_01 = p_01.getString();
					// System.out.println("Country: " + country_name_01);
					break;
				case currency_code:
					p_01.next();
					country_code_01 = p_01.getString();
					// System.out.println("Currency Code: " + country_code_01);
					break;
					
				case currency_rate:	
					p_01.next();
					country_01_Rate = p_01.getString();
					//System.out.println("Currency Code: " + country_01_Rate);
					break;
				}// switch
			}// if
		}// while

		// China
		InputStream is_02 = url_02.openStream();
		JsonParser p_02 = Json.createParser(is_02);
		while (p_02.hasNext()) {
			Event e_02 = p_02.next();
			if (e_02 == Event.KEY_NAME) {
				switch (p_02.getString()) {

				case country_name:
					p_02.next();
					country_name_02 = p_02.getString();
					// System.out.println("Country: " + country_name_02);
					break;
				case currency_code:
					p_02.next();
					country_code_02 = p_02.getString();
					// System.out.println("Currency Code: " + country_code_02);
					break;
					
				case currency_rate:	
					p_02.next();
					country_02_Rate = p_02.getString();
					//System.out.println("Currency Code: " + country_02_Rate);
					break;
				}// switch
			}// if
		}// while

		// UK
		InputStream is_03 = url_03.openStream();
		JsonParser p_03 = Json.createParser(is_03);
		while (p_03.hasNext()) {
			Event e_03 = p_03.next();
			if (e_03 == Event.KEY_NAME) {
				switch (p_03.getString()) {

				case country_name:
					p_03.next();
					country_name_03 = p_03.getString();
					// System.out.println("Country: " + country_name_03);
					break;
				case currency_code:
					p_03.next();
					country_code_03 = p_03.getString();
					// System.out.println("Currency Code: " + country_code_03);
					break;
					
				case currency_rate:	
					p_03.next();
					country_03_Rate = p_03.getString();
					//System.out.println("Currency Code: " + country_03_Rate);
					break;
				}// switch
			}// if
		}// while

		// Ukraine
		InputStream is_04 = url_04.openStream();
		JsonParser p_04 = Json.createParser(is_04);
		while (p_04.hasNext()) {
			Event e_04 = p_04.next();
			if (e_04 == Event.KEY_NAME) {
				switch (p_04.getString()) {

				case country_name:
					p_04.next();
					country_name_04 = p_04.getString();
					// System.out.println("Country: " + country_name_04);
					break;
				case currency_code:
					p_04.next();
					country_code_04 = p_04.getString();
					// System.out.println("Currency Code: " + country_code_04);
					break;
					
				/*case currency_rate://currencyConverter in JSON (Ukraine) =0, should use another converter, see low.	
					p_04.next();
					country_04_Rate = p_04.getString();
					System.out.println("Currency Code: " + country_04_Rate);
					break;*/ 
				}// switch
			}// if
		}// while

		// Russia
		InputStream is_05 = url_05.openStream();
		JsonParser p_05 = Json.createParser(is_05);
		while (p_05.hasNext()) {
			Event e_05 = p_05.next();
			if (e_05 == Event.KEY_NAME) {
				switch (p_05.getString()) {

				case country_name:
					p_05.next();
					country_name_05 = p_05.getString();
					// System.out.println("Country: " + country_name_05);
					break;
				case currency_code:
					p_05.next();
					country_code_05 = p_05.getString();
					// System.out.println("Currency Code: " + country_code_05);
					break;
					
				case currency_rate:	
					p_05.next();
					country_05_Rate = p_05.getString();
					//System.out.println("Currency Code: " + country_05_Rate);
					break;
				}// switch
			}// if
		}// while


		//Ukraina , because in Ukraine's JSON currencyConverter=0, should use different method
		final String element_02 = "Rate"; // USD/Foreign Current
		URL url_01_04 = new URL(
				"http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22USDUAH%22%29&format=json&env=store://datatables.org/alltableswithkeys");
		InputStream inputstream_04 = url_01_04.openStream();
		JsonParser parser_04 = Json.createParser(inputstream_04);
		while (parser_04.hasNext()) {
			Event event_01 = parser_04.next();
			if (event_01 == Event.KEY_NAME) {
				switch (parser_04.getString()) {
				
				case element_02:
					parser_04.next();
					country_04_Rate = parser_04.getString();
					// System.out.println("USD/UAH: "+country_04_Rate);
					break;
				}// switch
			}// if
		}// while

		
		float r_01;
		r_01 = Float.parseFloat(country_01_Rate);
		// System.out.println(r_01);
		float r_02;
		r_02 = Float.parseFloat(country_02_Rate);
		// System.out.println(r_02);
		float r_03;
		r_03 = Float.parseFloat(country_03_Rate);
		// System.out.println(r_03);
		float r_04;
		r_04 = Float.parseFloat(country_04_Rate);
		// System.out.println(r_04);
		float r_05;
		r_05 = Float.parseFloat(country_05_Rate);
		// System.out.println(r_05);

		// Soccer Ball Price
		float item_01_01 = item_01_usd * r_01; // Float item_01_eur_price;
		item_01_01 = new BigDecimal(item_01_01).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_01_02 = item_01_usd * r_02; // Float item_02_cny_price;
		item_01_02 = new BigDecimal(item_01_02).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_01_03 = item_01_usd * r_03; // Float item_02_gbp_price;
		item_01_03 = new BigDecimal(item_01_03).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_01_04 = item_01_usd * r_04; // Float item_02_uah_price;
		item_01_04 = new BigDecimal(item_01_04).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_01_05 = item_01_usd * r_05; // Float item_01_rub_price;
		item_01_05 = new BigDecimal(item_01_05).setScale(2, RoundingMode.UP)
				.floatValue();

		// Withings Activity Tracker + Sleep
		float item_02_01 = item_02_usd * r_01;
		; // Float item_02_eur_price
		item_02_01 = new BigDecimal(item_02_01).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_02_02 = item_02_usd * r_02; // Float item_02_cny_price;
		item_02_02 = new BigDecimal(item_02_02).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_02_03 = item_02_usd * r_03; // Float item_02_gbp_price;
		item_02_03 = new BigDecimal(item_02_03).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_02_04 = item_02_usd * r_04; // Float item_02_uah_price;
		item_02_04 = new BigDecimal(item_02_04).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_02_05 = item_02_usd * r_05; // Float item_01_rub_price;
		item_02_05 = new BigDecimal(item_02_05).setScale(2, RoundingMode.UP)
				.floatValue();

		// Samsung Galaxy Unlocked Phone
		float item_03_01 = item_03_usd * r_01; // Float item_03_eur_price;
		item_03_01 = new BigDecimal(item_03_01).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_03_02 = item_03_usd * r_02; // Float item_03_cny_price;
		item_03_02 = new BigDecimal(item_03_02).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_03_03 = item_03_usd * r_03; // Float item_03_gbp_price;
		item_03_03 = new BigDecimal(item_03_03).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_03_04 = item_03_usd * r_04; // Float item_03_uah_price;
		item_03_04 = new BigDecimal(item_03_04).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_03_05 = item_03_usd * r_05; // Float item_03_rub_price;
		item_03_05 = new BigDecimal(item_03_05).setScale(2, RoundingMode.UP)
				.floatValue();

		// GoPro HERO3 Price
		float item_04_01 = item_04_usd * r_01; // Float item_04_eur_price;
		item_04_01 = new BigDecimal(item_04_01).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_04_02 = item_04_usd * r_02; // Float item_04_cny_price;
		item_04_02 = new BigDecimal(item_04_02).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_04_03 = item_04_usd * r_03; // Float item_04_gbp_price;
		item_04_03 = new BigDecimal(item_04_03).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_04_04 = item_04_usd * r_04; // Float item_04_uah_price;
		item_04_04 = new BigDecimal(item_04_04).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_04_05 = item_04_usd * r_05; // Float item_05_rub_price;
		item_04_05 = new BigDecimal(item_04_05).setScale(2, RoundingMode.UP)
				.floatValue();

		// iPhone 6s 64 GB Unlocked
		float item_05_01 = item_05_usd * r_01; // Float item_05_eur_price;
		item_05_01 = new BigDecimal(item_05_01).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_05_02 = item_05_usd * r_02; // Float item_05_cny_price;
		item_05_02 = new BigDecimal(item_05_02).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_05_03 = item_05_usd * r_03; // Float item_05_gbp_price;
		item_05_03 = new BigDecimal(item_05_03).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_05_04 = item_05_usd * r_04; // Float item_05_uah_price;
		item_05_04 = new BigDecimal(item_05_04).setScale(2, RoundingMode.UP)
				.floatValue();
		float item_05_05 = item_05_usd * r_05; // Float item_05_rub_price;
		item_05_05 = new BigDecimal(item_05_05).setScale(2, RoundingMode.UP)
				.floatValue();

		System.out.println("Item_01: " + item_01 + "; US Price: " + item_01_usd
				+ "$; Country: " + country_name_01 + "; Local Price: "
				+ item_01_01 + country_code_01);
		System.out.println("Item_01: " + item_01 + "; US Price: " + item_01_usd
				+ "$; Country: " + country_name_02 + "; Local Price:  "
				+ item_01_02 + country_code_02);
		System.out.println("Item_01: " + item_01 + "; US Price: " + item_01_usd
				+ "$; Country: " + country_name_03 + "; Local Price:  "
				+ item_01_03 + country_code_03);
		System.out.println("Item_01: " + item_01 + "; US Price: " + item_01_usd
				+ "$; Country: " + country_name_04 + "; Local Price:  "
				+ item_01_04 + country_code_04);
		System.out.println("Item_01: " + item_01 + "; US Price: " + item_01_usd
				+ "$; Country: " + country_name_05 + "; Local Price:  "
				+ item_01_05 + country_code_05);
		System.out.println("========================================");

		System.out.println("Item_02: " + item_02 + "; US Price: " + item_02_usd
				+ "$; Country: " + country_name_01 + "; Local Price:  "
				+ item_02_01 + country_code_01);
		System.out.println("Item_02: " + item_02 + "; US Price: " + item_02_usd
				+ "$; Country: " + country_name_02 + "; Local Price: "
				+ item_02_02 + country_code_02);
		System.out.println("Item_02: " + item_02 + "; US Price: " + item_02_usd
				+ "$; Country: " + country_name_03 + "; Local Price:  "
				+ item_02_03 + country_code_03);
		System.out.println("Item_02: " + item_02 + "; US Price: " + item_02_usd
				+ "$; Country: " + country_name_04 + "; Local Price:  "
				+ item_02_04 + country_code_04);
		System.out.println("Item_02: " + item_02 + "; US Price: " + item_02_usd
				+ "$; Country: " + country_name_05 + "; Local Price:  "
				+ item_02_05 + country_code_05);
		System.out.println("========================================");

		System.out.println("Item_03: " + item_03 + "; US Price: " + item_03_usd
				+ "$; Country: " + country_name_01 + "; Local Price:  "
				+ item_03_01 + country_code_01);
		System.out.println("Item_03: " + item_03 + "; US Price: " + item_03_usd
				+ "$; Country: " + country_name_02 + "; Local Price:  "
				+ item_03_02 + country_code_02);
		System.out.println("Item_03: " + item_03 + "; US Price: " + item_03_usd
				+ "$; Country: " + country_name_03 + "; Local Price:  "
				+ item_03_03 + country_code_03);
		System.out.println("Item_03: " + item_03 + "; US Price: " + item_03_usd
				+ "$; Country: " + country_name_04 + "; Local Price:  "
				+ item_03_04 + country_code_04);
		System.out.println("Item_03: " + item_03 + "; US Price: " + item_03_usd
				+ "$; Country: " + country_name_05 + "; Local Price:  "
				+ item_03_05 + country_code_05);
		System.out.println("========================================");

		System.out.println("Item_04: " + item_04 + "; US Price: " + item_04_usd
				+ "$; Country: " + country_name_01 + "; Local Price:  "
				+ item_04_01 + country_code_01);
		System.out.println("Item_04: " + item_04 + "; US Price: " + item_04_usd
				+ "$; Country: " + country_name_02 + "; Local Price:  "
				+ item_04_02 + country_code_02);
		System.out.println("Item_04: " + item_04 + "; US Price: " + item_04_usd
				+ "$; Country: " + country_name_03 + "; Local Price:  "
				+ item_04_03 + country_code_03);
		System.out.println("Item_04: " + item_04 + "; US Price: " + item_04_usd
				+ "$; Country: " + country_name_04 + "; Local Price:  "
				+ item_04_04 + country_code_04);
		System.out.println("Item_04: " + item_04 + "; US Price: " + item_04_usd
				+ "$; Country: " + country_name_05 + "; Local Price:  "
				+ item_04_05 + country_code_05);
		System.out.println("========================================");

		System.out.println("Item_05: " + item_05 + "; US Price: " + item_05_usd
				+ "$; Country: " + country_name_01 + "; Local Price:  "
				+ item_05_01 + country_code_01);
		System.out.println("Item_05: " + item_05 + "; US Price: " + item_05_usd
				+ "$; Country: " + country_name_02 + "; Local Price:  "
				+ item_05_02 + country_code_02);
		System.out.println("Item_05: " + item_05 + "; US Price: " + item_05_usd
				+ "$; Country: " + country_name_03 + "; Local Price:  "
				+ item_05_03 + country_code_03);
		System.out.println("Item_05: " + item_05 + "; US Price: " + item_05_usd
				+ "$; Country: " + country_name_04 + "; Local Price:  "
				+ item_05_04 + country_code_04);
		System.out.println("Item_05: " + item_05 + "; US Price: " + item_05_usd
				+ "$; Country: " + country_name_05 + "; Local Price:  "
				+ item_05_05 + country_code_05);

	}// main
}// class JSON


