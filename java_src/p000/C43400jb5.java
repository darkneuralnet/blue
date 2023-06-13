package p000;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0007"}, m28432d2 = {"Landroid/widget/TextView;", "", C17296a.f69688o, "c", "", "visible", "b", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: jb5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43400jb5 {
    /* renamed from: a */
    public static final void m30213a(TextView textView) {
        textView.setGravity(1);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(3);
        layoutParams2.addRule(2, C36585Vg4.indicator);
        textView.setLayoutParams(layoutParams2);
    }

    /* renamed from: b */
    public static final void m30212b(TextView textView, boolean z) {
        if (z) {
            float dimension = textView.getResources().getDimension(C37044Xf4.rider_tutorial_body_shadow_dxdy);
            textView.setShadowLayer(textView.getResources().getDimension(C37044Xf4.rider_tutorial_body_shadow_radius), dimension, dimension, NA0.m94301c(textView.getContext(), C32364Df4.rider_tutorial_body_shadow));
            return;
        }
        textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    /* renamed from: c */
    public static final void m30211c(TextView textView) {
        textView.setGravity(8388611);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(2);
        layoutParams2.addRule(3, C36585Vg4.tutorialStepSubtitle);
        textView.setLayoutParams(layoutParams2);
    }
}
