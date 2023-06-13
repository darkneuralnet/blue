.class public final Lac7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lic7;


# instance fields
.field public final a:LTb7;

.field public final b:LBc7;

.field public final c:Z

.field public final d:LPa7;


# direct methods
.method public constructor <init>(LBc7;LPa7;LTb7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lac7;->b:LBc7;

    invoke-virtual {p2, p3}, LPa7;->g(LTb7;)Z

    move-result p1

    iput-boolean p1, p0, Lac7;->c:Z

    iput-object p2, p0, Lac7;->d:LPa7;

    iput-object p3, p0, Lac7;->a:LTb7;

    return-void
.end method

.method public static i(LBc7;LPa7;LTb7;)Lac7;
    .locals 1

    new-instance v0, Lac7;

    invoke-direct {v0, p0, p1, p2}, Lac7;-><init>(LBc7;LPa7;LTb7;)V

    return-object v0
.end method


# virtual methods
.method public final B()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lac7;->a:LTb7;

    instance-of v1, v0, Lfb7;

    if-eqz v1, :cond_0

    check-cast v0, Lfb7;

    invoke-virtual {v0}, Lfb7;->x()Lfb7;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, LTb7;->f()LSb7;

    move-result-object v0

    invoke-interface {v0}, LSb7;->u1()LTb7;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lac7;->b:LBc7;

    invoke-virtual {v0, p1}, LBc7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LBc7;->b(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lac7;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lac7;->d:LPa7;

    invoke-virtual {v1, p1}, LPa7;->b(Ljava/lang/Object;)LTa7;

    move-result-object p1

    invoke-virtual {p1}, LTa7;->c()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lac7;->b:LBc7;

    invoke-virtual {v0, p1}, LBc7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lac7;->b:LBc7;

    invoke-virtual {v1, p2}, LBc7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lac7;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lac7;->d:LPa7;

    invoke-virtual {v0, p1}, LPa7;->b(Ljava/lang/Object;)LTa7;

    move-result-object p1

    iget-object v0, p0, Lac7;->d:LPa7;

    invoke-virtual {v0, p2}, LPa7;->b(Ljava/lang/Object;)LTa7;

    move-result-object p2

    invoke-virtual {p1, p2}, LTa7;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lac7;->b:LBc7;

    invoke-static {v0, p1, p2}, Lkc7;->d(LBc7;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lac7;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lac7;->d:LPa7;

    invoke-static {v0, p1, p2}, Lkc7;->c(LPa7;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Object;[BIILla7;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Lfb7;

    iget-object v1, v0, Lfb7;->zbc:LCc7;

    invoke-static {}, LCc7;->c()LCc7;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {}, LCc7;->f()LCc7;

    move-result-object v1

    iput-object v1, v0, Lfb7;->zbc:LCc7;

    :cond_0
    check-cast p1, Lcb7;

    invoke-virtual {p1}, Lcb7;->E()LTa7;

    move-result-object p1

    const/4 v0, 0x0

    move-object v2, v0

    :goto_0
    if-ge p3, p4, :cond_a

    invoke-static {p2, p3, p5}, Lma7;->j([BILla7;)I

    move-result v4

    iget p3, p5, Lla7;->a:I

    const/16 v3, 0xb

    const/4 v5, 0x2

    if-eq p3, v3, :cond_3

    and-int/lit8 v3, p3, 0x7

    if-ne v3, v5, :cond_2

    iget-object v2, p0, Lac7;->d:LPa7;

    iget-object v3, p5, Lla7;->d:LOa7;

    iget-object v5, p0, Lac7;->a:LTb7;

    ushr-int/lit8 v6, p3, 0x3

    invoke-virtual {v2, v3, v5, v6}, LPa7;->d(LOa7;LTb7;I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-static {}, Lfc7;->a()Lfc7;

    move-result-object p3

    move-object v2, v8

    check-cast v2, Leb7;

    iget-object v3, v2, Leb7;->c:LTb7;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p3, v3}, Lfc7;->b(Ljava/lang/Class;)Lic7;

    move-result-object p3

    invoke-static {p3, p2, v4, p4, p5}, Lma7;->d(Lic7;[BIILla7;)I

    move-result p3

    iget-object v2, v2, Leb7;->d:Ldb7;

    iget-object v3, p5, Lla7;->c:Ljava/lang/Object;

    invoke-virtual {p1, v2, v3}, LTa7;->j(LSa7;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    move v2, p3

    move-object v3, p2

    move v5, p4

    move-object v6, v1

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lma7;->i(I[BIILCc7;Lla7;)I

    move-result p3

    :goto_1
    move-object v2, v8

    goto :goto_0

    :cond_2
    invoke-static {p3, p2, v4, p4, p5}, Lma7;->p(I[BIILla7;)I

    move-result p3

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    move-object v3, v0

    :goto_2
    if-ge v4, p4, :cond_8

    invoke-static {p2, v4, p5}, Lma7;->j([BILla7;)I

    move-result v4

    iget v6, p5, Lla7;->a:I

    ushr-int/lit8 v7, v6, 0x3

    and-int/lit8 v8, v6, 0x7

    if-eq v7, v5, :cond_6

    const/4 v9, 0x3

    if-eq v7, v9, :cond_4

    goto :goto_3

    :cond_4
    if-eqz v2, :cond_5

    invoke-static {}, Lfc7;->a()Lfc7;

    move-result-object v6

    move-object v7, v2

    check-cast v7, Leb7;

    iget-object v8, v7, Leb7;->c:LTb7;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v6, v8}, Lfc7;->b(Ljava/lang/Class;)Lic7;

    move-result-object v6

    invoke-static {v6, p2, v4, p4, p5}, Lma7;->d(Lic7;[BIILla7;)I

    move-result v4

    iget-object v6, v7, Leb7;->d:Ldb7;

    iget-object v7, p5, Lla7;->c:Ljava/lang/Object;

    invoke-virtual {p1, v6, v7}, LTa7;->j(LSa7;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    if-ne v8, v5, :cond_7

    invoke-static {p2, v4, p5}, Lma7;->a([BILla7;)I

    move-result v4

    iget-object v3, p5, Lla7;->c:Ljava/lang/Object;

    check-cast v3, LCa7;

    goto :goto_2

    :cond_6
    if-nez v8, :cond_7

    invoke-static {p2, v4, p5}, Lma7;->j([BILla7;)I

    move-result v4

    iget p3, p5, Lla7;->a:I

    iget-object v2, p0, Lac7;->d:LPa7;

    iget-object v6, p5, Lla7;->d:LOa7;

    iget-object v7, p0, Lac7;->a:LTb7;

    invoke-virtual {v2, v6, v7, p3}, LPa7;->d(LOa7;LTb7;I)Ljava/lang/Object;

    move-result-object v2

    goto :goto_2

    :cond_7
    :goto_3
    const/16 v7, 0xc

    if-eq v6, v7, :cond_8

    invoke-static {v6, p2, v4, p4, p5}, Lma7;->p(I[BIILla7;)I

    move-result v4

    goto :goto_2

    :cond_8
    if-eqz v3, :cond_9

    shl-int/lit8 p3, p3, 0x3

    or-int/2addr p3, v5

    invoke-virtual {v1, p3, v3}, LCc7;->j(ILjava/lang/Object;)V

    :cond_9
    move p3, v4

    goto/16 :goto_0

    :cond_a
    if-ne p3, p4, :cond_b

    return-void

    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;->e()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    move-result-object p1

    throw p1
.end method

.method public final e(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lac7;->d:LPa7;

    invoke-virtual {v0, p1}, LPa7;->b(Ljava/lang/Object;)LTa7;

    move-result-object p1

    invoke-virtual {p1}, LTa7;->m()Z

    move-result p1

    return p1
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lac7;->b:LBc7;

    invoke-virtual {v0, p1}, LBc7;->h(Ljava/lang/Object;)V

    iget-object v0, p0, Lac7;->d:LPa7;

    invoke-virtual {v0, p1}, LPa7;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;LTc7;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lac7;->d:LPa7;

    invoke-virtual {v0, p1}, LPa7;->b(Ljava/lang/Object;)LTa7;

    move-result-object v0

    invoke-virtual {v0}, LTa7;->g()Ljava/util/Iterator;

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

    check-cast v2, LSa7;

    invoke-interface {v2}, LSa7;->B()LSc7;

    move-result-object v3

    sget-object v4, LSc7;->k:LSc7;

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, LSa7;->n0()Z

    invoke-interface {v2}, LSa7;->i0()Z

    instance-of v3, v1, Lsb7;

    const v4, 0x1ea8e13

    if-eqz v3, :cond_0

    invoke-interface {v2}, LSa7;->y()I

    check-cast v1, Lsb7;

    invoke-virtual {v1}, Lsb7;->a()Lxb7;

    move-result-object v1

    invoke-virtual {v1}, Lyb7;->b()LCa7;

    move-result-object v1

    invoke-interface {p2, v4, v1}, LTc7;->c(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {v2}, LSa7;->y()I

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v4, v1}, LTc7;->c(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Found invalid MessageSet item."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, p0, Lac7;->b:LBc7;

    invoke-virtual {v0, p1}, LBc7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LBc7;->k(Ljava/lang/Object;LTc7;)V

    return-void
.end method

.method public final h(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lac7;->b:LBc7;

    invoke-virtual {v0, p1}, LBc7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lac7;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lac7;->d:LPa7;

    invoke-virtual {v1, p1}, LPa7;->b(Ljava/lang/Object;)LTa7;

    move-result-object p1

    mul-int/lit8 v0, v0, 0x35

    iget-object p1, p1, LTa7;->a:Lvc7;

    invoke-virtual {p1}, Lvc7;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method
