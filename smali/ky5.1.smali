.class public final Lky5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a8\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000\u001a \u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u001a4\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u000c\u0010\u0012\u001a\u00020\u0008*\u00020\u0011H\u0002\u001a=\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a4\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "LMz3;",
        "outline",
        "",
        "x",
        "y",
        "LcJ3;",
        "tmpTouchPointPath",
        "tmpOpPath",
        "",
        "b",
        "LOs4;",
        "rect",
        "d",
        "LMz3$c;",
        "touchPointPath",
        "opPath",
        "e",
        "LWb5;",
        "a",
        "LLC0;",
        "cornerRadius",
        "centerX",
        "centerY",
        "f",
        "(FFJFF)Z",
        "path",
        "c",
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
.method public static final a(LWb5;)Z
    .locals 3

    invoke-virtual {p0}, LWb5;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LLC0;->d(J)F

    move-result v0

    invoke-virtual {p0}, LWb5;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, LLC0;->d(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, LWb5;->j()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, LWb5;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LLC0;->d(J)F

    move-result v0

    invoke-virtual {p0}, LWb5;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, LLC0;->d(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, LWb5;->j()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, LWb5;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LLC0;->e(J)F

    move-result v0

    invoke-virtual {p0}, LWb5;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, LLC0;->e(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, LWb5;->d()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, LWb5;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, LLC0;->e(J)F

    move-result v0

    invoke-virtual {p0}, LWb5;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, LLC0;->e(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, LWb5;->d()F

    move-result p0

    cmpg-float p0, v0, p0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(LMz3;FFLcJ3;LcJ3;)Z
    .locals 1

    const-string v0, "outline"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LMz3$b;

    if-eqz v0, :cond_0

    check-cast p0, LMz3$b;

    invoke-virtual {p0}, LMz3$b;->a()LOs4;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lky5;->d(LOs4;FF)Z

    move-result p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, LMz3$c;

    if-eqz v0, :cond_1

    check-cast p0, LMz3$c;

    invoke-static {p0, p1, p2, p3, p4}, Lky5;->e(LMz3$c;FFLcJ3;LcJ3;)Z

    move-result p0

    goto :goto_0

    :cond_1
    instance-of v0, p0, LMz3$a;

    if-eqz v0, :cond_2

    check-cast p0, LMz3$a;

    invoke-virtual {p0}, LMz3$a;->a()LcJ3;

    move-result-object p0

    invoke-static {p0, p1, p2, p3, p4}, Lky5;->c(LcJ3;FFLcJ3;LcJ3;)Z

    move-result p0

    :goto_0
    return p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final c(LcJ3;FFLcJ3;LcJ3;)Z
    .locals 4

    new-instance v0, LOs4;

    const v1, 0x3ba3d70a    # 0.005f

    sub-float v2, p1, v1

    sub-float v3, p2, v1

    add-float/2addr p1, v1

    add-float/2addr p2, v1

    invoke-direct {v0, v2, v3, p1, p2}, LOs4;-><init>(FFFF)V

    if-nez p3, :cond_0

    invoke-static {}, Ltd;->a()LcJ3;

    move-result-object p3

    :cond_0
    invoke-interface {p3, v0}, LcJ3;->h(LOs4;)V

    if-nez p4, :cond_1

    invoke-static {}, Ltd;->a()LcJ3;

    move-result-object p4

    :cond_1
    sget-object p1, LrJ3;->a:LrJ3$a;

    invoke-virtual {p1}, LrJ3$a;->b()I

    move-result p1

    invoke-interface {p4, p0, p3, p1}, LcJ3;->i(LcJ3;LcJ3;I)Z

    invoke-interface {p4}, LcJ3;->isEmpty()Z

    move-result p0

    invoke-interface {p4}, LcJ3;->reset()V

    invoke-interface {p3}, LcJ3;->reset()V

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final d(LOs4;FF)Z
    .locals 1

    invoke-virtual {p0}, LOs4;->i()F

    move-result v0

    cmpg-float v0, v0, p1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, LOs4;->j()F

    move-result v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    invoke-virtual {p0}, LOs4;->l()F

    move-result p1

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    invoke-virtual {p0}, LOs4;->e()F

    move-result p0

    cmpg-float p0, p2, p0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final e(LMz3$c;FFLcJ3;LcJ3;)Z
    .locals 13

    move v0, p1

    move v1, p2

    move-object/from16 v2, p4

    invoke-virtual {p0}, LMz3$c;->a()LWb5;

    move-result-object v3

    invoke-virtual {v3}, LWb5;->e()F

    move-result v4

    cmpg-float v4, v0, v4

    if-ltz v4, :cond_7

    invoke-virtual {v3}, LWb5;->f()F

    move-result v4

    cmpl-float v4, v0, v4

    if-gez v4, :cond_7

    invoke-virtual {v3}, LWb5;->g()F

    move-result v4

    cmpg-float v4, v1, v4

    if-ltz v4, :cond_7

    invoke-virtual {v3}, LWb5;->a()F

    move-result v4

    cmpl-float v4, v1, v4

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {v3}, Lky5;->a(LWb5;)Z

    move-result v4

    if-nez v4, :cond_2

    if-nez v2, :cond_1

    invoke-static {}, Ltd;->a()LcJ3;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    invoke-interface {v4, v3}, LcJ3;->g(LWb5;)V

    move-object/from16 v3, p3

    invoke-static {v4, p1, p2, v3, v2}, Lky5;->c(LcJ3;FFLcJ3;LcJ3;)Z

    move-result v0

    return v0

    :cond_2
    invoke-virtual {v3}, LWb5;->e()F

    move-result v2

    invoke-virtual {v3}, LWb5;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LLC0;->d(J)F

    move-result v4

    add-float/2addr v4, v2

    invoke-virtual {v3}, LWb5;->g()F

    move-result v2

    invoke-virtual {v3}, LWb5;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LLC0;->e(J)F

    move-result v5

    add-float/2addr v5, v2

    invoke-virtual {v3}, LWb5;->f()F

    move-result v2

    invoke-virtual {v3}, LWb5;->i()J

    move-result-wide v6

    invoke-static {v6, v7}, LLC0;->d(J)F

    move-result v6

    sub-float v6, v2, v6

    invoke-virtual {v3}, LWb5;->g()F

    move-result v2

    invoke-virtual {v3}, LWb5;->i()J

    move-result-wide v7

    invoke-static {v7, v8}, LLC0;->e(J)F

    move-result v7

    add-float/2addr v7, v2

    invoke-virtual {v3}, LWb5;->f()F

    move-result v2

    invoke-virtual {v3}, LWb5;->c()J

    move-result-wide v8

    invoke-static {v8, v9}, LLC0;->d(J)F

    move-result v8

    sub-float v8, v2, v8

    invoke-virtual {v3}, LWb5;->a()F

    move-result v2

    invoke-virtual {v3}, LWb5;->c()J

    move-result-wide v9

    invoke-static {v9, v10}, LLC0;->e(J)F

    move-result v9

    sub-float v9, v2, v9

    invoke-virtual {v3}, LWb5;->a()F

    move-result v2

    invoke-virtual {v3}, LWb5;->b()J

    move-result-wide v10

    invoke-static {v10, v11}, LLC0;->e(J)F

    move-result v10

    sub-float v10, v2, v10

    invoke-virtual {v3}, LWb5;->e()F

    move-result v2

    invoke-virtual {v3}, LWb5;->b()J

    move-result-wide v11

    invoke-static {v11, v12}, LLC0;->d(J)F

    move-result v11

    add-float/2addr v11, v2

    cmpg-float v2, v0, v4

    if-gez v2, :cond_3

    cmpg-float v2, v1, v5

    if-gez v2, :cond_3

    invoke-virtual {v3}, LWb5;->h()J

    move-result-wide v2

    move v0, p1

    move v1, p2

    invoke-static/range {v0 .. v5}, Lky5;->f(FFJFF)Z

    move-result v0

    goto :goto_1

    :cond_3
    cmpg-float v2, v0, v11

    if-gez v2, :cond_4

    cmpl-float v2, v1, v10

    if-lez v2, :cond_4

    invoke-virtual {v3}, LWb5;->b()J

    move-result-wide v2

    move v0, p1

    move v1, p2

    move v4, v11

    move v5, v10

    invoke-static/range {v0 .. v5}, Lky5;->f(FFJFF)Z

    move-result v0

    goto :goto_1

    :cond_4
    cmpl-float v2, v0, v6

    if-lez v2, :cond_5

    cmpg-float v2, v1, v7

    if-gez v2, :cond_5

    invoke-virtual {v3}, LWb5;->i()J

    move-result-wide v2

    move v0, p1

    move v1, p2

    move v4, v6

    move v5, v7

    invoke-static/range {v0 .. v5}, Lky5;->f(FFJFF)Z

    move-result v0

    goto :goto_1

    :cond_5
    cmpl-float v2, v0, v8

    if-lez v2, :cond_6

    cmpl-float v2, v1, v9

    if-lez v2, :cond_6

    invoke-virtual {v3}, LWb5;->c()J

    move-result-wide v2

    move v0, p1

    move v1, p2

    move v4, v8

    move v5, v9

    invoke-static/range {v0 .. v5}, Lky5;->f(FFJFF)Z

    move-result v0

    goto :goto_1

    :cond_6
    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_7
    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method public static final f(FFJFF)Z
    .locals 0

    sub-float/2addr p0, p4

    sub-float/2addr p1, p5

    invoke-static {p2, p3}, LLC0;->d(J)F

    move-result p4

    invoke-static {p2, p3}, LLC0;->e(J)F

    move-result p2

    mul-float/2addr p0, p0

    mul-float/2addr p4, p4

    div-float/2addr p0, p4

    mul-float/2addr p1, p1

    mul-float/2addr p2, p2

    div-float/2addr p1, p2

    add-float/2addr p0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p0, p0, p1

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
