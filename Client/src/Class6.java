/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Class6 {
	public static Class26 aClass26_199;
	public static Class26 aClass26_201;
	public static Class26 aClass26_203;
	public static Class26 aClass26_206;
	public static Class26 aClass26_207;
	public static Class26 aClass26_210;
	public static Class26 aClass26_211;
	public static Class26 aClass26_214;
	public static Class26 aClass26_215;
	public static int anInt200;
	public static int anInt202 = 0;
	public static int anInt204;
	public static int anInt208;
	public static int anInt209;
	public static int anInt212;
	public static int anInt213;
	public static int anInt216;
	public static int anInt217;
	public static int anInt218;
	public static int[] anIntArray205;

	static {
		aClass26_201 = RS2Font.getRs2PreparedString("Loading config )2 ", false);
		aClass26_211 = RS2Font.getRs2PreparedString("glow2:", false);
		aClass26_206 = aClass26_211;
		aClass26_215 = aClass26_201;
		anIntArray205 = new int[] { 0, -1, 0, 1 };
		aClass26_214 = RS2Font.getRs2PreparedString("Loaded interfaces", false);
		aClass26_199 = aClass26_214;
		aClass26_207 = aClass26_211;
		aClass26_203 = RS2Font.getRs2PreparedString(
				"Please enter your username)3", false);
		aClass26_210 = aClass26_203;
	}

	public static void method646(int arg0) {
		Class4_Sub7 class4_sub7 = ((Class4_Sub7) Class4_Sub20_Sub7_Sub1_Sub2.aClass65_3618
				.method1071(-122));
		anInt204++;
		for (/**/; class4_sub7 != null; class4_sub7 = (Class4_Sub7) Class4_Sub20_Sub7_Sub1_Sub2.aClass65_3618
				.method1075(arg0 + 40176)) {
			if ((class4_sub7.anInt1954 ^ 0xffffffff) == 0) {
				class4_sub7.anInt1952 = 0;
				Class4_Sub20_Sub7.method375(class4_sub7, 18278);
			} else
				class4_sub7.method70(-315);
		}
		if (arg0 != -21691)
			method648(-32);
	}

	public static boolean method647(int arg0, int arg1) {
		try {
			anInt208++;
			if (arg0 > -120)
				return false;
			if ((arg1 & 0x1) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bc.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method648(int arg0) {
		try {
			for (int i = arg0; Class4_Sub20_Sub7_Sub6.anInt3431 > i; i++) {
				int i_0_;
				if ((i ^ 0xffffffff) != 0)
					i_0_ = Class4_Sub23.anIntArray2432[i];
				else
					i_0_ = 2047;
				Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i_0_]);
				if (class4_sub20_sub7_sub1_sub1 != null)
					Client.method31(1, arg0 + 5, class4_sub20_sub7_sub1_sub1);
			}
			anInt213++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bc.A("
					+ arg0 + ')');
		}
	}

	public static int method649(int arg0, byte[] arg1, int arg2) {
		try {
			anInt212++;
			if (arg0 != -968)
				return -105;
			return Class53.method1009((byte) -120, arg1, 0, arg2);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bc.E("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ')'));
		}
	}

	public static void method650(Class26 arg0, Color arg1, boolean arg2,
			int arg3) {
		try {
			anInt218++;
			try {
				Graphics graphics = Class4_Sub20_Sub7_Sub5.runeCanvas
						.getGraphics();
				if (Class4_Sub20_Sub11.aFont3087 == null) {
					Class4_Sub20_Sub11.aFont3087 = new Font("Helvetica", 1, 13);
					Class7.aFontMetrics230 = Class4_Sub20_Sub7_Sub5.runeCanvas
							.getFontMetrics(Class4_Sub20_Sub11.aFont3087);
				}
				if (Class4_Sub20_Sub4.aBoolean2849) {
					Class4_Sub20_Sub4.aBoolean2849 = false;
					graphics.setColor(Color.black);
					graphics.fillRect(0, 0, Class58.anInt1160,
							Class57.anInt1138);
				}
				if (arg1 == null)
					arg1 = new Color(140, 17, 17);
				try {
					if (Class66.anImage1326 == null)
						Class66.anImage1326 = Class4_Sub20_Sub7_Sub5.runeCanvas
								.createImage(304, 34);
					Graphics graphics_1_ = Class66.anImage1326.getGraphics();
					graphics_1_.setColor(arg1);
					graphics_1_.drawRect(0, 0, 303, 33);
					graphics_1_.fillRect(2, 2, 3 * arg3, 30);
					if (arg2 == false) {
						graphics_1_.setColor(Color.black);
						graphics_1_.drawRect(1, 1, 301, 31);
						graphics_1_.fillRect(arg3 * 3 + 2, 2,
								-(arg3 * 3) + 300, 30);
						graphics_1_.setFont(Class4_Sub20_Sub11.aFont3087);
						graphics_1_.setColor(Color.white);
						arg0.method817(
								(-arg0.method822(59, Class7.aFontMetrics230) + 304) / 2,
								(byte) -100, 22, graphics_1_);
						graphics.drawImage(Class66.anImage1326,
								Class58.anInt1160 / 2 + -152, Class57.anInt1138
										/ 2 + -18, null);
					}
				} catch (Exception exception) {
					int i = -152 + Class58.anInt1160 / 2;
					int i_2_ = Class57.anInt1138 / 2 - 18;
					graphics.setColor(arg1);
					graphics.drawRect(i, i_2_, 303, 33);
					graphics.fillRect(i + 2, i_2_ - -2, 3 * arg3, 30);
					graphics.setColor(Color.black);
					graphics.drawRect(1 + i, i_2_ - -1, 301, 31);
					graphics.fillRect(arg3 * 3 + (2 + i), i_2_ + 2,
							-(3 * arg3) + 300, 30);
					graphics.setFont(Class4_Sub20_Sub11.aFont3087);
					graphics.setColor(Color.white);
					arg0.method817(
							(-arg0.method822(59, Class7.aFontMetrics230) + 304)
									/ 2 + i, (byte) -121, 22 + i_2_, graphics);
				}
			} catch (Exception exception) {
				Class4_Sub20_Sub7_Sub5.runeCanvas.repaint();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bc.G("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ')'));
		}
	}

	public static void method651(Class19 arg0, boolean arg1) {
		Class1.aClass19_67 = arg0;
		anInt216++;
		if (arg1 != false)
			method647(32, -56);
	}

	public static void method652(int arg0) {
		aClass26_203 = null;
		aClass26_211 = null;
		aClass26_207 = null;
		aClass26_201 = null;
		aClass26_206 = null;
		aClass26_199 = null;
		aClass26_210 = null;
		anIntArray205 = null;
		aClass26_215 = null;
		aClass26_214 = null;
		if (arg0 != 3)
			aClass26_210 = null;
	}
}
