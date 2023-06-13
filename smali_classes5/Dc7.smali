.class public final LDc7;
.super LBc7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LBc7;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LCc7;

    invoke-virtual {p1}, LCc7;->a()I

    move-result p1

    return p1
.end method

.method public final synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LCc7;

    invoke-virtual {p1}, LCc7;->b()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lfb7;

    iget-object v0, p1, Lfb7;->zbc:LCc7;

    invoke-static {}, LCc7;->c()LCc7;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, LCc7;->f()LCc7;

    move-result-object v0

    iput-object v0, p1, Lfb7;->zbc:LCc7;

    :cond_0
    return-object v0
.end method

.method public final synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfb7;

    iget-object p1, p1, Lfb7;->zbc:LCc7;

    return-object p1
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, LCc7;->c()LCc7;

    move-result-object v0

    invoke-virtual {v0, p2}, LCc7;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, LCc7;->c()LCc7;

    move-result-object v0

    invoke-virtual {v0, p1}, LCc7;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p2, LCc7;

    check-cast p1, LCc7;

    invoke-static {p1, p2}, LCc7;->e(LCc7;LCc7;)LCc7;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p2, LCc7;

    move-object v0, p1

    check-cast v0, LCc7;

    invoke-virtual {v0, p2}, LCc7;->d(LCc7;)LCc7;

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final bridge synthetic f(Ljava/lang/Object;ILCa7;)V
    .locals 0

    shl-int/lit8 p2, p2, 0x3

    check-cast p1, LCc7;

    or-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2, p3}, LCc7;->j(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic g(Ljava/lang/Object;IJ)V
    .locals 0

    shl-int/lit8 p2, p2, 0x3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, LCc7;

    invoke-virtual {p1, p2, p3}, LCc7;->j(ILjava/lang/Object;)V

    return-void
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lfb7;

    iget-object p1, p1, Lfb7;->zbc:LCc7;

    invoke-virtual {p1}, LCc7;->h()V

    return-void
.end method

.method public final synthetic i(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lfb7;

    check-cast p2, LCc7;

    iput-object p2, p1, Lfb7;->zbc:LCc7;

    return-void
.end method

.method public final synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lfb7;

    check-cast p2, LCc7;

    iput-object p2, p1, Lfb7;->zbc:LCc7;

    return-void
.end method

.method public final synthetic k(Ljava/lang/Object;LTc7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LCc7;

    invoke-virtual {p1, p2}, LCc7;->k(LTc7;)V

    return-void
.end method

.method public final synthetic l(Ljava/lang/Object;LTc7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LCc7;

    invoke-virtual {p1, p2}, LCc7;->l(LTc7;)V

    return-void
.end method
