.class public final Lf79;
.super LQ69;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LQ69;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LY69;

    invoke-virtual {p1}, LY69;->a()I

    move-result p1

    return p1
.end method

.method public final synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LY69;

    invoke-virtual {p1}, LY69;->b()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LpU8;

    iget-object v0, p1, LpU8;->zzc:LY69;

    invoke-static {}, LY69;->c()LY69;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, LY69;->f()LY69;

    move-result-object v0

    iput-object v0, p1, LpU8;->zzc:LY69;

    :cond_0
    return-object v0
.end method

.method public final synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LpU8;

    iget-object p1, p1, LpU8;->zzc:LY69;

    return-object p1
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, LY69;->c()LY69;

    move-result-object v0

    invoke-virtual {v0, p2}, LY69;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, LY69;->c()LY69;

    move-result-object v0

    invoke-virtual {v0, p1}, LY69;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p2, LY69;

    check-cast p1, LY69;

    invoke-static {p1, p2}, LY69;->e(LY69;LY69;)LY69;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p2, LY69;

    move-object v0, p1

    check-cast v0, LY69;

    invoke-virtual {v0, p2}, LY69;->d(LY69;)LY69;

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final bridge synthetic f(Ljava/lang/Object;IJ)V
    .locals 0

    shl-int/lit8 p2, p2, 0x3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, LY69;

    invoke-virtual {p1, p2, p3}, LY69;->j(ILjava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LpU8;

    iget-object p1, p1, LpU8;->zzc:LY69;

    invoke-virtual {p1}, LY69;->h()V

    return-void
.end method

.method public final synthetic h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LpU8;

    check-cast p2, LY69;

    iput-object p2, p1, LpU8;->zzc:LY69;

    return-void
.end method

.method public final synthetic i(Ljava/lang/Object;Lba9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LY69;

    invoke-virtual {p1, p2}, LY69;->k(Lba9;)V

    return-void
.end method
