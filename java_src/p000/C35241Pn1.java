package p000;

import com.google.firebase.remoteconfig.internal.C18381c;
/* renamed from: Pn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35241Pn1 {

    /* renamed from: a */
    public final long f29033a;

    /* renamed from: b */
    public final long f29034b;

    /* renamed from: Pn1$b */
    /* loaded from: classes6.dex */
    public static class C6490b {

        /* renamed from: a */
        public long f29035a = 60;

        /* renamed from: b */
        public long f29036b = C18381c.f74447j;

        /* renamed from: c */
        public C35241Pn1 m89793c() {
            return new C35241Pn1(this);
        }

        /* renamed from: d */
        public C6490b m89792d(long j) throws IllegalArgumentException {
            if (j >= 0) {
                this.f29035a = j;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
        }

        /* renamed from: e */
        public C6490b m89791e(long j) {
            if (j >= 0) {
                this.f29036b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public C35241Pn1(C6490b c6490b) {
        this.f29033a = c6490b.f29035a;
        this.f29034b = c6490b.f29036b;
    }
}
