.class public LFE1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LyB0;

.field public b:LFE1;

.field public c:LFE1;


# direct methods
.method public constructor <init>(LyB0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFE1;->a:LyB0;

    return-void
.end method


# virtual methods
.method public a(LFE1;)I
    .locals 9

    invoke-virtual {p0}, LFE1;->f()D

    move-result-wide v0

    invoke-virtual {p0}, LFE1;->g()D

    move-result-wide v2

    invoke-virtual {p1}, LFE1;->f()D

    move-result-wide v4

    invoke-virtual {p1}, LFE1;->g()D

    move-result-wide v6

    cmpl-double v8, v0, v4

    if-nez v8, :cond_0

    cmpl-double v8, v2, v6

    if-nez v8, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {v0, v1, v2, v3}, Lxb4;->a(DD)I

    move-result v0

    invoke-static {v4, v5, v6, v7}, Lxb4;->a(DD)I

    move-result v1

    if-le v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    if-ge v0, v1, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    invoke-virtual {p0}, LFE1;->e()LyB0;

    move-result-object v0

    invoke-virtual {p1}, LFE1;->e()LyB0;

    move-result-object v1

    iget-object p1, p1, LFE1;->a:LyB0;

    invoke-static {p1, v1, v0}, LDy3;->a(LyB0;LyB0;LyB0;)I

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LFE1;

    invoke-virtual {p0, p1}, LFE1;->a(LFE1;)I

    move-result p1

    return p1
.end method

.method public c()I
    .locals 2

    const/4 v0, 0x0

    move-object v1, p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1}, LFE1;->l()LFE1;

    move-result-object v1

    if-ne v1, p0, :cond_0

    return v0
.end method

.method public d()LyB0;
    .locals 1

    iget-object v0, p0, LFE1;->b:LFE1;

    iget-object v0, v0, LFE1;->a:LyB0;

    return-object v0
.end method

.method public e()LyB0;
    .locals 1

    invoke-virtual {p0}, LFE1;->d()LyB0;

    move-result-object v0

    return-object v0
.end method

.method public f()D
    .locals 4

    invoke-virtual {p0}, LFE1;->e()LyB0;

    move-result-object v0

    invoke-virtual {v0}, LyB0;->k()D

    move-result-wide v0

    iget-object v2, p0, LFE1;->a:LyB0;

    invoke-virtual {v2}, LyB0;->k()D

    move-result-wide v2

    sub-double/2addr v0, v2

    return-wide v0
.end method

.method public g()D
    .locals 4

    invoke-virtual {p0}, LFE1;->e()LyB0;

    move-result-object v0

    invoke-virtual {v0}, LyB0;->l()D

    move-result-wide v0

    iget-object v2, p0, LFE1;->a:LyB0;

    invoke-virtual {v2}, LyB0;->l()D

    move-result-wide v2

    sub-double/2addr v0, v2

    return-wide v0
.end method

.method public h(LFE1;)V
    .locals 1

    invoke-virtual {p0}, LFE1;->l()LFE1;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-virtual {p0, p1}, LFE1;->i(LFE1;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LFE1;->j(LFE1;)LFE1;

    move-result-object v0

    invoke-virtual {v0, p1}, LFE1;->i(LFE1;)V

    return-void
.end method

.method public final i(LFE1;)V
    .locals 2

    iget-object v0, p0, LFE1;->a:LyB0;

    invoke-virtual {p1}, LFE1;->m()LyB0;

    move-result-object v1

    invoke-static {v0, v1}, LKo;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, LFE1;->l()LFE1;

    move-result-object v0

    iget-object v1, p0, LFE1;->b:LFE1;

    invoke-virtual {v1, p1}, LFE1;->n(LFE1;)V

    invoke-virtual {p1}, LFE1;->p()LFE1;

    move-result-object p1

    invoke-virtual {p1, v0}, LFE1;->n(LFE1;)V

    return-void
.end method

.method public final j(LFE1;)LFE1;
    .locals 3

    move-object v0, p0

    :goto_0
    invoke-virtual {v0}, LFE1;->l()LFE1;

    move-result-object v1

    invoke-virtual {v1, v0}, LFE1;->b(Ljava/lang/Object;)I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {p1, v0}, LFE1;->b(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_0

    invoke-virtual {p1, v1}, LFE1;->b(Ljava/lang/Object;)I

    move-result v2

    if-gtz v2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v1, v0}, LFE1;->b(Ljava/lang/Object;)I

    move-result v2

    if-gtz v2, :cond_2

    invoke-virtual {p1, v1}, LFE1;->b(Ljava/lang/Object;)I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {p1, v0}, LFE1;->b(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_2

    :cond_1
    return-object v0

    :cond_2
    if-ne v1, p0, :cond_3

    invoke-static {}, LKo;->e()V

    const/4 p1, 0x0

    return-object p1

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method public k(LFE1;)V
    .locals 0

    invoke-virtual {p0, p1}, LFE1;->o(LFE1;)V

    invoke-virtual {p1, p0}, LFE1;->o(LFE1;)V

    invoke-virtual {p0, p1}, LFE1;->n(LFE1;)V

    invoke-virtual {p1, p0}, LFE1;->n(LFE1;)V

    return-void
.end method

.method public l()LFE1;
    .locals 1

    iget-object v0, p0, LFE1;->b:LFE1;

    iget-object v0, v0, LFE1;->c:LFE1;

    return-object v0
.end method

.method public m()LyB0;
    .locals 1

    iget-object v0, p0, LFE1;->a:LyB0;

    return-object v0
.end method

.method public final n(LFE1;)V
    .locals 0

    iput-object p1, p0, LFE1;->c:LFE1;

    return-void
.end method

.method public final o(LFE1;)V
    .locals 0

    iput-object p1, p0, LFE1;->b:LFE1;

    return-void
.end method

.method public p()LFE1;
    .locals 1

    iget-object v0, p0, LFE1;->b:LFE1;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HE("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LFE1;->a:LyB0;

    iget-wide v1, v1, LyB0;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LFE1;->a:LyB0;

    iget-wide v2, v2, LyB0;->c:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LFE1;->b:LFE1;

    iget-object v2, v2, LFE1;->a:LyB0;

    iget-wide v2, v2, LyB0;->b:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LFE1;->b:LFE1;

    iget-object v1, v1, LFE1;->a:LyB0;

    iget-wide v1, v1, LyB0;->c:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
