.class public final Ldu9;
.super Len7;
.source "SourceFile"


# instance fields
.field public final d:LJy9;


# direct methods
.method public constructor <init>(LJy9;)V
    .locals 1

    const-string v0, "internal.registerCallback"

    invoke-direct {p0, v0}, Len7;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ldu9;->d:LJy9;

    return-void
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 4

    iget-object v0, p0, Len7;->b:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {v0, v1, p2}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p1, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {v0}, LXs7;->zzi()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXs7;

    invoke-virtual {p1, v1}, Lam8;->b(LXs7;)LXs7;

    move-result-object v1

    instance-of v2, v1, Lhs7;

    if-eqz v2, :cond_3

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LXs7;

    invoke-virtual {p1, p2}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    instance-of p2, p1, Lzq7;

    if-eqz p2, :cond_2

    check-cast p1, Lzq7;

    const-string p2, "type"

    invoke-virtual {p1, p2}, Lzq7;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, p2}, Lzq7;->a(Ljava/lang/String;)LXs7;

    move-result-object p2

    invoke-interface {p2}, LXs7;->zzi()Ljava/lang/String;

    move-result-object p2

    const-string v2, "priority"

    invoke-virtual {p1, v2}, Lzq7;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1, v2}, Lzq7;->a(Ljava/lang/String;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lbt8;->b(D)I

    move-result p1

    goto :goto_0

    :cond_0
    const/16 p1, 0x3e8

    :goto_0
    iget-object v2, p0, Ldu9;->d:LJy9;

    check-cast v1, Lhs7;

    invoke-virtual {v2, v0, p1, v1, p2}, LJy9;->a(Ljava/lang/String;ILhs7;Ljava/lang/String;)V

    sget-object p1, LXs7;->h0:LXs7;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Undefined rule type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid callback params"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid callback type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
