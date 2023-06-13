package p000;

import com.google.zxing.NotFoundException;
/* renamed from: eE1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC40223eE1 {

    /* renamed from: a */
    public static AbstractC40223eE1 f78138a = new C46323oX0();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m43089a(C1837ET c1837et, float[] fArr) throws NotFoundException {
        int m108953o = c1837et.m108953o();
        int m108956l = c1837et.m108956l();
        boolean z = true;
        for (int i = 0; i < fArr.length && z; i += 2) {
            int i2 = (int) fArr[i];
            int i3 = i + 1;
            int i4 = (int) fArr[i3];
            if (i2 >= -1 && i2 <= m108953o && i4 >= -1 && i4 <= m108956l) {
                if (i2 == -1) {
                    fArr[i] = 0.0f;
                } else if (i2 == m108953o) {
                    fArr[i] = m108953o - 1;
                } else {
                    z = false;
                    if (i4 != -1) {
                        fArr[i3] = 0.0f;
                    } else if (i4 == m108956l) {
                        fArr[i3] = m108956l - 1;
                    }
                    z = true;
                }
                z = true;
                if (i4 != -1) {
                }
                z = true;
            } else {
                throw NotFoundException.m45943a();
            }
        }
        boolean z2 = true;
        for (int length = fArr.length - 2; length >= 0 && z2; length -= 2) {
            int i5 = (int) fArr[length];
            int i6 = length + 1;
            int i7 = (int) fArr[i6];
            if (i5 >= -1 && i5 <= m108953o && i7 >= -1 && i7 <= m108956l) {
                if (i5 == -1) {
                    fArr[length] = 0.0f;
                } else if (i5 == m108953o) {
                    fArr[length] = m108953o - 1;
                } else {
                    z2 = false;
                    if (i7 != -1) {
                        fArr[i6] = 0.0f;
                    } else if (i7 == m108956l) {
                        fArr[i6] = m108956l - 1;
                    }
                    z2 = true;
                }
                z2 = true;
                if (i7 != -1) {
                }
                z2 = true;
            } else {
                throw NotFoundException.m45943a();
            }
        }
    }

    /* renamed from: b */
    public static AbstractC40223eE1 m43088b() {
        return f78138a;
    }

    /* renamed from: c */
    public abstract C1837ET mo20940c(C1837ET c1837et, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException;

    /* renamed from: d */
    public abstract C1837ET mo20939d(C1837ET c1837et, int i, int i2, C43316jS3 c43316jS3) throws NotFoundException;
}
