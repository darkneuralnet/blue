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
/* renamed from: aY8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38021aY8 {

    /* renamed from: a */
    public final TelemetryLoggingClient f50637a;

    /* renamed from: b */
    public final AtomicLong f50638b = new AtomicLong(-1);

    public C38021aY8(Context context, String str) {
        this.f50637a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    /* renamed from: a */
    public static C38021aY8 m71224a(Context context) {
        return new C38021aY8(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void m71223b(long j, Exception exc) {
        this.f50638b.set(j);
    }

    /* renamed from: c */
    public final synchronized void m71222c(int i, int i2, long j, long j2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f50638b.get() != -1 && elapsedRealtime - this.f50638b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f50637a.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(25503, i2, 0, j, j2, null, null, 0)))).addOnFailureListener(new OnFailureListener() { // from class: QX8
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C38021aY8.this.m71223b(elapsedRealtime, exc);
            }
        });
    }
}
