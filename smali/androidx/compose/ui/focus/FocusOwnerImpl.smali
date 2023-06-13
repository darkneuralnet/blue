.class public final Landroidx/compose/ui/focus/FocusOwnerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQv1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusOwnerImpl$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010<\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020;\u0012\u0004\u0012\u00020\u00020:\u00a2\u0006\u0004\u0008=\u0010>J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0005H\u0016J\u001d\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u001aH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001eH\u0002J\u001d\u0010!\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008!\u0010\rR(\u0010*\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0004\u0008\"\u0010#\u0012\u0004\u0008(\u0010)\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010,R \u00103\u001a\u00020.8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010/\u0012\u0004\u00082\u0010)\u001a\u0004\u00080\u00101R\"\u00109\u001a\u0002048\u0016@\u0016X\u0096.\u00a2\u0006\u0012\n\u0004\u0008\u0019\u00105\u001a\u0004\u00086\u00107\"\u0004\u0008\"\u00108\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006?"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusOwnerImpl;",
        "LQv1;",
        "",
        "b",
        "l",
        "",
        "force",
        "n",
        "refreshFocusEvents",
        "h",
        "Landroidx/compose/ui/focus/c;",
        "focusDirection",
        "i",
        "(I)Z",
        "Lik2;",
        "keyEvent",
        "g",
        "(Landroid/view/KeyEvent;)Z",
        "LQb5;",
        "event",
        "m",
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "node",
        "c",
        "Lvv1;",
        "d",
        "LRv1;",
        "k",
        "LOs4;",
        "j",
        "LvZ0;",
        "Lrk2;",
        "q",
        "r",
        "a",
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "p",
        "()Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "setRootFocusNode$ui_release",
        "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V",
        "getRootFocusNode$ui_release$annotations",
        "()V",
        "rootFocusNode",
        "LAv1;",
        "LAv1;",
        "focusInvalidationManager",
        "LgV2;",
        "LgV2;",
        "f",
        "()LgV2;",
        "getModifier$annotations",
        "modifier",
        "Lpm2;",
        "Lpm2;",
        "o",
        "()Lpm2;",
        "(Lpm2;)V",
        "layoutDirection",
        "Lkotlin/Function1;",
        "Lkotlin/Function0;",
        "onRequestApplyChangesListener",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "ui_release"
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
        "SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,275:1\n224#1:279\n225#1:281\n226#1,3:288\n229#1:297\n224#1:301\n225#1:303\n226#1,3:310\n229#1:319\n93#2:276\n93#2:278\n95#2:298\n95#2:300\n87#2,7:333\n87#2:348\n324#3:277\n320#3:280\n324#3:299\n320#3:302\n320#3:320\n262#3,7:341\n270#3,3:350\n51#4,6:282\n33#4,6:291\n51#4,6:304\n33#4,6:313\n51#4,6:321\n33#4,6:327\n47#5:340\n196#6:349\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n177#1:279\n177#1:281\n177#1:288,3\n177#1:297\n194#1:301\n194#1:303\n194#1:310,3\n194#1:319\n175#1:276\n178#1:278\n192#1:298\n195#1:300\n242#1:333,7\n243#1:348\n175#1:277\n177#1:280\n192#1:299\n194#1:302\n224#1:320\n242#1:341,7\n242#1:350,3\n177#1:282,6\n177#1:291,6\n194#1:304,6\n194#1:313,6\n225#1:321,6\n228#1:327,6\n242#1:340\n243#1:349\n*E\n"
    }
.end annotation


# instance fields
.field public a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

.field public final b:LAv1;

.field public final c:LgV2;

