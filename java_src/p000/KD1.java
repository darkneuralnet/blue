package p000;

import android.graphics.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import p000.AbstractC39920dj2;
/* renamed from: KD1 */
/* loaded from: classes2.dex */
public class KD1 implements InterfaceC34274Lj6<HD1> {

    /* renamed from: a */
    public int f19292a;

    public KD1(int i) {
        this.f19292a = i;
    }

    /* renamed from: e */
    public static float[] m99072e(float[] fArr, float[] fArr2) {
        float f;
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f2 = Float.NaN;
            if (i2 < fArr.length) {
                f = fArr[i2];
            } else {
                f = Float.NaN;
            }
            if (i3 < fArr2.length) {
                f2 = fArr2[i3];
            }
            if (!Float.isNaN(f2) && f >= f2) {
                if (!Float.isNaN(f) && f2 >= f) {
                    fArr3[i4] = f;
                    i2++;
                    i3++;
                    i++;
                } else {
                    fArr3[i4] = f2;
                    i3++;
                }
            } else {
                fArr3[i4] = f;
                i2++;
            }
        }
        if (i == 0) {
            return fArr3;
        }
        return Arrays.copyOf(fArr3, length - i);
    }

    /* renamed from: b */
    public final HD1 m99075b(HD1 hd1, List<Float> list) {
        int i = this.f19292a * 4;
        if (list.size() <= i) {
            return hd1;
        }
        float[] m104170d = hd1.m104170d();
        int[] m104171c = hd1.m104171c();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] m99072e = m99072e(hd1.m104170d(), fArr);
        int length = m99072e.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = m99072e[i3];
            int binarySearch = Arrays.binarySearch(m104170d, f);
            int binarySearch2 = Arrays.binarySearch(fArr, f);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i3] = m99073d(f, m104171c[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i3] = m99074c(f, fArr2[binarySearch2], m104170d, m104171c);
            }
        }
        return new HD1(m99072e, iArr);
    }

    /* renamed from: c */
    public int m99074c(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f != fArr[0]) {
            for (int i = 1; i < fArr.length; i++) {
                float f3 = fArr[i];
                if (f3 >= f || i == fArr.length - 1) {
                    int i2 = i - 1;
                    float f4 = fArr[i2];
                    float f5 = (f - f4) / (f3 - f4);
                    int i3 = iArr[i];
                    int i4 = iArr[i2];
                    return Color.argb((int) (f2 * 255.0f), RA1.m87228c(f5, Color.red(i4), Color.red(i3)), RA1.m87228c(f5, Color.green(i4), Color.green(i3)), RA1.m87228c(f5, Color.blue(i4), Color.blue(i3)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    /* renamed from: d */
    public final int m99073d(float f, int i, float[] fArr, float[] fArr2) {
        float m15911i;
        if (fArr2.length >= 2 && f > fArr[0]) {
            for (int i2 = 1; i2 < fArr.length; i2++) {
                float f2 = fArr[i2];
                int i3 = (f2 > f ? 1 : (f2 == f ? 0 : -1));
                if (i3 >= 0 || i2 == fArr.length - 1) {
                    if (i3 <= 0) {
                        m15911i = fArr2[i2];
                    } else {
                        int i4 = i2 - 1;
                        float f3 = fArr[i4];
                        m15911i = C48077rU2.m15911i(fArr2[i4], fArr2[i2], (f - f3) / (f2 - f3));
                    }
                    return Color.argb((int) (m15911i * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // p000.InterfaceC34274Lj6
    /* renamed from: f */
    public HD1 mo2631a(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC39920dj2.mo2771b();
        }
        while (abstractC39920dj2.mo2767g()) {
            arrayList.add(Float.valueOf((float) abstractC39920dj2.mo2765k()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f19292a = 2;
        }
        if (z) {
            abstractC39920dj2.mo2769d();
        }
        if (this.f19292a == -1) {
            this.f19292a = arrayList.size() / 4;
        }
        int i = this.f19292a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f19292a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            iArr[i5] = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, i2, i3, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i3 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i2 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            }
        }
        return m99075b(new HD1(fArr, iArr), arrayList);
    }
}
