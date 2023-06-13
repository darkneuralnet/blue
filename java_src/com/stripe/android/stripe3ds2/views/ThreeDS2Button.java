package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.button.MaterialButton;
import com.stripe.android.stripe3ds2.init.p048ui.ButtonCustomization;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "Lcom/google/android/material/button/MaterialButton;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "parseColor", "hexColor", "", "parseColor$3ds2sdk_release", "setButtonCustomization", "", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public class ThreeDS2Button extends MaterialButton {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ThreeDS2Button(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int parseColor$3ds2sdk_release(String hexColor) {
        Intrinsics.checkNotNullParameter(hexColor, "hexColor");
        return Color.parseColor(hexColor);
    }

    public final void setButtonCustomization(ButtonCustomization buttonCustomization) {
        boolean z;
        if (buttonCustomization == null) {
            return;
        }
        String textColor = buttonCustomization.getTextColor();
        if (textColor != null) {
            setTextColor(parseColor$3ds2sdk_release(textColor));
        }
        String backgroundColor = buttonCustomization.getBackgroundColor();
        if (backgroundColor != null) {
            setBackgroundTintList(ColorStateList.valueOf(parseColor$3ds2sdk_release(backgroundColor)));
        }
        Integer valueOf = Integer.valueOf(buttonCustomization.getCornerRadius());
        boolean z2 = true;
        if (valueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            setCornerRadius(valueOf.intValue());
        }
        Integer valueOf2 = Integer.valueOf(buttonCustomization.getTextFontSize());
        if (valueOf2.intValue() <= 0) {
            z2 = false;
        }
        if (z2) {
            num = valueOf2;
        }
        if (num != null) {
            setTextSize(2, num.intValue());
        }
        String textFontName = buttonCustomization.getTextFontName();
        if (textFontName != null) {
            setTypeface(Typeface.create(textFontName, 0));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ThreeDS2Button(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ThreeDS2Button(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ThreeDS2Button(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
