package com.occamsrazor.web.util;

import java.io.File;

public enum Data {
	ADMIN_PATH, USER_PATH, LIST, CSV;

	@Override
	public String toString() {
		String resultValue = "";
		switch (this) {
		case ADMIN_PATH:
			resultValue = "C:" + File.separator + "Users" + File.separator + "bit1" + File.separator
					+ "spring-workspace" + File.separator + "occamsrazor-Test" + File.separator + "src" + File.separator
					+ "main" + File.separator + "resources" + File.separator + "static" + File.separator + "admin"
					+ File.separator;
			break;
		case USER_PATH:
			resultValue = "C:" + File.separator + "Users" + File.separator + "bit1" + File.separator
					+ "spring-workspace" + File.separator + "occamsrazor-Test" + File.separator + "src" + File.separator
					+ "main" + File.separator + "resources" + File.separator + "static" + File.separator + "user"
					+ File.separator;

			break;
		case LIST:
			resultValue = "list";
			break;
		case CSV:
			resultValue =".csv";
			break;

		default:
			break;
		}

		return super.toString();
	}
}
