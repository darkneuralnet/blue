package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* renamed from: gR7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41532gR7 {

    /* renamed from: f */
    public static HashMap<String, String> f82203f;

    /* renamed from: k */
    public static Object f82208k;

    /* renamed from: l */
    public static boolean f82209l;

    /* renamed from: a */
    public static final Uri f82198a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f82199b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f82200c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f82201d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f82202e = new AtomicBoolean();

    /* renamed from: g */
    public static final HashMap<String, Boolean> f82204g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, Integer> f82205h = new HashMap<>();

    /* renamed from: i */
    public static final HashMap<String, Long> f82206i = new HashMap<>();

    /* renamed from: j */
    public static final HashMap<String, Float> f82207j = new HashMap<>();

    /* renamed from: m */
    public static final String[] f82210m = new String[0];

    /* renamed from: a */
    public static String m39459a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C41532gR7.class) {
            String str3 = null;
            if (f82203f == null) {
                f82202e.set(false);
                f82203f = new HashMap<>();
                f82208k = new Object();
                f82209l = false;
                contentResolver.registerContentObserver(f82198a, true, new QQ7(null));
            } else if (f82202e.getAndSet(false)) {
                f82203f.clear();
                f82204g.clear();
                f82205h.clear();
                f82206i.clear();
                f82207j.clear();
                f82208k = new Object();
                f82209l = false;
            }
            Object obj = f82208k;
            if (f82203f.containsKey(str)) {
                String str4 = f82203f.get(str);
                if (str4 != null) {
                    str3 = str4;
                }
                return str3;
            }
            int length = f82210m.length;
            Cursor query = contentResolver.query(f82198a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    m39457c(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                m39457c(obj, str, string);
                if (string != null) {
                    str3 = string;
                }
                return str3;
            } finally {
                query.close();
            }
        }
    }

    /* renamed from: c */
    public static void m39457c(Object obj, String str, String str2) {
        synchronized (C41532gR7.class) {
            if (obj == f82208k) {
                f82203f.put(str, str2);
            }
        }
    }
}
