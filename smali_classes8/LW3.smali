.class public LLW3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LyB0;[LyB0;)Z
    .locals 0

    invoke-static {p0, p1}, LLW3;->c(LyB0;[LyB0;)I

    move-result p0

    const/4 p1, 0x2

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static b(LyB0;LEB0;)Z
    .locals 7

    new-instance v0, LBb5;

    invoke-direct {v0}, LBb5;-><init>()V

    new-instance v1, LyB0;

    invoke-direct {v1}, LyB0;-><init>()V

    new-instance v2, LyB0;

    invoke-direct {v2}, LyB0;-><init>()V

    invoke-interface {p1}, LEB0;->size()I

    move-result v3

    const/4 v4, 0x1

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    add-int/lit8 v6, v5, -0x1

    invoke-interface {p1, v6, v1}, LEB0;->T(ILyB0;)V

    invoke-interface {p1, v5, v2}, LEB0;->T(ILyB0;)V

    invoke-virtual {v0, p0, v1, v2}, Lsr2;->c(LyB0;LyB0;LyB0;)V

    invoke-virtual {v0}, Lsr2;->i()Z

    move-result v6

    if-eqz v6, :cond_0

    return v4

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static c(LyB0;[LyB0;)I
    .locals 0

    invoke-static {p0, p1}, Lvn4;->d(LyB0;[LyB0;)I

    move-result p0

    return p0
.end method
