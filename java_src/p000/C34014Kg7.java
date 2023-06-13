package p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: Kg7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34014Kg7 {

    /* renamed from: h */
    public static final ConcurrentHashMap<Uri, C34014Kg7> f20043h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public static final String[] f20044i = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f20045a;

    /* renamed from: b */
    public final Uri f20046b;

    /* renamed from: e */
    public volatile Map<String, String> f20049e;

    /* renamed from: d */
    public final Object f20048d = new Object();

    /* renamed from: f */
    public final Object f20050f = new Object();

    /* renamed from: g */
    public final List<InterfaceC52365yi7> f20051g = new ArrayList();

    /* renamed from: c */
    public final ContentObserver f20047c = new C32853Fh7(this, null);

    public C34014Kg7(ContentResolver contentResolver, Uri uri) {
        this.f20045a = contentResolver;
        this.f20046b = uri;
    }

    /* renamed from: a */
    public static C34014Kg7 m98525a(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap<Uri, C34014Kg7> concurrentHashMap = f20043h;
        C34014Kg7 c34014Kg7 = concurrentHashMap.get(uri);
        if (c34014Kg7 == null) {
            C34014Kg7 c34014Kg72 = new C34014Kg7(contentResolver, uri);
            C34014Kg7 putIfAbsent = concurrentHashMap.putIfAbsent(uri, c34014Kg72);
            if (putIfAbsent == null) {
                c34014Kg72.f20045a.registerContentObserver(c34014Kg72.f20046b, false, c34014Kg72.f20047c);
                return c34014Kg72;
            }
            return putIfAbsent;
        }
        return c34014Kg7;
    }

    /* renamed from: c */
    public final Map<String, String> m98523c() {
        Map<String, String> m98521e = AbstractC48818sj7.m13755h("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? m98521e() : this.f20049e;
        if (m98521e == null) {
            synchronized (this.f20048d) {
                m98521e = this.f20049e;
                if (m98521e == null) {
                    m98521e = m98521e();
                    this.f20049e = m98521e;
                }
            }
        }
        return m98521e != null ? m98521e : Collections.emptyMap();
    }

    /* renamed from: d */
    public final void m98522d() {
        synchronized (this.f20048d) {
            this.f20049e = null;
        }
    }

    /* renamed from: e */
    public final Map<String, String> m98521e() {
        try {
            HashMap hashMap = new HashMap();
            Cursor query = this.f20045a.query(this.f20046b, f20044i, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    /* renamed from: f */
    public final void m98520f() {
        synchronized (this.f20050f) {
            for (InterfaceC52365yi7 interfaceC52365yi7 : this.f20051g) {
                interfaceC52365yi7.m2793a();
            }
        }
    }
}
