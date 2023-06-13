.class public final Lpt7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIv7;


# instance fields
.field public final a:Lot7;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Lot7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lpt7;->d:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lou7;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lpt7;->a:Lot7;

    iput-object p0, p1, Lot7;->c:Lpt7;

    return-void
.end method

.method public static final M(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->g()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object p0

    throw p0
.end method

.method public static final N(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->g()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object p0

    throw p0
.end method

.method public static O(Lot7;)Lpt7;
    .locals 1

    iget-object v0, p0, Lot7;->c:Lpt7;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lpt7;

    invoke-direct {v0, p0}, Lpt7;-><init>(Lot7;)V

    return-object v0
.end method


# virtual methods
.method public final A(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LWt7;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, LWt7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->i()F

    move-result p1

    invoke-virtual {v0, p1}, LWt7;->c(F)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    invoke-static {p1}, Lpt7;->M(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->i()F

    move-result p1

    invoke-virtual {v0, p1}, LWt7;->c(F)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->i()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lpt7;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    invoke-static {v0}, Lpt7;->M(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->i()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final B(Ljava/util/List;LNv7;Lzt7;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-virtual {p0, p2, p3}, Lpt7;->J(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lpt7;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->q()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lpt7;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1
.end method

.method public final C(Ljava/util/List;LNv7;Lzt7;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-virtual {p0, p2, p3}, Lpt7;->I(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lpt7;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->q()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lpt7;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1
.end method

.method public final D(LNv7;Lzt7;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    invoke-virtual {p0, p1, p2}, Lpt7;->J(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final E(LNv7;Lzt7;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    invoke-virtual {p0, p1, p2}, Lpt7;->I(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final F(Ljava/util/Map;LXu7;Lzt7;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->r()I

    move-result v1

    iget-object v2, p0, Lpt7;->a:Lot7;

    invoke-virtual {v2, v1}, Lot7;->k(I)I

    move-result v1

    iget-object v2, p2, LXu7;->b:Ljava/lang/Object;

    iget-object v3, p2, LXu7;->d:Ljava/lang/Object;

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lpt7;->zzc()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_5

    iget-object v5, p0, Lpt7;->a:Lot7;

    invoke-virtual {v5}, Lot7;->b()Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    const-string v6, "Unable to parse map entry."

    if-eq v4, v5, :cond_3

    if-eq v4, v0, :cond_2

    :try_start_1
    invoke-virtual {p0}, Lpt7;->k()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    invoke-direct {v4, v6}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_2
    iget-object v4, p2, LXu7;->c:LIw7;

    iget-object v5, p2, LXu7;->d:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {p0, v4, v5, p3}, Lpt7;->H(LIw7;Ljava/lang/Class;Lzt7;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_3
    iget-object v4, p2, LXu7;->a:LIw7;

    const/4 v5, 0x0

    invoke-virtual {p0, v4, v5, v5}, Lpt7;->H(LIw7;Ljava/lang/Class;Lzt7;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-virtual {p0}, Lpt7;->k()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    invoke-direct {p1, v6}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1, v1}, Lot7;->a(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lpt7;->a:Lot7;

    invoke-virtual {p2, v1}, Lot7;->a(I)V

    throw p1
.end method

.method public final G(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    instance-of v0, p1, LOu7;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_3

    move-object v0, p1

    check-cast v0, LOu7;

    :cond_1
    invoke-virtual {p0}, Lpt7;->d()Lkt7;

    move-result-object p1

    invoke-interface {v0, p1}, LOu7;->H2(Lkt7;)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget p2, p0, Lpt7;->b:I

    if-eq p1, p2, :cond_1

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lpt7;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lpt7;->g()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_3

    iput v0, p0, Lpt7;->d:I

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1
.end method

.method public final H(LIw7;Ljava/lang/Class;Lzt7;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LIw7;->d:LIw7;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "unsupported field type."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-virtual {p0}, Lpt7;->e()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0}, Lpt7;->zzi()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0}, Lpt7;->b()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0}, Lpt7;->zzh()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0}, Lpt7;->zze()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0}, Lpt7;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0}, Lpt7;->d()Lkt7;

    move-result-object p1

    return-object p1

    :pswitch_8
    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lpt7;->L(I)V

    invoke-static {}, LFv7;->a()LFv7;

    move-result-object p1

    invoke-virtual {p1, p2}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lpt7;->J(LNv7;Lzt7;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0}, Lpt7;->i()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p0}, Lpt7;->h()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p0}, Lpt7;->x()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p0}, Lpt7;->a()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0}, Lpt7;->zzg()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p0}, Lpt7;->f()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p0}, Lpt7;->j()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p0}, Lpt7;->zzb()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-virtual {p0}, Lpt7;->zza()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final I(LNv7;Lzt7;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lpt7;->c:I

    iget v1, p0, Lpt7;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lpt7;->c:I

    :try_start_0
    invoke-interface {p1}, LNv7;->zze()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1, p0, p2}, LNv7;->h(Ljava/lang/Object;LIv7;Lzt7;)V

    invoke-interface {p1, v1}, LNv7;->zzf(Ljava/lang/Object;)V

    iget p1, p0, Lpt7;->b:I

    iget p2, p0, Lpt7;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lpt7;->c:I

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->g()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lpt7;->c:I

    throw p1
.end method

.method public final J(LNv7;Lzt7;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    iget-object v1, p0, Lpt7;->a:Lot7;

    iget v2, v1, Lot7;->a:I

    iget v3, v1, Lot7;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, Lot7;->k(I)I

    move-result v0

    invoke-interface {p1}, LNv7;->zze()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lpt7;->a:Lot7;

    iget v3, v2, Lot7;->a:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lot7;->a:I

    invoke-interface {p1, v1, p0, p2}, LNv7;->h(Ljava/lang/Object;LIv7;Lzt7;)V

    invoke-interface {p1, v1}, LNv7;->zzf(Ljava/lang/Object;)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lot7;->A(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    iget p2, p1, Lot7;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lot7;->a:I

    invoke-virtual {p1, v0}, Lot7;->a(I)V

    return-object v1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final K(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object p1

    throw p1
.end method

.method public final L(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1
.end method

.method public final a()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->s()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    return v0
.end method

.method public final d()Lkt7;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->x()Lkt7;

    move-result-object v0

    return-object v0
.end method

.method public final e()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->c()Z

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->z()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final j()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->t()J

    move-result-wide v0

    return-wide v0
.end method

.method public final k()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lpt7;->b:I

    iget v1, p0, Lpt7;->c:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1, v0}, Lot7;->d(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfu7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lfu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->l()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->l()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->l()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->l()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final m(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lwt7;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lwt7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    invoke-static {p1}, Lpt7;->N(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->h()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lwt7;->b(D)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->h()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lwt7;->b(D)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    invoke-static {v0}, Lpt7;->N(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->h()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->h()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lpt7;->d()Lkt7;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lpt7;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1
.end method

.method public final o(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfu7;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lfu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    invoke-static {p1}, Lpt7;->M(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lpt7;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    invoke-static {v0}, Lpt7;->M(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final p(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LHs7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LHs7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->c()Z

    move-result p1

    invoke-virtual {v0, p1}, LHs7;->b(Z)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->c()Z

    move-result p1

    invoke-virtual {v0, p1}, LHs7;->b(Z)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final q(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LTu7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LTu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->w()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LTu7;->e(J)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->w()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LTu7;->e(J)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final r(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfu7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lfu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final s(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfu7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lfu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final t(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LTu7;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LTu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    invoke-static {p1}, Lpt7;->N(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->u()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LTu7;->e(J)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->u()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LTu7;->e(J)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    invoke-static {v0}, Lpt7;->N(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final u(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LTu7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LTu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->v()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LTu7;->e(J)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->v()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LTu7;->e(J)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->v()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final v(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LTu7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LTu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->t()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LTu7;->e(J)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->t()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LTu7;->e(J)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->t()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->t()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final w(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfu7;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lfu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lpt7;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final x()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->m()I

    move-result v0

    return v0
.end method

.method public final y(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfu7;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lfu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    invoke-static {p1}, Lpt7;->M(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lfu7;->e(I)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lpt7;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    invoke-static {v0}, Lpt7;->M(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final z(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LTu7;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LTu7;

    iget p1, p0, Lpt7;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->r()I

    move-result p1

    invoke-static {p1}, Lpt7;->N(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->s()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LTu7;->e(J)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LTu7;->e(J)V

    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lpt7;->a:Lot7;

    invoke-virtual {p1}, Lot7;->q()I

    move-result p1

    iget v1, p0, Lpt7;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lpt7;->d:I

    return-void

    :cond_4
    iget v0, p0, Lpt7;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->r()I

    move-result v0

    invoke-static {v0}, Lpt7;->N(I)V

    iget-object v1, p0, Lpt7;->a:Lot7;

    invoke-virtual {v1}, Lot7;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iget v1, p0, Lpt7;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lpt7;->d:I

    return-void
.end method

.method public final zza()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->h()D

    move-result-wide v0

    return-wide v0
.end method

.method public final zzb()F
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->i()F

    move-result v0

    return v0
.end method

.method public final zzc()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lpt7;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Lpt7;->b:I

    const/4 v1, 0x0

    iput v1, p0, Lpt7;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->q()I

    move-result v0

    iput v0, p0, Lpt7;->b:I

    :goto_0
    if-eqz v0, :cond_2

    iget v1, p0, Lpt7;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final zzd()I
    .locals 1

    iget v0, p0, Lpt7;->b:I

    return v0
.end method

.method public final zze()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->l()I

    move-result v0

    return v0
.end method

.method public final zzg()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->n()I

    move-result v0

    return v0
.end method

.method public final zzh()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->o()I

    move-result v0

    return v0
.end method

.method public final zzi()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpt7;->L(I)V

    iget-object v0, p0, Lpt7;->a:Lot7;

    invoke-virtual {v0}, Lot7;->p()I

    move-result v0

    return v0
.end method
