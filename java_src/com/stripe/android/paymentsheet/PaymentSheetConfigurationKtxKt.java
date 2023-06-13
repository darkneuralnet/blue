package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.uicore.PrimaryButtonColors;
import com.stripe.android.uicore.PrimaryButtonShape;
import com.stripe.android.uicore.PrimaryButtonStyle;
import com.stripe.android.uicore.PrimaryButtonTypography;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeShapes;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeTypography;
import java.security.InvalidParameterException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000¨\u0006\u0005"}, m28432d2 = {"parseAppearance", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "validate", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentSheetConfigurationKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetConfigurationKtx.kt\ncom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,104:1\n141#2,2:105\n*S KotlinDebug\n*F\n+ 1 PaymentSheetConfigurationKtx.kt\ncom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt\n*L\n100#1:105,2\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentSheetConfigurationKtxKt {
    public static final void parseAppearance(PaymentSheet.Appearance appearance) {
        StripeColors m116693copyKvvhxLA;
        StripeColors m116693copyKvvhxLA2;
        StripeTypography m116721copyBZCqYng;
        long m94411i;
        Intrinsics.checkNotNullParameter(appearance, "<this>");
        StripeTheme stripeTheme = StripeTheme.INSTANCE;
        StripeThemeDefaults stripeThemeDefaults = StripeThemeDefaults.INSTANCE;
        m116693copyKvvhxLA = r3.m116693copyKvvhxLA((r34 & 1) != 0 ? r3.component : C50619vm0.m8179b(appearance.getColorsLight().getComponent()), (r34 & 2) != 0 ? r3.componentBorder : C50619vm0.m8179b(appearance.getColorsLight().getComponentBorder()), (r34 & 4) != 0 ? r3.componentDivider : C50619vm0.m8179b(appearance.getColorsLight().getComponentDivider()), (r34 & 8) != 0 ? r3.onComponent : C50619vm0.m8179b(appearance.getColorsLight().getOnComponent()), (r34 & 16) != 0 ? r3.subtitle : C50619vm0.m8179b(appearance.getColorsLight().getSubtitle()), (r34 & 32) != 0 ? r3.textCursor : 0L, (r34 & 64) != 0 ? r3.placeholderText : C50619vm0.m8179b(appearance.getColorsLight().getPlaceholderText()), (r34 & 128) != 0 ? r3.appBarIcon : C50619vm0.m8179b(appearance.getColorsLight().getAppBarIcon()), (r34 & 256) != 0 ? stripeThemeDefaults.getColorsLight().materialColors : C34763Nm0.m93462h(C50619vm0.m8179b(appearance.getColorsLight().getPrimary()), 0L, 0L, 0L, 0L, C50619vm0.m8179b(appearance.getColorsLight().getSurface()), C50619vm0.m8179b(appearance.getColorsLight().getError()), 0L, 0L, 0L, C50619vm0.m8179b(appearance.getColorsLight().getOnSurface()), 0L, 2974, null));
        stripeTheme.setColorsLightMutable(m116693copyKvvhxLA);
        m116693copyKvvhxLA2 = r4.m116693copyKvvhxLA((r34 & 1) != 0 ? r4.component : C50619vm0.m8179b(appearance.getColorsDark().getComponent()), (r34 & 2) != 0 ? r4.componentBorder : C50619vm0.m8179b(appearance.getColorsDark().getComponentBorder()), (r34 & 4) != 0 ? r4.componentDivider : C50619vm0.m8179b(appearance.getColorsDark().getComponentDivider()), (r34 & 8) != 0 ? r4.onComponent : C50619vm0.m8179b(appearance.getColorsDark().getOnComponent()), (r34 & 16) != 0 ? r4.subtitle : C50619vm0.m8179b(appearance.getColorsDark().getSubtitle()), (r34 & 32) != 0 ? r4.textCursor : 0L, (r34 & 64) != 0 ? r4.placeholderText : C50619vm0.m8179b(appearance.getColorsDark().getPlaceholderText()), (r34 & 128) != 0 ? r4.appBarIcon : C50619vm0.m8179b(appearance.getColorsDark().getAppBarIcon()), (r34 & 256) != 0 ? stripeThemeDefaults.getColorsDark().materialColors : C34763Nm0.m93466d(C50619vm0.m8179b(appearance.getColorsDark().getPrimary()), 0L, 0L, 0L, 0L, C50619vm0.m8179b(appearance.getColorsDark().getSurface()), C50619vm0.m8179b(appearance.getColorsDark().getError()), 0L, 0L, 0L, C50619vm0.m8179b(appearance.getColorsDark().getOnSurface()), 0L, 2974, null));
        stripeTheme.setColorsDarkMutable(m116693copyKvvhxLA2);
        stripeTheme.setShapesMutable(StripeShapes.copy$default(stripeThemeDefaults.getShapes(), appearance.getShapes().getCornerRadiusDp(), appearance.getShapes().getBorderStrokeWidthDp(), 0.0f, 4, null));
        m116721copyBZCqYng = r4.m116721copyBZCqYng((r42 & 1) != 0 ? r4.fontWeightNormal : 0, (r42 & 2) != 0 ? r4.fontWeightMedium : 0, (r42 & 4) != 0 ? r4.fontWeightBold : 0, (r42 & 8) != 0 ? r4.fontSizeMultiplier : appearance.getTypography().getSizeScaleFactor(), (r42 & 16) != 0 ? r4.xxSmallFontSize : 0L, (r42 & 32) != 0 ? r4.xSmallFontSize : 0L, (r42 & 64) != 0 ? r4.smallFontSize : 0L, (r42 & 128) != 0 ? r4.mediumFontSize : 0L, (r42 & 256) != 0 ? r4.largeFontSize : 0L, (r42 & 512) != 0 ? r4.xLargeFontSize : 0L, (r42 & 1024) != 0 ? r4.fontFamily : appearance.getTypography().getFontResId(), (r42 & 2048) != 0 ? r4.body1FontFamily : null, (r42 & 4096) != 0 ? r4.body2FontFamily : null, (r42 & 8192) != 0 ? r4.h4FontFamily : null, (r42 & 16384) != 0 ? r4.h5FontFamily : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r4.h6FontFamily : null, (r42 & 65536) != 0 ? r4.subtitle1FontFamily : null, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? stripeThemeDefaults.getTypography().captionFontFamily : null);
        stripeTheme.setTypographyMutable(m116721copyBZCqYng);
        PrimaryButtonStyle primaryButtonStyle = stripeThemeDefaults.getPrimaryButtonStyle();
        Integer background = appearance.getPrimaryButton().getColorsLight().getBackground();
        PrimaryButtonColors primaryButtonColors = new PrimaryButtonColors(C50619vm0.m8179b(background != null ? background.intValue() : appearance.getColorsLight().getPrimary()), C50619vm0.m8179b(appearance.getPrimaryButton().getColorsLight().getOnBackground()), C50619vm0.m8179b(appearance.getPrimaryButton().getColorsLight().getBorder()), null);
        Integer background2 = appearance.getPrimaryButton().getColorsDark().getBackground();
        PrimaryButtonColors primaryButtonColors2 = new PrimaryButtonColors(C50619vm0.m8179b(background2 != null ? background2.intValue() : appearance.getColorsDark().getPrimary()), C50619vm0.m8179b(appearance.getPrimaryButton().getColorsDark().getOnBackground()), C50619vm0.m8179b(appearance.getPrimaryButton().getColorsDark().getBorder()), null);
        Float cornerRadiusDp = appearance.getPrimaryButton().getShape().getCornerRadiusDp();
        float floatValue = cornerRadiusDp != null ? cornerRadiusDp.floatValue() : appearance.getShapes().getCornerRadiusDp();
        Float borderStrokeWidthDp = appearance.getPrimaryButton().getShape().getBorderStrokeWidthDp();
        PrimaryButtonShape primaryButtonShape = new PrimaryButtonShape(floatValue, borderStrokeWidthDp != null ? borderStrokeWidthDp.floatValue() : appearance.getShapes().getBorderStrokeWidthDp());
        Integer fontResId = appearance.getPrimaryButton().getTypography().getFontResId();
        if (fontResId == null) {
            fontResId = appearance.getTypography().getFontResId();
        }
        Float fontSizeSp = appearance.getPrimaryButton().getTypography().getFontSizeSp();
        if (fontSizeSp != null) {
            m94411i = N26.m94415e(fontSizeSp.floatValue());
        } else {
            long m116722getLargeFontSizeXSAIIZE = stripeThemeDefaults.getTypography().m116722getLargeFontSizeXSAIIZE();
            float sizeScaleFactor = appearance.getTypography().getSizeScaleFactor();
            N26.m94418b(m116722getLargeFontSizeXSAIIZE);
            m94411i = N26.m94411i(M26.m95974f(m116722getLargeFontSizeXSAIIZE), M26.m95972h(m116722getLargeFontSizeXSAIIZE) * sizeScaleFactor);
        }
        stripeTheme.setPrimaryButtonStyle(primaryButtonStyle.copy(primaryButtonColors, primaryButtonColors2, primaryButtonShape, new PrimaryButtonTypography(fontResId, m94411i, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r3 == true) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void validate(PaymentSheet.Configuration configuration) {
        boolean isBlank;
        boolean z;
        String ephemeralKeySecret;
        boolean isBlank2;
        String id;
        boolean isBlank3;
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        isBlank = StringsKt__StringsJVMKt.isBlank(configuration.getMerchantDisplayName());
        if (!isBlank) {
            PaymentSheet.CustomerConfiguration customer = configuration.getCustomer();
            boolean z2 = true;
            if (customer != null && (id = customer.getId()) != null) {
                isBlank3 = StringsKt__StringsJVMKt.isBlank(id);
                if (isBlank3) {
                    z = true;
                    if (z) {
                        PaymentSheet.CustomerConfiguration customer2 = configuration.getCustomer();
                        if (customer2 != null && (ephemeralKeySecret = customer2.getEphemeralKeySecret()) != null) {
                            isBlank2 = StringsKt__StringsJVMKt.isBlank(ephemeralKeySecret);
                        }
                        z2 = false;
                        if (!z2) {
                            return;
                        }
                        throw new InvalidParameterException("When a CustomerConfiguration is passed to PaymentSheet, the ephemeralKeySecret cannot be an empty string.");
                    }
                    throw new InvalidParameterException("When a CustomerConfiguration is passed to PaymentSheet, the Customer ID cannot be an empty string.");
                }
            }
            z = false;
            if (z) {
            }
        } else {
            throw new InvalidParameterException("When a Configuration is passed to PaymentSheet, the Merchant display name cannot be an empty string.");
        }
    }
}
