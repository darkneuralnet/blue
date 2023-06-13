package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* renamed from: Fx9 */
/* loaded from: classes5.dex */
public class Fx9 {

    /* renamed from: f */
    public static HashMap<String, String> f10598f;

    /* renamed from: k */
    public static Object f10603k;

    /* renamed from: l */
    public static boolean f10604l;

    /* renamed from: a */
    public static final Uri f10593a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f10594b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f10595c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f10596d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f10597e = new AtomicBoolean();

    /* renamed from: g */
    public static final HashMap<String, Boolean> f10599g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, Integer> f10600h = new HashMap<>();

    /* renamed from: i */
    public static final HashMap<String, Long> f10601i = new HashMap<>();

    /* renamed from: j */
    public static final HashMap<String, Float> f10602j = new HashMap<>();

    /* renamed from: m */
    public static String[] f10605m = new String[0];

    /* renamed from: a */
    public static long m106160a(ContentResolver contentResolver, String str, long j) {
        Object m106152i = m106152i(contentResolver);
        long j2 = 0;
        Long l = (Long) m106159b(f10601i, str, 0L);
        if (l != null) {
            return l.longValue();
        }
        String m106158c = m106158c(contentResolver, str, null);
        if (m106158c != null) {
            try {
                long parseLong = Long.parseLong(m106158c);
                l = Long.valueOf(parseLong);
                j2 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        m106154g(m106152i, f10601i, str, l);
        return j2;
    }

    /* renamed from: b */
    public static <T> T m106159b(HashMap<String, T> hashMap, String str, T t) {
        synchronized (Fx9.class) {
            if (hashMap.containsKey(str)) {
                T t2 = hashMap.get(str);
                if (t2 != null) {
                    t = t2;
                }
                return t;
            }
            return null;
        }
    }

    /* renamed from: c */
    public static String m106158c(ContentResolver contentResolver, String str, String str2) {
        synchronized (Fx9.class) {
            m106156e(contentResolver);
            Object obj = f10603k;
            if (f10598f.containsKey(str)) {
                String str3 = f10598f.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : f10605m) {
                if (str.startsWith(str4)) {
                    if (!f10604l || f10598f.isEmpty()) {
                        f10598f.putAll(m106157d(contentResolver, f10605m));
                        f10604l = true;
                        if (f10598f.containsKey(str)) {
                            String str5 = f10598f.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            Cursor query = contentResolver.query(f10593a, null, null, new String[]{str}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(1);
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        m106155f(obj, str, string);
                        String str6 = string != null ? string : null;
                        query.close();
                        return str6;
                    }
                } finally {
                    if (query != null) {
                        query.close();
                    }
                }
            }
            m106155f(obj, str, null);
            return null;
        }
    }

    /* renamed from: d */
    public static Map<String, String> m106157d(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f10594b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    /* renamed from: e */
    public static void m106156e(ContentResolver contentResolver) {
        if (f10598f == null) {
            f10597e.set(false);
            f10598f = new HashMap<>();
            f10603k = new Object();
            f10604l = false;
            contentResolver.registerContentObserver(f10593a, true, new Fy9(null));
        } else if (f10597e.getAndSet(false)) {
            f10598f.clear();
            f10599g.clear();
            f10600h.clear();
            f10601i.clear();
            f10602j.clear();
            f10603k = new Object();
            f10604l = false;
        }
    }

    /* renamed from: f */
    public static void m106155f(Object obj, String str, String str2) {
        synchronized (Fx9.class) {
            if (obj == f10603k) {
                f10598f.put(str, str2);
            }
        }
    }

    /* renamed from: g */
    public static <T> void m106154g(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (Fx9.class) {
            if (obj == f10603k) {
                hashMap.put(str, t);
                f10598f.remove(str);
            }
        }
    }

    /* renamed from: h */
    public static boolean m106153h(ContentResolver contentResolver, String str, boolean z) {
        Object m106152i = m106152i(contentResolver);
        HashMap<String, Boolean> hashMap = f10599g;
        Boolean bool = (Boolean) m106159b(hashMap, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String m106158c = m106158c(contentResolver, str, null);
        if (m106158c != null && !m106158c.equals("")) {
            if (f10595c.matcher(m106158c).matches()) {
                bool = Boolean.TRUE;
                z = true;
            } else if (f10596d.matcher(m106158c).matches()) {
                bool = Boolean.FALSE;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + m106158c + "\") as boolean");
            }
        }
        m106154g(m106152i, hashMap, str, bool);
        return z;
    }

    /* renamed from: i */
    public static Object m106152i(ContentResolver contentResolver) {
        Object obj;
        synchronized (Fx9.class) {
            m106156e(contentResolver);
            obj = f10603k;
        }
        return obj;
    }
}
