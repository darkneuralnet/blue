package p000;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
/* renamed from: ZX3 */
/* loaded from: classes4.dex */
public final class ZX3 {

    /* renamed from: a */
    public static final Interpolator f48723a = new LinearInterpolator();

    /* renamed from: b */
    public static final Interpolator f48724b = new OvershootInterpolator();

    /* renamed from: c */
    public static final Interpolator f48725c = new DecelerateInterpolator();

    /* renamed from: d */
    public static final Interpolator f48726d = new AccelerateInterpolator();

    /* renamed from: e */
    public static final Interpolator f48727e = new AccelerateDecelerateInterpolator();

    /* renamed from: f */
    public static final Interpolator f48728f = new KL1();

    /* renamed from: g */
    public static final Interpolator f48729g = new animation.InterpolatorC35205Pj1();

    /* renamed from: h */
    public static final Interpolator f48730h = new Z91();

    private ZX3() {
        throw new UnsupportedOperationException();
    }
}
