.class public final LTg9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEi9;


# instance fields
.field public final a:Lpg9;

.field public final b:LMk9;

.field public final c:Z

.field public final d:LU89;


# direct methods
.method public constructor <init>(LMk9;LU89;Lpg9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTg9;->b:LMk9;

    invoke-virtual {p2, p3}, LU89;->f(Lpg9;)Z

    move-result p1

    iput-boolean p1, p0, LTg9;->c:Z

    iput-object p2, p0, LTg9;->d:LU89;

    iput-object p3, p0, LTg9;->a:Lpg9;

    return-void
.end method

.method public static f(LMk9;LU89;Lpg9;)LTg9;
    .locals 1

    new-instance v0, LTg9;

    invoke-direct {v0, p0, p1, p2}, LTg9;-><init>(LMk9;LU89;Lpg9;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LTg9;->b:LMk9;

    invoke-static {v0, p1, p2}, LTi9;->f(LMk9;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, LTg9;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LTg9;->d:LU89;

    invoke-static {v0, p1, p2}, LTi9;->e(LU89;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;[BIILj49;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Lub9;

    iget-object v1, v0, Lub9;->zzc:LSk9;

    invoke-static {}, LSk9;->c()LSk9;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {}, LSk9;->e()LSk9;

    move-result-object v1

    iput-object v1, v0, Lub9;->zzc:LSk9;

    :cond_0
    check-cast p1, LTa9;

    invoke-virtual {p1}, LTa9;->u()Lda9;

    move-result-object p1

    const/4 v0, 0x0

    move-object v2, v0

    :goto_0
    if-ge p3, p4, :cond_a

    invoke-static {p2, p3, p5}, Lr49;->j([BILj49;)I

    move-result v4

    iget p3, p5, Lj49;->a:I

    const/16 v3, 0xb

    const/4 v5, 0x2

    if-eq p3, v3, :cond_3

    and-int/lit8 v3, p3, 0x7

    if-ne v3, v5, :cond_2

    iget-object v2, p0, LTg9;->d:LU89;

    iget-object v3, p5, Lj49;->d:LN89;

    iget-object v5, p0, LTg9;->a:Lpg9;

    ushr-int/lit8 v6, p3, 0x3

    invoke-virtual {v2, v3, v5, v6}, LU89;->d(LN89;Lpg9;I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-static {}, Lhi9;->a()Lhi9;

    move-result-object p3

    move-object v2, v8

    check-cast v2, Lhb9;

    iget-object v3, v2, Lhb9;->c:Lpg9;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p3, v3}, Lhi9;->b(Ljava/lang/Class;)LEi9;

    move-result-object p3

    invoke-static {p3, p2, v4, p4, p5}, Lr49;->d(LEi9;[BIILj49;)I

    move-result p3

    iget-object v2, v2, Lhb9;->d:Lab9;

    iget-object v3, p5, Lj49;->c:Ljava/lang/Object;

    invoke-virtual {p1, v2, v3}, Lda9;->j(LW99;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    move v2, p3

    move-object v3, p2

    move v5, p4

    move-object v6, v1

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lr49;->i(I[BIILSk9;Lj49;)I

    move-result p3

    :goto_1
    move-object v2, v8

    goto :goto_0

    :cond_2
    invoke-static {p3, p2, v4, p4, p5}, Lr49;->n(I[BIILj49;)I

    move-result p3

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    move-object v3, v0

    :goto_2
    if-ge v4, p4, :cond_8

    invoke-static {p2, v4, p5}, Lr49;->j([BILj49;)I

    move-result v4

    iget v6, p5, Lj49;->a:I

    and-int/lit8 v7, v6, 0x7

    ushr-int/lit8 v8, v6, 0x3

    if-eq v8, v5, :cond_6

    const/4 v9, 0x3

    if-eq v8, v9, :cond_4

    goto :goto_3

    :cond_4
    if-eqz v2, :cond_5

    invoke-static {}, Lhi9;->a()Lhi9;

    move-result-object v6

    move-object v7, v2

    check-cast v7, Lhb9;

    iget-object v8, v7, Lhb9;->c:Lpg9;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v6, v8}, Lhi9;->b(Ljava/lang/Class;)LEi9;

    move-result-object v6

    invoke-static {v6, p2, v4, p4, p5}, Lr49;->d(LEi9;[BIILj49;)I

    move-result v4

    iget-object v6, v7, Lhb9;->d:Lab9;

    iget-object v7, p5, Lj49;->c:Ljava/lang/Object;

    invoke-virtual {p1, v6, v7}, Lda9;->j(LW99;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    if-ne v7, v5, :cond_7

    invoke-static {p2, v4, p5}, Lr49;->a([BILj49;)I

    move-result v4

    iget-object v3, p5, Lj49;->c:Ljava/lang/Object;

    check-cast v3, LT69;

    goto :goto_2

    :cond_6
    if-nez v7, :cond_7

    invoke-static {p2, v4, p5}, Lr49;->j([BILj49;)I

    move-result v4

    iget p3, p5, Lj49;->a:I

    iget-object v2, p0, LTg9;->d:LU89;

    iget-object v6, p5, Lj49;->d:LN89;

    iget-object v7, p0, LTg9;->a:Lpg9;

    invoke-virtual {v2, v6, v7, p3}, LU89;->d(LN89;Lpg9;I)Ljava/lang/Object;

    move-result-object v2

    goto :goto_2

    :cond_7
    :goto_3
    const/16 v7, 0xc

    if-eq v6, v7, :cond_8

    invoke-static {v6, p2, v4, p4, p5}, Lr49;->n(I[BIILj49;)I

    move-result v4

    goto :goto_2

    :cond_8
    if-eqz v3, :cond_9

    shl-int/lit8 p3, p3, 0x3

    or-int/2addr p3, v5

    invoke-virtual {v1, p3, v3}, LSk9;->h(ILjava/lang/Object;)V

    :cond_9
    move p3, v4

    goto/16 :goto_0

    :cond_a
    if-ne p3, p4, :cond_b

    return-void

    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzov;->e()Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzov;

    move-result-object p1

    throw p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, LTg9;->b:LMk9;

    invoke-virtual {v0, p1}, LMk9;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LTg9;->b:LMk9;

    invoke-virtual {v1, p2}, LMk9;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, LTg9;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LTg9;->d:LU89;

    invoke-virtual {v0, p1}, LU89;->b(Ljava/lang/Object;)Lda9;

    move-result-object p1

    iget-object v0, p0, LTg9;->d:LU89;

    invoke-virtual {v0, p2}, LU89;->b(Ljava/lang/Object;)Lda9;

    move-result-object p2

    invoke-virtual {p1, p2}, Lda9;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final d(Ljava/lang/Object;Lh89;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LTg9;->d:LU89;

    invoke-virtual {v0, p1}, LU89;->b(Ljava/lang/Object;)Lda9;

    move-result-object v0

    invoke-virtual {v0}, Lda9;->f()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LW99;

    invoke-interface {p1}, LW99;->zzc()Lln9;

    move-result-object p2

    sget-object v0, Lln9;->k:Lln9;

    if-ne p2, v0, :cond_0

    invoke-interface {p1}, LW99;->zze()Z

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Found invalid MessageSet item."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, LTg9;->b:LMk9;

    invoke-virtual {v0, p1}, LMk9;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LMk9;->i(Ljava/lang/Object;Lh89;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LTg9;->d:LU89;

    invoke-virtual {v0, p1}, LU89;->b(Ljava/lang/Object;)Lda9;

    move-result-object p1

    invoke-virtual {p1}, Lda9;->l()Z

    move-result p1

    return p1
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, LTg9;->b:LMk9;

    invoke-virtual {v0, p1}, LMk9;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LMk9;->b(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, LTg9;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, LTg9;->d:LU89;

    invoke-virtual {v1, p1}, LU89;->b(Ljava/lang/Object;)Lda9;

    move-result-object p1

    invoke-virtual {p1}, Lda9;->b()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zzb(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, LTg9;->b:LMk9;

    invoke-virtual {v0, p1}, LMk9;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, LTg9;->c:Z

    if-eqz v1, :cond_0

    mul-int/lit8 v0, v0, 0x35

    iget-object v1, p0, LTg9;->d:LU89;

    invoke-virtual {v1, p1}, LU89;->b(Ljava/lang/Object;)Lda9;

    move-result-object p1

    iget-object p1, p1, Lda9;->a:Lpk9;

    invoke-virtual {p1}, Lpk9;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zze()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LTg9;->a:Lpg9;

    invoke-interface {v0}, Lpg9;->q()Lig9;

    move-result-object v0

    invoke-interface {v0}, Lig9;->zzs()Lpg9;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LTg9;->b:LMk9;

    invoke-virtual {v0, p1}, LMk9;->g(Ljava/lang/Object;)V

    iget-object v0, p0, LTg9;->d:LU89;

    invoke-virtual {v0, p1}, LU89;->e(Ljava/lang/Object;)V

    return-void
.end method
