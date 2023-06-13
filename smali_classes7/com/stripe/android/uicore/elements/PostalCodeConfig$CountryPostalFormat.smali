.class public abstract Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/PostalCodeConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "CountryPostalFormat"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;,
        Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;,
        Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;,
        Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u000e2\u00020\u0001:\u0004\r\u000e\u000f\u0010B\u001f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0001\u0003\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;",
        "",
        "minimumLength",
        "",
        "maximumLength",
        "regexPattern",
        "Lkotlin/text/Regex;",
        "(IILkotlin/text/Regex;)V",
        "getMaximumLength",
        "()I",
        "getMinimumLength",
        "getRegexPattern",
        "()Lkotlin/text/Regex;",
        "CA",
        "Companion",
        "Other",
        "US",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;",
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

.field public static final Companion:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;


# instance fields
.field private final maximumLength:I

.field private final minimumLength:I

.field private final regexPattern:Lkotlin/text/Regex;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->Companion:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->$stable:I

    return-void
.end method

.method private constructor <init>(IILkotlin/text/Regex;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->minimumLength:I

    iput p2, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->maximumLength:I

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->regexPattern:Lkotlin/text/Regex;

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/text/Regex;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;-><init>(IILkotlin/text/Regex;)V

    return-void
.end method


# virtual methods
.method public final getMaximumLength()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->maximumLength:I

    return v0
.end method

.method public final getMinimumLength()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->minimumLength:I

    return v0
.end method

.method public final getRegexPattern()Lkotlin/text/Regex;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->regexPattern:Lkotlin/text/Regex;

    return-object v0
.end method
