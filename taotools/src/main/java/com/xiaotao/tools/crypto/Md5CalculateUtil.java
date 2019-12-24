package com.xiaotao.tools.crypto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

public class Md5CalculateUtil {

	public static String getFileMD5(File file) {
		FileInputStream fileInputStream = null;
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			fileInputStream = new FileInputStream(file);
			byte[] buffer = new byte[8192];
			int length;
			while ((length = fileInputStream.read(buffer)) != -1) {
				md5.update(buffer, 0, length);
			}
			return new String(Hex.encodeHex(md5.digest()));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 求一个字符串的md5值
	 * 
	 * @param target 字符串
	 * @return md5 value
	 */
	public static String getStringMD5(String target) {
		return DigestUtils.md5Hex(target);
	}

}
