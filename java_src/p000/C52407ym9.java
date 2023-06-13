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
/* renamed from: ym9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52407ym9 {

    /* renamed from: a */
    public final TelemetryLoggingClient f120169a;

    /* renamed from: b */
    public final AtomicLong f120170b = new AtomicLong(-1);

    public C52407ym9(Context context, String str) {
        this.f120169a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    /* renamed from: a */
    public static C52407ym9 m2591a(Context context) {
        return new C52407ym9(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void m2590b(long j, Exception exc) {
        this.f120170b.set(j);
    }

    /* renamed from: c */
    public final synchronized void m2589c(int i, int i2, long j, long j2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f120170b.get() != -1 && elapsedRealtime - this.f120170b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f120169a.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0)))).addOnFailureListener(new OnFailureListener() { // from class: sm9
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C52407ym9.this.m2590b(elapsedRealtime, exc);
            }
        });
    }
}
