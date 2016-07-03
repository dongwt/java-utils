package com.dongwt.java.utils.digest;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

public class MD5Test {
	
	@Test
	public void selfTest(){
		String param = "834575475";
		String selfResult = MD5Utils.MD5(param);
		String apacheResult = DigestUtils.md5Hex(param);
		System.out.println(selfResult.equals(apacheResult));
	}

}
