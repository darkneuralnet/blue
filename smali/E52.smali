.class public final LE52;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0007"
    }
    d2 = {
        "LA52;",
        "offset",
        "LG52;",
        "size",
        "LD52;",
        "a",
        "(JJ)LD52;",
        "ui-unit_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(JJ)LD52;
    .locals 5

    new-instance v0, LD52;

    invoke-static {p0, p1}, LA52;->j(J)I

    move-result v1

    invoke-static {p0, p1}, LA52;->k(J)I

    move-result v2

    invoke-static {p0, p1}, LA52;->j(J)I

    move-result v3

    invoke-static {p2, p3}, LG52;->g(J)I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {p0, p1}, LA52;->k(J)I

    move-result p0

    invoke-static {p2, p3}, LG52;->f(J)I

    move-result p1

    add-int/2addr p0, p1

    invoke-direct {v0, v1, v2, v3, p0}, LD52;-><init>(IIII)V

    return-object v0
.end method
