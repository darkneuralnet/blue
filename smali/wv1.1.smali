.class public final Lwv1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwv1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0001\u00a8\u0006\u0006"
    }
    d2 = {
        "Lvv1;",
        "LWv1;",
        "a",
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "",
        "b",
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
        "SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,75:1\n87#2:76\n91#2:106\n87#2:107\n87#2:118\n340#3:77\n206#3,2:78\n208#3,7:83\n215#3,15:91\n78#3,9:109\n88#3,7:120\n1182#4:80\n1161#4,2:81\n48#5:90\n47#6:108\n196#7:119\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n45#1:76\n65#1:106\n65#1:107\n68#1:118\n45#1:77\n45#1:78,2\n45#1:83,7\n45#1:91,15\n65#1:109,9\n65#1:120,7\n45#1:80\n45#1:81,2\n45#1:90\n65#1:108\n68#1:119\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lvv1;)LWv1;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x400

    invoke-static {v0}, LK83;->a(I)I

    move-result v0

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v1

    invoke-virtual {v1}, LgV2$c;->Q()Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, LLX2;

    const/16 v2, 0x10

    new-array v2, v2, [LgV2$c;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, LLX2;-><init>([Ljava/lang/Object;I)V

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v2

    invoke-virtual {v2}, LgV2$c;->I()LgV2$c;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object p0

    invoke-static {v1, p0}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, LLX2;->b(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    invoke-virtual {v1}, LLX2;->x()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {v1}, LLX2;->u()I

    move-result p0

    const/4 v2, 0x1

    sub-int/2addr p0, v2

    invoke-virtual {v1, p0}, LLX2;->C(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LgV2$c;

    invoke-virtual {p0}, LgV2$c;->G()I

    move-result v3

    and-int/2addr v3, v0

    if-nez v3, :cond_2

    invoke-static {v1, p0}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz p0, :cond_1

    invoke-virtual {p0}, LgV2$c;->M()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_4

    instance-of v3, p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-eqz v3, :cond_1

    check-cast p0, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->h0()LXv1;

    move-result-object p0

    sget-object v3, Lwv1$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    if-eq v3, v2, :cond_3

    const/4 v2, 0x2

    if-eq v3, v2, :cond_3

    const/4 v2, 0x3

    if-eq v3, v2, :cond_3

    goto :goto_0

    :cond_3
    return-object p0

    :cond_4
    invoke-virtual {p0}, LgV2$c;->I()LgV2$c;

    move-result-object p0

    goto :goto_1

    :cond_5
    sget-object p0, LXv1;->e:LXv1;

    return-object p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

    if-eqz v2, :cond_7

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v2

    invoke-virtual {v2}, LgV2$c;->O()LgV2$c;

    move-result-object v2

    invoke-static {p0}, LwZ0;->h(LvZ0;)LJm2;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_6

    invoke-virtual {p0}, LJm2;->m0()LF83;

    move-result-object v4

    invoke-virtual {v4}, LF83;->l()LgV2$c;

    move-result-object v4

    invoke-virtual {v4}, LgV2$c;->G()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_4

    :goto_1
    if-eqz v2, :cond_4

    invoke-virtual {v2}, LgV2$c;->M()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_3

    invoke-static {v1}, LK83;->a(I)I

    move-result v4

    invoke-virtual {v2}, LgV2$c;->M()I

    move-result v5

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_2

    :cond_0
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_1

    return-void

    :cond_1
    instance-of v4, v2, Lvv1;

    if-eqz v4, :cond_2

    move-object v4, v2

    check-cast v4, Lvv1;

    invoke-static {v4}, Lwv1;->a(Lvv1;)LWv1;

    move-result-object v5

    invoke-interface {v4, v5}, Lvv1;->F(LWv1;)V

    goto :goto_3

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_3
    invoke-virtual {v2}, LgV2$c;->O()LgV2$c;

    move-result-object v2

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LJm2;->p0()LJm2;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, LJm2;->m0()LF83;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, LF83;->o()LgV2$c;

    move-result-object v2

    goto :goto_0

    :cond_5
    const/4 v2, 0x0

    goto :goto_0

    :cond_6
    return-void

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
