.class public final Lfm0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u000c\u0010\u0008\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u00072\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\tH\u0002\u001a\u0014\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r*\u00020\u000cH\u0002\u001a\u001c\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\u00120\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0002\"\u0018\u0010\u0016\u001a\u00020\u0007*\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lis5;",
        "node",
        "Lp2;",
        "info",
        "",
        "d",
        "e",
        "",
        "b",
        "",
        "items",
        "a",
        "Lem0;",
        "Lp2$b;",
        "kotlin.jvm.PlatformType",
        "f",
        "Lgm0;",
        "itemNode",
        "Lp2$c;",
        "g",
        "c",
        "(Lem0;)Z",
        "isLazyCollection",
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
        "SMAP\nCollectionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n*L\n1#1,153:1\n33#2,6:154\n33#2,6:160\n38#3,11:166\n68#3,7:177\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n*L\n43#1:154,6\n87#1:160,6\n122#1:166,11\n130#1:177,7\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Ljava/util/List;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lis5;",
            ">;)Z"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v4

    move v5, v1

    :goto_0
    if-ge v5, v4, :cond_3

    add-int/lit8 v5, v5, 0x1

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lis5;

    check-cast v3, Lis5;

    invoke-virtual {v3}, Lis5;->f()LOs4;

    move-result-object v8

    invoke-virtual {v8}, LOs4;->g()J

    move-result-wide v8

    invoke-static {v8, v9}, LCe3;->o(J)F

    move-result v8

    invoke-virtual {v7}, Lis5;->f()LOs4;

    move-result-object v9

    invoke-virtual {v9}, LOs4;->g()J

    move-result-wide v9

    invoke-static {v9, v10}, LCe3;->o(J)F

    move-result v9

    sub-float/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    invoke-virtual {v3}, Lis5;->f()LOs4;

    move-result-object v3

    invoke-virtual {v3}, LOs4;->g()J

    move-result-wide v9

    invoke-static {v9, v10}, LCe3;->p(J)F

    move-result v3

    invoke-virtual {v7}, Lis5;->f()LOs4;

    move-result-object v7

    invoke-virtual {v7}, LOs4;->g()J

    move-result-wide v9

    invoke-static {v9, v10}, LCe3;->p(J)F

    move-result v7

    sub-float/2addr v3, v7

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v8, v3}, LGe3;->a(FF)J

    move-result-wide v7

    invoke-static {v7, v8}, LCe3;->d(J)LCe3;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v3, v6

    goto :goto_0

    :cond_2
    :goto_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_3
    move-object p0, v0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    if-ne p0, v2, :cond_4

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LCe3;

    invoke-virtual {p0}, LCe3;->x()J

    move-result-wide v3

    goto :goto_3

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_7

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v3

    if-gt v2, v3, :cond_5

    move v4, v2

    :goto_2
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LCe3;

    invoke-virtual {v5}, LCe3;->x()J

    move-result-wide v5

    check-cast p0, LCe3;

    invoke-virtual {p0}, LCe3;->x()J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, LCe3;->t(JJ)J

    move-result-wide v5

    invoke-static {v5, v6}, LCe3;->d(J)LCe3;

    move-result-object p0

    if-eq v4, v3, :cond_5

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    check-cast p0, LCe3;

    invoke-virtual {p0}, LCe3;->x()J

    move-result-wide v3

    :goto_3
    invoke-static {v3, v4}, LCe3;->e(J)F

    move-result p0

    invoke-static {v3, v4}, LCe3;->f(J)F

    move-result v0

    cmpg-float p0, v0, p0

    if-gez p0, :cond_6

    goto :goto_4

    :cond_6
    move v2, v1

    :goto_4
    return v2

    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Empty collection can\'t be reduced."

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lis5;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lis5;->j()Lbs5;

    move-result-object v0

    sget-object v1, Lms5;->a:Lms5;

    invoke-virtual {v1}, Lms5;->a()Lrs5;

    move-result-object v2

    invoke-static {v0, v2}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lis5;->j()Lbs5;

    move-result-object p0

    invoke-virtual {v1}, Lms5;->u()Lrs5;

    move-result-object v0

    invoke-static {p0, v0}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final c(Lem0;)Z
    .locals 1

    invoke-virtual {p0}, Lem0;->b()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lem0;->a()I

    move-result p0

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final d(Lis5;Lp2;)V
    .locals 7

    const-string v0, "node"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lis5;->j()Lbs5;

    move-result-object v0

    sget-object v1, Lms5;->a:Lms5;

    invoke-virtual {v1}, Lms5;->a()Lrs5;

    move-result-object v2

    invoke-static {v0, v2}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lem0;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lfm0;->f(Lem0;)Lp2$b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lp2;->h0(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lis5;->j()Lbs5;

    move-result-object v2

    invoke-virtual {v1}, Lms5;->u()Lrs5;

    move-result-object v1

    invoke-static {v2, v1}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lis5;->q()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lis5;

    invoke-virtual {v4}, Lis5;->j()Lbs5;

    move-result-object v5

    sget-object v6, Lms5;->a:Lms5;

    invoke-virtual {v6}, Lms5;->v()Lrs5;

    move-result-object v6

    invoke-virtual {v5, v6}, Lbs5;->c(Lrs5;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    const/4 v1, 0x1

    xor-int/2addr p0, v1

    if-eqz p0, :cond_5

    invoke-static {v0}, Lfm0;->a(Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_3

    move v3, v1

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_1
    if-eqz p0, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    :cond_4
    invoke-static {v3, v1, v2, v2}, Lp2$b;->b(IIZI)Lp2$b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lp2;->h0(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public static final e(Lis5;Lp2;)V
    .locals 12

    const-string v0, "node"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lis5;->j()Lbs5;

    move-result-object v0

    sget-object v1, Lms5;->a:Lms5;

    invoke-virtual {v1}, Lms5;->b()Lrs5;

    move-result-object v2

    invoke-static {v0, v2}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgm0;

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, Lfm0;->g(Lgm0;Lis5;)Lp2$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp2;->i0(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lis5;->o()Lis5;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Lis5;->j()Lbs5;

    move-result-object v2

    invoke-virtual {v1}, Lms5;->u()Lrs5;

    move-result-object v3

    invoke-static {v2, v3}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Lis5;->j()Lbs5;

    move-result-object v2

    invoke-virtual {v1}, Lms5;->a()Lrs5;

    move-result-object v3

    invoke-static {v2, v3}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lem0;

    if-eqz v2, :cond_2

    invoke-static {v2}, Lfm0;->c(Lem0;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lis5;->j()Lbs5;

    move-result-object v2

    invoke-virtual {v1}, Lms5;->v()Lrs5;

    move-result-object v1

    invoke-virtual {v2, v1}, Lbs5;->c(Lrs5;)Z

    move-result v1

    if-nez v1, :cond_3

    return-void

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lis5;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_5

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lis5;

    invoke-virtual {v6}, Lis5;->j()Lbs5;

    move-result-object v7

    sget-object v8, Lms5;->a:Lms5;

    invoke-virtual {v8}, Lms5;->v()Lrs5;

    move-result-object v8

    invoke-virtual {v7, v8}, Lbs5;->c(Lrs5;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Lis5;->m()LJm2;

    move-result-object v6

    invoke-virtual {v6}, LJm2;->q0()I

    move-result v6

    invoke-virtual {p0}, Lis5;->m()LJm2;

    move-result-object v7

    invoke-virtual {v7}, LJm2;->q0()I

    move-result v7

    if-ge v6, v7, :cond_4

    add-int/lit8 v5, v5, 0x1

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_8

    invoke-static {v1}, Lfm0;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_6

    move v6, v3

    goto :goto_1

    :cond_6
    move v6, v5

    :goto_1
    const/4 v7, 0x1

    if-eqz v0, :cond_7

    move v8, v5

    goto :goto_2

    :cond_7
    move v8, v3

    :goto_2
    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-virtual {p0}, Lis5;->j()Lbs5;

    move-result-object p0

    sget-object v0, Lms5;->a:Lms5;

    invoke-virtual {v0}, Lms5;->v()Lrs5;

    move-result-object v0

    sget-object v1, Lfm0$a;->g:Lfm0$a;

    invoke-virtual {p0, v0, v1}, Lbs5;->h(Lrs5;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    invoke-static/range {v6 .. v11}, Lp2$c;->a(IIIIZZ)Lp2$c;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p1, p0}, Lp2;->i0(Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method public static final f(Lem0;)Lp2$b;
    .locals 2

    invoke-virtual {p0}, Lem0;->b()I

    move-result v0

    invoke-virtual {p0}, Lem0;->a()I

    move-result p0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, v1}, Lp2$b;->b(IIZI)Lp2$b;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lgm0;Lis5;)Lp2$c;
    .locals 6

    invoke-virtual {p0}, Lgm0;->c()I

    move-result v0

    invoke-virtual {p0}, Lgm0;->d()I

    move-result v1

    invoke-virtual {p0}, Lgm0;->a()I

    move-result v2

    invoke-virtual {p0}, Lgm0;->b()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p1}, Lis5;->j()Lbs5;

    move-result-object p0

    sget-object p1, Lms5;->a:Lms5;

    invoke-virtual {p1}, Lms5;->v()Lrs5;

    move-result-object p1

    sget-object v5, Lfm0$b;->g:Lfm0$b;

    invoke-virtual {p0, p1, v5}, Lbs5;->h(Lrs5;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-static/range {v0 .. v5}, Lp2$c;->a(IIIIZZ)Lp2$c;

    move-result-object p0

    return-object p0
.end method
