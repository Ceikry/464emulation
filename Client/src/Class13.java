/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class Class13 {
	public static Class26 aClass26_368;
	public static Class26 aClass26_370;
	public static Class26 aClass26_373;
	public static Class26 aClass26_375 = RS2Font.getRs2PreparedString(
			"Error loading your profile)3", false);
	public static Class26 aClass26_386;
	public static Class26[] aClass26Array385;
	public static Class65 aClass65_381;
	public static Class65 aClass65_383;
	public static int anInt369;
	public static int anInt372;
	public static int anInt374;
	public static int anInt377;
	public static int anInt379;
	public static int anInt380;
	public static int anInt382;
	public static int anInt387;
	public static int anInt388;
	static {
		aClass26_373 = RS2Font.getRs2PreparedString("Bitte entfernen Sie ",
				false);
		aClass26_370 = aClass26_375;
		aClass26_368 = RS2Font.getRs2PreparedString("l", false);
		aClass65_381 = new Class65();
		aClass26Array385 = new Class26[100];
		aClass26_386 = RS2Font.getRs2PreparedString("welle2:", false);
		aClass65_383 = new Class65();
	}

	public static void method679(int arg0, int arg1, boolean arg2, int arg3) {
		try {
			anInt379++;
			Class41.method938((byte) 0);
			Class4_Sub20_Sub12.method492(arg0, arg3,
					Region.aClass4_Sub20_Sub12_Sub1_132.anInt3511 + arg0, arg3
							+ Region.aClass4_Sub20_Sub12_Sub1_132.anInt3514);
			if (Class4_Sub20_Sub9.anInt3051 != 2
					&& (Class4_Sub20_Sub9.anInt3051 ^ 0xffffffff) != -6) {
				int i = Class31.anInt680 + Class49.anInt999 & 0x7ff;
				int i_0_ = 464 - (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) / 32;
				int i_1_ = 48 - -((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) / 32);
				RS2Font.aClass4_Sub20_Sub12_Sub2_2769.method535(
						25 + arg0, arg3 - -5, 146, 151, i_1_, i_0_, i,
						Class4_Sub20_Sub5.anInt2889 + 256,
						Class81.anIntArray1670, Class49.anIntArray995);
				for (int i_2_ = 0; ((Class13_Sub2.anInt2470 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
					int i_3_ = -((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) / 32)
							+ (4 * Class7.anIntArray221[i_2_] + 2);
					int i_4_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) / 32) + (4 * Class4_Sub8.anIntArray1979[i_2_] + 2));
					Class4_Sub20_Sub9
							.method475(
									i_3_,
									i_4_,
									(byte) 123,
									(Class4_Sub2_Sub1.aClass4_Sub20_Sub12_Sub2Array2600[i_2_]),
									arg3, arg0);
				}
				for (int i_5_ = 0; i_5_ < 104; i_5_++) {
					for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -105; i_6_++) {
						Class65 class65 = (Class40.aClass65ArrayArrayArray787[Class82.anInt1711][i_5_][i_6_]);
						if (class65 != null) {
							int i_7_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) / 32)
									+ 4 * i_5_ - -2);
							int i_8_ = (i_6_ * 4 + 2 - (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) / 32);
							Class4_Sub20_Sub9
									.method475(
											i_7_,
											i_8_,
											(byte) 118,
											Class35.aClass4_Sub20_Sub12_Sub2Array749[0],
											arg3, arg0);
						}
					}
				}
				for (int i_9_ = 0; RSApplet.anInt12 > i_9_; i_9_++) {
					Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[Class4_Sub11_Sub1.anIntArray2695[i_9_]]);
					if (class4_sub20_sub7_sub1_sub2 != null
							&& class4_sub20_sub7_sub1_sub2.method384(-19456)) {
						Class4_Sub20_Sub3 class4_sub20_sub3 = (class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617);
						if (class4_sub20_sub3 != null
								&& class4_sub20_sub3.anIntArray2832 != null)
							class4_sub20_sub3 = class4_sub20_sub3
									.method354((byte) 120);
						if (class4_sub20_sub3 != null
								&& class4_sub20_sub3.aBoolean2804
								&& class4_sub20_sub3.aBoolean2835) {
							int i_10_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) / 32) + (class4_sub20_sub7_sub1_sub2.anInt3270 / 32));
							int i_11_ = (class4_sub20_sub7_sub1_sub2.anInt3267 / 32 - (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) / 32);
							Class4_Sub20_Sub9
									.method475(
											i_10_,
											i_11_,
											(byte) 124,
											Class35.aClass4_Sub20_Sub12_Sub2Array749[1],
											arg3, arg0);
						}
					}
				}
				for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class4_Sub20_Sub7_Sub6.anInt3431 ^ 0xffffffff)); i_12_++) {
					Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[Class4_Sub23.anIntArray2432[i_12_]]);
					if (class4_sub20_sub7_sub1_sub1 != null
							&& class4_sub20_sub7_sub1_sub1.method384(-19456)) {
						int i_13_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) / 32) + class4_sub20_sub7_sub1_sub1.anInt3270 / 32);
						boolean bool = false;
						int i_14_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) / 32) + class4_sub20_sub7_sub1_sub1.anInt3267 / 32);
						long l = class4_sub20_sub7_sub1_sub1.aClass26_3593
								.method806((byte) -111);
						for (int i_15_ = 0; i_15_ < RSApplet.anInt23; i_15_++) {
							if (Class64.aLongArray1279[i_15_] == l
									&& (Class50.anIntArray1005[i_15_] ^ 0xffffffff) != -1) {
								bool = true;
								break;
							}
						}
						boolean bool_16_ = false;
						if (((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3590) ^ 0xffffffff) != -1
								&& class4_sub20_sub7_sub1_sub1.anInt3590 != 0
								&& ((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3590) == class4_sub20_sub7_sub1_sub1.anInt3590))
							bool_16_ = true;
						if (bool)
							Class4_Sub20_Sub9
									.method475(
											i_13_,
											i_14_,
											(byte) 121,
											Class35.aClass4_Sub20_Sub12_Sub2Array749[3],
											arg3, arg0);
						else if (bool_16_)
							Class4_Sub20_Sub9
									.method475(
											i_13_,
											i_14_,
											(byte) 124,
											Class35.aClass4_Sub20_Sub12_Sub2Array749[4],
											arg3, arg0);
						else
							Class4_Sub20_Sub9
									.method475(
											i_13_,
											i_14_,
											(byte) 126,
											Class35.aClass4_Sub20_Sub12_Sub2Array749[2],
											arg3, arg0);
					}
				}
				if (Class57.anInt1141 != 0
						&& (Region.anInt134 % 20 ^ 0xffffffff) > -11) {
					if (Class57.anInt1141 == 1
							&& Class10.anInt313 >= 0
							&& (Class10.anInt313 < (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151).length)) {
						Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[Class10.anInt313]);
						if (class4_sub20_sub7_sub1_sub2 != null) {
							int i_17_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) / 32) + (class4_sub20_sub7_sub1_sub2.anInt3270 / 32));
							int i_18_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) / 32) + (class4_sub20_sub7_sub1_sub2.anInt3267 / 32));
							Class4_Sub20
									.method323(
											(Class4_Sub10.aClass4_Sub20_Sub12_Sub2Array2022[1]),
											arg3, i_18_, (byte) 125, arg0,
											i_17_);
						}
					}
					if ((Class57.anInt1141 ^ 0xffffffff) == -3) {
						int i_19_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) / 32) + 2 + (-Class4_Sub20_Sub8.anInt2987 + Class76.anInt1550) * 4);
						int i_20_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) / 32) + (2 + 4 * (Class76.anInt1582 - Class6.anInt217)));
						Class4_Sub20
								.method323(
										Class4_Sub10.aClass4_Sub20_Sub12_Sub2Array2022[1],
										arg3, i_19_, (byte) 107, arg0, i_20_);
					}
					if ((Class57.anInt1141 ^ 0xffffffff) == -11
							&& (Class16.anInt426 ^ 0xffffffff) <= -1
							&& (Class16.anInt426 < (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358).length)) {
						Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[Class16.anInt426]);
						if (class4_sub20_sub7_sub1_sub1 != null) {
							int i_21_ = (class4_sub20_sub7_sub1_sub1.anInt3270 / 32 + -((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) / 32));
							int i_22_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) / 32) + (class4_sub20_sub7_sub1_sub1.anInt3267 / 32));
							Class4_Sub20
									.method323(
											(Class4_Sub10.aClass4_Sub20_Sub12_Sub2Array2022[1]),
											arg3, i_22_, (byte) -9, arg0, i_21_);
						}
					}
				}
				if ((Class1.anInt74 ^ 0xffffffff) != -1) {
					int i_23_ = (4 * Class1.anInt74 + 2 + -((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) / 32));
					int i_24_ = (-((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) / 32) + 2 + Class67.anInt1352 * 4);
					Class4_Sub20_Sub9.method475(i_23_, i_24_, (byte) 116,
							Class4_Sub10.aClass4_Sub20_Sub12_Sub2Array2022[0],
							arg3, arg0);
				}
				Class4_Sub20_Sub12.method488(arg0 - -97, arg3 - -82 + -4, 3, 3,
						16777215);
			} else
				Class4_Sub20_Sub12.method489(25 + arg0, arg3 - -5, 0,
						Class81.anIntArray1670, Class49.anIntArray995);
			if (Class4_Sub20_Sub9.anInt3051 >= 3)
				Class4_Sub20_Sub12.method489(arg0, arg3, 0,
						Class62.anIntArray1233, Class81.anIntArray1654);
			else
				Class37.aClass4_Sub20_Sub12_Sub2_761.method535(arg0, arg3, 33,
						33, 25, 25, Class49.anInt999, 256,
						Class62.anIntArray1233, Class81.anIntArray1654);
			if (Class4_Sub20_Sub7_Sub3.aBooleanArray3342[arg1])
				Region.aClass4_Sub20_Sub12_Sub1_132.method507(arg0, arg3);
			Class16.aBooleanArray452[arg1] = arg2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("dd.S("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method681(int arg0) {
		try {
			Class4_Sub14.aByteArrayArrayArray2275 = null;
			Class4_Sub20_Sub4.aByteArrayArrayArray2861 = null;
			SceneGraph.heightmap = null;
			Class4_Sub20_Sub7_Sub5.anIntArrayArray3390 = null;
			if (arg0 != 4)
				method679(-69, -59, false, -101);
			Class4_Sub23.anIntArray2411 = null;
			Class59.aByteArrayArrayArray1181 = null;
			anInt387++;
			Class65.anIntArray1297 = null;
			Class46.anIntArray937 = null;
			Class4_Sub20_Sub10.aByteArrayArrayArray3054 = null;
			Class4_Sub21.anIntArray2373 = null;
			Class26.anIntArray1798 = null;
			Class4_Sub20_Sub10.aByteArrayArrayArray3065 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "dd.M("
					+ arg0 + ')');
		}
	}

	public static void method682(byte arg0) {
		do {
			try {
				anInt380++;
				if (RS2Font.aClass4_Sub13_2763 == null
						&& Class4_Sub20_Sub16.aClass4_Sub13_3179 == null) {
					int i = Class62.anInt1227;
					if (!Class4_Sub20_Sub16.aBoolean3169) {
						if (i == 1
								&& (Class4_Sub20_Sub8.anInt2980 ^ 0xffffffff) < -1) {
							int i_29_ = (Class82.anIntArray1712[Class4_Sub20_Sub8.anInt2980
									+ -1]);
							if ((i_29_ ^ 0xffffffff) == -30
									|| (i_29_ ^ 0xffffffff) == -40
									|| (i_29_ ^ 0xffffffff) == -21
									|| (i_29_ ^ 0xffffffff) == -22
									|| (i_29_ ^ 0xffffffff) == -32
									|| i_29_ == 37
									|| (i_29_ ^ 0xffffffff) == -29
									|| i_29_ == 4
									|| (i_29_ ^ 0xffffffff) == -42
									|| i_29_ == 45
									|| (i_29_ ^ 0xffffffff) == -51
									|| (i_29_ ^ 0xffffffff) == -1003) {
								int i_30_ = (Class40.anIntArray789[-1
										+ Class4_Sub20_Sub8.anInt2980]);
								int i_31_ = (Class43.anIntArray885[-1
										+ Class4_Sub20_Sub8.anInt2980]);
								RSInterface class4_sub13 = Class4_Sub20
										.method322(true, i_30_);
								if ((Class2.method47(Class54.method1011(
										class4_sub13, -22389), 4626))
										|| (Class72.method1161(1, Class54
												.method1011(class4_sub13,
														-22389)))) {
									Class4_Sub23.aBoolean2419 = false;
									RSFont.anInt161 = 0;
									if (RS2Font.aClass4_Sub13_2763 != null)
										Class67.method1088(
												(RS2Font.aClass4_Sub13_2763),
												0);
									RS2Font.aClass4_Sub13_2763 = Class4_Sub20
											.method322(true, i_30_);
									Class58.anInt1161 = JagexException.anInt1729;
									AppletListener.anInt1464 = Class37.anInt758;
									Class4_Sub20_Sub14.anInt3139 = i_31_;
									Class67.method1088(
											(RS2Font.aClass4_Sub13_2763),
											0);
									break;
								}
							}
						}
						if ((i ^ 0xffffffff) == -2
								&& ((Class81.anInt1681 == 1 && Class4_Sub20_Sub8.anInt2980 > 2) || Class42
										.method942(80, -1
												+ (Class4_Sub20_Sub8.anInt2980))))
							i = 2;
						if ((i ^ 0xffffffff) == -2
								&& (Class4_Sub20_Sub8.anInt2980 ^ 0xffffffff) < -1)
							StreamBuffer.method221(arg0 + -48,
									(Class4_Sub20_Sub8.anInt2980 - 1));
						if (i == 2
								&& (Class4_Sub20_Sub8.anInt2980 ^ 0xffffffff) < -1)
							SceneGraph.method707(-21);
					} else {
						if ((i ^ 0xffffffff) != -2) {
							int i_32_ = Class37.anInt767;
							int i_33_ = Class4_Sub1.anInt1859;
							if ((Class4_Sub20_Sub17.anInt3195 - 10 ^ 0xffffffff) < (i_32_ ^ 0xffffffff)
									|| ((Class63.anInt1243
											+ Class4_Sub20_Sub17.anInt3195 - -10) ^ 0xffffffff) > (i_32_ ^ 0xffffffff)
									|| -10 + Class4_Sub1.anInt1860 > i_33_
									|| ((i_33_ ^ 0xffffffff) < ((Class4_Sub1.anInt1860
											- -Class45.anInt926 - -10) ^ 0xffffffff))) {
								Class4_Sub20_Sub16.aBoolean3169 = false;
								Class4_Sub20_Sub17.method621(
										Class4_Sub1.anInt1860, 16052,
										Class63.anInt1243,
										Class4_Sub20_Sub17.anInt3195,
										Class45.anInt926);
							}
						}
						if (i == 1) {
							int i_34_ = Class4_Sub20_Sub17.anInt3195;
							int i_35_ = Class4_Sub1.anInt1860;
							int i_36_ = Class63.anInt1243;
							int i_37_ = Class37.anInt758;
							int i_38_ = JagexException.anInt1729;
							int i_39_ = -1;
							for (int i_40_ = 0; ((i_40_ ^ 0xffffffff) > (Class4_Sub20_Sub8.anInt2980 ^ 0xffffffff)); i_40_++) {
								int i_41_ = (((-i_40_ + (-1 + Class4_Sub20_Sub8.anInt2980)) * 15) + (i_35_ - -31));
								if (i_34_ < i_37_
										&& ((i_36_ + i_34_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff))
										&& (i_38_ ^ 0xffffffff) < (i_41_ + -13 ^ 0xffffffff)
										&& i_38_ < 3 + i_41_)
									i_39_ = i_40_;
							}
							if (i_39_ != -1)
								StreamBuffer.method221(0, i_39_);
							Class4_Sub20_Sub16.aBoolean3169 = false;
							Class4_Sub20_Sub17.method621(Class4_Sub1.anInt1860,
									16052, Class63.anInt1243,
									(Class4_Sub20_Sub17.anInt3195),
									Class45.anInt926);
						}
					}
					if (arg0 == 48)
						break;
					method681(-93);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						"dd.Q(" + arg0 + ')');
			}
			break;
		} while (false);
	}

	public static void method683(byte arg0) {
		try {
			aClass65_383 = null;
			aClass26_370 = null;
			aClass26_375 = null;
			aClass26_368 = null;
			aClass26_386 = null;
			aClass65_381 = null;
			aClass26_373 = null;
			aClass26Array385 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "dd.R("
					+ arg0 + ')');
		}
	}

	public static void method684(byte arg0) {
		do {
			try {
				Class81.anInt1695 = 0;
				int i = (Class6.anInt217 + ((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) >> 158975591));
				anInt388++;
				int i_43_ = (Class4_Sub20_Sub8.anInt2987 + ((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) >> -903569625));
				if (i >= 3053 && (i ^ 0xffffffff) >= -3157
						&& (i_43_ ^ 0xffffffff) <= -3057
						&& (i_43_ ^ 0xffffffff) >= -3137)
					Class81.anInt1695 = 1;
				if (i >= 3072 && i <= 3118 && (i_43_ ^ 0xffffffff) <= -9493
						&& (i_43_ ^ 0xffffffff) >= -9536)
					Class81.anInt1695 = 1;
				if (Class81.anInt1695 != 1 || i < 3139
						|| (i ^ 0xffffffff) < -3200 || i_43_ < 3008
						|| i_43_ > 3062)
					break;
				Class81.anInt1695 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						"dd.L(" + arg0 + ')');
			}
			break;
		} while (false);
	}

	public static int method685(int arg0, int arg1, int arg2) {
		try {
			if (arg1 > -83)
				method684((byte) -26);
			if (arg2 < arg0) {
				int i = arg2;
				arg2 = arg0;
				arg0 = i;
			}
			int i;
			for (/**/; (arg0 ^ 0xffffffff) != -1; arg0 = i) {
				i = arg2 % arg0;
				arg2 = arg0;
			}
			anInt382++;
			return arg2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("dd.P("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method688(int arg0, int arg1, int arg2) {
		try {
			anInt377++;
			if ((Class4_Sub20_Sub8.anInt2980 ^ 0xffffffff) <= -3
					|| (Class4_Sub20_Sub1.anInt2734 ^ 0xffffffff) != -1
					|| Class4_Sub23.aBoolean2421) {
				Class26 class26;
				if (Class4_Sub20_Sub1.anInt2734 == 1
						&& (Class4_Sub20_Sub8.anInt2980 ^ 0xffffffff) > -3)
					class26 = Class4_Sub24.method639((new Class26[] {
							Class57.aClass26_1154, Class46.aClass26_942,
							Class62.aClass26_1239, Class40.aClass26_791 }),
							-842);
				else if (!Class4_Sub23.aBoolean2421
						|| Class4_Sub20_Sub8.anInt2980 >= 2)
					class26 = Class4_Sub15.method298(-1
							+ (Class4_Sub20_Sub8.anInt2980), true);
				else
					class26 = Class4_Sub24.method639((new Class26[] {
							Class82.aClass26_1714, Class46.aClass26_942,
							Class5.aClass26_194, Class40.aClass26_791 }), -842);
				if (Class4_Sub20_Sub8.anInt2980 > 2)
					class26 = (Class4_Sub24
							.method639(
									(new Class26[] {
											class26,
											Class19.aClass26_517,
											Class74.method1168(
													-41,
													(Class4_Sub20_Sub8.anInt2980)
															+ -2),
											Class65.aClass26_1308 }), -842));
				Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.method575(class26,
						4 + arg2, arg0 + 15, 16777215, 0,
						Region.anInt134 / 1000);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("dd.O("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public Image anImage378;

	public int anInt371;

	public int anInt376;

	public int[] anIntArray384;

	public abstract void method680(int i, byte i_25_, Graphics graphics,
			int i_26_, int i_27_, int i_28_);

	public abstract void method686(Component component, int i, int i_44_,
			int i_45_);

	public abstract void method687(Graphics graphics, int i, int i_46_,
			boolean bool);

	public void method689(int arg0) {
		try {
			Class4_Sub20_Sub12.method493(anIntArray384, anInt376, anInt371);
			anInt372++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "dd.N("
					+ arg0 + ')');
		}
	}
}
