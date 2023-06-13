package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import com.stripe.android.databinding.CardWidgetProgressViewBinding;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0014J\u0006\u0010\u0010\u001a\u00020\u000eR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/view/CardWidgetProgressView;", "Landroid/widget/FrameLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fadeIn", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "fadeOut", "hide", "", "onAttachedToWindow", "show", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardWidgetProgressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardWidgetProgressView.kt\ncom/stripe/android/view/CardWidgetProgressView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,88:1\n283#2,2:89\n315#2:91\n329#2,4:92\n316#2:96\n*S KotlinDebug\n*F\n+ 1 CardWidgetProgressView.kt\ncom/stripe/android/view/CardWidgetProgressView\n*L\n67#1:89,2\n74#1:91\n74#1:92,4\n74#1:96\n*E\n"})
/* loaded from: classes7.dex */
public final class CardWidgetProgressView extends FrameLayout {
    private final Animation fadeIn;
    private final Animation fadeOut;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardWidgetProgressView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void hide() {
        startAnimation(this.fadeOut);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C18606R.dimen.stripe_card_widget_progress_size);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void show() {
        startAnimation(this.fadeIn);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardWidgetProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardWidgetProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardWidgetProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C18606R.anim.stripe_card_widget_progress_fade_in);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.view.CardWidgetProgressView$fadeIn$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                CardWidgetProgressView.this.setVisibility(0);
            }
        });
        this.fadeIn = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, C18606R.anim.stripe_card_widget_progress_fade_out);
        loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.view.CardWidgetProgressView$fadeOut$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                CardWidgetProgressView.this.setVisibility(4);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                CardWidgetProgressView.this.setVisibility(0);
            }
        });
        this.fadeOut = loadAnimation2;
        CardWidgetProgressViewBinding.inflate(LayoutInflater.from(context), this);
        setBackgroundResource(C18606R.C18607drawable.stripe_card_progress_background);
        setClipToOutline(true);
        setVisibility(4);
    }
}
