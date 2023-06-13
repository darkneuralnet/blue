.class public final Landroidx/compose/ui/focus/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a=\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0008H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u000c\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0001\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002\"\u001e\u0010\u0015\u001a\u00020\t*\u00020\u00008@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0011\u0010\u0012\" \u0010\u0019\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0018\u0010\u0014\u001a\u0004\u0008\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "Landroidx/compose/ui/focus/c;",
        "focusDirection",
        "Lpm2;",
        "layoutDirection",
        "Landroidx/compose/ui/focus/h;",
        "a",
        "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILpm2;)Landroidx/compose/ui/focus/h;",
        "Lkotlin/Function1;",
        "",
        "onFound",
        "e",
        "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILpm2;Lkotlin/jvm/functions/Function1;)Z",
        "LOs4;",
        "d",
        "b",
        "c",
        "g",
        "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z",
        "isEligibleForFocusSearch$annotations",
        "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V",
        "isEligibleForFocusSearch",
        "f",
        "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "getActiveChild$annotations",
        "activeChild",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,173:1\n1#2:174\n87#3:175\n87#3:205\n87#3:235\n340#4:176\n206#4,2:177\n208#4,7:182\n215#4,15:190\n340#4:206\n206#4,2:207\n208#4,7:212\n215#4,15:220\n314#4:236\n78#4,17:237\n1182#5:179\n1161#5,2:180\n1182#5:209\n1161#5,2:210\n48#6:189\n48#6:219\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n142#1:175\n156#1:205\n168#1:235\n142#1:176\n142#1:177,2\n142#1:182,7\n142#1:190,15\n156#1:206\n156#1:207,2\n156#1:212,7\n156#1:220,15\n168#1:236\n168#1:237,17\n142#1:179\n142#1:180,2\n156#1:209\n156#1:210,2\n142#1:189\n156#1:219\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILpm2;)Landroidx/compose/ui/focus/h;
    .locals 5

    const-string v0, "$this$customFocusSearch"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutDirection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->e0()Landroidx/compose/ui/focus/e;

    move-result-object p0

    sget-object v0, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->e()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->a()Landroidx/compose/ui/focus/h;

    move-result-object p0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->f()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->f()Landroidx/compose/ui/focus/h;

    move-result-object p0

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->h()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->b()Landroidx/compose/ui/focus/h;

    move-result-object p0

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->a()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->d()Landroidx/compose/ui/focus/h;

    move-result-object p0

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->d()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_8

    sget-object p1, Landroidx/compose/ui/focus/k$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v4, :cond_5

    if-ne p1, v3, :cond_4

    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->getEnd()Landroidx/compose/ui/focus/h;

    move-result-object p1

    goto :goto_0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->getStart()Landroidx/compose/ui/focus/h;

    move-result-object p1

    :goto_0
    sget-object p2, Landroidx/compose/ui/focus/h;->b:Landroidx/compose/ui/focus/h$a;

    invoke-virtual {p2}, Landroidx/compose/ui/focus/h$a;->b()Landroidx/compose/ui/focus/h;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_1

    :cond_6
    move-object p1, v2

    :goto_1
    if-nez p1, :cond_7

    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->w()Landroidx/compose/ui/focus/h;

    move-result-object p0

    goto/16 :goto_4

    :cond_7
    move-object p0, p1

    goto :goto_4

    :cond_8
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->g()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    if-eqz v1, :cond_c

    sget-object p1, Landroidx/compose/ui/focus/k$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v4, :cond_a

    if-ne p1, v3, :cond_9

    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->getStart()Landroidx/compose/ui/focus/h;

    move-result-object p1

    goto :goto_2

    :cond_9
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_a
    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->getEnd()Landroidx/compose/ui/focus/h;

    move-result-object p1

    :goto_2
    sget-object p2, Landroidx/compose/ui/focus/h;->b:Landroidx/compose/ui/focus/h$a;

    invoke-virtual {p2}, Landroidx/compose/ui/focus/h$a;->b()Landroidx/compose/ui/focus/h;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    goto :goto_3

    :cond_b
    move-object p1, v2

    :goto_3
    if-nez p1, :cond_7

    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->v()Landroidx/compose/ui/focus/h;

    move-result-object p0

    goto :goto_4

    :cond_c
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->b()I

    move-result p2

    invoke-static {p1, p2}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->g()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-static {p1}, Landroidx/compose/ui/focus/c;->i(I)Landroidx/compose/ui/focus/c;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/focus/h;

    goto :goto_4

    :cond_d
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->c()I

    move-result p2

    invoke-static {p1, p2}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result p2

    if-eqz p2, :cond_e

    invoke-interface {p0}, Landroidx/compose/ui/focus/e;->c()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-static {p1}, Landroidx/compose/ui/focus/c;->i(I)Landroidx/compose/ui/focus/c;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/focus/h;

    :goto_4
    return-object p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "invalid FocusDirection"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->h0()LXv1;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/k$a;->$EnumSwitchMapping$1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_8

    const/4 p0, 0x4

    if-ne v0, p0, :cond_0

    return-object v3

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const/16 v0, 0x400

    invoke-static {v0}, LK83;->a(I)I

    move-result v0

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v2

    invoke-virtual {v2}, LgV2$c;->Q()Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v2, LLX2;

    const/16 v4, 0x10

    new-array v4, v4, [LgV2$c;

    const/4 v5, 0x0

    invoke-direct {v2, v4, v5}, LLX2;-><init>([Ljava/lang/Object;I)V

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v4

    invoke-virtual {v4}, LgV2$c;->I()LgV2$c;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object p0

    invoke-static {v2, p0}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v2, v4}, LLX2;->b(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    invoke-virtual {v2}, LLX2;->x()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-virtual {v2}, LLX2;->u()I

    move-result p0

    sub-int/2addr p0, v1

    invoke-virtual {v2, p0}, LLX2;->C(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LgV2$c;

    invoke-virtual {p0}, LgV2$c;->G()I

    move-result v4

    and-int/2addr v4, v0

    if-nez v4, :cond_4

    invoke-static {v2, p0}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_0

    :cond_4
    :goto_1
    if-eqz p0, :cond_3

    invoke-virtual {p0}, LgV2$c;->M()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_5

    instance-of v4, p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-eqz v4, :cond_3

    check-cast p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-static {p0}, Landroidx/compose/ui/focus/k;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object p0

    if-eqz p0, :cond_3

    return-object p0

    :cond_5
    invoke-virtual {p0}, LgV2$c;->I()LgV2$c;

    move-result-object p0

    goto :goto_1

    :cond_6
    return-object v3

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;
    .locals 5

    const/16 v0, 0x400

    invoke-static {v0}, LK83;->a(I)I

    move-result v0

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v1

    invoke-virtual {v1}, LgV2$c;->Q()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v1

    invoke-virtual {v1}, LgV2$c;->O()LgV2$c;

    move-result-object v1

    invoke-static {p0}, LwZ0;->h(LvZ0;)LJm2;

    move-result-object p0

    :goto_0
    const/4 v2, 0x0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, LJm2;->m0()LF83;

    move-result-object v3

    invoke-virtual {v3}, LF83;->l()LgV2$c;

    move-result-object v3

    invoke-virtual {v3}, LgV2$c;->G()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_1

    :goto_1
    if-eqz v1, :cond_1

    invoke-virtual {v1}, LgV2$c;->M()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_0

    instance-of v3, v1, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->e0()Landroidx/compose/ui/focus/e;

    move-result-object v4

    invoke-interface {v4}, Landroidx/compose/ui/focus/e;->h()Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    invoke-virtual {v1}, LgV2$c;->O()LgV2$c;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LJm2;->p0()LJm2;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, LJm2;->m0()LF83;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LF83;->o()LgV2$c;

    move-result-object v1

    goto :goto_0

    :cond_2
    move-object v1, v2

    goto :goto_0

    :cond_3
    return-object v2

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(Landroidx/compose/ui/focus/FocusTargetModifierNode;)LOs4;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LgV2$c;->J()LH83;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lom2;->d(Lnm2;)Lnm2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Lnm2;->e(Lnm2;Z)LOs4;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    sget-object p0, LOs4;->e:LOs4$a;

    invoke-virtual {p0}, LOs4$a;->a()LOs4;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILpm2;Lkotlin/jvm/functions/Function1;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
            "I",
            "Lpm2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "$this$focusSearch"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutDirection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFound"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->e()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->f()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    invoke-static {p0, p1, p3}, Landroidx/compose/ui/focus/l;->f(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z

    move-result p0

    goto/16 :goto_7

    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->d()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->g()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->h()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->a()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    :goto_3
    const/4 v3, 0x0

    if-eqz v1, :cond_6

    invoke-static {p0, p1, p3}, Landroidx/compose/ui/focus/m;->t(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_7

    :cond_5
    :goto_4
    move p0, v3

    goto :goto_7

    :cond_6
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object p1, Landroidx/compose/ui/focus/k$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v2, :cond_8

    const/4 p2, 0x2

    if-ne p1, p2, :cond_7

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->d()I

    move-result p1

    goto :goto_5

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_8
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->g()I

    move-result p1

    :goto_5
    invoke-static {p0}, Landroidx/compose/ui/focus/k;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {p0, p1, p3}, Landroidx/compose/ui/focus/m;->t(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_7

    :cond_9
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->c()I

    move-result p2

    invoke-static {p1, p2}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-static {p0}, Landroidx/compose/ui/focus/k;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-static {p1}, Landroidx/compose/ui/focus/k;->c(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object p1

    goto :goto_6

    :cond_a
    const/4 p1, 0x0

    :goto_6
    if-eqz p1, :cond_5

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    goto :goto_4

    :cond_b
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    :goto_7
    return p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Focus search invoked with invalid FocusDirection "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Landroidx/compose/ui/focus/c;->n(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LgV2$c;->r()LgV2$c;

    move-result-object v0

    invoke-virtual {v0}, LgV2$c;->Q()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/16 v0, 0x400

    invoke-static {v0}, LK83;->a(I)I

    move-result v0

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v2

    invoke-virtual {v2}, LgV2$c;->Q()Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v2, LLX2;

    const/16 v3, 0x10

    new-array v3, v3, [LgV2$c;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, LLX2;-><init>([Ljava/lang/Object;I)V

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v3

    invoke-virtual {v3}, LgV2$c;->I()LgV2$c;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object p0

    invoke-static {v2, p0}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v3}, LLX2;->b(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    invoke-virtual {v2}, LLX2;->x()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-virtual {v2}, LLX2;->u()I

    move-result p0

    const/4 v3, 0x1

    sub-int/2addr p0, v3

    invoke-virtual {v2, p0}, LLX2;->C(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LgV2$c;

    invoke-virtual {p0}, LgV2$c;->G()I

    move-result v4

    and-int/2addr v4, v0

    if-nez v4, :cond_3

    invoke-static {v2, p0}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz p0, :cond_2

    invoke-virtual {p0}, LgV2$c;->M()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_5

    instance-of v4, p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-eqz v4, :cond_2

    check-cast p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->h0()LXv1;

    move-result-object v4

    sget-object v5, Landroidx/compose/ui/focus/k$a;->$EnumSwitchMapping$1:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    if-eq v4, v3, :cond_4

    const/4 v3, 0x2

    if-eq v4, v3, :cond_4

    const/4 v3, 0x3

    if-eq v4, v3, :cond_4

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    invoke-virtual {p0}, LgV2$c;->I()LgV2$c;

    move-result-object p0

    goto :goto_1

    :cond_6
    return-object v1

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final g(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LgV2$c;->J()LH83;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH83;->r1()LJm2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LJm2;->n()Z

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0}, LgV2$c;->J()LH83;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LH83;->r1()LJm2;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LJm2;->J0()Z

    move-result p0

    if-ne p0, v1, :cond_1

    move p0, v1

    goto :goto_1

    :cond_1
    move p0, v2

    :goto_1
    if-eqz p0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    return v1
.end method
