.class public final LLH6;
.super LHH6;
.source "SourceFile"

# interfaces
.implements Lcb1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLH6$b;
    }
.end annotation


# instance fields
.field public final d:LJH6;

.field public final e:[B

.field public final f:[B

.field public final g:[B

.field public final h:[B

.field public volatile i:J

.field public volatile j:Lxv;


# direct methods
.method public constructor <init>(LLH6$b;)V
    .locals 8

    invoke-static {p1}, LLH6$b;->a(LLH6$b;)LJH6;

    move-result-object v0

    invoke-virtual {v0}, LJH6;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, LHH6;-><init>(ZLjava/lang/String;)V

    invoke-static {p1}, LLH6$b;->a(LLH6$b;)LJH6;

    move-result-object v3

    iput-object v3, p0, LLH6;->d:LJH6;

    if-eqz v3, :cond_f

    invoke-virtual {v3}, LJH6;->f()I

    move-result v0

    invoke-static {p1}, LLH6$b;->b(LLH6$b;)[B

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {p1}, LLH6$b;->c(LLH6$b;)LRH6;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v3}, LJH6;->a()I

    move-result v2

    add-int/lit8 v3, v2, 0x7

    div-int/lit8 v3, v3, 0x8

    const/4 v4, 0x0

    invoke-static {v1, v4, v3}, LWH6;->a([BII)J

    move-result-wide v5

    iput-wide v5, p0, LLH6;->i:J

    iget-wide v5, p0, LLH6;->i:J

    invoke-static {v2, v5, v6}, LWH6;->l(IJ)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/2addr v3, v4

    invoke-static {v1, v3, v0}, LWH6;->g([BII)[B

    move-result-object v2

    iput-object v2, p0, LLH6;->e:[B

    add-int/2addr v3, v0

    invoke-static {v1, v3, v0}, LWH6;->g([BII)[B

    move-result-object v2

    iput-object v2, p0, LLH6;->f:[B

    add-int/2addr v3, v0

    invoke-static {v1, v3, v0}, LWH6;->g([BII)[B

    move-result-object v2

    iput-object v2, p0, LLH6;->g:[B

    add-int/2addr v3, v0

    invoke-static {v1, v3, v0}, LWH6;->g([BII)[B

    move-result-object v2

    iput-object v2, p0, LLH6;->h:[B

    add-int/2addr v3, v0

    array-length v0, v1

    sub-int/2addr v0, v3

    invoke-static {v1, v3, v0}, LWH6;->g([BII)[B

    move-result-object v0

    :try_start_0
    const-class v1, Lxv;

    invoke-static {v0, v1}, LWH6;->f([BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxv;

    invoke-static {p1}, LLH6$b;->c(LLH6$b;)LRH6;

    move-result-object p1

    invoke-virtual {p1}, LRH6;->g()LN;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxv;->f(LN;)Lxv;

    move-result-object p1

    iput-object p1, p0, LLH6;->j:Lxv;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "index out of bounds"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "xmss == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LLH6$b;->d(LLH6$b;)J

    move-result-wide v1

    iput-wide v1, p0, LLH6;->i:J

    invoke-static {p1}, LLH6$b;->e(LLH6$b;)[B

    move-result-object v7

    if-eqz v7, :cond_4

    array-length v1, v7

    if-ne v1, v0, :cond_3

    iput-object v7, p0, LLH6;->e:[B

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size of secretKeySeed needs to be equal size of digest"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-array v1, v0, [B

    iput-object v1, p0, LLH6;->e:[B

    :goto_0
    invoke-static {p1}, LLH6$b;->f(LLH6$b;)[B

    move-result-object v1

    if-eqz v1, :cond_6

    array-length v2, v1

    if-ne v2, v0, :cond_5

    iput-object v1, p0, LLH6;->f:[B

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size of secretKeyPRF needs to be equal size of digest"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-array v1, v0, [B

    iput-object v1, p0, LLH6;->f:[B

    :goto_1
    invoke-static {p1}, LLH6$b;->g(LLH6$b;)[B

    move-result-object v6

    if-eqz v6, :cond_8

    array-length v1, v6

    if-ne v1, v0, :cond_7

    iput-object v6, p0, LLH6;->g:[B

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size of publicSeed needs to be equal size of digest"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-array v1, v0, [B

    iput-object v1, p0, LLH6;->g:[B

    :goto_2
    invoke-static {p1}, LLH6$b;->h(LLH6$b;)[B

    move-result-object v1

    if-eqz v1, :cond_a

    array-length v2, v1

    if-ne v2, v0, :cond_9

    iput-object v1, p0, LLH6;->h:[B

    goto :goto_3

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size of root needs to be equal size of digest"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-array v0, v0, [B

    iput-object v0, p0, LLH6;->h:[B

    :goto_3
    invoke-static {p1}, LLH6$b;->i(LLH6$b;)Lxv;

    move-result-object v0

    if-eqz v0, :cond_b

    :goto_4
    iput-object v0, p0, LLH6;->j:Lxv;

    goto :goto_5

    :cond_b
    invoke-static {p1}, LLH6$b;->d(LLH6$b;)J

    move-result-wide v0

    invoke-virtual {v3}, LJH6;->a()I

    move-result v2

    invoke-static {v2, v0, v1}, LWH6;->l(IJ)Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz v6, :cond_c

    if-eqz v7, :cond_c

    new-instance v0, Lxv;

    invoke-static {p1}, LLH6$b;->d(LLH6$b;)J

    move-result-wide v4

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lxv;-><init>(LJH6;J[B[B)V

    goto :goto_4

    :cond_c
    new-instance v0, Lxv;

    invoke-static {p1}, LLH6$b;->j(LLH6$b;)J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Lxv;-><init>(J)V

    goto :goto_4

    :goto_5
    invoke-static {p1}, LLH6$b;->j(LLH6$b;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_e

    invoke-static {p1}, LLH6$b;->j(LLH6$b;)J

    move-result-wide v0

    iget-object p1, p0, LLH6;->j:Lxv;

    invoke-virtual {p1}, Lxv;->b()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_d

    goto :goto_6

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxIndex set but not reflected in state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_6
    return-void

    :cond_f
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "params == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(LLH6$b;LLH6$a;)V
    .locals 0

    invoke-direct {p0, p1}, LLH6;-><init>(LLH6$b;)V

    return-void
.end method


# virtual methods
.method public b()LJH6;
    .locals 1

    iget-object v0, p0, LLH6;->d:LJH6;

    return-object v0
.end method

.method public c()[B
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LLH6;->d:LJH6;

    invoke-virtual {v0}, LJH6;->f()I

    move-result v0

    iget-object v1, p0, LLH6;->d:LJH6;

    invoke-virtual {v1}, LJH6;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x7

    div-int/lit8 v1, v1, 0x8

    add-int v2, v1, v0

    add-int/2addr v2, v0

    add-int/2addr v2, v0

    add-int/2addr v2, v0

    new-array v2, v2, [B

    iget-wide v3, p0, LLH6;->i:J

    invoke-static {v3, v4, v1}, LWH6;->q(JI)[B

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, LWH6;->e([B[BI)V

    add-int/2addr v1, v4

    iget-object v3, p0, LLH6;->e:[B

    invoke-static {v2, v3, v1}, LWH6;->e([B[BI)V

    add-int/2addr v1, v0

    iget-object v3, p0, LLH6;->f:[B

    invoke-static {v2, v3, v1}, LWH6;->e([B[BI)V

    add-int/2addr v1, v0

    iget-object v3, p0, LLH6;->g:[B

    invoke-static {v2, v3, v1}, LWH6;->e([B[BI)V

    add-int/2addr v1, v0

    iget-object v0, p0, LLH6;->h:[B

    invoke-static {v2, v0, v1}, LWH6;->e([B[BI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, LLH6;->j:Lxv;

    invoke-static {v0}, LWH6;->p(Ljava/lang/Object;)[B

    move-result-object v0

    invoke-static {v2, v0}, LAo;->f([B[B)[B

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error serializing bds state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public getEncoded()[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LLH6;->c()[B

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
