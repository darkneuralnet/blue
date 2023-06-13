package com.stripe.android.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.databinding.CardBrandViewBinding;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
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
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020,H\u0002R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R+\u0010 \u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001e\u0010$\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/view/CardBrandView;", "Landroid/widget/FrameLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lcom/stripe/android/model/CardBrand;", AccountRangeJsonParser.FIELD_BRAND, "getBrand", "()Lcom/stripe/android/model/CardBrand;", "setBrand", "(Lcom/stripe/android/model/CardBrand;)V", "brand$delegate", "Lkotlin/properties/ReadWriteProperty;", "iconView", "Landroid/widget/ImageView;", "", "isLoading", "()Z", "setLoading", "(Z)V", "isLoading$delegate", "progressView", "Lcom/stripe/android/view/CardWidgetProgressView;", "shouldShowCvc", "getShouldShowCvc", "setShouldShowCvc", "shouldShowCvc$delegate", "shouldShowErrorIcon", "getShouldShowErrorIcon", "setShouldShowErrorIcon", "shouldShowErrorIcon$delegate", "tintColorInt", "getTintColorInt$payments_core_release", "()I", "setTintColorInt$payments_core_release", "(I)V", "viewBinding", "Lcom/stripe/android/databinding/CardBrandViewBinding;", "applyTint", "", "renderBrandIcon", "updateIcon", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardBrandView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardBrandView.kt\ncom/stripe/android/view/CardBrandView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,112:1\n33#2,3:113\n33#2,3:116\n33#2,3:119\n33#2,3:122\n40#3:125\n56#3:126\n*S KotlinDebug\n*F\n+ 1 CardBrandView.kt\ncom/stripe/android/view/CardBrandView\n*L\n29#1:113,3\n43#1:116,3\n51#1:119,3\n59#1:122,3\n71#1:125\n71#1:126\n*E\n"})
/* loaded from: classes7.dex */
public final class CardBrandView extends FrameLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardBrandView.class, "isLoading", "isLoading()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardBrandView.class, AccountRangeJsonParser.FIELD_BRAND, "getBrand()Lcom/stripe/android/model/CardBrand;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardBrandView.class, "shouldShowCvc", "getShouldShowCvc()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardBrandView.class, "shouldShowErrorIcon", "getShouldShowErrorIcon()Z", 0))};
    private final ReadWriteProperty brand$delegate;
    private final ImageView iconView;
    private final ReadWriteProperty isLoading$delegate;
    private final CardWidgetProgressView progressView;
    private final ReadWriteProperty shouldShowCvc$delegate;
    private final ReadWriteProperty shouldShowErrorIcon$delegate;
    private int tintColorInt;
    private final CardBrandViewBinding viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardBrandView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyTint() {
        ImageView imageView = this.iconView;
        Drawable m90834r = P61.m90834r(imageView.getDrawable());
        P61.m90838n(m90834r.mutate(), this.tintColorInt);
        imageView.setImageDrawable(P61.m90835q(m90834r));
    }

    private final void renderBrandIcon() {
        this.iconView.setImageResource(getBrand().getIcon());
        if (getBrand() == CardBrand.Unknown) {
            applyTint();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIcon() {
        if (isLoading()) {
            renderBrandIcon();
        } else if (getShouldShowErrorIcon()) {
            this.iconView.setImageResource(getBrand().getErrorIcon());
        } else if (getShouldShowCvc()) {
            this.iconView.setImageResource(getBrand().getCvcIcon());
            applyTint();
        } else {
            renderBrandIcon();
        }
    }

    public final CardBrand getBrand() {
        return (CardBrand) this.brand$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final boolean getShouldShowCvc() {
        return ((Boolean) this.shouldShowCvc$delegate.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getShouldShowErrorIcon() {
        return ((Boolean) this.shouldShowErrorIcon$delegate.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final int getTintColorInt$payments_core_release() {
        return this.tintColorInt;
    }

    public final boolean isLoading() {
        return ((Boolean) this.isLoading$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setBrand(CardBrand cardBrand) {
        Intrinsics.checkNotNullParameter(cardBrand, "<set-?>");
        this.brand$delegate.setValue(this, $$delegatedProperties[1], cardBrand);
    }

    public final void setLoading(boolean z) {
        this.isLoading$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setShouldShowCvc(boolean z) {
        this.shouldShowCvc$delegate.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setShouldShowErrorIcon(boolean z) {
        this.shouldShowErrorIcon$delegate.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setTintColorInt$payments_core_release(int i) {
        this.tintColorInt = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardBrandView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardBrandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        CardBrandViewBinding inflate = CardBrandViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        ImageView imageView = inflate.icon;
        Intrinsics.checkNotNullExpressionValue(imageView, "viewBinding.icon");
        this.iconView = imageView;
        CardWidgetProgressView cardWidgetProgressView = inflate.progress;
        Intrinsics.checkNotNullExpressionValue(cardWidgetProgressView, "viewBinding.progress");
        this.progressView = cardWidgetProgressView;
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.isLoading$delegate = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.CardBrandView$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean bool2, Boolean bool3) {
                CardWidgetProgressView cardWidgetProgressView2;
                CardWidgetProgressView cardWidgetProgressView3;
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = bool3.booleanValue();
                if (bool2.booleanValue() != booleanValue) {
                    this.updateIcon();
                    if (booleanValue) {
                        cardWidgetProgressView3 = this.progressView;
                        cardWidgetProgressView3.show();
                        return;
                    }
                    cardWidgetProgressView2 = this.progressView;
                    cardWidgetProgressView2.hide();
                }
            }
        };
        final CardBrand cardBrand = CardBrand.Unknown;
        this.brand$delegate = new ObservableProperty<CardBrand>(cardBrand) { // from class: com.stripe.android.view.CardBrandView$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, CardBrand cardBrand2, CardBrand cardBrand3) {
                Intrinsics.checkNotNullParameter(property, "property");
                if (cardBrand2 != cardBrand3) {
                    this.updateIcon();
                }
            }
        };
        this.shouldShowCvc$delegate = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.CardBrandView$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean bool2, Boolean bool3) {
                Intrinsics.checkNotNullParameter(property, "property");
                if (bool2.booleanValue() != bool3.booleanValue()) {
                    this.updateIcon();
                }
            }
        };
        this.shouldShowErrorIcon$delegate = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.CardBrandView$special$$inlined$observable$4
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean bool2, Boolean bool3) {
                Intrinsics.checkNotNullParameter(property, "property");
                if (bool2.booleanValue() != bool3.booleanValue()) {
                    this.updateIcon();
                }
            }
        };
        setClickable(false);
        setFocusable(false);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CardBrandView$special$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                CardBrandView.this.updateIcon();
            }
        });
    }
}
