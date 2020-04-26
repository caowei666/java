package com.caowei;

import java.text.MessageFormat;
import java.util.Locale;

/**
 * ResourceBundle�����࣬�������ļ�����ָ��locale����
 */
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18NDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����һ���������Ի������󣬸ö������ݲ����������Զ�ѡ����֮��ص����Ի���
		//���������ԣ�����
		Locale locale_CN = new Locale("zh","CN");
		Locale locale_US = new Locale("en","US");
		Locale locale_default = Locale.getDefault();
		
		Scanner input = new Scanner(System.in);
		//���ڰ������ļ��Ĺ����ࣨ�����������ļ��Ļ�����������ǰ׺������info����
		ResourceBundle r = ResourceBundle.getBundle("com.caowei.info", locale_CN);
		System.out.println(r.getString("system.name"));
		System.out.println(r.getString("input.username"));
		String username = input.nextLine();
		System.out.println(r.getString("input.password"));
		String password = input.nextLine();
		
		if("admin".equals(username) && "123".equals(password)) {
			System.out.println(r.getString("login.success"));
			String welcome = r.getString("welcome");
			welcome = MessageFormat.format(welcome, username);
			System.out.println(welcome);
		}else {
			System.out.println(r.getString("Login.error"));
		} //keyд��ᱨ��MissingResourceException
	}

}
