package com.stripe.android.paymentsheet.p047ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.C19159R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002J+\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0000¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0012J&\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "slideAnimationDuration", "", "delay", "", "view", "Landroid/view/View;", "onAnimationEnd", "Lkotlin/Function0;", "fadeIn", "parentWidth", "", "fadeIn$paymentsheet_release", "fadeOut", "fadeOut$paymentsheet_release", "slideToCenter", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPrimaryButtonAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonAnimator.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,119:1\n32#2:120\n95#2,14:121\n32#2:135\n95#2,14:136\n*S KotlinDebug\n*F\n+ 1 PrimaryButtonAnimator.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator\n*L\n66#1:120\n66#1:121,14\n84#1:135\n84#1:136,14\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator */
/* loaded from: classes7.dex */
public final class PrimaryButtonAnimator {
    public static final Companion Companion = new Companion(null);
    public static final long HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION = 1500;
    private final Context context;
    private final long slideAnimationDuration;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator$Companion;", "", "()V", "HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PrimaryButtonAnimator(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.slideAnimationDuration = context.getResources().getInteger(17694720);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delay(View view, final Function0<Unit> function0) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 0.0f);
        animator.setDuration(HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION);
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        animator.addListener(new Animator.AnimatorListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$delay$lambda$4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                Intrinsics.checkNotNullParameter(animator2, "animator");
                Function0.this.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                Intrinsics.checkNotNullParameter(animator2, "animator");
            }
        });
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void slideToCenter(final View view, int i, final Function0<Unit> function0) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((view.getLeft() + ((view.getRight() - view.getLeft()) / 2.0f)) - (i / 2.0f)));
        animator.setDuration(this.slideAnimationDuration);
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        animator.addListener(new Animator.AnimatorListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$slideToCenter$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                Intrinsics.checkNotNullParameter(animator2, "animator");
                PrimaryButtonAnimator.this.delay(view, function0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                Intrinsics.checkNotNullParameter(animator2, "animator");
            }
        });
        animator.start();
    }

    public final void fadeIn$paymentsheet_release(final View view, final int i, final Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.context, C19159R.anim.stripe_paymentsheet_transition_fade_in);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$fadeIn$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(0);
                this.slideToCenter(view, i, onAnimationEnd);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(loadAnimation);
    }

    public final void fadeOut$paymentsheet_release(final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.context, C19159R.anim.stripe_paymentsheet_transition_fade_out);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$fadeOut$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(4);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(loadAnimation);
    }
}
