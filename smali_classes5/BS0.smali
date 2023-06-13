.class public LBS0;
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
.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lak2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LoV0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoV0<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:LJS0$a;

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


# direct methods
.method public constructor <init>(Ljava/util/List;LoV0;LJS0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lak2;",
            ">;",
            "LoV0<",
            "*>;",
            "LJS0$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LBS0;->e:I

    iput-object p1, p0, LBS0;->b:Ljava/util/List;

    iput-object p2, p0, LBS0;->c:LoV0;

    iput-object p3, p0, LBS0;->d:LJS0$a;

    return-void
.end method

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

    invoke-virtual {p1}, LoV0;->c()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, LBS0;-><init>(Ljava/util/List;LoV0;LJS0$a;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget v0, p0, LBS0;->h:I

    iget-object v1, p0, LBS0;->g:Ljava/util/List;

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
    .locals 7

    const-string v0, "DataCacheGenerator.startNext"

    invoke-static {v0}, LNC1;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, LBS0;->g:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LBS0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, LBS0;->i:LWU2$a;

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    invoke-virtual {p0}, LBS0;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LBS0;->g:Ljava/util/List;

    iget v3, p0, LBS0;->h:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, LBS0;->h:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWU2;

    iget-object v3, p0, LBS0;->j:Ljava/io/File;

    iget-object v4, p0, LBS0;->c:LoV0;

    invoke-virtual {v4}, LoV0;->t()I

    move-result v4

    iget-object v5, p0, LBS0;->c:LoV0;

    invoke-virtual {v5}, LoV0;->f()I

    move-result v5

    iget-object v6, p0, LBS0;->c:LoV0;

    invoke-virtual {v6}, LoV0;->k()Lsy3;

    move-result-object v6

    invoke-interface {v0, v3, v4, v5, v6}, LWU2;->b(Ljava/lang/Object;IILsy3;)LWU2$a;

    move-result-object v0

    iput-object v0, p0, LBS0;->i:LWU2$a;

    iget-object v0, p0, LBS0;->i:LWU2$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, LBS0;->c:LoV0;

    iget-object v3, p0, LBS0;->i:LWU2$a;

    iget-object v3, v3, LWU2$a;->c:LIS0;

    invoke-interface {v3}, LIS0;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, LoV0;->u(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LBS0;->i:LWU2$a;

    iget-object v0, v0, LWU2$a;->c:LIS0;

    iget-object v1, p0, LBS0;->c:LoV0;

    invoke-virtual {v1}, LoV0;->l()LP24;

    move-result-object v1

    invoke-interface {v0, v1, p0}, LIS0;->e(LP24;LIS0$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v2

    goto :goto_1

    :cond_3
    invoke-static {}, LNC1;->e()V

    return v1

    :cond_4
    :goto_2
    :try_start_1
    iget v0, p0, LBS0;->e:I

    add-int/2addr v0, v2

    iput v0, p0, LBS0;->e:I

    iget-object v2, p0, LBS0;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lt v0, v2, :cond_5

    invoke-static {}, LNC1;->e()V

    return v1

    :cond_5
    :try_start_2
    iget-object v0, p0, LBS0;->b:Ljava/util/List;

    iget v2, p0, LBS0;->e:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lak2;

    new-instance v2, LCS0;

    iget-object v3, p0, LBS0;->c:LoV0;

    invoke-virtual {v3}, LoV0;->p()Lak2;

    move-result-object v3

    invoke-direct {v2, v0, v3}, LCS0;-><init>(Lak2;Lak2;)V

    iget-object v3, p0, LBS0;->c:LoV0;

    invoke-virtual {v3}, LoV0;->d()Lz41;

    move-result-object v3

    invoke-interface {v3, v2}, Lz41;->a(Lak2;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, LBS0;->j:Ljava/io/File;

    if-eqz v2, :cond_0

    iput-object v0, p0, LBS0;->f:Lak2;

    iget-object v0, p0, LBS0;->c:LoV0;

    invoke-virtual {v0, v2}, LoV0;->j(Ljava/io/File;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LBS0;->g:Ljava/util/List;

    iput v1, p0, LBS0;->h:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, LNC1;->e()V

    throw v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, LBS0;->d:LJS0$a;

    iget-object v1, p0, LBS0;->f:Lak2;

    iget-object v2, p0, LBS0;->i:LWU2$a;

    iget-object v3, v2, LWU2$a;->c:LIS0;

    sget-object v4, LZS0;->d:LZS0;

    iget-object v5, p0, LBS0;->f:Lak2;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, LJS0$a;->c(Lak2;Ljava/lang/Object;LIS0;LZS0;Lak2;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, LBS0;->i:LWU2$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, LWU2$a;->c:LIS0;

    invoke-interface {v0}, LIS0;->cancel()V

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, LBS0;->d:LJS0$a;

    iget-object v1, p0, LBS0;->f:Lak2;

    iget-object v2, p0, LBS0;->i:LWU2$a;

    iget-object v2, v2, LWU2$a;->c:LIS0;

    sget-object v3, LZS0;->d:LZS0;

    invoke-interface {v0, v1, p1, v2, v3}, LJS0$a;->a(Lak2;Ljava/lang/Exception;LIS0;LZS0;)V

    return-void
.end method
