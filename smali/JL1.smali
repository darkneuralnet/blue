.class public LJL1;
.super Liz0;
.source "SourceFile"

# interfaces
.implements LHL1;


# instance fields
.field public V0:[Liz0;

.field public W0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Liz0;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Liz0;

    iput-object v0, p0, LJL1;->V0:[Liz0;

    const/4 v0, 0x0

    iput v0, p0, LJL1;->W0:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LJL1;->W0:I

    iget-object v0, p0, LJL1;->V0:[Liz0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljz0;)V
    .locals 0

    return-void
.end method

.method public c(Liz0;)V
    .locals 3

    if-eq p1, p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, LJL1;->W0:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LJL1;->V0:[Liz0;

    array-length v2, v1

    if-le v0, v2, :cond_1

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Liz0;

    iput-object v0, p0, LJL1;->V0:[Liz0;

    :cond_1
    iget-object v0, p0, LJL1;->V0:[Liz0;

    iget v1, p0, LJL1;->W0:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LJL1;->W0:I

    :cond_2
    :goto_0
    return-void
.end method

.method public n(Liz0;Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liz0;",
            "Ljava/util/HashMap<",
            "Liz0;",
            "Liz0;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Liz0;->n(Liz0;Ljava/util/HashMap;)V

    check-cast p1, LJL1;

    const/4 v0, 0x0

    iput v0, p0, LJL1;->W0:I

    iget v1, p1, LJL1;->W0:I

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p1, LJL1;->V0:[Liz0;

    aget-object v2, v2, v0

    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liz0;

    invoke-virtual {p0, v2}, LJL1;->c(Liz0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public v1(Ljava/util/ArrayList;ILeB6;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "LeB6;",
            ">;I",
            "LeB6;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, LJL1;->W0:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, LJL1;->V0:[Liz0;

    aget-object v2, v2, v1

    invoke-virtual {p3, v2}, LeB6;->a(Liz0;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget v1, p0, LJL1;->W0:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LJL1;->V0:[Liz0;

    aget-object v1, v1, v0

    invoke-static {v1, p2, p1, p3}, LmE1;->a(Liz0;ILjava/util/ArrayList;LeB6;)LeB6;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public w1(I)I
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LJL1;->W0:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, LJL1;->V0:[Liz0;

    aget-object v1, v1, v0

    if-nez p1, :cond_0

    iget v3, v1, Liz0;->S0:I

    if-eq v3, v2, :cond_0

    return v3

    :cond_0
    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    iget v1, v1, Liz0;->T0:I

    if-eq v1, v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method
