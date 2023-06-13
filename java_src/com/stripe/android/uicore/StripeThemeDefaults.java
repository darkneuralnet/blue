package com.stripe.android.uicore;

import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import kotlin.Metadata;
import p000.C33918Jw1;
import p000.C47063pm0;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/uicore/StripeThemeDefaults;", "", "()V", PaymentSheetEvent.FIELD_COLORS_DARK, "Lcom/stripe/android/uicore/StripeColors;", "getColorsDark", "()Lcom/stripe/android/uicore/StripeColors;", PaymentSheetEvent.FIELD_COLORS_LIGHT, "getColorsLight", "primaryButtonStyle", "Lcom/stripe/android/uicore/PrimaryButtonStyle;", "getPrimaryButtonStyle", "()Lcom/stripe/android/uicore/PrimaryButtonStyle;", "shapes", "Lcom/stripe/android/uicore/StripeShapes;", "getShapes", "()Lcom/stripe/android/uicore/StripeShapes;", "typography", "Lcom/stripe/android/uicore/StripeTypography;", "getTypography", "()Lcom/stripe/android/uicore/StripeTypography;", "colors", "isDark", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeThemeDefaults {
    public static final int $stable = 0;
    public static final StripeThemeDefaults INSTANCE;
    private static final StripeColors colorsDark;
    private static final StripeColors colorsLight;
    private static final PrimaryButtonStyle primaryButtonStyle;
    private static final StripeShapes shapes;
    private static final StripeTypography typography;

    static {
        StripeThemeDefaults stripeThemeDefaults = new StripeThemeDefaults();
        INSTANCE = stripeThemeDefaults;
        C47063pm0.C27386a c27386a = C47063pm0.f104050b;
        colorsLight = new StripeColors(c27386a.m18725h(), C50619vm0.m8179b(863533184), C50619vm0.m8179b(863533184), c27386a.m18732a(), C50619vm0.m8178c(2566914048L), c27386a.m18732a(), C50619vm0.m8178c(2570861635L), C50619vm0.m8178c(2566914048L), C34763Nm0.m93462h(C50619vm0.m8178c(4278221567L), 0L, 0L, 0L, 0L, c27386a.m18725h(), c27386a.m18728e(), 0L, 0L, 0L, c27386a.m18732a(), 0L, 2974, null), null);
        colorsDark = new StripeColors(c27386a.m18730c(), C50619vm0.m8178c(4286085248L), C50619vm0.m8178c(4286085248L), c27386a.m18725h(), C50619vm0.m8178c(2583691263L), c27386a.m18725h(), C50619vm0.m8179b(1644167167), c27386a.m18725h(), C34763Nm0.m93466d(C50619vm0.m8178c(4278219988L), 0L, 0L, 0L, 0L, C50619vm0.m8178c(4281216558L), c27386a.m18728e(), 0L, 0L, 0L, c27386a.m18725h(), 0L, 2974, null), null);
        StripeShapes stripeShapes = new StripeShapes(6.0f, 1.0f, 2.0f);
        shapes = stripeShapes;
        C33918Jw1.C4281a c4281a = C33918Jw1.f18784c;
        StripeTypography stripeTypography = new StripeTypography(c4281a.m99540d().m99544k(), c4281a.m99541c().m99544k(), c4281a.m99543a().m99544k(), 1.0f, N26.m94414f(9), N26.m94414f(12), N26.m94414f(13), N26.m94414f(14), N26.m94414f(16), N26.m94414f(20), null, null, null, null, null, null, null, null, 260096, null);
        typography = stripeTypography;
        primaryButtonStyle = new PrimaryButtonStyle(new PrimaryButtonColors(stripeThemeDefaults.colors(false).getMaterialColors().m94900j(), c27386a.m18725h(), c27386a.m18727f(), null), new PrimaryButtonColors(stripeThemeDefaults.colors(true).getMaterialColors().m94900j(), c27386a.m18725h(), c27386a.m18727f(), null), new PrimaryButtonShape(stripeShapes.getCornerRadius(), 0.0f), new PrimaryButtonTypography(stripeTypography.getFontFamily(), stripeTypography.m116722getLargeFontSizeXSAIIZE(), null));
    }

    private StripeThemeDefaults() {
    }

    public final StripeColors colors(boolean z) {
        return z ? colorsDark : colorsLight;
    }

    public final StripeColors getColorsDark() {
        return colorsDark;
    }

    public final StripeColors getColorsLight() {
        return colorsLight;
    }

    public final PrimaryButtonStyle getPrimaryButtonStyle() {
        return primaryButtonStyle;
    }

    public final StripeShapes getShapes() {
        return shapes;
    }

    public final StripeTypography getTypography() {
        return typography;
    }
}
