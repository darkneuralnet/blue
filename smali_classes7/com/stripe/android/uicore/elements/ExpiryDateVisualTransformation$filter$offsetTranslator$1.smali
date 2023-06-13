.class public final Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation$filter$offsetTranslator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHe3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;->filter(LDf;)LA96;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/uicore/elements/ExpiryDateVisualTransformation$filter$offsetTranslator$1",
        "LHe3;",
        "",
        "offset",
        "originalToTransformed",
        "transformedToOriginal",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $separatorAfterIndex:Lkotlin/jvm/internal/Ref$IntRef;

.field final synthetic this$0:Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation$filter$offsetTranslator$1;->$separatorAfterIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation$filter$offsetTranslator$1;->this$0:Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public originalToTransformed(I)I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation$filter$offsetTranslator$1;->$separatorAfterIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-gt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation$filter$offsetTranslator$1;->this$0:Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;->access$getSeparator$p(Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p1, v0

    :goto_0
    return p1
.end method

.method public transformedToOriginal(I)I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation$filter$offsetTranslator$1;->$separatorAfterIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v0, v0, 0x1

    if-gt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation$filter$offsetTranslator$1;->this$0:Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;->access$getSeparator$p(Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr p1, v0

    :goto_0
    return p1
.end method
