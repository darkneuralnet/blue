.class public final Landroidx/compose/ui/focus/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a\u000c\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a \u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0001H\u0003\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0000H\u0002\u001a\u000c\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "",
        "e",
        "forced",
        "refreshFocusEvents",
        "c",
        "d",
        "a",
        "childNode",
        "f",
        "g",
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
        "SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,242:1\n87#2:243\n87#2:245\n87#2:247\n324#3:244\n324#3:246\n324#3:248\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n55#1:243\n185#1:245\n209#1:247\n55#1:244\n185#1:246\n209#1:248\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/compose/ui/focus/FocusTargetModifierNode;ZZ)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/focus/k;->f(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/j;->c(Landroidx/compose/ui/focus/FocusTargetModifierNode;ZZ)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static synthetic b(Landroidx/compose/ui/focus/FocusTargetModifierNode;ZZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/j;->a(Landroidx/compose/ui/focus/FocusTargetModifierNode;ZZ)Z

    move-result p0

    return p0
.end method

.method public static final c(Landroidx/compose/ui/focus/FocusTargetModifierNode;ZZ)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->h0()LXv1;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/j$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 p0, 0x4

    if-ne v0, p0, :cond_1

    :cond_0
    :goto_0
    move p1, v1

    goto :goto_1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/j;->a(Landroidx/compose/ui/focus/FocusTargetModifierNode;ZZ)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, LXv1;->e:LXv1;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->k0(LXv1;)V

    if-eqz p2, :cond_0

    invoke-static {p0}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    if-eqz p1, :cond_6

    sget-object v0, LXv1;->e:LXv1;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->k0(LXv1;)V

    if-eqz p2, :cond_6

    invoke-static {p0}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    goto :goto_1

    :cond_5
    sget-object p1, LXv1;->e:LXv1;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->k0(LXv1;)V

    if-eqz p2, :cond_0

    invoke-static {p0}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    goto :goto_0

    :cond_6
    :goto_1
    return p1
.end method

.method public static final d(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z
    .locals 2

    new-instance v0, Landroidx/compose/ui/focus/j$b;

    invoke-direct {v0, p0}, Landroidx/compose/ui/focus/j$b;-><init>(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    invoke-static {p0, v0}, Lie3;->a(LgV2$c;Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->h0()LXv1;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/j$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LXv1;->b:LXv1;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->k0(LXv1;)V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final e(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LgV2$c;->r()LgV2$c;

    move-result-object v0

    invoke-virtual {v0}, LgV2$c;->Q()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->e0()Landroidx/compose/ui/focus/e;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/focus/e;->h()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->b()I

    move-result v0

    sget-object v1, Landroidx/compose/ui/focus/j$c;->g:Landroidx/compose/ui/focus/j$c;

    invoke-static {p0, v0, v1}, Landroidx/compose/ui/focus/m;->k(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->h0()LXv1;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/j$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v2, 0x2

    if-eq v0, v2, :cond_9

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x0

    if-eq v0, v3, :cond_6

    const/4 v3, 0x4

    if-ne v0, v3, :cond_5

    const/16 v0, 0x400

    invoke-static {v0}, LK83;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LwZ0;->f(LvZ0;I)LgV2$c;

    move-result-object v0

    instance-of v3, v0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    check-cast v2, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-eqz v2, :cond_2

    invoke-static {v2, p0}, Landroidx/compose/ui/focus/j;->f(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result p0

    goto :goto_2

    :cond_2
    invoke-static {p0}, Landroidx/compose/ui/focus/j;->g(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Landroidx/compose/ui/focus/j;->d(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    move v1, v4

    :goto_1
    if-eqz v1, :cond_4

    invoke-static {p0}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    :cond_4
    move p0, v1

    :goto_2
    return p0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    invoke-static {p0, v4, v4, v3, v2}, Landroidx/compose/ui/focus/j;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;ZZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p0}, Landroidx/compose/ui/focus/j;->d(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    move v1, v4

    :goto_3
    if-eqz v1, :cond_8

    invoke-static {p0}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    :cond_8
    return v1

    :cond_9
    invoke-static {p0}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    return v1

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z
    .locals 6

    const/16 v0, 0x400

    invoke-static {v0}, LK83;->a(I)I

    move-result v1

    invoke-static {p1, v1}, LwZ0;->f(LvZ0;I)LgV2$c;

    move-result-object v1

    instance-of v2, v1, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v1, v3

    :cond_0
    check-cast v1, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->h0()LXv1;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/focus/j$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_a

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eq v1, v4, :cond_b

    const/4 v4, 0x3

    if-eq v1, v4, :cond_6

    const/4 v4, 0x4

    if-ne v1, v4, :cond_5

    invoke-static {v0}, LK83;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LwZ0;->f(LvZ0;I)LgV2$c;

    move-result-object v0

    instance-of v1, v0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v0

    :goto_0
    check-cast v3, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-nez v3, :cond_2

    invoke-static {p0}, Landroidx/compose/ui/focus/j;->g(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LXv1;->b:LXv1;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->k0(LXv1;)V

    invoke-static {p0}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    invoke-static {p0, p1}, Landroidx/compose/ui/focus/j;->f(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result v5

    goto/16 :goto_3

    :cond_2
    if-eqz v3, :cond_b

    invoke-static {v3, p0}, Landroidx/compose/ui/focus/j;->f(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {p0, p1}, Landroidx/compose/ui/focus/j;->f(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object p0

    sget-object v0, LXv1;->c:LXv1;

    if-ne p0, v0, :cond_3

    goto :goto_1

    :cond_3
    move v2, v5

    :goto_1
    if-eqz v2, :cond_4

    move v5, p1

    goto :goto_3

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Check failed."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    invoke-static {p0}, Landroidx/compose/ui/focus/k;->f(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {p0, v5, v5, v4, v3}, Landroidx/compose/ui/focus/j;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;ZZILjava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    invoke-static {p1}, Landroidx/compose/ui/focus/j;->d(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result p0

    if-eqz p0, :cond_7

    goto :goto_2

    :cond_7
    move v2, v5

    :goto_2
    if-eqz v2, :cond_8

    invoke-static {p1}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    :cond_8
    move v5, v2

    goto :goto_3

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Required value was null."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    invoke-static {p1}, Landroidx/compose/ui/focus/j;->d(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result v5

    if-eqz v5, :cond_b

    sget-object v0, LXv1;->c:LXv1;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->k0(LXv1;)V

    invoke-static {p1}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    invoke-static {p0}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    :cond_b
    :goto_3
    return v5

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Non child node cannot request focus."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final g(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z
    .locals 1

    invoke-virtual {p0}, LgV2$c;->J()LH83;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LH83;->r1()LJm2;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LJm2;->o0()LjD3;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LjD3;->requestFocus()Z

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Owner not initialized."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
