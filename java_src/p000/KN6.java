package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.StatFs;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.time.DurationKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: KN6 */
/* loaded from: classes8.dex */
public abstract class KN6 {

    /* renamed from: a */
    public static boolean f19526a;

    /* renamed from: b */
    public static String f19527b;

    /* renamed from: e */
    public static JSONObject m98938e(@NonNull String str, @NonNull JSONArray jSONArray, @NonNull String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pairing_id", str);
        jSONObject.put(str2, jSONArray);
        return jSONObject;
    }

    /* renamed from: k */
    public static boolean m98932k(WM6 wm6, String str) {
        JSONObject optJSONObject = wm6.m78530i().optJSONObject(str);
        return optJSONObject != null && optJSONObject.optInt(EnumC39708dM6.RAMP_THRESHOLD.toString(), 0) < 0;
    }

    /* renamed from: l */
    public static boolean m98931l(String str) {
        return m98932k(UF2.m81767g().m81772b(), str);
    }

    /* renamed from: p */
    public static JSONObject m98927p(@NonNull String str, @NonNull JSONArray jSONArray, @NonNull String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TL6.FEATURE.toString(), str2);
        jSONObject.put(TL6.PAYLOAD.toString(), jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pairing_id", str);
        jSONObject2.put(TL6.AUDIT_KEY.toString(), C52760zN6.m1460p(jSONObject));
        return jSONObject2;
    }

