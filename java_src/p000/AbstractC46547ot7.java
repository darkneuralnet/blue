package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.io.IOException;
/* renamed from: ot7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC46547ot7 {

    /* renamed from: d */
    public static volatile int f102727d = 100;

    /* renamed from: a */
    public int f102728a;

    /* renamed from: b */
    public final int f102729b = f102727d;

    /* renamed from: c */
    public C47140pt7 f102730c;

    public /* synthetic */ AbstractC46547ot7(C44768lt7 c44768lt7) {
    }

    /* renamed from: e */
    public static int m20347e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: f */
    public static long m20346f(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    public static AbstractC46547ot7 m20345g(byte[] bArr, int i, int i2, boolean z) {
        C45361mt7 c45361mt7 = new C45361mt7(bArr, 0, 0, false, null);
        try {
            c45361mt7.mo20341k(0);
            return c45361mt7;
        } catch (zzaqw e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract void mo20352A(int i) throws zzaqw;

    /* renamed from: a */
    public abstract void mo20351a(int i);

    /* renamed from: b */
    public abstract boolean mo20350b() throws IOException;

    /* renamed from: c */
    public abstract boolean mo20349c() throws IOException;

    /* renamed from: d */
    public abstract boolean mo20348d(int i) throws IOException;

    /* renamed from: h */
    public abstract double mo20344h() throws IOException;

    /* renamed from: i */
    public abstract float mo20343i() throws IOException;

    /* renamed from: j */
    public abstract int mo20342j();

    /* renamed from: k */
    public abstract int mo20341k(int i) throws zzaqw;

    /* renamed from: l */
    public abstract int mo20340l() throws IOException;

    /* renamed from: m */
    public abstract int mo20339m() throws IOException;

    /* renamed from: n */
    public abstract int mo20338n() throws IOException;

    /* renamed from: o */
    public abstract int mo20337o() throws IOException;

    /* renamed from: p */
    public abstract int mo20336p() throws IOException;

    /* renamed from: q */
    public abstract int mo20335q() throws IOException;

    /* renamed from: r */
    public abstract int mo20334r() throws IOException;

    /* renamed from: s */
    public abstract long mo20333s() throws IOException;

    /* renamed from: t */
    public abstract long mo20332t() throws IOException;

    /* renamed from: u */
    public abstract long mo20331u() throws IOException;

    /* renamed from: v */
    public abstract long mo20330v() throws IOException;

    /* renamed from: w */
    public abstract long mo20329w() throws IOException;

    /* renamed from: x */
    public abstract AbstractC44175kt7 mo20328x() throws IOException;

    /* renamed from: y */
    public abstract String mo20327y() throws IOException;

    /* renamed from: z */
    public abstract String mo20326z() throws IOException;
}
