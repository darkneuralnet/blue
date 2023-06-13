.class public Lhn2;
.super LU;
.source "SourceFile"


# instance fields
.field public c:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, LU;-><init>()V

    iput-object p1, p0, Lhn2;->c:[B

    return-void
.end method


# virtual methods
.method public declared-synchronized A(I)LE;
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lhn2;->E()V

    invoke-super {p0, p1}, LU;->A(I)LE;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized C()Ljava/util/Enumeration;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lhn2;->c:[B

    if-eqz v0, :cond_0

    new-instance v1, Len2;

    invoke-direct {v1, v0}, Len2;-><init>([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    invoke-super {p0}, LU;->C()Ljava/util/Enumeration;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public D()[LE;
    .locals 1

    invoke-virtual {p0}, Lhn2;->E()V

    invoke-super {p0}, LU;->D()[LE;

    move-result-object v0

    return-object v0
.end method

.method public final E()V
    .locals 3

    iget-object v0, p0, Lhn2;->c:[B

    if-eqz v0, :cond_1

    new-instance v0, LF;

    invoke-direct {v0}, LF;-><init>()V

    new-instance v1, Len2;

    iget-object v2, p0, Lhn2;->c:[B

    invoke-direct {v1, v2}, Len2;-><init>([B)V

    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LS;

    invoke-virtual {v0, v2}, LF;->a(LE;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LF;->g()[LE;

    move-result-object v0

    iput-object v0, p0, LU;->b:[LE;

    const/4 v0, 0x0

    iput-object v0, p0, Lhn2;->c:[B

    :cond_1
    return-void
.end method

.method public declared-synchronized hashCode()I
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lhn2;->E()V

    invoke-super {p0}, LU;->hashCode()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LE;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lhn2;->E()V

    invoke-super {p0}, LU;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized o(LQ;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lhn2;->c:[B

    if-eqz v0, :cond_0

    const/16 v1, 0x30

    invoke-virtual {p1, p2, v1, v0}, LQ;->n(ZI[B)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, LU;->y()LS;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LS;->o(LQ;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized s()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lhn2;->c:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    invoke-static {v0}, LER5;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lhn2;->c:[B

    array-length v1, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v0, v1

    monitor-exit p0

    return v0

    :cond_0
    :try_start_1
    invoke-super {p0}, LU;->y()LS;

    move-result-object v0

    invoke-virtual {v0}, LS;->s()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized size()I
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lhn2;->E()V

    invoke-super {p0}, LU;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized x()LS;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lhn2;->E()V

    invoke-super {p0}, LU;->x()LS;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized y()LS;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lhn2;->E()V

    invoke-super {p0}, LU;->y()LS;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
