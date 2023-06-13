package p000;

import com.google.android.gms.internal.recaptcha.zzrr;
import java.io.IOException;
/* renamed from: ti9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC49403ti9 {

    /* renamed from: d */
    public static volatile int f110930d = 100;

    /* renamed from: a */
    public int f110931a;

    /* renamed from: b */
    public final int f110932b = f110930d;

    /* renamed from: c */
    public Ai9 f110933c;

    public /* synthetic */ AbstractC49403ti9(C50578vh9 c50578vh9) {
    }

    /* renamed from: e */
    public static int m11873e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: f */
    public static long m11872f(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    public static AbstractC49403ti9 m11871g(byte[] bArr, int i, int i2, boolean z) {
        C39917di9 c39917di9 = new C39917di9(bArr, 0, 0, false, null);
        try {
            c39917di9.mo11867k(0);
            return c39917di9;
        } catch (zzrr e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract void mo11878A(int i) throws zzrr;

    /* renamed from: a */
    public abstract void mo11877a(int i);

    /* renamed from: b */
    public abstract boolean mo11876b() throws IOException;

    /* renamed from: c */
    public abstract boolean mo11875c() throws IOException;

    /* renamed from: d */
    public abstract boolean mo11874d(int i) throws IOException;

    /* renamed from: h */
    public abstract double mo11870h() throws IOException;

    /* renamed from: i */
    public abstract float mo11869i() throws IOException;

    /* renamed from: j */
    public abstract int mo11868j();

    /* renamed from: k */
    public abstract int mo11867k(int i) throws zzrr;

    /* renamed from: l */
    public abstract int mo11866l() throws IOException;

    /* renamed from: m */
    public abstract int mo11865m() throws IOException;

    /* renamed from: n */
    public abstract int mo11864n() throws IOException;

    /* renamed from: o */
    public abstract int mo11863o() throws IOException;

    /* renamed from: p */
    public abstract int mo11862p() throws IOException;

    /* renamed from: q */
    public abstract int mo11861q() throws IOException;

    /* renamed from: r */
    public abstract int mo11860r() throws IOException;

    /* renamed from: s */
    public abstract long mo11859s() throws IOException;

    /* renamed from: t */
    public abstract long mo11858t() throws IOException;

    /* renamed from: u */
    public abstract long mo11857u() throws IOException;

    /* renamed from: v */
    public abstract long mo11856v() throws IOException;

    /* renamed from: w */
    public abstract long mo11855w() throws IOException;

    /* renamed from: x */
    public abstract AbstractC45836nh9 mo11854x() throws IOException;

    /* renamed from: y */
    public abstract String mo11853y() throws IOException;

    /* renamed from: z */
    public abstract String mo11852z() throws IOException;
}
