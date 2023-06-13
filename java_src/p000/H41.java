package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p000.E41;
import p000.InterfaceC52578z41;
/* renamed from: H41 */
/* loaded from: classes5.dex */
public class H41 implements InterfaceC52578z41 {

    /* renamed from: b */
    public final File f12803b;

    /* renamed from: c */
    public final long f12804c;

    /* renamed from: e */
    public E41 f12806e;

    /* renamed from: d */
    public final C41 f12805d = new C41();

    /* renamed from: a */
    public final C47611qh5 f12802a = new C47611qh5();

    @Deprecated
    public H41(File file, long j) {
        this.f12803b = file;
        this.f12804c = j;
    }

    /* renamed from: c */
    public static InterfaceC52578z41 m104450c(File file, long j) {
        return new H41(file, j);
    }

    @Override // p000.InterfaceC52578z41
    /* renamed from: a */
    public File mo1853a(InterfaceC38133ak2 interfaceC38133ak2) {
        String m17247b = this.f12802a.m17247b(interfaceC38133ak2);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + m17247b + " for for Key: " + interfaceC38133ak2);
        }
        try {
            E41.C1732e m109446u = m104449d().m109446u(m17247b);
            if (m109446u == null) {
                return null;
            }
            return m109446u.m109420a(0);
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // p000.InterfaceC52578z41
    /* renamed from: b */
    public void mo1852b(InterfaceC38133ak2 interfaceC38133ak2, InterfaceC52578z41.InterfaceC30902b interfaceC30902b) {
        E41 m104449d;
        String m17247b = this.f12802a.m17247b(interfaceC38133ak2);
        this.f12805d.m112924a(m17247b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + m17247b + " for for Key: " + interfaceC38133ak2);
            }
            try {
                m104449d = m104449d();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (m104449d.m109446u(m17247b) != null) {
                return;
            }
            E41.C1730c m109449r = m104449d.m109449r(m17247b);
            if (m109449r != null) {
                try {
                    if (interfaceC30902b.mo1851a(m109449r.m109435f(0))) {
                        m109449r.m109436e();
                    }
                    m109449r.m109439b();
                    return;
                } catch (Throwable th) {
                    m109449r.m109439b();
                    throw th;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + m17247b);
        } finally {
            this.f12805d.m112923b(m17247b);
        }
    }

    /* renamed from: d */
    public final synchronized E41 m104449d() throws IOException {
        if (this.f12806e == null) {
            this.f12806e = E41.m109444x(this.f12803b, 1, 1, this.f12804c);
        }
        return this.f12806e;
    }
}
