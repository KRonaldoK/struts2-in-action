package org.zxd.struts.common.utils;

import java.util.regex.Pattern;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.utils
 * @FileName:PreValidator.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月11日上午12:13:21
 * @since Jdk1.8
 */
public class PreValidator {
	public static final boolean isAllLetter(String t) {
		if (null == t) {
			throw new IllegalArgumentException("isAllLetter 的入参为 null");
		}

		return Pattern.matches("^[a-zA-z]+$", t);
	}

	public static final boolean isAllNumberOrLetter(String t) {
		if (null == t) {
			throw new IllegalArgumentException("isAllNumberOrLetter 的入参为 null");
		}
		return Pattern.matches("^[a-zA-z0-9]+$", t);
	}

	public static final boolean isComplexPassword(String t) {
		if (null == t) {
			throw new IllegalArgumentException("isValidPassword 的入参为 null");
		}

		boolean isContainsNumber = Pattern.matches("\\d", t);
		boolean isContainsLetter = Pattern.matches("[a-zA-Z]", t);
		/**
		 * 其中的某些特殊字符是否需要转义？
		 */
		boolean isContainsSpecialLetter = Pattern.matches("[~!@#$%^&]", t);
		return isContainsNumber && isContainsLetter && isContainsSpecialLetter;
	}

	public static final boolean isNull(Object t) {
		return null == t;
	}

	public static final boolean isNullOrTrimEmpty(String t) {
		return (null == t) || t.trim().isEmpty();
	}

	public static final boolean isNumberBetween(Integer n, int min, int max) {
		if (null == n) {
			throw new IllegalArgumentException("isNumberBetween 的入参为 null");
		}

		return (min <= n) && (n <= max);
	}

	public static final boolean isNumeric(String t) {
		if (null == t) {
			throw new IllegalArgumentException("isNumeric 的入参为 null");
		}

		return Pattern.matches("^\\d+$", t);
	}

	public static final boolean isStringLengthBetween(String t, int min, int max) {
		if (null == t) {
			throw new IllegalArgumentException("isStringLengthBetween 的入参为 null");
		}

		return (t.length() >= min) && (t.length() <= max);
	}
}
