package p000;

import android.view.animation.Interpolator;
/* renamed from: KL1 */
/* loaded from: classes4.dex */
public class KL1 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = (f * 2.0f) - 1.0f;
        return ((f2 * f2 * f2) + 1.0f) * 0.5f;
    }
}
