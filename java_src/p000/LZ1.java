package p000;

import android.content.SharedPreferences;
import com.facebook.C17216a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
/* renamed from: LZ1 */
/* loaded from: classes5.dex */
public class LZ1 {

    /* renamed from: a */
    public static SharedPreferences f21683a;

    /* renamed from: b */
    public static final Set<String> f21684b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static final Map<String, Long> f21685c = new ConcurrentHashMap();

    /* renamed from: a */
    public static Map<String, JSONObject> m96634a(Map<String, JSONObject> map) {
        if (TD0.m84203d(LZ1.class)) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : new HashMap(map).entrySet()) {
                try {
                    JSONObject jSONObject = (JSONObject) entry.getValue();
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f21685c.containsKey(string)) {
                            map.remove(entry.getKey());
                        } else {
                            Set<String> set = f21684b;
                            set.add(string + ';' + currentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            f21683a.edit().putStringSet("PURCHASE_DETAILS_SET", f21684b).apply();
            return new HashMap(map);
        } catch (Throwable th) {
            TD0.m84205b(th, LZ1.class);
            return null;
        }
    }

    /* renamed from: b */
    public static void m96633b() {
        if (TD0.m84203d(LZ1.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long j = f21683a.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                f21683a.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            } else if (currentTimeMillis - j > 604800) {
                for (Map.Entry entry : new HashMap(f21685c).entrySet()) {
                    String str = (String) entry.getKey();
                    Long l = (Long) entry.getValue();
                    if (currentTimeMillis - l.longValue() > 86400) {
                        Set<String> set = f21684b;
                        set.remove(str + ";" + l);
                        f21685c.remove(str);
                    }
                }
                f21683a.edit().putStringSet("PURCHASE_DETAILS_SET", f21684b).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, LZ1.class);
        }
    }

    /* renamed from: c */
    public static Map<String, String> m96632c(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        if (TD0.m84203d(LZ1.class)) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
                JSONObject jSONObject = map2.get(entry.getKey());
                JSONObject value = entry.getValue();
                if (value != null && value.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                            hashMap.put(value.toString(), jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return hashMap;
        } catch (Throwable th) {
            TD0.m84205b(th, LZ1.class);
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m96631d() {
        if (TD0.m84203d(LZ1.class)) {
            return false;
        }
        try {
            m96628g();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long j = f21683a.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j != 0 && currentTimeMillis - j < 86400) {
                return false;
            }
            f21683a.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, LZ1.class);
            return false;
        }
    }

    /* renamed from: e */
    public static void m96630e(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        if (TD0.m84203d(LZ1.class)) {
            return;
        }
        try {
            m96628g();
            m96629f(new HashMap(m96632c(m96634a(map), map2)));
        } catch (Throwable th) {
            TD0.m84205b(th, LZ1.class);
        }
    }

    /* renamed from: f */
    public static void m96629f(Map<String, String> map) {
        if (TD0.m84203d(LZ1.class)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    C7580Su.m84661f(key, value, false);
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, LZ1.class);
        }
    }

    /* renamed from: g */
    public static void m96628g() {
        if (TD0.m84203d(LZ1.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C17216a.m52741e().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = C17216a.m52741e().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = C17216a.m52741e().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            f21683a = sharedPreferences3;
            Set<String> set = f21684b;
            set.addAll(sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet()));
            for (String str : set) {
                String[] split = str.split(";", 2);
                f21685c.put(split[0], Long.valueOf(Long.parseLong(split[1])));
            }
            m96633b();
        } catch (Throwable th) {
            TD0.m84205b(th, LZ1.class);
        }
    }
}