.field public d:Lpm2;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onRequestApplyChangesListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    new-instance v0, LAv1;

    invoke-direct {v0, p1}, LAv1;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->b:LAv1;

    new-instance p1, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    invoke-direct {p1, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;-><init>(Landroidx/compose/ui/focus/FocusOwnerImpl;)V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:LgV2;

    return-void
.end method


# virtual methods
.method public a(Lpm2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lpm2;

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->h0()LXv1;

    move-result-object v0

    sget-object v1, LXv1;->e:LXv1;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    sget-object v1, LXv1;->b:LXv1;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->k0(LXv1;)V

    :cond_0
    return-void
.end method

.method public c(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->b:LAv1;

    invoke-virtual {v0, p1}, LAv1;->f(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    return-void
.end method

.method public d(Lvv1;)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->b:LAv1;

    invoke-virtual {v0, p1}, LAv1;->d(Lvv1;)V

    return-void
.end method

.method public f()LgV2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:LgV2;

    return-object v0
.end method

.method public g(Landroid/view/KeyEvent;)Z
    .locals 6

    const-string v0, "keyEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/k;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->q(LvZ0;)Lrk2;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x2000

    if-nez v1, :cond_1

    invoke-static {v3}, LK83;->a(I)I

    move-result v1

    invoke-static {v0, v1}, LwZ0;->f(LvZ0;I)LgV2$c;

    move-result-object v0

    instance-of v1, v0, Lrk2;

    if-nez v1, :cond_0

    move-object v0, v2

    :cond_0
    move-object v1, v0

    check-cast v1, Lrk2;

    :cond_1
    const/4 v0, 0x0

    if-eqz v1, :cond_9

    invoke-static {v3}, LK83;->a(I)I

    move-result v3

    invoke-static {v1, v3}, LwZ0;->c(LvZ0;I)Ljava/util/List;

    move-result-object v3

    instance-of v4, v3, Ljava/util/List;

    if-eqz v4, :cond_2

    move-object v2, v3

    :cond_2
    const/4 v3, 0x1

    if-eqz v2, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_5

    :goto_0
    add-int/lit8 v5, v4, -0x1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrk2;

    invoke-interface {v4, p1}, Lrk2;->n(Landroid/view/KeyEvent;)Z

    move-result v4

    if-eqz v4, :cond_3

    return v3

    :cond_3
    if-gez v5, :cond_4

    goto :goto_1

    :cond_4
    move v4, v5

    goto :goto_0

    :cond_5
    :goto_1
    invoke-interface {v1, p1}, Lrk2;->n(Landroid/view/KeyEvent;)Z

    move-result v4

    if-eqz v4, :cond_6

    return v3

    :cond_6
    invoke-interface {v1, p1}, Lrk2;->w(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_7

    return v3

    :cond_7
    if-eqz v2, :cond_9

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    move v4, v0

    :goto_2
    if-ge v4, v1, :cond_9

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lrk2;

    invoke-interface {v5, p1}, Lrk2;->w(Landroid/view/KeyEvent;)Z

    move-result v5

    if-eqz v5, :cond_8

    return v3

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_9
    return v0

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Event can\'t be processed because we do not have an active focus target."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(ZZ)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->h0()LXv1;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-static {v1, p1, p2}, Landroidx/compose/ui/focus/j;->c(Landroidx/compose/ui/focus/FocusTargetModifierNode;ZZ)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    sget-object p2, Landroidx/compose/ui/focus/FocusOwnerImpl$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p2, p2, v0

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    sget-object p2, LXv1;->e:LXv1;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p2, LXv1;->b:LXv1;

    :goto_0
    invoke-virtual {p1, p2}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->k0(LXv1;)V

    :cond_2
    return-void
.end method

.method public i(I)Z
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/k;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->o()Lpm2;

    move-result-object v2

    invoke-static {v0, p1, v2}, Landroidx/compose/ui/focus/k;->a(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILpm2;)Landroidx/compose/ui/focus/h;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/focus/h;->b:Landroidx/compose/ui/focus/h$a;

    invoke-virtual {v3}, Landroidx/compose/ui/focus/h$a;->a()Landroidx/compose/ui/focus/h;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v1

    :cond_1
    invoke-virtual {v3}, Landroidx/compose/ui/focus/h$a;->b()Landroidx/compose/ui/focus/h;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->o()Lpm2;

    move-result-object v3

    new-instance v4, Landroidx/compose/ui/focus/FocusOwnerImpl$c;

    invoke-direct {v4, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl$c;-><init>(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    invoke-static {v2, p1, v3, v4}, Landroidx/compose/ui/focus/k;->e(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILpm2;Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->r(I)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    return v1

    :cond_4
    sget-object p1, Landroidx/compose/ui/focus/FocusOwnerImpl$b;->g:Landroidx/compose/ui/focus/FocusOwnerImpl$b;

    invoke-virtual {v2, p1}, Landroidx/compose/ui/focus/h;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1
.end method

.method public j()LOs4;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/k;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/compose/ui/focus/k;->d(Landroidx/compose/ui/focus/FocusTargetModifierNode;)LOs4;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public k(LRv1;)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->b:LAv1;

    invoke-virtual {v0, p1}, LAv1;->e(LRv1;)V

    return-void
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    const/4 v1, 0x1

    invoke-static {v0, v1, v1}, Landroidx/compose/ui/focus/j;->c(Landroidx/compose/ui/focus/FocusTargetModifierNode;ZZ)Z

    return-void
.end method

.method public m(LQb5;)Z
    .locals 6

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/k;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object v0

    const/16 v1, 0x4000

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-static {v1}, LK83;->a(I)I

    move-result v3

    invoke-static {v0, v3}, LwZ0;->f(LvZ0;I)LgV2$c;

    move-result-object v0

    instance-of v3, v0, LOb5;

    if-nez v3, :cond_0

    move-object v0, v2

    :cond_0
    check-cast v0, LOb5;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    const/4 v3, 0x0

    if-eqz v0, :cond_9

    invoke-static {v1}, LK83;->a(I)I

    move-result v1

    invoke-static {v0, v1}, LwZ0;->c(LvZ0;I)Ljava/util/List;

    move-result-object v1

    instance-of v4, v1, Ljava/util/List;

    if-eqz v4, :cond_2

    move-object v2, v1

    :cond_2
    const/4 v1, 0x1

    if-eqz v2, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_5

    :goto_1
    add-int/lit8 v5, v4, -0x1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LOb5;

    invoke-interface {v4, p1}, LOb5;->l(LQb5;)Z

    move-result v4

    if-eqz v4, :cond_3

    return v1

    :cond_3
    if-gez v5, :cond_4

    goto :goto_2

    :cond_4
    move v4, v5

    goto :goto_1

    :cond_5
    :goto_2
    invoke-interface {v0, p1}, LOb5;->l(LQb5;)Z

    move-result v4

    if-eqz v4, :cond_6

    return v1

    :cond_6
    invoke-interface {v0, p1}, LOb5;->u(LQb5;)Z

    move-result v0

    if-eqz v0, :cond_7

    return v1

    :cond_7
    if-eqz v2, :cond_9

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    move v4, v3

    :goto_3
    if-ge v4, v0, :cond_9

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LOb5;

    invoke-interface {v5, p1}, LOb5;->u(LQb5;)Z

    move-result v5

    if-eqz v5, :cond_8

    return v1

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_9
    return v3
.end method

.method public n(Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->h(ZZ)V

    return-void
.end method

.method public o()Lpm2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lpm2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "layoutDirection"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final p()Landroidx/compose/ui/focus/FocusTargetModifierNode;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    return-object v0
.end method

.method public final q(LvZ0;)Lrk2;
    .locals 6

    const/16 v0, 0x400

    invoke-static {v0}, LK83;->a(I)I

    move-result v1

    const/16 v2, 0x2000

    invoke-static {v2}, LK83;->a(I)I

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p1}, LvZ0;->r()LgV2$c;

    move-result-object v2

    invoke-virtual {v2}, LgV2$c;->Q()Z

    move-result v2

    const-string v3, "Check failed."

    if-eqz v2, :cond_5

    invoke-interface {p1}, LvZ0;->r()LgV2$c;

    move-result-object p1

    invoke-virtual {p1}, LgV2$c;->G()I

    move-result v2

    and-int/2addr v2, v1

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    invoke-virtual {p1}, LgV2$c;->I()LgV2$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_4

    invoke-virtual {p1}, LgV2$c;->M()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_3

    invoke-static {v0}, LK83;->a(I)I

    move-result v2

    invoke-virtual {p1}, LgV2$c;->M()I

    move-result v5

    and-int/2addr v2, v5

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_1

    check-cast v4, Lrk2;

    return-object v4

    :cond_1
    instance-of v2, p1, Lrk2;

    if-eqz v2, :cond_2

    move-object v4, p1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_2
    invoke-virtual {p1}, LgV2$c;->I()LgV2$c;

    move-result-object p1

    goto :goto_0

    :cond_4
    check-cast v4, Lrk2;

    return-object v4

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final r(I)Z
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object v0

    invoke-interface {v0}, LWv1;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object v0

    invoke-interface {v0}, LWv1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->e()I

    move-result v2

    invoke-static {p1, v2}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->f()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/focus/c;->l(II)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->n(Z)V

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object v0

    invoke-interface {v0}, LWv1;->a()Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->i(I)Z

    move-result p1

    return p1

    :cond_3
    :goto_1
    return v1
.end method
