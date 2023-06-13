.class public abstract Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/networking/AnalyticsEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptionForm;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u0000 \n2\u00020\u0001:\t\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u0082\u0001\u0008\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "()V",
        "additionalParams",
        "",
        "",
        "",
        "getAdditionalParams",
        "()Ljava/util/Map;",
        "AutofillEvent",
        "Companion",
        "Dismiss",
        "Init",
        "LpmSerializeFailureEvent",
        "Payment",
        "SelectPaymentOption",
        "ShowExistingPaymentOptions",
        "ShowNewPaymentOptionForm",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptionForm;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;

.field public static final FIELD_APPEARANCE:Ljava/lang/String; = "appearance"

.field public static final FIELD_APPEARANCE_USAGE:Ljava/lang/String; = "usage"

.field public static final FIELD_BILLING:Ljava/lang/String; = "default_billing_details"

.field public static final FIELD_BORDER_WIDTH:Ljava/lang/String; = "border_width"

.field public static final FIELD_COLORS_DARK:Ljava/lang/String; = "colorsDark"

.field public static final FIELD_COLORS_LIGHT:Ljava/lang/String; = "colorsLight"

.field public static final FIELD_CORNER_RADIUS:Ljava/lang/String; = "corner_radius"

.field public static final FIELD_CUSTOMER:Ljava/lang/String; = "customer"

.field public static final FIELD_DELAYED_PMS:Ljava/lang/String; = "allows_delayed_payment_methods"

.field public static final FIELD_FONT:Ljava/lang/String; = "font"

.field public static final FIELD_GOOGLE_PAY:Ljava/lang/String; = "googlepay"

.field public static final FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION:Ljava/lang/String; = "mpe_config"

.field public static final FIELD_PRIMARY_BUTTON:Ljava/lang/String; = "primary_button"

.field public static final FIELD_PRIMARY_BUTTON_COLOR:Ljava/lang/String; = "primary_button_color"

.field public static final FIELD_SIZE_SCALE_FACTOR:Ljava/lang/String; = "size_scale_factor"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->Companion:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getAdditionalParams()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method
