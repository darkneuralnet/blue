.class public final LSs4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0000H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\n"
    }
    d2 = {
        "LCe3;",
        "offset",
        "LxB5;",
        "size",
        "LOs4;",
        "b",
        "(JJ)LOs4;",
        "topLeft",
        "bottomRight",
        "a",
        "ui-geometry_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(JJ)LOs4;
    .locals 2

    new-instance v0, LOs4;

    invoke-static {p0, p1}, LCe3;->o(J)F

    move-result v1

    invoke-static {p0, p1}, LCe3;->p(J)F

    move-result p0

    invoke-static {p2, p3}, LCe3;->o(J)F

    move-result p1

    invoke-static {p2, p3}, LCe3;->p(J)F

    move-result p2

    invoke-direct {v0, v1, p0, p1, p2}, LOs4;-><init>(FFFF)V

    return-object v0
.end method

.method public static final b(JJ)LOs4;
    .locals 5

    new-instance v0, LOs4;

    invoke-static {p0, p1}, LCe3;->o(J)F

    move-result v1

    invoke-static {p0, p1}, LCe3;->p(J)F

    move-result v2

    invoke-static {p0, p1}, LCe3;->o(J)F

    move-result v3

    invoke-static {p2, p3}, LxB5;->i(J)F

    move-result v4

    add-float/2addr v3, v4

    invoke-static {p0, p1}, LCe3;->p(J)F

    move-result p0

    invoke-static {p2, p3}, LxB5;->g(J)F

    move-result p1

    add-float/2addr p0, p1

    invoke-direct {v0, v1, v2, v3, p0}, LOs4;-><init>(FFFF)V

    return-object v0
.end method
