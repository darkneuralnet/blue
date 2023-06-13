package p000;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: Ez8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32782Ez8 {

    /* renamed from: c */
    public static final C32782Ez8 f8404c;

    /* renamed from: a */
    public final UUID f8405a;

    /* renamed from: b */
    public final AtomicLong f8406b;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f8404c = new C32782Ez8(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public C32782Ez8(UUID uuid, long j) {
        this.f8405a = uuid;
        this.f8406b = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    /* renamed from: b */
    public static C32782Ez8 m108153b() {
        return f8404c;
    }

    /* renamed from: a */
    public final long m108154a() {
        long j;
        long j2;
        long j3;
        do {
            j = this.f8406b.get();
            long j4 = ((j * 25214903917L) + 11) & 281474976710655L;
            j2 = ((25214903917L * j4) + 11) & 281474976710655L;
            j3 = (((int) (j4 >>> 16)) << 32) + ((int) (j2 >>> 16));
        } while (!this.f8406b.compareAndSet(j, j2));
        return j3;
    }

    /* renamed from: c */
    public final UUID m108152c() {
        long m108154a = m108154a();
        return new UUID((m108154a & (-61441)) ^ this.f8405a.getMostSignificantBits(), (m108154a() >>> 2) ^ this.f8405a.getLeastSignificantBits());
    }
}
