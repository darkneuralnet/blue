.class public final LTt8;
.super LFs8;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LFs8;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LUs8;

    invoke-virtual {p1}, LUs8;->a()I

    move-result p1

    return p1
.end method

.method public final synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LUs8;

    invoke-virtual {p1}, LUs8;->b()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LV78;

    iget-object v0, p1, LV78;->zzc:LUs8;

    invoke-static {}, LUs8;->c()LUs8;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, LUs8;->f()LUs8;

    move-result-object v0

    iput-object v0, p1, LV78;->zzc:LUs8;

    :cond_0
    return-object v0
.end method

.method public final synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV78;

    iget-object p1, p1, LV78;->zzc:LUs8;

    return-object p1
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, LUs8;->c()LUs8;

    move-result-object v0

    invoke-virtual {v0, p2}, LUs8;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, LUs8;->c()LUs8;

    move-result-object v0

    invoke-virtual {v0, p1}, LUs8;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p2, LUs8;

    check-cast p1, LUs8;

    invoke-static {p1, p2}, LUs8;->e(LUs8;LUs8;)LUs8;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p2, LUs8;

    move-object v0, p1

    check-cast v0, LUs8;

    invoke-virtual {v0, p2}, LUs8;->d(LUs8;)LUs8;

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final bridge synthetic f(Ljava/lang/Object;IJ)V
    .locals 0

    shl-int/lit8 p2, p2, 0x3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, LUs8;

    invoke-virtual {p1, p2, p3}, LUs8;->j(ILjava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LV78;

    iget-object p1, p1, LV78;->zzc:LUs8;

    invoke-virtual {p1}, LUs8;->h()V

    return-void
.end method

.method public final synthetic h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LV78;

    check-cast p2, LUs8;

    iput-object p2, p1, LV78;->zzc:LUs8;

    return-void
.end method

.method public final synthetic i(Ljava/lang/Object;LSx8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LUs8;

    invoke-virtual {p1, p2}, LUs8;->k(LSx8;)V

    return-void
.end method

.method public final synthetic j(Ljava/lang/Object;LSx8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LUs8;

    invoke-virtual {p1, p2}, LUs8;->l(LSx8;)V

    return-void
.end method
