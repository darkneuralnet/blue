.class public final enum Lcom/stripe/android/networking/PaymentAnalyticsEvent;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/networking/AnalyticsEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
        ">;",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008C\u0008\u0080\u0001\u0018\u0000 F2\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001FB\u000f\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\n\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(j\u0002\u0008)j\u0002\u0008*j\u0002\u0008+j\u0002\u0008,j\u0002\u0008-j\u0002\u0008.j\u0002\u0008/j\u0002\u00080j\u0002\u00081j\u0002\u00082j\u0002\u00083j\u0002\u00084j\u0002\u00085j\u0002\u00086j\u0002\u00087j\u0002\u00088j\u0002\u00089j\u0002\u0008:j\u0002\u0008;j\u0002\u0008<j\u0002\u0008=j\u0002\u0008>j\u0002\u0008?j\u0002\u0008@j\u0002\u0008Aj\u0002\u0008Bj\u0002\u0008Cj\u0002\u0008Dj\u0002\u0008E\u00a8\u0006G"
    }
    d2 = {
        "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
        "",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "code",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "eventName",
        "getEventName",
        "toString",
        "TokenCreate",
        "PaymentMethodCreate",
        "CustomerRetrieve",
        "CustomerRetrievePaymentMethods",
        "CustomerAttachPaymentMethod",
        "CustomerDetachPaymentMethod",
        "CustomerDeleteSource",
        "CustomerSetShippingInfo",
        "CustomerAddSource",
        "CustomerSetDefaultSource",
        "IssuingRetrievePin",
        "IssuingUpdatePin",
        "SourceCreate",
        "SourceRetrieve",
        "PaymentIntentConfirm",
        "PaymentIntentRetrieve",
        "PaymentIntentRetrieveOrdered",
        "PaymentIntentCancelSource",
        "PaymentIntentRefresh",
        "SetupIntentConfirm",
        "SetupIntentRetrieve",
        "SetupIntentRetrieveOrdered",
        "SetupIntentCancelSource",
        "FileCreate",
        "Auth3ds1Sdk",
        "Auth3ds1ChallengeStart",
        "Auth3ds1ChallengeError",
        "Auth3ds1ChallengeComplete",
        "AuthWithWebView",
        "AuthWithCustomTabs",
        "AuthWithDefaultBrowser",
        "ConfirmReturnUrlNull",
        "ConfirmReturnUrlDefault",
        "ConfirmReturnUrlCustom",
        "FpxBankStatusesRetrieve",
        "StripeUrlRetrieve",
        "Auth3ds2RequestParamsFailed",
        "Auth3ds2Fingerprint",
        "Auth3ds2Start",
        "Auth3ds2Frictionless",
        "Auth3ds2ChallengePresented",
        "Auth3ds2ChallengeCanceled",
        "Auth3ds2ChallengeCompleted",
        "Auth3ds2ChallengeErrored",
        "Auth3ds2ChallengeTimedOut",
        "Auth3ds2Fallback",
        "AuthRedirect",
        "AuthError",
        "AuthSourceStart",
        "AuthSourceRedirect",
        "AuthSourceResult",
        "RadarSessionCreate",
        "GooglePayLauncherInit",
        "GooglePayPaymentMethodLauncherInit",
        "CardMetadataPublishableKeyAvailable",
        "CardMetadataPublishableKeyUnavailable",
        "CardMetadataLoadedTooSlow",
        "CardMetadataLoadFailure",
        "CardMetadataMissingRange",
        "Companion",
        "payments-core_release"
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds1ChallengeComplete:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds1ChallengeError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds1ChallengeStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds1Sdk:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2ChallengeCanceled:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2ChallengeCompleted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2ChallengeErrored:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2ChallengePresented:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2ChallengeTimedOut:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2Fallback:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2Fingerprint:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2Frictionless:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2RequestParamsFailed:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2Start:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthSourceRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthSourceResult:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthSourceStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthWithCustomTabs:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthWithDefaultBrowser:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthWithWebView:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataLoadFailure:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataLoadedTooSlow:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataMissingRange:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataPublishableKeyAvailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataPublishableKeyUnavailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field private static final Companion:Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;

.field public static final enum ConfirmReturnUrlCustom:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum ConfirmReturnUrlDefault:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum ConfirmReturnUrlNull:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerAddSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerAttachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerDeleteSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerDetachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerRetrievePaymentMethods:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerSetDefaultSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerSetShippingInfo:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum FileCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum FpxBankStatusesRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum GooglePayLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum GooglePayPaymentMethodLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum IssuingRetrievePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum IssuingUpdatePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field private static final PREFIX:Ljava/lang/String; = "stripe_android"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum PaymentIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentMethodCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum RadarSessionCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SetupIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SetupIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SetupIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SetupIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SourceCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SourceRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum StripeUrlRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum TokenCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/networking/PaymentAnalyticsEvent;
    .locals 3

    const/16 v0, 0x3b

    new-array v0, v0, [Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->TokenCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentMethodCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerRetrievePaymentMethods:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerAttachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerDetachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerDeleteSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerSetShippingInfo:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerAddSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerSetDefaultSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->IssuingRetrievePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->IssuingUpdatePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SourceCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SourceRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x17

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->FileCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x18

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1Sdk:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x19

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeComplete:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithWebView:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithCustomTabs:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithDefaultBrowser:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlNull:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x20

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlDefault:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x21

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlCustom:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x22

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->FpxBankStatusesRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x23

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->StripeUrlRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x24

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2RequestParamsFailed:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x25

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Fingerprint:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x26

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Start:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x27

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Frictionless:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x28

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengePresented:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x29

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCanceled:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x2a

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCompleted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x2b

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeErrored:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x2c

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeTimedOut:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x2d

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Fallback:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x2e

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x2f

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x30

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x31

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x32

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceResult:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x33

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->RadarSessionCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x34

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->GooglePayLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x35

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->GooglePayPaymentMethodLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x36

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataPublishableKeyAvailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x37

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataPublishableKeyUnavailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x38

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadedTooSlow:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x39

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadFailure:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    const/16 v1, 0x3a

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataMissingRange:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x0

    const-string v2, "token_creation"

    const-string v3, "TokenCreate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->TokenCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x1

    const-string v2, "payment_method_creation"

    const-string v3, "PaymentMethodCreate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentMethodCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x2

    const-string v2, "retrieve_customer"

    const-string v3, "CustomerRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x3

    const-string v2, "retrieve_payment_methods"

    const-string v3, "CustomerRetrievePaymentMethods"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerRetrievePaymentMethods:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x4

    const-string v2, "attach_payment_method"

    const-string v3, "CustomerAttachPaymentMethod"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerAttachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x5

    const-string v2, "detach_payment_method"

    const-string v3, "CustomerDetachPaymentMethod"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerDetachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x6

    const-string v2, "delete_source"

    const-string v3, "CustomerDeleteSource"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerDeleteSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x7

    const-string v2, "set_shipping_info"

    const-string v3, "CustomerSetShippingInfo"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerSetShippingInfo:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x8

    const-string v2, "add_source"

    const-string v3, "CustomerAddSource"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerAddSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x9

    const-string v2, "default_source"

    const-string v3, "CustomerSetDefaultSource"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerSetDefaultSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xa

    const-string v2, "issuing_retrieve_pin"

    const-string v3, "IssuingRetrievePin"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->IssuingRetrievePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xb

    const-string v2, "issuing_update_pin"

    const-string v3, "IssuingUpdatePin"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->IssuingUpdatePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xc

    const-string v2, "source_creation"

    const-string v3, "SourceCreate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SourceCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xd

    const-string v2, "retrieve_source"

    const-string v3, "SourceRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SourceRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xe

    const-string v2, "payment_intent_confirmation"

    const-string v3, "PaymentIntentConfirm"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xf

    const-string v2, "payment_intent_retrieval"

    const-string v3, "PaymentIntentRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x10

    const-string v2, "payment_intent_retrieval_ordered"

    const-string v3, "PaymentIntentRetrieveOrdered"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x11

    const-string v2, "payment_intent_cancel_source"

    const-string v3, "PaymentIntentCancelSource"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x12

    const-string v2, "payment_intent_refresh"

    const-string v3, "PaymentIntentRefresh"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x13

    const-string v2, "setup_intent_confirmation"

    const-string v3, "SetupIntentConfirm"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x14

    const-string v2, "setup_intent_retrieval"

    const-string v3, "SetupIntentRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x15

    const-string v2, "setup_intent_retrieval_ordered"

    const-string v3, "SetupIntentRetrieveOrdered"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x16

    const-string v2, "setup_intent_cancel_source"

    const-string v3, "SetupIntentCancelSource"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x17

    const-string v2, "create_file"

    const-string v3, "FileCreate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->FileCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x18

    const-string v2, "3ds1_sdk"

    const-string v3, "Auth3ds1Sdk"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1Sdk:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x19

    const-string v2, "3ds1_challenge_start"

    const-string v3, "Auth3ds1ChallengeStart"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1a

    const-string v2, "3ds1_challenge_error"

    const-string v3, "Auth3ds1ChallengeError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1b

    const-string v2, "3ds1_challenge_complete"

    const-string v3, "Auth3ds1ChallengeComplete"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeComplete:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1c

    const-string v2, "auth_with_webview"

    const-string v3, "AuthWithWebView"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithWebView:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1d

    const-string v2, "auth_with_customtabs"

    const-string v3, "AuthWithCustomTabs"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithCustomTabs:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1e

    const-string v2, "auth_with_defaultbrowser"

    const-string v3, "AuthWithDefaultBrowser"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithDefaultBrowser:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1f

    const-string v2, "confirm_returnurl_null"

    const-string v3, "ConfirmReturnUrlNull"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlNull:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x20

    const-string v2, "confirm_returnurl_default"

    const-string v3, "ConfirmReturnUrlDefault"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlDefault:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x21

    const-string v2, "confirm_returnurl_custom"

    const-string v3, "ConfirmReturnUrlCustom"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlCustom:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x22

    const-string v2, "retrieve_fpx_bank_statuses"

    const-string v3, "FpxBankStatusesRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->FpxBankStatusesRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x23

    const-string v2, "retrieve_stripe_url"

    const-string v3, "StripeUrlRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->StripeUrlRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x24

    const-string v2, "3ds2_authentication_request_params_failed"

    const-string v3, "Auth3ds2RequestParamsFailed"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2RequestParamsFailed:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x25

    const-string v2, "3ds2_fingerprint"

    const-string v3, "Auth3ds2Fingerprint"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Fingerprint:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x26

    const-string v2, "3ds2_authenticate"

    const-string v3, "Auth3ds2Start"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Start:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x27

    const-string v2, "3ds2_frictionless_flow"

    const-string v3, "Auth3ds2Frictionless"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Frictionless:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x28

    const-string v2, "3ds2_challenge_flow_presented"

    const-string v3, "Auth3ds2ChallengePresented"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengePresented:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x29

    const-string v2, "3ds2_challenge_flow_canceled"

    const-string v3, "Auth3ds2ChallengeCanceled"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCanceled:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2a

    const-string v2, "3ds2_challenge_flow_completed"

    const-string v3, "Auth3ds2ChallengeCompleted"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCompleted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2b

    const-string v2, "3ds2_challenge_flow_errored"

    const-string v3, "Auth3ds2ChallengeErrored"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeErrored:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2c

    const-string v2, "3ds2_challenge_flow_timed_out"

    const-string v3, "Auth3ds2ChallengeTimedOut"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeTimedOut:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2d

    const-string v2, "3ds2_fallback"

    const-string v3, "Auth3ds2Fallback"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Fallback:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2e

    const-string v2, "url_redirect_next_action"

    const-string v3, "AuthRedirect"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2f

    const-string v2, "auth_error"

    const-string v3, "AuthError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x30

    const-string v2, "auth_source_start"

    const-string v3, "AuthSourceStart"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x31

    const-string v2, "auth_source_redirect"

    const-string v3, "AuthSourceRedirect"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x32

    const-string v2, "auth_source_result"

    const-string v3, "AuthSourceResult"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceResult:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x33

    const-string v2, "radar_session_create"

    const-string v3, "RadarSessionCreate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->RadarSessionCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x34

    const-string v2, "googlepaylauncher_init"

    const-string v3, "GooglePayLauncherInit"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->GooglePayLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x35

    const-string v2, "googlepaypaymentmethodlauncher_init"

    const-string v3, "GooglePayPaymentMethodLauncherInit"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->GooglePayPaymentMethodLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x36

    const-string v2, "card_metadata_pk_available"

    const-string v3, "CardMetadataPublishableKeyAvailable"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataPublishableKeyAvailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x37

    const-string v2, "card_metadata_pk_unavailable"

    const-string v3, "CardMetadataPublishableKeyUnavailable"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataPublishableKeyUnavailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x38

    const-string v2, "card_metadata_loaded_too_slow"

    const-string v3, "CardMetadataLoadedTooSlow"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadedTooSlow:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x39

    const-string v2, "card_metadata_load_failure"

    const-string v3, "CardMetadataLoadFailure"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadFailure:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x3a

    const-string v2, "card_metadata_missing_range"

    const-string v3, "CardMetadataMissingRange"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataMissingRange:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-static {}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->$values()[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->$VALUES:[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Companion:Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->code:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/networking/PaymentAnalyticsEvent;
    .locals 1

    const-class v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/networking/PaymentAnalyticsEvent;
    .locals 1

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->$VALUES:[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->code:Ljava/lang/String;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->code:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stripe_android."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
