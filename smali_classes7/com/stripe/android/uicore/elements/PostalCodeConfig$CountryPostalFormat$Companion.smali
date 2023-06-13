.class public final Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;",
        "",
        "()V",
        "forCountry",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;",
        "country",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final forCountry(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
    .locals 1

    const-string v0, "country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "US"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;

    goto :goto_0

    :cond_0
    const-string v0, "CA"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;

    :goto_0
    return-object p1
.end method
