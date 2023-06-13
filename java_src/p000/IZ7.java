package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
/* renamed from: IZ7 */
/* loaded from: classes5.dex */
public final class IZ7 extends C44245l08 {

    /* renamed from: b */
    public final byte[] f15899b;

    /* renamed from: c */
    public int f15900c;

    /* renamed from: d */
    public int f15901d;

    /* renamed from: e */
    public int f15902e;

    public /* synthetic */ IZ7(byte[] bArr, int i, int i2, boolean z, C49905uZ7 c49905uZ7) {
        super(null);
        this.f15902e = Integer.MAX_VALUE;
        this.f15899b = bArr;
        this.f15900c = 0;
    }

    /* renamed from: c */
    public final int m101925c(int i) throws zzeo {
        int i2 = this.f15902e;
        this.f15902e = 0;
        int i3 = this.f15900c + this.f15901d;
        this.f15900c = i3;
        if (i3 > 0) {
            this.f15901d = i3;
            this.f15900c = i3 - i3;
        } else {
            this.f15901d = 0;
        }
        return i2;
    }
}
