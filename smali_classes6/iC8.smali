.class public final LiC8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIU8;


# instance fields
.field public final a:LWB8;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(LWB8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LiC8;->d:I

    const-string v0, "input"

    invoke-static {p1, v0}, LyI8;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LWB8;

    iput-object p1, p0, LiC8;->a:LWB8;

    iput-object p0, p1, LWB8;->d:LiC8;

    return-void
.end method

.method public static I(LWB8;)LiC8;
    .locals 1

    iget-object v0, p0, LWB8;->d:LiC8;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LiC8;

    invoke-direct {v0, p0}, LiC8;-><init>(LWB8;)V

    return-object v0
.end method

.method public static L(I)V
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
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->g()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p0

    throw p0
.end method

.method public static N(I)V
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
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->g()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p0

    throw p0
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

    instance-of v0, p1, LsH8;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, LsH8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->g()F

    move-result p1

    invoke-virtual {v0, p1}, LsH8;->b(F)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    invoke-static {p1}, LiC8;->N(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->g()F

    move-result p1

    invoke-virtual {v0, p1}, LsH8;->b(F)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v3, :cond_4

    return-void

    :cond_5
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->g()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, LiC8;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    invoke-static {v0}, LiC8;->N(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->g()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_a

    return-void
.end method

.method public final B(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/E;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    invoke-static {}, LeT8;->a()LeT8;

    move-result-object v0

    invoke-virtual {v0, p1}, LeT8;->b(Ljava/lang/Class;)LzU8;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LiC8;->O(LzU8;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final C(Ljava/util/List;)V
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

    instance-of v0, p1, LaI8;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LaI8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->m()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->m()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final D(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/E;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    invoke-static {}, LeT8;->a()LeT8;

    move-result-object v0

    invoke-virtual {v0, p1}, LeT8;->b(Ljava/lang/Class;)LzU8;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LiC8;->M(LzU8;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final E(Ljava/util/List;)V
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

    instance-of v0, p1, LPM8;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LPM8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->l()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LPM8;->b(J)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->l()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LPM8;->b(J)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->l()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->l()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final F(Ljava/util/Map;LjP8;Lcom/google/android/gms/internal/vision/E;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "LjP8<",
            "TK;TV;>;",
            "Lcom/google/android/gms/internal/vision/E;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, LiC8;->J(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    iget-object p2, p0, LiC8;->a:LWB8;

    invoke-virtual {p2, p1}, LWB8;->h(I)I

    const/4 p1, 0x0

    throw p1
.end method

.method public final G(LzU8;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LzU8<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/E;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    invoke-virtual {p0, p1, p2}, LiC8;->O(LzU8;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final H(LzU8;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LzU8<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/E;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    invoke-virtual {p0, p1, p2}, LiC8;->M(LzU8;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final J(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1
.end method

.method public final K(Ljava/util/List;Z)V
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

    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    instance-of v0, p1, LgM8;

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    move-object v0, p1

    check-cast v0, LgM8;

    :cond_0
    invoke-virtual {p0}, LiC8;->e()Lzy8;

    move-result-object p1

    invoke-interface {v0, p1}, LgM8;->X2(Lzy8;)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget p2, p0, LiC8;->b:I

    if-eq p1, p2, :cond_0

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, LiC8;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LiC8;->j()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, LiC8;->d:I

    return-void

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1
.end method

.method public final M(LzU8;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LzU8<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/E;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    iget-object v1, p0, LiC8;->a:LWB8;

    iget v2, v1, LWB8;->a:I

    iget v3, v1, LWB8;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, LWB8;->h(I)I

    move-result v0

    invoke-interface {p1}, LzU8;->zza()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LiC8;->a:LWB8;

    iget v3, v2, LWB8;->a:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, LWB8;->a:I

    invoke-interface {p1, v1, p0, p2}, LzU8;->d(Ljava/lang/Object;LIU8;Lcom/google/android/gms/internal/vision/E;)V

    invoke-interface {p1, v1}, LzU8;->zzc(Ljava/lang/Object;)V

    iget-object p1, p0, LiC8;->a:LWB8;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LWB8;->d(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    iget p2, p1, LWB8;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, LWB8;->a:I

    invoke-virtual {p1, v0}, LWB8;->j(I)V

    return-object v1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/vision/zzjk;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/vision/zzjk;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final O(LzU8;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LzU8<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/E;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LiC8;->c:I

    iget v1, p0, LiC8;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, LiC8;->c:I

    :try_start_0
    invoke-interface {p1}, LzU8;->zza()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1, p0, p2}, LzU8;->d(Ljava/lang/Object;LIU8;Lcom/google/android/gms/internal/vision/E;)V

    invoke-interface {p1, v1}, LzU8;->zzc(Ljava/lang/Object;)V

    iget p1, p0, LiC8;->b:I

    iget p2, p0, LiC8;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, LiC8;->c:I

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->g()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, LiC8;->c:I

    throw p1
.end method

.method public final P(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->a()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1
.end method

.method public final a()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->p()Z

    move-result v0

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->r()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->o()I

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->u()I

    move-result v0

    return v0
.end method

.method public final e()Lzy8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->s()Lzy8;

    move-result-object v0

    return-object v0
.end method

.method public final f()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    return v0
.end method

.method public final g()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->y()J

    move-result-wide v0

    return-wide v0
.end method

.method public final h()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->v()I

    move-result v0

    return v0
.end method

.method public final i(Ljava/util/List;)V
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

    instance-of v0, p1, LaI8;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LaI8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->x()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->x()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->x()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->x()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final j()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final k()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method public final l(Ljava/util/List;)V
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

    instance-of v0, p1, LPM8;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LPM8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    invoke-static {p1}, LiC8;->L(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->w()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LPM8;->b(J)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->w()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LPM8;->b(J)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    invoke-static {v0}, LiC8;->L(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final m(Ljava/util/List;)V
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

    instance-of v0, p1, LPM8;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LPM8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->y()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LPM8;->b(J)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->y()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LPM8;->b(J)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->y()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final n(Ljava/util/List;)V
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

    instance-of v0, p1, LaI8;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LaI8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final o(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzy8;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, LiC8;->e()Lzy8;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, LiC8;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1
.end method

.method public final p(Ljava/util/List;)V
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

    instance-of v0, p1, LaI8;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, LaI8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->v()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    invoke-static {p1}, LiC8;->N(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->v()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v3, :cond_4

    return-void

    :cond_5
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, LiC8;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    invoke-static {v0}, LiC8;->N(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_a

    return-void
.end method

.method public final q(Ljava/util/List;)V
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

    instance-of v0, p1, LaI8;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LaI8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->u()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->u()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->u()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->u()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final r(Ljava/util/List;LzU8;Lcom/google/android/gms/internal/vision/E;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "LzU8<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/E;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LiC8;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-virtual {p0, p2, p3}, LiC8;->O(LzU8;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->A()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, LiC8;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->a()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, LiC8;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1
.end method

.method public final s(Ljava/util/List;)V
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

    instance-of v0, p1, Lby8;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lby8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->p()Z

    move-result p1

    invoke-virtual {v0, p1}, Lby8;->b(Z)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->p()Z

    move-result p1

    invoke-virtual {v0, p1}, Lby8;->b(Z)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->p()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->p()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final t(Ljava/util/List;)V
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

    instance-of v0, p1, LaI8;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, LaI8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->o()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    invoke-static {p1}, LiC8;->N(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->o()I

    move-result p1

    invoke-virtual {v0, p1}, LaI8;->c(I)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v3, :cond_4

    return-void

    :cond_5
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, LiC8;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    invoke-static {v0}, LiC8;->N(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_a

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

    instance-of v0, p1, LPM8;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LPM8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    invoke-static {p1}, LiC8;->L(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->n()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LPM8;->b(J)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->n()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LPM8;->b(J)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    invoke-static {v0}, LiC8;->L(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->n()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->n()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final v(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LiC8;->K(Ljava/util/List;Z)V

    return-void
.end method

.method public final w(Ljava/util/List;LzU8;Lcom/google/android/gms/internal/vision/E;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "LzU8<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/E;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LiC8;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-virtual {p0, p2, p3}, LiC8;->M(LzU8;Lcom/google/android/gms/internal/vision/E;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->A()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, LiC8;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->a()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, LiC8;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1
.end method

.method public final x()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public final y(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LiC8;->K(Ljava/util/List;Z)V

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

    instance-of v0, p1, LPM8;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LPM8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->i()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LPM8;->b(J)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LPM8;->b(J)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, LiC8;->P(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final zza()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LiC8;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, LiC8;->b:I

    const/4 v0, 0x0

    iput v0, p0, LiC8;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iput v0, p0, LiC8;->b:I

    :goto_0
    iget v0, p0, LiC8;->b:I

    if-eqz v0, :cond_2

    iget v1, p0, LiC8;->c:I

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

.method public final zza(Ljava/util/List;)V
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

    instance-of v0, p1, LMD8;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LMD8;

    iget p1, p0, LiC8;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->t()I

    move-result p1

    invoke-static {p1}, LiC8;->L(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->e()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LMD8;->b(D)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->B()I

    move-result p1

    if-lt p1, v1, :cond_0

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->e()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LMD8;->b(D)V

    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, LiC8;->a:LWB8;

    invoke-virtual {p1}, LWB8;->a()I

    move-result p1

    iget v1, p0, LiC8;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, LiC8;->d:I

    return-void

    :cond_4
    iget v0, p0, LiC8;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->t()I

    move-result v0

    invoke-static {v0}, LiC8;->L(I)V

    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1}, LWB8;->B()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->e()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->B()I

    move-result v0

    if-lt v0, v1, :cond_5

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->f()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->e()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->a()I

    move-result v0

    iget v1, p0, LiC8;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, LiC8;->d:I

    return-void
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, LiC8;->b:I

    return v0
.end method

.method public final zzc()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->A()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, LiC8;->b:I

    iget v1, p0, LiC8;->c:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LiC8;->a:LWB8;

    invoke-virtual {v1, v0}, LWB8;->f(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzd()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->e()D

    move-result-wide v0

    return-wide v0
.end method

.method public final zze()F
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->g()F

    move-result v0

    return v0
.end method

.method public final zzg()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzh()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->m()I

    move-result v0

    return v0
.end method

.method public final zzi()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzs()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LiC8;->J(I)V

    iget-object v0, p0, LiC8;->a:LWB8;

    invoke-virtual {v0}, LWB8;->x()I

    move-result v0

    return v0
.end method
