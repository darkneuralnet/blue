.class public final LDY2$b;
.super Lj13;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDY2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u0013\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u001f\u0010\u0017\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "LDY2$b;",
        "Lj13;",
        "LAY2;",
        "backStackEntry",
        "",
        "i",
        "m",
        "LHY2;",
        "destination",
        "Landroid/os/Bundle;",
        "arguments",
        "a",
        "popUpTo",
        "",
        "saveState",
        "g",
        "h",
        "entry",
        "e",
        "Ld13;",
        "Ld13;",
        "getNavigator",
        "()Ld13;",
        "navigator",
        "<init>",
        "(LDY2;Ld13;)V",
        "navigation-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final g:Ld13;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld13<",
            "+",
            "LHY2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LDY2;


# direct methods
.method public constructor <init>(LDY2;Ld13;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld13<",
            "+",
            "LHY2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDY2$b;->h:LDY2;

    invoke-direct {p0}, Lj13;-><init>()V

    iput-object p2, p0, LDY2$b;->g:Ld13;

    return-void
.end method

.method public static final synthetic l(LDY2$b;LAY2;Z)V
    .locals 0

    invoke-super {p0, p1, p2}, Lj13;->g(LAY2;Z)V

    return-void
.end method


# virtual methods
.method public a(LHY2;Landroid/os/Bundle;)LAY2;
    .locals 11

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LAY2;->o:LAY2$a;

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-virtual {v0}, LDY2;->x()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-virtual {v0}, LDY2;->D()Landroidx/lifecycle/f$b;

    move-result-object v5

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-static {v0}, LDY2;->j(LDY2;)LEY2;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x60

    const/4 v10, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v10}, LAY2$a;->b(LAY2$a;Landroid/content/Context;LHY2;Landroid/os/Bundle;Landroidx/lifecycle/f$b;LYY2;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)LAY2;

    move-result-object p1

    return-object p1
.end method

.method public e(LAY2;)V
    .locals 5

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-static {v0}, LDY2;->f(LDY2;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-super {p0, p1}, Lj13;->e(LAY2;)V

    iget-object v1, p0, LDY2$b;->h:LDY2;

    invoke-static {v1}, LDY2;->f(LDY2;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LDY2$b;->h:LDY2;

    invoke-virtual {v1}, LDY2;->v()Lkotlin/collections/ArrayDeque;

    move-result-object v1

    invoke-virtual {v1, p1}, Lkotlin/collections/ArrayDeque;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, LDY2$b;->h:LDY2;

    invoke-virtual {v1, p1}, LDY2;->k0(LAY2;)LAY2;

    invoke-virtual {p1}, LAY2;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/f$b;->d:Landroidx/lifecycle/f$b;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/f$b;->b(Landroidx/lifecycle/f$b;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/lifecycle/f$b;->b:Landroidx/lifecycle/f$b;

    invoke-virtual {p1, v1}, LAY2;->m(Landroidx/lifecycle/f$b;)V

    :cond_0
    iget-object v1, p0, LDY2$b;->h:LDY2;

    invoke-virtual {v1}, LDY2;->v()Lkotlin/collections/ArrayDeque;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LAY2;

    invoke-virtual {v2}, LAY2;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LAY2;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x0

    :cond_3
    :goto_0
    if-eqz v3, :cond_4

    if-nez v0, :cond_4

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-static {v0}, LDY2;->j(LDY2;)LEY2;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LAY2;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LEY2;->f(Ljava/lang/String;)V

    :cond_4
    iget-object p1, p0, LDY2$b;->h:LDY2;

    invoke-virtual {p1}, LDY2;->l0()V

    iget-object p1, p0, LDY2$b;->h:LDY2;

    invoke-static {p1}, LDY2;->l(LDY2;)LGX2;

    move-result-object p1

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-virtual {v0}, LDY2;->b0()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, LBX2;->b(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lj13;->d()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, LDY2$b;->h:LDY2;

    invoke-virtual {p1}, LDY2;->l0()V

    iget-object p1, p0, LDY2$b;->h:LDY2;

    invoke-static {p1}, LDY2;->l(LDY2;)LGX2;

    move-result-object p1

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-virtual {v0}, LDY2;->b0()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, LBX2;->b(Ljava/lang/Object;)Z

    :cond_6
    :goto_1
    return-void
.end method

.method public g(LAY2;Z)V
    .locals 2

    const-string v0, "popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-static {v0}, LDY2;->k(LDY2;)Li13;

    move-result-object v0

    invoke-virtual {p1}, LAY2;->f()LHY2;

    move-result-object v1

    invoke-virtual {v1}, LHY2;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Li13;->e(Ljava/lang/String;)Ld13;

    move-result-object v0

    iget-object v1, p0, LDY2$b;->g:Ld13;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-static {v0}, LDY2;->i(LDY2;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-super {p0, p1, p2}, Lj13;->g(LAY2;Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LDY2$b;->h:LDY2;

    new-instance v1, LDY2$b$a;

    invoke-direct {v1, p0, p1, p2}, LDY2$b$a;-><init>(LDY2$b;LAY2;Z)V

    invoke-virtual {v0, p1, v1}, LDY2;->V(LAY2;Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, LDY2$b;->h:LDY2;

    invoke-static {v1}, LDY2;->h(LDY2;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, LDY2$b;

    invoke-virtual {v0, p1, p2}, LDY2$b;->g(LAY2;Z)V

    :goto_0
    return-void
.end method

.method public h(LAY2;Z)V
    .locals 1

    const-string v0, "popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lj13;->h(LAY2;Z)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-static {v0}, LDY2;->f(LDY2;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public i(LAY2;)V
    .locals 2

    const-string v0, "backStackEntry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-static {v0}, LDY2;->k(LDY2;)Li13;

    move-result-object v0

    invoke-virtual {p1}, LAY2;->f()LHY2;

    move-result-object v1

    invoke-virtual {v1}, LHY2;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Li13;->e(Ljava/lang/String;)Ld13;

    move-result-object v0

    iget-object v1, p0, LDY2$b;->g:Ld13;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, LDY2$b;->h:LDY2;

    invoke-static {v0}, LDY2;->c(LDY2;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, LDY2$b;->m(LAY2;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring add of destination "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LAY2;->f()LHY2;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " outside of the call to navigate(). "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NavController"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    iget-object v1, p0, LDY2$b;->h:LDY2;

    invoke-static {v1}, LDY2;->h(LDY2;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, LDY2$b;

    invoke-virtual {v0, p1}, LDY2$b;->i(LAY2;)V

    :goto_0
    return-void

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NavigatorBackStack for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LAY2;->f()LHY2;

    move-result-object p1

    invoke-virtual {p1}, LHY2;->u()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " should already be created"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m(LAY2;)V
    .locals 1

    const-string v0, "backStackEntry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lj13;->i(LAY2;)V

    return-void
.end method
