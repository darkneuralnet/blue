.class public LCN5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJS0;
.implements LJS0$a;


# instance fields
.field public final b:LoV0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoV0<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:LJS0$a;

.field public volatile d:I

.field public volatile e:LBS0;

.field public volatile f:Ljava/lang/Object;

.field public volatile g:LWU2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWU2$a<",
            "*>;"
        }
    .end annotation
.end field

.field public volatile h:LCS0;


# direct methods
.method public constructor <init>(LoV0;LJS0$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LoV0<",
            "*>;",
            "LJS0$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCN5;->b:LoV0;

    iput-object p2, p0, LCN5;->c:LJS0$a;

    return-void
.end method


# virtual methods
.method public a(Lak2;Ljava/lang/Exception;LIS0;LZS0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            "Ljava/lang/Exception;",
            "LIS0<",
            "*>;",
            "LZS0;",
            ")V"
        }
    .end annotation

    iget-object p4, p0, LCN5;->c:LJS0$a;

    iget-object v0, p0, LCN5;->g:LWU2$a;

    iget-object v0, v0, LWU2$a;->c:LIS0;

    invoke-interface {v0}, LIS0;->b()LZS0;

    move-result-object v0

    invoke-interface {p4, p1, p2, p3, v0}, LJS0$a;->a(Lak2;Ljava/lang/Exception;LIS0;LZS0;)V

    return-void
.end method

.method public b()Z
    .locals 5

    iget-object v0, p0, LCN5;->f:Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LCN5;->f:Ljava/lang/Object;

    iput-object v1, p0, LCN5;->f:Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0, v0}, LCN5;->e(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    return v2

    :catch_0
    move-exception v0

    const/4 v3, 0x3

    const-string v4, "SourceGenerator"

    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "Failed to properly rewind or write data to cache"

    invoke-static {v4, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object v0, p0, LCN5;->e:LBS0;

    if-eqz v0, :cond_1

    iget-object v0, p0, LCN5;->e:LBS0;

    invoke-virtual {v0}, LBS0;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iput-object v1, p0, LCN5;->e:LBS0;

    iput-object v1, p0, LCN5;->g:LWU2$a;

    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-nez v0, :cond_4

    invoke-virtual {p0}, LCN5;->f()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, LCN5;->b:LoV0;

    invoke-virtual {v1}, LoV0;->g()Ljava/util/List;

    move-result-object v1

    iget v3, p0, LCN5;->d:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, LCN5;->d:I

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWU2$a;

    iput-object v1, p0, LCN5;->g:LWU2$a;

    iget-object v1, p0, LCN5;->g:LWU2$a;

    if-eqz v1, :cond_2

    iget-object v1, p0, LCN5;->b:LoV0;

    invoke-virtual {v1}, LoV0;->e()LB41;

    move-result-object v1

    iget-object v3, p0, LCN5;->g:LWU2$a;

    iget-object v3, v3, LWU2$a;->c:LIS0;

    invoke-interface {v3}, LIS0;->b()LZS0;

    move-result-object v3

    invoke-virtual {v1, v3}, LB41;->c(LZS0;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, LCN5;->b:LoV0;

    iget-object v3, p0, LCN5;->g:LWU2$a;

    iget-object v3, v3, LWU2$a;->c:LIS0;

    invoke-interface {v3}, LIS0;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, LoV0;->u(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_3
    iget-object v0, p0, LCN5;->g:LWU2$a;

    invoke-virtual {p0, v0}, LCN5;->j(LWU2$a;)V

    move v0, v2

    goto :goto_0

    :cond_4
    return v0
.end method

.method public c(Lak2;Ljava/lang/Object;LIS0;LZS0;Lak2;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            "Ljava/lang/Object;",
            "LIS0<",
            "*>;",
            "LZS0;",
            "Lak2;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LCN5;->c:LJS0$a;

    iget-object p4, p0, LCN5;->g:LWU2$a;

    iget-object p4, p4, LWU2$a;->c:LIS0;

    invoke-interface {p4}, LIS0;->b()LZS0;

    move-result-object v4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, LJS0$a;->c(Lak2;Ljava/lang/Object;LIS0;LZS0;Lak2;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, LCN5;->g:LWU2$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, LWU2$a;->c:LIS0;

    invoke-interface {v0}, LIS0;->cancel()V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final e(Ljava/lang/Object;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "SourceGenerator"

    invoke-static {}, Ltx2;->b()J

    move-result-wide v1

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, LCN5;->b:LoV0;

    invoke-virtual {v4, p1}, LoV0;->o(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/a;

    move-result-object v4

    invoke-interface {v4}, Lcom/bumptech/glide/load/data/a;->a()Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, LCN5;->b:LoV0;

    invoke-virtual {v6, v5}, LoV0;->q(Ljava/lang/Object;)Lmb1;

    move-result-object v6

    new-instance v7, LDS0;

    iget-object v8, p0, LCN5;->b:LoV0;

    invoke-virtual {v8}, LoV0;->k()Lsy3;

    move-result-object v8

    invoke-direct {v7, v6, v5, v8}, LDS0;-><init>(Lmb1;Ljava/lang/Object;Lsy3;)V

    new-instance v5, LCS0;

    iget-object v8, p0, LCN5;->g:LWU2$a;

    iget-object v8, v8, LWU2$a;->a:Lak2;

    iget-object v9, p0, LCN5;->b:LoV0;

    invoke-virtual {v9}, LoV0;->p()Lak2;

    move-result-object v9

    invoke-direct {v5, v8, v9}, LCS0;-><init>(Lak2;Lak2;)V

    iget-object v8, p0, LCN5;->b:LoV0;

    invoke-virtual {v8}, LoV0;->d()Lz41;

    move-result-object v8

    invoke-interface {v8, v5, v7}, Lz41;->b(Lak2;Lz41$b;)V

    const/4 v7, 0x2

    invoke-static {v0, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-string v9, ", data: "

    if-eqz v7, :cond_0

    :try_start_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Finished encoding source to cache, key: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, ", encoder: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", duration: "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1, v2}, Ltx2;->a(J)D

    move-result-wide v1

    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-interface {v8, v5}, Lz41;->a(Lak2;)Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iput-object v5, p0, LCN5;->h:LCS0;

    new-instance p1, LBS0;

    iget-object v0, p0, LCN5;->g:LWU2$a;

    iget-object v0, v0, LWU2$a;->a:Lak2;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LCN5;->b:LoV0;

    invoke-direct {p1, v0, v1, p0}, LBS0;-><init>(Ljava/util/List;LoV0;LJS0$a;)V

    iput-object p1, p0, LCN5;->e:LBS0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object p1, p0, LCN5;->g:LWU2$a;

    iget-object p1, p1, LWU2$a;->c:LIS0;

    invoke-interface {p1}, LIS0;->cleanup()V

    return v2

    :cond_1
    const/4 v1, 0x3

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Attempt to write: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, LCN5;->h:LCS0;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_2
    :try_start_3
    iget-object p1, p0, LCN5;->c:LJS0$a;

    iget-object v0, p0, LCN5;->g:LWU2$a;

    iget-object v5, v0, LWU2$a;->a:Lak2;

    invoke-interface {v4}, Lcom/bumptech/glide/load/data/a;->a()Ljava/lang/Object;

    move-result-object v6

    iget-object v0, p0, LCN5;->g:LWU2$a;

    iget-object v7, v0, LWU2$a;->c:LIS0;

    iget-object v0, p0, LCN5;->g:LWU2$a;

    iget-object v0, v0, LWU2$a;->c:LIS0;

    invoke-interface {v0}, LIS0;->b()LZS0;

    move-result-object v8

    iget-object v0, p0, LCN5;->g:LWU2$a;

    iget-object v9, v0, LWU2$a;->a:Lak2;

    move-object v4, p1

    invoke-interface/range {v4 .. v9}, LJS0$a;->c(Lak2;Ljava/lang/Object;LIS0;LZS0;Lak2;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return v3

    :catchall_0
    move-exception p1

    move v3, v2

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    if-nez v3, :cond_3

    iget-object v0, p0, LCN5;->g:LWU2$a;

    iget-object v0, v0, LWU2$a;->c:LIS0;

    invoke-interface {v0}, LIS0;->cleanup()V

    :cond_3
    throw p1
.end method

.method public final f()Z
    .locals 2

    iget v0, p0, LCN5;->d:I

    iget-object v1, p0, LCN5;->b:LoV0;

    invoke-virtual {v1}, LoV0;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g(LWU2$a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWU2$a<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, LCN5;->g:LWU2$a;

    if-eqz v0, :cond_0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public h(LWU2$a;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWU2$a<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LCN5;->b:LoV0;

    invoke-virtual {v0}, LoV0;->e()LB41;

    move-result-object v0

    if-eqz p2, :cond_0

    iget-object v1, p1, LWU2$a;->c:LIS0;

    invoke-interface {v1}, LIS0;->b()LZS0;

    move-result-object v1

    invoke-virtual {v0, v1}, LB41;->c(LZS0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p2, p0, LCN5;->f:Ljava/lang/Object;

    iget-object p1, p0, LCN5;->c:LJS0$a;

    invoke-interface {p1}, LJS0$a;->d()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LCN5;->c:LJS0$a;

    iget-object v1, p1, LWU2$a;->a:Lak2;

    iget-object v3, p1, LWU2$a;->c:LIS0;

    invoke-interface {v3}, LIS0;->b()LZS0;

    move-result-object v4

    iget-object v5, p0, LCN5;->h:LCS0;

    move-object v2, p2

    invoke-interface/range {v0 .. v5}, LJS0$a;->c(Lak2;Ljava/lang/Object;LIS0;LZS0;Lak2;)V

    :goto_0
    return-void
.end method

.method public i(LWU2$a;Ljava/lang/Exception;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWU2$a<",
            "*>;",
            "Ljava/lang/Exception;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LCN5;->c:LJS0$a;

    iget-object v1, p0, LCN5;->h:LCS0;

    iget-object p1, p1, LWU2$a;->c:LIS0;

    invoke-interface {p1}, LIS0;->b()LZS0;

    move-result-object v2

    invoke-interface {v0, v1, p2, p1, v2}, LJS0$a;->a(Lak2;Ljava/lang/Exception;LIS0;LZS0;)V

    return-void
.end method

.method public final j(LWU2$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWU2$a<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, LCN5;->g:LWU2$a;

    iget-object v0, v0, LWU2$a;->c:LIS0;

    iget-object v1, p0, LCN5;->b:LoV0;

    invoke-virtual {v1}, LoV0;->l()LP24;

    move-result-object v1

    new-instance v2, LCN5$a;

    invoke-direct {v2, p0, p1}, LCN5$a;-><init>(LCN5;LWU2$a;)V

    invoke-interface {v0, v1, v2}, LIS0;->e(LP24;LIS0$a;)V

    return-void
.end method
