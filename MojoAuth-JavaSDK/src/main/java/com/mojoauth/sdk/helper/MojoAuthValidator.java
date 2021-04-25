package com.mojoauth.sdk.helper;

public class MojoAuthValidator {
	private MojoAuthValidator() {
	}

	public static boolean isNullOrWhiteSpace(String str) {
		if (str != null) {
			str = str.trim();
		}
		return str != null && !str.isEmpty() ? false : true;
	}

	public static String getValidationMessage(final String s) {
		return "The " + s + " is a Required Paramter So its can not be null or empty";
	}
}
