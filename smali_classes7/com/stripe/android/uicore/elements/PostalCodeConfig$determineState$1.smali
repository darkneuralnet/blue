.class public final Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldState;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/PostalCodeConfig;->determineState(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "com/stripe/android/uicore/elements/PostalCodeConfig$determineState$1",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "getError",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "isBlank",
        "",
        "isFull",
        "isValid",
        "shouldShowError",
        "hasFocus",
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


# instance fields
.field final synthetic $input:Ljava/lang/String;

.field final synthetic this$0:Lcom/stripe/android/uicore/elements/PostalCodeConfig;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/PostalCodeConfig;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->this$0:Lcom/stripe/android/uicore/elements/PostalCodeConfig;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->$input:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getError()Lcom/stripe/android/uicore/elements/FieldError;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->$input:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->this$0:Lcom/stripe/android/uicore/elements/PostalCodeConfig;

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->access$getCountry$p(Lcom/stripe/android/uicore/elements/PostalCodeConfig;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "US"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/stripe/android/uicore/elements/FieldError;

    sget v3, Lcom/stripe/android/uicore/R$string;->address_zip_invalid:I

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/stripe/android/uicore/elements/FieldError;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->$input:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->isValid()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/stripe/android/uicore/elements/FieldError;

    sget v3, Lcom/stripe/android/uicore/R$string;->address_zip_postal_invalid:I

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/stripe/android/uicore/elements/FieldError;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-object v2
.end method

.method public isBlank()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->$input:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public isFull()Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->$input:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->this$0:Lcom/stripe/android/uicore/elements/PostalCodeConfig;

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->access$getFormat$p(Lcom/stripe/android/uicore/elements/PostalCodeConfig;)Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->getMaximumLength()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isValid()Z
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->this$0:Lcom/stripe/android/uicore/elements/PostalCodeConfig;

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->access$getFormat$p(Lcom/stripe/android/uicore/elements/PostalCodeConfig;)Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    move-result-object v0

    instance-of v0, v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->$input:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move v1, v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->this$0:Lcom/stripe/android/uicore/elements/PostalCodeConfig;

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->access$getFormat$p(Lcom/stripe/android/uicore/elements/PostalCodeConfig;)Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->getMinimumLength()I

    move-result v0

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->this$0:Lcom/stripe/android/uicore/elements/PostalCodeConfig;

    invoke-static {v3}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->access$getFormat$p(Lcom/stripe/android/uicore/elements/PostalCodeConfig;)Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->getMaximumLength()I

    move-result v3

    iget-object v4, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->$input:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v0, v4, :cond_2

    if-gt v4, v3, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->$input:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->this$0:Lcom/stripe/android/uicore/elements/PostalCodeConfig;

    invoke-static {v3}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->access$getFormat$p(Lcom/stripe/android/uicore/elements/PostalCodeConfig;)Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->getRegexPattern()Lkotlin/text/Regex;

    move-result-object v3

    invoke-virtual {v3, v0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    return v1
.end method

.method public shouldShowError(Z)Z
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;->getError()Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
