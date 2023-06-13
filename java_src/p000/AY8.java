package p000;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* renamed from: AY8 */
/* loaded from: classes5.dex */
public class AY8 implements Closeable {

    /* renamed from: i */
    public static final Map f787i = new HashMap();

    /* renamed from: b */
    public final String f788b;

    /* renamed from: c */
    public int f789c;

    /* renamed from: d */
    public double f790d;

    /* renamed from: e */
    public long f791e;

    /* renamed from: f */
    public long f792f;

    /* renamed from: g */
    public long f793g;

    /* renamed from: h */
    public long f794h;

    public AY8(String str) {
        this.f793g = 2147483647L;
        this.f794h = -2147483648L;
        this.f788b = str;
    }

    /* renamed from: d */
    public static AY8 m115554d(String str) {
        C42782iY8 c42782iY8;
        Z39.m73790a();
        if (!Z39.m73789b()) {
            c42782iY8 = C42782iY8.f87473j;
            return c42782iY8;
        }
        Map map = f787i;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new AY8("detectorTaskWithResource#run"));
        }
        return (AY8) map.get("detectorTaskWithResource#run");
    }

    /* renamed from: a */
    public AY8 mo33815a() {
        this.f791e = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    /* renamed from: b */
    public void mo33814b(long j) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.f792f;
        if (j2 != 0 && elapsedRealtimeNanos - j2 >= 1000000) {
            zza();
        }
        this.f792f = elapsedRealtimeNanos;
        this.f789c++;
        this.f790d += j;
        this.f793g = Math.min(this.f793g, j);
        this.f794h = Math.max(this.f794h, j);
        if (this.f789c % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f788b, Long.valueOf(j), Integer.valueOf(this.f789c), Long.valueOf(this.f793g), Long.valueOf(this.f794h), Integer.valueOf((int) (this.f790d / this.f789c)));
            Z39.m73790a();
        }
        if (this.f789c % 500 == 0) {
            zza();
        }
    }

    /* renamed from: c */
    public void mo33813c(long j) {
        mo33814b((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f791e;
        if (j != 0) {
            mo33813c(j);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    public final void zza() {
        this.f789c = 0;
        this.f790d = 0.0d;
        this.f791e = 0L;
        this.f793g = 2147483647L;
        this.f794h = -2147483648L;
    }
}
