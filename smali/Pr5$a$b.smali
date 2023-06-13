.class public final LPr5$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPr5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPr5$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ@\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0008H\u0002J8\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0008H\u0002J\u0014\u0010\u0017\u001a\u00020\u0008*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J(\u0010\u0019\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u0008H\u0002\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Pr5$a$b",
        "LPr5;",
        "Li26;",
        "textLayoutResult",
        "Ls26;",
        "newRawSelectionRange",
        "",
        "previousHandleOffset",
        "",
        "isStartHandle",
        "previousSelectionRange",
        "a",
        "(Li26;JIZLs26;)J",
        "newRawOffset",
        "previousRawOffset",
        "previousAdjustedOffset",
        "otherBoundaryOffset",
        "isStart",
        "isReversed",
        "e",
        "currentLine",
        "d",
        "offset",
        "b",
        "previousReversed",
        "c",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li26;JIZLs26;)J
    .locals 8

    const-string v0, "textLayoutResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p6, :cond_0

    sget-object v0, LPr5$a;->a:LPr5$a;

    invoke-virtual {v0}, LPr5$a;->g()LPr5;

    move-result-object v1

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, LPr5;->a(Li26;JIZLs26;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-static {p2, p3}, Ls26;->h(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li26;->k()Lg26;

    move-result-object p4

    invoke-virtual {p4}, Lg26;->j()LDf;

    move-result-object p4

    invoke-virtual {p4}, LDf;->j()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2, p3}, Ls26;->n(J)I

    move-result p2

    invoke-virtual {p1}, Li26;->k()Lg26;

    move-result-object p1

    invoke-virtual {p1}, Lg26;->j()LDf;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/StringsKt;->getLastIndex(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-virtual {p6}, Ls26;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ls26;->m(J)Z

    move-result p3

    invoke-static {p4, p2, p1, p5, p3}, LQr5;->a(Ljava/lang/String;IIZZ)J

    move-result-wide p1

    return-wide p1

    :cond_1
    if-eqz p5, :cond_2

    invoke-static {p2, p3}, Ls26;->n(J)I

    move-result v2

    invoke-virtual {p6}, Ls26;->r()J

    move-result-wide p5

    invoke-static {p5, p6}, Ls26;->n(J)I

    move-result v4

    invoke-static {p2, p3}, Ls26;->i(J)I

    move-result v5

    const/4 v6, 0x1

    invoke-static {p2, p3}, Ls26;->m(J)Z

    move-result v7

    move-object v0, p0

    move-object v1, p1

    move v3, p4

    invoke-virtual/range {v0 .. v7}, LPr5$a$b;->e(Li26;IIIIZZ)I

    move-result p1

    invoke-static {p2, p3}, Ls26;->i(J)I

    move-result p2

    goto :goto_0

    :cond_2
    invoke-static {p2, p3}, Ls26;->n(J)I

    move-result p5

    invoke-static {p2, p3}, Ls26;->i(J)I

    move-result v2

    invoke-virtual {p6}, Ls26;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ls26;->i(J)I

    move-result v4

    invoke-static {p2, p3}, Ls26;->n(J)I

    move-result v5

    const/4 v6, 0x0

    invoke-static {p2, p3}, Ls26;->m(J)Z

    move-result v7

    move-object v0, p0

    move-object v1, p1

    move v3, p4

    invoke-virtual/range {v0 .. v7}, LPr5$a$b;->e(Li26;IIIIZZ)I

    move-result p2

    move p1, p5

    :goto_0
    invoke-static {p1, p2}, Lt26;->b(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b(Li26;I)Z
    .locals 2

    invoke-virtual {p1, p2}, Li26;->B(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ls26;->n(J)I

    move-result p1

    if-eq p2, p1, :cond_1

    invoke-static {v0, v1}, Ls26;->i(J)I

    move-result p1

    if-ne p2, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final c(IIZZ)Z
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-ne p2, v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    if-ne p1, p2, :cond_1

    return v0

    :cond_1
    xor-int/2addr p3, p4

    if-eqz p3, :cond_2

    if-ge p1, p2, :cond_3

    goto :goto_0

    :cond_2
    if-le p1, p2, :cond_3

    goto :goto_0

    :cond_3
    move v1, v0

    :goto_0
    return v1
.end method

.method public final d(Li26;IIIZZ)I
    .locals 5

    invoke-virtual {p1, p2}, Li26;->B(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ls26;->n(J)I

    move-result v2

    invoke-virtual {p1, v2}, Li26;->p(I)I

    move-result v2

    if-ne v2, p3, :cond_0

    invoke-static {v0, v1}, Ls26;->n(J)I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p3}, Li26;->t(I)I

    move-result v2

    :goto_0
    invoke-static {v0, v1}, Ls26;->i(J)I

    move-result v3

    invoke-virtual {p1, v3}, Li26;->p(I)I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, p3, :cond_1

    invoke-static {v0, v1}, Ls26;->i(J)I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, p3, v0, v4, v1}, Li26;->o(Li26;IZILjava/lang/Object;)I

    move-result p1

    :goto_1
    if-ne v2, p4, :cond_2

    return p1

    :cond_2
    if-ne p1, p4, :cond_3

    return v2

    :cond_3
    add-int p3, v2, p1

    div-int/2addr p3, v4

    xor-int p4, p5, p6

    if-eqz p4, :cond_4

    if-gt p2, p3, :cond_5

    goto :goto_2

    :cond_4
    if-lt p2, p3, :cond_6

    :cond_5
    move v2, p1

    :cond_6
    :goto_2
    return v2
.end method

.method public final e(Li26;IIIIZZ)I
    .locals 7

    if-ne p2, p3, :cond_0

    return p4

    :cond_0
    invoke-virtual {p1, p2}, Li26;->p(I)I

    move-result v3

    invoke-virtual {p1, p4}, Li26;->p(I)I

    move-result v0

    if-eq v3, v0, :cond_1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v4, p5

    move v5, p6

    move v6, p7

    invoke-virtual/range {v0 .. v6}, LPr5$a$b;->d(Li26;IIIZZ)I

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0, p2, p3, p6, p7}, LPr5$a$b;->c(IIZZ)Z

    move-result p3

    if-nez p3, :cond_2

    return p2

    :cond_2
    invoke-virtual {p0, p1, p4}, LPr5$a$b;->b(Li26;I)Z

    move-result p3

    if-nez p3, :cond_3

    return p2

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v4, p5

    move v5, p6

    move v6, p7

    invoke-virtual/range {v0 .. v6}, LPr5$a$b;->d(Li26;IIIZZ)I

    move-result p1

    return p1
.end method
