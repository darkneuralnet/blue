package com.stripe.android.uicore;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/uicore/StripeTheme;", "", "()V", "colorsDarkMutable", "Lcom/stripe/android/uicore/StripeColors;", "getColorsDarkMutable", "()Lcom/stripe/android/uicore/StripeColors;", "setColorsDarkMutable", "(Lcom/stripe/android/uicore/StripeColors;)V", "colorsLightMutable", "getColorsLightMutable", "setColorsLightMutable", "minContrastForWhite", "", "primaryButtonStyle", "Lcom/stripe/android/uicore/PrimaryButtonStyle;", "getPrimaryButtonStyle", "()Lcom/stripe/android/uicore/PrimaryButtonStyle;", "setPrimaryButtonStyle", "(Lcom/stripe/android/uicore/PrimaryButtonStyle;)V", "shapesMutable", "Lcom/stripe/android/uicore/StripeShapes;", "getShapesMutable", "()Lcom/stripe/android/uicore/StripeShapes;", "setShapesMutable", "(Lcom/stripe/android/uicore/StripeShapes;)V", "typographyMutable", "Lcom/stripe/android/uicore/StripeTypography;", "getTypographyMutable", "()Lcom/stripe/android/uicore/StripeTypography;", "setTypographyMutable", "(Lcom/stripe/android/uicore/StripeTypography;)V", "getColors", "isDark", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeTheme {
    public static final int $stable;
    public static final StripeTheme INSTANCE = new StripeTheme();
    private static StripeColors colorsDarkMutable = null;
    private static StripeColors colorsLightMutable = null;
    public static final double minContrastForWhite = 2.2d;
    private static PrimaryButtonStyle primaryButtonStyle;
    private static StripeShapes shapesMutable;
    private static StripeTypography typographyMutable;

    static {
        StripeThemeDefaults stripeThemeDefaults = StripeThemeDefaults.INSTANCE;
        colorsDarkMutable = stripeThemeDefaults.getColorsDark();
        colorsLightMutable = stripeThemeDefaults.getColorsLight();
        shapesMutable = stripeThemeDefaults.getShapes();
        typographyMutable = stripeThemeDefaults.getTypography();
        primaryButtonStyle = stripeThemeDefaults.getPrimaryButtonStyle();
        $stable = 8;
    }

    private StripeTheme() {
    }

    public final StripeColors getColors(boolean z) {
        return z ? colorsDarkMutable : colorsLightMutable;
    }

    public final StripeColors getColorsDarkMutable() {
        return colorsDarkMutable;
    }

    public final StripeColors getColorsLightMutable() {
        return colorsLightMutable;
    }

    public final PrimaryButtonStyle getPrimaryButtonStyle() {
        return primaryButtonStyle;
    }

    public final StripeShapes getShapesMutable() {
        return shapesMutable;
    }

    public final StripeTypography getTypographyMutable() {
        return typographyMutable;
    }

    public final void setColorsDarkMutable(StripeColors stripeColors) {
        Intrinsics.checkNotNullParameter(stripeColors, "<set-?>");
        colorsDarkMutable = stripeColors;
    }

    public final void setColorsLightMutable(StripeColors stripeColors) {
        Intrinsics.checkNotNullParameter(stripeColors, "<set-?>");
        colorsLightMutable = stripeColors;
    }

    public final void setPrimaryButtonStyle(PrimaryButtonStyle primaryButtonStyle2) {
        Intrinsics.checkNotNullParameter(primaryButtonStyle2, "<set-?>");
        primaryButtonStyle = primaryButtonStyle2;
    }

    public final void setShapesMutable(StripeShapes stripeShapes) {
        Intrinsics.checkNotNullParameter(stripeShapes, "<set-?>");
        shapesMutable = stripeShapes;
    }

    public final void setTypographyMutable(StripeTypography stripeTypography) {
        Intrinsics.checkNotNullParameter(stripeTypography, "<set-?>");
        typographyMutable = stripeTypography;
    }
}
