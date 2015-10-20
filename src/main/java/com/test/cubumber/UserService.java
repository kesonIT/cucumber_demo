package com.test.cubumber;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	static List<String> userInWhiteList = new ArrayList<String>();
	static {
		userInWhiteList.add("keson");
		userInWhiteList.add("mike");
		userInWhiteList.add("steven");
		userInWhiteList.add("yanni");
		userInWhiteList.add("uwen");
	}

	public static boolean login(String userName, String password) {
		String realPassword = getPasswordFromDb(userName);
		if (realPassword == null || !realPassword.equals(password)) {
			return false;
		} else {
			return true;
		}
	}

	public static String getPasswordFromDb(String userName) {
		String password = userName + "_" + "password";
		return password;
	}

	public static boolean isUserInWhiteList(String userName) {
		if (userName == null || userName.trim().equals("")) {
			return false;
		} else if (userInWhiteList.indexOf(userName) == -1) {
			return false;
		} else {
			return true;
		}
	}
}
