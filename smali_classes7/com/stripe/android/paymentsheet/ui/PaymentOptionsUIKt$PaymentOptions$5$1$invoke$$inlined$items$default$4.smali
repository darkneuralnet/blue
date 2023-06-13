.class public final Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->invoke(Lyo2;)V
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
        "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1\n*L\n1#1,423:1\n73#2,2:424\n85#2:426\n77#2,8:427\n76#2,12:435\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty$inlined:I

.field final synthetic $isEditing$inlined:Z

.field final synthetic $isProcessing$inlined:Z

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onAddCardPressed$inlined:Lkotlin/jvm/functions/Function0;

.field final synthetic $onItemRemoved$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $onItemSelected$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $state$inlined:Lcom/stripe/android/paymentsheet/PaymentOptionsState;

.field final synthetic $width$inlined:F


# direct methods
.method public constructor <init>(Ljava/util/List;ZZLcom/stripe/android/paymentsheet/PaymentOptionsState;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$isProcessing$inlined:Z

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$isEditing$inlined:Z

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$state$inlined:Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    iput p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$width$inlined:F

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$onAddCardPressed$inlined:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$onItemSelected$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$onItemRemoved$inlined:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$$dirty$inlined:I

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->invoke(LLn2;ILEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LLn2;ILEt0;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v13, p3

    const-string v3, "$this$items"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p4, 0xe

    if-nez v3, :cond_1

    invoke-interface {v13, v1}, LEt0;->n(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, p4, 0x70

    const/16 v4, 0x20

    const/16 v5, 0x10

    if-nez v3, :cond_3

    invoke-interface {v13, v2}, LEt0;->r(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    move v3, v5

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v1, 0x2db

    const/16 v6, 0x92

    if-ne v3, v6, :cond_5

    invoke-interface/range {p3 .. p3}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface/range {p3 .. p3}, LEt0;->k()V

    goto/16 :goto_8

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v6, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)"

    const v7, -0x25b7f321

    invoke-static {v7, v1, v3, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    and-int/lit8 v1, v1, 0xe

    check-cast v2, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    const v3, -0x43c815c8

    invoke-interface {v13, v3}, LEt0;->F(I)V

    and-int/lit8 v3, v1, 0x70

    if-nez v3, :cond_8

    invoke-interface {v13, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    move v4, v5

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    and-int/lit16 v3, v1, 0x2d1

    const/16 v4, 0x90

    if-ne v3, v4, :cond_a

    invoke-interface/range {p3 .. p3}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_5

    :cond_9
    invoke-interface/range {p3 .. p3}, LEt0;->k()V

    goto/16 :goto_7

    :cond_a
    :goto_5
    iget-boolean v3, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$isProcessing$inlined:Z

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_c

    iget-boolean v3, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$isEditing$inlined:Z

    if-eqz v3, :cond_b

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;->isEnabledDuringEditing()Z

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    move v3, v4

    goto :goto_6

    :cond_c
    move v3, v5

    :goto_6
    iget-object v6, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$state$inlined:Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/PaymentOptionsState;->getSelectedItem()Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    iget-boolean v6, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$isEditing$inlined:Z

    if-nez v6, :cond_d

    move v5, v4

    :cond_d
    sget-object v4, LgV2;->b0:LgV2$a;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;->getViewType()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lo06;->a(LgV2;Ljava/lang/String;)LgV2;

    move-result-object v9

    iget v4, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$width$inlined:F

    iget-boolean v6, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$isEditing$inlined:Z

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$onAddCardPressed$inlined:Lkotlin/jvm/functions/Function0;

    iget-object v8, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$onItemSelected$inlined:Lkotlin/jvm/functions/Function1;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$onItemRemoved$inlined:Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0xe

    iget v11, v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;->$$dirty$inlined:I

    shl-int/lit8 v12, v11, 0x6

    and-int/lit16 v12, v12, 0x1c00

    or-int/2addr v1, v12

    shl-int/lit8 v12, v11, 0x6

    const/high16 v14, 0x70000

    and-int/2addr v12, v14

    or-int/2addr v1, v12

    shl-int/lit8 v12, v11, 0x6

    const/high16 v14, 0x380000

    and-int/2addr v12, v14

    or-int/2addr v1, v12

    const/high16 v12, 0x1c00000

    shl-int/lit8 v11, v11, 0x6

    and-int/2addr v11, v12

    or-int/2addr v11, v1

    const/4 v12, 0x0

    move-object v1, v2

    move v2, v4

    move v4, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    move-object/from16 v10, p3

    invoke-static/range {v1 .. v12}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->access$PaymentOption-iWtaglI(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V

    :goto_7
    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, LQt0;->Y()V

    :cond_e
    :goto_8
    return-void
.end method
