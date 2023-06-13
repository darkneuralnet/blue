.class public final Lhs5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u000c\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0007\u001a\u000c\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000\"\u001e\u0010\u000c\u001a\u00020\u0007*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lgs5;",
        "",
        "c",
        "Lbs5;",
        "a",
        "LOs4;",
        "d",
        "",
        "b",
        "(Lgs5;)Z",
        "getUseMinimumTouchTarget$annotations",
        "(Lgs5;)V",
        "useMinimumTouchTarget",
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
        "SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,73:1\n73#2:74\n73#2:76\n73#2:77\n308#3:75\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n48#1:74\n68#1:76\n71#1:77\n48#1:75\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lgs5;)Lbs5;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-static {v0}, LK83;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LwZ0;->e(LvZ0;I)LgV2$c;

    move-result-object v0

    instance-of v1, v0, Lgs5;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Lgs5;

    if-eqz v0, :cond_2

    invoke-interface {p0}, Lgs5;->H()Lbs5;

    move-result-object v1

    invoke-virtual {v1}, Lbs5;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lgs5;->H()Lbs5;

    move-result-object p0

    invoke-virtual {p0}, Lbs5;->e()Lbs5;

    move-result-object p0

    invoke-static {v0}, Lhs5;->a(Lgs5;)Lbs5;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbs5;->b(Lbs5;)V

    return-object p0

    :cond_2
    :goto_0
    invoke-interface {p0}, Lgs5;->H()Lbs5;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lgs5;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lgs5;->H()Lbs5;

    move-result-object p0

    sget-object v0, Las5;->a:Las5;

    invoke-virtual {v0}, Las5;->h()Lrs5;

    move-result-object v0

    invoke-static {p0, v0}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final c(Lgs5;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LwZ0;->i(LvZ0;)LjD3;

    move-result-object p0

    invoke-interface {p0}, LjD3;->V()V

    return-void
.end method

.method public static final d(Lgs5;)LOs4;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LvZ0;->r()LgV2$c;

    move-result-object v0

    invoke-virtual {v0}, LgV2$c;->Q()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, LOs4;->e:LOs4$a;

    invoke-virtual {p0}, LOs4$a;->a()LOs4;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lhs5;->b(Lgs5;)Z

    move-result v0

    const/16 v1, 0x8

    if-nez v0, :cond_1

    invoke-static {v1}, LK83;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LwZ0;->g(LvZ0;I)LH83;

    move-result-object p0

    invoke-static {p0}, Lom2;->b(Lnm2;)LOs4;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {v1}, LK83;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LwZ0;->g(LvZ0;I)LH83;

    move-result-object p0

    invoke-virtual {p0}, LH83;->Q2()LOs4;

    move-result-object p0

    return-object p0
.end method
