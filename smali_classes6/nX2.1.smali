.class public LnX2;
.super LoX2$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LoX2$g<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LmX2;

.field public final synthetic e:LmX2;


# virtual methods
.method public a()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LnX2;->d:LmX2;

    invoke-interface {v0}, LmX2;->F2()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LnX2;->e:LmX2;

    invoke-interface {v1}, LmX2;->F2()Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Ldw5;->m(Ljava/util/Set;Ljava/util/Set;)Ldw5$e;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LnX2;->d:LmX2;

    invoke-interface {v0, p1}, LmX2;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LnX2;->e:LmX2;

    invoke-interface {v0, p1}, LmX2;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public d3(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, LnX2;->d:LmX2;

    invoke-interface {v0, p1}, LmX2;->d3(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LnX2;->e:LmX2;

    invoke-interface {v1, p1}, LmX2;->d3(Ljava/lang/Object;)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public e()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public f()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LmX2$a<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LnX2;->d:LmX2;

    invoke-interface {v0}, LmX2;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget-object v1, p0, LnX2;->e:LmX2;

    invoke-interface {v1}, LmX2;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    new-instance v2, LnX2$a;

    invoke-direct {v2, p0, v0, v1}, LnX2$a;-><init>(LnX2;Ljava/util/Iterator;Ljava/util/Iterator;)V

    return-object v2
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LnX2;->d:LmX2;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LnX2;->e:LmX2;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
