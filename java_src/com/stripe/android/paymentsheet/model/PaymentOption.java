package com.stripe.android.paymentsheet.model;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import co.bird.android.model.LegacyRepairType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BT\b\u0010\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\fB\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001f\u001a\u00020\u000bJ\t\u0010 \u001a\u00020\u0005HÖ\u0001R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R/\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tX\u0082\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentOption;", "", "drawableResourceId", "", "label", "", "lightThemeIconUrl", "darkThemeIconUrl", "imageLoader", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Landroid/graphics/drawable/Drawable;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "(ILjava/lang/String;)V", "<set-?>", "getDarkThemeIconUrl$paymentsheet_release", "()Ljava/lang/String;", "getDrawableResourceId$annotations", "()V", "getDrawableResourceId", "()I", "Lkotlin/jvm/functions/Function2;", "getLabel", "getLightThemeIconUrl$paymentsheet_release", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "icon", "toString", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentOption {
    public static final int $stable = 8;
    private String darkThemeIconUrl;
    private final int drawableResourceId;
    private Function2<? super PaymentOption, ? super Continuation<? super Drawable>, ? extends Object> imageLoader;
    private final String label;
    private String lightThemeIconUrl;

    @Deprecated(message = "Not intended for public use.")
    public PaymentOption(int i, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.drawableResourceId = i;
        this.label = label;
        this.imageLoader = new PaymentOption$imageLoader$1(null);
    }

    public static /* synthetic */ PaymentOption copy$default(PaymentOption paymentOption, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = paymentOption.drawableResourceId;
        }
        if ((i2 & 2) != 0) {
            str = paymentOption.label;
        }
        return paymentOption.copy(i, str);
    }

    @Deprecated(message = "Please use fetchIcon instead.")
    public static /* synthetic */ void getDrawableResourceId$annotations() {
    }

    public final int component1() {
        return this.drawableResourceId;
    }

    public final String component2() {
        return this.label;
    }

    public final PaymentOption copy(int i, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new PaymentOption(i, label);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentOption) {
            PaymentOption paymentOption = (PaymentOption) obj;
            return this.drawableResourceId == paymentOption.drawableResourceId && Intrinsics.areEqual(this.label, paymentOption.label);
        }
        return false;
    }

    public final String getDarkThemeIconUrl$paymentsheet_release() {
        return this.darkThemeIconUrl;
    }

    public final int getDrawableResourceId() {
        return this.drawableResourceId;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLightThemeIconUrl$paymentsheet_release() {
        return this.lightThemeIconUrl;
    }

    public int hashCode() {
        return (Integer.hashCode(this.drawableResourceId) * 31) + this.label.hashCode();
    }

    public final Drawable icon() {
        return new DelegateDrawable(new ShapeDrawable(), this.imageLoader, this);
    }

    public String toString() {
        int i = this.drawableResourceId;
        String str = this.label;
        return "PaymentOption(drawableResourceId=" + i + ", label=" + str + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentOption(int i, String label, String str, String str2, Function2<? super PaymentOption, ? super Continuation<? super Drawable>, ? extends Object> imageLoader) {
        this(i, label);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.lightThemeIconUrl = str;
        this.darkThemeIconUrl = str2;
        this.imageLoader = imageLoader;
    }
}
