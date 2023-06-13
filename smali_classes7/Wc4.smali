.class public final LWc4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a(\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u001a\u001e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u001e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0018\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "LUc4;",
        "q",
        "f",
        "c",
        "a",
        "b",
        "",
        "t",
        "dotThreshold",
        "g",
        "d",
        "e",
        "LVb5;",
        "order",
        "Lhu1;",
        "sceneview_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(LUc4;LVb5;)Lhu1;
    .locals 1

    const-string v0, "q"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "order"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LnN2;->f(LUc4;)LyM2;

    move-result-object p0

    invoke-static {p0, p1}, LnN2;->a(LyM2;LVb5;)Lhu1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LUc4;LVb5;ILjava/lang/Object;)Lhu1;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    sget-object p1, LVb5;->j:LVb5;

    :cond_0
    invoke-static {p0, p1}, LWc4;->a(LUc4;LVb5;)Lhu1;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LUc4;)LUc4;
    .locals 5

    const-string v0, "q"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LUc4;->b()F

    move-result v0

    invoke-virtual {p0}, LUc4;->b()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, LUc4;->c()F

    move-result v1

    invoke-virtual {p0}, LUc4;->c()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, LUc4;->d()F

    move-result v1

    invoke-virtual {p0}, LUc4;->d()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, LUc4;->a()F

    move-result v1

    invoke-virtual {p0}, LUc4;->a()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v1, v0

    new-instance v0, LUc4;

    invoke-virtual {p0}, LUc4;->b()F

    move-result v2

    neg-float v2, v2

    mul-float/2addr v2, v1

    invoke-virtual {p0}, LUc4;->c()F

    move-result v3

    neg-float v3, v3

    mul-float/2addr v3, v1

    invoke-virtual {p0}, LUc4;->d()F

    move-result v4

    neg-float v4, v4

    mul-float/2addr v4, v1

    invoke-virtual {p0}, LUc4;->a()F

    move-result p0

    mul-float/2addr p0, v1

    invoke-direct {v0, v2, v3, v4, p0}, LUc4;-><init>(FFFF)V

    return-object v0
.end method

.method public static final d(LUc4;LUc4;F)LUc4;
    .locals 5

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p2

    new-instance v1, LUc4;

    invoke-virtual {p0}, LUc4;->b()F

    move-result v2

    mul-float/2addr v2, v0

    invoke-virtual {p0}, LUc4;->c()F

    move-result v3

    mul-float/2addr v3, v0

    invoke-virtual {p0}, LUc4;->d()F

    move-result v4

    mul-float/2addr v4, v0

    invoke-virtual {p0}, LUc4;->a()F

    move-result p0

    mul-float/2addr v0, p0

    invoke-direct {v1, v2, v3, v4, v0}, LUc4;-><init>(FFFF)V

    new-instance p0, LUc4;

    invoke-virtual {p1}, LUc4;->b()F

    move-result v0

    mul-float/2addr v0, p2

    invoke-virtual {p1}, LUc4;->c()F

    move-result v2

    mul-float/2addr v2, p2

    invoke-virtual {p1}, LUc4;->d()F

    move-result v3

    mul-float/2addr v3, p2

    invoke-virtual {p1}, LUc4;->a()F

    move-result p1

    mul-float/2addr p2, p1

    invoke-direct {p0, v0, v2, v3, p2}, LUc4;-><init>(FFFF)V

    new-instance p1, LUc4;

    invoke-virtual {v1}, LUc4;->b()F

    move-result p2

    invoke-virtual {p0}, LUc4;->b()F

    move-result v0

    add-float/2addr p2, v0

    invoke-virtual {v1}, LUc4;->c()F

    move-result v0

    invoke-virtual {p0}, LUc4;->c()F

    move-result v2

    add-float/2addr v0, v2

    invoke-virtual {v1}, LUc4;->d()F

    move-result v2

    invoke-virtual {p0}, LUc4;->d()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {v1}, LUc4;->a()F

    move-result v1

    invoke-virtual {p0}, LUc4;->a()F

    move-result p0

    add-float/2addr v1, p0

    invoke-direct {p1, p2, v0, v2, v1}, LUc4;-><init>(FFFF)V

    return-object p1
.end method

.method public static final e(LUc4;LUc4;F)LUc4;
    .locals 1

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LWc4;->d(LUc4;LUc4;F)LUc4;

    move-result-object p0

    invoke-static {p0}, LWc4;->f(LUc4;)LUc4;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LUc4;)LUc4;
    .locals 5

    const-string v0, "q"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LUc4;->b()F

    move-result v0

    invoke-virtual {p0}, LUc4;->b()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, LUc4;->c()F

    move-result v1

    invoke-virtual {p0}, LUc4;->c()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, LUc4;->d()F

    move-result v1

    invoke-virtual {p0}, LUc4;->d()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, LUc4;->a()F

    move-result v1

    invoke-virtual {p0}, LUc4;->a()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v1, v0

    new-instance v0, LUc4;

    invoke-virtual {p0}, LUc4;->b()F

    move-result v2

    mul-float/2addr v2, v1

    invoke-virtual {p0}, LUc4;->c()F

    move-result v3

    mul-float/2addr v3, v1

    invoke-virtual {p0}, LUc4;->d()F

    move-result v4

    mul-float/2addr v4, v1

    invoke-virtual {p0}, LUc4;->a()F

    move-result p0

    mul-float/2addr p0, v1

    invoke-direct {v0, v2, v3, v4, p0}, LUc4;-><init>(FFFF)V

    return-object v0
