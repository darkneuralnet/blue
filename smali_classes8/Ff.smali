.class public final LFf;
.super Lu1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Q:",
        "Ljava/lang/Object;",
        ">",
        "Lu1<",
        "TQ;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4ec6d827a3955c30L


# instance fields
.field public final f:LSd6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LSd6<",
            "TQ;>;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/String;


# virtual methods
.method public F()LV31;
    .locals 1

    iget-object v0, p0, LFf;->f:LSd6;

    invoke-interface {v0}, LSd6;->F()LV31;

    move-result-object v0

    return-object v0
.end method

.method public J()LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    iget-object v0, p0, LFf;->f:LSd6;

    invoke-interface {v0}, LSd6;->G()LSd6;

    move-result-object v0

    return-object v0
.end method

.method public L()LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    iget-object v0, p0, LFf;->f:LSd6;

    return-object v0
.end method

.method public M()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFf;->g:Ljava/lang/String;

    return-object v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFf;->f:LSd6;

    invoke-interface {v0}, LSd6;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b0()Lae6;
    .locals 1

    iget-object v0, p0, LFf;->f:LSd6;

    check-cast v0, Lu1;

    invoke-interface {v0}, LRp0;->b0()Lae6;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LFf;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, LFf;

    iget-object v1, p0, LFf;->f:LSd6;

    iget-object v3, p1, LFf;->f:LSd6;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LFf;->g:Ljava/lang/String;

    iget-object p1, p1, LFf;->g:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LFf;->f:LSd6;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LFf;->g:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public l()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "+",
            "LSd6<",
            "*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LFf;->f:LSd6;

    invoke-interface {v0}, LSd6;->l()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
