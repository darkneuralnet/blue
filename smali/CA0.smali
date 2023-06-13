.class public final LCA0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\u001a%\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a%\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0005\u001a%\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0005\u001a%\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\u0005\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\t"
    }
    d2 = {
        "LxB5;",
        "srcSize",
        "dstSize",
        "",
        "f",
        "(JJ)F",
        "g",
        "h",
        "e",
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
.method public static final synthetic a(JJ)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, LCA0;->e(JJ)F

    move-result p0

    return p0
.end method

.method public static final synthetic b(JJ)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, LCA0;->f(JJ)F

    move-result p0

    return p0
.end method

.method public static final synthetic c(JJ)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, LCA0;->g(JJ)F

    move-result p0

    return p0
.end method

.method public static final synthetic d(JJ)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, LCA0;->h(JJ)F

    move-result p0

    return p0
.end method

.method public static final e(JJ)F
    .locals 0

    invoke-static {p2, p3}, LxB5;->g(J)F

    move-result p2

    invoke-static {p0, p1}, LxB5;->g(J)F

    move-result p0

    div-float/2addr p2, p0

    return p2
.end method

.method public static final f(JJ)F
    .locals 1

    invoke-static {p0, p1, p2, p3}, LCA0;->h(JJ)F

    move-result v0

    invoke-static {p0, p1, p2, p3}, LCA0;->e(JJ)F

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    return p0
.end method

.method public static final g(JJ)F
    .locals 1

    invoke-static {p0, p1, p2, p3}, LCA0;->h(JJ)F

    move-result v0

    invoke-static {p0, p1, p2, p3}, LCA0;->e(JJ)F

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method

.method public static final h(JJ)F
    .locals 0

    invoke-static {p2, p3}, LxB5;->i(J)F

    move-result p2

    invoke-static {p0, p1}, LxB5;->i(J)F

    move-result p0

    div-float/2addr p2, p0

    return p2
.end method