.end method

.method public static final g(LUc4;LUc4;FF)LUc4;
    .locals 6

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LUc4;->b()F

    move-result v0

    invoke-virtual {p1}, LUc4;->b()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, LUc4;->c()F

    move-result v1

    invoke-virtual {p1}, LUc4;->c()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, LUc4;->d()F

    move-result v1

    invoke-virtual {p1}, LUc4;->d()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, LUc4;->a()F

    move-result v1

    invoke-virtual {p1}, LUc4;->a()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gez v1, :cond_0

    neg-float v0, v0

    invoke-virtual {p1}, LUc4;->f()LUc4;

    move-result-object p1

    :cond_0
    cmpg-float p3, v0, p3

    if-gez p3, :cond_1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->acos(D)D

    move-result-wide v0

    double-to-float p3, v0

    float-to-double v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p2

    mul-float/2addr v1, p3

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    new-instance v2, LUc4;

    invoke-virtual {p0}, LUc4;->b()F

    move-result v3

    mul-float/2addr v3, v1

    invoke-virtual {p0}, LUc4;->c()F

    move-result v4

    mul-float/2addr v4, v1

    invoke-virtual {p0}, LUc4;->d()F

    move-result v5

    mul-float/2addr v5, v1

    invoke-virtual {p0}, LUc4;->a()F

    move-result p0

    mul-float/2addr p0, v1

    invoke-direct {v2, v3, v4, v5, p0}, LUc4;-><init>(FFFF)V

    new-instance p0, LUc4;

    invoke-virtual {v2}, LUc4;->b()F

    move-result v1

    div-float/2addr v1, v0

    invoke-virtual {v2}, LUc4;->c()F

    move-result v3

    div-float/2addr v3, v0

    invoke-virtual {v2}, LUc4;->d()F

    move-result v4

    div-float/2addr v4, v0

    invoke-virtual {v2}, LUc4;->a()F

    move-result v2

    div-float/2addr v2, v0

    invoke-direct {p0, v1, v3, v4, v2}, LUc4;-><init>(FFFF)V

    mul-float/2addr p2, p3

    float-to-double p2, p2

    invoke-static {p2, p3}, Ljava/lang/Math;->sin(D)D

    move-result-wide p2

    double-to-float p2, p2

    new-instance p3, LUc4;

    invoke-virtual {p1}, LUc4;->b()F

    move-result v1

    mul-float/2addr v1, p2

    invoke-virtual {p1}, LUc4;->c()F

    move-result v2

    mul-float/2addr v2, p2

    invoke-virtual {p1}, LUc4;->d()F

    move-result v3

    mul-float/2addr v3, p2

    invoke-virtual {p1}, LUc4;->a()F

    move-result p1

    mul-float/2addr p1, p2

    invoke-direct {p3, v1, v2, v3, p1}, LUc4;-><init>(FFFF)V

    new-instance p1, LUc4;

    invoke-virtual {p3}, LUc4;->b()F

    move-result p2

    div-float/2addr p2, v0

    invoke-virtual {p3}, LUc4;->c()F

    move-result v1

    div-float/2addr v1, v0

    invoke-virtual {p3}, LUc4;->d()F

    move-result v2

    div-float/2addr v2, v0

    invoke-virtual {p3}, LUc4;->a()F

    move-result p3

    div-float/2addr p3, v0

    invoke-direct {p1, p2, v1, v2, p3}, LUc4;-><init>(FFFF)V

    new-instance p2, LUc4;

    invoke-virtual {p0}, LUc4;->b()F

    move-result p3

    invoke-virtual {p1}, LUc4;->b()F

    move-result v0

    add-float/2addr p3, v0

    invoke-virtual {p0}, LUc4;->c()F

    move-result v0

    invoke-virtual {p1}, LUc4;->c()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, LUc4;->d()F

    move-result v1

    invoke-virtual {p1}, LUc4;->d()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {p0}, LUc4;->a()F

    move-result p0

    invoke-virtual {p1}, LUc4;->a()F

    move-result p1

    add-float/2addr p0, p1

    invoke-direct {p2, p3, v0, v1, p0}, LUc4;-><init>(FFFF)V

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, p2}, LWc4;->e(LUc4;LUc4;F)LUc4;

    move-result-object p2

    :goto_0
    return-object p2
.end method

.method public static synthetic h(LUc4;LUc4;FFILjava/lang/Object;)LUc4;
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    const p3, 0x3f7fdf3b    # 0.9995f

    :cond_0
    invoke-static {p0, p1, p2, p3}, LWc4;->g(LUc4;LUc4;FF)LUc4;

    move-result-object p0

    return-object p0
.end method
