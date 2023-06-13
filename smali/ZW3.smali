.class public final LZW3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0008\u001a\u00020\u0007*\u00020\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\t\u001a \u0010\u000c\u001a\u00020\u0007*\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0001H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a!\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\'\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0016"
    }
    d2 = {
        "LjX3;",
        "",
        "a",
        "b",
        "c",
        "d",
        "j",
        "LCe3;",
        "g",
        "(LjX3;)J",
        "h",
        "ignoreConsumed",
        "i",
        "(LjX3;Z)J",
        "LG52;",
        "size",
        "e",
        "(LjX3;J)Z",
        "LxB5;",
        "extendedTouchPadding",
        "f",
        "(LjX3;JJ)Z",
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
.method public static final a(LjX3;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LjX3;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LjX3;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LjX3;->g()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(LjX3;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LjX3;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LjX3;->g()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final c(LjX3;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LjX3;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LjX3;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LjX3;->g()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(LjX3;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LjX3;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LjX3;->g()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final e(LjX3;J)Z
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        message = "Use isOutOfBounds() that supports minimum touch target"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "this.isOutOfBounds(size, extendedTouchPadding)"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "$this$isOutOfBounds"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LjX3;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->o(J)F

    move-result p0

    invoke-static {v0, v1}, LCe3;->p(J)F

    move-result v0

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result v1

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result p1

    const/4 p2, 0x0

    cmpg-float v2, p0, p2

    if-ltz v2, :cond_1

    int-to-float v1, v1

    cmpl-float p0, p0, v1

    if-gtz p0, :cond_1

    cmpg-float p0, v0, p2

    if-ltz p0, :cond_1

    int-to-float p0, p1

    cmpl-float p0, v0, p0

    if-lez p0, :cond_0

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

.method public static final f(LjX3;JJ)Z
    .locals 4

    const-string v0, "$this$isOutOfBounds"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LjX3;->l()I

    move-result v0

    sget-object v1, LyX3;->a:LyX3$a;

    invoke-virtual {v1}, LyX3$a;->d()I

    move-result v1

    invoke-static {v0, v1}, LyX3;->g(II)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1, p2}, LZW3;->e(LjX3;J)Z

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p0}, LjX3;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->o(J)F

    move-result p0

    invoke-static {v0, v1}, LCe3;->p(J)F

    move-result v0

    invoke-static {p3, p4}, LxB5;->i(J)F

    move-result v1

    neg-float v1, v1

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result v2

    int-to-float v2, v2

    invoke-static {p3, p4}, LxB5;->i(J)F

    move-result v3

    add-float/2addr v2, v3

    invoke-static {p3, p4}, LxB5;->g(J)F

    move-result v3

    neg-float v3, v3

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result p1

    int-to-float p1, p1

    invoke-static {p3, p4}, LxB5;->g(J)F

    move-result p2

    add-float/2addr p1, p2

    cmpg-float p2, p0, v1

    if-ltz p2, :cond_2

    cmpl-float p0, p0, v2

    if-gtz p0, :cond_2

    cmpg-float p0, v0, v3

    if-ltz p0, :cond_2

    cmpl-float p0, v0, p1

    if-lez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final g(LjX3;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, LZW3;->i(LjX3;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final h(LjX3;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p0, v0}, LZW3;->i(LjX3;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final i(LjX3;Z)J
    .locals 4

    invoke-virtual {p0}, LjX3;->i()J

    move-result-wide v0

    invoke-virtual {p0}, LjX3;->f()J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, LCe3;->s(JJ)J

    move-result-wide v0

    if-nez p1, :cond_0

    invoke-virtual {p0}, LjX3;->n()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, LCe3;->b:LCe3$a;

    invoke-virtual {p0}, LCe3$a;->c()J

    move-result-wide v0

    :cond_0
    return-wide v0
.end method

.method public static final j(LjX3;)Z
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p0, v0}, LZW3;->i(LjX3;Z)J

    move-result-wide v1

    sget-object p0, LCe3;->b:LCe3$a;

    invoke-virtual {p0}, LCe3$a;->c()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LCe3;->l(JJ)Z

    move-result p0

    xor-int/2addr p0, v0

    return p0
.end method
