.class public final Lom2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u0008\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0000*\u00020\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\n"
    }
    d2 = {
        "Lnm2;",
        "LCe3;",
        "e",
        "(Lnm2;)J",
        "f",
        "LOs4;",
        "b",
        "c",
        "a",
        "d",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lnm2;)LOs4;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lnm2;->t()Lnm2;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lnm2;->f(Lnm2;Lnm2;ZILjava/lang/Object;)LOs4;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, LOs4;

    invoke-interface {p0}, Lnm2;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LG52;->g(J)I

    move-result v1

    int-to-float v1, v1

    invoke-interface {p0}, Lnm2;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LG52;->f(J)I

    move-result p0

    int-to-float p0, p0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p0}, LOs4;-><init>(FFFF)V

    :cond_1
    return-object v0
.end method

.method public static final b(Lnm2;)LOs4;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lom2;->d(Lnm2;)Lnm2;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lnm2;->f(Lnm2;Lnm2;ZILjava/lang/Object;)LOs4;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lnm2;)LOs4;
    .locals 17

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Lom2;->d(Lnm2;)Lnm2;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Lom2;->b(Lnm2;)LOs4;

    move-result-object v1

    invoke-interface {v0}, Lnm2;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LG52;->g(J)I

    move-result v2

    int-to-float v2, v2

    invoke-interface {v0}, Lnm2;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, LG52;->f(J)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1}, LOs4;->i()F

    move-result v4

    const/4 v5, 0x0

    invoke-static {v4, v5, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v4

    invoke-virtual {v1}, LOs4;->l()F

    move-result v6

    invoke-static {v6, v5, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v6

    invoke-virtual {v1}, LOs4;->j()F

    move-result v7

    invoke-static {v7, v5, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v2

    invoke-virtual {v1}, LOs4;->e()F

    move-result v1

    invoke-static {v1, v5, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v1

    cmpg-float v3, v4, v2

    const/4 v5, 0x1

    const/4 v7, 0x0

    if-nez v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v7

    :goto_0
    if-nez v3, :cond_3

    cmpg-float v3, v6, v1

    if-nez v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v7

    :goto_1
    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-static {v4, v6}, LGe3;->a(FF)J

    move-result-wide v8

    invoke-interface {v0, v8, v9}, Lnm2;->i(J)J

    move-result-wide v8

    invoke-static {v2, v6}, LGe3;->a(FF)J

    move-result-wide v10

    invoke-interface {v0, v10, v11}, Lnm2;->i(J)J

    move-result-wide v10

    invoke-static {v2, v1}, LGe3;->a(FF)J

    move-result-wide v2

    invoke-interface {v0, v2, v3}, Lnm2;->i(J)J

    move-result-wide v2

    invoke-static {v4, v1}, LGe3;->a(FF)J

    move-result-wide v12

    invoke-interface {v0, v12, v13}, Lnm2;->i(J)J

    move-result-wide v0

    invoke-static {v8, v9}, LCe3;->o(J)F

    move-result v4

    const/4 v6, 0x3

    new-array v12, v6, [F

    invoke-static {v10, v11}, LCe3;->o(J)F

    move-result v13

    aput v13, v12, v7

    invoke-static {v0, v1}, LCe3;->o(J)F

    move-result v13

    aput v13, v12, v5

    invoke-static {v2, v3}, LCe3;->o(J)F

    move-result v13

    const/4 v14, 0x2

    aput v13, v12, v14

    invoke-static {v4, v12}, Lkotlin/comparisons/ComparisonsKt;->minOf(F[F)F

    move-result v4

    invoke-static {v8, v9}, LCe3;->p(J)F

    move-result v12

    new-array v13, v6, [F

    invoke-static {v10, v11}, LCe3;->p(J)F

    move-result v15

    aput v15, v13, v7

    invoke-static {v0, v1}, LCe3;->p(J)F

    move-result v15

    aput v15, v13, v5

    invoke-static {v2, v3}, LCe3;->p(J)F

    move-result v15

    aput v15, v13, v14

    invoke-static {v12, v13}, Lkotlin/comparisons/ComparisonsKt;->minOf(F[F)F

    move-result v12

    invoke-static {v8, v9}, LCe3;->o(J)F

    move-result v13

    new-array v15, v6, [F

    invoke-static {v10, v11}, LCe3;->o(J)F

    move-result v16

    aput v16, v15, v7

    invoke-static {v0, v1}, LCe3;->o(J)F

    move-result v16

    aput v16, v15, v5

    invoke-static {v2, v3}, LCe3;->o(J)F

    move-result v16

    aput v16, v15, v14

    invoke-static {v13, v15}, Lkotlin/comparisons/ComparisonsKt;->maxOf(F[F)F

    move-result v13

    invoke-static {v8, v9}, LCe3;->p(J)F

    move-result v8

    new-array v6, v6, [F

    invoke-static {v10, v11}, LCe3;->p(J)F

    move-result v9

    aput v9, v6, v7

    invoke-static {v0, v1}, LCe3;->p(J)F

    move-result v0

    aput v0, v6, v5

    invoke-static {v2, v3}, LCe3;->p(J)F

    move-result v0

    aput v0, v6, v14

    invoke-static {v8, v6}, Lkotlin/comparisons/ComparisonsKt;->maxOf(F[F)F

    move-result v0

    new-instance v1, LOs4;

    invoke-direct {v1, v4, v12, v13, v0}, LOs4;-><init>(FFFF)V

    return-object v1

    :cond_3
    :goto_2
    sget-object v0, LOs4;->e:LOs4$a;

    invoke-virtual {v0}, LOs4$a;->a()LOs4;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Lnm2;)Lnm2;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lnm2;->t()Lnm2;

    move-result-object v0

    :goto_0
    move-object v1, v0

    move-object v0, p0

    move-object p0, v1

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lnm2;->t()Lnm2;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of p0, v0, LH83;

    if-eqz p0, :cond_1

    move-object p0, v0

    check-cast p0, LH83;

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    if-nez p0, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p0}, LH83;->j2()LH83;

    move-result-object v0

    :goto_2
    move-object v1, v0

    move-object v0, p0

    move-object p0, v1

    if-eqz p0, :cond_3

    invoke-virtual {p0}, LH83;->j2()LH83;

    move-result-object v0

    goto :goto_2

    :cond_3
    return-object v0
.end method

.method public static final e(Lnm2;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LCe3;->b:LCe3$a;

    invoke-virtual {v0}, LCe3$a;->c()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Lnm2;->y(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final f(Lnm2;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LCe3;->b:LCe3$a;

    invoke-virtual {v0}, LCe3$a;->c()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Lnm2;->i(J)J

    move-result-wide v0

    return-wide v0
.end method
