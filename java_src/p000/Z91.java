package p000;

import android.view.animation.Interpolator;
/* renamed from: Z91 */
/* loaded from: classes4.dex */
public class Z91 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        return (((float) Math.pow(2.0d, (-10.0f) * f)) * 1.0f * ((float) Math.sin((((f * 1.0f) - 0.075f) * 6.2831855f) / 0.3f))) + 1.0f;
    }
}
