package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.injection.NamedConstantsKt;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.uicore.StripeThemeDefaults;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \n2\u00020\u0001:\t\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "()V", "additionalParams", "", "", "", "getAdditionalParams", "()Ljava/util/Map;", "AutofillEvent", "Companion", "Dismiss", "Init", "LpmSerializeFailureEvent", "Payment", "SelectPaymentOption", "ShowExistingPaymentOptions", "ShowNewPaymentOptionForm", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptionForm;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentSheetEvent implements AnalyticsEvent {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_APPEARANCE = "appearance";
    public static final String FIELD_APPEARANCE_USAGE = "usage";
    public static final String FIELD_BILLING = "default_billing_details";
    public static final String FIELD_BORDER_WIDTH = "border_width";
    public static final String FIELD_COLORS_DARK = "colorsDark";
    public static final String FIELD_COLORS_LIGHT = "colorsLight";
    public static final String FIELD_CORNER_RADIUS = "corner_radius";
    public static final String FIELD_CUSTOMER = "customer";
    public static final String FIELD_DELAYED_PMS = "allows_delayed_payment_methods";
    public static final String FIELD_FONT = "font";
    public static final String FIELD_GOOGLE_PAY = "googlepay";
    public static final String FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION = "mpe_config";
    public static final String FIELD_PRIMARY_BUTTON = "primary_button";
    public static final String FIELD_PRIMARY_BUTTON_COLOR = "primary_button_color";
    public static final String FIELD_SIZE_SCALE_FACTOR = "size_scale_factor";

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\r\u001a\u00020\u0003*\u00020\u0003H\u0002R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "type", "", "(Ljava/lang/String;)V", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "toSnakeCase", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class AutofillEvent extends PaymentSheetEvent {
        public static final int $stable = 0;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutofillEvent(String type) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            String snakeCase = toSnakeCase(type);
            this.eventName = "autofill_" + snakeCase;
        }

        private final String toSnakeCase(String str) {
            String lowerCase = new Regex("(?<=.)(?=\\p{Upper})").replace(str, "_").toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return lowerCase;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            Map<String, Object> emptyMap;
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;", "", "()V", "FIELD_APPEARANCE", "", "FIELD_APPEARANCE_USAGE", "FIELD_BILLING", "FIELD_BORDER_WIDTH", "FIELD_COLORS_DARK", "FIELD_COLORS_LIGHT", "FIELD_CORNER_RADIUS", "FIELD_CUSTOMER", "FIELD_DELAYED_PMS", "FIELD_FONT", "FIELD_GOOGLE_PAY", "FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION", "FIELD_PRIMARY_BUTTON", "FIELD_PRIMARY_BUTTON_COLOR", "FIELD_SIZE_SCALE_FACTOR", "analyticsValue", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "formatEventName", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "eventName", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String analyticsValue(PaymentSelection paymentSelection) {
            boolean z;
            if (Intrinsics.areEqual(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
                return PaymentSheetEvent.FIELD_GOOGLE_PAY;
            }
            if (paymentSelection instanceof PaymentSelection.Saved) {
                return "savedpm";
            }
            if (Intrinsics.areEqual(paymentSelection, PaymentSelection.Link.INSTANCE)) {
                z = true;
            } else {
                z = paymentSelection instanceof PaymentSelection.New.LinkInline;
            }
            if (z) {
                return "link";
            }
            if (paymentSelection instanceof PaymentSelection.New) {
                return "newpm";
            }
            return "unknown";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String formatEventName(EventReporter.Mode mode, String str) {
            return "mc_" + mode + "_" + str;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "additionalParams", "", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Dismiss extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dismiss(EventReporter.Mode mode) {
            super(null);
            Map<String, Object> emptyMap;
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.eventName = PaymentSheetEvent.Companion.formatEventName(mode, "dismiss");
            emptyMap = MapsKt__MapsKt.emptyMap();
            this.additionalParams = emptyMap;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "additionalParams", "", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentSheetEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetEvent.kt\ncom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n1#2:212\n800#3,11:213\n*S KotlinDebug\n*F\n+ 1 PaymentSheetEvent.kt\ncom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init\n*L\n67#1:213,11\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Init extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final PaymentSheet.Configuration configuration;
        private final EventReporter.Mode mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Init(EventReporter.Mode mode, PaymentSheet.Configuration configuration) {
            super(null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.mode = mode;
            this.configuration = configuration;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            Map mapOf;
            Map mutableMapOf;
            Map mapOf2;
            Map<String, Object> mapOf3;
            PaymentSheet.Appearance appearance;
            PaymentSheet.Typography typography;
            PaymentSheet.Appearance appearance2;
            PaymentSheet.Typography typography2;
            PaymentSheet.Appearance appearance3;
            PaymentSheet.Shapes shapes;
            PaymentSheet.Appearance appearance4;
            PaymentSheet.Shapes shapes2;
            PaymentSheet.Appearance appearance5;
            PaymentSheet.Appearance appearance6;
            PaymentSheet.PrimaryButtonTypography typography3;
            PaymentSheet.PrimaryButtonShape shape;
            PaymentSheet.PrimaryButtonShape shape2;
            PaymentSheet.Appearance appearance7;
            PaymentSheet.Configuration configuration = this.configuration;
            PaymentSheet.PrimaryButton primaryButton = (configuration == null || (appearance7 = configuration.getAppearance()) == null) ? null : appearance7.getPrimaryButton();
            Pair[] pairArr = new Pair[5];
            PaymentSheet.PrimaryButtonColors colorsLight = primaryButton != null ? primaryButton.getColorsLight() : null;
            PaymentSheet.PrimaryButtonColors.Companion companion = PaymentSheet.PrimaryButtonColors.Companion;
            pairArr[0] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_COLORS_LIGHT, Boolean.valueOf(!Intrinsics.areEqual(colorsLight, companion.getDefaultLight())));
            pairArr[1] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_COLORS_DARK, Boolean.valueOf(!Intrinsics.areEqual(primaryButton != null ? primaryButton.getColorsDark() : null, companion.getDefaultDark())));
            pairArr[2] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_CORNER_RADIUS, Boolean.valueOf(((primaryButton == null || (shape2 = primaryButton.getShape()) == null) ? null : shape2.getCornerRadiusDp()) != null));
            pairArr[3] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_BORDER_WIDTH, Boolean.valueOf(((primaryButton == null || (shape = primaryButton.getShape()) == null) ? null : shape.getBorderStrokeWidthDp()) != null));
            pairArr[4] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_FONT, Boolean.valueOf(((primaryButton == null || (typography3 = primaryButton.getTypography()) == null) ? null : typography3.getFontResId()) != null));
            mapOf = MapsKt__MapsKt.mapOf(pairArr);
            Pair[] pairArr2 = new Pair[7];
            PaymentSheet.Configuration configuration2 = this.configuration;
            PaymentSheet.Colors colorsLight2 = (configuration2 == null || (appearance6 = configuration2.getAppearance()) == null) ? null : appearance6.getColorsLight();
            PaymentSheet.Colors.Companion companion2 = PaymentSheet.Colors.Companion;
            pairArr2[0] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_COLORS_LIGHT, Boolean.valueOf(!Intrinsics.areEqual(colorsLight2, companion2.getDefaultLight())));
            PaymentSheet.Configuration configuration3 = this.configuration;
            pairArr2[1] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_COLORS_DARK, Boolean.valueOf(!Intrinsics.areEqual((configuration3 == null || (appearance5 = configuration3.getAppearance()) == null) ? null : appearance5.getColorsDark(), companion2.getDefaultDark())));
            PaymentSheet.Configuration configuration4 = this.configuration;
            Float valueOf = (configuration4 == null || (appearance4 = configuration4.getAppearance()) == null || (shapes2 = appearance4.getShapes()) == null) ? null : Float.valueOf(shapes2.getCornerRadiusDp());
            StripeThemeDefaults stripeThemeDefaults = StripeThemeDefaults.INSTANCE;
            pairArr2[2] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_CORNER_RADIUS, Boolean.valueOf(!Intrinsics.areEqual(valueOf, stripeThemeDefaults.getShapes().getCornerRadius())));
            PaymentSheet.Configuration configuration5 = this.configuration;
            pairArr2[3] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_BORDER_WIDTH, Boolean.valueOf(!Intrinsics.areEqual((configuration5 == null || (appearance3 = configuration5.getAppearance()) == null || (shapes = appearance3.getShapes()) == null) ? null : Float.valueOf(shapes.getBorderStrokeWidthDp()), stripeThemeDefaults.getShapes().getBorderStrokeWidth())));
            PaymentSheet.Configuration configuration6 = this.configuration;
            pairArr2[4] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_FONT, Boolean.valueOf(((configuration6 == null || (appearance2 = configuration6.getAppearance()) == null || (typography2 = appearance2.getTypography()) == null) ? null : typography2.getFontResId()) != null));
            PaymentSheet.Configuration configuration7 = this.configuration;
            pairArr2[5] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_SIZE_SCALE_FACTOR, Boolean.valueOf(!Intrinsics.areEqual((configuration7 == null || (appearance = configuration7.getAppearance()) == null || (typography = appearance.getTypography()) == null) ? null : Float.valueOf(typography.getSizeScaleFactor()), stripeThemeDefaults.getTypography().getFontSizeMultiplier())));
            pairArr2[6] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_PRIMARY_BUTTON, mapOf);
            mutableMapOf = MapsKt__MapsKt.mutableMapOf(pairArr2);
            boolean contains = mapOf.values().contains(Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            for (Object obj : mutableMapOf.values()) {
                if (obj instanceof Boolean) {
                    arrayList.add(obj);
                }
            }
            mutableMapOf.put(PaymentSheetEvent.FIELD_APPEARANCE_USAGE, Boolean.valueOf(arrayList.contains(Boolean.TRUE) || contains));
            Pair[] pairArr3 = new Pair[6];
            PaymentSheet.Configuration configuration8 = this.configuration;
            pairArr3[0] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_CUSTOMER, Boolean.valueOf((configuration8 != null ? configuration8.getCustomer() : null) != null));
            PaymentSheet.Configuration configuration9 = this.configuration;
            pairArr3[1] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_GOOGLE_PAY, Boolean.valueOf((configuration9 != null ? configuration9.getGooglePay() : null) != null));
            PaymentSheet.Configuration configuration10 = this.configuration;
            pairArr3[2] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_PRIMARY_BUTTON_COLOR, Boolean.valueOf((configuration10 != null ? configuration10.getPrimaryButtonColor() : null) != null));
            PaymentSheet.Configuration configuration11 = this.configuration;
            pairArr3[3] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_BILLING, Boolean.valueOf((configuration11 != null ? configuration11.getDefaultBillingDetails() : null) != null));
            PaymentSheet.Configuration configuration12 = this.configuration;
            pairArr3[4] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_DELAYED_PMS, configuration12 != null ? Boolean.valueOf(configuration12.getAllowsDelayedPaymentMethods()) : null);
            pairArr3[5] = TuplesKt.m28425to(PaymentSheetEvent.FIELD_APPEARANCE, mutableMapOf);
            mapOf2 = MapsKt__MapsKt.mapOf(pairArr3);
            mapOf3 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PaymentSheetEvent.FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION, mapOf2), TuplesKt.m28425to("locale", Locale.getDefault().toString()));
            return mapOf3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
            r0 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r2, "_", null, null, 0, null, null, 62, null);
         */
        @Override // com.stripe.android.core.networking.AnalyticsEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String getEventName() {
            PaymentSheet.CustomerConfiguration customerConfiguration;
            boolean z;
            String str;
            PaymentSheet.GooglePayConfiguration googlePayConfiguration;
            String str2;
            List listOfNotNull;
            String[] strArr = new String[2];
            PaymentSheet.Configuration configuration = this.configuration;
            List list = null;
            if (configuration != null) {
                customerConfiguration = configuration.getCustomer();
            } else {
                customerConfiguration = null;
            }
            boolean z2 = false;
            if (customerConfiguration != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = PaymentSheetEvent.FIELD_CUSTOMER;
            } else {
                str = null;
            }
            strArr[0] = str;
            PaymentSheet.Configuration configuration2 = this.configuration;
            if (configuration2 != null) {
                googlePayConfiguration = configuration2.getGooglePay();
            } else {
                googlePayConfiguration = null;
            }
            if (googlePayConfiguration != null) {
                z2 = true;
            }
            if (z2) {
                str2 = PaymentSheetEvent.FIELD_GOOGLE_PAY;
            } else {
                str2 = null;
            }
            strArr[1] = str2;
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) strArr);
            if (!listOfNotNull.isEmpty()) {
                list = listOfNotNull;
            }
            String str3 = (list == null || str3 == null) ? "default" : "default";
            return PaymentSheetEvent.Companion.formatEventName(this.mode, "init_" + str3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "()V", "additionalParams", "", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class LpmSerializeFailureEvent extends PaymentSheetEvent {
        public static final int $stable = 0;
        private final String eventName;

        public LpmSerializeFailureEvent() {
            super(null);
            this.eventName = "luxe_serialize_failure";
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            Map<String, Object> emptyMap;
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;", "durationMillis", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "currency", "", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Ljava/lang/Long;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", com.paypal.android.sdk.onetouch.core.Result.f74995h, "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Payment extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Success", "Failure", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum Result {
            Success("success"),
            Failure("failure");
            
            private final String code;

            Result(String str) {
                this.code = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Payment(EventReporter.Mode mode, Result result, Long l, PaymentSelection paymentSelection, String str) {
            super(null);
            Map<String, Object> mapOf;
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(result, "result");
            Companion companion = PaymentSheetEvent.Companion;
            String analyticsValue = companion.analyticsValue(paymentSelection);
            this.eventName = companion.formatEventName(mode, "payment_" + analyticsValue + "_" + result);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.m28425to("duration", l != null ? Float.valueOf(((float) l.longValue()) / 1000.0f) : null);
            pairArr[1] = TuplesKt.m28425to("locale", Locale.getDefault().toString());
            pairArr[2] = TuplesKt.m28425to("currency", str);
            mapOf = MapsKt__MapsKt.mapOf(pairArr);
            this.additionalParams = mapOf;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "currency", "", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SelectPaymentOption extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPaymentOption(EventReporter.Mode mode, PaymentSelection paymentSelection, String str) {
            super(null);
            Map<String, Object> mapOf;
            Intrinsics.checkNotNullParameter(mode, "mode");
            Companion companion = PaymentSheetEvent.Companion;
            String analyticsValue = companion.analyticsValue(paymentSelection);
            this.eventName = companion.formatEventName(mode, "paymentoption_" + analyticsValue + "_select");
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("locale", Locale.getDefault().toString()), TuplesKt.m28425to("currency", str));
            this.additionalParams = mapOf;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", NamedConstantsKt.LINK_ENABLED, "", "activeLinkSession", "currency", "", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;ZZLjava/lang/String;)V", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ShowExistingPaymentOptions extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowExistingPaymentOptions(EventReporter.Mode mode, boolean z, boolean z2, String str) {
            super(null);
            Map<String, Object> mapOf;
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.eventName = PaymentSheetEvent.Companion.formatEventName(mode, "sheet_savedpm_show");
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("link_enabled", Boolean.valueOf(z)), TuplesKt.m28425to("active_link_session", Boolean.valueOf(z2)), TuplesKt.m28425to("locale", Locale.getDefault().toString()), TuplesKt.m28425to("currency", str));
            this.additionalParams = mapOf;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptionForm;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", NamedConstantsKt.LINK_ENABLED, "", "activeLinkSession", "currency", "", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;ZZLjava/lang/String;)V", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "eventName", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ShowNewPaymentOptionForm extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowNewPaymentOptionForm(EventReporter.Mode mode, boolean z, boolean z2, String str) {
            super(null);
            Map<String, Object> mapOf;
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.eventName = PaymentSheetEvent.Companion.formatEventName(mode, "sheet_newpm_show");
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("link_enabled", Boolean.valueOf(z)), TuplesKt.m28425to("active_link_session", Boolean.valueOf(z2)), TuplesKt.m28425to("locale", Locale.getDefault().toString()), TuplesKt.m28425to("currency", str));
            this.additionalParams = mapOf;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    public /* synthetic */ PaymentSheetEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, Object> getAdditionalParams();

    private PaymentSheetEvent() {
    }
}
