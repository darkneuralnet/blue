.class public final Ljv7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNv7;


# instance fields
.field public final a:Lfv7;

.field public final b:Lsw7;

.field public final c:Z

.field public final d:LAt7;


# direct methods
.method public constructor <init>(Lsw7;LAt7;Lfv7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljv7;->b:Lsw7;

    invoke-virtual {p2, p3}, LAt7;->j(Lfv7;)Z

    move-result p1

    iput-boolean p1, p0, Ljv7;->c:Z

    iput-object p2, p0, Ljv7;->d:LAt7;

    iput-object p3, p0, Ljv7;->a:Lfv7;

    return-void
.end method

.method public static b(Lsw7;LAt7;Lfv7;)Ljv7;
    .locals 1

    new-instance v0, Ljv7;

    invoke-direct {v0, p0, p1, p2}, Ljv7;-><init>(Lsw7;LAt7;Lfv7;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ljv7;->b:Lsw7;

    invoke-static {v0, p1, p2}, LPv7;->f(Lsw7;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Ljv7;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljv7;->d:LAt7;

    invoke-static {v0, p1, p2}, LPv7;->e(LAt7;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ljv7;->d:LAt7;

    invoke-virtual {v0, p1}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object p1

    invoke-virtual {p1}, LEt7;->n()Z

    move-result p1

    return p1
.end method

.method public final e(Ljava/lang/Object;[BIILFs7;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Leu7;

    iget-object v1, v0, Leu7;->zzc:Ltw7;

    invoke-static {}, Ltw7;->c()Ltw7;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {}, Ltw7;->e()Ltw7;

    move-result-object v1

    iput-object v1, v0, Leu7;->zzc:Ltw7;

    :cond_0
    check-cast p1, Lbu7;

    invoke-virtual {p1}, Lbu7;->D()LEt7;

    const/4 p1, 0x0

    move-object v0, p1

    :goto_0
    if-ge p3, p4, :cond_a

    invoke-static {p2, p3, p5}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v2, p5, LFs7;->a:I

    const/16 p3, 0xb

    const/4 v3, 0x2

    if-eq v2, p3, :cond_3

    and-int/lit8 p3, v2, 0x7

    if-ne p3, v3, :cond_2

    iget-object p3, p0, Ljv7;->d:LAt7;

    iget-object v0, p5, LFs7;->d:Lzt7;

    iget-object v3, p0, Ljv7;->a:Lfv7;

    ushr-int/lit8 v5, v2, 0x3

    invoke-virtual {p3, v0, v3, v5}, LAt7;->d(Lzt7;Lfv7;I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v3, p2

    move v5, p4

    move-object v6, v1

    move-object v7, p5

    invoke-static/range {v2 .. v7}, LGs7;->i(I[BIILtw7;LFs7;)I

    move-result p3

    goto :goto_0

    :cond_1
    sget-object p2, LFv7;->c:LFv7;

    throw p1

    :cond_2
    invoke-static {v2, p2, v4, p4, p5}, LGs7;->n(I[BIILFs7;)I

    move-result p3

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    move-object v2, p1

    :goto_1
    if-ge v4, p4, :cond_8

    invoke-static {p2, v4, p5}, LGs7;->j([BILFs7;)I

    move-result v4

    iget v5, p5, LFs7;->a:I

    and-int/lit8 v6, v5, 0x7

    ushr-int/lit8 v7, v5, 0x3

    if-eq v7, v3, :cond_6

    const/4 v8, 0x3

    if-eq v7, v8, :cond_4

    goto :goto_2

    :cond_4
    if-nez v0, :cond_5

    if-ne v6, v3, :cond_7

    invoke-static {p2, v4, p5}, LGs7;->a([BILFs7;)I

    move-result v4

    iget-object v2, p5, LFs7;->c:Ljava/lang/Object;

    check-cast v2, Lkt7;

    goto :goto_1

    :cond_5
    sget-object p2, LFv7;->c:LFv7;

    throw p1

    :cond_6
    if-nez v6, :cond_7

    invoke-static {p2, v4, p5}, LGs7;->j([BILFs7;)I

    move-result v4

    iget p3, p5, LFs7;->a:I

    iget-object v0, p0, Ljv7;->d:LAt7;

    iget-object v5, p5, LFs7;->d:Lzt7;

    iget-object v6, p0, Ljv7;->a:Lfv7;

    invoke-virtual {v0, v5, v6, p3}, LAt7;->d(Lzt7;Lfv7;I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_7
    :goto_2
    const/16 v6, 0xc

    if-eq v5, v6, :cond_8

    invoke-static {v5, p2, v4, p4, p5}, LGs7;->n(I[BIILFs7;)I

    move-result v4

    goto :goto_1

    :cond_8
    if-eqz v2, :cond_9

    shl-int/lit8 p3, p3, 0x3

    or-int/2addr p3, v3

    invoke-virtual {v1, p3, v2}, Ltw7;->h(ILjava/lang/Object;)V

    :cond_9
    move p3, v4

    goto :goto_0

    :cond_a
    if-ne p3, p4, :cond_b

    return-void

    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->g()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object p1

    throw p1
.end method

.method public final f(Ljava/lang/Object;LKw7;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Ljv7;->d:LAt7;

    invoke-virtual {v0, p1}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object v0

    invoke-virtual {v0}, LEt7;->h()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDt7;

    invoke-interface {v2}, LDt7;->zze()LJw7;

    move-result-object v3

    sget-object v4, LJw7;->k:LJw7;

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, LDt7;->zzg()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v2}, LDt7;->x()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v1, Lru7;

    if-eqz v3, :cond_0

    invoke-interface {v2}, LDt7;->zza()I

    move-result v2

    check-cast v1, Lru7;

    invoke-virtual {v1}, Lru7;->a()LLu7;

    move-result-object v1

    invoke-virtual {v1}, LMu7;->b()Lkt7;

    move-result-object v1

    invoke-interface {p2, v2, v1}, LKw7;->D(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {v2}, LDt7;->zza()I

    move-result v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v2, v1}, LKw7;->D(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Found invalid MessageSet item."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, p0, Ljv7;->b:Lsw7;

    invoke-virtual {v0, p1}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lsw7;->p(Ljava/lang/Object;LKw7;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ljv7;->b:Lsw7;

    invoke-virtual {v0, p1}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ljv7;->b:Lsw7;

    invoke-virtual {v1, p2}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Ljv7;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljv7;->d:LAt7;

    invoke-virtual {v0, p1}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object p1

    iget-object v0, p0, Ljv7;->d:LAt7;

    invoke-virtual {v0, p2}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object p2

    invoke-virtual {p1, p2}, LEt7;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final h(Ljava/lang/Object;LIv7;Lzt7;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Ljv7;->b:Lsw7;

    iget-object v1, p0, Ljv7;->d:LAt7;

    invoke-virtual {v0, p1}, Lsw7;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p1}, LAt7;->c(Ljava/lang/Object;)LEt7;

    move-result-object v3

    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {p2}, LIv7;->zzc()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_b

    invoke-interface {p2}, LIv7;->zzd()I

    move-result v4

    const/16 v6, 0xb

    if-eq v4, v6, :cond_3

    and-int/lit8 v5, v4, 0x7

    const/4 v6, 0x2

    if-ne v5, v6, :cond_2

    iget-object v5, p0, Ljv7;->a:Lfv7;

    ushr-int/lit8 v4, v4, 0x3

    invoke-virtual {v1, p3, v5, v4}, LAt7;->d(Lzt7;Lfv7;I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v1, p2, v4, p3, v3}, LAt7;->g(LIv7;Ljava/lang/Object;Lzt7;LEt7;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2, p2}, Lsw7;->r(Ljava/lang/Object;LIv7;)Z

    move-result v4

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LIv7;->k()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    if-nez v4, :cond_0

    invoke-virtual {v0, p1, v2}, Lsw7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_3
    const/4 v4, 0x0

    const/4 v6, 0x0

    move v7, v6

    move-object v6, v4

    :cond_4
    :goto_2
    :try_start_1
    invoke-interface {p2}, LIv7;->zzc()I

    move-result v8

    if-ne v8, v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p2}, LIv7;->zzd()I

    move-result v8

    const/16 v9, 0x10

    if-ne v8, v9, :cond_6

    invoke-interface {p2}, LIv7;->c()I

    move-result v7

    iget-object v4, p0, Ljv7;->a:Lfv7;

    invoke-virtual {v1, p3, v4, v7}, LAt7;->d(Lzt7;Lfv7;I)Ljava/lang/Object;

    move-result-object v4

    goto :goto_2

    :cond_6
    const/16 v9, 0x1a

    if-ne v8, v9, :cond_8

    if-eqz v4, :cond_7

    invoke-virtual {v1, p2, v4, p3, v3}, LAt7;->g(LIv7;Ljava/lang/Object;Lzt7;LEt7;)V

    goto :goto_2

    :cond_7
    invoke-interface {p2}, LIv7;->d()Lkt7;

    move-result-object v6

    goto :goto_2

    :cond_8
    invoke-interface {p2}, LIv7;->k()Z

    move-result v8

    if-nez v8, :cond_4

    :goto_3
    invoke-interface {p2}, LIv7;->zzd()I

    move-result v5

    const/16 v8, 0xc

    if-ne v5, v8, :cond_a

    if-eqz v6, :cond_0

    if-eqz v4, :cond_9

    invoke-virtual {v1, v6, v4, p3, v3}, LAt7;->h(Lkt7;Ljava/lang/Object;Lzt7;LEt7;)V

    goto :goto_0

    :cond_9
    invoke-virtual {v0, v2, v7, v6}, Lsw7;->k(Ljava/lang/Object;ILkt7;)V

    goto :goto_0

    :cond_a
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->b()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object p2

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_b
    invoke-virtual {v0, p1, v2}, Lsw7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {v0, p1, v2}, Lsw7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    throw p2
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Ljv7;->b:Lsw7;

    invoke-virtual {v0, p1}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsw7;->b(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Ljv7;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ljv7;->d:LAt7;

    invoke-virtual {v1, p1}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object p1

    invoke-virtual {p1}, LEt7;->d()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zzb(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Ljv7;->b:Lsw7;

    invoke-virtual {v0, p1}, Lsw7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Ljv7;->c:Z

    if-eqz v1, :cond_0

    mul-int/lit8 v0, v0, 0x35

    iget-object v1, p0, Ljv7;->d:LAt7;

    invoke-virtual {v1, p1}, LAt7;->b(Ljava/lang/Object;)LEt7;

    move-result-object p1

    iget-object p1, p1, LEt7;->a:LXv7;

    invoke-virtual {p1}, LXv7;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zze()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljv7;->a:Lfv7;

    invoke-interface {v0}, Lfv7;->k()Lev7;

    move-result-object v0

    invoke-interface {v0}, Lev7;->zzv()Lfv7;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ljv7;->b:Lsw7;

    invoke-virtual {v0, p1}, Lsw7;->m(Ljava/lang/Object;)V

    iget-object v0, p0, Ljv7;->d:LAt7;

    invoke-virtual {v0, p1}, LAt7;->f(Ljava/lang/Object;)V

    return-void
.end method
