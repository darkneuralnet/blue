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
/* renamed from: ES7 */
/* loaded from: classes5.dex */
public final class ES7 implements MT7 {

    /* renamed from: g */
    public static final Map<Uri, ES7> f7502g = new C28385so();

    /* renamed from: h */
    public static final String[] f7503h = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f7504a;

    /* renamed from: b */
    public final Uri f7505b;

    /* renamed from: c */
    public final ContentObserver f7506c;

    /* renamed from: d */
    public final Object f7507d;

    /* renamed from: e */
    public volatile Map<String, String> f7508e;

    /* renamed from: f */
    public final List<US7> f7509f;

    public ES7(ContentResolver contentResolver, Uri uri) {
        C46878pS7 c46878pS7 = new C46878pS7(this, null);
        this.f7506c = c46878pS7;
        this.f7507d = new Object();
        this.f7509f = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f7504a = contentResolver;
        this.f7505b = uri;
        contentResolver.registerContentObserver(uri, false, c46878pS7);
    }

    /* renamed from: a */
    public static ES7 m108969a(ContentResolver contentResolver, Uri uri) {
        ES7 es7;
        synchronized (ES7.class) {
            Map<Uri, ES7> map = f7502g;
            es7 = map.get(uri);
            if (es7 == null) {
                try {
                    ES7 es72 = new ES7(contentResolver, uri);
                    try {
                        map.put(uri, es72);
                    } catch (SecurityException unused) {
                    }
                    es7 = es72;
                } catch (SecurityException unused2) {
                }
            }
        }
        return es7;
    }

    /* renamed from: c */
    public static synchronized void m108967c() {
        synchronized (ES7.class) {
            for (ES7 es7 : f7502g.values()) {
                es7.f7504a.unregisterContentObserver(es7.f7506c);
            }
            f7502g.clear();
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Map m108968b() {
        Map hashMap;
        Cursor query = this.f7504a.query(this.f7505b, f7503h, null, null, null);
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

    /* renamed from: d */
    public final void m108966d() {
        synchronized (this.f7507d) {
            this.f7508e = null;
            JX7.m100268d();
        }
        synchronized (this) {
            for (US7 us7 : this.f7509f) {
                us7.zza();
            }
        }
    }

    @Override // p000.MT7
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        Map<String, String> map;
        Map<String, String> map2 = this.f7508e;
        if (map2 == null) {
            synchronized (this.f7507d) {
                map2 = this.f7508e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C43329jT7.m30578a(new InterfaceC52222yT7() { // from class: aS7
                            @Override // p000.InterfaceC52222yT7
                            public final Object zza() {
                                return ES7.this.m108968b();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.f7508e = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return map2.get(str);
    }
}
