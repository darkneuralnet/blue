package p000;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.C17216a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: Ug6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C36353Ug6 {

    /* renamed from: a */
    public static final String f37734a = "Ug6";

    /* renamed from: b */
    public static SharedPreferences f37735b;

    /* renamed from: c */
    public static AtomicBoolean f37736c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final ConcurrentHashMap<String, String> f37737d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final ConcurrentHashMap<String, String> f37738e = new ConcurrentHashMap<>();

    /* renamed from: Ug6$a */
    /* loaded from: classes5.dex */
    public static class RunnableC8343a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f37739b;

        /* renamed from: c */
        public final /* synthetic */ String f37740c;

        public RunnableC8343a(String str, String str2) {
            this.f37739b = str;
            this.f37740c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (!C36353Ug6.m81191a().get()) {
                    C36353Ug6.m81190b();
                }
                C36353Ug6.m81189c().edit().putString(this.f37739b, this.f37740c).apply();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ AtomicBoolean m81191a() {
        if (TD0.m84203d(C36353Ug6.class)) {
            return null;
        }
        try {
            return f37736c;
        } catch (Throwable th) {
            TD0.m84205b(th, C36353Ug6.class);
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m81190b() {
        if (TD0.m84203d(C36353Ug6.class)) {
            return;
        }
        try {
            m81186f();
        } catch (Throwable th) {
            TD0.m84205b(th, C36353Ug6.class);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ SharedPreferences m81189c() {
        if (TD0.m84203d(C36353Ug6.class)) {
            return null;
        }
        try {
            return f37735b;
        } catch (Throwable th) {
            TD0.m84205b(th, C36353Ug6.class);
            return null;
        }
    }

    /* renamed from: d */
    public static String m81188d() {
        if (TD0.m84203d(C36353Ug6.class)) {
            return null;
        }
        try {
            if (!f37736c.get()) {
                m81186f();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f37737d);
            hashMap.putAll(m81187e());
            return C52364yi6.m2848b0(hashMap);
        } catch (Throwable th) {
            TD0.m84205b(th, C36353Ug6.class);
            return null;
        }
    }

    /* renamed from: e */
    public static Map<String, String> m81187e() {
        if (TD0.m84203d(C36353Ug6.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> m90216b = PT2.m90216b();
            for (String str : f37738e.keySet()) {
                if (m90216b.contains(str)) {
                    hashMap.put(str, f37738e.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            TD0.m84205b(th, C36353Ug6.class);
            return null;
        }
    }

    /* renamed from: f */
    public static synchronized void m81186f() {
        synchronized (C36353Ug6.class) {
            if (TD0.m84203d(C36353Ug6.class)) {
                return;
            }
            if (f37736c.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C17216a.m52741e());
            f37735b = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            String string2 = f37735b.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            f37737d.putAll(C52364yi6.m2855W(string));
            f37738e.putAll(C52364yi6.m2855W(string2));
            f37736c.set(true);
        }
    }

    /* renamed from: g */
    public static void m81185g() {
        if (TD0.m84203d(C36353Ug6.class)) {
            return;
        }
        try {
            if (f37736c.get()) {
                return;
            }
            m81186f();
        } catch (Throwable th) {
            TD0.m84205b(th, C36353Ug6.class);
        }
    }

    /* renamed from: h */
    public static String m81184h(String str, String str2) {
        String str3;
        if (TD0.m84203d(C36353Ug6.class)) {
            return null;
        }
        try {
            String lowerCase = str2.trim().toLowerCase();
            if ("em".equals(str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(f37734a, "Setting email failure: this is not a valid email address");
                return "";
            } else if ("ph".equals(str)) {
                return lowerCase.replaceAll("[^0-9]", "");
            } else {
                if ("ge".equals(str)) {
                    if (lowerCase.length() <= 0) {
                        str3 = "";
                    } else {
                        str3 = lowerCase.substring(0, 1);
                    }
                    if (!"f".equals(str3) && !"m".equals(str3)) {
                        Log.e(f37734a, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return str3;
                }
                return lowerCase;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C36353Ug6.class);
            return null;
        }
    }

    /* renamed from: i */
    public static void m81183i(Map<String, String> map) {
        String[] strArr;
        if (TD0.m84203d(C36353Ug6.class)) {
            return;
        }
        try {
            if (!f37736c.get()) {
                m81186f();
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String m2808v0 = C52364yi6.m2808v0(m81184h(key, map.get(key).trim()));
                ConcurrentHashMap<String, String> concurrentHashMap = f37738e;
                if (concurrentHashMap.containsKey(key)) {
                    String str = concurrentHashMap.get(key);
                    if (str != null) {
                        strArr = str.split(",");
                    } else {
                        strArr = new String[0];
                    }
                    HashSet hashSet = new HashSet(Arrays.asList(strArr));
                    if (hashSet.contains(m2808v0)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(m2808v0);
                    } else if (strArr.length < 5) {
                        sb.append(str);
                        sb.append(",");
                        sb.append(m2808v0);
                    } else {
                        for (int i = 1; i < 5; i++) {
                            sb.append(strArr[i]);
                            sb.append(",");
                        }
                        sb.append(m2808v0);
                        hashSet.remove(strArr[0]);
                    }
                    f37738e.put(key, sb.toString());
                } else {
                    concurrentHashMap.put(key, m2808v0);
                }
            }
            m81182j("com.facebook.appevents.UserDataStore.internalUserData", C52364yi6.m2848b0(f37738e));
        } catch (Throwable th) {
            TD0.m84205b(th, C36353Ug6.class);
        }
    }

    /* renamed from: j */
    public static void m81182j(String str, String str2) {
        if (TD0.m84203d(C36353Ug6.class)) {
            return;
        }
        try {
            C17216a.m52731o().execute(new RunnableC8343a(str, str2));
        } catch (Throwable th) {
            TD0.m84205b(th, C36353Ug6.class);
        }
    }
}
