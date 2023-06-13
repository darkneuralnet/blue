package p000;

import android.animation.ObjectAnimator;
import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0000H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0002¨\u0006\u0007"}, m28432d2 = {"Landroid/view/View;", "", "y", "Landroid/animation/ObjectAnimator;", "c", "b", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: OF2 */
/* loaded from: classes2.dex */
public final class OF2 {
    /* renamed from: a */
    public static final ObjectAnimator m92589a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(this, \"alpha\", 0f, 1f)");
        return ofFloat;
    }

    /* renamed from: b */
    public static final ObjectAnimator m92588b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(this, \"alpha\", 1f, 0f)");
        return ofFloat;
    }

    /* renamed from: c */
    public static final ObjectAnimator m92587c(View view, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(this, \"translationY\", y)");
        return ofFloat;
    }
}
