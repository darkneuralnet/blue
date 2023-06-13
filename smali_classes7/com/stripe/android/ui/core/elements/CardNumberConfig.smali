.class public final Lcom/stripe/android/ui/core/elements/CardNumberConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008#\u0010$J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R#\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0012\u001a\u0004\u0008\u001a\u0010\u0014R#\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0012\u001a\u0004\u0008\u001d\u0010\u0014R\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardNumberConfig;",
        "Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;",
        "Lcom/stripe/android/model/CardBrand;",
        "brand",
        "",
        "number",
        "",
        "numberAllowedDigits",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "determineState",
        "userTyped",
        "filter",
        "displayName",
        "convertToRaw",
        "rawValue",
        "convertFromRaw",
        "Lal2;",
        "capitalization",
        "I",
        "getCapitalization-IUNYP9k",
        "()I",
        "debugLabel",
        "Ljava/lang/String;",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "label",
        "getLabel",
        "Lcl2;",
        "keyboard",
        "getKeyboard-PjHm6EE",
        "LEu6;",
        "visualTransformation",
        "LEu6;",
        "getVisualTransformation",
        "()LEu6;",
        "<init>",
        "()V",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCardNumberConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberConfig.kt\ncom/stripe/android/ui/core/elements/CardNumberConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,44:1\n429#2:45\n502#2,5:46\n*S KotlinDebug\n*F\n+ 1 CardNumberConfig.kt\ncom/stripe/android/ui/core/elements/CardNumberConfig\n*L\n38#1:45\n38#1:46,5\n*E\n"
    }
.end annotation


# instance fields
.field private final capitalization:I

.field private final debugLabel:Ljava/lang/String;

.field private final keyboard:I

.field private final label:I

.field private final visualTransformation:LEu6;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lal2;->a:Lal2$a;

    invoke-virtual {v0}, Lal2$a;->b()I

    move-result v0

    iput v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->capitalization:I

    const-string v0, "Card number"

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->debugLabel:Ljava/lang/String;

    sget v0, Lcom/stripe/android/ui/core/R$string;->acc_label_card_number:I

    iput v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->label:I

    sget-object v0, Lcl2;->b:Lcl2$a;

    invoke-virtual {v0}, Lcl2$a;->e()I

    move-result v0

    iput v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->keyboard:I

    new-instance v0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;-><init>(C)V

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->visualTransformation:LEu6;

    return-void
.end method


# virtual methods
.method public convertFromRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public convertToRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public determineState(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;I)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 5

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "number"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/CardUtils;->INSTANCE:Lcom/stripe/android/CardUtils;

    invoke-virtual {v0, p2}, Lcom/stripe/android/CardUtils;->isValidLuhnNumber(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1, p2}, Lcom/stripe/android/model/CardBrand;->getMaxLengthForCardNumber(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    goto :goto_1

    :cond_1
    sget-object v2, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne p1, v2, :cond_2

    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget p2, Lcom/stripe/android/ui/core/R$string;->invalid_card_number:I

    invoke-direct {p1, p2, v4, v3, v4}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p1, p3, :cond_3

    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;

    sget p2, Lcom/stripe/android/ui/core/R$string;->invalid_card_number:I

    invoke-direct {p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;-><init>(I)V

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget p2, Lcom/stripe/android/ui/core/R$string;->invalid_card_number:I

    invoke-direct {p1, p2, v4, v3, v4}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-ne p1, p3, :cond_5

    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;

    goto :goto_1

    :cond_5
    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget p2, Lcom/stripe/android/ui/core/R$string;->invalid_card_number:I

    invoke-direct {p1, p2, v4, v3, v4}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    return-object p1
.end method

.method public filter(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "filterTo(StringBuilder(), predicate).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->capitalization:I

    return v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyboard-PjHm6EE()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->keyboard:I

    return v0
.end method

.method public getLabel()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->label:I

    return v0
.end method

.method public getVisualTransformation()LEu6;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->visualTransformation:LEu6;

    return-object v0
.end method
