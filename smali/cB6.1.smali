.class public LcB6;
.super Liz0;
.source "SourceFile"


# instance fields
.field public V0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Liz0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Liz0;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LcB6;->V0:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public c(Liz0;)V
    .locals 1

    iget-object v0, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Liz0;->M()Liz0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Liz0;->M()Liz0;

    move-result-object v0

    check-cast v0, LcB6;

    invoke-virtual {v0, p1}, LcB6;->x1(Liz0;)V

    :cond_0
    invoke-virtual {p1, p0}, Liz0;->g1(Liz0;)V

    return-void
.end method

.method public v0()V
    .locals 1

    iget-object v0, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0}, Liz0;->v0()V

    return-void
.end method

.method public v1()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Liz0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LcB6;->V0:Ljava/util/ArrayList;

    return-object v0
.end method

.method public w1()V
    .locals 4

    iget-object v0, p0, LcB6;->V0:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liz0;

    instance-of v3, v2, LcB6;

    if-eqz v3, :cond_1

    check-cast v2, LcB6;

    invoke-virtual {v2}, LcB6;->w1()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public x1(Liz0;)V
    .locals 1

    iget-object v0, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Liz0;->v0()V

    return-void
.end method

.method public y1()V
    .locals 1

    iget-object v0, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public z0(Lb80;)V
    .locals 3

    invoke-super {p0, p1}, Liz0;->z0(Lb80;)V

    iget-object v0, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liz0;

    invoke-virtual {v2, p1}, Liz0;->z0(Lb80;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
