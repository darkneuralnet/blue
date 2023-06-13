package p000;

import com.google.android.gms.internal.vision.zzjk;
import java.io.IOException;
/* renamed from: WB8 */
/* loaded from: classes6.dex */
public abstract class WB8 {

    /* renamed from: a */
    public int f40535a;

    /* renamed from: b */
    public int f40536b;

    /* renamed from: c */
    public int f40537c;

    /* renamed from: d */
    public C42584iC8 f40538d;

    /* renamed from: e */
    public boolean f40539e;

    private WB8() {
        this.f40536b = 100;
        this.f40537c = Integer.MAX_VALUE;
        this.f40539e = false;
    }

    /* renamed from: b */
    public static long m78740b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: c */
    public static WB8 m78739c(byte[] bArr, int i, int i2, boolean z) {
        C49699uC8 c49699uC8 = new C49699uC8(bArr, i2);
        try {
            c49699uC8.mo10625h(i2);
            return c49699uC8;
        } catch (zzjk e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: k */
    public static int m78738k(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: A */
    public abstract boolean mo10639A() throws IOException;

    /* renamed from: B */
    public abstract int mo10638B();

    /* renamed from: a */
    public abstract int mo10630a() throws IOException;

    /* renamed from: d */
    public abstract void mo10629d(int i) throws zzjk;

    /* renamed from: e */
    public abstract double mo10628e() throws IOException;

    /* renamed from: f */
    public abstract boolean mo10627f(int i) throws IOException;

    /* renamed from: g */
    public abstract float mo10626g() throws IOException;

    /* renamed from: h */
    public abstract int mo10625h(int i) throws zzjk;

    /* renamed from: i */
    public abstract long mo10624i() throws IOException;

    /* renamed from: j */
    public abstract void mo10623j(int i);

    /* renamed from: l */
    public abstract long mo10622l() throws IOException;

    /* renamed from: m */
    public abstract int mo10621m() throws IOException;

    /* renamed from: n */
    public abstract long mo10620n() throws IOException;

    /* renamed from: o */
    public abstract int mo10619o() throws IOException;

    /* renamed from: p */
    public abstract boolean mo10618p() throws IOException;

    /* renamed from: q */
    public abstract String mo10617q() throws IOException;

    /* renamed from: r */
    public abstract String mo10616r() throws IOException;

    /* renamed from: s */
    public abstract AbstractC53119zy8 mo10615s() throws IOException;

    /* renamed from: t */
    public abstract int mo10614t() throws IOException;

    /* renamed from: u */
    public abstract int mo10613u() throws IOException;

    /* renamed from: v */
    public abstract int mo10612v() throws IOException;

    /* renamed from: w */
    public abstract long mo10611w() throws IOException;

    /* renamed from: x */
    public abstract int mo10610x() throws IOException;

    /* renamed from: y */
    public abstract long mo10609y() throws IOException;

    /* renamed from: z */
    public abstract long mo10608z() throws IOException;
}
