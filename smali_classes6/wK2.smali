.class public final LwK2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:LxK2$p;

.field public e:LxK2$p;

.field public f:LRf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRf1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LwK2;->b:I

    iput v0, p0, LwK2;->c:I

    return-void
.end method


# virtual methods
.method public a(I)LwK2;
    .locals 5

    iget v0, p0, LwK2;->c:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string v4, "concurrency level was already set to %s"

    invoke-static {v1, v4, v0}, LEZ3;->v(ZLjava/lang/String;I)V

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-static {v2}, LEZ3;->d(Z)V

    iput p1, p0, LwK2;->c:I

    return-object p0
.end method

.method public b()I
    .locals 2

    iget v0, p0, LwK2;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x4

    :cond_0
    return v0
.end method

.method public c()I
    .locals 2

    iget v0, p0, LwK2;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x10

    :cond_0
    return v0
.end method

.method public d()LRf1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LRf1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LwK2;->f:LRf1;

    invoke-virtual {p0}, LwK2;->e()LxK2$p;

    move-result-object v1

    invoke-virtual {v1}, LxK2$p;->b()LRf1;

    move-result-object v1

    invoke-static {v0, v1}, LKV2;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRf1;

    return-object v0
.end method

.method public e()LxK2$p;
    .locals 2

    iget-object v0, p0, LwK2;->d:LxK2$p;

    sget-object v1, LxK2$p;->b:LxK2$p;

    invoke-static {v0, v1}, LKV2;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LxK2$p;

    return-object v0
.end method

.method public f()LxK2$p;
    .locals 2

    iget-object v0, p0, LwK2;->e:LxK2$p;

    sget-object v1, LxK2$p;->b:LxK2$p;

    invoke-static {v0, v1}, LKV2;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LxK2$p;

    return-object v0
.end method

.method public g(I)LwK2;
    .locals 5

    iget v0, p0, LwK2;->b:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string v4, "initial capacity was already set to %s"

    invoke-static {v1, v4, v0}, LEZ3;->v(ZLjava/lang/String;I)V

    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-static {v2}, LEZ3;->d(Z)V

    iput p1, p0, LwK2;->b:I

    return-object p0
.end method

.method public h(LRf1;)LwK2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRf1<",
            "Ljava/lang/Object;",
            ">;)",
            "LwK2;"
        }
    .end annotation

    iget-object v0, p0, LwK2;->f:LRf1;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "key equivalence was already set to %s"

    invoke-static {v2, v3, v0}, LEZ3;->w(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRf1;

    iput-object p1, p0, LwK2;->f:LRf1;

    iput-boolean v1, p0, LwK2;->a:Z

    return-object p0
.end method

.method public i()Ljava/util/concurrent/ConcurrentMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/concurrent/ConcurrentMap<",
            "TK;TV;>;"
        }
    .end annotation

    iget-boolean v0, p0, LwK2;->a:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, LwK2;->c()I

    move-result v1

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-virtual {p0}, LwK2;->b()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    return-object v0

    :cond_0
    invoke-static {p0}, LxK2;->b(LwK2;)LxK2;

    move-result-object v0

    return-object v0
.end method

.method public j(LxK2$p;)LwK2;
    .locals 4

    iget-object v0, p0, LwK2;->d:LxK2$p;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "Key strength was already set to %s"

    invoke-static {v2, v3, v0}, LEZ3;->w(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LxK2$p;

    iput-object v0, p0, LwK2;->d:LxK2$p;

    sget-object v0, LxK2$p;->b:LxK2$p;

    if-eq p1, v0, :cond_1

    iput-boolean v1, p0, LwK2;->a:Z

    :cond_1
    return-object p0
.end method

.method public k(LxK2$p;)LwK2;
    .locals 4

    iget-object v0, p0, LwK2;->e:LxK2$p;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "Value strength was already set to %s"

    invoke-static {v2, v3, v0}, LEZ3;->w(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LxK2$p;

    iput-object v0, p0, LwK2;->e:LxK2$p;

    sget-object v0, LxK2$p;->b:LxK2$p;

    if-eq p1, v0, :cond_1

    iput-boolean v1, p0, LwK2;->a:Z

    :cond_1
    return-object p0
.end method

.method public l()LwK2;
    .locals 1

    sget-object v0, LxK2$p;->c:LxK2$p;

    invoke-virtual {p0, v0}, LwK2;->j(LxK2$p;)LwK2;

    move-result-object v0

    return-object v0
.end method

.method public m()LwK2;
    .locals 1

    sget-object v0, LxK2$p;->c:LxK2$p;

    invoke-virtual {p0, v0}, LwK2;->k(LxK2$p;)LwK2;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, LKV2;->c(Ljava/lang/Object;)LKV2$b;

    move-result-object v0

    iget v1, p0, LwK2;->b:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v3, "initialCapacity"

    invoke-virtual {v0, v3, v1}, LKV2$b;->a(Ljava/lang/String;I)LKV2$b;

    :cond_0
    iget v1, p0, LwK2;->c:I

    if-eq v1, v2, :cond_1

    const-string v2, "concurrencyLevel"

    invoke-virtual {v0, v2, v1}, LKV2$b;->a(Ljava/lang/String;I)LKV2$b;

    :cond_1
    iget-object v1, p0, LwK2;->d:LxK2$p;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LGo;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "keyStrength"

    invoke-virtual {v0, v2, v1}, LKV2$b;->b(Ljava/lang/String;Ljava/lang/Object;)LKV2$b;

    :cond_2
    iget-object v1, p0, LwK2;->e:LxK2$p;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LGo;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "valueStrength"

    invoke-virtual {v0, v2, v1}, LKV2$b;->b(Ljava/lang/String;Ljava/lang/Object;)LKV2$b;

    :cond_3
    iget-object v1, p0, LwK2;->f:LRf1;

    if-eqz v1, :cond_4

    const-string v1, "keyEquivalence"

    invoke-virtual {v0, v1}, LKV2$b;->h(Ljava/lang/Object;)LKV2$b;

    :cond_4
    invoke-virtual {v0}, LKV2$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
