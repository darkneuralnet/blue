package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.C18606R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/view/CardNumberTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "isLoading", "isLoading$payments_core_release", "()Z", "setLoading$payments_core_release", "(Z)V", "isLoading$delegate", "Lkotlin/properties/ReadWriteProperty;", "progressView", "Lcom/stripe/android/view/CardWidgetProgressView;", "attachProgressView", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardNumberTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberTextInputLayout.kt\ncom/stripe/android/view/CardNumberTextInputLayout\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,66:1\n33#2,3:67\n40#3:70\n56#3:71\n329#3,4:72\n*S KotlinDebug\n*F\n+ 1 CardNumberTextInputLayout.kt\ncom/stripe/android/view/CardNumberTextInputLayout\n*L\n26#1:67,3\n39#1:70\n39#1:71\n55#1:72,4\n*E\n"})
/* loaded from: classes7.dex */
public final class CardNumberTextInputLayout extends TextInputLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardNumberTextInputLayout.class, "isLoading", "isLoading$payments_core_release()Z", 0))};
    public static final int $stable = 8;
    private final ReadWriteProperty isLoading$delegate;
    private final CardWidgetProgressView progressView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardNumberTextInputLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachProgressView() {
        ViewGroup viewGroup;
        Object first;
        ViewParent parent = this.progressView.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(this.progressView);
        }
        first = SequencesKt___SequencesKt.first(C41782gr6.m37379b(this));
        Intrinsics.checkNotNull(first, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) first;
        frameLayout.addView(this.progressView);
        CardWidgetProgressView cardWidgetProgressView = this.progressView;
        ViewGroup.LayoutParams layoutParams = cardWidgetProgressView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(frameLayout.getWidth() - getResources().getDimensionPixelSize(C18606R.dimen.stripe_card_number_text_input_layout_progress_end_margin));
            layoutParams2.topMargin = getResources().getDimensionPixelSize(C18606R.dimen.stripe_card_number_text_input_layout_progress_top_margin);
            cardWidgetProgressView.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final boolean isLoading$payments_core_release() {
        return ((Boolean) this.isLoading$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setLoading$payments_core_release(boolean z) {
        this.isLoading$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C18606R.attr.textInputStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.progressView = new CardWidgetProgressView(context, attributeSet, i);
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.isLoading$delegate = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.CardNumberTextInputLayout$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean bool2, Boolean bool3) {
                CardWidgetProgressView cardWidgetProgressView;
                CardWidgetProgressView cardWidgetProgressView2;
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = bool3.booleanValue();
                if (bool2.booleanValue() != booleanValue) {
                    if (booleanValue) {
                        cardWidgetProgressView2 = this.progressView;
                        cardWidgetProgressView2.show();
                        return;
                    }
                    cardWidgetProgressView = this.progressView;
                    cardWidgetProgressView.hide();
                }
            }
        };
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CardNumberTextInputLayout$special$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                CardNumberTextInputLayout.this.attachProgressView();
            }
        });
        setPlaceholderText(getResources().getString(C18606R.string.card_number_hint));
    }
}
