.class public final Landroidx/compose/ui/focus/FocusTargetModifierNode;
.super LgV2$c;
.source "SourceFile"

# interfaces
.implements Lhe3;
.implements LmV2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u000bJ\u0008\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u000f\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "Lhe3;",
        "LmV2;",
        "LgV2$c;",
        "",
        "s",
        "T",
        "Landroidx/compose/ui/focus/e;",
        "e0",
        "()Landroidx/compose/ui/focus/e;",
        "i0",
        "()V",
        "j0",
        "LXv1;",
        "l",
        "LXv1;",
        "h0",
        "()LXv1;",
        "k0",
        "(LXv1;)V",
        "focusStateImpl",
        "LWv1;",
        "g0",
        "()LWv1;",
        "focusState",
        "LBG;",
        "f0",
        "()LBG;",
        "beyondBoundsLayoutParent",
        "<init>",
        "FocusTargetModifierElement",
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
        "SMAP\nFocusTargetModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,195:1\n89#2:196\n87#2:197\n87#2:208\n91#2:217\n87#2:218\n87#2:229\n47#3:198\n47#3:219\n78#4,9:199\n88#4,7:210\n78#4,9:220\n88#4,7:231\n196#5:209\n196#5:230\n*S KotlinDebug\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n*L\n88#1:196\n88#1:197\n91#1:208\n174#1:217\n174#1:218\n175#1:229\n88#1:198\n174#1:219\n88#1:199,9\n88#1:210,7\n174#1:220,9\n174#1:231,7\n91#1:209\n175#1:230\n*E\n"
    }
.end annotation


# instance fields
.field public l:LXv1;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LgV2$c;-><init>()V

    sget-object v0, LXv1;->e:LXv1;

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;->l:LXv1;

    return-void
.end method


# virtual methods
.method public T()V
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object v0

    sget-object v1, LXv1;->b:LXv1;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    sget-object v1, LXv1;->d:LXv1;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    invoke-static {p0}, LwZ0;->i(LvZ0;)LjD3;

    move-result-object v0

    invoke-interface {v0}, LjD3;->B()LQv1;

    move-result-object v0

    invoke-interface {v0, v2}, LBv1;->n(Z)V

    goto :goto_2

    :cond_2
    sget-object v1, LXv1;->c:LXv1;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->j0()V

    sget-object v0, LXv1;->e:LXv1;

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;->l:LXv1;

    goto :goto_2

    :cond_3
    sget-object v1, LXv1;->e:LXv1;

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->j0()V

    :cond_4
    :goto_2
    return-void
.end method

