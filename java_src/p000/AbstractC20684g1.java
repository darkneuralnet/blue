package p000;

import com.google.zxing.NotFoundException;
/* renamed from: g1 */
/* loaded from: classes6.dex */
public abstract class AbstractC20684g1 extends AbstractC52944zh3 {

    /* renamed from: b */
    public final int[] f81311b;

    /* renamed from: e */
    public final int[] f81314e;

    /* renamed from: f */
    public final int[] f81315f;

    /* renamed from: a */
    public final int[] f81310a = new int[4];

    /* renamed from: c */
    public final float[] f81312c = new float[4];

    /* renamed from: d */
    public final float[] f81313d = new float[4];

    public AbstractC20684g1() {
        int[] iArr = new int[8];
        this.f81311b = iArr;
        this.f81314e = new int[iArr.length / 2];
        this.f81315f = new int[iArr.length / 2];
    }

    /* renamed from: g */
    public static void m40337g(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: n */
    public static void m40330n(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: o */
    public static boolean m40329o(int[] iArr) {
        int i;
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + i) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static int m40328p(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (AbstractC52944zh3.m541d(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: h */
    public final int[] m40336h() {
        return this.f81311b;
    }

    /* renamed from: i */
    public final int[] m40335i() {
        return this.f81310a;
    }

    /* renamed from: j */
    public final int[] m40334j() {
        return this.f81315f;
    }

    /* renamed from: k */
    public final float[] m40333k() {
        return this.f81313d;
    }

    /* renamed from: l */
    public final int[] m40332l() {
        return this.f81314e;
    }

    /* renamed from: m */
    public final float[] m40331m() {
        return this.f81312c;
    }
}
