package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* renamed from: Rt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35770Rt8 {

    /* renamed from: f */
    public static HashMap f32812f;

    /* renamed from: k */
    public static Object f32817k;

    /* renamed from: l */
    public static boolean f32818l;

    /* renamed from: a */
    public static final Uri f32807a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f32808b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f32809c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f32810d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f32811e = new AtomicBoolean();

    /* renamed from: g */
    public static final HashMap f32813g = new HashMap(16, 1.0f);

    /* renamed from: h */
    public static final HashMap f32814h = new HashMap(16, 1.0f);

    /* renamed from: i */
    public static final HashMap f32815i = new HashMap(16, 1.0f);

    /* renamed from: j */
    public static final HashMap f32816j = new HashMap(16, 1.0f);

    /* renamed from: m */
    public static final String[] f32819m = new String[0];

    /* renamed from: a */
    public static String m86244a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C35770Rt8.class) {
            String str3 = null;
            if (f32812f == null) {
                f32811e.set(false);
                f32812f = new HashMap(16, 1.0f);
                f32817k = new Object();
                f32818l = false;
                contentResolver.registerContentObserver(f32807a, true, new C35995Ss8(null));
            } else if (f32811e.getAndSet(false)) {
                f32812f.clear();
                f32813g.clear();
                f32814h.clear();
                f32815i.clear();
                f32816j.clear();
                f32817k = new Object();
                f32818l = false;
            }
            Object obj = f32817k;
            if (f32812f.containsKey(str)) {
                String str4 = (String) f32812f.get(str);
                if (str4 != null) {
                    str3 = str4;
                }
                return str3;
            }
            int length = f32819m.length;
            Cursor query = contentResolver.query(f32807a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    m86242c(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                m86242c(obj, str, string);
                if (string == null) {
                    return null;
                }
                return string;
            } finally {
                query.close();
            }
        }
    }

    /* renamed from: c */
    public static void m86242c(Object obj, String str, String str2) {
        synchronized (C35770Rt8.class) {
            if (obj == f32817k) {
                f32812f.put(str, str2);
            }
        }
    }
}
