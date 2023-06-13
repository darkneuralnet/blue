.class public final LBo7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lso7;


# instance fields
.field public final a:LIm9;


# direct methods
.method public constructor <init>(LIm9;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBo7;->a:LIm9;

    invoke-static {}, Lkp7;->a()Lkp7;

    return-void
.end method

.method public static d(LIm9;)Lso7;
    .locals 2

    new-instance v0, LBo7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LBo7;-><init>(LIm9;I)V

    return-object v0
.end method

.method public static e(Ljava/lang/Integer;)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(IZ)[B
    .locals 0

    iget-object p1, p0, LBo7;->a:LIm9;

    invoke-virtual {p1}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, LOm9;

    invoke-virtual {p1}, Lys7;->e()[B

    move-result-object p1

    return-object p1
.end method

.method public final b(LWk7;)Lso7;
    .locals 1

    iget-object v0, p0, LBo7;->a:LIm9;

    invoke-virtual {p1}, LWk7;->zza()I

    move-result p1

    invoke-static {p1}, Lfl9;->a(I)I

    move-result p1

    invoke-virtual {v0, p1}, LIm9;->t(I)LIm9;

    return-object p0
.end method

.method public final c(LCm7;)Lso7;
    .locals 3

    invoke-virtual {p1}, LCm7;->m()LEm7;

    move-result-object p1

    invoke-static {}, LRu9;->D()LPu9;

    move-result-object v0

    invoke-virtual {p1}, LEm7;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LNR8;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LPu9;->r(Ljava/lang/String;)LPu9;

    invoke-virtual {p1}, LEm7;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LNR8;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LPu9;->t(Ljava/lang/String;)LPu9;

    const/4 v1, 0x0

    invoke-static {v1}, LNR8;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPu9;->B(Ljava/lang/String;)LPu9;

    invoke-virtual {p1}, LEm7;->j()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LNR8;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPu9;->I(Ljava/lang/String;)LPu9;

    invoke-virtual {p1}, LEm7;->k()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LNR8;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPu9;->M(Ljava/lang/String;)LPu9;

    invoke-static {v1}, LNR8;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPu9;->C(Ljava/lang/String;)LPu9;

    invoke-static {v1}, LNR8;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LPu9;->q(Ljava/lang/String;)LPu9;

    invoke-virtual {p1}, LEm7;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LNR8;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LPu9;->H(Ljava/lang/String;)LPu9;

    invoke-virtual {p1}, LEm7;->b()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, LPu9;->D(Z)LPu9;

    invoke-virtual {p1}, LEm7;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, LPu9;->G(Z)LPu9;

    invoke-virtual {p1}, LEm7;->e()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LBo7;->e(Ljava/lang/Integer;)I

    move-result v1

    invoke-virtual {v0, v1}, LPu9;->A(I)LPu9;

    invoke-virtual {p1}, LEm7;->f()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LBo7;->e(Ljava/lang/Integer;)I

    move-result v1

    invoke-virtual {v0, v1}, LPu9;->J(I)LPu9;

    invoke-virtual {p1}, LEm7;->a()LvU8;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, LPu9;->p(Ljava/lang/Iterable;)LPu9;

    :cond_0
    iget-object p1, p0, LBo7;->a:LIm9;

    invoke-virtual {p1, v0}, LIm9;->r(LPu9;)LIm9;

    return-object p0
.end method

.method public final zza()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LBo7;->a:LIm9;

    invoke-virtual {v0}, LZt7;->l()Leu7;

    move-result-object v0

    check-cast v0, LOm9;

    invoke-virtual {v0}, LOm9;->G()LRu9;

    move-result-object v0

    invoke-virtual {v0}, LRu9;->G()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LRu9;->G()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "NA"

    return-object v0
.end method
