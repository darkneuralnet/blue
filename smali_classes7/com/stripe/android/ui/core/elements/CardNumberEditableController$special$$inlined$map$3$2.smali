.class public final Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LGu1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "R",
        "value",
        "",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n90#3,5:224\n95#3:232\n96#3:234\n98#3:243\n99#3:247\n100#3:249\n102#3,3:258\n1549#4:229\n1620#4,2:230\n1622#4:233\n777#4:235\n788#4:236\n1864#4,2:237\n789#4,2:239\n1866#4:241\n791#4:242\n1549#4:244\n1620#4,2:245\n1622#4:248\n777#4:250\n788#4:251\n1864#4,2:252\n789#4,2:254\n1866#4:256\n791#4:257\n*S KotlinDebug\n*F\n+ 1 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n*L\n94#1:229\n94#1:230,2\n94#1:233\n96#1:235\n96#1:236\n96#1:237,2\n96#1:239,2\n96#1:241\n96#1:242\n98#1:244\n98#1:245,2\n98#1:248\n100#1:250\n100#1:251\n100#1:252,2\n100#1:254,2\n100#1:256\n100#1:257\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_unsafeFlow:LGu1;

.field final synthetic this$0:Lcom/stripe/android/ui/core/elements/CardNumberEditableController;


# direct methods
.method public constructor <init>(LGu1;Lcom/stripe/android/ui/core/elements/CardNumberEditableController;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2;->$this_unsafeFlow:LGu1;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2;->this$0:Lcom/stripe/android/ui/core/elements/CardNumberEditableController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2$1;

    iget v3, v2, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2$1;-><init>(Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2;->$this_unsafeFlow:LGu1;

    move-object/from16 v4, p1

    check-cast v4, Ljava/lang/String;

    sget-object v6, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {v6, v4}, Lcom/stripe/android/model/CardBrand$Companion;->getCardBrands(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    iget-object v6, v0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2;->this$0:Lcom/stripe/android/ui/core/elements/CardNumberEditableController;

    invoke-virtual {v6}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object v6

    if-eqz v6, :cond_3

    new-instance v4, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    iget-object v6, v0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2;->this$0:Lcom/stripe/android/ui/core/elements/CardNumberEditableController;

    invoke-virtual {v6}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/stripe/android/model/AccountRange;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xa

    const/4 v13, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v13}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_7

    :cond_3
    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/stripe/android/model/CardBrand;

    new-instance v15, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    invoke-virtual {v9}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v9, 0xa

    const/16 v16, 0x0

    move-object v10, v15

    move-object v5, v15

    move v15, v9

    invoke-direct/range {v10 .. v16}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x1

    goto :goto_1

    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v9, 0x0

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v11, v9, 0x1

    if-gez v9, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_5
    move-object v12, v10

    check-cast v12, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    const/4 v12, 0x3

    if-ge v9, v12, :cond_6

    const/4 v9, 0x1

    goto :goto_3

    :cond_6
    const/4 v9, 0x0

    :goto_3
    if-eqz v9, :cond_7

    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_7
    move v9, v11

    goto :goto_2

    :cond_8
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/model/CardBrand;

    new-instance v15, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    invoke-virtual {v7}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0xa

    const/4 v7, 0x0

    move-object v9, v15

    move-object v8, v15

    move-object v15, v7

    invoke-direct/range {v9 .. v15}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v7, 0x1

    if-gez v7, :cond_a

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_a
    move-object v10, v8

    check-cast v10, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    const/4 v10, 0x2

    if-le v7, v10, :cond_b

    const/4 v7, 0x1

    goto :goto_6

    :cond_b
    const/4 v7, 0x0

    :goto_6
    if-eqz v7, :cond_c

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_c
    move v7, v9

    goto :goto_5

    :cond_d
    new-instance v6, Lcom/stripe/android/uicore/elements/TextFieldIcon$MultiTrailing;

    invoke-direct {v6, v5, v4}, Lcom/stripe/android/uicore/elements/TextFieldIcon$MultiTrailing;-><init>(Ljava/util/List;Ljava/util/List;)V

    move-object v4, v6

    const/4 v5, 0x1

    :goto_7
    iput v5, v2, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3$2$1;->label:I

    invoke-interface {v1, v4, v2}, LGu1;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_e

    return-object v3

    :cond_e
    :goto_8
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method
