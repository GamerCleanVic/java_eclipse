package br.com.abc.javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		System.out.println(rb.getString("show"));
		rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		System.out.println("-----\n" + rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		System.out.println(rb.getString("show"));

		/*
		 * Locale locale = new Locale("fr", "CA"); ResourceBundle.getBundle("messages",
		 * Locale);
		 * 
		 * messages_fr_CA.properties messages_fr.properties messages_pt_BR.properties
		 * messages_pt.properties messages.properties
		 */
	}
}
