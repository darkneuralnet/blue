.class public final Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1;->invoke(Lyo2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "LLn2;",
        "Ljava/lang/Integer;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "LLn2;",
        "",
        "it",
        "",
        "invoke",
        "(LLn2;ILEt0;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1\n*L\n1#1,423:1\n91#2,23:424\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty$inlined:I

.field final synthetic $imageLoader$inlined:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $isEnabled$inlined:Z

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onItemSelectedListener$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $paymentMethods$inlined:Ljava/util/List;

.field final synthetic $selectedIndex$inlined:I

.field final synthetic $viewWidth$inlined:F


# direct methods
.method public constructor <init>(Ljava/util/List;IFLcom/stripe/android/uicore/image/StripeImageLoader;ZILkotlin/jvm/functions/Function1;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$items:Ljava/util/List;

    iput p2, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$selectedIndex$inlined:I

    iput p3, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$viewWidth$inlined:F

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$imageLoader$inlined:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$isEnabled$inlined:Z

    iput p6, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$$dirty$inlined:I

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$onItemSelectedListener$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$paymentMethods$inlined:Ljava/util/List;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLn2;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LEt0;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->invoke(LLn2;ILEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LLn2;ILEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v9, p2

    move-object/from16 v15, p3

    const-string v2, "$this$items"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0xe

    if-nez v2, :cond_1

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x70

    const/16 v3, 0x20

    const/16 v4, 0x10

    if-nez v2, :cond_3

    invoke-interface {v15, v9}, LEt0;->r(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v1, 0x2db

    const/16 v5, 0x92

    if-ne v2, v5, :cond_5

    invoke-interface/range {p3 .. p3}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface/range {p3 .. p3}, LEt0;->k()V

    goto/16 :goto_a

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v5, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)"

    const v6, -0x410876af

    invoke-static {v6, v1, v2, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$items:Ljava/util/List;

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    and-int/lit8 v5, v1, 0xe

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v5

    check-cast v2, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const v5, 0x391bb49e

    invoke-interface {v15, v5}, LEt0;->F(I)V

    and-int/lit8 v5, v1, 0x70

    if-nez v5, :cond_8

    invoke-interface {v15, v9}, LEt0;->r(I)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_4

    :cond_7
    move v3, v4

    :goto_4
    or-int/2addr v3, v1

    goto :goto_5

    :cond_8
    move v3, v1

    :goto_5
    and-int/lit16 v1, v1, 0x380

    if-nez v1, :cond_a

    invoke-interface {v15, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v1, 0x100

    goto :goto_6

    :cond_9
    const/16 v1, 0x80

    :goto_6
    or-int/2addr v3, v1

    :cond_a
    and-int/lit16 v1, v3, 0x16d1

    const/16 v4, 0x490

    if-ne v1, v4, :cond_c

    invoke-interface/range {p3 .. p3}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_7

    :cond_b
    invoke-interface/range {p3 .. p3}, LEt0;->k()V

    goto/16 :goto_9

    :cond_c
    :goto_7
    const/4 v1, 0x0

    invoke-static {v15, v1}, LwS0;->a(LEt0;I)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getDarkThemeIconUrl()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getDarkThemeIconUrl()Ljava/lang/String;

    move-result-object v4

    goto :goto_8

    :cond_d
    invoke-virtual {v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getLightThemeIconUrl()Ljava/lang/String;

    move-result-object v4

    :goto_8
    sget-object v5, LgV2;->b0:LgV2$a;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getDisplayNameResource()I

    move-result v6

    invoke-static {v6, v15, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "PaymentMethodsUITestTag"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lo06;->a(LgV2;Ljava/lang/String;)LgV2;

    move-result-object v10

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getIconResource()I

    move-result v5

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getDisplayNameResource()I

    move-result v6

    invoke-static {v6, v15, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v6

    iget v7, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$selectedIndex$inlined:I

    if-ne v9, v7, :cond_e

    const/4 v1, 0x1

    :cond_e
    move v7, v1

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getTintIconOnSelection()Z

    move-result v8

    iget v1, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$viewWidth$inlined:F

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$imageLoader$inlined:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-boolean v12, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$isEnabled$inlined:Z

    new-instance v13, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$1$1;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$onItemSelectedListener$inlined:Lkotlin/jvm/functions/Function1;

    iget-object v14, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$paymentMethods$inlined:Ljava/util/List;

    invoke-direct {v13, v2, v14}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    sget v2, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v2, v2, 0x9

    iget v14, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3;->$$dirty$inlined:I

    shr-int/lit8 v0, v14, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v2

    shl-int/lit8 v2, v14, 0xc

    const/high16 v14, 0x380000

    and-int/2addr v2, v14

    or-int/2addr v0, v2

    shl-int/lit8 v2, v3, 0x15

    const/high16 v3, 0xe000000

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    const/4 v14, 0x0

    const/16 v16, 0x0

    move v2, v5

    move-object v3, v4

    move-object v4, v11

    move-object v5, v6

    move v6, v7

    move v7, v12

    move/from16 v9, p2

    move-object v11, v13

    move-object/from16 v12, p3

    move v13, v0

    move/from16 v15, v16

    invoke-static/range {v1 .. v15}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt;->PaymentMethodUI-jFuDa88(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZILgV2;Lkotlin/jvm/functions/Function1;LEt0;III)V

    :goto_9
    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    :goto_a
    return-void
.end method
