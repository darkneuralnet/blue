.class public final LT91;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0005"
    }
    d2 = {
        "Ls26;",
        "target",
        "deleted",
        "a",
        "(JJ)J",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(JJ)J
    .locals 3

    invoke-static {p0, p1}, Ls26;->l(J)I

    move-result v0

    invoke-static {p0, p1}, Ls26;->k(J)I

    move-result v1

    invoke-static {p2, p3, p0, p1}, Ls26;->p(JJ)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p2, p3, p0, p1}, Ls26;->d(JJ)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p2, p3}, Ls26;->l(J)I

    move-result v0

    move v1, v0

    goto :goto_1

    :cond_0
    invoke-static {p0, p1, p2, p3}, Ls26;->d(JJ)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {p2, p3}, Ls26;->j(J)I

    move-result p0

    goto :goto_0

    :cond_1
    invoke-static {p2, p3, v0}, Ls26;->e(JI)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {p2, p3}, Ls26;->l(J)I

    move-result v0

    invoke-static {p2, p3}, Ls26;->j(J)I

    move-result p0

    goto :goto_0

    :cond_2
    invoke-static {p2, p3}, Ls26;->l(J)I

    move-result v1

    goto :goto_1

    :cond_3
    invoke-static {p2, p3}, Ls26;->l(J)I

    move-result p0

    if-le v1, p0, :cond_4

    invoke-static {p2, p3}, Ls26;->j(J)I

    move-result p0

    sub-int/2addr v0, p0

    invoke-static {p2, p3}, Ls26;->j(J)I

    move-result p0

    :goto_0
    sub-int/2addr v1, p0

    :cond_4
    :goto_1
    invoke-static {v0, v1}, Lt26;->b(II)J

    move-result-wide p0

    return-wide p0
.end method
