.class public LSj2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LyB0;

.field public b:Ljava/lang/Object;

.field public c:LSj2;

.field public d:LSj2;

.field public e:I


# direct methods
.method public constructor <init>(LyB0;Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LSj2;->a:LyB0;

    new-instance v1, LyB0;

    invoke-direct {v1, p1}, LyB0;-><init>(LyB0;)V

    iput-object v1, p0, LSj2;->a:LyB0;

    iput-object v0, p0, LSj2;->c:LSj2;

    iput-object v0, p0, LSj2;->d:LSj2;

    const/4 p1, 0x1

    iput p1, p0, LSj2;->e:I

    iput-object p2, p0, LSj2;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()LyB0;
    .locals 1

    iget-object v0, p0, LSj2;->a:LyB0;

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSj2;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public c()LSj2;
    .locals 1

    iget-object v0, p0, LSj2;->c:LSj2;

    return-object v0
.end method

.method public d()LSj2;
    .locals 1

    iget-object v0, p0, LSj2;->d:LSj2;

    return-object v0
.end method

.method public e()V
    .locals 1

    iget v0, p0, LSj2;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LSj2;->e:I

    return-void
.end method

.method public f(ZLyB0;)Z
    .locals 2

    if-eqz p1, :cond_0

    iget-wide v0, p2, LyB0;->b:D

    goto :goto_0

    :cond_0
    iget-wide v0, p2, LyB0;->c:D

    :goto_0
    invoke-virtual {p0, p1}, LSj2;->k(Z)D

    move-result-wide p1

    cmpg-double p1, v0, p1

    if-gez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public g(ZLsf1;)Z
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lsf1;->p()D

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lsf1;->q()D

    move-result-wide v0

    :goto_0
    invoke-virtual {p0, p1}, LSj2;->k(Z)D

    move-result-wide p1

    cmpg-double p1, v0, p1

    if-gez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public h(ZLsf1;)Z
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lsf1;->n()D

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lsf1;->o()D

    move-result-wide v0

    :goto_0
    invoke-virtual {p0, p1}, LSj2;->k(Z)D

    move-result-wide p1

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public i(LSj2;)V
    .locals 0

    iput-object p1, p0, LSj2;->c:LSj2;

    return-void
.end method

.method public j(LSj2;)V
    .locals 0

    iput-object p1, p0, LSj2;->d:LSj2;

    return-void
.end method

.method public k(Z)D
    .locals 2

    if-eqz p1, :cond_0

    iget-object p1, p0, LSj2;->a:LyB0;

    invoke-virtual {p1}, LyB0;->k()D

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object p1, p0, LSj2;->a:LyB0;

    invoke-virtual {p1}, LyB0;->l()D

    move-result-wide v0

    return-wide v0
.end method
