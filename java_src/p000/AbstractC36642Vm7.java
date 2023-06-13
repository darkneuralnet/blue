package p000;

import com.google.android.gms.internal.places.zzbk;
/* renamed from: Vm7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC36642Vm7 {

    /* renamed from: a */
    public int f39755a;

    /* renamed from: b */
    public int f39756b;

    /* renamed from: c */
    public boolean f39757c;

    private AbstractC36642Vm7() {
        this.f39755a = 100;
        this.f39756b = Integer.MAX_VALUE;
        this.f39757c = false;
    }

    /* renamed from: b */
    public static long m79425b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: c */
    public static AbstractC36642Vm7 m79424c(byte[] bArr, int i, int i2, boolean z) {
        C33150Go7 c33150Go7 = new C33150Go7(bArr, 0, i2, false);
        try {
            c33150Go7.mo79423d(i2);
            return c33150Go7;
        } catch (zzbk e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m79422e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo79426a();

    /* renamed from: d */
    public abstract int mo79423d(int i) throws zzbk;
}
