.class public final LiM5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0015\n\u0002\u0008\u0004\u0008\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u000c\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0013\u0088\u0001\u001c\u0092\u0001\u00020\u001b\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "LiM5;",
        "",
        "LI52;",
        "diagonals",
        "",
        "a",
        "([ILI52;)V",
        "",
        "h",
        "([I)I",
        "startX",
        "i",
        "startY",
        "d",
        "endX",
        "e",
        "endY",
        "",
        "g",
        "([I)Z",
        "reverse",
        "c",
        "diagonalSize",
        "f",
        "hasAdditionOrRemoval",
        "j",
        "isAddition",
        "",
        "data",
        "b",
        "([I)[I",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation


# direct methods
.method public static final a([ILI52;)V
    .locals 3

    const-string v0, "diagonals"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LiM5;->f([I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, LiM5;->g([I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LiM5;->h([I)I

    move-result v0

    invoke-static {p0}, LiM5;->i([I)I

    move-result v1

    invoke-static {p0}, LiM5;->c([I)I

    move-result p0

    invoke-virtual {p1, v0, v1, p0}, LI52;->e(III)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, LiM5;->j([I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, LiM5;->h([I)I

    move-result v0

    invoke-static {p0}, LiM5;->i([I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {p0}, LiM5;->c([I)I

    move-result p0

    invoke-virtual {p1, v0, v1, p0}, LI52;->e(III)V

    goto :goto_0

    :cond_1
    invoke-static {p0}, LiM5;->h([I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {p0}, LiM5;->i([I)I

    move-result v1

    invoke-static {p0}, LiM5;->c([I)I

    move-result p0

    invoke-virtual {p1, v0, v1, p0}, LI52;->e(III)V

    goto :goto_0

    :cond_2
    invoke-static {p0}, LiM5;->h([I)I

    move-result v0

    invoke-static {p0}, LiM5;->i([I)I

    move-result v1

    invoke-static {p0}, LiM5;->d([I)I

    move-result v2

    invoke-static {p0}, LiM5;->h([I)I

    move-result p0

    sub-int/2addr v2, p0

    invoke-virtual {p1, v0, v1, v2}, LI52;->e(III)V

    :goto_0
    return-void
.end method

.method public static b([I)[I
    .locals 1

    const-string v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c([I)I
    .locals 2

    invoke-static {p0}, LiM5;->d([I)I

    move-result v0

    invoke-static {p0}, LiM5;->h([I)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p0}, LiM5;->e([I)I

    move-result v1

    invoke-static {p0}, LiM5;->i([I)I

    move-result p0

    sub-int/2addr v1, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static final d([I)I
    .locals 1

    const/4 v0, 0x2

    aget p0, p0, v0

    return p0
.end method

.method public static final e([I)I
    .locals 1

    const/4 v0, 0x3

    aget p0, p0, v0

    return p0
.end method

.method public static final f([I)Z
    .locals 2

    invoke-static {p0}, LiM5;->e([I)I

    move-result v0

    invoke-static {p0}, LiM5;->i([I)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p0}, LiM5;->d([I)I

    move-result v1

    invoke-static {p0}, LiM5;->h([I)I

    move-result p0

    sub-int/2addr v1, p0

    if-eq v0, v1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final g([I)Z
    .locals 1

    const/4 v0, 0x4

    aget p0, p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final h([I)I
    .locals 1

    const/4 v0, 0x0

    aget p0, p0, v0

    return p0
.end method

.method public static final i([I)I
    .locals 1

    const/4 v0, 0x1

    aget p0, p0, v0

    return p0
.end method

.method public static final j([I)Z
    .locals 2

    invoke-static {p0}, LiM5;->e([I)I

    move-result v0

    invoke-static {p0}, LiM5;->i([I)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p0}, LiM5;->d([I)I

    move-result v1

    invoke-static {p0}, LiM5;->h([I)I

    move-result p0

    sub-int/2addr v1, p0

    if-le v0, v1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
