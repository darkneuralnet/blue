package com.stripe.android.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.stripe.android.view.ViewWidthAnimator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/view/ViewWidthAnimator;", "", "view", "Landroid/view/View;", "duration", "", "(Landroid/view/View;J)V", "animate", "", "startWidth", "", "endWidth", "onAnimationEnd", "Lkotlin/Function0;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nViewWidthAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewWidthAnimator.kt\ncom/stripe/android/view/ViewWidthAnimator\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,44:1\n315#2:45\n329#2,4:46\n316#2:50\n*S KotlinDebug\n*F\n+ 1 ViewWidthAnimator.kt\ncom/stripe/android/view/ViewWidthAnimator\n*L\n23#1:45\n23#1:46,4\n23#1:50\n*E\n"})
/* loaded from: classes7.dex */
public final class ViewWidthAnimator {
    private final long duration;
    private final View view;

    public ViewWidthAnimator(View view, long j) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.duration = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animate$lambda$2$lambda$1(ViewWidthAnimator this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        View view = this$0.view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = intValue;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void animate(int i, final int i2, final Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(this.duration);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ou6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewWidthAnimator.animate$lambda$2$lambda$1(ViewWidthAnimator.this, valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.stripe.android.view.ViewWidthAnimator$animate$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                View view;
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                view = ViewWidthAnimator.this.view;
                int i3 = i2;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i3;
                    view.setLayoutParams(layoutParams);
                    onAnimationEnd.invoke();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        });
        duration.start();
    }
}
