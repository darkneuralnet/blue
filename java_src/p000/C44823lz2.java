package p000;

import ch.qos.logback.core.spi.AbstractComponentTracker;
/* renamed from: lz2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44823lz2 {

    /* renamed from: a */
    public final long f97058a;

    /* renamed from: b */
    public final long f97059b;

    public C44823lz2(long j, long j2) {
        this.f97058a = j;
        this.f97059b = j2;
    }

    /* renamed from: a */
    public long m26570a() {
        return this.f97059b;
    }

    /* renamed from: b */
    public long m26569b() {
        return this.f97058a;
    }

    public String toString() {
        return this.f97058a + "/" + this.f97059b;
    }

    public C44823lz2(double d) {
        this((long) (d * 10000.0d), AbstractComponentTracker.LINGERING_TIMEOUT);
    }
}
