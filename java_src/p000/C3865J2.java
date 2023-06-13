package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0006"}, m28432d2 = {"Landroid/view/View;", "", "slidingFromY", "", C17296a.f69688o, "b", "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: J2 */
/* loaded from: classes4.dex */
public final class C3865J2 {

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"J2$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: J2$a */
    /* loaded from: classes4.dex */
    public static final class C3866a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f16672a;

        public C3866a(View view) {
            this.f16672a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            C49520tu6.m11239l(this.f16672a);
        }
    }

    /* renamed from: a */
    public static final void m101293a(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTranslationY(i - view.getHeight());
        view.setAlpha(1.0f);
        C49520tu6.m11233r(view);
        view.animate().setDuration(200L).translationY(i).setListener(null);
    }

    /* renamed from: b */
    public static final void m101292b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().setDuration(200L).translationY(view.getHeight() * (-1)).setListener(new C3866a(view));
    }
}
