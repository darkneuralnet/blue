package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
/* renamed from: mR8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45091mR8 {

    /* renamed from: a */
    public final Clock f98028a;

    /* renamed from: b */
    public long f98029b;

    public C45091mR8(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.f98028a = clock;
    }

    /* renamed from: a */
    public final void m25616a() {
        this.f98029b = 0L;
    }

    /* renamed from: b */
    public final void m25615b() {
        this.f98029b = this.f98028a.elapsedRealtime();
    }

    /* renamed from: c */
    public final boolean m25614c(long j) {
        return this.f98029b == 0 || this.f98028a.elapsedRealtime() - this.f98029b >= CoreConstants.MILLIS_IN_ONE_HOUR;
    }
}
