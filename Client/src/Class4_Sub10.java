/* Class4_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4_Sub10 extends RSFont {
	public static Class16 aClass16_2045 = new Class16(4096);
	public static Class26 aClass26_2046;
	public static Class26 aClass26_2047;
	public static Class26 aClass26_2048 = RS2Font.getRs2PreparedString(
			"leuchten1:", false);
	public static Class26 aClass26_2049;
	public static Class26 aClass26_2050 = RS2Font.getRs2PreparedString(
			"The server is being updated)3", false);
	public static Class26 aClass26_2051;
	public static Class4_Sub20_Sub12_Sub2[] aClass4_Sub20_Sub12_Sub2Array2022;
	public static int anInt2020;
	public static int anInt2021;
	public static int anInt2023;
	public static int anInt2024;
	public static int anInt2025;
	public static int anInt2027;
	public static int anInt2032;
	public static int anInt2038;
	static {
		aClass26_2047 = RS2Font.getRs2PreparedString(": ", false);
		aClass26_2049 = aClass26_2050;
		aClass26_2051 = RS2Font.getRs2PreparedString(
				" from your ignore list first", false);
		aClass26_2046 = aClass26_2051;
	}

	public static void method202(int arg0) {
		aClass4_Sub20_Sub12_Sub2Array2022 = null;
		aClass26_2049 = null;
		aClass26_2050 = null;
		aClass26_2048 = null;
		aClass16_2045 = null;
		aClass26_2046 = null;
		aClass26_2047 = null;
		aClass26_2051 = null;
		if (arg0 != 0)
			method205((byte) -104, 46);
	}

	public static Class4_Sub20_Sub15 method203(int arg0, int arg1) {
		try {
			anInt2020++;
			Class4_Sub20_Sub15 class4_sub20_sub15 = ((Class4_Sub20_Sub15) Class4_Sub20_Sub8.aClass66_3014
					.method1083(arg1, true));
			if (class4_sub20_sub15 != null)
				return class4_sub20_sub15;
			byte[] is = RSFont.aClass19_158.method746(16, (byte) 119, arg1);
			class4_sub20_sub15 = new Class4_Sub20_Sub15();
			if (is != null)
				class4_sub20_sub15.method605(new StreamBuffer(is), 4606);
			Class4_Sub20_Sub8.aClass66_3014.method1082(true, arg1,
					class4_sub20_sub15);
			return class4_sub20_sub15;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("kc.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static Class26 method205(byte arg0, int arg1) {
		try {
			anInt2032++;
			Class26 class26 = new Class26();
			class26.anInt1805 = 0;
			class26.aByteArray1803 = new byte[arg1];
			if (arg0 >= -73)
				return null;
			return class26;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("kc.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public Class4_Sub2_Sub3 aClass4_Sub2_Sub3_2028;
	public Class4_Sub23 aClass4_Sub23_2035;
	public Class4_Sub4_Sub1 aClass4_Sub4_Sub1_2031;
	public Class57 aClass57_2036;
	public int anInt2015;
	public int anInt2016;
	public int anInt2017;
	public int anInt2018;
	public int anInt2019;
	public int anInt2026;
	public int anInt2029;
	public int anInt2030;
	public int anInt2033;
	public int anInt2034;
	public int anInt2037;
	public int anInt2039;
	public int anInt2040;

	public int anInt2041;

	public int anInt2042;

	public int anInt2043;

	public int anInt2044;

	public void method204(byte arg0) {
		try {
			anInt2025++;
			aClass4_Sub4_Sub1_2031 = null;
			aClass57_2036 = null;
			if (arg0 != 74)
				aClass4_Sub23_2035 = null;
			aClass4_Sub2_Sub3_2028 = null;
			aClass4_Sub23_2035 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "kc.D("
					+ arg0 + ')');
		}
	}
}
