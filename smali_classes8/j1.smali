.class public abstract Lj1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1$a;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x35ef64c82d4c54b9L


# instance fields
.field public b:LZ0;

.field public c:Z

.field public d:Ljava/util/ArrayList;

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lj1;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj1;->c:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lj1;->d:Ljava/util/ArrayList;

    const/4 v1, 0x1

    if-le p1, v1, :cond_0

    move v0, v1

    :cond_0
    const-string v1, "Node capacity must be greater than 1"

    invoke-static {v0, v1}, LKo;->d(ZLjava/lang/String;)V

    iput p1, p0, Lj1;->e:I

    return-void
.end method

.method public static d(DD)I
    .locals 1

    cmpl-double v0, p0, p2

    if-lez v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    cmpg-double p0, p0, p2

    if-gez p0, :cond_1

    const/4 p0, -0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public declared-synchronized c()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj1;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lj1;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj1;->f(I)LZ0;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lj1;->d:Ljava/util/ArrayList;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lj1;->e(Ljava/util/List;I)LZ0;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lj1;->b:LZ0;

    const/4 v0, 0x0

    iput-object v0, p0, Lj1;->d:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj1;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final e(Ljava/util/List;I)LZ0;
    .locals 2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, LKo;->c(Z)V

    add-int/2addr p2, v1

    invoke-virtual {p0, p1, p2}, Lj1;->g(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZ0;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lj1;->e(Ljava/util/List;I)LZ0;

    move-result-object p1

    return-object p1
.end method

.method public abstract f(I)LZ0;
.end method

.method public g(Ljava/util/List;I)Ljava/util/List;
    .locals 4

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LKo;->c(Z)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p2}, Lj1;->f(I)LZ0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, Lj1;->h()Ljava/util/Comparator;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls00;

    invoke-virtual {p0, v0}, Lj1;->m(Ljava/util/List;)LZ0;

    move-result-object v2

    invoke-virtual {v2}, LZ0;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p0}, Lj1;->j()I

    move-result v3

    if-ne v2, v3, :cond_0

    invoke-virtual {p0, p2}, Lj1;->f(I)LZ0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0, v0}, Lj1;->m(Ljava/util/List;)LZ0;

    move-result-object v2

    invoke-virtual {v2, v1}, LZ0;->a(Ls00;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public abstract h()Ljava/util/Comparator;
.end method

.method public abstract i()Lj1$a;
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lj1;->e:I

    return v0
.end method

.method public k(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lj1;->c:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Cannot insert items into an STR packed R-tree after it has been built."

    invoke-static {v0, v1}, LKo;->d(ZLjava/lang/String;)V

    iget-object v0, p0, Lj1;->d:Ljava/util/ArrayList;

    new-instance v1, LZa2;

    invoke-direct {v1, p1, p2}, LZa2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lj1;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lj1;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lj1;->b:LZ0;

    invoke-virtual {v0}, LZ0;->d()Z

    move-result v0

    return v0
.end method

.method public m(Ljava/util/List;)LZ0;
    .locals 1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZ0;

    return-object p1
.end method

.method public n(Ljava/lang/Object;)Ljava/util/List;
    .locals 3

    invoke-virtual {p0}, Lj1;->c()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lj1;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lj1;->i()Lj1$a;

    move-result-object v1

    iget-object v2, p0, Lj1;->b:LZ0;

    invoke-virtual {v2}, LZ0;->getBounds()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Lj1$a;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj1;->b:LZ0;

    invoke-virtual {p0, p1, v1, v0}, Lj1;->o(Ljava/lang/Object;LZ0;Ljava/util/List;)V

    :cond_1
    return-object v0
.end method

.method public final o(Ljava/lang/Object;LZ0;Ljava/util/List;)V
    .locals 4

    invoke-virtual {p2}, LZ0;->c()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls00;

    invoke-virtual {p0}, Lj1;->i()Lj1$a;

    move-result-object v2

    invoke-interface {v1}, Ls00;->getBounds()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3, p1}, Lj1$a;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    instance-of v2, v1, LZ0;

    if-eqz v2, :cond_1

    check-cast v1, LZ0;

    invoke-virtual {p0, p1, v1, p3}, Lj1;->o(Ljava/lang/Object;LZ0;Ljava/util/List;)V

    goto :goto_1

    :cond_1
    instance-of v2, v1, LZa2;

    if-eqz v2, :cond_2

    check-cast v1, LZa2;

    invoke-virtual {v1}, LZa2;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {}, LKo;->e()V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
