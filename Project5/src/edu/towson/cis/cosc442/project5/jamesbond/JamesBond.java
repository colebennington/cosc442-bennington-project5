package edu.towson.cis.cosc442.project5.jamesbond;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JamesBond {

	public boolean bondRegex(String input) {
		Pattern regex = Pattern.compile(".*[(]{1}.*([0]{2}[7]{1}).*[)]{1}.*");
		Matcher matcher = regex.matcher(input);
		return matcher.find();
	}

}
