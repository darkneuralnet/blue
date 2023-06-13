.class public final Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEu6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;",
        "LEu6;",
        "LDf;",
        "text",
        "LA96;",
        "space4and11",
        "space4and9and14",
        "space4and9and14and19",
        "filter",
        "",
        "separator",
        "C",
        "",
        "binBasedMaxPan",
        "Ljava/lang/Integer;",
        "getBinBasedMaxPan$payments_ui_core_release",
        "()Ljava/lang/Integer;",
        "setBinBasedMaxPan$payments_ui_core_release",
        "(Ljava/lang/Integer;)V",
        "<init>",
        "(C)V",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private binBasedMaxPan:Ljava/lang/Integer;

.field private final separator:C


# direct methods
.method public constructor <init>(C)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->separator:C

    return-void
.end method

.method private final space4and11(LDf;)LA96;
    .locals 9

    invoke-virtual {p1}, LDf;->length()I

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    move-object v4, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p1, v2}, LDf;->charAt(I)C

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x3

    if-eq v2, v3, :cond_0

    const/16 v3, 0x9

    if-eq v2, v3, :cond_0

    :goto_1
    move-object v4, v1

    goto :goto_2

    :cond_0
    iget-char v3, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->separator:C

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation$space4and11$creditCardOffsetTranslator$1;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation$space4and11$creditCardOffsetTranslator$1;-><init>()V

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

.method private final space4and9and14(LDf;)LA96;
    .locals 9

    invoke-virtual {p1}, LDf;->length()I

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    move-object v4, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p1, v2}, LDf;->charAt(I)C

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    rem-int/lit8 v3, v2, 0x4

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    const/16 v3, 0xf

    if-ge v2, v3, :cond_0

    iget-char v3, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->separator:C

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    move-object v4, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation$space4and9and14$creditCardOffsetTranslator$1;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation$space4and9and14$creditCardOffsetTranslator$1;-><init>()V

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

.method private final space4and9and14and19(LDf;)LA96;
    .locals 9

    invoke-virtual {p1}, LDf;->length()I

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    move-object v4, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p1, v2}, LDf;->charAt(I)C

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    rem-int/lit8 v3, v2, 0x4

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    const/16 v3, 0x13

    if-ge v2, v3, :cond_0

    iget-char v3, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->separator:C

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    move-object v4, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation$space4and9and14and19$creditCardOffsetTranslator$1;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation$space4and9and14and19$creditCardOffsetTranslator$1;-><init>()V

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

    sget-object v0, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {p1}, LDf;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/CardBrand$Companion;->fromCardNumber(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->binBasedMaxPan:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LDf;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/CardBrand;->getMaxLengthForCardNumber(Ljava/lang/String;)I

    move-result v0

    :goto_0
    const/16 v1, 0x13

    if-eq v0, v1, :cond_1

    packed-switch v0, :pswitch_data_0

    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->space4and9and14(LDf;)LA96;

    move-result-object p1

    goto :goto_1

    :pswitch_0
    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->space4and9and14(LDf;)LA96;

    move-result-object p1

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->space4and11(LDf;)LA96;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->space4and9and14and19(LDf;)LA96;

    move-result-object p1

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getBinBasedMaxPan$payments_ui_core_release()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->binBasedMaxPan:Ljava/lang/Integer;

    return-object v0
.end method

.method public final setBinBasedMaxPan$payments_ui_core_release(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->binBasedMaxPan:Ljava/lang/Integer;

    return-void
.end method
