package p000;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000f"}, m28432d2 = {"", "fromY", "toY", "", "duration", "", "accelerate", "Landroid/view/animation/Animation;", C17296a.f69688o, "animation", "b", "Landroid/view/animation/Interpolator;", "Landroid/view/animation/Interpolator;", "accelerateInterpolator", "decelerateInterpolator", "android-sdk-ui_release"}, m28431k = 2, m28430mv = {1, 6, 0})
@JvmName(name = "AnimationUtils")
/* renamed from: qf */
/* loaded from: classes5.dex */
public final class C27648qf {

    /* renamed from: a */
    public static final Interpolator f105577a = new AccelerateInterpolator();

    /* renamed from: b */
    public static final Interpolator f105578b = new DecelerateInterpolator();

    /* renamed from: a */
    public static final Animation m17270a(float f, float f2, long j, boolean z) {
        return m17269b(new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, f, 1, f2), j, z);
    }

    /* renamed from: b */
    public static final Animation m17269b(Animation animation, long j, boolean z) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        animation.setDuration(j);
        if (z) {
            animation.setInterpolator(f105577a);
        } else {
            animation.setInterpolator(f105578b);
        }
        return animation;
    }
}
