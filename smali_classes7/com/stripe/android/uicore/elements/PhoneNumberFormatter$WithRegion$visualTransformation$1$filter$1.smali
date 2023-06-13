.class public final Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHe3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1;->filter(LDf;)LA96;
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
        "com/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPhoneNumberFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,489:1\n1183#2,3:490\n429#2:493\n502#2,5:494\n*S KotlinDebug\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1\n*L\n83#1:490,3\n108#1:493\n108#1:494,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1;->this$0:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public originalToTransformed(I)I
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1;->this$0:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->access$getMetadata$p(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getPattern()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return v1

    :cond_0
    const/4 v2, -0x1

    move v3, v1

    move v4, v3

    move v5, v2

    :goto_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v1, v6, :cond_2

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    add-int/lit8 v3, v3, 0x1

    const/16 v7, 0x23

    if-ne v6, v7, :cond_1

    add-int/lit8 v4, v4, 0x1

    if-ne v4, p1, :cond_1

    move v5, v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    if-ne v5, v2, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    sub-int/2addr p1, v4

    add-int v5, v0, p1

    :cond_3
    return v5
.end method

.method public transformedToOriginal(I)I
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1;->this$0:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->access$getMetadata$p(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getPattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    move v5, v0

    :goto_0
    if-ge v5, v4, :cond_3

    invoke-interface {v2, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    const/16 v7, 0x23

    if-eq v6, v7, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    move v7, v0

    :goto_1
    if-eqz v7, :cond_2

    invoke-interface {v3, v6}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "filterTo(StringBuilder(), predicate).toString()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-le p1, v1, :cond_4

    add-int/lit8 v0, v0, 0x1

    :cond_4
    sub-int v0, p1, v0

    :goto_2
    return v0
.end method
