.class public final LBY2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a!\u0010\u0008\u001a\u00020\u0004*\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "LAY2;",
        "LEi5;",
        "saveableStateHolder",
        "Lkotlin/Function0;",
        "",
        "content",
        "a",
        "(LAY2;LEi5;Lkotlin/jvm/functions/Function2;LEt0;I)V",
        "b",
        "(LEi5;Lkotlin/jvm/functions/Function2;LEt0;I)V",
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
.method public static final a(LAY2;LEi5;Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAY2;",
            "LEi5;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saveableStateHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5e232270

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    const/4 v0, 0x3

    new-array v0, v0, [LW94;

    sget-object v1, Lpv2;->a:Lpv2;

    invoke-virtual {v1, p0}, Lpv2;->b(LXr6;)LW94;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v1

    invoke-virtual {v1, p0}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {}, Landroidx/compose/ui/platform/h;->j()LU94;

    move-result-object v1

    invoke-virtual {v1, p0}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    new-instance v1, LBY2$a;

    invoke-direct {v1, p1, p2, p4}, LBY2$a;-><init>(LEi5;Lkotlin/jvm/functions/Function2;I)V

    const v3, -0x3279f30

    invoke-static {p3, v3, v2, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p3, v2}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LBY2$b;

    invoke-direct {v0, p0, p1, p2, p4}, LBY2$b;-><init>(LAY2;LEi5;Lkotlin/jvm/functions/Function2;I)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public static final b(LEi5;Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEi5;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const v0, 0x483b17a9

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    const v0, 0x671a9c9b

    invoke-interface {p2, v0}, LEt0;->F(I)V

    sget-object v0, Lpv2;->a:Lpv2;

    const/4 v1, 0x6

    invoke-virtual {v0, p2, v1}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v2

    if-eqz v2, :cond_2

    const/4 v3, 0x0

    const/4 v4, 0x0

    instance-of v0, v2, Landroidx/lifecycle/e;

    if-eqz v0, :cond_0

    move-object v0, v2

    check-cast v0, Landroidx/lifecycle/e;

    invoke-interface {v0}, Landroidx/lifecycle/e;->getDefaultViewModelCreationExtras()LFE0;

    move-result-object v0

    const-string v1, "{\n        viewModelStore\u2026ModelCreationExtras\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, LFE0$a;->b:LFE0$a;

    :goto_0
    move-object v5, v0

    const-class v1, LTv;

    const v7, 0x9048

    const/4 v8, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v0

    invoke-interface {p2}, LEt0;->Q()V

    check-cast v0, LTv;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LTv;->g(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0}, LTv;->e()Ljava/util/UUID;

    move-result-object v0

    and-int/lit8 v1, p3, 0x70

    or-int/lit16 v1, v1, 0x208

    invoke-interface {p0, v0, p1, p2, v1}, LEi5;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, LBY2$c;

    invoke-direct {v0, p0, p1, p3}, LBY2$c;-><init>(LEi5;Lkotlin/jvm/functions/Function2;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic c(LEi5;Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LBY2;->b(LEi5;Lkotlin/jvm/functions/Function2;LEt0;I)V

    return-void
.end method
