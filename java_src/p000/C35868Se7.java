package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* renamed from: Se7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35868Se7 {

    /* renamed from: a */
    public final long f34024a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    public long f34025b;

    public C35868Se7(long j) {
    }

    /* renamed from: a */
    public final synchronized boolean m85161a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f34025b;
        if (j != 0 && elapsedRealtime - j < this.f34024a) {
            return false;
        }
        this.f34025b = elapsedRealtime;
        return true;
    }
}
