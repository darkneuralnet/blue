package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.filament.gltfio.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.EnumC40893fM6;
import p000.WL6;
/* renamed from: MN6 */
/* loaded from: classes8.dex */
public final class MN6 extends KN6 {

    /* renamed from: A */
    public JSONObject f23049A;

    /* renamed from: B */
    public JSONObject f23050B;

    /* renamed from: C */
    public JSONObject f23051C;

    /* renamed from: D */
    public JSONObject f23052D;

    /* renamed from: E */
    public JSONArray f23053E;

    /* renamed from: F */
    public JSONObject f23054F;

    /* renamed from: G */
    public JSONArray f23055G;

    /* renamed from: H */
    public C44460lN6 f23056H;

    /* renamed from: c */
    public String f23057c;

    /* renamed from: d */
    public String f23058d;

    /* renamed from: e */
    public String f23059e;

    /* renamed from: f */
    public String f23060f;

    /* renamed from: g */
    public String f23061g;

    /* renamed from: h */
    public String f23062h;

    /* renamed from: i */
    public String f23063i;

    /* renamed from: j */
    public String f23064j;

    /* renamed from: k */
    public String f23065k;

    /* renamed from: l */
    public String f23066l;

    /* renamed from: m */
    public String f23067m;

    /* renamed from: n */
    public String f23068n;

    /* renamed from: o */
    public String f23069o;

    /* renamed from: p */
    public String f23070p;

    /* renamed from: q */
    public int f23071q;

    /* renamed from: r */
    public boolean f23072r;

    /* renamed from: s */
    public boolean f23073s;

    /* renamed from: t */
    public String f23074t;

    /* renamed from: u */
    public boolean f23075u;

    /* renamed from: v */
    public String f23076v;

    /* renamed from: w */
    public long f23077w = -1;

    /* renamed from: x */
    public long f23078x = -1;

    /* renamed from: y */
    public long f23079y = -1;

    /* renamed from: z */
    public JSONObject f23080z;

    /* renamed from: MN6$a */
    /* loaded from: classes8.dex */
    public class C5284a implements FileFilter {
        public C5284a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    /* renamed from: MN6$b */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C5285b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23082a;

