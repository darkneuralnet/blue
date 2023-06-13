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
/* renamed from: if9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42851if9 {

    /* renamed from: a */
    public final TelemetryLoggingClient f87716a;

    /* renamed from: b */
    public final AtomicLong f87717b = new AtomicLong(-1);

    public C42851if9(Context context, String str) {
        this.f87716a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    /* renamed from: a */
    public static C42851if9 m33610a(Context context) {
        return new C42851if9(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void m33609b(long j, Exception exc) {
        this.f87717b.set(j);
    }

    /* renamed from: c */
    public final synchronized void m33608c(int i, int i2, long j, long j2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f87717b.get() != -1 && elapsedRealtime - this.f87717b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f87716a.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(24310, i2, 0, j, j2, null, null, 0)))).addOnFailureListener(new OnFailureListener() { // from class: af9
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C42851if9.this.m33609b(elapsedRealtime, exc);
            }
        });
    }
}
