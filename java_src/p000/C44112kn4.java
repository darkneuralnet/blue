package p000;

import java.util.concurrent.TimeUnit;
/* renamed from: kn4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44112kn4 {

    /* renamed from: a */
    public long f94944a;

    /* renamed from: b */
    public long f94945b;

    /* renamed from: c */
    public TimeUnit f94946c;

    /* renamed from: kn4$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C25239a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94947a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f94947a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94947a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94947a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C44112kn4(long j, long j2, TimeUnit timeUnit) {
        this.f94944a = j;
        this.f94945b = j2;
        this.f94946c = timeUnit;
    }

    /* renamed from: a */
    public double m28441a() {
        int i = C25239a.f94947a[this.f94946c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return this.f94944a / this.f94946c.toSeconds(this.f94945b);
                }
                return (this.f94944a / this.f94945b) * TimeUnit.SECONDS.toMillis(1L);
            }
            return (this.f94944a / this.f94945b) * TimeUnit.SECONDS.toMicros(1L);
        }
        return (this.f94944a / this.f94945b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