.method public final e0()Landroidx/compose/ui/focus/e;
    .locals 8

    new-instance v0, Landroidx/compose/ui/focus/f;

    invoke-direct {v0}, Landroidx/compose/ui/focus/f;-><init>()V

    const/16 v1, 0x800

    invoke-static {v1}, LK83;->a(I)I

    move-result v1

    const/16 v2, 0x400

    invoke-static {v2}, LK83;->a(I)I

    move-result v3

    or-int/2addr v1, v3

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v3

    invoke-virtual {v3}, LgV2$c;->Q()Z

    move-result v3

    const-string v4, "Check failed."

    if-eqz v3, :cond_7

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v3

    invoke-virtual {v3}, LgV2$c;->O()LgV2$c;

    move-result-object v3

    invoke-static {p0}, LwZ0;->h(LvZ0;)LJm2;

    move-result-object v5

    :goto_0
    if-eqz v5, :cond_6

    invoke-virtual {v5}, LJm2;->m0()LF83;

    move-result-object v6

    invoke-virtual {v6}, LF83;->l()LgV2$c;

    move-result-object v6

    invoke-virtual {v6}, LgV2$c;->G()I

    move-result v6

    and-int/2addr v6, v1

    if-eqz v6, :cond_4

    :goto_1
    if-eqz v3, :cond_4

    invoke-virtual {v3}, LgV2$c;->M()I

    move-result v6

    and-int/2addr v6, v1

    if-eqz v6, :cond_3

    invoke-static {v2}, LK83;->a(I)I

    move-result v6

    invoke-virtual {v3}, LgV2$c;->M()I

    move-result v7

    and-int/2addr v6, v7

    if-eqz v6, :cond_0

    const/4 v6, 0x1

    goto :goto_2

    :cond_0
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_1

    return-object v0

    :cond_1
    instance-of v6, v3, LRv1;

    if-eqz v6, :cond_2

    move-object v6, v3

    check-cast v6, LRv1;

    invoke-interface {v6, v0}, LRv1;->m(Landroidx/compose/ui/focus/e;)V

    goto :goto_3

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_3
    invoke-virtual {v3}, LgV2$c;->O()LgV2$c;

    move-result-object v3

    goto :goto_1

    :cond_4
    invoke-virtual {v5}, LJm2;->p0()LJm2;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, LJm2;->m0()LF83;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, LF83;->o()LgV2$c;

    move-result-object v3

    goto :goto_0

    :cond_5
    const/4 v3, 0x0

    goto :goto_0

    :cond_6
    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f0()LBG;
    .locals 1

    invoke-static {}, LCG;->a()LV94;

    move-result-object v0

    invoke-interface {p0, v0}, LmV2;->a(LhV2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBG;

    return-object v0
.end method

.method public final g0()LWv1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;->l:LXv1;

    return-object v0
.end method

.method public final h0()LXv1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;->l:LXv1;

    return-object v0
.end method

.method public final i0()V
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object v0

    sget-object v1, LXv1;->b:LXv1;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    sget-object v1, LXv1;->d:LXv1;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_3

    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v1, Landroidx/compose/ui/focus/FocusTargetModifierNode$a;

    invoke-direct {v1, v0, p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode$a;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    invoke-static {p0, v1}, Lie3;->a(LgV2$c;Lkotlin/jvm/functions/Function0;)V

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-nez v0, :cond_2

    const-string v0, "focusProperties"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    check-cast v0, Landroidx/compose/ui/focus/e;

    :goto_2
    invoke-interface {v0}, Landroidx/compose/ui/focus/e;->h()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {p0}, LwZ0;->i(LvZ0;)LjD3;

    move-result-object v0

    invoke-interface {v0}, LjD3;->B()LQv1;

    move-result-object v0

    invoke-interface {v0, v2}, LBv1;->n(Z)V

    goto :goto_3

    :cond_3
    sget-object v1, LXv1;->c:LXv1;

    if-ne v0, v1, :cond_4

    goto :goto_3

    :cond_4
    sget-object v0, LXv1;->b:LXv1;

    :cond_5
    :goto_3
    return-void
.end method

.method public final j0()V
    .locals 7

    const/16 v0, 0x1000

    invoke-static {v0}, LK83;->a(I)I

    move-result v0

    const/16 v1, 0x400

    invoke-static {v1}, LK83;->a(I)I

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v2

    invoke-virtual {v2}, LgV2$c;->Q()Z

    move-result v2

    const-string v3, "Check failed."

    if-eqz v2, :cond_6

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v2

    invoke-virtual {v2}, LgV2$c;->O()LgV2$c;

    move-result-object v2

    invoke-static {p0}, LwZ0;->h(LvZ0;)LJm2;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_5

    invoke-virtual {v4}, LJm2;->m0()LF83;

    move-result-object v5

    invoke-virtual {v5}, LF83;->l()LgV2$c;

    move-result-object v5

    invoke-virtual {v5}, LgV2$c;->G()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_3

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, LgV2$c;->M()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_2

    invoke-static {v1}, LK83;->a(I)I

    move-result v5

    invoke-virtual {v2}, LgV2$c;->M()I

    move-result v6

    and-int/2addr v5, v6

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_2

    :cond_0
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_2

    instance-of v5, v2, Lvv1;

    if-eqz v5, :cond_1

    invoke-static {p0}, LwZ0;->i(LvZ0;)LjD3;

    move-result-object v5

    invoke-interface {v5}, LjD3;->B()LQv1;

    move-result-object v5

    move-object v6, v2

    check-cast v6, Lvv1;

    invoke-interface {v5, v6}, LQv1;->d(Lvv1;)V

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_3
    invoke-virtual {v2}, LgV2$c;->O()LgV2$c;

    move-result-object v2

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, LJm2;->p0()LJm2;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, LJm2;->m0()LF83;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, LF83;->o()LgV2$c;

    move-result-object v2

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    goto :goto_0

    :cond_5
    return-void

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k0(LXv1;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;->l:LXv1;

    return-void
.end method

.method public s()V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->i0()V

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->g0()LWv1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lwv1;->b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    :cond_0
    return-void
.end method