        static {
            int[] iArr = new int[EnumC40893fM6.EnumC20380b.values().length];
            f23082a = iArr;
            try {
                iArr[EnumC40893fM6.EnumC20380b.IS_TEST_KEYS_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23082a[EnumC40893fM6.EnumC20380b.IS_SU_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23082a[EnumC40893fM6.EnumC20380b.IS_SUPER_USER_APK_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23082a[EnumC40893fM6.EnumC20380b.DETECT_ROOT_MANAGEMENT_APPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23082a[EnumC40893fM6.EnumC20380b.CHECK_FOR_BINARY_SU.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23082a[EnumC40893fM6.EnumC20380b.CHECK_FOR_BINARY_BUSYBOX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23082a[EnumC40893fM6.EnumC20380b.CHECK_FOR_BINARY_MAGISK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: MN6$c */
    /* loaded from: classes8.dex */
    public static final class C5286c {

        /* renamed from: a */
        public static int f23083a = 5;

        /* renamed from: b */
        public static Boolean[] f23084b;

        private C5286c() {
        }

        /* renamed from: a */
        public static boolean m95348a() {
            String str = Build.MANUFACTURER;
            return str.equals(WL6.EnumC8993c.UNKNOWN.toString()) || str.equals(WL6.EnumC8993c.GENY_MOTION.toString()) || str.contains(WL6.EnumC8993c.ANDY_OS.toString());
        }

        /* renamed from: b */
        public static boolean m95347b(Context context) {
            String m95346c = m95346c(context);
            return m95346c != null && m95346c.contains("1");
        }

        /* renamed from: c */
        public static String m95346c(Context context) {
            if (f23084b == null) {
                f23084b = new Boolean[f23083a];
                int i = 0;
                while (i < f23083a) {
                    f23084b[i] = Boolean.valueOf(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? false : m95334o() : m95343f(context) : m95335n() : m95336m() : m95338k());
                    i++;
                }
            }
            return C52760zN6.m1471e(f23084b);
        }

        /* renamed from: d */
        public static boolean m95345d() {
            String str = Build.BRAND;
            return str.equals(WL6.EnumC8993c.GENERIC.toString()) || str.equals(WL6.EnumC8993c.GENERIC_X86.toString()) || str.equals("Android") || str.equals(WL6.EnumC8993c.ANDY_OS.toString());
        }

        /* renamed from: e */
        public static boolean m95344e() {
            String str = Build.DEVICE;
            return str.equals(WL6.EnumC8993c.ANDY_OSX.toString()) || str.equals(WL6.EnumC8993c.DROID_4X.toString()) || str.equals(WL6.EnumC8993c.GENERIC.toString()) || str.equals(WL6.EnumC8993c.GENERIC_X86.toString()) || str.equals(WL6.EnumC8993c.VBOX_86P.toString());
        }

        /* renamed from: f */
        public static boolean m95343f(Context context) {
            return XM6.m77080a(context, new ArrayList(Arrays.asList(YL6.f45779a)));
        }

        /* renamed from: g */
        public static boolean m95342g() {
            String str = Build.HARDWARE;
            return str.equals(WL6.EnumC8993c.GOLDFISH.toString()) || str.equals(WL6.EnumC8993c.VBOX_86.toString()) || str.equals(WL6.EnumC8993c.ANDY.toString()) || str.equals(WL6.EnumC8993c.RANCHU.toString()) || str.equals(WL6.EnumC8993c.TTVM_X86.toString()) || str.equals(WL6.EnumC8993c.ANDROID_X86.toString());
        }

        /* renamed from: h */
        public static boolean m95341h() {
            String str = Build.MODEL;
            return str.equals(WL6.EnumC8993c.SDK.toString()) || str.equals(WL6.EnumC8993c.GOODLE_SDK.toString()) || str.equals(WL6.EnumC8993c.ANDROID_SDK_BUILD_FOR_X86.toString());
        }

        /* renamed from: i */
        public static boolean m95340i() {
            return Build.FINGERPRINT.startsWith(WL6.EnumC8993c.GENERIC.toString());
        }

        /* renamed from: j */
        public static boolean m95339j() {
            String str = Build.PRODUCT;
            return str.matches(".*_?sdk_?.*") || str.equals(WL6.EnumC8993c.VBOX_86P.toString()) || str.equals(WL6.EnumC8993c.GENY_MOTION.toString()) || str.equals(WL6.EnumC8993c.DRIOD_4X.toString()) || str.equals(WL6.EnumC8993c.ANDY_OSX.toString()) || str.equals(WL6.EnumC8993c.REMIXEMU.toString());
        }

        /* renamed from: k */
        public static boolean m95338k() {
            return m95348a() || m95345d() || m95344e() || m95342g() || m95341h() || m95340i() || m95339j();
        }

        /* renamed from: l */
        public static boolean m95337l() {
            return new File(Environment.getExternalStorageDirectory().toString() + File.separatorChar + "windows" + File.separatorChar + "BstSharedFolder").exists();
        }

        /* renamed from: m */
        public static boolean m95336m() {
            return m95337l() || C44451lM6.m27388c(YL6.f45784f, "");
        }

        /* renamed from: n */
        public static boolean m95335n() {
            return C44451lM6.m27388c(YL6.f45780b, "");
        }

        /* renamed from: o */
        public static boolean m95334o() {
            return m95333p() || m95332q() || m95331r();
        }

        /* renamed from: p */
        public static boolean m95333p() {
            return C44451lM6.m27388c(YL6.f45782d, "");
        }

        /* renamed from: q */
        public static boolean m95332q() {
            return C44451lM6.m27388c(YL6.f45783e, "");
        }

        /* renamed from: r */
        public static boolean m95331r() {
            return C44451lM6.m27388c(YL6.f45781c, "");
        }
    }

    /* renamed from: MN6$d */
    /* loaded from: classes8.dex */
    public static final class C5287d {

        /* renamed from: a */
        public static int f23085a = EnumC40893fM6.EnumC20380b.NUMBER_OF_ROOTED_FLAGS.m41499a();

        /* renamed from: b */
        public static Boolean[] f23086b = null;

        private C5287d() {
        }

        /* renamed from: a */
        public static boolean m95330a() {
            try {
                return new File(m95326e("suFileName")).exists();
            } catch (Exception e) {
                KJ6.m99011b(C5287d.class, 3, e);
                return false;
            }
        }

        /* renamed from: b */
        public static boolean m95329b(Context context) {
            String m95327d = m95327d(context);
            if (m95327d != null) {
                return m95327d.contains("1");
            }
            return false;
        }

        /* renamed from: c */
        public static boolean m95328c(String str) {
            return C44451lM6.m27388c(EnumC40893fM6.SU_PATHS.m41500a(), str);
        }

        /* renamed from: d */
        public static String m95327d(Context context) {
            boolean m95325f;
            EnumC40893fM6.EnumC20379a enumC20379a;
            if (f23086b == null) {
                f23086b = new Boolean[f23085a];
                for (int i = 0; i < f23085a; i++) {
                    EnumC40893fM6.EnumC20380b m41498b = EnumC40893fM6.EnumC20380b.m41498b(i);
                    if (m41498b == null) {
                        return null;
                    }
                    switch (C5285b.f23082a[m41498b.ordinal()]) {
                        case 1:
                            m95325f = m95325f();
                            continue;
                            f23086b[i] = Boolean.valueOf(m95325f);
                        case 2:
                            m95325f = m95330a();
                            continue;
                            f23086b[i] = Boolean.valueOf(m95325f);
                        case 3:
                            m95325f = m95324g();
                            continue;
                            f23086b[i] = Boolean.valueOf(m95325f);
                        case 4:
                            m95325f = m95323h(context);
                            continue;
                            f23086b[i] = Boolean.valueOf(m95325f);
                        case 5:
                            enumC20379a = EnumC40893fM6.EnumC20379a.SU;
                            break;
                        case 6:
                            enumC20379a = EnumC40893fM6.EnumC20379a.BUSYBOX;
                            break;
                        case 7:
                            enumC20379a = EnumC40893fM6.EnumC20379a.MAGISK;
                            break;
                        default:
                            m95325f = false;
                            continue;
                            f23086b[i] = Boolean.valueOf(m95325f);
                    }
                    m95325f = m95328c(enumC20379a.toString());
                    f23086b[i] = Boolean.valueOf(m95325f);
                }
            }
            return C52760zN6.m1471e(f23086b);
        }

        /* renamed from: e */
        public static String m95326e(String str) throws IOException {
            Properties properties = new Properties();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("suFileName=/system/xbin/su\nsuperUserApk=/system/app/Superuser.apk\nemptyIp=0.0.0.0".getBytes(Constants.DEFAULT_ENCODING));
            try {
                try {
                    properties.load(byteArrayInputStream);
                } catch (Exception e) {
                    KJ6.m99011b(C5287d.class, 3, e);
                }
                return properties.getProperty(str);
            } finally {
                byteArrayInputStream.close();
            }
        }

        /* renamed from: f */
        public static boolean m95325f() {
            String str = Build.TAGS;
            return str != null && str.contains("test-keys");
        }

        /* renamed from: g */
        public static boolean m95324g() {
            try {
                return new File(m95326e("superUserApk")).exists();
            } catch (Exception e) {
                KJ6.m99011b(C5287d.class, 3, e);
                return false;
            }
        }

        /* renamed from: h */
        public static boolean m95323h(Context context) {
            return XM6.m77080a(context, new ArrayList(Arrays.asList(EnumC40893fM6.KNOWN_ROOT_APPS_PACKAGES.m41500a())));
        }
    }

    /* renamed from: A */
    public final JSONObject m95367A() {
        JSONObject jSONObject = new JSONObject();
        long m95354u = m95354u(Environment.getDataDirectory().getPath());
        try {
            jSONObject.put(WL6.EnumC8992b.TOTAL_SD.toString(), m98940b(Long.valueOf(m98941a(601))));
            jSONObject.put(WL6.EnumC8992b.TOTAL_UD.toString(), m98940b(Long.valueOf(m95354u)));
        } catch (JSONException e) {
            KJ6.m99011b(MN6.class, 3, e);
        }
        return jSONObject;
    }

    @SuppressLint({"MissingPermission,HardwareIds"})
    /* renamed from: B */
    public final String m95366B(Context context) {
        WifiInfo connectionInfo = m98934i(context, "android.permission.ACCESS_WIFI_STATE") ? ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo() : null;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.getMacAddress();
    }

    /* renamed from: C */
    public final JSONObject m95365C() {
        JSONObject jSONObject = new JSONObject();
        try {
            int m95355t = m95355t(3);
            int m95355t2 = m95355t(2);
            int m95355t3 = m95355t(1);
            jSONObject.put(WL6.EnumC8991a.MIN_FREQUENCY.toString(), m98940b(Integer.valueOf(m95355t2)));
            jSONObject.put(WL6.EnumC8991a.MAX_FREQUENCY.toString(), m98940b(Integer.valueOf(m95355t3)));
            jSONObject.put(WL6.EnumC8991a.CORES.toString(), m98940b(Integer.valueOf(m95355t)));
        } catch (JSONException e) {
            KJ6.m99011b(MN6.class, 3, e);
        }
        return jSONObject;
    }

    /* renamed from: D */
    public final String m95364D(Context context) throws PackageManager.NameNotFoundException {
        return C52760zN6.m1474b(context);
    }

    /* renamed from: E */
    public final JSONObject m95363E() {
        JSONObject jSONObject = new JSONObject();
        try {
            String property = System.getProperty("os.name");
            String property2 = System.getProperty("os.version");
            Object[] objArr = new Object[2];
            if (TextUtils.isEmpty(property)) {
                property = "";
            }
            objArr[0] = property;
            if (TextUtils.isEmpty(property2)) {
                property2 = "";
            }
            objArr[1] = property2;
            String format = String.format("%s %s", objArr);
            if (!TextUtils.isEmpty(format)) {
                jSONObject.put(WL6.EnumC8996f.VERSION.toString(), m98940b(format.trim()));
            }
            jSONObject.put(WL6.EnumC8996f.BOARD.toString(), m98940b(Build.BOARD));
            jSONObject.put(WL6.EnumC8996f.BOOTLOADER.toString(), m98940b(Build.BOOTLOADER));
            jSONObject.put(WL6.EnumC8996f.CPU_ABI1.toString(), m98940b(Build.SUPPORTED_ABIS[0]));
            jSONObject.put(WL6.EnumC8996f.DISPLAY.toString(), m98940b(Build.DISPLAY));
            jSONObject.put(WL6.EnumC8996f.RADIO.toString(), m98940b(Build.getRadioVersion()));
            jSONObject.put(WL6.EnumC8996f.FINGERPRINT.toString(), m98940b(Build.FINGERPRINT));
            jSONObject.put(WL6.EnumC8996f.HARDWARE.toString(), m98940b(Build.HARDWARE));
            jSONObject.put(WL6.EnumC8996f.MANUFACTURER.toString(), m98940b(Build.MANUFACTURER));
            jSONObject.put(WL6.EnumC8996f.PRODUCT.toString(), m98940b(Build.PRODUCT));
            jSONObject.put(WL6.EnumC8996f.TIME.toString(), m98940b(Long.valueOf(Build.TIME)));
            jSONObject.put(WL6.EnumC8996f.SYSTEM_TYPE.toString(), m98940b(System.getProperty("os.arch")));
        } catch (JSONException e) {
            KJ6.m99011b(MN6.class, 3, e);
        }
        return jSONObject;
    }

    /* renamed from: F */
    public final long m95362F(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: G */
    public final long m95361G(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
    }

    /* renamed from: H */
    public final JSONObject m95360H(Context context) {
        int i;
        float f;
        int i2;
        int i3;
        float f2;
        float f3;
        float f4;
        JSONObject jSONObject = new JSONObject();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            i = point.x;
            i2 = point.y;
            f = displayMetrics.density;
            i3 = displayMetrics.densityDpi;
            f3 = displayMetrics.scaledDensity;
            f4 = displayMetrics.xdpi;
            f2 = displayMetrics.ydpi;
        } else {
            i = 12345;
            f = 12345.0f;
            i2 = 12345;
            i3 = 12345;
            f2 = 12345.0f;
            f3 = 12345.0f;
            f4 = 12345.0f;
        }
        try {
            jSONObject.put(WL6.EnumC8994d.WIDTH.toString(), m98940b(Integer.valueOf(i)));
            jSONObject.put(WL6.EnumC8994d.HEIGHT.toString(), m98940b(Integer.valueOf(i2)));
            jSONObject.put(WL6.EnumC8994d.DENSITY.toString(), m98940b(Float.valueOf(f)));
            jSONObject.put(WL6.EnumC8994d.DENSITY_DPI.toString(), m98940b(Integer.valueOf(i3)));
            jSONObject.put(WL6.EnumC8994d.SCALE.toString(), m98940b(Float.valueOf(f3)));
            jSONObject.put(WL6.EnumC8994d.X_DPI.toString(), m98940b(Float.valueOf(f4)));
            jSONObject.put(WL6.EnumC8994d.Y_DPI.toString(), m98940b(Float.valueOf(f2)));
        } catch (Exception e) {
            KJ6.m99011b(MN6.class, 3, e);
        }
        return jSONObject;
    }

    /* renamed from: I */
    public final JSONObject m95359I(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dua", m98940b(WebSettings.getDefaultUserAgent(context)));
        } catch (Exception e) {
            KJ6.m99011b(MN6.class, 3, e);
        }
        return jSONObject;
    }

    @Override // p000.KN6
    /* renamed from: d */
    public JSONObject mo8750d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(WL6.APP_GUID.toString(), this.f23057c);
            jSONObject.put(WL6.APP_ID.toString(), this.f23058d);
            jSONObject.put(WL6.ANDROID_ID.toString(), this.f23063i);
            jSONObject.put(WL6.APP_VERSION.toString(), this.f23059e);
            String wl6 = WL6.APP_FIRST_INSTALL_TIME.toString();
            long j = this.f23078x;
            Long l = null;
            jSONObject.put(wl6, j == -1 ? null : Long.valueOf(j));
            String wl62 = WL6.APP_LAST_UPDATE_TIME.toString();
            long j2 = this.f23079y;
            jSONObject.put(wl62, j2 == -1 ? null : Long.valueOf(j2));
            jSONObject.put(WL6.CONF_URL.toString(), this.f23069o);
            jSONObject.put(WL6.COMP_VERSION.toString(), this.f23070p);
            jSONObject.put(WL6.DEVICE_MODEL.toString(), this.f23060f);
            jSONObject.put(WL6.DEVICE_NAME.toString(), this.f23061g);
            jSONObject.put(WL6.GSF_ID.toString(), this.f23064j);
            jSONObject.put(WL6.IS_EMULATOR.toString(), this.f23073s);
            jSONObject.put(WL6.EMULATOR_FLAGS.toString(), this.f23074t);
            jSONObject.put(WL6.IS_ROOTED.toString(), this.f23075u);
            jSONObject.put(WL6.ROOTED_FLAGS.toString(), this.f23076v);
            jSONObject.put(WL6.OS_TYPE.toString(), "Android");
            jSONObject.put(WL6.OS_VERSION.toString(), this.f23062h);
            jSONObject.put(WL6.PAYLOAD_TYPE.toString(), this.f23066l);
            jSONObject.put(WL6.SMS_ENABLED.toString(), this.f23072r);
            jSONObject.put(WL6.MAC_ADDRS.toString(), this.f23065k);
            jSONObject.put(WL6.MAGNES_GUID.toString(), this.f23080z);
            String wl63 = WL6.MAGNES_SOURCE.toString();
            int i = this.f23071q;
            jSONObject.put(wl63, i == 0 ? null : Integer.valueOf(i));
            jSONObject.put(WL6.NOTIF_TOKEN.toString(), this.f23068n);
            jSONObject.put(WL6.SOURCE_APP_VERSION.toString(), this.f23067m);
            String wl64 = WL6.TOTAL_STORAGE_SPACE.toString();
            long j3 = this.f23077w;
            if (j3 != -1) {
                l = Long.valueOf(j3);
            }
            jSONObject.put(wl64, l);
            jSONObject.put(WL6.NOT_COLLECTIBLE_LIST.toString(), this.f23053E);
            jSONObject.put(WL6.SENSOR_METADATA.toString(), this.f23055G);
            jSONObject.put(WL6.SCREEN.toString(), this.f23049A);
            jSONObject.put(WL6.CPU.toString(), this.f23050B);
            jSONObject.put(WL6.DISK.toString(), this.f23051C);
            jSONObject.put(WL6.SYSTEM.toString(), this.f23052D);
            jSONObject.put(WL6.USER_AGENT.toString(), this.f23054F);
            jSONObject.put(WL6.IN_TREATMENT.toString(), KN6.f19526a);
            return jSONObject;
        } catch (JSONException e) {
            KJ6.m99011b(MN6.class, 3, e);
            return jSONObject;
        }
    }

    /* renamed from: q */
    public final JSONArray m95358q(VF2 vf2) {
        try {
            JSONArray jSONArray = new JSONArray();
            SensorManager sensorManager = (SensorManager) vf2.m80162b().getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(4);
            Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
            if (defaultSensor != null) {
                JSONObject m1468h = C52760zN6.m1468h(defaultSensor);
                m1468h.put(TL6.SENSOR_TYPE.toString(), EnumC41486gM6.AC.toString());
                jSONArray.put(m1468h);
            }
            if (defaultSensor2 != null) {
                JSONObject m1468h2 = C52760zN6.m1468h(defaultSensor2);
                m1468h2.put(TL6.SENSOR_TYPE.toString(), EnumC41486gM6.GY.toString());
                jSONArray.put(m1468h2);
            }
            if (defaultSensor3 != null) {
                JSONObject m1468h3 = C52760zN6.m1468h(defaultSensor3);
                m1468h3.put(TL6.SENSOR_TYPE.toString(), EnumC41486gM6.MG.toString());
                jSONArray.put(m1468h3);
            }
            return jSONArray;
        } catch (Exception e) {
            KJ6.m99011b(MN6.class, 3, e);
            return null;
        }
    }

    /* renamed from: r */
    public JSONObject m95357r(VF2 vf2, WM6 wm6, C44460lN6 c44460lN6) {
        this.f23056H = c44460lN6;
        KJ6.m99012a(MN6.class, 0, "collecting RiskBlobCoreData");
        m95356s(1, vf2);
        m95356s(2, vf2);
        m95356s(3, vf2);
        m95356s(65, vf2);
        m95356s(66, vf2);
        m95356s(69, vf2);
        m95356s(8, vf2);
        m95356s(9, vf2);
        m95356s(14, vf2);
        m95356s(15, vf2);
        m95356s(70, vf2);
        m95356s(59, vf2);
        m95356s(103, vf2);
        m95356s(60, vf2);
        m95356s(100, vf2);
        m95356s(32, vf2);
        m95356s(86, vf2);
        m95356s(62, vf2);
        m95356s(34, vf2);
        m95356s(37, vf2);
        m95356s(38, vf2);
        m95356s(63, vf2);
        m95356s(47, vf2);
        m95356s(52, vf2);
        m95356s(88, vf2);
        KN6.f19526a = false;
        if (m98933j(wm6, vf2.m80159e(), KN6.f19527b, "hw", vf2.m80162b())) {
            m95356s(91, vf2);
            m95356s(90, vf2);
            m95356s(93, vf2);
            m95356s(94, vf2);
            m95356s(95, vf2);
            m95356s(101, vf2);
        }
        return mo8750d();
    }

    /* renamed from: s */
    public void m95356s(int i, VF2 vf2) {
        try {
            Context m80162b = vf2.m80162b();
            switch (i) {
                case 1:
                    this.f23057c = m95352w(m80162b, vf2.m80163a());
                    break;
                case 2:
                    this.f23058d = m98939c(m80162b);
                    break;
                case 3:
                    if (this.f23056H.m27378j(i)) {
                        this.f23059e = m95364D(m80162b);
                        break;
                    }
                    break;
                case 8:
                    this.f23070p = "5.1.1.release";
                    break;
                case 9:
                    if (this.f23056H.m27378j(i)) {
                        this.f23069o = EnumC39097cM6.REMOTE_CONFIG_URL.toString();
                        break;
                    }
                    break;
                case 14:
                    if (this.f23056H.m27378j(i)) {
                        this.f23060f = Build.MODEL;
                        break;
                    }
                    break;
                case 15:
                    if (this.f23056H.m27378j(i)) {
                        this.f23061g = Build.DEVICE;
                        break;
                    }
                    break;
                case 32:
                    if (this.f23056H.m27378j(i)) {
                        this.f23065k = m95366B(m80162b);
                        break;
                    }
                    break;
                case 34:
                    if (this.f23056H.m27378j(i)) {
                        this.f23068n = vf2.m80158f();
                        break;
                    }
                    break;
                case 37:
                    if (this.f23056H.m27378j(i)) {
                        this.f23062h = Build.VERSION.RELEASE;
                        break;
                    }
                    break;
                case 38:
                    if (this.f23056H.m27378j(i)) {
                        this.f23066l = BuildConfig.FLAVOR;
                        break;
                    }
                    break;
                case 47:
                    if (this.f23056H.m27378j(i)) {
                        this.f23072r = m80162b.getPackageManager().hasSystemFeature("android.hardware.telephony");
                        break;
                    }
                    break;
                case 52:
                    if (this.f23056H.m27378j(i)) {
                        this.f23077w = m95351x();
                        break;
                    }
                    break;
                case 59:
                    if (this.f23056H.m27378j(i)) {
                        this.f23073s = C5286c.m95347b(m80162b);
                        break;
                    }
                    break;
                case 60:
                    if (this.f23056H.m27378j(i)) {
                        this.f23075u = C5287d.m95329b(m80162b);
                        break;
                    }
                    break;
                case 62:
                    if (this.f23056H.m27378j(i)) {
                        this.f23071q = vf2.m80159e();
                        break;
                    }
                    break;
                case 63:
                    if (this.f23056H.m27378j(i)) {
                        this.f23067m = m95364D(m80162b);
                        break;
                    }
                    break;
                case 65:
                    if (this.f23056H.m27378j(i)) {
                        this.f23078x = m95361G(m80162b);
                        break;
                    }
                    break;
                case 66:
                    if (this.f23056H.m27378j(i)) {
                        this.f23079y = m95362F(m80162b);
                        break;
                    }
                    break;
                case 69:
                    if (this.f23056H.m27378j(i)) {
                        this.f23063i = m95350y(m80162b);
                        break;
                    }
                    break;
                case 70:
                    if (this.f23056H.m27378j(i)) {
                        this.f23064j = m95349z(m80162b);
                        break;
                    }
                    break;
                case 86:
                    JSONObject m98928o = m98928o(m80162b);
                    this.f23080z = m98928o;
                    KN6.f19527b = m98928o.optString("id");
                    break;
                case 88:
                    if (this.f23056H.m27369s()) {
                        this.f23053E = this.f23056H.m27368t();
                        break;
                    }
                    break;
                case 90:
                    if (this.f23056H.m27378j(i)) {
                        this.f23050B = m95365C();
                        break;
                    }
                    break;
                case 91:
                    if (this.f23056H.m27378j(i)) {
                        this.f23049A = m95360H(m80162b);
                        break;
                    }
                    break;
                case 93:
                    if (this.f23056H.m27378j(i)) {
                        this.f23051C = m95367A();
                        break;
                    }
                    break;
                case 94:
                    if (this.f23056H.m27378j(i)) {
                        this.f23052D = m95363E();
                        break;
                    }
                    break;
                case 95:
                    if (this.f23056H.m27378j(i)) {
                        this.f23054F = m95359I(m80162b);
                        break;
                    }
                    break;
                case 100:
                    if (this.f23056H.m27378j(i)) {
                        this.f23076v = C5287d.m95327d(m80162b);
                        break;
                    }
                    break;
                case 101:
                    if (this.f23056H.m27378j(i)) {
                        this.f23055G = m95358q(vf2);
                        break;
                    }
                    break;
                case 103:
                    if (this.f23056H.m27378j(i)) {
                        this.f23074t = C5286c.m95346c(m80162b);
                        break;
                    }
                    break;
            }
        } catch (Exception e) {
            KJ6.m99011b(MN6.class, 3, e);
        }
    }

    /* renamed from: t */
    public final int m95355t(int i) {
        int i2;
        File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new C5284a());
        if (i == 3) {
            i2 = listFiles.length;
        } else {
            int i3 = 0;
            if (i == 2) {
                int length = listFiles.length;
                int i4 = Integer.MAX_VALUE;
                while (i3 < length) {
                    File file = listFiles[i3];
                    String m27387d = C44451lM6.m27387d(new File(file.getPath() + "/cpufreq/cpuinfo_min_freq"));
                    if (m27387d != null && !m27387d.equals("-403")) {
                        int parseInt = Integer.parseInt(m27387d);
                        if (parseInt < i4) {
                            i4 = parseInt;
                        }
                        i3++;
                    }
                    i2 = -403;
                    break;
                }
                i2 = i4;
            } else if (i == 1) {
                for (File file2 : listFiles) {
                    File file3 = new File(file2.getPath() + "/cpufreq/cpuinfo_max_freq");
                    String m27387d2 = C44451lM6.m27387d(file3);
                    if (m27387d2 != null && !m27387d2.equals("-403")) {
                        int parseInt2 = Integer.parseInt(C44451lM6.m27387d(file3));
                        if (parseInt2 > i3) {
                            i3 = parseInt2;
                        }
                    }
                    i2 = -403;
                    break;
                }
                i2 = i3;
            } else {
                i2 = 12345;
            }
        }
        if (i2 == 0 || i2 == Integer.MAX_VALUE) {
            return 12345;
        }
        return i2;
    }

    /* renamed from: u */
    public final long m95354u(String str) {
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSize() * statFs.getBlockCount();
    }

    /* renamed from: v */
    public String m95353v() {
        return this.f23057c;
    }

    /* renamed from: w */
    public final String m95352w(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerAG", 0);
        String string = sharedPreferences.getString("RiskManagerAG", "");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (str == null || str.equals(string)) {
            if (!string.equals("")) {
                return string;
            }
            str = C52760zN6.m1472d(true);
        }
        edit.putString("RiskManagerAG", str);
        edit.apply();
        return str;
    }

    /* renamed from: x */
    public final long m95351x() throws IllegalArgumentException {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return statFs.getBlockSize() * statFs.getBlockCount();
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: y */
    public final String m95350y(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: z */
    public final String m95349z(Context context) {
        Uri uri;
        try {
            uri = Uri.parse("content://com.google.android.gsf.gservices");
        } catch (Exception unused) {
            uri = null;
        }
        if (uri == null || !m98934i(context, "com.google.android.providers.gsf.permission.READ_GSERVICES")) {
            return null;
        }
        Cursor query = context.getContentResolver().query(uri, null, null, new String[]{"android_id"}, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.moveToFirst() && query.getColumnCount() >= 2) {
                return Long.toHexString(Long.parseLong(query.getString(1)));
            }
            return null;
        } catch (NumberFormatException e) {
            KJ6.m99011b(MN6.class, 3, e);
            return null;
        } finally {
            query.close();
        }
    }
}