    @RequiresApi(21)
    /* renamed from: a */
    public long m98941a(int i) {
        String str;
        long blockSize;
        int blockCount;
        File file = new File("/storage");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                for (int i2 = 0; i2 < length; i2++) {
                    File file2 = listFiles[i2];
                    if (file2.exists()) {
                        try {
                            if (Environment.isExternalStorageRemovable(file2)) {
                                str = file2.getAbsolutePath();
                                break;
                            }
                            continue;
                        } catch (Exception e) {
                            KJ6.m99011b(getClass(), 3, e);
                        }
                    }
                }
            }
            str = "";
            if (!str.isEmpty()) {
                File file3 = new File(str);
                if (file3.exists()) {
                    StatFs statFs = new StatFs(file3.getPath());
                    if (i == 600) {
                        blockSize = statFs.getBlockSize();
                        blockCount = statFs.getAvailableBlocks();
                    } else if (i == 601) {
                        blockSize = statFs.getBlockSize();
                        blockCount = statFs.getBlockCount();
                    }
                    return blockSize * blockCount;
                }
            }
        }
        return 12345L;
    }

    /* renamed from: b */
    public Object m98940b(Object obj) {
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 12345) {
                return -400;
            }
            return obj;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 12345.0d) {
                return -400;
            }
            return obj;
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == 12345) {
                return -400;
            }
            return obj;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() == 12345.0f) {
                return -400;
            }
            return obj;
        } else if (obj instanceof String) {
            return obj.equals("default") ? "-400" : obj;
        } else {
            return -400;
        }
    }

    /* renamed from: c */
    public String m98939c(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageName();
    }

    /* renamed from: d */
    public abstract JSONObject mo8750d();

    /* renamed from: f */
    public final JSONObject m98937f(HashMap<String, String> hashMap) {
        try {
            return new JSONObject("{\"id\":" + hashMap.get("id") + ",\"created_at\":" + hashMap.get("created_at") + "}");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public JSONObject m98936g(JSONObject jSONObject) {
        JSONObject mo8750d = mo8750d();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object opt = mo8750d.opt(next);
                if (opt == null) {
                    opt = jSONObject.get(next);
                } else if (opt instanceof JSONObject) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        ((JSONObject) opt).put(next2, jSONObject2.get(next2));
                    }
                } else {
                    opt = jSONObject.get(next);
                }
                mo8750d.put(next, opt);
            } catch (JSONException e) {
                KJ6.m99011b(getClass(), 3, e);
            }
        }
        return mo8750d;
    }

    /* renamed from: h */
    public final boolean m98935h(int i, String str, String str2) {
        if (str == null || str.equalsIgnoreCase("")) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        int abs = Math.abs(i);
        int abs2 = Math.abs(lowerCase.hashCode());
        if (abs2 > 0) {
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case 115:
                    if (str2.equals("s")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3343:
                    if (str2.equals("hw")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3696:
                    if (str2.equals("td")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3711:
                    if (str2.equals("ts")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    break;
                case 1:
                    abs2 /= 100;
                    break;
                case 2:
                    abs2 /= DurationKt.NANOS_IN_MILLIS;
                    break;
                case 3:
                    abs2 /= 10000;
                    break;
                default:
                    return false;
            }
            int i2 = abs2 % 100;
            if (i2 < abs) {
                f19526a = true;
            }
            return i2 < abs;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m98934i(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e) {
            KJ6.m99011b(getClass(), 3, e);
            return false;
        }
    }

    /* renamed from: j */
    public boolean m98933j(WM6 wm6, int i, String str, String str2, Context context) {
        try {
            JSONObject optJSONObject = wm6.m78530i().optJSONObject(str2);
            if (optJSONObject != null && !str.equalsIgnoreCase("")) {
                String string = optJSONObject.getString(EnumC39708dM6.MIN_VERSION.toString());
                String m1463m = C52760zN6.m1463m("5.1.1.release");
                if (!string.equalsIgnoreCase("") && m98930m(m1463m, string)) {
                    if (optJSONObject.getBoolean(EnumC39708dM6.OPEN.toString())) {
                        return m98929n(optJSONObject, i, context);
                    }
                    if (i != WF2.PAYPAL.m78677a() && i != WF2.VENMO.m78677a()) {
                        return false;
                    }
                    return m98935h(optJSONObject.optInt(EnumC39708dM6.RAMP_THRESHOLD.toString(), 0), str, str2);
                }
            }
            return false;
        } catch (Exception e) {
            KJ6.m99011b(getClass(), 3, e);
            return false;
        }
    }

    /* renamed from: m */
    public boolean m98930m(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (true) {
            if (i >= split.length && i >= split2.length) {
                return false;
            }
            if (i >= split.length || i >= split2.length) {
                if (i < split.length) {
                    if (Integer.parseInt(split[i]) != 0) {
                        return true;
                    }
                } else if (i < split2.length && Integer.parseInt(split2[i]) != 0) {
                    return false;
                }
            } else if (Integer.parseInt(split[i]) < Integer.parseInt(split2[i])) {
                return false;
            } else {
                if (Integer.parseInt(split[i]) > Integer.parseInt(split2[i])) {
                    return true;
                }
            }
            i++;
        }
    }

    /* renamed from: n */
    public boolean m98929n(JSONObject jSONObject, int i, Context context) {
        try {
            String m98939c = m98939c(context);
            String m1463m = C52760zN6.m1463m("5.1.1.release");
            List<String> m1470f = C52760zN6.m1470f(jSONObject.getJSONArray(EnumC39708dM6.EXCLUDED.toString()));
            if (m1470f == null) {
                return false;
            }
            if (C52760zN6.m1464l(m1470f, m1463m)) {
                List<String> m1470f2 = C52760zN6.m1470f(jSONObject.getJSONArray(EnumC39708dM6.APP_IDS.toString()));
                List<Integer> m1462n = C52760zN6.m1462n(jSONObject.getJSONArray(EnumC39708dM6.APP_SOURCES.toString()));
                if (m1462n == null || !m1462n.contains(Integer.valueOf(i))) {
                    if (m1470f2 != null) {
                        return !C52760zN6.m1464l(m1470f2, m98939c);
                    }
                    return true;
                }
                return false;
            }
            return true;
        } catch (Exception e) {
            KJ6.m99011b(getClass(), 3, e);
            return false;
        }
    }

    /* renamed from: o */
    public JSONObject m98928o(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerMG", 0);
        f19527b = sharedPreferences.getString("RiskManagerMG", "");
        long j = sharedPreferences.getLong("RiskManagerMGTIMESTAMP", 0L);
        if (f19527b.equals("") && j == 0) {
            f19527b = C52760zN6.m1472d(true);
            j = System.currentTimeMillis();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("RiskManagerMG", f19527b);
            edit.putLong("RiskManagerMGTIMESTAMP", j);
            edit.apply();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", f19527b);
        hashMap.put("created_at", j + "");
        return m98937f(hashMap);
    }
}
