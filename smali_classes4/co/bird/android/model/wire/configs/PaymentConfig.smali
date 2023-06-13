.class public final Lco/bird/android/model/wire/configs/PaymentConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008>\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0016\u0008\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\u0016\u0008\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0008\u0008\u0002\u0010!\u001a\u00020\"\u0012\u0008\u0008\u0002\u0010#\u001a\u00020$\u0012\u0010\u0008\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u00a2\u0006\u0002\u0010&J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0014H\u00c6\u0003J\u0017\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014H\u00c6\u0003J\u0017\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\t\u0010P\u001a\u00020\u001eH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010 H\u00c6\u0003J\t\u0010R\u001a\u00020\"H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020$H\u00c6\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\nH\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\rH\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\u009b\u0002\u0010]\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00142\u0016\u0008\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u0016\u0008\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u00142\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0008\u0002\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0010\u0008\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010^\u001a\u00020\u00032\u0008\u0010_\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010`\u001a\u00020\rH\u00d6\u0001J\t\u0010a\u001a\u00020\nH\u00d6\u0001R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0016\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010.R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010.R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010.R\u0016\u0010\u000c\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010.R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010>R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010>R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010.R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u00102R\u0016\u0010!\u001a\u00020\"8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010CR\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010ER\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010.R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010>\u00a8\u0006b"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/PaymentConfig;",
        "",
        "enablePaypal",
        "",
        "suggestPaypalOnPaymentAddError",
        "preloadDefaultOptions",
        "",
        "Lco/bird/android/model/constant/AutoPayPaymentType;",
        "chargeAutoPayUpdatesAtOrLessThanZeroBalance",
        "connectedAccountId",
        "",
        "enableGooglePayBonus",
        "googlePayBonusAmount",
        "",
        "enableCashpay",
        "onboardingQuickPayment",
        "onboardingQuickPaymentStyle",
        "Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;",
        "paymentSettingsV2",
        "testPaymentMethods",
        "",
        "paymentMethodToProvider",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "Lco/bird/android/model/constant/PaymentProvider;",
        "paymentProviderEndpointVersions",
        "adyenConfig",
        "Lco/bird/android/model/wire/configs/AdyenConfig;",
        "deviceVerificationMethod",
        "Lco/bird/android/model/constant/DeviceVerificationMethod;",
        "bankRedirectConfig",
        "Lco/bird/android/model/wire/configs/BankRedirectConfig;",
        "cardScannerStyle",
        "Lco/bird/android/model/constant/CardScannerStyle;",
        "reloadConfig",
        "Lco/bird/android/model/wire/configs/ReloadConfig;",
        "selfBalanceRefund",
        "Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;",
        "deviceRegionsRequiringCreditPostalCode",
        "(ZZLjava/util/List;ZLjava/lang/String;ZIZZLco/bird/android/model/constant/OnboardingQuickPaymentStyle;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lco/bird/android/model/wire/configs/AdyenConfig;Lco/bird/android/model/constant/DeviceVerificationMethod;Lco/bird/android/model/wire/configs/BankRedirectConfig;Lco/bird/android/model/constant/CardScannerStyle;Lco/bird/android/model/wire/configs/ReloadConfig;Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;Ljava/util/List;)V",
        "getAdyenConfig",
        "()Lco/bird/android/model/wire/configs/AdyenConfig;",
        "getBankRedirectConfig",
        "()Lco/bird/android/model/wire/configs/BankRedirectConfig;",
        "getCardScannerStyle",
        "()Lco/bird/android/model/constant/CardScannerStyle;",
        "getChargeAutoPayUpdatesAtOrLessThanZeroBalance",
        "()Z",
        "getConnectedAccountId",
        "()Ljava/lang/String;",
        "getDeviceRegionsRequiringCreditPostalCode",
        "()Ljava/util/List;",
        "getDeviceVerificationMethod",
        "()Lco/bird/android/model/constant/DeviceVerificationMethod;",
        "getEnableCashpay",
        "getEnableGooglePayBonus",
        "getEnablePaypal",
        "getGooglePayBonusAmount",
        "()I",
        "getOnboardingQuickPayment",
        "getOnboardingQuickPaymentStyle",
        "()Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;",
        "getPaymentMethodToProvider",
        "()Ljava/util/Map;",
        "getPaymentProviderEndpointVersions",
        "getPaymentSettingsV2",
        "getPreloadDefaultOptions",
        "getReloadConfig",
        "()Lco/bird/android/model/wire/configs/ReloadConfig;",
        "getSelfBalanceRefund",
        "()Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;",
        "getSuggestPaypalOnPaymentAddError",
        "getTestPaymentMethods",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component21",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "model-wire_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final adyenConfig:Lco/bird/android/model/wire/configs/AdyenConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "adyen"
    .end annotation

    .annotation runtime Lft5;
        value = "adyen"
    .end annotation
