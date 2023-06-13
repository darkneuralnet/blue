package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.os.Build;
import android.util.Base64;
import co.bird.android.model.Detail;
import com.amazonaws.services.p026s3.internal.Constants;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.WL6;
/* renamed from: zN6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C52760zN6 {
    private C52760zN6() {
    }

    /* renamed from: a */
    public static <T> T m1475a(Object obj, Class<T> cls) {
        if (obj == null || !cls.isAssignableFrom(obj.getClass())) {
            return null;
        }
        return cls.cast(obj);
    }

    /* renamed from: b */
    public static String m1474b(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    /* renamed from: c */
    public static String m1473c(String str) throws UnsupportedEncodingException {
        return new String(Base64.decode(str, 2), Constants.DEFAULT_ENCODING);
    }

    /* renamed from: d */
    public static String m1472d(boolean z) {
        return z ? UUID.randomUUID().toString() : UUID.randomUUID().toString().replaceAll(Detail.EMPTY_CHAR, "");
    }

    /* renamed from: e */
    public static String m1471e(Boolean[] boolArr) {
        String str;
        if (boolArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Boolean bool : boolArr) {
            if (bool.booleanValue()) {
                str = "1";
            } else if (!bool.booleanValue()) {
                str = "0";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static List<String> m1470f(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(String.valueOf(jSONArray.get(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static Map<String, String> m1469g(Map<String, String> map, Context context) throws Exception {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String packageName = context.getPackageName();
        String m1474b = m1474b(context);
        if (!m1465k("5.1.1.release")) {
            map.put("comp_version", "5.1.1.release");
        }
        if (!m1465k(str)) {
            map.put(AnalyticsFields.OS_VERSION, str);
        }
        if (!m1465k("Android")) {
            map.put("os_type", "Android");
        }
        if (!m1465k(str2)) {
            map.put("device_model", str2);
        }
        if (!m1465k(packageName)) {
            map.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, packageName);
        }
        if (!m1465k(m1474b)) {
            map.put(AnalyticsFields.APP_VERSION, m1474b);
        }
        return map;
    }

    /* renamed from: h */
    public static JSONObject m1468h(Sensor sensor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WL6.EnumC8995e.NAME.toString(), sensor.getName());
        jSONObject.put(WL6.EnumC8995e.VENDOR.toString(), sensor.getVendor());
        jSONObject.put(WL6.EnumC8995e.POWER.toString(), String.format("%.8f", Float.valueOf(sensor.getPower())));
        jSONObject.put(WL6.EnumC8995e.VERSION.toString(), String.valueOf(sensor.getVersion()));
        jSONObject.put(WL6.EnumC8995e.RESOLUTION.toString(), String.format("%.8f", Float.valueOf(sensor.getResolution())));
        jSONObject.put(WL6.EnumC8995e.MAX_RANGE.toString(), String.format("%.8f", Float.valueOf(sensor.getMaximumRange())));
        jSONObject.put(WL6.EnumC8995e.FIFO_MAX_EVENT_COUNT.toString(), String.valueOf(sensor.getFifoMaxEventCount()));
        return jSONObject;
    }

    /* renamed from: i */
    public static JSONObject m1467i(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.has(next)) {
                try {
                    jSONObject.put(next, jSONObject2.opt(next));
                } catch (JSONException e) {
                    KJ6.m99011b(C52760zN6.class, 3, e);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: j */
    public static void m1466j(Class<?> cls, Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                KJ6.m99011b(cls.getClass(), 3, e);
            }
        }
    }

    /* renamed from: k */
    public static boolean m1465k(Object obj) {
        if (obj == null) {
            return true;
        }
        return obj instanceof String ? ((String) obj).isEmpty() : obj instanceof Long ? ((Long) obj).longValue() == 0 : !(obj instanceof Integer) || ((Integer) obj).intValue() == 0;
    }

    /* renamed from: l */
    public static boolean m1464l(List<String> list, String str) {
        for (String str2 : list) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static String m1463m(String str) {
        return str.replaceAll(".debug", "").replaceAll(".release", "");
    }

    /* renamed from: n */
    public static List<Integer> m1462n(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add((Integer) jSONArray.get(i));
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public static Map<String, String> m1461o(Context context) throws Exception {
        if (context == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", zendesk.core.Constants.APPLICATION_JSON);
        m1469g(hashMap, context);
        return hashMap;
    }

    /* renamed from: p */
    public static JSONArray m1460p(Object obj) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(obj);
        return jSONArray;
    }

    /* renamed from: q */
    public static Map<String, String> m1459q(Context context) throws Exception {
        if (context == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("X-PAYPAL-RESPONSE-DATA-FORMAT", "NV");
        hashMap.put("X-PAYPAL-REQUEST-DATA-FORMAT", "NV");
        hashMap.put("X-PAYPAL-SERVICE-VERSION", "1.0.0");
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        m1469g(hashMap, context);
        return hashMap;
    }
}
