.class public final Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEu6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;",
        "LEu6;",
        "LDf;",
        "text",
        "LA96;",
        "postalForCanada",
        "filter",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;",
        "format",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;",
        "getFormat",
        "()Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;)V",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;)V
    .locals 1

    const-string v0, "format"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;->format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    return-void
.end method

.method private final postalForCanada(LDf;)LA96;
    .locals 9

    invoke-virtual {p1}, LDf;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    move-object v4, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p1}, LDf;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    move-object v4, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation$postalForCanada$postalCodeOffsetTranslator$1;

    invoke-direct {p1}, Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation$postalForCanada$postalCodeOffsetTranslator$1;-><init>()V

    new-instance v0, LA96;

    new-instance v1, LDf;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, LDf;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, p1}, LA96;-><init>(LDf;LHe3;)V

    return-object v0
.end method


# virtual methods
.method public filter(LDf;)LA96;
    .locals 2

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;->format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    instance-of v0, v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;->postalForCanada(LDf;)LA96;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, LA96;

    sget-object v1, LHe3;->a:LHe3$a;

    invoke-virtual {v1}, LHe3$a;->a()LHe3;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LA96;-><init>(LDf;LHe3;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final getFormat()Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;->format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    return-object v0
.end method
