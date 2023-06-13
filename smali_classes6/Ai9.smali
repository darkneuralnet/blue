.class public final LAi9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwq9;


# instance fields
.field public final a:Lti9;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Lti9;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LAi9;->d:I

    const-string v0, "input"

    invoke-static {p1, v0}, LFn9;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, LAi9;->a:Lti9;

    iput-object p0, p1, Lti9;->c:LAi9;

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
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->g()Lcom/google/android/gms/internal/recaptcha/zzrr;

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
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->g()Lcom/google/android/gms/internal/recaptcha/zzrr;

    move-result-object p0

    throw p0
.end method

.method public static O(Lti9;)LAi9;
    .locals 1

    iget-object v0, p0, Lti9;->c:LAi9;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LAi9;

    invoke-direct {v0, p0}, LAi9;-><init>(Lti9;)V

    return-object v0
.end method


# virtual methods
.method public final A(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lhl9;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lhl9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->i()F

    move-result p1

    invoke-virtual {v0, p1}, Lhl9;->b(F)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    invoke-static {p1}, LAi9;->M(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->i()F

    move-result p1

    invoke-virtual {v0, p1}, Lhl9;->b(F)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->i()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, LAi9;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    invoke-static {v0}, LAi9;->M(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->i()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final B(Ljava/util/Map;Ltp9;Lsk9;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Ltp9<",
            "TK;TV;>;",
            "Lsk9;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->r()I

    move-result v1

    iget-object v2, p0, LAi9;->a:Lti9;

    invoke-virtual {v2, v1}, Lti9;->k(I)I

    move-result v1

    iget-object v2, p2, Ltp9;->b:Ljava/lang/Object;

    iget-object v3, p2, Ltp9;->d:Ljava/lang/Object;

    :goto_0
    :try_start_0
    invoke-virtual {p0}, LAi9;->zzc()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_5

    iget-object v5, p0, LAi9;->a:Lti9;

    invoke-virtual {v5}, Lti9;->b()Z

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
    invoke-virtual {p0}, LAi9;->k()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance v4, Lcom/google/android/gms/internal/recaptcha/zzrr;

    invoke-direct {v4, v6}, Lcom/google/android/gms/internal/recaptcha/zzrr;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_2
    iget-object v4, p2, Ltp9;->c:LRs9;

    iget-object v5, p2, Ltp9;->d:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {p0, v4, v5, p3}, LAi9;->H(LRs9;Ljava/lang/Class;Lsk9;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_3
    iget-object v4, p2, Ltp9;->a:LRs9;

    const/4 v5, 0x0

    invoke-virtual {p0, v4, v5, v5}, LAi9;->H(LRs9;Ljava/lang/Class;Lsk9;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Lcom/google/android/gms/internal/recaptcha/zzrq; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-virtual {p0}, LAi9;->k()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/recaptcha/zzrr;

    invoke-direct {p1, v6}, Lcom/google/android/gms/internal/recaptcha/zzrr;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1, v1}, Lti9;->a(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, LAi9;->a:Lti9;

    invoke-virtual {p2, v1}, Lti9;->a(I)V

    throw p1
.end method

.method public final C(Lbr9;Lsk9;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbr9<",
            "TT;>;",
            "Lsk9;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    invoke-virtual {p0, p1, p2}, LAi9;->I(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final D(Lbr9;Lsk9;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbr9<",
            "TT;>;",
            "Lsk9;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    invoke-virtual {p0, p1, p2}, LAi9;->J(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final E(Ljava/util/List;Lbr9;Lsk9;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lbr9<",
            "TT;>;",
            "Lsk9;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LAi9;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-virtual {p0, p2, p3}, LAi9;->I(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, LAi9;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->q()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, LAi9;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1
.end method

.method public final F(Ljava/util/List;Lbr9;Lsk9;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lbr9<",
            "TT;>;",
            "Lsk9;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LAi9;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-virtual {p0, p2, p3}, LAi9;->J(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, LAi9;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->q()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, LAi9;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1
.end method

.method public final G(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    instance-of v0, p1, Lko9;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_3

    move-object v0, p1

    check-cast v0, Lko9;

    :cond_1
    invoke-virtual {p0}, LAi9;->d()Lnh9;

    move-result-object p1

    invoke-interface {v0, p1}, Lko9;->P2(Lnh9;)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget p2, p0, LAi9;->b:I

    if-eq p1, p2, :cond_1

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    invoke-virtual {p0}, LAi9;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LAi9;->g()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_3

    iput v0, p0, LAi9;->d:I

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1
.end method

.method public final H(LRs9;Ljava/lang/Class;Lsk9;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRs9;",
            "Ljava/lang/Class<",
            "*>;",
            "Lsk9;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LRs9;->d:LRs9;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "unsupported field type."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-virtual {p0}, LAi9;->e()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0}, LAi9;->zzi()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0}, LAi9;->b()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0}, LAi9;->zzh()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0}, LAi9;->zze()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0}, LAi9;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0}, LAi9;->d()Lnh9;

    move-result-object p1

    return-object p1

    :pswitch_8
    const/4 p1, 0x2

    invoke-virtual {p0, p1}, LAi9;->L(I)V

    invoke-static {}, Lnq9;->a()Lnq9;

    move-result-object p1

    invoke-virtual {p1, p2}, Lnq9;->b(Ljava/lang/Class;)Lbr9;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, LAi9;->J(Lbr9;Lsk9;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0}, LAi9;->i()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p0}, LAi9;->h()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p0}, LAi9;->x()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p0}, LAi9;->a()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0}, LAi9;->zzg()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p0}, LAi9;->f()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p0}, LAi9;->j()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p0}, LAi9;->zzb()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-virtual {p0}, LAi9;->zza()D

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

.method public final I(Lbr9;Lsk9;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbr9<",
            "TT;>;",
            "Lsk9;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LAi9;->c:I

    iget v1, p0, LAi9;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, LAi9;->c:I

    :try_start_0
    invoke-interface {p1}, Lbr9;->zzc()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1, p0, p2}, Lbr9;->b(Ljava/lang/Object;Lwq9;Lsk9;)V

    invoke-interface {p1, v1}, Lbr9;->a(Ljava/lang/Object;)V

    iget p1, p0, LAi9;->b:I

    iget p2, p0, LAi9;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, LAi9;->c:I

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->g()Lcom/google/android/gms/internal/recaptcha/zzrr;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, LAi9;->c:I

    throw p1
.end method

.method public final J(Lbr9;Lsk9;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbr9<",
            "TT;>;",
            "Lsk9;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    iget-object v1, p0, LAi9;->a:Lti9;

    iget v2, v1, Lti9;->a:I

    iget v3, v1, Lti9;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, Lti9;->k(I)I

    move-result v0

    invoke-interface {p1}, Lbr9;->zzc()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LAi9;->a:Lti9;

    iget v3, v2, Lti9;->a:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lti9;->a:I

    invoke-interface {p1, v1, p0, p2}, Lbr9;->b(Ljava/lang/Object;Lwq9;Lsk9;)V

    invoke-interface {p1, v1}, Lbr9;->a(Ljava/lang/Object;)V

    iget-object p1, p0, LAi9;->a:Lti9;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lti9;->A(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    iget p2, p1, Lti9;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lti9;->a:I

    invoke-virtual {p1, v0}, Lti9;->a(I)V

    return-object v1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/recaptcha/zzrr;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/recaptcha/zzrr;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final K(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->j()Lcom/google/android/gms/internal/recaptcha/zzrr;

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

    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->s()J

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->u()J

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    return v0
.end method

.method public final d()Lnh9;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->x()Lnh9;

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->v()J

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->w()J

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->y()Ljava/lang/String;

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->c()Z

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->z()Ljava/lang/String;

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->t()J

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

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, LAi9;->b:I

    iget v1, p0, LAi9;->c:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1, v0}, Lti9;->d(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LKm9;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LKm9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->l()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->l()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->l()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->l()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

    return-void
.end method

.method public final m(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LFj9;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LFj9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    invoke-static {p1}, LAi9;->N(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->h()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LFj9;->b(D)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->h()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LFj9;->b(D)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    invoke-static {v0}, LAi9;->N(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->h()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->h()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnh9;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, LAi9;->d()Lnh9;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, LAi9;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1
.end method

.method public final o(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LKm9;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, LKm9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->m()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    invoke-static {p1}, LAi9;->M(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->m()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, LAi9;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    invoke-static {v0}, LAi9;->M(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final p(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LAf9;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LAf9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->c()Z

    move-result p1

    invoke-virtual {v0, p1}, LAf9;->b(Z)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->c()Z

    move-result p1

    invoke-virtual {v0, p1}, LAf9;->b(Z)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

    return-void
.end method

.method public final q(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfp9;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lfp9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->w()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lfp9;->c(J)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->w()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lfp9;->c(J)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

    return-void
.end method

.method public final r(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LKm9;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LKm9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

    return-void
.end method

.method public final s(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LKm9;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LKm9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->p()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->p()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

    return-void
.end method

.method public final t(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfp9;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lfp9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    invoke-static {p1}, LAi9;->N(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->u()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lfp9;->c(J)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->u()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lfp9;->c(J)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    invoke-static {v0}, LAi9;->N(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

    return-void
.end method

.method public final u(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfp9;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lfp9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->v()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lfp9;->c(J)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->v()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lfp9;->c(J)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->v()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

    return-void
.end method

.method public final v(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfp9;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lfp9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->t()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lfp9;->c(J)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->t()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lfp9;->c(J)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->t()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->t()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

    return-void
.end method

.method public final w(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LKm9;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LKm9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->n()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->n()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LAi9;->K(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->m()I

    move-result v0

    return v0
.end method

.method public final y(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LKm9;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, LKm9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->o()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    invoke-static {p1}, LAi9;->M(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->o()I

    move-result p1

    invoke-virtual {v0, p1}, LKm9;->zzh(I)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, LAi9;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    invoke-static {v0}, LAi9;->M(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final z(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lfp9;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lfp9;

    iget p1, p0, LAi9;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->r()I

    move-result p1

    invoke-static {p1}, LAi9;->N(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->s()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lfp9;->c(J)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lfp9;->c(J)V

    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LAi9;->a:Lti9;

    invoke-virtual {p1}, Lti9;->q()I

    move-result p1

    iget v1, p0, LAi9;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LAi9;->d:I

    return-void

    :cond_4
    iget v0, p0, LAi9;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->r()I

    move-result v0

    invoke-static {v0}, LAi9;->N(I)V

    iget-object v1, p0, LAi9;->a:Lti9;

    invoke-virtual {v1}, Lti9;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/recaptcha/zzrr;->a()Lcom/google/android/gms/internal/recaptcha/zzrq;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iget v1, p0, LAi9;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LAi9;->d:I

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->h()D

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->i()F

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

    iget v0, p0, LAi9;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, LAi9;->b:I

    const/4 v1, 0x0

    iput v1, p0, LAi9;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->q()I

    move-result v0

    iput v0, p0, LAi9;->b:I

    :goto_0
    if-eqz v0, :cond_2

    iget v1, p0, LAi9;->c:I

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

    iget v0, p0, LAi9;->b:I

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->l()I

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->n()I

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->o()I

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

    invoke-virtual {p0, v0}, LAi9;->L(I)V

    iget-object v0, p0, LAi9;->a:Lti9;

    invoke-virtual {v0}, Lti9;->p()I

    move-result v0

    return v0
.end method