.end field

.field private final bankRedirectConfig:Lco/bird/android/model/wire/configs/BankRedirectConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bank_redirect"
    .end annotation

    .annotation runtime Lft5;
        value = "bank_redirect"
    .end annotation
.end field

.field private final cardScannerStyle:Lco/bird/android/model/constant/CardScannerStyle;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "card_scanner_style"
    .end annotation

    .annotation runtime Lft5;
        value = "card_scanner_style"
    .end annotation
.end field

.field private final chargeAutoPayUpdatesAtOrLessThanZeroBalance:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "charge_auto_pay_updates_at_or_less_than_zero_balance"
    .end annotation

    .annotation runtime Lft5;
        value = "charge_auto_pay_updates_at_or_less_than_zero_balance"
    .end annotation
.end field

.field private final connectedAccountId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "connected_account_id"
    .end annotation

    .annotation runtime Lft5;
        value = "connected_account_id"
    .end annotation
.end field

.field private final deviceRegionsRequiringCreditPostalCode:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "device_regions_requiring_credit_postal_code"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "device_regions_requiring_credit_postal_code"
    .end annotation
.end field

.field private final deviceVerificationMethod:Lco/bird/android/model/constant/DeviceVerificationMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "device_verification_method"
    .end annotation

    .annotation runtime Lft5;
        value = "device_verification_method"
    .end annotation
.end field

.field private final enableCashpay:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_cash_pay"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_cash_pay"
    .end annotation
.end field

.field private final enableGooglePayBonus:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_google_pay_bonus"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_google_pay_bonus"
    .end annotation
.end field

.field private final enablePaypal:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_paypal"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_paypal"
    .end annotation
.end field

.field private final googlePayBonusAmount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "google_pay_bonus_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "google_pay_bonus_amount"
    .end annotation
.end field

.field private final onboardingQuickPayment:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "onboarding_quick_payment"
    .end annotation

    .annotation runtime Lft5;
        value = "onboarding_quick_payment"
    .end annotation
.end field

.field private final onboardingQuickPaymentStyle:Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "onboarding_quick_payment_style"
    .end annotation

    .annotation runtime Lft5;
        value = "onboarding_quick_payment_style"
    .end annotation
.end field

.field private final paymentMethodToProvider:Ljava/util/Map;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "payment_method_to_provider"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentMethod;",
            "Lco/bird/android/model/constant/PaymentProvider;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "payment_method_to_provider"
    .end annotation
.end field

.field private final paymentProviderEndpointVersions:Ljava/util/Map;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "payment_provider_endpoint_versions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentProvider;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "payment_provider_endpoint_versions"
    .end annotation
.end field

.field private final paymentSettingsV2:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "payment_settings_v2"
    .end annotation

    .annotation runtime Lft5;
        value = "payment_settings_v2"
    .end annotation
.end field

.field private final preloadDefaultOptions:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "preload_default_options"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/AutoPayPaymentType;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "preload_default_options"
    .end annotation
.end field

.field private final reloadConfig:Lco/bird/android/model/wire/configs/ReloadConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "reload"
    .end annotation

    .annotation runtime Lft5;
        value = "reload"
    .end annotation
.end field

.field private final selfBalanceRefund:Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "self_balance_refund"
    .end annotation

    .annotation runtime Lft5;
        value = "self_balance_refund"
    .end annotation
.end field

