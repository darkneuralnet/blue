package p000;

import com.google.android.gms.internal.measurement.zzll;
/* renamed from: DO8 */
/* loaded from: classes5.dex */
public final class DO8 extends ZO8 {

    /* renamed from: b */
    public final byte[] f5592b;

    /* renamed from: c */
    public int f5593c;

    /* renamed from: d */
    public int f5594d;

    /* renamed from: e */
    public int f5595e;

    public /* synthetic */ DO8(byte[] bArr, int i, int i2, boolean z, C48029rO8 c48029rO8) {
        super(null);
        this.f5595e = Integer.MAX_VALUE;
        this.f5592b = bArr;
        this.f5593c = 0;
    }

    /* renamed from: c */
    public final int m110543c(int i) throws zzll {
        int i2 = this.f5595e;
        this.f5595e = 0;
        int i3 = this.f5593c + this.f5594d;
        this.f5593c = i3;
        if (i3 > 0) {
            this.f5594d = i3;
            this.f5593c = i3 - i3;
        } else {
            this.f5594d = 0;
        }
        return i2;
    }
}
