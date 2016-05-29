package csd.day1;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;


public class ZhishuTest {

	@Test
	public void test() {
		assertEquals(Arrays.asList(2), Zhishu.calc(2));
		assertEquals(Arrays.asList(3), Zhishu.calc(3));
		assertEquals(Arrays.asList(2, 2), Zhishu.calc(4));
		assertEquals(Arrays.asList(5), Zhishu.calc(5));
		assertEquals(Arrays.asList(2, 3), Zhishu.calc(6));
		assertEquals(Arrays.asList(2, 2, 2), Zhishu.calc(8));
		assertEquals(Arrays.asList(3, 3), Zhishu.calc(9));
		assertEquals(Arrays.asList(2, 2, 3, 7, 11), Zhishu.calc(2*2*3*7*11));
	}

}
