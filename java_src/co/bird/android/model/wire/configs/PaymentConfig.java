package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AutoPayPaymentType;
import co.bird.android.model.constant.CardScannerStyle;
import co.bird.android.model.constant.DeviceVerificationMethod;
import co.bird.android.model.constant.OnboardingQuickPaymentStyle;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.constant.PaymentProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\u0002\u0010&J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u0015\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0014HÆ\u0003J\u0017\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014HÆ\u0003J\u0017\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010P\u001a\u00020\u001eHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010 HÆ\u0003J\t\u0010R\u001a\u00020\"HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020$HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\nHÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\rHÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\u009b\u0002\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0001J\u0013\u0010^\u001a\u00020\u00032\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020\rHÖ\u0001J\t\u0010a\u001a\u00020\nHÖ\u0001R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00102R\u0016\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010>¨\u0006b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/PaymentConfig;", "", "enablePaypal", "", "suggestPaypalOnPaymentAddError", "preloadDefaultOptions", "", "Lco/bird/android/model/constant/AutoPayPaymentType;", "chargeAutoPayUpdatesAtOrLessThanZeroBalance", "connectedAccountId", "", "enableGooglePayBonus", "googlePayBonusAmount", "", "enableCashpay", "onboardingQuickPayment", "onboardingQuickPaymentStyle", "Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;", "paymentSettingsV2", "testPaymentMethods", "", "paymentMethodToProvider", "Lco/bird/android/model/constant/PaymentMethod;", "Lco/bird/android/model/constant/PaymentProvider;", "paymentProviderEndpointVersions", "adyenConfig", "Lco/bird/android/model/wire/configs/AdyenConfig;", "deviceVerificationMethod", "Lco/bird/android/model/constant/DeviceVerificationMethod;", "bankRedirectConfig", "Lco/bird/android/model/wire/configs/BankRedirectConfig;", "cardScannerStyle", "Lco/bird/android/model/constant/CardScannerStyle;", "reloadConfig", "Lco/bird/android/model/wire/configs/ReloadConfig;", "selfBalanceRefund", "Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;", "deviceRegionsRequiringCreditPostalCode", "(ZZLjava/util/List;ZLjava/lang/String;ZIZZLco/bird/android/model/constant/OnboardingQuickPaymentStyle;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lco/bird/android/model/wire/configs/AdyenConfig;Lco/bird/android/model/constant/DeviceVerificationMethod;Lco/bird/android/model/wire/configs/BankRedirectConfig;Lco/bird/android/model/constant/CardScannerStyle;Lco/bird/android/model/wire/configs/ReloadConfig;Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;Ljava/util/List;)V", "getAdyenConfig", "()Lco/bird/android/model/wire/configs/AdyenConfig;", "getBankRedirectConfig", "()Lco/bird/android/model/wire/configs/BankRedirectConfig;", "getCardScannerStyle", "()Lco/bird/android/model/constant/CardScannerStyle;", "getChargeAutoPayUpdatesAtOrLessThanZeroBalance", "()Z", "getConnectedAccountId", "()Ljava/lang/String;", "getDeviceRegionsRequiringCreditPostalCode", "()Ljava/util/List;", "getDeviceVerificationMethod", "()Lco/bird/android/model/constant/DeviceVerificationMethod;", "getEnableCashpay", "getEnableGooglePayBonus", "getEnablePaypal", "getGooglePayBonusAmount", "()I", "getOnboardingQuickPayment", "getOnboardingQuickPaymentStyle", "()Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;", "getPaymentMethodToProvider", "()Ljava/util/Map;", "getPaymentProviderEndpointVersions", "getPaymentSettingsV2", "getPreloadDefaultOptions", "getReloadConfig", "()Lco/bird/android/model/wire/configs/ReloadConfig;", "getSelfBalanceRefund", "()Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;", "getSuggestPaypalOnPaymentAddError", "getTestPaymentMethods", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PaymentConfig {
    @JsonProperty("adyen")
    @InterfaceC41208ft5("adyen")
    private final AdyenConfig adyenConfig;
    @JsonProperty("bank_redirect")
    @InterfaceC41208ft5("bank_redirect")
    private final BankRedirectConfig bankRedirectConfig;
    @JsonProperty("card_scanner_style")
    @InterfaceC41208ft5("card_scanner_style")
    private final CardScannerStyle cardScannerStyle;
    @JsonProperty("charge_auto_pay_updates_at_or_less_than_zero_balance")
    @InterfaceC41208ft5("charge_auto_pay_updates_at_or_less_than_zero_balance")
    private final boolean chargeAutoPayUpdatesAtOrLessThanZeroBalance;
    @JsonProperty("connected_account_id")
    @InterfaceC41208ft5("connected_account_id")
    private final String connectedAccountId;
    @JsonProperty("device_regions_requiring_credit_postal_code")
    @InterfaceC41208ft5("device_regions_requiring_credit_postal_code")
    private final List<String> deviceRegionsRequiringCreditPostalCode;
    @JsonProperty("device_verification_method")
    @InterfaceC41208ft5("device_verification_method")
    private final DeviceVerificationMethod deviceVerificationMethod;
    @JsonProperty("enable_cash_pay")
    @InterfaceC41208ft5("enable_cash_pay")
    private final boolean enableCashpay;
    @JsonProperty("enable_google_pay_bonus")
    @InterfaceC41208ft5("enable_google_pay_bonus")
    private final boolean enableGooglePayBonus;
    @JsonProperty("enable_paypal")
    @InterfaceC41208ft5("enable_paypal")
    private final boolean enablePaypal;
    @JsonProperty("google_pay_bonus_amount")
    @InterfaceC41208ft5("google_pay_bonus_amount")
    private final int googlePayBonusAmount;
    @JsonProperty("onboarding_quick_payment")
    @InterfaceC41208ft5("onboarding_quick_payment")
    private final boolean onboardingQuickPayment;
    @JsonProperty("onboarding_quick_payment_style")
    @InterfaceC41208ft5("onboarding_quick_payment_style")
    private final OnboardingQuickPaymentStyle onboardingQuickPaymentStyle;
    @JsonProperty("payment_method_to_provider")
    @InterfaceC41208ft5("payment_method_to_provider")
    private final Map<PaymentMethod, PaymentProvider> paymentMethodToProvider;
    @JsonProperty("payment_provider_endpoint_versions")
    @InterfaceC41208ft5("payment_provider_endpoint_versions")
    private final Map<PaymentProvider, Integer> paymentProviderEndpointVersions;
    @JsonProperty("payment_settings_v2")
    @InterfaceC41208ft5("payment_settings_v2")
    private final boolean paymentSettingsV2;
    @JsonProperty("preload_default_options")
    @InterfaceC41208ft5("preload_default_options")
    private final List<AutoPayPaymentType> preloadDefaultOptions;
    @JsonProperty("reload")
    @InterfaceC41208ft5("reload")
    private final ReloadConfig reloadConfig;
    @JsonProperty("self_balance_refund")
    @InterfaceC41208ft5("self_balance_refund")
    private final SelfBalanceRefundConfig selfBalanceRefund;
    @JsonProperty("suggest_paypal_on_payment_add_error")
    @InterfaceC41208ft5("suggest_paypal_on_payment_add_error")
    private final boolean suggestPaypalOnPaymentAddError;
    @JsonProperty("test_payment_methods")
    @InterfaceC41208ft5("test_payment_methods")
    private final Map<String, String> testPaymentMethods;

    public PaymentConfig() {
        this(false, false, null, false, null, false, 0, false, false, null, false, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public final boolean component1() {
        return this.enablePaypal;
    }

    public final OnboardingQuickPaymentStyle component10() {
        return this.onboardingQuickPaymentStyle;
    }

    public final boolean component11() {
        return this.paymentSettingsV2;
    }

    public final Map<String, String> component12() {
        return this.testPaymentMethods;
    }

    public final Map<PaymentMethod, PaymentProvider> component13() {
        return this.paymentMethodToProvider;
    }

    public final Map<PaymentProvider, Integer> component14() {
        return this.paymentProviderEndpointVersions;
    }

    public final AdyenConfig component15() {
        return this.adyenConfig;
    }

    public final DeviceVerificationMethod component16() {
        return this.deviceVerificationMethod;
    }

    public final BankRedirectConfig component17() {
        return this.bankRedirectConfig;
    }

    public final CardScannerStyle component18() {
        return this.cardScannerStyle;
    }

    public final ReloadConfig component19() {
        return this.reloadConfig;
    }

    public final boolean component2() {
        return this.suggestPaypalOnPaymentAddError;
    }

    public final SelfBalanceRefundConfig component20() {
        return this.selfBalanceRefund;
    }

    public final List<String> component21() {
        return this.deviceRegionsRequiringCreditPostalCode;
    }

    public final List<AutoPayPaymentType> component3() {
        return this.preloadDefaultOptions;
    }

    public final boolean component4() {
        return this.chargeAutoPayUpdatesAtOrLessThanZeroBalance;
    }

    public final String component5() {
        return this.connectedAccountId;
    }

    public final boolean component6() {
        return this.enableGooglePayBonus;
    }

    public final int component7() {
        return this.googlePayBonusAmount;
    }

    public final boolean component8() {
        return this.enableCashpay;
    }

    public final boolean component9() {
        return this.onboardingQuickPayment;
    }

    public final PaymentConfig copy(boolean z, boolean z2, List<? extends AutoPayPaymentType> list, boolean z3, String connectedAccountId, boolean z4, int i, boolean z5, boolean z6, OnboardingQuickPaymentStyle onboardingQuickPaymentStyle, boolean z7, Map<String, String> testPaymentMethods, Map<PaymentMethod, ? extends PaymentProvider> map, Map<PaymentProvider, Integer> map2, AdyenConfig adyenConfig, DeviceVerificationMethod deviceVerificationMethod, BankRedirectConfig bankRedirectConfig, CardScannerStyle cardScannerStyle, ReloadConfig reloadConfig, SelfBalanceRefundConfig selfBalanceRefund, List<String> list2) {
        Intrinsics.checkNotNullParameter(connectedAccountId, "connectedAccountId");
        Intrinsics.checkNotNullParameter(testPaymentMethods, "testPaymentMethods");
        Intrinsics.checkNotNullParameter(bankRedirectConfig, "bankRedirectConfig");
        Intrinsics.checkNotNullParameter(reloadConfig, "reloadConfig");
        Intrinsics.checkNotNullParameter(selfBalanceRefund, "selfBalanceRefund");
        return new PaymentConfig(z, z2, list, z3, connectedAccountId, z4, i, z5, z6, onboardingQuickPaymentStyle, z7, testPaymentMethods, map, map2, adyenConfig, deviceVerificationMethod, bankRedirectConfig, cardScannerStyle, reloadConfig, selfBalanceRefund, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentConfig) {
            PaymentConfig paymentConfig = (PaymentConfig) obj;
            return this.enablePaypal == paymentConfig.enablePaypal && this.suggestPaypalOnPaymentAddError == paymentConfig.suggestPaypalOnPaymentAddError && Intrinsics.areEqual(this.preloadDefaultOptions, paymentConfig.preloadDefaultOptions) && this.chargeAutoPayUpdatesAtOrLessThanZeroBalance == paymentConfig.chargeAutoPayUpdatesAtOrLessThanZeroBalance && Intrinsics.areEqual(this.connectedAccountId, paymentConfig.connectedAccountId) && this.enableGooglePayBonus == paymentConfig.enableGooglePayBonus && this.googlePayBonusAmount == paymentConfig.googlePayBonusAmount && this.enableCashpay == paymentConfig.enableCashpay && this.onboardingQuickPayment == paymentConfig.onboardingQuickPayment && this.onboardingQuickPaymentStyle == paymentConfig.onboardingQuickPaymentStyle && this.paymentSettingsV2 == paymentConfig.paymentSettingsV2 && Intrinsics.areEqual(this.testPaymentMethods, paymentConfig.testPaymentMethods) && Intrinsics.areEqual(this.paymentMethodToProvider, paymentConfig.paymentMethodToProvider) && Intrinsics.areEqual(this.paymentProviderEndpointVersions, paymentConfig.paymentProviderEndpointVersions) && Intrinsics.areEqual(this.adyenConfig, paymentConfig.adyenConfig) && this.deviceVerificationMethod == paymentConfig.deviceVerificationMethod && Intrinsics.areEqual(this.bankRedirectConfig, paymentConfig.bankRedirectConfig) && this.cardScannerStyle == paymentConfig.cardScannerStyle && Intrinsics.areEqual(this.reloadConfig, paymentConfig.reloadConfig) && Intrinsics.areEqual(this.selfBalanceRefund, paymentConfig.selfBalanceRefund) && Intrinsics.areEqual(this.deviceRegionsRequiringCreditPostalCode, paymentConfig.deviceRegionsRequiringCreditPostalCode);
        }
        return false;
    }

    public final AdyenConfig getAdyenConfig() {
        return this.adyenConfig;
    }

    public final BankRedirectConfig getBankRedirectConfig() {
        return this.bankRedirectConfig;
    }

    public final CardScannerStyle getCardScannerStyle() {
        return this.cardScannerStyle;
    }

    public final boolean getChargeAutoPayUpdatesAtOrLessThanZeroBalance() {
        return this.chargeAutoPayUpdatesAtOrLessThanZeroBalance;
    }

    public final String getConnectedAccountId() {
        return this.connectedAccountId;
    }

    public final List<String> getDeviceRegionsRequiringCreditPostalCode() {
        return this.deviceRegionsRequiringCreditPostalCode;
    }

    public final DeviceVerificationMethod getDeviceVerificationMethod() {
        return this.deviceVerificationMethod;
    }

    public final boolean getEnableCashpay() {
        return this.enableCashpay;
    }

    public final boolean getEnableGooglePayBonus() {
        return this.enableGooglePayBonus;
    }

    public final boolean getEnablePaypal() {
        return this.enablePaypal;
    }

    public final int getGooglePayBonusAmount() {
        return this.googlePayBonusAmount;
    }

    public final boolean getOnboardingQuickPayment() {
        return this.onboardingQuickPayment;
    }

    public final OnboardingQuickPaymentStyle getOnboardingQuickPaymentStyle() {
        return this.onboardingQuickPaymentStyle;
    }

    public final Map<PaymentMethod, PaymentProvider> getPaymentMethodToProvider() {
        return this.paymentMethodToProvider;
    }

    public final Map<PaymentProvider, Integer> getPaymentProviderEndpointVersions() {
        return this.paymentProviderEndpointVersions;
    }

    public final boolean getPaymentSettingsV2() {
        return this.paymentSettingsV2;
    }

    public final List<AutoPayPaymentType> getPreloadDefaultOptions() {
        return this.preloadDefaultOptions;
    }

    public final ReloadConfig getReloadConfig() {
        return this.reloadConfig;
    }

    public final SelfBalanceRefundConfig getSelfBalanceRefund() {
        return this.selfBalanceRefund;
    }

    public final boolean getSuggestPaypalOnPaymentAddError() {
        return this.suggestPaypalOnPaymentAddError;
    }

    public final Map<String, String> getTestPaymentMethods() {
        return this.testPaymentMethods;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public int hashCode() {
        boolean z = this.enablePaypal;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.suggestPaypalOnPaymentAddError;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        List<AutoPayPaymentType> list = this.preloadDefaultOptions;
        int hashCode = (i3 + (list == null ? 0 : list.hashCode())) * 31;
        ?? r22 = this.chargeAutoPayUpdatesAtOrLessThanZeroBalance;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int hashCode2 = (((hashCode + i4) * 31) + this.connectedAccountId.hashCode()) * 31;
        ?? r23 = this.enableGooglePayBonus;
        int i5 = r23;
        if (r23 != 0) {
            i5 = 1;
        }
        int hashCode3 = (((hashCode2 + i5) * 31) + Integer.hashCode(this.googlePayBonusAmount)) * 31;
        ?? r24 = this.enableCashpay;
        int i6 = r24;
        if (r24 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode3 + i6) * 31;
        ?? r25 = this.onboardingQuickPayment;
        int i8 = r25;
        if (r25 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        OnboardingQuickPaymentStyle onboardingQuickPaymentStyle = this.onboardingQuickPaymentStyle;
        int hashCode4 = (i9 + (onboardingQuickPaymentStyle == null ? 0 : onboardingQuickPaymentStyle.hashCode())) * 31;
        boolean z2 = this.paymentSettingsV2;
        int hashCode5 = (((hashCode4 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.testPaymentMethods.hashCode()) * 31;
        Map<PaymentMethod, PaymentProvider> map = this.paymentMethodToProvider;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<PaymentProvider, Integer> map2 = this.paymentProviderEndpointVersions;
        int hashCode7 = (hashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        AdyenConfig adyenConfig = this.adyenConfig;
        int hashCode8 = (hashCode7 + (adyenConfig == null ? 0 : adyenConfig.hashCode())) * 31;
        DeviceVerificationMethod deviceVerificationMethod = this.deviceVerificationMethod;
        int hashCode9 = (((hashCode8 + (deviceVerificationMethod == null ? 0 : deviceVerificationMethod.hashCode())) * 31) + this.bankRedirectConfig.hashCode()) * 31;
        CardScannerStyle cardScannerStyle = this.cardScannerStyle;
        int hashCode10 = (((((hashCode9 + (cardScannerStyle == null ? 0 : cardScannerStyle.hashCode())) * 31) + this.reloadConfig.hashCode()) * 31) + this.selfBalanceRefund.hashCode()) * 31;
        List<String> list2 = this.deviceRegionsRequiringCreditPostalCode;
        return hashCode10 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enablePaypal;
        boolean z2 = this.suggestPaypalOnPaymentAddError;
        List<AutoPayPaymentType> list = this.preloadDefaultOptions;
        boolean z3 = this.chargeAutoPayUpdatesAtOrLessThanZeroBalance;
        String str = this.connectedAccountId;
        boolean z4 = this.enableGooglePayBonus;
        int i = this.googlePayBonusAmount;
        boolean z5 = this.enableCashpay;
        boolean z6 = this.onboardingQuickPayment;
        OnboardingQuickPaymentStyle onboardingQuickPaymentStyle = this.onboardingQuickPaymentStyle;
        boolean z7 = this.paymentSettingsV2;
        Map<String, String> map = this.testPaymentMethods;
        Map<PaymentMethod, PaymentProvider> map2 = this.paymentMethodToProvider;
        Map<PaymentProvider, Integer> map3 = this.paymentProviderEndpointVersions;
        AdyenConfig adyenConfig = this.adyenConfig;
        DeviceVerificationMethod deviceVerificationMethod = this.deviceVerificationMethod;
        BankRedirectConfig bankRedirectConfig = this.bankRedirectConfig;
        CardScannerStyle cardScannerStyle = this.cardScannerStyle;
        ReloadConfig reloadConfig = this.reloadConfig;
        SelfBalanceRefundConfig selfBalanceRefundConfig = this.selfBalanceRefund;
        List<String> list2 = this.deviceRegionsRequiringCreditPostalCode;
        return "PaymentConfig(enablePaypal=" + z + ", suggestPaypalOnPaymentAddError=" + z2 + ", preloadDefaultOptions=" + list + ", chargeAutoPayUpdatesAtOrLessThanZeroBalance=" + z3 + ", connectedAccountId=" + str + ", enableGooglePayBonus=" + z4 + ", googlePayBonusAmount=" + i + ", enableCashpay=" + z5 + ", onboardingQuickPayment=" + z6 + ", onboardingQuickPaymentStyle=" + onboardingQuickPaymentStyle + ", paymentSettingsV2=" + z7 + ", testPaymentMethods=" + map + ", paymentMethodToProvider=" + map2 + ", paymentProviderEndpointVersions=" + map3 + ", adyenConfig=" + adyenConfig + ", deviceVerificationMethod=" + deviceVerificationMethod + ", bankRedirectConfig=" + bankRedirectConfig + ", cardScannerStyle=" + cardScannerStyle + ", reloadConfig=" + reloadConfig + ", selfBalanceRefund=" + selfBalanceRefundConfig + ", deviceRegionsRequiringCreditPostalCode=" + list2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentConfig(boolean z, boolean z2, List<? extends AutoPayPaymentType> list, boolean z3, String connectedAccountId, boolean z4, int i, boolean z5, boolean z6, OnboardingQuickPaymentStyle onboardingQuickPaymentStyle, boolean z7, Map<String, String> testPaymentMethods, Map<PaymentMethod, ? extends PaymentProvider> map, Map<PaymentProvider, Integer> map2, AdyenConfig adyenConfig, DeviceVerificationMethod deviceVerificationMethod, BankRedirectConfig bankRedirectConfig, CardScannerStyle cardScannerStyle, ReloadConfig reloadConfig, SelfBalanceRefundConfig selfBalanceRefund, List<String> list2) {
        Intrinsics.checkNotNullParameter(connectedAccountId, "connectedAccountId");
        Intrinsics.checkNotNullParameter(testPaymentMethods, "testPaymentMethods");
        Intrinsics.checkNotNullParameter(bankRedirectConfig, "bankRedirectConfig");
        Intrinsics.checkNotNullParameter(reloadConfig, "reloadConfig");
        Intrinsics.checkNotNullParameter(selfBalanceRefund, "selfBalanceRefund");
        this.enablePaypal = z;
        this.suggestPaypalOnPaymentAddError = z2;
        this.preloadDefaultOptions = list;
        this.chargeAutoPayUpdatesAtOrLessThanZeroBalance = z3;
        this.connectedAccountId = connectedAccountId;
        this.enableGooglePayBonus = z4;
        this.googlePayBonusAmount = i;
        this.enableCashpay = z5;
        this.onboardingQuickPayment = z6;
        this.onboardingQuickPaymentStyle = onboardingQuickPaymentStyle;
        this.paymentSettingsV2 = z7;
        this.testPaymentMethods = testPaymentMethods;
        this.paymentMethodToProvider = map;
        this.paymentProviderEndpointVersions = map2;
        this.adyenConfig = adyenConfig;
        this.deviceVerificationMethod = deviceVerificationMethod;
        this.bankRedirectConfig = bankRedirectConfig;
        this.cardScannerStyle = cardScannerStyle;
        this.reloadConfig = reloadConfig;
        this.selfBalanceRefund = selfBalanceRefund;
        this.deviceRegionsRequiringCreditPostalCode = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PaymentConfig(boolean z, boolean z2, List list, boolean z3, String str, boolean z4, int i, boolean z5, boolean z6, OnboardingQuickPaymentStyle onboardingQuickPaymentStyle, boolean z7, Map map, Map map2, Map map3, AdyenConfig adyenConfig, DeviceVerificationMethod deviceVerificationMethod, BankRedirectConfig bankRedirectConfig, CardScannerStyle cardScannerStyle, ReloadConfig reloadConfig, SelfBalanceRefundConfig selfBalanceRefundConfig, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r7, r8, r9, r10, r11, r12, r13, r2, r15, r20, r19, r46, r16, r17, r18, r21, r5, (i2 & 1048576) == 0 ? list2 : r6);
        Map map4;
        Map map5;
        AdyenConfig adyenConfig2;
        ?? r6;
        ReloadConfig reloadConfig2;
        ReloadConfig reloadConfig3;
        SelfBalanceRefundConfig selfBalanceRefundConfig2;
        boolean z8 = (i2 & 1) != 0 ? false : z;
        boolean z9 = (i2 & 2) != 0 ? false : z2;
        List listOf = (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.listOf((Object[]) new AutoPayPaymentType[]{AutoPayPaymentType.GOOGLE_PAY, AutoPayPaymentType.PAYPAL, AutoPayPaymentType.CARD}) : list;
        boolean z10 = (i2 & 8) != 0 ? false : z3;
        String str2 = (i2 & 16) != 0 ? " " : str;
        boolean z11 = (i2 & 32) != 0 ? false : z4;
        int i3 = (i2 & 64) != 0 ? 0 : i;
        boolean z12 = (i2 & 128) != 0 ? false : z5;
        boolean z13 = (i2 & 256) != 0 ? false : z6;
        OnboardingQuickPaymentStyle onboardingQuickPaymentStyle2 = (i2 & 512) != 0 ? null : onboardingQuickPaymentStyle;
        boolean z14 = (i2 & 1024) == 0 ? z7 : false;
        Map emptyMap = (i2 & 2048) != 0 ? MapsKt__MapsKt.emptyMap() : map;
        Map map6 = (i2 & 4096) != 0 ? null : map2;
        Map map7 = (i2 & 8192) != 0 ? null : map3;
        AdyenConfig adyenConfig3 = (i2 & 16384) != 0 ? null : adyenConfig;
        DeviceVerificationMethod deviceVerificationMethod2 = (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : deviceVerificationMethod;
        BankRedirectConfig bankRedirectConfig2 = (i2 & 65536) != 0 ? new BankRedirectConfig(null, null, null, 7, null) : bankRedirectConfig;
        CardScannerStyle cardScannerStyle2 = (i2 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : cardScannerStyle;
        if ((i2 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0) {
            adyenConfig2 = adyenConfig3;
            map4 = map6;
            map5 = map7;
            r6 = 0;
            reloadConfig2 = new ReloadConfig(null, 1, null);
        } else {
            map4 = map6;
            map5 = map7;
            adyenConfig2 = adyenConfig3;
            r6 = 0;
            reloadConfig2 = reloadConfig;
        }
        if ((524288 & i2) != 0) {
            reloadConfig3 = reloadConfig2;
            selfBalanceRefundConfig2 = new SelfBalanceRefundConfig(r6, r6, 3, r6);
        } else {
            reloadConfig3 = reloadConfig2;
            selfBalanceRefundConfig2 = selfBalanceRefundConfig;
        }
    }
}