.field private final suggestPaypalOnPaymentAddError:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "suggest_paypal_on_payment_add_error"
    .end annotation

    .annotation runtime Lft5;
        value = "suggest_paypal_on_payment_add_error"
    .end annotation
.end field

.field private final testPaymentMethods:Ljava/util/Map;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "test_payment_methods"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "test_payment_methods"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v22, 0x1fffff

    const/16 v23, 0x0

    invoke-direct/range {v0 .. v23}, Lco/bird/android/model/wire/configs/PaymentConfig;-><init>(ZZLjava/util/List;ZLjava/lang/String;ZIZZLco/bird/android/model/constant/OnboardingQuickPaymentStyle;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lco/bird/android/model/wire/configs/AdyenConfig;Lco/bird/android/model/constant/DeviceVerificationMethod;Lco/bird/android/model/wire/configs/BankRedirectConfig;Lco/bird/android/model/constant/CardScannerStyle;Lco/bird/android/model/wire/configs/ReloadConfig;Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZLjava/util/List;ZLjava/lang/String;ZIZZLco/bird/android/model/constant/OnboardingQuickPaymentStyle;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lco/bird/android/model/wire/configs/AdyenConfig;Lco/bird/android/model/constant/DeviceVerificationMethod;Lco/bird/android/model/wire/configs/BankRedirectConfig;Lco/bird/android/model/constant/CardScannerStyle;Lco/bird/android/model/wire/configs/ReloadConfig;Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/AutoPayPaymentType;",
            ">;Z",
            "Ljava/lang/String;",
            "ZIZZ",
            "Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentMethod;",
            "+",
            "Lco/bird/android/model/constant/PaymentProvider;",
            ">;",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentProvider;",
            "Ljava/lang/Integer;",
            ">;",
            "Lco/bird/android/model/wire/configs/AdyenConfig;",
            "Lco/bird/android/model/constant/DeviceVerificationMethod;",
            "Lco/bird/android/model/wire/configs/BankRedirectConfig;",
            "Lco/bird/android/model/constant/CardScannerStyle;",
            "Lco/bird/android/model/wire/configs/ReloadConfig;",
            "Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p5

    move-object/from16 v2, p12

    move-object/from16 v3, p17

    move-object/from16 v4, p19

    move-object/from16 v5, p20

    const-string v6, "connectedAccountId"

    invoke-static {p5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "testPaymentMethods"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "bankRedirectConfig"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "reloadConfig"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "selfBalanceRefund"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v6, p1

    iput-boolean v6, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->enablePaypal:Z

    move v6, p2

    iput-boolean v6, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->suggestPaypalOnPaymentAddError:Z

    move-object v6, p3

    iput-object v6, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->preloadDefaultOptions:Ljava/util/List;

    move v6, p4

    iput-boolean v6, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->chargeAutoPayUpdatesAtOrLessThanZeroBalance:Z

    iput-object v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->connectedAccountId:Ljava/lang/String;

    move v1, p6

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableGooglePayBonus:Z

    move v1, p7

    iput v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->googlePayBonusAmount:I

    move v1, p8

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableCashpay:Z

    move/from16 v1, p9

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPayment:Z

    move-object/from16 v1, p10

    iput-object v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPaymentStyle:Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;

    move/from16 v1, p11

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentSettingsV2:Z

    iput-object v2, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->testPaymentMethods:Ljava/util/Map;

    move-object/from16 v1, p13

    iput-object v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentMethodToProvider:Ljava/util/Map;

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentProviderEndpointVersions:Ljava/util/Map;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->adyenConfig:Lco/bird/android/model/wire/configs/AdyenConfig;

    move-object/from16 v1, p16

    iput-object v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceVerificationMethod:Lco/bird/android/model/constant/DeviceVerificationMethod;

    iput-object v3, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->bankRedirectConfig:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    move-object/from16 v1, p18

    iput-object v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->cardScannerStyle:Lco/bird/android/model/constant/CardScannerStyle;

    iput-object v4, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->reloadConfig:Lco/bird/android/model/wire/configs/ReloadConfig;

    iput-object v5, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->selfBalanceRefund:Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;

    move-object/from16 v1, p21

    iput-object v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceRegionsRequiringCreditPostalCode:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/util/List;ZLjava/lang/String;ZIZZLco/bird/android/model/constant/OnboardingQuickPaymentStyle;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lco/bird/android/model/wire/configs/AdyenConfig;Lco/bird/android/model/constant/DeviceVerificationMethod;Lco/bird/android/model/wire/configs/BankRedirectConfig;Lco/bird/android/model/constant/CardScannerStyle;Lco/bird/android/model/wire/configs/ReloadConfig;Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p22

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    new-array v4, v5, [Lco/bird/android/model/constant/AutoPayPaymentType;

    sget-object v7, Lco/bird/android/model/constant/AutoPayPaymentType;->GOOGLE_PAY:Lco/bird/android/model/constant/AutoPayPaymentType;

    aput-object v7, v4, v2

    sget-object v7, Lco/bird/android/model/constant/AutoPayPaymentType;->PAYPAL:Lco/bird/android/model/constant/AutoPayPaymentType;

    aput-object v7, v4, v6

    sget-object v7, Lco/bird/android/model/constant/AutoPayPaymentType;->CARD:Lco/bird/android/model/constant/AutoPayPaymentType;

    const/4 v8, 0x2

    aput-object v7, v4, v8

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    move v7, v2

    goto :goto_3

    :cond_3
    move/from16 v7, p4

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const-string v8, " "

    goto :goto_4

    :cond_4
    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    move v9, v2

    goto :goto_5

    :cond_5
    move/from16 v9, p6

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    move v10, v2

    goto :goto_6

    :cond_6
    move/from16 v10, p7

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    move v11, v2

    goto :goto_7

    :cond_7
    move/from16 v11, p8

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    move v12, v2

    goto :goto_8

    :cond_8
    move/from16 v12, p9

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    const/4 v13, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    goto :goto_a

    :cond_a
    move/from16 v2, p11

    :goto_a
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_b

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v15

    goto :goto_b

    :cond_b
    move-object/from16 v15, p12

    :goto_b
    and-int/lit16 v5, v0, 0x1000

    if-eqz v5, :cond_c

    const/4 v5, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v5, p13

    :goto_c
    and-int/lit16 v6, v0, 0x2000

    if-eqz v6, :cond_d

    const/4 v6, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v6, p14

    :goto_d
    and-int/lit16 v14, v0, 0x4000

    if-eqz v14, :cond_e

    const/4 v14, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v14, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    new-instance v17, Lco/bird/android/model/wire/configs/BankRedirectConfig;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x7

    const/16 v22, 0x0

    move-object/from16 p4, v17

    move-object/from16 p5, v18

    move-object/from16 p6, v19

    move-object/from16 p7, v20

    move/from16 p8, v21

    move-object/from16 p9, v22

    invoke-direct/range {p4 .. p9}, Lco/bird/android/model/wire/configs/BankRedirectConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    move-object/from16 p23, v14

    new-instance v14, Lco/bird/android/model/wire/configs/ReloadConfig;

    move-object/from16 v20, v5

    move-object/from16 v19, v6

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct {v14, v6, v5, v6}, Lco/bird/android/model/wire/configs/ReloadConfig;-><init>(Lco/bird/android/model/wire/configs/PreloadUiVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_12

    :cond_12
    move-object/from16 v20, v5

    move-object/from16 v19, v6

    move-object/from16 p23, v14

    const/4 v6, 0x0

    move-object/from16 v14, p19

    :goto_12
    const/high16 v5, 0x80000

    and-int/2addr v5, v0

    if-eqz v5, :cond_13

    new-instance v5, Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;

    move-object/from16 v21, v14

    const/4 v14, 0x3

    invoke-direct {v5, v6, v6, v14, v6}, Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_13

    :cond_13
    move-object/from16 v21, v14

    move-object/from16 v5, p20

    :goto_13
    const/high16 v14, 0x100000

    and-int/2addr v0, v14

    if-eqz v0, :cond_14

    goto :goto_14

    :cond_14
    move-object/from16 v6, p21

    :goto_14
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v7

    move-object/from16 p6, v8

    move/from16 p7, v9

    move/from16 p8, v10

    move/from16 p9, v11

    move/from16 p10, v12

    move-object/from16 p11, v13

    move/from16 p12, v2

    move-object/from16 p13, v15

    move-object/from16 p14, v20

    move-object/from16 p15, v19

    move-object/from16 p16, p23

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    move-object/from16 p20, v21

    move-object/from16 p21, v5

    move-object/from16 p22, v6

    invoke-direct/range {p1 .. p22}, Lco/bird/android/model/wire/configs/PaymentConfig;-><init>(ZZLjava/util/List;ZLjava/lang/String;ZIZZLco/bird/android/model/constant/OnboardingQuickPaymentStyle;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lco/bird/android/model/wire/configs/AdyenConfig;Lco/bird/android/model/constant/DeviceVerificationMethod;Lco/bird/android/model/wire/configs/BankRedirectConfig;Lco/bird/android/model/constant/CardScannerStyle;Lco/bird/android/model/wire/configs/ReloadConfig;Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/PaymentConfig;ZZLjava/util/List;ZLjava/lang/String;ZIZZLco/bird/android/model/constant/OnboardingQuickPaymentStyle;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lco/bird/android/model/wire/configs/AdyenConfig;Lco/bird/android/model/constant/DeviceVerificationMethod;Lco/bird/android/model/wire/configs/BankRedirectConfig;Lco/bird/android/model/constant/CardScannerStyle;Lco/bird/android/model/wire/configs/ReloadConfig;Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/PaymentConfig;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->enablePaypal:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->suggestPaypalOnPaymentAddError:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->preloadDefaultOptions:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->chargeAutoPayUpdatesAtOrLessThanZeroBalance:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->connectedAccountId:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableGooglePayBonus:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->googlePayBonusAmount:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableCashpay:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPayment:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPaymentStyle:Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentSettingsV2:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->testPaymentMethods:Ljava/util/Map;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentMethodToProvider:Ljava/util/Map;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentProviderEndpointVersions:Ljava/util/Map;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->adyenConfig:Lco/bird/android/model/wire/configs/AdyenConfig;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceVerificationMethod:Lco/bird/android/model/constant/DeviceVerificationMethod;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->bankRedirectConfig:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->cardScannerStyle:Lco/bird/android/model/constant/CardScannerStyle;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->reloadConfig:Lco/bird/android/model/wire/configs/ReloadConfig;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p19, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->selfBalanceRefund:Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v1, v1, v16

    if-eqz v1, :cond_14

    iget-object v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceRegionsRequiringCreditPostalCode:Ljava/util/List;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    move/from16 p1, v2

    move/from16 p2, v3

    move-object/from16 p3, v4

    move/from16 p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p20, v15

    move-object/from16 p21, v1

    invoke-virtual/range {p0 .. p21}, Lco/bird/android/model/wire/configs/PaymentConfig;->copy(ZZLjava/util/List;ZLjava/lang/String;ZIZZLco/bird/android/model/constant/OnboardingQuickPaymentStyle;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lco/bird/android/model/wire/configs/AdyenConfig;Lco/bird/android/model/constant/DeviceVerificationMethod;Lco/bird/android/model/wire/configs/BankRedirectConfig;Lco/bird/android/model/constant/CardScannerStyle;Lco/bird/android/model/wire/configs/ReloadConfig;Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;Ljava/util/List;)Lco/bird/android/model/wire/configs/PaymentConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enablePaypal:Z

    return v0
.end method

.method public final component10()Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPaymentStyle:Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentSettingsV2:Z

    return v0
.end method

.method public final component12()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->testPaymentMethods:Ljava/util/Map;

    return-object v0
.end method

.method public final component13()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentMethod;",
            "Lco/bird/android/model/constant/PaymentProvider;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentMethodToProvider:Ljava/util/Map;

    return-object v0
.end method

.method public final component14()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentProvider;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentProviderEndpointVersions:Ljava/util/Map;

    return-object v0
.end method

.method public final component15()Lco/bird/android/model/wire/configs/AdyenConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->adyenConfig:Lco/bird/android/model/wire/configs/AdyenConfig;

    return-object v0
.end method

.method public final component16()Lco/bird/android/model/constant/DeviceVerificationMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceVerificationMethod:Lco/bird/android/model/constant/DeviceVerificationMethod;

    return-object v0
.end method

.method public final component17()Lco/bird/android/model/wire/configs/BankRedirectConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->bankRedirectConfig:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    return-object v0
.end method

.method public final component18()Lco/bird/android/model/constant/CardScannerStyle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->cardScannerStyle:Lco/bird/android/model/constant/CardScannerStyle;

    return-object v0
.end method

.method public final component19()Lco/bird/android/model/wire/configs/ReloadConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->reloadConfig:Lco/bird/android/model/wire/configs/ReloadConfig;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->suggestPaypalOnPaymentAddError:Z

    return v0
.end method

.method public final component20()Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->selfBalanceRefund:Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;

    return-object v0
.end method

.method public final component21()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceRegionsRequiringCreditPostalCode:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/AutoPayPaymentType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->preloadDefaultOptions:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->chargeAutoPayUpdatesAtOrLessThanZeroBalance:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->connectedAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableGooglePayBonus:Z

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->googlePayBonusAmount:I

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableCashpay:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPayment:Z

    return v0
.end method

.method public final copy(ZZLjava/util/List;ZLjava/lang/String;ZIZZLco/bird/android/model/constant/OnboardingQuickPaymentStyle;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lco/bird/android/model/wire/configs/AdyenConfig;Lco/bird/android/model/constant/DeviceVerificationMethod;Lco/bird/android/model/wire/configs/BankRedirectConfig;Lco/bird/android/model/constant/CardScannerStyle;Lco/bird/android/model/wire/configs/ReloadConfig;Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;Ljava/util/List;)Lco/bird/android/model/wire/configs/PaymentConfig;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/AutoPayPaymentType;",
            ">;Z",
            "Ljava/lang/String;",
            "ZIZZ",
            "Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentMethod;",
            "+",
            "Lco/bird/android/model/constant/PaymentProvider;",
            ">;",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentProvider;",
            "Ljava/lang/Integer;",
            ">;",
            "Lco/bird/android/model/wire/configs/AdyenConfig;",
            "Lco/bird/android/model/constant/DeviceVerificationMethod;",
            "Lco/bird/android/model/wire/configs/BankRedirectConfig;",
            "Lco/bird/android/model/constant/CardScannerStyle;",
            "Lco/bird/android/model/wire/configs/ReloadConfig;",
            "Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lco/bird/android/model/wire/configs/PaymentConfig;"
        }
    .end annotation

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    const-string v0, "connectedAccountId"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "testPaymentMethods"

    move-object/from16 v1, p12

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bankRedirectConfig"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reloadConfig"

    move-object/from16 v1, p19

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selfBalanceRefund"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v22, Lco/bird/android/model/wire/configs/PaymentConfig;

    move-object/from16 v0, v22

    move/from16 v1, p1

    invoke-direct/range {v0 .. v21}, Lco/bird/android/model/wire/configs/PaymentConfig;-><init>(ZZLjava/util/List;ZLjava/lang/String;ZIZZLco/bird/android/model/constant/OnboardingQuickPaymentStyle;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lco/bird/android/model/wire/configs/AdyenConfig;Lco/bird/android/model/constant/DeviceVerificationMethod;Lco/bird/android/model/wire/configs/BankRedirectConfig;Lco/bird/android/model/constant/CardScannerStyle;Lco/bird/android/model/wire/configs/ReloadConfig;Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;Ljava/util/List;)V

    return-object v22
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/PaymentConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/PaymentConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enablePaypal:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->enablePaypal:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->suggestPaypalOnPaymentAddError:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->suggestPaypalOnPaymentAddError:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->preloadDefaultOptions:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->preloadDefaultOptions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->chargeAutoPayUpdatesAtOrLessThanZeroBalance:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->chargeAutoPayUpdatesAtOrLessThanZeroBalance:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->connectedAccountId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->connectedAccountId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableGooglePayBonus:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->enableGooglePayBonus:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->googlePayBonusAmount:I

    iget v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->googlePayBonusAmount:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableCashpay:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->enableCashpay:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPayment:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPayment:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPaymentStyle:Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPaymentStyle:Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentSettingsV2:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentSettingsV2:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->testPaymentMethods:Ljava/util/Map;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->testPaymentMethods:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentMethodToProvider:Ljava/util/Map;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentMethodToProvider:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentProviderEndpointVersions:Ljava/util/Map;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentProviderEndpointVersions:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->adyenConfig:Lco/bird/android/model/wire/configs/AdyenConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->adyenConfig:Lco/bird/android/model/wire/configs/AdyenConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceVerificationMethod:Lco/bird/android/model/constant/DeviceVerificationMethod;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceVerificationMethod:Lco/bird/android/model/constant/DeviceVerificationMethod;

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->bankRedirectConfig:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->bankRedirectConfig:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->cardScannerStyle:Lco/bird/android/model/constant/CardScannerStyle;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->cardScannerStyle:Lco/bird/android/model/constant/CardScannerStyle;

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->reloadConfig:Lco/bird/android/model/wire/configs/ReloadConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->reloadConfig:Lco/bird/android/model/wire/configs/ReloadConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->selfBalanceRefund:Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->selfBalanceRefund:Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceRegionsRequiringCreditPostalCode:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceRegionsRequiringCreditPostalCode:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    return v2

    :cond_16
    return v0
.end method

.method public final getAdyenConfig()Lco/bird/android/model/wire/configs/AdyenConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->adyenConfig:Lco/bird/android/model/wire/configs/AdyenConfig;

    return-object v0
.end method

.method public final getBankRedirectConfig()Lco/bird/android/model/wire/configs/BankRedirectConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->bankRedirectConfig:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    return-object v0
.end method

.method public final getCardScannerStyle()Lco/bird/android/model/constant/CardScannerStyle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->cardScannerStyle:Lco/bird/android/model/constant/CardScannerStyle;

    return-object v0
.end method

.method public final getChargeAutoPayUpdatesAtOrLessThanZeroBalance()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->chargeAutoPayUpdatesAtOrLessThanZeroBalance:Z

    return v0
.end method

.method public final getConnectedAccountId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->connectedAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeviceRegionsRequiringCreditPostalCode()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceRegionsRequiringCreditPostalCode:Ljava/util/List;

    return-object v0
.end method

.method public final getDeviceVerificationMethod()Lco/bird/android/model/constant/DeviceVerificationMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceVerificationMethod:Lco/bird/android/model/constant/DeviceVerificationMethod;

    return-object v0
.end method

.method public final getEnableCashpay()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableCashpay:Z

    return v0
.end method

.method public final getEnableGooglePayBonus()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableGooglePayBonus:Z

    return v0
.end method

.method public final getEnablePaypal()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enablePaypal:Z

    return v0
.end method

.method public final getGooglePayBonusAmount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->googlePayBonusAmount:I

    return v0
.end method

.method public final getOnboardingQuickPayment()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPayment:Z

    return v0
.end method

.method public final getOnboardingQuickPaymentStyle()Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPaymentStyle:Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;

    return-object v0
.end method

.method public final getPaymentMethodToProvider()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentMethod;",
            "Lco/bird/android/model/constant/PaymentProvider;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentMethodToProvider:Ljava/util/Map;

    return-object v0
.end method

.method public final getPaymentProviderEndpointVersions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentProvider;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentProviderEndpointVersions:Ljava/util/Map;

    return-object v0
.end method

.method public final getPaymentSettingsV2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentSettingsV2:Z

    return v0
.end method

.method public final getPreloadDefaultOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/AutoPayPaymentType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->preloadDefaultOptions:Ljava/util/List;

    return-object v0
.end method

.method public final getReloadConfig()Lco/bird/android/model/wire/configs/ReloadConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->reloadConfig:Lco/bird/android/model/wire/configs/ReloadConfig;

    return-object v0
.end method

.method public final getSelfBalanceRefund()Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->selfBalanceRefund:Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;

    return-object v0
.end method

.method public final getSuggestPaypalOnPaymentAddError()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->suggestPaypalOnPaymentAddError:Z

    return v0
.end method

.method public final getTestPaymentMethods()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->testPaymentMethods:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enablePaypal:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->suggestPaypalOnPaymentAddError:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->preloadDefaultOptions:Ljava/util/List;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->chargeAutoPayUpdatesAtOrLessThanZeroBalance:Z

    if-eqz v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->connectedAccountId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableGooglePayBonus:Z

    if-eqz v2, :cond_4

    move v2, v1

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->googlePayBonusAmount:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableCashpay:Z

    if-eqz v2, :cond_5

    move v2, v1

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPayment:Z

    if-eqz v2, :cond_6

    move v2, v1

    :cond_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPaymentStyle:Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_1

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentSettingsV2:Z

    if-eqz v2, :cond_8

    goto :goto_2

    :cond_8
    move v1, v2

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->testPaymentMethods:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentMethodToProvider:Ljava/util/Map;

    if-nez v1, :cond_9

    move v1, v3

    goto :goto_3

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentProviderEndpointVersions:Ljava/util/Map;

    if-nez v1, :cond_a

    move v1, v3

    goto :goto_4

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->adyenConfig:Lco/bird/android/model/wire/configs/AdyenConfig;

    if-nez v1, :cond_b

    move v1, v3

    goto :goto_5

    :cond_b
    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/AdyenConfig;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceVerificationMethod:Lco/bird/android/model/constant/DeviceVerificationMethod;

    if-nez v1, :cond_c

    move v1, v3

    goto :goto_6

    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->bankRedirectConfig:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/BankRedirectConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->cardScannerStyle:Lco/bird/android/model/constant/CardScannerStyle;

    if-nez v1, :cond_d

    move v1, v3

    goto :goto_7

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->reloadConfig:Lco/bird/android/model/wire/configs/ReloadConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/ReloadConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->selfBalanceRefund:Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceRegionsRequiringCreditPostalCode:Ljava/util/List;

    if-nez v1, :cond_e

    goto :goto_8

    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->enablePaypal:Z

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->suggestPaypalOnPaymentAddError:Z

    iget-object v3, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->preloadDefaultOptions:Ljava/util/List;

    iget-boolean v4, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->chargeAutoPayUpdatesAtOrLessThanZeroBalance:Z

    iget-object v5, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->connectedAccountId:Ljava/lang/String;

    iget-boolean v6, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableGooglePayBonus:Z

    iget v7, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->googlePayBonusAmount:I

    iget-boolean v8, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->enableCashpay:Z

    iget-boolean v9, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPayment:Z

    iget-object v10, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->onboardingQuickPaymentStyle:Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;

    iget-boolean v11, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentSettingsV2:Z

    iget-object v12, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->testPaymentMethods:Ljava/util/Map;

    iget-object v13, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentMethodToProvider:Ljava/util/Map;

    iget-object v14, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->paymentProviderEndpointVersions:Ljava/util/Map;

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->adyenConfig:Lco/bird/android/model/wire/configs/AdyenConfig;

    move-object/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceVerificationMethod:Lco/bird/android/model/constant/DeviceVerificationMethod;

    move-object/from16 v17, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->bankRedirectConfig:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    move-object/from16 v18, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->cardScannerStyle:Lco/bird/android/model/constant/CardScannerStyle;

    move-object/from16 v19, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->reloadConfig:Lco/bird/android/model/wire/configs/ReloadConfig;

    move-object/from16 v20, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->selfBalanceRefund:Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;

    move-object/from16 v21, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/PaymentConfig;->deviceRegionsRequiringCreditPostalCode:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v22, v15

    const-string v15, "PaymentConfig(enablePaypal="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", suggestPaypalOnPaymentAddError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", preloadDefaultOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", chargeAutoPayUpdatesAtOrLessThanZeroBalance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", connectedAccountId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", enableGooglePayBonus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", googlePayBonusAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", enableCashpay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", onboardingQuickPayment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", onboardingQuickPaymentStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentSettingsV2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", testPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodToProvider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentProviderEndpointVersions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", adyenConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceVerificationMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bankRedirectConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardScannerStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reloadConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selfBalanceRefund="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceRegionsRequiringCreditPostalCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
