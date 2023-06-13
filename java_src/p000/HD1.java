package p000;

import java.util.Arrays;
/* renamed from: HD1 */
/* loaded from: classes2.dex */
public class HD1 {

    /* renamed from: a */
    public final float[] f13094a;

    /* renamed from: b */
    public final int[] f13095b;

    public HD1(float[] fArr, int[] iArr) {
        this.f13094a = fArr;
        this.f13095b = iArr;
    }

    /* renamed from: a */
    public HD1 m104173a(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = m104172b(fArr[i]);
        }
        return new HD1(fArr, iArr);
    }

    /* renamed from: b */
    public final int m104172b(float f) {
        int binarySearch = Arrays.binarySearch(this.f13094a, f);
        if (binarySearch >= 0) {
            return this.f13095b[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.f13095b[0];
        }
        int[] iArr = this.f13095b;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f13094a;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return RA1.m87228c((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    /* renamed from: c */
    public int[] m104171c() {
        return this.f13095b;
    }

    /* renamed from: d */
    public float[] m104170d() {
        return this.f13094a;
    }

    /* renamed from: e */
    public int m104169e() {
        return this.f13095b.length;
    }

    /* renamed from: f */
    public void m104168f(HD1 hd1, HD1 hd12, float f) {
        if (hd1.f13095b.length == hd12.f13095b.length) {
            for (int i = 0; i < hd1.f13095b.length; i++) {
                this.f13094a[i] = C48077rU2.m15911i(hd1.f13094a[i], hd12.f13094a[i], f);
                this.f13095b[i] = RA1.m87228c(f, hd1.f13095b[i], hd12.f13095b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + hd1.f13095b.length + " vs " + hd12.f13095b.length + ")");
    }
}
