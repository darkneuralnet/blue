.class public final Lfk8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDo8;


# instance fields
.field public final a:Ldj8;

.field public final b:LFs8;

.field public final c:Z

.field public final d:LW28;


# direct methods
.method public constructor <init>(LFs8;LW28;Ldj8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfk8;->b:LFs8;

    invoke-virtual {p2, p3}, LW28;->g(Ldj8;)Z

    move-result p1

    iput-boolean p1, p0, Lfk8;->c:Z

    iput-object p2, p0, Lfk8;->d:LW28;

    iput-object p3, p0, Lfk8;->a:Ldj8;

    return-void
.end method

.method public static f(LFs8;LW28;Ldj8;)Lfk8;
    .locals 1

    new-instance v0, Lfk8;

    invoke-direct {v0, p0, p1, p2}, Lfk8;-><init>(LFs8;LW28;Ldj8;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lfk8;->b:LFs8;

    invoke-static {v0, p1, p2}, Lcp8;->d(LFs8;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lfk8;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfk8;->d:LW28;

    invoke-static {v0, p1, p2}, Lcp8;->c(LW28;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lfk8;->d:LW28;

    invoke-virtual {v0, p1}, LW28;->b(Ljava/lang/Object;)Ld48;

    move-result-object p1

    invoke-virtual {p1}, Ld48;->k()Z

    move-result p1

    return p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lfk8;->b:LFs8;

    invoke-virtual {v0, p1}, LFs8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lfk8;->b:LFs8;

    invoke-virtual {v1, p2}, LFs8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lfk8;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lfk8;->d:LW28;

    invoke-virtual {v0, p1}, LW28;->b(Ljava/lang/Object;)Ld48;

    move-result-object p1

    iget-object v0, p0, Lfk8;->d:LW28;

    invoke-virtual {v0, p2}, LW28;->b(Ljava/lang/Object;)Ld48;

    move-result-object p2

    invoke-virtual {p1, p2}, Ld48;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final d(Ljava/lang/Object;[BIILFU7;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p1

    check-cast v0, LV78;

    iget-object v1, v0, LV78;->zzc:LUs8;

    invoke-static {}, LUs8;->c()LUs8;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {}, LUs8;->f()LUs8;

    move-result-object v1

    iput-object v1, v0, LV78;->zzc:LUs8;

    :cond_0
    check-cast p1, LQ58;

    invoke-virtual {p1}, LQ58;->H()Ld48;

    move-result-object p1

    const/4 v0, 0x0

    move-object v2, v0

    :goto_0
    if-ge p3, p4, :cond_a

    invoke-static {p2, p3, p5}, LTU7;->j([BILFU7;)I

    move-result v4

    iget p3, p5, LFU7;->a:I

    const/16 v3, 0xb

    const/4 v5, 0x2

    if-eq p3, v3, :cond_3

    and-int/lit8 v3, p3, 0x7

    if-ne v3, v5, :cond_2

    iget-object v2, p0, Lfk8;->d:LW28;

    iget-object v3, p5, LFU7;->d:LJ28;

    iget-object v5, p0, Lfk8;->a:Ldj8;

    ushr-int/lit8 v6, p3, 0x3

    invoke-virtual {v2, v3, v5, v6}, LW28;->d(LJ28;Ldj8;I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-static {}, Lrl8;->a()Lrl8;

    move-result-object p3

    move-object v2, v8

    check-cast v2, Lq78;

    iget-object v3, v2, Lq78;->c:Ldj8;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p3, v3}, Lrl8;->b(Ljava/lang/Class;)LDo8;

    move-result-object p3

    invoke-static {p3, p2, v4, p4, p5}, LTU7;->d(LDo8;[BIILFU7;)I

    move-result p3

    iget-object v2, v2, Lq78;->d:Lb78;

    iget-object v3, p5, LFU7;->c:Ljava/lang/Object;

    invoke-virtual {p1, v2, v3}, Ld48;->i(LO38;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    move v2, p3

    move-object v3, p2

    move v5, p4

    move-object v6, v1

    move-object v7, p5

    invoke-static/range {v2 .. v7}, LTU7;->i(I[BIILUs8;LFU7;)I

    move-result p3

    :goto_1
    move-object v2, v8

    goto :goto_0

    :cond_2
    invoke-static {p3, p2, v4, p4, p5}, LTU7;->p(I[BIILFU7;)I

    move-result p3

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    move-object v3, v0

    :goto_2
    if-ge v4, p4, :cond_8

    invoke-static {p2, v4, p5}, LTU7;->j([BILFU7;)I

    move-result v4

    iget v6, p5, LFU7;->a:I

    ushr-int/lit8 v7, v6, 0x3

    and-int/lit8 v8, v6, 0x7

    if-eq v7, v5, :cond_6

    const/4 v9, 0x3

    if-eq v7, v9, :cond_4

    goto :goto_3

    :cond_4
    if-eqz v2, :cond_5

    invoke-static {}, Lrl8;->a()Lrl8;

    move-result-object v6

    move-object v7, v2

    check-cast v7, Lq78;

    iget-object v8, v7, Lq78;->c:Ldj8;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v6, v8}, Lrl8;->b(Ljava/lang/Class;)LDo8;

    move-result-object v6

    invoke-static {v6, p2, v4, p4, p5}, LTU7;->d(LDo8;[BIILFU7;)I

    move-result v4

    iget-object v6, v7, Lq78;->d:Lb78;

    iget-object v7, p5, LFU7;->c:Ljava/lang/Object;

    invoke-virtual {p1, v6, v7}, Ld48;->i(LO38;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    if-ne v8, v5, :cond_7

    invoke-static {p2, v4, p5}, LTU7;->a([BILFU7;)I

    move-result v4

    iget-object v3, p5, LFU7;->c:Ljava/lang/Object;

    check-cast v3, LgZ7;

    goto :goto_2

    :cond_6
    if-nez v8, :cond_7

    invoke-static {p2, v4, p5}, LTU7;->j([BILFU7;)I

    move-result v4

    iget p3, p5, LFU7;->a:I

    iget-object v2, p0, Lfk8;->d:LW28;

    iget-object v6, p5, LFU7;->d:LJ28;

    iget-object v7, p0, Lfk8;->a:Ldj8;

    invoke-virtual {v2, v6, v7, p3}, LW28;->d(LJ28;Ldj8;I)Ljava/lang/Object;

    move-result-object v2

    goto :goto_2

    :cond_7
    :goto_3
    const/16 v7, 0xc

    if-eq v6, v7, :cond_8

    invoke-static {v6, p2, v4, p4, p5}, LTU7;->p(I[BIILFU7;)I

    move-result v4

    goto :goto_2

    :cond_8
    if-eqz v3, :cond_9

    shl-int/lit8 p3, p3, 0x3

    or-int/2addr p3, v5

    invoke-virtual {v1, p3, v3}, LUs8;->j(ILjava/lang/Object;)V

    :cond_9
    move p3, v4

    goto/16 :goto_0

    :cond_a
    if-ne p3, p4, :cond_b

    return-void

    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzeo;->e()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzeo;

    move-result-object p1

    throw p1
.end method

.method public final e(Ljava/lang/Object;LSx8;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lfk8;->d:LW28;

    invoke-virtual {v0, p1}, LW28;->b(Ljava/lang/Object;)Ld48;

    move-result-object v0

    invoke-virtual {v0}, Ld48;->f()Ljava/util/Iterator;

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

    check-cast v2, LO38;

    invoke-interface {v2}, LO38;->zze()LHx8;

    move-result-object v3

    sget-object v4, LHx8;->k:LHx8;

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, LO38;->zzg()Z

    invoke-interface {v2}, LO38;->x()Z

    instance-of v3, v1, LXb8;

    if-eqz v3, :cond_0

    invoke-interface {v2}, LO38;->zza()I

    move-result v2

    check-cast v1, LXb8;

    invoke-virtual {v1}, LXb8;->a()Lxc8;

    move-result-object v1

    invoke-virtual {v1}, LKc8;->b()LgZ7;

    move-result-object v1

    invoke-interface {p2, v2, v1}, LSx8;->I(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {v2}, LO38;->zza()I

    move-result v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v2, v1}, LSx8;->I(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Found invalid MessageSet item."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, p0, Lfk8;->b:LFs8;

    invoke-virtual {v0, p1}, LFs8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LFs8;->i(Ljava/lang/Object;LSx8;)V

    return-void
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lfk8;->b:LFs8;

    invoke-virtual {v0, p1}, LFs8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LFs8;->b(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lfk8;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lfk8;->d:LW28;

    invoke-virtual {v1, p1}, LW28;->b(Ljava/lang/Object;)Ld48;

    move-result-object p1

    invoke-virtual {p1}, Ld48;->b()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zzb(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lfk8;->b:LFs8;

    invoke-virtual {v0, p1}, LFs8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lfk8;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lfk8;->d:LW28;

    invoke-virtual {v1, p1}, LW28;->b(Ljava/lang/Object;)Ld48;

    move-result-object p1

    mul-int/lit8 v0, v0, 0x35

    iget-object p1, p1, Ld48;->a:LGr8;

    invoke-virtual {p1}, LGr8;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zze()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfk8;->a:Ldj8;

    instance-of v1, v0, LV78;

    if-eqz v1, :cond_0

    check-cast v0, LV78;

    invoke-virtual {v0}, LV78;->j()LV78;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ldj8;->A()LQi8;

    move-result-object v0

    invoke-interface {v0}, LQi8;->a()Ldj8;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lfk8;->b:LFs8;

    invoke-virtual {v0, p1}, LFs8;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lfk8;->d:LW28;

    invoke-virtual {v0, p1}, LW28;->e(Ljava/lang/Object;)V

    return-void
.end method
