package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* renamed from: rf */
/* loaded from: classes.dex */
public class C27968rf {
    private C27968rf() {
    }

    /* renamed from: a */
    public static Interpolator m15613a(Context context, int i) throws Resources.NotFoundException {
        return AnimationUtils.loadInterpolator(context, i);
    }
}
