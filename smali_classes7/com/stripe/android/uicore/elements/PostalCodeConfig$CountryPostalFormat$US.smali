.class public final Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;
.super Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "US"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;",
        "()V",
        "stripe-ui-core_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\d+"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-direct {p0, v2, v2, v0, v1}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;-><init>(IILkotlin/text/Regex;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
