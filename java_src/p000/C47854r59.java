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
/* renamed from: r59  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47854r59 {

    /* renamed from: a */
    public final TelemetryLoggingClient f106462a;

    /* renamed from: b */
    public final AtomicLong f106463b = new AtomicLong(-1);

    public C47854r59(Context context, String str) {
        this.f106462a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    /* renamed from: a */
    public static C47854r59 m16493a(Context context) {
        return new C47854r59(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void m16492b(long j, Exception exc) {
        this.f106463b.set(j);
    }

    /* renamed from: c */
    public final synchronized void m16491c(int i, int i2, long j, long j2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f106463b.get() != -1 && elapsedRealtime - this.f106463b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f106462a.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0)))).addOnFailureListener(new OnFailureListener() { // from class: j59
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C47854r59.this.m16492b(elapsedRealtime, exc);
            }
        });
    }
}
