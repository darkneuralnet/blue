package p000;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
/* renamed from: Pj1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class animation.InterpolatorC35205Pj1 implements Interpolator {

    /* renamed from: a */
    public final Interpolator f28952a = new AccelerateInterpolator(5.0f);

    /* renamed from: b */
    public final Interpolator f28953b = new AccelerateInterpolator(1.0f);

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f < 0.3f) {
            return this.f28953b.getInterpolation(f);
        }
        return this.f28952a.getInterpolation(f);
    }
}
