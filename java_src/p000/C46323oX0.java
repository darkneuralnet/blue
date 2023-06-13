package p000;

import com.google.zxing.NotFoundException;
/* renamed from: oX0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46323oX0 extends AbstractC40223eE1 {
    @Override // p000.AbstractC40223eE1
    /* renamed from: c */
    public C1837ET mo20940c(C1837ET c1837et, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException {
        return mo20939d(c1837et, i, i2, C43316jS3.m30608b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // p000.AbstractC40223eE1
    /* renamed from: d */
    public C1837ET mo20939d(C1837ET c1837et, int i, int i2, C43316jS3 c43316jS3) throws NotFoundException {
        if (i > 0 && i2 > 0) {
            C1837ET c1837et2 = new C1837ET(i, i2);
            int i3 = i * 2;
            float[] fArr = new float[i3];
            for (int i4 = 0; i4 < i2; i4++) {
                float f = i4 + 0.5f;
                for (int i5 = 0; i5 < i3; i5 += 2) {
                    fArr[i5] = (i5 / 2) + 0.5f;
                    fArr[i5 + 1] = f;
                }
                c43316jS3.m30604f(fArr);
                AbstractC40223eE1.m43089a(c1837et, fArr);
                for (int i6 = 0; i6 < i3; i6 += 2) {
                    try {
                        if (c1837et.m108959h((int) fArr[i6], (int) fArr[i6 + 1])) {
                            c1837et2.m108951q(i6 / 2, i4);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw NotFoundException.m45943a();
                    }
                }
            }
            return c1837et2;
        }
        throw NotFoundException.m45943a();
    }
}
