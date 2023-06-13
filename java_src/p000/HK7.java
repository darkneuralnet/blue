package p000;

import com.google.android.gms.internal.clearcut.zzco;
/* renamed from: HK7 */
/* loaded from: classes5.dex */
public abstract class HK7 {

    /* renamed from: a */
    public int f13284a;

    /* renamed from: b */
    public int f13285b;

    /* renamed from: c */
    public boolean f13286c;

    private HK7() {
        this.f13284a = 100;
        this.f13285b = Integer.MAX_VALUE;
        this.f13286c = false;
    }

    /* renamed from: a */
    public static long m103991a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: b */
    public static HK7 m103990b(byte[] bArr, int i, int i2, boolean z) {
        C45629nL7 c45629nL7 = new C45629nL7(bArr, 0, i2, false);
        try {
            c45629nL7.mo23949d(i2);
            return c45629nL7;
        } catch (zzco e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m103989e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public abstract int mo23950c();

    /* renamed from: d */
    public abstract int mo23949d(int i) throws zzco;
}
