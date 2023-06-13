package p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: gv8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41824gv8 implements InterfaceC51320ww8 {

    /* renamed from: h */
    public static final Map f84458h = new C28385so();

    /* renamed from: i */
    public static final String[] f84459i = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f84460a;

    /* renamed from: b */
    public final Uri f84461b;

    /* renamed from: c */
    public final Runnable f84462c;

    /* renamed from: d */
    public final ContentObserver f84463d;

    /* renamed from: e */
    public final Object f84464e;

    /* renamed from: f */
    public volatile Map f84465f;

    /* renamed from: g */
    public final List f84466g;

    public C41824gv8(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C36247Tu8 c36247Tu8 = new C36247Tu8(this, null);
        this.f84463d = c36247Tu8;
        this.f84464e = new Object();
        this.f84466g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f84460a = contentResolver;
        this.f84461b = uri;
        this.f84462c = runnable;
        contentResolver.registerContentObserver(uri, false, c36247Tu8);
    }

    /* renamed from: a */
    public static C41824gv8 m37319a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C41824gv8 c41824gv8;
        synchronized (C41824gv8.class) {
            Map map = f84458h;
            c41824gv8 = (C41824gv8) map.get(uri);
            if (c41824gv8 == null) {
                try {
                    C41824gv8 c41824gv82 = new C41824gv8(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c41824gv82);
                    } catch (SecurityException unused) {
                    }
                    c41824gv8 = c41824gv82;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c41824gv8;
    }

    /* renamed from: d */
    public static synchronized void m37316d() {
        synchronized (C41824gv8.class) {
            for (C41824gv8 c41824gv8 : f84458h.values()) {
                c41824gv8.f84460a.unregisterContentObserver(c41824gv8.f84463d);
            }
            f84458h.clear();
        }
    }

    /* renamed from: b */
    public final Map m37318b() {
        Map map;
        Map map2 = this.f84465f;
        if (map2 == null) {
            synchronized (this.f84464e) {
                map2 = this.f84465f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C36724Vv8.m79226a(new InterfaceC43020iw8() { // from class: Gu8
                            @Override // p000.InterfaceC43020iw8
                            public final Object zza() {
                                return C41824gv8.this.m37317c();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.f84465f = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /* renamed from: c */
    public final /* synthetic */ Map m37317c() {
        Map hashMap;
        Cursor query = this.f84460a.query(this.f84461b, f84459i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new C28385so(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    public final void m37315e() {
        synchronized (this.f84464e) {
            this.f84465f = null;
            this.f84462c.run();
        }
        synchronized (this) {
            for (InterfaceC49532tv8 interfaceC49532tv8 : this.f84466g) {
                interfaceC49532tv8.zza();
            }
        }
    }

    @Override // p000.InterfaceC51320ww8
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) m37318b().get(str);
    }
}
