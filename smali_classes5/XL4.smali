.class public LXL4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJS0;
.implements LIS0$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LJS0;",
        "LIS0$a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:LJS0$a;

.field public final c:LoV0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoV0<",
            "*>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:I

.field public f:Lak2;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LWU2<",
            "Ljava/io/File;",
            "*>;>;"
        }
    .end annotation
.end field

.field public h:I

.field public volatile i:LWU2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWU2$a<",
            "*>;"
        }
    .end annotation
.end field

.field public j:Ljava/io/File;

.field public k:LYL4;


# direct methods
.method public constructor <init>(LoV0;LJS0$a;)V
    .locals 1
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

    const/4 v0, -0x1

    iput v0, p0, LXL4;->e:I

    iput-object p1, p0, LXL4;->c:LoV0;

    iput-object p2, p0, LXL4;->b:LJS0$a;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget v0, p0, LXL4;->h:I

    iget-object v1, p0, LXL4;->g:Ljava/util/List;

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

.method public b()Z
    .locals 14

    const-string v0, "ResourceCacheGenerator.startNext"

    invoke-static {v0}, LNC1;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, LXL4;->c:LoV0;

    invoke-virtual {v0}, LoV0;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, LNC1;->e()V

    return v2

    :cond_0
    :try_start_1
    iget-object v1, p0, LXL4;->c:LoV0;

    invoke-virtual {v1}, LoV0;->m()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    const-class v0, Ljava/io/File;

    iget-object v1, p0, LXL4;->c:LoV0;

    invoke-virtual {v1}, LoV0;->r()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    invoke-static {}, LNC1;->e()V

    return v2

    :cond_1
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to find any load path from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LXL4;->c:LoV0;

    invoke-virtual {v2}, LoV0;->i()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LXL4;->c:LoV0;

    invoke-virtual {v2}, LoV0;->r()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iget-object v3, p0, LXL4;->g:Ljava/util/List;

    const/4 v4, 0x1

    if-eqz v3, :cond_6

    invoke-virtual {p0}, LXL4;->a()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, LXL4;->i:LWU2$a;

    :cond_4
    :goto_1
    if-nez v2, :cond_5

    invoke-virtual {p0}, LXL4;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LXL4;->g:Ljava/util/List;

    iget v1, p0, LXL4;->h:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, LXL4;->h:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWU2;

    iget-object v1, p0, LXL4;->j:Ljava/io/File;

    iget-object v3, p0, LXL4;->c:LoV0;

    invoke-virtual {v3}, LoV0;->t()I

    move-result v3

    iget-object v5, p0, LXL4;->c:LoV0;

    invoke-virtual {v5}, LoV0;->f()I

    move-result v5

    iget-object v6, p0, LXL4;->c:LoV0;

    invoke-virtual {v6}, LoV0;->k()Lsy3;

    move-result-object v6

    invoke-interface {v0, v1, v3, v5, v6}, LWU2;->b(Ljava/lang/Object;IILsy3;)LWU2$a;

    move-result-object v0

    iput-object v0, p0, LXL4;->i:LWU2$a;

    iget-object v0, p0, LXL4;->i:LWU2$a;

    if-eqz v0, :cond_4

    iget-object v0, p0, LXL4;->c:LoV0;

    iget-object v1, p0, LXL4;->i:LWU2$a;

    iget-object v1, v1, LWU2$a;->c:LIS0;

    invoke-interface {v1}, LIS0;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LoV0;->u(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LXL4;->i:LWU2$a;

    iget-object v0, v0, LWU2$a;->c:LIS0;

    iget-object v1, p0, LXL4;->c:LoV0;

    invoke-virtual {v1}, LoV0;->l()LP24;

    move-result-object v1

    invoke-interface {v0, v1, p0}, LIS0;->e(LP24;LIS0$a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v2, v4

    goto :goto_1

    :cond_5
    invoke-static {}, LNC1;->e()V

    return v2

    :cond_6
    :goto_2
    :try_start_3
    iget v3, p0, LXL4;->e:I

    add-int/2addr v3, v4

    iput v3, p0, LXL4;->e:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-lt v3, v5, :cond_8

    iget v3, p0, LXL4;->d:I

    add-int/2addr v3, v4

    iput v3, p0, LXL4;->d:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-lt v3, v4, :cond_7

    invoke-static {}, LNC1;->e()V

    return v2

    :cond_7
    :try_start_4
    iput v2, p0, LXL4;->e:I

    :cond_8
    iget v3, p0, LXL4;->d:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lak2;

    iget v4, p0, LXL4;->e:I

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/lang/Class;

    iget-object v4, p0, LXL4;->c:LoV0;

    invoke-virtual {v4, v11}, LoV0;->s(Ljava/lang/Class;)Lr96;

    move-result-object v10

    new-instance v13, LYL4;

    iget-object v4, p0, LXL4;->c:LoV0;

    invoke-virtual {v4}, LoV0;->b()Lto;

    move-result-object v5

    iget-object v4, p0, LXL4;->c:LoV0;

    invoke-virtual {v4}, LoV0;->p()Lak2;

    move-result-object v7

    iget-object v4, p0, LXL4;->c:LoV0;

    invoke-virtual {v4}, LoV0;->t()I

    move-result v8

    iget-object v4, p0, LXL4;->c:LoV0;

    invoke-virtual {v4}, LoV0;->f()I

    move-result v9

    iget-object v4, p0, LXL4;->c:LoV0;

    invoke-virtual {v4}, LoV0;->k()Lsy3;

    move-result-object v12

    move-object v4, v13

    move-object v6, v3

    invoke-direct/range {v4 .. v12}, LYL4;-><init>(Lto;Lak2;Lak2;IILr96;Ljava/lang/Class;Lsy3;)V

    iput-object v13, p0, LXL4;->k:LYL4;

    iget-object v4, p0, LXL4;->c:LoV0;

    invoke-virtual {v4}, LoV0;->d()Lz41;

    move-result-object v4

    iget-object v5, p0, LXL4;->k:LYL4;

    invoke-interface {v4, v5}, Lz41;->a(Lak2;)Ljava/io/File;

    move-result-object v4

    iput-object v4, p0, LXL4;->j:Ljava/io/File;

    if-eqz v4, :cond_2

    iput-object v3, p0, LXL4;->f:Lak2;

    iget-object v3, p0, LXL4;->c:LoV0;

    invoke-virtual {v3, v4}, LoV0;->j(Ljava/io/File;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, LXL4;->g:Ljava/util/List;

    iput v2, p0, LXL4;->h:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, LNC1;->e()V

    throw v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, LXL4;->b:LJS0$a;

    iget-object v1, p0, LXL4;->f:Lak2;

    iget-object v2, p0, LXL4;->i:LWU2$a;

    iget-object v3, v2, LWU2$a;->c:LIS0;

    sget-object v4, LZS0;->e:LZS0;

    iget-object v5, p0, LXL4;->k:LYL4;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, LJS0$a;->c(Lak2;Ljava/lang/Object;LIS0;LZS0;Lak2;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, LXL4;->i:LWU2$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, LWU2$a;->c:LIS0;

    invoke-interface {v0}, LIS0;->cancel()V

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, LXL4;->b:LJS0$a;

    iget-object v1, p0, LXL4;->k:LYL4;

    iget-object v2, p0, LXL4;->i:LWU2$a;

    iget-object v2, v2, LWU2$a;->c:LIS0;

    sget-object v3, LZS0;->e:LZS0;

    invoke-interface {v0, v1, p1, v2, v3}, LJS0$a;->a(Lak2;Ljava/lang/Exception;LIS0;LZS0;)V

    return-void
.end method
