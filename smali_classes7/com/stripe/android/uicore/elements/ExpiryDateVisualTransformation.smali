.class public final Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEu6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;",
        "LEu6;",
        "LDf;",
        "text",
        "LA96;",
        "filter",
        "",
        "separator",
        "Ljava/lang/String;",
        "<init>",
        "()V",
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
.field private final separator:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, " / "

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;->separator:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getSeparator$p(Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;->separator:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public filter(LDf;)LA96;
    .locals 11

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    const/4 v1, 0x1

    iput v1, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    xor-int/2addr v2, v1

    const/16 v3, 0x31

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p1, v4}, LDf;->charAt(I)C

    move-result v2

    const/16 v5, 0x30

    if-eq v2, v5, :cond_0

    invoke-virtual {p1, v4}, LDf;->charAt(I)C

    move-result v2

    if-eq v2, v3, :cond_0

    iput v4, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LDf;->length()I

    move-result v2

    if-le v2, v1, :cond_1

    invoke-virtual {p1, v4}, LDf;->charAt(I)C

    move-result v2

    if-ne v2, v3, :cond_1

    invoke-virtual {p1, v1}, LDf;->charAt(I)C

    move-result v1

    invoke-static {v1}, Lkotlin/text/CharsKt;->digitToInt(C)I

    move-result v1

    const/4 v2, 0x2

    if-le v1, v2, :cond_1

    iput v4, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    :cond_1
    :goto_0
    invoke-virtual {p1}, LDf;->length()I

    move-result v1

    const-string v2, ""

    move-object v6, v2

    :goto_1
    if-ge v4, v1, :cond_3

    invoke-virtual {p1, v4}, LDf;->charAt(I)C

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget v3, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-ne v4, v3, :cond_2

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;->separator:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    move-object v6, v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation$filter$offsetTranslator$1;

    invoke-direct {p1, v0, p0}, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation$filter$offsetTranslator$1;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;)V

    new-instance v0, LA96;

    new-instance v1, LDf;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, LDf;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, p1}, LA96;-><init>(LDf;LHe3;)V

    return-object v0
.end method
