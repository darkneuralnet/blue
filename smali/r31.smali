.class public final Lr31;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\'\u0010\t\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0007H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a#\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0007H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lx31;",
        "dialogNavigator",
        "",
        "a",
        "(Lx31;LEt0;I)V",
        "",
        "LAY2;",
        "",
        "transitionsInProgress",
        "c",
        "(Ljava/util/List;Ljava/util/Collection;LEt0;I)V",
        "LMM5;",
        "d",
        "(Ljava/util/Collection;LEt0;I)LMM5;",
        "navigation-compose_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lx31;LEt0;I)V
    .locals 10

    const-string v0, "dialogNavigator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x118f13d0

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v0, p2, 0xe

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v0, v0, 0xb

    if-ne v0, v1, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_4

    :cond_3
    :goto_2
    const/4 v0, 0x0

    invoke-static {p1, v0}, LGi5;->a(LEt0;I)LEi5;

    move-result-object v0

    invoke-virtual {p0}, Lx31;->n()LtP5;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    const/4 v7, 0x1

    invoke-static {v1, v2, p1, v3, v7}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    invoke-static {v1}, Lr31;->b(LsP5;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, p1, v3}, Lr31;->d(Ljava/util/Collection;LEt0;I)LMM5;

    move-result-object v2

    invoke-static {v1}, Lr31;->b(LsP5;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    const/16 v3, 0x40

    invoke-static {v2, v1, p1, v3}, Lr31;->c(Ljava/util/List;Ljava/util/Collection;LEt0;I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAY2;

    invoke-virtual {v1}, LAY2;->f()LHY2;

    move-result-object v2

    check-cast v2, Lx31$b;

    new-instance v3, Lr31$a;

    invoke-direct {v3, p0, v1}, Lr31$a;-><init>(Lx31;LAY2;)V

    invoke-virtual {v2}, Lx31$b;->G()LD31;

    move-result-object v4

    new-instance v5, Lr31$b;

    invoke-direct {v5, v1, v0, p0, v2}, Lr31$b;-><init>(LAY2;LEi5;Lx31;Lx31$b;)V

    const v1, 0x43541ebc

    invoke-static {p1, v1, v7, v5}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v5

    const/16 v6, 0x180

    const/4 v9, 0x0

    move-object v1, v3

    move-object v2, v4

    move-object v3, v5

    move-object v4, p1

    move v5, v6

    move v6, v9

    invoke-static/range {v1 .. v6}, LDc;->a(Lkotlin/jvm/functions/Function0;LD31;Lkotlin/jvm/functions/Function2;LEt0;II)V

    goto :goto_3

    :cond_4
    :goto_4
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_5

    :cond_5
    new-instance v0, Lr31$c;

    invoke-direct {v0, p0, p2}, Lr31$c;-><init>(Lx31;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final b(LsP5;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;)",
            "Ljava/util/List<",
            "LAY2;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final c(Ljava/util/List;Ljava/util/Collection;LEt0;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LAY2;",
            ">;",
            "Ljava/util/Collection<",
            "LAY2;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transitionsInProgress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5baa69c3

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAY2;

    invoke-virtual {v1}, LAY2;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v2

    new-instance v3, Lr31$d;

    invoke-direct {v3, v1, p0}, Lr31$d;-><init>(LAY2;Ljava/util/List;)V

    const/16 v1, 0x8

    invoke-static {v2, v3, p2, v1}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Lr31$e;

    invoke-direct {v0, p0, p1, p3}, Lr31$e;-><init>(Ljava/util/List;Ljava/util/Collection;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method public static final d(Ljava/util/Collection;LEt0;I)LMM5;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LAY2;",
            ">;",
            "LEt0;",
            "I)",
            "LMM5<",
            "LAY2;",
            ">;"
        }
    .end annotation

    const-string p2, "transitionsInProgress"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x1bdba1c5

    invoke-interface {p1, p2}, LEt0;->F(I)V

    const p2, -0x384212

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_0

    sget-object p2, LEt0;->a:LEt0$a;

    invoke-virtual {p2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_3

    :cond_0
    invoke-static {}, LGM5;->d()LMM5;

    move-result-object v0

    check-cast p0, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LAY2;

    invoke-virtual {v2}, LAY2;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object v2

    sget-object v3, Landroidx/lifecycle/f$b;->e:Landroidx/lifecycle/f$b;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/f$b;->b(Landroidx/lifecycle/f$b;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p2}, LMM5;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p1, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v0, LMM5;

    invoke-interface {p1}, LEt0;->Q()V

    return-object v0
.end method
