/* Class4_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RS2Font extends Class4_Sub20 {
	public static boolean[] aBooleanArray2765;
	public static Class26 aClass26_2759;
	public static Class26 aClass26_2762;
	public static Class26 aClass26_2764;
	public static Class26 aClass26_2767 = getRs2PreparedString("Hidden)2use", false);
	public static Class26 aClass26_2770 = getRs2PreparedString("(U0a )2 in: ", false);
	public static Class26 aClass26_2779;
	public static Class26 aClass26_2782 = getRs2PreparedString("Prepared sound engine",
			false);
	public static Class26 aClass26_2786;
	public static Class26 aClass26_2787;
	public static RSInterface aClass4_Sub13_2763;
	public static Class4_Sub20_Sub12_Sub2 aClass4_Sub20_Sub12_Sub2_2769;
	public static int anInt2760;
	public static int anInt2761;
	public static int anInt2768;
	public static int anInt2772;
	public static int anInt2773;
	public static int anInt2774;
	public static int anInt2775;
	public static int anInt2780;
	public static int anInt2781;
	public static int anInt2783;
	public static int anInt2788;
	public static int anInt2789;
	public static int[] anIntArray2771;
	public static int[] anIntArray2777;
	static {
		aClass26_2779 = getRs2PreparedString("::", false);
		aClass26_2764 = getRs2PreparedString("mn", false);
		aBooleanArray2765 = new boolean[5];
		anIntArray2771 = new int[256];
		aClass26_2762 = aClass26_2782;
		aClass26_2787 = getRs2PreparedString(
				"To play on this world move to a free area first", false);
		anInt2768 = 0;
		aClass26_2759 = getRs2PreparedString("Verbinde mit Server)3)3)3", false);
		anIntArray2777 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
				1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143,
				524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431,
				67108863, 134217727, 268435455, 536870911, 1073741823,
				2147483647, -1 };
		aClass26_2786 = aClass26_2787;
	}

	public static Class4_Sub20_Sub14 method337(int arg0, boolean arg1,
			int arg2, Class19 arg3, Class19 arg4) {
		try {
			boolean bool = true;
			int[] is = arg4.method751(59, arg0);
			if (arg2 >= -23)
				aClass26_2759 = null;
			for (int i = 0; (is.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				byte[] is_0_ = arg4.method738(is[i], (byte) -78, arg0);
				if (is_0_ == null)
					bool = false;
				else {
					int i_1_ = is_0_[1] & 0xff | is_0_[0] << 49274504 & 0xff00;
					byte[] is_2_;
					if (!arg1)
						is_2_ = arg3.method738(0, (byte) -103, i_1_);
					else
						is_2_ = arg3.method738(i_1_, (byte) -121, 0);
					if (is_2_ == null)
						bool = false;
				}
			}
			anInt2772++;
			if (!bool)
				return null;
			try {
				return new Class4_Sub20_Sub14(arg4, arg3, arg0, arg1);
			} catch (Exception exception) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ae.I("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ','
					+ (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public static RSInterface method338(RSInterface arg0, boolean arg1) {
		try {
			anInt2773++;
			int i = RSCanvas.method32(arg1, Class54.method1011(arg0, -22389));
			if ((i ^ 0xffffffff) == -1)
				return null;
			for (int i_3_ = 0; (i ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
				arg0 = Class4_Sub20.method322(arg1, arg0.anInt2183);
				if (arg0 == null)
					return null;
			}
			if (arg1 != true)
				aClass26_2770 = null;
			return arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ae.A("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method340(boolean arg0) {
		try {
			aClass26_2767 = null;
			aClass26_2759 = null;
			aClass26_2764 = null;
			aClass26_2779 = null;
			aClass26_2786 = null;
			aClass26_2770 = null;
			if (arg0 == false) {
				aClass4_Sub20_Sub12_Sub2_2769 = null;
				aClass26_2762 = null;
				anIntArray2777 = null;
				aClass26_2787 = null;
				aBooleanArray2765 = null;
				aClass4_Sub13_2763 = null;
				aClass26_2782 = null;
				anIntArray2771 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ae.E("
					+ arg0 + ')');
		}
	}

	public static void method341(byte arg0) {
		try {
			while ((Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method262(
					(byte) 24, Class4_Sub20_Sub15.anInt3157) ^ 0xffffffff) <= -28) {
				int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 15);
				if (i == 32767)
					break;
				boolean bool = false;
				if (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i] == null) {
					Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i] = new Class4_Sub20_Sub7_Sub1_Sub2();
					bool = true;
				}
				Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i];
				Class4_Sub11_Sub1.anIntArray2695[RSApplet.anInt12++] = i;
				class4_sub20_sub7_sub1_sub2.anInt3256 = Region.anInt134;
				int i_4_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 5);
				if (i_4_ > 15)
					i_4_ -= 32;
				class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617 = Class71
						.method1155(-91,
								Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
										.method266(-1432215741, 14));
				int i_5_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 1);
				if ((i_5_ ^ 0xffffffff) == -2)
					Class48.anIntArray979[JagexException.anInt1726++] = i;
				int i_6_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 1);
				int i_7_ = (Class34.anIntArray1763[Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
						.method266(arg0 ^ 0x555de08c, 3)]);
				if (bool)
					class4_sub20_sub7_sub1_sub2.anInt3217 = class4_sub20_sub7_sub1_sub2.anInt3219 = i_7_;
				int i_8_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 5);
				class4_sub20_sub7_sub1_sub2.anInt3269 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.anInt2821);
				if (i_8_ > 15)
					i_8_ -= 32;
				class4_sub20_sub7_sub1_sub2.anInt3246 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.anInt2800);
				class4_sub20_sub7_sub1_sub2.anInt3237 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.anInt2837);
				class4_sub20_sub7_sub1_sub2.anInt3263 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.anInt2793);
				class4_sub20_sub7_sub1_sub2.anInt3272 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.anInt2801);
				if ((class4_sub20_sub7_sub1_sub2.anInt3237 ^ 0xffffffff) == -1)
					class4_sub20_sub7_sub1_sub2.anInt3219 = 0;
				class4_sub20_sub7_sub1_sub2.anInt3250 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.anInt2807);
				class4_sub20_sub7_sub1_sub2.anInt3251 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.anInt2796);
				class4_sub20_sub7_sub1_sub2.anInt3265 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.anInt2825);
				class4_sub20_sub7_sub1_sub2.anInt3244 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.anInt2791);
				class4_sub20_sub7_sub1_sub2
						.method385(
								(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])
										+ i_8_,
								(i_6_ ^ 0xffffffff) == -2,
								128,
								i_4_
										+ (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]));
			}
			anInt2789++;
			if (arg0 != -49)
				aClass26_2764 = null;
			Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method274((byte) -68);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ae.F("
					+ arg0 + ')');
		}
	}

	public static Class26 getRs2PreparedString(String arg0, boolean arg1) {
		try {
			anInt2775++;
			byte[] stringData = arg0.getBytes();
			int i = stringData.length;
			Class26 class26 = new Class26();
			int i_9_ = 0;
			if (arg1 != false)
				return null;
			class26.aByteArray1803 = new byte[i];
			while ((i ^ 0xffffffff) < (i_9_ ^ 0xffffffff)) {
				int i_10_ = stringData[i_9_++] & 0xff;
				if (i_10_ <= 45 && i_10_ >= 40) {
					if (i_9_ >= i)
						break;
					int i_11_ = 0xff & stringData[i_9_++];
					class26.aByteArray1803[class26.anInt1805++] = (byte) ((-40 + i_10_) * 43 + (i_11_ - 48));
				} else if ((i_10_ ^ 0xffffffff) != -1)
					class26.aByteArray1803[class26.anInt1805++] = (byte) i_10_;
			}
			class26.method831(0);
			return class26.method828(true);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ae.H("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method345(byte arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		try {
			Class8.aClass4_Sub20_Sub12_Sub1Array262[0].method507(arg3, arg4);
			Class8.aClass4_Sub20_Sub12_Sub1Array262[1].method507(arg3, -16
					+ (arg5 + arg4));
			Class4_Sub20_Sub12.method488(arg3, 16 + arg4, 16, arg5 + -32,
					Class45.anInt920);
			int i = arg5 * (-32 + arg5) / arg2;
			if ((i ^ 0xffffffff) > -9)
				i = 8;
			anInt2774++;
			int i_19_ = (-i + arg5 + -32) * arg1 / (arg2 + -arg5);
			Class4_Sub20_Sub12.method488(arg3, i_19_ + arg4 - -16, 16, i,
					Class19_Sub1.anInt2511);
			if (arg0 <= -110) {
				Class4_Sub20_Sub12.method494(arg3, arg4 + (16 + i_19_), i,
						Class65.anInt1292);
				Class4_Sub20_Sub12.method494(1 + arg3, arg4 - (-16 + -i_19_),
						i, Class65.anInt1292);
				Class4_Sub20_Sub12.method505(arg3, i_19_ + arg4 - -16, 16,
						Class65.anInt1292);
				Class4_Sub20_Sub12.method505(arg3, arg4 - (-17 - i_19_), 16,
						Class65.anInt1292);
				Class4_Sub20_Sub12.method494(15 + arg3, arg4 + (16 - -i_19_),
						i, Class4_Sub2_Sub1.anInt2593);
				Class4_Sub20_Sub12.method494(14 + arg3, 17 + (arg4 - -i_19_),
						i - 1, Class4_Sub2_Sub1.anInt2593);
				Class4_Sub20_Sub12.method505(arg3, i + (i_19_ + arg4 - -15),
						16, Class4_Sub2_Sub1.anInt2593);
				Class4_Sub20_Sub12.method505(arg3 + 1, i + 14 + (arg4 + i_19_),
						15, Class4_Sub2_Sub1.anInt2593);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ae.G("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ')'));
		}
	}

	public int anInt2766;

	public int anInt2776 = 0;

	public int anInt2778;

	public int anInt2784;

	public int anInt2785;

	public void method339(int arg0, StreamBuffer arg1, int arg2) {
		try {
			for (;;) {
				int i = arg1.get();
				if (i == 0)
					break;
				method344(-120, i, arg1, arg0);
			}
			if (arg2 == -13998)
				anInt2783++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ae.J("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ')'));
		}
	}

	public void method343(byte arg0, int arg1) {
		try {
			anInt2788++;
			double d = (arg1 & 0xff) / 256.0;
			double d_12_ = ((arg1 & 0xff7909) >> -913773808) / 256.0;
			double d_13_ = (arg1 >> 1795266248 & 0xff) / 256.0;
			double d_14_ = d_12_;
			if (d_13_ < d_14_)
				d_14_ = d_13_;
			double d_15_ = d_12_;
			double d_16_ = 0.0;
			if (d_15_ < d_13_)
				d_15_ = d_13_;
			if (d < d_14_)
				d_14_ = d;
			if (d_15_ < d)
				d_15_ = d;
			double d_17_ = 0.0;
			double d_18_ = (d_15_ + d_14_) / 2.0;
			anInt2778 = (int) (d_18_ * 256.0);
			if (d_15_ != d_14_) {
				if (d_15_ != d_12_) {
					if (d_15_ != d_13_) {
						if (d_15_ == d)
							d_16_ = (d_12_ - d_13_) / (d_15_ - d_14_) + 4.0;
					} else
						d_16_ = 2.0 + (-d_12_ + d) / (-d_14_ + d_15_);
				} else
					d_16_ = (-d + d_13_) / (d_15_ - d_14_);
				if (d_18_ < 0.5)
					d_17_ = (d_15_ - d_14_) / (d_15_ + d_14_);
				if (d_18_ >= 0.5)
					d_17_ = (-d_14_ + d_15_) / (-d_14_ + (-d_15_ + 2.0));
			}
			if (!(d_18_ > 0.5))
				anInt2784 = (int) (d_18_ * d_17_ * 512.0);
			else
				anInt2784 = (int) (512.0 * (d_17_ * (1.0 - d_18_)));
			if (anInt2778 >= 0) {
				if ((anInt2778 ^ 0xffffffff) < -256)
					anInt2778 = 255;
			} else
				anInt2778 = 0;
			d_16_ /= 6.0;
			if (anInt2784 < 1)
				anInt2784 = 1;
			anInt2785 = (int) (d_16_ * anInt2784);
			anInt2766 = (int) (256.0 * d_17_);
			if (anInt2766 < 0)
				anInt2766 = 0;
			else if (anInt2766 > 255)
				anInt2766 = 255;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ae.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method344(int arg0, int arg1, StreamBuffer arg2, int arg3) {
		try {
			if (arg0 > -112)
				method343((byte) -44, -45);
			if ((arg1 ^ 0xffffffff) == -2)
				anInt2776 = arg2.method248(false);
			anInt2780++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ae.D("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public void method346(int arg0) {
		try {
			method343((byte) 126, anInt2776);
			if (arg0 != 23864)
				method344(-4, 56, null, 56);
			anInt2760++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ae.B("
					+ arg0 + ')');
		}
	}
}
