package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ'\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/view/CardDisplayTextFactory;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "resources", "Landroid/content/res/Resources;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "(Landroid/content/res/Resources;Lcom/stripe/android/view/ThemeConfig;)V", "createStyled", "Landroid/text/SpannableString;", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "last4", "", "isSelected", "", "createStyled$payments_core_release", "createUnstyled", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "createUnstyled$payments_core_release", "setSpan", "", "displayString", "span", "Landroid/text/ParcelableSpan;", "start", "", "end", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CardDisplayTextFactory {
    private final Resources resources;
    private final ThemeConfig themeConfig;

    public CardDisplayTextFactory(Resources resources, ThemeConfig themeConfig) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(themeConfig, "themeConfig");
        this.resources = resources;
        this.themeConfig = themeConfig;
    }

    private final void setSpan(SpannableString spannableString, ParcelableSpan parcelableSpan, int i, int i2) {
        spannableString.setSpan(parcelableSpan, i, i2, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ SpannableString createStyled$payments_core_release(CardBrand brand, String str, boolean z) {
        boolean z2;
        int indexOf$default;
        int indexOf$default2;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(brand, "brand");
        String displayName = brand.getDisplayName();
        int length = displayName.length();
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z2 = false;
                if (!z2) {
                    SpannableString spannableString = new SpannableString(displayName);
                    setSpan(spannableString, new TypefaceSpan("sans-serif-medium"), 0, length);
                    return spannableString;
                }
                String string = this.resources.getString(C18606R.string.card_ending_in, displayName, str);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…ing_in, brandText, last4)");
                int length2 = string.length();
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, str, 0, false, 6, (Object) null);
                int length3 = str.length() + indexOf$default;
                indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) string, displayName, 0, false, 6, (Object) null);
                int length4 = displayName.length() + indexOf$default2;
                int textColor$payments_core_release = this.themeConfig.getTextColor$payments_core_release(z);
                int textAlphaColor$payments_core_release = this.themeConfig.getTextAlphaColor$payments_core_release(z);
                SpannableString spannableString2 = new SpannableString(string);
                setSpan(spannableString2, new ForegroundColorSpan(textAlphaColor$payments_core_release), 0, length2);
                setSpan(spannableString2, new TypefaceSpan("sans-serif-medium"), indexOf$default2, length4);
                setSpan(spannableString2, new ForegroundColorSpan(textColor$payments_core_release), indexOf$default2, length4);
                setSpan(spannableString2, new TypefaceSpan("sans-serif-medium"), indexOf$default, length3);
                setSpan(spannableString2, new ForegroundColorSpan(textColor$payments_core_release), indexOf$default, length3);
                return spannableString2;
            }
        }
        z2 = true;
        if (!z2) {
        }
    }

    public final /* synthetic */ String createUnstyled$payments_core_release(PaymentMethod.Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        String string = this.resources.getString(C18606R.string.card_ending_in, card.brand.getDisplayName(), card.last4);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …     card.last4\n        )");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CardDisplayTextFactory(Context context) {
        this(r0, new ThemeConfig(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
    }
}
