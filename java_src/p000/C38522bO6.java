package p000;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.amazonaws.services.p026s3.internal.Constants;
import com.stripe.android.model.PaymentMethod;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.XL6;
/* renamed from: bO6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C38522bO6 extends KN6 {

    /* renamed from: A */
    public String f57382A;

    /* renamed from: B */
    public String f57383B;

    /* renamed from: C */
    public String f57384C;

    /* renamed from: D */
    public String f57385D;

    /* renamed from: E */
    public String f57386E;

    /* renamed from: F */
    public String f57387F;

    /* renamed from: G */
    public String f57388G;

    /* renamed from: H */
    public List<String> f57389H;

    /* renamed from: I */
    public List<String> f57390I;

    /* renamed from: J */
    public List<String> f57391J;

    /* renamed from: M */
    public boolean f57394M;

    /* renamed from: N */
    public boolean f57395N;

    /* renamed from: O */
    public boolean f57396O;

    /* renamed from: P */
    public boolean f57397P;

    /* renamed from: Q */
    public boolean f57398Q;

    /* renamed from: R */
    public boolean f57399R;

    /* renamed from: S */
    public boolean f57400S;

    /* renamed from: T */
    public boolean f57401T;

    /* renamed from: U */
    public boolean f57402U;

    /* renamed from: V */
    public boolean f57403V;

    /* renamed from: W */
    public Map<String, String> f57404W;

    /* renamed from: X */
    public NetworkInfo f57405X;

    /* renamed from: Y */
    public WifiInfo f57406Y;

    /* renamed from: Z */
    public GsmCellLocation f57407Z;

    /* renamed from: a0 */
    public CdmaCellLocation f57408a0;

    /* renamed from: b0 */
    public TelephonyManager f57409b0;

    /* renamed from: c0 */
    public WifiManager f57411c0;

    /* renamed from: d0 */
    public ConnectivityManager f57413d0;

    /* renamed from: e0 */
    public BatteryManager f57415e0;

    /* renamed from: f0 */
    public LocationManager f57417f0;

    /* renamed from: g0 */
    public PowerManager f57419g0;

    /* renamed from: h0 */
    public PackageManager f57421h0;

    /* renamed from: i */
    public String f57422i;

    /* renamed from: i0 */
    public Location f57423i0;

    /* renamed from: j */
    public String f57424j;

    /* renamed from: j0 */
    public JSONObject f57425j0;

    /* renamed from: k */
    public String f57426k;

    /* renamed from: k0 */
    public JSONObject f57427k0;

    /* renamed from: l */
    public String f57428l;

    /* renamed from: l0 */
    public JSONObject f57429l0;

    /* renamed from: m */
    public String f57430m;

    /* renamed from: m0 */
    public JSONObject f57431m0;

    /* renamed from: n */
    public String f57432n;

    /* renamed from: n0 */
    public JSONObject f57433n0;

    /* renamed from: o */
    public String f57434o;

    /* renamed from: o0 */
    public Handler f57435o0;

    /* renamed from: p */
    public String f57436p;

    /* renamed from: p0 */
    public boolean f57437p0;

    /* renamed from: q */
    public String f57438q;

    /* renamed from: q0 */
    public C44460lN6 f57439q0;

    /* renamed from: r */
    public String f57440r;

    /* renamed from: s */
    public String f57442s;

    /* renamed from: t */
    public String f57443t;

    /* renamed from: u */
    public String f57444u;

    /* renamed from: v */
    public String f57445v;

    /* renamed from: w */
    public String f57446w;

    /* renamed from: x */
    public String f57447x;

    /* renamed from: y */
    public String f57448y;

    /* renamed from: z */
    public String f57449z;

    /* renamed from: c */
    public int f57410c = -1;

    /* renamed from: d */
    public int f57412d = -1;

    /* renamed from: e */
    public int f57414e = -1;

    /* renamed from: f */
    public int f57416f = -1;

    /* renamed from: g */
    public int f57418g = -1;

    /* renamed from: h */
    public int f57420h = -1;

    /* renamed from: K */
    public long f57392K = -1;

    /* renamed from: L */
    public long f57393L = -1;

    /* renamed from: r0 */
    public C39726dO6 f57441r0 = C39726dO6.m44315u();

    public C38522bO6(boolean z) {
        this.f57437p0 = z;
    }

    /* renamed from: A */
    public final String m64594A(String str) throws Exception {
        str = (str == null || str.isEmpty()) ? "invalid input in dc method" : "invalid input in dc method";
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toString((b & UByte.MAX_VALUE) + 256, 16).substring(1));
        }
        return sb.toString().substring(0, 32);
    }

    /* renamed from: B */
    public final List<String> m64593B() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : this.f57439q0.m27373o()) {
                if (XM6.m77079b(this.f57421h0, new Intent().setComponent(ComponentName.unflattenFromString(str)))) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
        }
        return arrayList;
    }

    /* renamed from: C */
    public final void m64592C(JSONObject jSONObject) {
        Map<String, String> map = this.f57404W;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    KJ6.m99011b(C38522bO6.class, 3, e);
                }
            }
        }
    }

    /* renamed from: D */
    public final long m64591D(String str) {
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }

    /* renamed from: E */
    public final String m64590E() {
        List<String> m64575t = m64575t(false);
        if (m64575t == null) {
            return null;
        }
        return m64575t.get(0);
    }

    /* renamed from: F */
    public final boolean m64589F(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    /* renamed from: G */
    public final String m64588G() {
        String property;
        String property2 = System.getProperty("http.proxyHost");
        if (property2 == null || (property = System.getProperty("http.proxyPort")) == null) {
            return null;
        }
        return "host=" + property2 + ",port=" + property;
    }

    /* renamed from: H */
    public final JSONObject m64587H(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z = false;
            jSONObject.put(EnumC41486gM6.AC.toString(), (sensorManager == null || sensorManager.getDefaultSensor(1) == null) ? false : true);
            jSONObject.put(EnumC41486gM6.GY.toString(), (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true);
            String enumC41486gM6 = EnumC41486gM6.MG.toString();
            if (sensorManager != null && sensorManager.getDefaultSensor(2) != null) {
                z = true;
            }
            jSONObject.put(enumC41486gM6, z);
        } catch (JSONException e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
        }
        return jSONObject;
    }

    /* renamed from: I */
    public final String m64586I() {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp() && !networkInterface.getInterfaceAddresses().isEmpty()) {
                    String name = networkInterface.getName();
                    if (name.startsWith("ppp") || name.startsWith("tun") || name.startsWith("tap")) {
                        return name;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
            return null;
        }
    }

    /* renamed from: J */
    public final JSONObject m64585J(Context context) {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            i = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
            i = -403;
        }
        try {
            jSONObject.put("brightness", m98940b(Integer.valueOf(i)));
        } catch (JSONException e2) {
            KJ6.m99011b(C38522bO6.class, 3, e2);
        }
        return jSONObject;
    }

    /* renamed from: K */
    public final String m64584K() throws IOException {
        JJ6 jj6 = new JJ6();
        jj6.m100707b(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/com.ebay.lid/");
        try {
            if (this.f57400S || this.f57399R) {
                return jj6.m100705d("fb.bin");
            }
            return null;
        } catch (FileNotFoundException unused) {
            if (this.f57400S) {
                String m1472d = C52760zN6.m1472d(true);
                jj6.m100706c("fb.bin", m1472d.getBytes(Constants.DEFAULT_ENCODING));
                return m1472d;
            }
            return null;
        } catch (IOException e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
            return null;
        }
    }

    /* renamed from: L */
    public final String m64583L(Context context) {
        int i = context.getSharedPreferences("RiskManagerCT", 0).getInt("RiskManagerCT", 0);
        return i + "";
    }

    /* renamed from: M */
    public final String m64582M() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57397P ? 1 : 0);
        sb.append(this.f57398Q ? 1 : 0);
        sb.append(this.f57401T ? 1 : 0);
        sb.append(this.f57402U ? 1 : 0);
        sb.append(this.f57399R ? 1 : 0);
        sb.append(this.f57400S ? 1 : 0);
        return sb.toString();
    }

    /* renamed from: N */
    public final void m64581N(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerCT", 0);
        int i = sharedPreferences.getInt("RiskManagerCT", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i2 = 1;
        if (i > 0 && i < Integer.MAX_VALUE) {
            i2 = 1 + i;
        }
        edit.putInt("RiskManagerCT", i2);
        edit.apply();
    }

    /* renamed from: O */
    public final JSONObject m64580O() {
        JSONObject jSONObject = new JSONObject();
        boolean z = Environment.isExternalStorageRemovable() && "mounted".equals(Environment.getExternalStorageState());
        long m64591D = m64591D(Environment.getDataDirectory().getPath());
        long m98941a = super.m98941a(600);
        try {
            jSONObject.put(XL6.EnumC9403b.MOUNTED.toString(), z);
            jSONObject.put(XL6.EnumC9403b.FREE_SD.toString(), m98940b(Long.valueOf(m98941a)));
            jSONObject.put(XL6.EnumC9403b.FREE_UD.toString(), m98940b(Long.valueOf(m64591D)));
        } catch (Exception e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
        }
        return jSONObject;
    }

    /* renamed from: P */
    public final JSONObject m64579P(Context context) {
        long j;
        long j2;
        JSONObject jSONObject = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long j3 = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            j = memoryInfo.availMem;
            j2 = memoryInfo.totalMem;
        } else {
            j = 12345;
            j2 = 12345;
        }
        try {
            jSONObject.put(XL6.EnumC9404c.FREE.toString(), m98940b(Long.valueOf(j)));
            jSONObject.put(XL6.EnumC9404c.TOTAL.toString(), m98940b(Long.valueOf(j2)));
            jSONObject.put(XL6.EnumC9404c.FREE_RUNTIME.toString(), m98940b(Long.valueOf(freeMemory)));
            jSONObject.put(XL6.EnumC9404c.TOTAL_RUNTIME.toString(), m98940b(Long.valueOf(j3)));
            jSONObject.put(XL6.EnumC9404c.MAX_RUNTIME.toString(), m98940b(Long.valueOf(maxMemory)));
        } catch (Exception e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
        }
        return jSONObject;
    }

    @Override // p000.KN6
    /* renamed from: d */
    public JSONObject mo8750d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pairing_id", this.f57426k);
            String xl6 = XL6.BASE_STATION_ID.toString();
            int i = this.f57410c;
            Integer num = null;
            jSONObject.put(xl6, i == -1 ? null : Integer.valueOf(i));
            jSONObject.put(XL6.BSSID.toString(), this.f57422i);
            jSONObject.put(XL6.BSSID_ARRAY.toString(), this.f57391J == null ? null : new JSONArray((Collection) this.f57391J));
            String xl62 = XL6.CELL_ID.toString();
            int i2 = this.f57412d;
            jSONObject.put(xl62, i2 == -1 ? null : Integer.valueOf(i2));
            jSONObject.put(XL6.CONN_TYPE.toString(), this.f57438q);
            jSONObject.put(XL6.CONF_VERSION.toString(), this.f57383B);
            jSONObject.put(XL6.IS_DEV_MODE_ON.toString(), this.f57403V);
            jSONObject.put(XL6.DEVICE_ID.toString(), this.f57440r);
            jSONObject.put(XL6.DC_ID.toString(), this.f57436p);
            String xl63 = XL6.DEVICE_UPTIME.toString();
            long j = this.f57393L;
            jSONObject.put(xl63, j == -1 ? null : Long.valueOf(j));
            jSONObject.put(XL6.IP_ADDRS.toString(), this.f57442s);
            jSONObject.put(XL6.IP_ADDRESSES.toString(), this.f57389H == null ? null : new JSONArray((Collection) this.f57389H));
            jSONObject.put(XL6.KNOWN_APPS.toString(), this.f57390I == null ? null : new JSONArray((Collection) this.f57390I));
            jSONObject.put(XL6.LOCALE_COUNTRY.toString(), this.f57444u);
            jSONObject.put(XL6.LOCALE_LANG.toString(), this.f57445v);
            jSONObject.put(XL6.LOCATION.toString(), m64572w(this.f57423i0));
            String xl64 = XL6.LOCATION_AREA_CODE.toString();
            int i3 = this.f57420h;
            jSONObject.put(xl64, i3 == -1 ? null : Integer.valueOf(i3));
            jSONObject.put(XL6.PHONE_TYPE.toString(), this.f57446w);
            jSONObject.put(XL6.RISK_COMP_SESSION_ID.toString(), this.f57447x);
            jSONObject.put(XL6.ROAMING.toString(), this.f57394M);
            jSONObject.put(XL6.SIM_OPERATOR_NAME.toString(), this.f57386E);
            jSONObject.put(XL6.SIM_SERIAL_NUMBER.toString(), this.f57448y);
            jSONObject.put(XL6.SSID.toString(), this.f57449z);
            String xl65 = XL6.CDMA_NETWORK_ID.toString();
            int i4 = this.f57418g;
            jSONObject.put(xl65, i4 == -1 ? null : Integer.valueOf(i4));
            String xl66 = XL6.CDMA_SYSTEM_ID.toString();
            int i5 = this.f57416f;
            jSONObject.put(xl66, i5 == -1 ? null : Integer.valueOf(i5));
            jSONObject.put(XL6.SUBSCRIBER_ID.toString(), this.f57382A);
            String xl67 = XL6.TIMESTAMP.toString();
            long j2 = this.f57392K;
            jSONObject.put(xl67, j2 == -1 ? null : Long.valueOf(j2));
            jSONObject.put(XL6.TZ_NAME.toString(), this.f57443t);
            jSONObject.put(XL6.DS.toString(), this.f57395N);
            String xl68 = XL6.TZ.toString();
            int i6 = this.f57414e;
            if (i6 != -1) {
                num = Integer.valueOf(i6);
            }
            jSONObject.put(xl68, num);
            jSONObject.put(XL6.NETWORK_OPERATOR.toString(), this.f57424j);
            jSONObject.put(XL6.SERIAL_NUMBER.toString(), this.f57428l);
            jSONObject.put(XL6.VPN_SETTING.toString(), this.f57432n);
            jSONObject.put(XL6.PROXY_SETTING.toString(), this.f57430m);
            jSONObject.put(XL6.C.toString(), this.f57434o);
            jSONObject.put(XL6.MG_ID.toString(), this.f57384C);
            jSONObject.put(XL6.LINKER_ID.toString(), this.f57385D);
            jSONObject.put(XL6.PL.toString(), this.f57387F);
            jSONObject.put(XL6.BATTERY.toString(), this.f57425j0);
            jSONObject.put(XL6.MEMORY.toString(), this.f57427k0);
            jSONObject.put(XL6.DISK.toString(), this.f57429l0);
            jSONObject.put(XL6.SCREEN.toString(), this.f57431m0);
            jSONObject.put(XL6.SR.toString(), this.f57433n0);
            jSONObject.put(XL6.T.toString(), KN6.f19526a);
            m64592C(jSONObject);
            return jSONObject;
        } catch (Exception e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
            return jSONObject;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: q */
    public final Location m64578q(LocationManager locationManager) {
        Location location = null;
        if (locationManager == null) {
            return null;
        }
        try {
            List<String> providers = locationManager.getProviders(true);
            for (int size = providers.size() - 1; size >= 0; size--) {
                location = locationManager.getLastKnownLocation(providers.get(size));
                if (location != null) {
                    break;
                }
            }
        } catch (Exception e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
        }
        return location;
    }

    /* renamed from: r */
    public final String m64577r(String str, String str2, long j, String str3) throws Exception {
        StringBuilder sb;
        String sb2;
        if (C52760zN6.m1465k(str) && C52760zN6.m1465k(str2) && C52760zN6.m1465k(Long.valueOf(j))) {
            sb2 = "invalid_input";
        } else {
            if (C52760zN6.m1465k(str)) {
                str = "";
            }
            if (C52760zN6.m1465k(str2)) {
                str2 = "";
            }
            if (C52760zN6.m1465k(Long.valueOf(j))) {
                sb = new StringBuilder();
                sb.append(str);
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(j);
            }
            sb.append(str2);
            sb2 = sb.toString();
        }
        String m1473c = C52760zN6.m1473c("SG1hY1NIQTI1Ng==");
        String m1473c2 = C52760zN6.m1465k(Long.valueOf(j)) ? C52760zN6.m1473c(str3) : C52760zN6.m1473c(str3) + j;
        Mac mac = Mac.getInstance(m1473c);
        mac.init(new SecretKeySpec(m1473c2.getBytes(), m1473c));
        byte[] doFinal = mac.doFinal(sb2.getBytes());
        StringBuilder sb3 = new StringBuilder();
        for (byte b : doFinal) {
            sb3.append(Integer.toString((b & UByte.MAX_VALUE) + 256, 16).substring(1));
        }
        return sb3.toString().substring(0, 32);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: s */
    public final ArrayList<String> m64576s(WifiManager wifiManager) {
        String bssid;
        int i;
        if (wifiManager == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (scanResults == null || scanResults.size() == 0 || (bssid = wifiManager.getConnectionInfo().getBSSID()) == null || bssid.equals("00:00:00:00:00:00")) {
            return null;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < scanResults.size(); i4++) {
            if (!bssid.equals(scanResults.get(i4).BSSID) && i2 < (i = scanResults.get(i4).level)) {
                i3 = i4;
                i2 = i;
            }
        }
        arrayList.add(bssid);
        if (i3 != -1) {
            arrayList.add(scanResults.get(i3).BSSID);
        }
        return arrayList;
    }

    /* renamed from: t */
    public final List<String> m64575t(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses != null && inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (z || !nextElement.isLinkLocalAddress())) {
                        String hostAddress = nextElement.getHostAddress();
                        if (nextElement instanceof Inet6Address) {
                            arrayList3.add(hostAddress);
                        } else {
                            arrayList2.add(hostAddress);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                arrayList.addAll(arrayList3);
            }
        } catch (Exception e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: u */
    public JSONObject m64574u(VF2 vf2, WM6 wm6, C44460lN6 c44460lN6, String str, String str2, HashMap<String, String> hashMap, Handler handler) {
        TelephonyManager telephonyManager;
        KJ6.m99012a(C38522bO6.class, 0, "collecting RiskBlobDynamicData");
        this.f57439q0 = c44460lN6;
        Context m80162b = vf2.m80162b();
        this.f57409b0 = (TelephonyManager) m80162b.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
        this.f57411c0 = (WifiManager) m80162b.getApplicationContext().getSystemService("wifi");
        this.f57417f0 = (LocationManager) m80162b.getSystemService("location");
        this.f57413d0 = (ConnectivityManager) m80162b.getSystemService("connectivity");
        int i = Build.VERSION.SDK_INT;
        this.f57415e0 = (BatteryManager) m80162b.getSystemService("batterymanager");
        this.f57419g0 = (PowerManager) m80162b.getSystemService("power");
        this.f57421h0 = m80162b.getPackageManager();
        boolean z = true;
        this.f57397P = m98934i(m80162b, "android.permission.ACCESS_COARSE_LOCATION") || m98934i(m80162b, "android.permission.ACCESS_FINE_LOCATION");
        this.f57399R = m98934i(m80162b, "android.permission.READ_EXTERNAL_STORAGE");
        this.f57400S = m98934i(m80162b, "android.permission.WRITE_EXTERNAL_STORAGE");
        this.f57398Q = m98934i(m80162b, "android.permission.READ_PHONE_STATE");
        this.f57402U = m98934i(m80162b, "android.permission.ACCESS_NETWORK_STATE");
        this.f57401T = m98934i(m80162b, "android.permission.ACCESS_WIFI_STATE");
        this.f57404W = hashMap;
        this.f57392K = System.currentTimeMillis();
        this.f57383B = c44460lN6.m27374n();
        this.f57426k = str2;
        this.f57388G = str;
        this.f57435o0 = handler;
        if (str2 == null) {
            this.f57426k = C52760zN6.m1472d(false);
        }
        m64570y(this.f57409b0);
        WifiManager wifiManager = this.f57411c0;
        if (wifiManager != null) {
            this.f57406Y = this.f57401T ? wifiManager.getConnectionInfo() : null;
        }
        ConnectivityManager connectivityManager = this.f57413d0;
        if (connectivityManager != null) {
            this.f57405X = this.f57402U ? connectivityManager.getActiveNetworkInfo() : null;
        }
        if (i >= 29) {
            if (!m98934i(m80162b, "android.permission.READ_PRIVILEGED_PHONE_STATE") && ((telephonyManager = this.f57409b0) == null || !telephonyManager.hasCarrierPrivileges())) {
                z = false;
            }
            this.f57396O = z;
        }
        this.f57441r0.m44316t(c44460lN6, handler, vf2);
        m64571x(82, vf2);
        m64571x(81, vf2);
        m64571x(16, vf2);
        m64571x(21, vf2);
        m64571x(75, vf2);
        m64571x(23, vf2);
        m64571x(27, vf2);
        m64571x(28, vf2);
        m64571x(25, vf2);
        m64571x(56, vf2);
        m64571x(72, vf2);
        m64571x(42, vf2);
        m64571x(43, vf2);
        m64571x(45, vf2);
        m64571x(53, vf2);
        m64571x(80, vf2);
        m64571x(71, vf2);
        m64571x(4, vf2);
        m64571x(57, vf2);
        m64571x(58, vf2);
        m64571x(6, vf2);
        m64571x(30, vf2);
        m64571x(29, vf2);
        m64571x(13, vf2);
        m64571x(68, vf2);
        m64571x(49, vf2);
        m64571x(84, vf2);
        m64571x(5, vf2);
        m64571x(48, vf2);
        m64571x(11, vf2);
        m64571x(85, vf2);
        m64571x(46, vf2);
        m64571x(79, vf2);
        m64571x(87, vf2);
        m64571x(98, vf2);
        m64571x(99, vf2);
        KN6.f19526a = false;
        if (this.f57437p0 && m98933j(wm6, vf2.m80159e(), KN6.f19527b, "s", vf2.m80162b())) {
            this.f57441r0.m44318r(vf2, this.f57426k, this.f57433n0);
        }
        if (m98933j(wm6, vf2.m80159e(), KN6.f19527b, "hw", vf2.m80162b())) {
            m64571x(89, vf2);
            m64571x(92, vf2);
            m64571x(93, vf2);
            m64571x(91, vf2);
        }
        KJ6.m99012a(C38522bO6.class, 0, "finishing RiskBlobDynamicData");
        return mo8750d();
    }

    /* renamed from: v */
    public final JSONObject m64573v(Context context, BatteryManager batteryManager, PowerManager powerManager) {
        int i;
        int i2;
        int i3;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        JSONObject jSONObject = new JSONObject();
        int i4 = 12345;
        double d = 12345.0d;
        if (registerReceiver != null) {
            double intExtra = registerReceiver.getIntExtra("level", 12345);
            int intExtra2 = registerReceiver.getIntExtra("scale", 12345);
            i = registerReceiver.getIntExtra("temperature", 12345);
            i2 = registerReceiver.getIntExtra("voltage", 12345);
            i3 = registerReceiver.getIntExtra("status", 12345);
            int intExtra3 = registerReceiver.getIntExtra("plugged", 12345);
            if (intExtra == 12345.0d || intExtra2 == 12345) {
                i4 = intExtra3;
                d = intExtra;
            } else {
                d = intExtra / intExtra2;
                i4 = intExtra3;
            }
        } else {
            i = 12345;
            i2 = 12345;
            i3 = 12345;
        }
        int intProperty = batteryManager.getIntProperty(2);
        boolean isPowerSaveMode = powerManager.isPowerSaveMode();
        try {
            jSONObject.put(XL6.EnumC9402a.CURRENT.toString(), m98940b(Integer.valueOf(intProperty)));
            jSONObject.put(XL6.EnumC9402a.LEVEL.toString(), new DecimalFormat(".##").format(m98940b(Double.valueOf(d))));
            jSONObject.put(XL6.EnumC9402a.METHOD.toString(), m98940b(Integer.valueOf(i4)));
            jSONObject.put(XL6.EnumC9402a.LOW_POWER.toString(), m98940b(Integer.valueOf(isPowerSaveMode ? 1 : 0)));
            jSONObject.put(XL6.EnumC9402a.STATE.toString(), m98940b(Integer.valueOf(i3)));
            jSONObject.put(XL6.EnumC9402a.TEMP.toString(), m98940b(Integer.valueOf(i)));
            jSONObject.put(XL6.EnumC9402a.VOLTAGE.toString(), m98940b(Integer.valueOf(i2)));
        } catch (JSONException e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
        }
        return jSONObject;
    }

    /* renamed from: w */
    public final JSONObject m64572w(Location location) {
        if (location != null) {
            try {
                return new JSONObject("{\"lat\":" + location.getLatitude() + ",\"lng\":" + location.getLongitude() + ",\"acc\":" + location.getAccuracy() + ",\"timestamp\":" + location.getTime() + "}");
            } catch (Exception e) {
                KJ6.m99011b(C38522bO6.class, 3, e);
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission,HardwareIds"})
    /* renamed from: x */
    public void m64571x(int i, VF2 vf2) {
        TelephonyManager telephonyManager;
        String deviceId;
        String str;
        try {
            Context m80162b = vf2.m80162b();
            int i2 = -1;
            if (i == 4) {
                if (this.f57439q0.m27378j(i)) {
                    CdmaCellLocation cdmaCellLocation = this.f57408a0;
                    if (cdmaCellLocation != null) {
                        i2 = cdmaCellLocation.getBaseStationId();
                    }
                    this.f57410c = i2;
                    return;
                }
                return;
            }
            String str2 = null;
            String networkOperator = null;
            List<String> list = null;
            String typeName = null;
            String ssid = null;
            String m64569z = null;
            if (i == 5) {
                if (this.f57439q0.m27378j(i)) {
                    WifiInfo wifiInfo = this.f57406Y;
                    if (wifiInfo != null) {
                        str2 = wifiInfo.getBSSID();
                    }
                    this.f57422i = str2;
                }
            } else if (i == 6) {
                if (this.f57439q0.m27378j(i)) {
                    GsmCellLocation gsmCellLocation = this.f57407Z;
                    if (gsmCellLocation != null) {
                        i2 = gsmCellLocation.getCid();
                    }
                    this.f57412d = i2;
                }
            } else if (i == 42) {
                if (this.f57439q0.m27378j(i)) {
                    this.f57447x = C52760zN6.m1472d(true);
                }
            } else if (i == 43) {
                if (this.f57439q0.m27378j(i)) {
                    this.f57394M = new ServiceState().getRoaming();
                }
            } else if (i == 45) {
                if (this.f57439q0.m27378j(i)) {
                    TelephonyManager telephonyManager2 = this.f57409b0;
                    if (telephonyManager2 != null) {
                        m64569z = m64569z(telephonyManager2);
                    }
                    this.f57386E = m64569z;
                }
            } else if (i == 46) {
                if ((!this.f57439q0.m27378j(i) || !this.f57398Q || this.f57409b0 == null || Build.VERSION.SDK_INT >= 29) && !this.f57396O) {
                    return;
                }
                this.f57448y = this.f57409b0.getSimSerialNumber();
            } else if (i == 48) {
                if (this.f57439q0.m27378j(i)) {
                    WifiInfo wifiInfo2 = this.f57406Y;
                    if (wifiInfo2 != null) {
                        ssid = wifiInfo2.getSSID();
                    }
                    this.f57449z = ssid;
                }
            } else if (i == 49) {
                if ((!this.f57439q0.m27378j(i) || !this.f57398Q || this.f57409b0 == null || Build.VERSION.SDK_INT >= 29) && !this.f57396O) {
                    return;
                }
                this.f57382A = this.f57409b0.getSubscriberId();
            } else if (i == 71) {
                if (this.f57439q0.m27378j(i)) {
                    this.f57432n = m64586I();
                }
            } else if (i == 72) {
                if (this.f57439q0.m27378j(i)) {
                    this.f57430m = m64588G();
                }
            } else if (i == 84) {
                if (this.f57439q0.m27378j(i)) {
                    this.f57391J = this.f57397P ? m64576s(this.f57411c0) : null;
                }
            } else if (i == 85) {
                this.f57384C = m64577r(this.f57388G, this.f57426k, this.f57392K, this.f57439q0.m27372p());
            } else {
                switch (i) {
                    case 11:
                        if (this.f57439q0.m27378j(i)) {
                            NetworkInfo networkInfo = this.f57405X;
                            if (networkInfo != null) {
                                typeName = networkInfo.getTypeName();
                            }
                            this.f57438q = typeName;
                            return;
                        }
                        return;
                    case 13:
                        if (this.f57439q0.m27378j(i) && this.f57398Q && (telephonyManager = this.f57409b0) != null) {
                            int i3 = Build.VERSION.SDK_INT;
                            if (i3 < 26) {
                                deviceId = telephonyManager.getDeviceId();
                            } else if (i3 >= 29 && !this.f57396O) {
                                return;
                            } else {
                                if (telephonyManager.getPhoneType() == 1) {
                                    deviceId = this.f57409b0.getImei();
                                } else if (this.f57409b0.getPhoneType() != 2) {
                                    return;
                                } else {
                                    deviceId = this.f57409b0.getMeid();
                                }
                            }
                            this.f57440r = deviceId;
                            return;
                        }
                        return;
                    case 16:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57393L = SystemClock.uptimeMillis();
                            return;
                        }
                        return;
                    case 21:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57442s = m64590E();
                            return;
                        }
                        return;
                    case 23:
                        if (this.f57439q0.m27378j(i)) {
                            List<String> m64593B = m64593B();
                            if (!m64593B.isEmpty()) {
                                list = m64593B;
                            }
                            this.f57390I = list;
                            return;
                        }
                        return;
                    case 25:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57385D = m64584K();
                            return;
                        }
                        return;
                    case 27:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57444u = Locale.getDefault().getCountry();
                            return;
                        }
                        return;
                    case 28:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57445v = Locale.getDefault().getLanguage();
                            return;
                        }
                        return;
                    case 29:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57423i0 = this.f57397P ? m64578q(this.f57417f0) : null;
                            return;
                        }
                        return;
                    case 30:
                        if (this.f57439q0.m27378j(i)) {
                            GsmCellLocation gsmCellLocation2 = this.f57407Z;
                            if (gsmCellLocation2 != null) {
                                i2 = gsmCellLocation2.getLac();
                            }
                            this.f57420h = i2;
                            return;
                        }
                        return;
                    case 53:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57443t = TimeZone.getDefault().getDisplayName(TimeZone.getDefault().inDaylightTime(new Date()), 1, Locale.ENGLISH);
                            return;
                        }
                        return;
                    case 68:
                        if (this.f57439q0.m27378j(i) && this.f57398Q && this.f57409b0 != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            if (i4 < 26) {
                                str = Build.SERIAL;
                            } else if (i4 >= 29 && !this.f57396O) {
                                return;
                            } else {
                                str = Build.getSerial();
                            }
                            this.f57428l = str;
                            return;
                        }
                        return;
                    case 75:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57389H = m64575t(true);
                            return;
                        }
                        return;
                    case 87:
                        this.f57387F = m64582M();
                        return;
                    case 89:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57425j0 = m64573v(m80162b, this.f57415e0, this.f57419g0);
                            return;
                        }
                        return;
                    case 98:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57433n0 = m64587H(m80162b);
                            return;
                        }
                        return;
                    case 99:
                        if (this.f57439q0.m27378j(i)) {
                            this.f57403V = m64589F(m80162b);
                            return;
                        }
                        return;
                    default:
                        switch (i) {
                            case 56:
                                if (this.f57439q0.m27378j(i)) {
                                    TelephonyManager telephonyManager3 = this.f57409b0;
                                    if (telephonyManager3 != null) {
                                        networkOperator = telephonyManager3.getNetworkOperator();
                                    }
                                    this.f57424j = networkOperator;
                                    return;
                                }
                                return;
                            case 57:
                                if (this.f57439q0.m27378j(i)) {
                                    CdmaCellLocation cdmaCellLocation2 = this.f57408a0;
                                    if (cdmaCellLocation2 != null) {
                                        i2 = cdmaCellLocation2.getNetworkId();
                                    }
                                    this.f57418g = i2;
                                    return;
                                }
                                return;
                            case 58:
                                if (this.f57439q0.m27378j(i)) {
                                    CdmaCellLocation cdmaCellLocation3 = this.f57408a0;
                                    if (cdmaCellLocation3 != null) {
                                        i2 = cdmaCellLocation3.getSystemId();
                                    }
                                    this.f57416f = i2;
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 79:
                                        if (this.f57439q0.m27378j(i)) {
                                            this.f57395N = TimeZone.getDefault().inDaylightTime(new Date());
                                            return;
                                        }
                                        return;
                                    case 80:
                                        if (this.f57439q0.m27378j(i)) {
                                            this.f57414e = TimeZone.getDefault().getOffset(new Date().getTime());
                                            return;
                                        }
                                        return;
                                    case 81:
                                        this.f57436p = m64594A(this.f57388G + this.f57392K);
                                        return;
                                    case 82:
                                        if (this.f57439q0.m27378j(i) && UF2.m81767g().f37133b.m80159e() == WF2.PAYPAL.m78677a()) {
                                            m64581N(m80162b);
                                            this.f57434o = m64583L(m80162b);
                                            return;
                                        }
                                        return;
                                    default:
                                        switch (i) {
                                            case 91:
                                                if (this.f57439q0.m27378j(i)) {
                                                    this.f57431m0 = m64585J(m80162b);
                                                    return;
                                                }
                                                return;
                                            case 92:
                                                if (this.f57439q0.m27378j(i)) {
                                                    this.f57427k0 = m64579P(m80162b);
                                                    return;
                                                }
                                                return;
                                            case 93:
                                                if (this.f57439q0.m27378j(i)) {
                                                    this.f57429l0 = m64580O();
                                                    return;
                                                }
                                                return;
                                            default:
                                                return;
                                        }
                                }
                        }
                }
            }
        } catch (AssertionError | Exception e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: y */
    public final void m64570y(TelephonyManager telephonyManager) {
        String str;
        if (telephonyManager == null) {
            return;
        }
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType != 0) {
            try {
                if (phoneType == 1) {
                    this.f57446w = "gsm";
                    this.f57407Z = this.f57397P ? (GsmCellLocation) C52760zN6.m1475a(telephonyManager.getCellLocation(), GsmCellLocation.class) : null;
                    return;
                } else if (phoneType == 2) {
                    this.f57446w = "cdma";
                    this.f57408a0 = this.f57397P ? (CdmaCellLocation) C52760zN6.m1475a(telephonyManager.getCellLocation(), CdmaCellLocation.class) : null;
                    return;
                } else {
                    str = "unknown (" + telephonyManager.getPhoneType() + ")";
                }
            } catch (Exception e) {
                KJ6.m99011b(C38522bO6.class, 3, e);
                return;
            }
        } else {
            str = "none";
        }
        this.f57446w = str;
    }

    /* renamed from: z */
    public final String m64569z(TelephonyManager telephonyManager) {
        try {
            return telephonyManager.getSimOperatorName();
        } catch (Exception e) {
            KJ6.m99011b(C38522bO6.class, 3, e);
            return null;
        }
    }
}
