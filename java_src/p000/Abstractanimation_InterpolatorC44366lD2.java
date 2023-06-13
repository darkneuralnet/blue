package p000;

import android.view.animation.Interpolator;
/* renamed from: lD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class Abstractanimation.InterpolatorC44366lD2 implements Interpolator {

    /* renamed from: a */
    public final float[] f95723a;

    /* renamed from: b */
    public final float f95724b;

    public Abstractanimation.InterpolatorC44366lD2(float[] fArr) {
        this.f95723a = fArr;
        this.f95724b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f95723a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f95724b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f95723a;
        float f4 = fArr2[min];
        return f4 + (f3 * (fArr2[min + 1] - f4));
    }
}
