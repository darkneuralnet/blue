.class public final LAv1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAv1;-><init>(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,141:1\n1855#2:142\n1856#2:173\n1855#2:174\n1856#2:205\n1855#2,2:206\n87#3:143\n87#3:175\n340#4:144\n206#4,2:145\n208#4,7:150\n215#4,15:158\n340#4:176\n206#4,2:177\n208#4,7:182\n215#4,15:190\n1182#5:147\n1161#5,2:148\n1182#5:179\n1161#5,2:180\n48#6:157\n48#6:189\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n*L\n64#1:142\n64#1:173\n73#1:174\n73#1:205\n121#1:206,2\n65#1:143\n87#1:175\n65#1:144\n65#1:145,2\n65#1:150,7\n65#1:158,15\n87#1:176\n87#1:177,2\n87#1:182,7\n87#1:190,15\n65#1:147\n65#1:148,2\n87#1:179\n87#1:180,2\n65#1:157\n87#1:189\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LAv1;


# direct methods
.method public constructor <init>(LAv1;)V
    .locals 0

    iput-object p1, p0, LAv1$a;->g:LAv1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LAv1$a;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, LAv1$a;->g:LAv1;

    invoke-static {v1}, LAv1;->b(LAv1;)Ljava/util/Set;

    move-result-object v1

    iget-object v2, v0, LAv1$a;->g:LAv1;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/16 v4, 0x10

    const/16 v5, 0x400

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-string v8, "Check failed."

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LRv1;

    invoke-static {v5}, LK83;->a(I)I

    move-result v5

    invoke-interface {v3}, LvZ0;->r()LgV2$c;

    move-result-object v9

    invoke-virtual {v9}, LgV2$c;->Q()Z

    move-result v9

    if-eqz v9, :cond_5

    new-instance v8, LLX2;

    new-array v4, v4, [LgV2$c;

    invoke-direct {v8, v4, v7}, LLX2;-><init>([Ljava/lang/Object;I)V

    invoke-interface {v3}, LvZ0;->r()LgV2$c;

    move-result-object v4

    invoke-virtual {v4}, LgV2$c;->I()LgV2$c;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-interface {v3}, LvZ0;->r()LgV2$c;

    move-result-object v3

    invoke-static {v8, v3}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v8, v4}, LLX2;->b(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    invoke-virtual {v8}, LLX2;->x()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v8}, LLX2;->u()I

    move-result v3

    sub-int/2addr v3, v6

    invoke-virtual {v8, v3}, LLX2;->C(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LgV2$c;

    invoke-virtual {v3}, LgV2$c;->G()I

    move-result v4

    and-int/2addr v4, v5

    if-nez v4, :cond_3

    invoke-static {v8, v3}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, LgV2$c;->M()I

    move-result v4

    and-int/2addr v4, v5

    if-eqz v4, :cond_4

    instance-of v4, v3, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-eqz v4, :cond_2

    check-cast v3, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-static {v2}, LAv1;->c(LAv1;)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {v3}, LgV2$c;->I()LgV2$c;

    move-result-object v3

    goto :goto_1

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    iget-object v1, v0, LAv1$a;->g:LAv1;

    invoke-static {v1}, LAv1;->b(LAv1;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v2, v0, LAv1$a;->g:LAv1;

    invoke-static {v2}, LAv1;->a(LAv1;)Ljava/util/Set;

    move-result-object v2

    iget-object v3, v0, LAv1$a;->g:LAv1;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lvv1;

    invoke-interface {v9}, LvZ0;->r()LgV2$c;

    move-result-object v10

    invoke-virtual {v10}, LgV2$c;->Q()Z

    move-result v10

    if-nez v10, :cond_7

    sget-object v10, LXv1;->e:LXv1;

    invoke-interface {v9, v10}, Lvv1;->F(LWv1;)V

    goto/16 :goto_8

    :cond_7
    invoke-static {v5}, LK83;->a(I)I

    move-result v10

    invoke-interface {v9}, LvZ0;->r()LgV2$c;

    move-result-object v11

    invoke-virtual {v11}, LgV2$c;->Q()Z

    move-result v11

    if-eqz v11, :cond_13

    new-instance v11, LLX2;

    new-array v12, v4, [LgV2$c;

    invoke-direct {v11, v12, v7}, LLX2;-><init>([Ljava/lang/Object;I)V

    invoke-interface {v9}, LvZ0;->r()LgV2$c;

    move-result-object v12

    invoke-virtual {v12}, LgV2$c;->I()LgV2$c;

    move-result-object v12

    if-nez v12, :cond_8

    invoke-interface {v9}, LvZ0;->r()LgV2$c;

    move-result-object v12

    invoke-static {v11, v12}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_3

    :cond_8
    invoke-virtual {v11, v12}, LLX2;->b(Ljava/lang/Object;)Z

    :goto_3
    const/4 v12, 0x0

    move v13, v6

    move v14, v7

    :goto_4
    invoke-virtual {v11}, LLX2;->x()Z

    move-result v15

    if-eqz v15, :cond_e

    invoke-virtual {v11}, LLX2;->u()I

    move-result v15

    sub-int/2addr v15, v6

    invoke-virtual {v11, v15}, LLX2;->C(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LgV2$c;

    invoke-virtual {v15}, LgV2$c;->G()I

    move-result v16

    and-int v16, v16, v10

    if-nez v16, :cond_9

    invoke-static {v11, v15}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_6

    :cond_9
    :goto_5
    if-eqz v15, :cond_d

    invoke-virtual {v15}, LgV2$c;->M()I

    move-result v16

    and-int v16, v16, v10

    if-eqz v16, :cond_c

    instance-of v4, v15, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-eqz v4, :cond_d

    check-cast v15, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-eqz v12, :cond_a

    move v14, v6

    :cond_a
    invoke-static {v3}, LAv1;->c(LAv1;)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v1, v15}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move v13, v7

    :cond_b
    move-object v12, v15

    goto :goto_6

    :cond_c
    invoke-virtual {v15}, LgV2$c;->I()LgV2$c;

    move-result-object v15

    const/16 v4, 0x10

    goto :goto_5

    :cond_d
    :goto_6
    const/16 v4, 0x10

    goto :goto_4

    :cond_e
    if-eqz v13, :cond_12

    if-eqz v14, :cond_f

    invoke-static {v9}, Lwv1;->a(Lvv1;)LWv1;

    move-result-object v4

    goto :goto_7

    :cond_f
    if-eqz v12, :cond_10

    invoke-virtual {v12}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object v4

    if-nez v4, :cond_11

    :cond_10
    sget-object v4, LXv1;->e:LXv1;

    :cond_11
    :goto_7
    invoke-interface {v9, v4}, Lvv1;->F(LWv1;)V

    :cond_12
    :goto_8
    const/16 v4, 0x10

    goto/16 :goto_2

    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_14
    iget-object v2, v0, LAv1$a;->g:LAv1;

    invoke-static {v2}, LAv1;->a(LAv1;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    iget-object v2, v0, LAv1$a;->g:LAv1;

    invoke-static {v2}, LAv1;->c(LAv1;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_15
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {v3}, LgV2$c;->Q()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object v4

    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->i0()V

    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    :cond_16
    invoke-static {v3}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    goto :goto_9

    :cond_17
    iget-object v2, v0, LAv1$a;->g:LAv1;

    invoke-static {v2}, LAv1;->c(LAv1;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    iget-object v1, v0, LAv1$a;->g:LAv1;

    invoke-static {v1}, LAv1;->b(LAv1;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1a

    iget-object v1, v0, LAv1$a;->g:LAv1;

    invoke-static {v1}, LAv1;->a(LAv1;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_19

    iget-object v1, v0, LAv1$a;->g:LAv1;

    invoke-static {v1}, LAv1;->c(LAv1;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_18

    return-void

    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_19
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1a
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
