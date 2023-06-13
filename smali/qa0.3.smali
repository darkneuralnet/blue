.class public final Lqa0;
.super Lpa0;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpa0;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lqa0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpa0;

    invoke-virtual {v1}, Lpa0;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Lxa0;)V
    .locals 2

    iget-object v0, p0, Lqa0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpa0;

    invoke-virtual {v1, p1}, Lpa0;->b(Lxa0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Lra0;)V
    .locals 2

    iget-object v0, p0, Lqa0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpa0;

    invoke-virtual {v1, p1}, Lpa0;->c(Lra0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpa0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqa0;->a:Ljava/util/List;

    return-object v0
.end method
