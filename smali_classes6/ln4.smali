.class public final Lln4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lln4$a;
    }
.end annotation


# instance fields
.field public final a:LBv0;

.field public final b:D

.field public final c:D

.field public d:Lln4$a;

.field public e:Lln4$a;

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkn4;J)V
    .locals 10

    new-instance v4, Lal0;

    invoke-direct {v4}, Lal0;-><init>()V

    invoke-static {}, Lln4;->b()D

    move-result-wide v5

    invoke-static {}, Lln4;->b()D

    move-result-wide v7

    invoke-static {}, LBv0;->g()LBv0;

    move-result-object v9

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    invoke-direct/range {v0 .. v9}, Lln4;-><init>(Lkn4;JLal0;DDLBv0;)V

    invoke-static {p1}, LQi6;->b(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lln4;->f:Z

    return-void
.end method

.method public constructor <init>(Lkn4;JLal0;DDLBv0;)V
    .locals 15

    move-object v0, p0

    move-wide/from16 v1, p5

    move-wide/from16 v3, p7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x0

    iput-object v5, v0, Lln4;->d:Lln4$a;

    iput-object v5, v0, Lln4;->e:Lln4$a;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lln4;->f:Z

    const-wide/16 v6, 0x0

    cmpg-double v8, v6, v1

    const/4 v9, 0x1

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    if-gtz v8, :cond_0

    cmpg-double v8, v1, v10

    if-gez v8, :cond_0

    move v8, v9

    goto :goto_0

    :cond_0
    move v8, v5

    :goto_0
    const-string v12, "Sampling bucket ID should be in range [0.0, 1.0)."

    invoke-static {v8, v12}, LQi6;->a(ZLjava/lang/String;)V

    cmpg-double v6, v6, v3

    if-gtz v6, :cond_1

    cmpg-double v6, v3, v10

    if-gez v6, :cond_1

    move v5, v9

    :cond_1
    const-string v6, "Fragment sampling bucket ID should be in range [0.0, 1.0)."

    invoke-static {v5, v6}, LQi6;->a(ZLjava/lang/String;)V

    iput-wide v1, v0, Lln4;->b:D

    iput-wide v3, v0, Lln4;->c:D

    move-object/from16 v1, p9

    iput-object v1, v0, Lln4;->a:LBv0;

    new-instance v2, Lln4$a;

    const-string v13, "Trace"

    iget-boolean v14, v0, Lln4;->f:Z

    move-object v7, v2

    move-object/from16 v8, p1

    move-wide/from16 v9, p2

    move-object/from16 v11, p4

    move-object/from16 v12, p9

    invoke-direct/range {v7 .. v14}, Lln4$a;-><init>(Lkn4;JLal0;LBv0;Ljava/lang/String;Z)V

    iput-object v2, v0, Lln4;->d:Lln4$a;

    new-instance v2, Lln4$a;

    const-string v13, "Network"

    iget-boolean v14, v0, Lln4;->f:Z

    move-object v7, v2

    invoke-direct/range {v7 .. v14}, Lln4$a;-><init>(Lkn4;JLal0;LBv0;Ljava/lang/String;Z)V

    iput-object v2, v0, Lln4;->e:Lln4$a;

    return-void
.end method

.method public static b()D
    .locals 2
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lln4;->d:Lln4$a;

    invoke-virtual {v0, p1}, Lln4$a;->a(Z)V

    iget-object v0, p0, Lln4;->e:Lln4$a;

    invoke-virtual {v0, p1}, Lln4$a;->a(Z)V

    return-void
.end method

.method public final c(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LnQ3;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnQ3;

    invoke-virtual {v0}, LnQ3;->Z()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LnQ3;

    invoke-virtual {p1, v1}, LnQ3;->Y(I)LKv5;

    move-result-object p1

    sget-object v0, LKv5;->d:LKv5;

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final d()Z
    .locals 4

    iget-object v0, p0, Lln4;->a:LBv0;

    invoke-virtual {v0}, LBv0;->f()D

    move-result-wide v0

    iget-wide v2, p0, Lln4;->c:D

    cmpg-double v0, v2, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e()Z
    .locals 4

    iget-object v0, p0, Lln4;->a:LBv0;

    invoke-virtual {v0}, LBv0;->s()D

    move-result-wide v0

    iget-wide v2, p0, Lln4;->b:D

    cmpg-double v0, v2, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f()Z
    .locals 4

    iget-object v0, p0, Lln4;->a:LBv0;

    invoke-virtual {v0}, LBv0;->G()D

    move-result-wide v0

    iget-wide v2, p0, Lln4;->b:D

    cmpg-double v0, v2, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g(LkQ3;)Z
    .locals 2

    invoke-virtual {p0, p1}, Lln4;->j(LkQ3;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, LkQ3;->j()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lln4;->e:Lln4$a;

    invoke-virtual {v0, p1}, Lln4$a;->b(LkQ3;)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1

    :cond_1
    invoke-virtual {p1}, LkQ3;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lln4;->d:Lln4$a;

    invoke-virtual {v0, p1}, Lln4$a;->b(LkQ3;)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1

    :cond_2
    return v1
.end method

.method public h(LkQ3;)Z
    .locals 2

    invoke-virtual {p1}, LkQ3;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lln4;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LkQ3;->l()Lg66;

    move-result-object v0

    invoke-virtual {v0}, Lg66;->t0()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lln4;->c(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lln4;->i(LkQ3;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lln4;->d()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LkQ3;->l()Lg66;

    move-result-object v0

    invoke-virtual {v0}, Lg66;->t0()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lln4;->c(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, LkQ3;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lln4;->e()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, LkQ3;->e()LL73;

    move-result-object p1

    invoke-virtual {p1}, LL73;->p0()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lln4;->c(Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public i(LkQ3;)Z
    .locals 2

    invoke-virtual {p1}, LkQ3;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LkQ3;->l()Lg66;

    move-result-object v0

    invoke-virtual {v0}, Lg66;->s0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_st_"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LkQ3;->l()Lg66;

    move-result-object p1

    const-string v0, "Hosting_activity"

    invoke-virtual {p1, v0}, Lg66;->h0(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public j(LkQ3;)Z
    .locals 3

    invoke-virtual {p1}, LkQ3;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LkQ3;->l()Lg66;

    move-result-object v0

    invoke-virtual {v0}, Lg66;->s0()Ljava/lang/String;

    move-result-object v0

    sget-object v2, LTy0;->g:LTy0;

    invoke-virtual {v2}, LTy0;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LkQ3;->l()Lg66;

    move-result-object v0

    invoke-virtual {v0}, Lg66;->s0()Ljava/lang/String;

    move-result-object v0

    sget-object v2, LTy0;->h:LTy0;

    invoke-virtual {v2}, LTy0;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, LkQ3;->l()Lg66;

    move-result-object v0

    invoke-virtual {v0}, Lg66;->l0()I

    move-result v0

    if-lez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, LkQ3;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
