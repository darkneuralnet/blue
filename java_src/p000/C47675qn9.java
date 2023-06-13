package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: qn9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47675qn9 {

    /* renamed from: a */
    public final TelemetryLoggingClient f105810a;

    /* renamed from: b */
    public final AtomicLong f105811b = new AtomicLong(-1);

    public C47675qn9(Context context, String str) {
        this.f105810a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    /* renamed from: a */
    public static C47675qn9 m16972a(Context context) {
        return new C47675qn9(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void m16971b(long j, Exception exc) {
        this.f105811b.set(j);
    }

    /* renamed from: c */
    public final synchronized void m16970c(int i, int i2, long j, long j2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f105811b.get() != -1 && elapsedRealtime - this.f105811b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f105810a.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0)))).addOnFailureListener(new OnFailureListener() { // from class: kn9
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C47675qn9.this.m16971b(elapsedRealtime, exc);
            }
        });
    }
}
