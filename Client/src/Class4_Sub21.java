/* Class4_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4_Sub21 extends RSFont {
	public static byte[] aByteArray2367 = { 95, 97, 98, 99, 100, 101, 102, 103,
			104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116,
			117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56,
			57 };
	public static Class26 aClass26_2366 = RS2Font.getRs2PreparedString(
			"Das ist eine Mitglieder)2Welt(Q", false);
	public static Class26 garbageCollection;
	public static Class26 aClass26_2371 = RS2Font.getRs2PreparedString("wave2:",
			false);
	public static Class26 aClass26_2372;
	public static Class26 aClass26_2375 = aClass26_2371;
	public static Class26 aClass26_2376;
	public static Class26 aClass26_2377;
	public static Class4_Sub20_Sub12_Sub2 aClass4_Sub20_Sub12_Sub2_2368;
	public static Class4_Sub20_Sub12_Sub2[] aClass4_Sub20_Sub12_Sub2Array2378;
	public static int anInt2365;
	public static int anInt2369;
	public static int anInt2374;
	public static volatile int anInt2379;
	public static int anInt2380 = 0;
	public static int anInt2381;
	public static int anInt2382;
	public static int[] anIntArray2373;
	static {
		aClass26_2377 = aClass26_2371;
		garbageCollection = RS2Font.getRs2PreparedString("::gc", false);
		aClass26_2376 = (RS2Font.getRs2PreparedString(
				"Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", false));
		aClass26_2372 = RS2Font.getRs2PreparedString("null", false);
		anInt2379 = 0;
	}

	public static Object method623(byte[] arg0, boolean arg1, byte arg2) {
		try {
			anInt2381++;
			if (arg2 != 75)
				return null;
			if (arg0 == null)
				return null;
			if (arg0.length > 136 && !Class57.aBoolean1127) {
				try {
					Class45 class45 = ((Class45) Class.forName("Class45_Sub1")
							.newInstance());
					class45.method970(arg2 ^ ~0x1a, arg0);
					return class45;
				} catch (Throwable throwable) {
					Class57.aBoolean1127 = true;
				}
			}
			if (arg1)
				return Class47.method982(-24158, arg0);
			return arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("t.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public static void method624(byte arg0) {
		try {
			aClass26_2366 = null;
			anIntArray2373 = null;
			aClass26_2377 = null;
			aClass26_2375 = null;
			aClass26_2372 = null;
			aClass26_2376 = null;
			aByteArray2367 = null;
			if (arg0 == 95) {
				aClass26_2371 = null;
				garbageCollection = null;
				aClass4_Sub20_Sub12_Sub2Array2378 = null;
				aClass4_Sub20_Sub12_Sub2_2368 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "t.A("
					+ arg0 + ')');
		}
	}

	public static Class4_Sub20_Sub12_Sub2[] method625(Class26 arg0,
			Class19 arg1, Class26 arg2, boolean arg3) {
		try {
			int i = arg1.method754(arg0, 1);
			if (arg3 != true)
				aByteArray2367 = null;
			anInt2382++;
			int i_0_ = arg1.method747(!arg3, arg2, i);
			return Class4_Sub20_Sub7.method376(i, i_0_, arg1, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("t.B("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public Class26 aClass26_2364;
}
