.class public final Lcom/stripe/android/ui/core/elements/CvcConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008#\u0010$J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R#\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0012\u001a\u0004\u0008\u001a\u0010\u0014R#\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0012\u001a\u0004\u0008\u001d\u0010\u0014R\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CvcConfig;",
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
        "SMAP\nCvcConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CvcConfig.kt\ncom/stripe/android/ui/core/elements/CvcConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,50:1\n429#2:51\n502#2,5:52\n*S KotlinDebug\n*F\n+ 1 CvcConfig.kt\ncom/stripe/android/ui/core/elements/CvcConfig\n*L\n44#1:51\n44#1:52,5\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final capitalization:I

.field private final debugLabel:Ljava/lang/String;

.field private final keyboard:I

.field private final label:I

.field private final visualTransformation:LEu6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lal2;->a:Lal2$a;

    invoke-virtual {v0}, Lal2$a;->b()I

    move-result v0

    iput v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->capitalization:I

    const-string v0, "cvc"

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->debugLabel:Ljava/lang/String;

    sget v0, Lcom/stripe/android/ui/core/R$string;->cvc_number_hint:I

    iput v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->label:I

    sget-object v0, Lcl2;->b:Lcl2$a;

    invoke-virtual {v0}, Lcl2$a;->e()I

    move-result v0

    iput v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->keyboard:I

    sget-object v0, LEu6;->a:LEu6$a;

    invoke-virtual {v0}, LEu6$a;->a()LEu6;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->visualTransformation:LEu6;

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
    .locals 4

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "number"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getMaxCvcLength()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v2, :cond_2

    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    goto :goto_3

    :cond_2
    sget-object v1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    if-ne p1, v1, :cond_4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-ne p1, p3, :cond_3

    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;

    goto :goto_3

    :cond_3
    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Limitless;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Limitless;

    goto :goto_3

    :cond_4
    if-eqz v0, :cond_5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p1, p3, :cond_5

    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;

    sget p2, Lcom/stripe/android/ui/core/R$string;->invalid_cvc:I

    invoke-direct {p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;-><init>(I)V

    goto :goto_3

    :cond_5
    const/4 p1, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, p3, :cond_6

    new-instance p2, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget p3, Lcom/stripe/android/ui/core/R$string;->invalid_cvc:I

    invoke-direct {p2, p3, v1, p1, v1}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_6
    if-eqz v0, :cond_7

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-ne p2, p3, :cond_7

    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;

    goto :goto_3

    :cond_7
    new-instance p2, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget p3, Lcom/stripe/android/ui/core/R$string;->invalid_cvc:I

    invoke-direct {p2, p3, v1, p1, v1}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    move-object p1, p2

    :goto_3
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

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->capitalization:I

    return v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyboard-PjHm6EE()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->keyboard:I

    return v0
.end method

.method public getLabel()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->label:I

    return v0
.end method

.method public getVisualTransformation()LEu6;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->visualTransformation:LEu6;

    return-object v0
.end method
