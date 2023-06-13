.class public LiN1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LiN1$a;
    }
.end annotation


# instance fields
.field public a:LeZ3;

.field public b:D

.field public c:LUj2;


# direct methods
.method public constructor <init>(LeZ3;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LUj2;

    invoke-direct {v0}, LUj2;-><init>()V

    iput-object v0, p0, LiN1;->c:LUj2;

    iput-object p1, p0, LiN1;->a:LeZ3;

    invoke-virtual {p1}, LeZ3;->b()D

    move-result-wide v0

    iput-wide v0, p0, LiN1;->b:D

    return-void
.end method


# virtual methods
.method public a(LyB0;)LhN1;
    .locals 3

    invoke-virtual {p0, p1}, LiN1;->f(LyB0;)LyB0;

    move-result-object p1

    invoke-virtual {p0, p1}, LiN1;->d(LyB0;)LhN1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LhN1;->h()V

    return-object v0

    :cond_0
    new-instance v0, LhN1;

    iget-wide v1, p0, LiN1;->b:D

    invoke-direct {v0, p1, v1, v2}, LhN1;-><init>(LyB0;D)V

    iget-object p1, p0, LiN1;->c:LUj2;

    invoke-virtual {v0}, LhN1;->a()LyB0;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, LUj2;->c(LyB0;Ljava/lang/Object;)LSj2;

    return-object v0
.end method

.method public b([LyB0;)V
    .locals 1

    new-instance v0, LiN1$a;

    invoke-direct {v0, p1}, LiN1$a;-><init>([LyB0;)V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LyB0;

    invoke-virtual {p0, p1}, LiN1;->a(LyB0;)LhN1;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LyB0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LyB0;

    invoke-virtual {p0, v0}, LiN1;->a(LyB0;)LhN1;

    move-result-object v0

    invoke-virtual {v0}, LhN1;->h()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(LyB0;)LhN1;
    .locals 1

    iget-object v0, p0, LiN1;->c:LUj2;

    invoke-virtual {v0, p1}, LUj2;->e(LyB0;)LSj2;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, LSj2;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LhN1;

    return-object p1
.end method

.method public e(LyB0;LyB0;LTj2;)V
    .locals 3

    new-instance v0, Lsf1;

    invoke-direct {v0, p1, p2}, Lsf1;-><init>(LyB0;LyB0;)V

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    iget-wide v1, p0, LiN1;->b:D

    div-double/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Lsf1;->h(D)V

    iget-object p1, p0, LiN1;->c:LUj2;

    invoke-virtual {p1, v0, p3}, LUj2;->f(Lsf1;LTj2;)V

    return-void
.end method

.method public final f(LyB0;)LyB0;
    .locals 1

    invoke-virtual {p1}, LyB0;->e()LyB0;

    move-result-object p1

    iget-object v0, p0, LiN1;->a:LeZ3;

    invoke-virtual {v0, p1}, LeZ3;->f(LyB0;)V

    return-object p1
.end method
