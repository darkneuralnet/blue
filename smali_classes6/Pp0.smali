.class public LPp0;
.super LNp0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LNp0<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public transient g:[I

.field public transient h:[I

.field public transient i:I

.field public transient j:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LNp0;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LNp0;-><init>(I)V

    return-void
.end method

.method public static O(I)LPp0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I)",
            "LPp0<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LPp0;

    invoke-direct {v0, p0}, LPp0;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public A(ILjava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;II)V"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, LNp0;->A(ILjava/lang/Object;II)V

    iget p2, p0, LPp0;->j:I

    invoke-virtual {p0, p2, p1}, LPp0;->U(II)V

    const/4 p2, -0x2

    invoke-virtual {p0, p1, p2}, LPp0;->U(II)V

    return-void
.end method

.method public C(II)V
    .locals 2

    invoke-virtual {p0}, LNp0;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-super {p0, p1, p2}, LNp0;->C(II)V

    invoke-virtual {p0, p1}, LPp0;->Q(I)I

    move-result p2

    invoke-virtual {p0, p1}, LPp0;->w(I)I

    move-result v1

    invoke-virtual {p0, p2, v1}, LPp0;->U(II)V

    if-ge p1, v0, :cond_0

    invoke-virtual {p0, v0}, LPp0;->Q(I)I

    move-result p2

    invoke-virtual {p0, p2, p1}, LPp0;->U(II)V

    invoke-virtual {p0, v0}, LPp0;->w(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, LPp0;->U(II)V

    :cond_0
    invoke-virtual {p0}, LPp0;->R()[I

    move-result-object p1

    const/4 p2, 0x0

    aput p2, p1, v0

    invoke-virtual {p0}, LPp0;->S()[I

    move-result-object p1

    aput p2, p1, v0

    return-void
.end method

.method public I(I)V
    .locals 1

    invoke-super {p0, p1}, LNp0;->I(I)V

    invoke-virtual {p0}, LPp0;->R()[I

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, LPp0;->g:[I

    invoke-virtual {p0}, LPp0;->S()[I

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    iput-object p1, p0, LPp0;->h:[I

    return-void
.end method

.method public final Q(I)I
    .locals 1

    invoke-virtual {p0}, LPp0;->R()[I

    move-result-object v0

    aget p1, v0, p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final R()[I
    .locals 1

    iget-object v0, p0, LPp0;->g:[I

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [I

    return-object v0
.end method

.method public final S()[I
    .locals 1

    iget-object v0, p0, LPp0;->h:[I

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [I

    return-object v0
.end method

.method public final T(II)V
    .locals 1

    invoke-virtual {p0}, LPp0;->R()[I

    move-result-object v0

    add-int/lit8 p2, p2, 0x1

    aput p2, v0, p1

    return-void
.end method

.method public final U(II)V
    .locals 1

    const/4 v0, -0x2

    if-ne p1, v0, :cond_0

    iput p2, p0, LPp0;->i:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, LPp0;->V(II)V

    :goto_0
    if-ne p2, v0, :cond_1

    iput p1, p0, LPp0;->j:I

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p2, p1}, LPp0;->T(II)V

    :goto_1
    return-void
.end method

.method public final V(II)V
    .locals 1

    invoke-virtual {p0}, LPp0;->S()[I

    move-result-object v0

    add-int/lit8 p2, p2, 0x1

    aput p2, v0, p1

    return-void
.end method

.method public c(II)I
    .locals 1

    invoke-virtual {p0}, LNp0;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    move p1, p2

    :cond_0
    return p1
.end method

.method public clear()V
    .locals 3

    invoke-virtual {p0}, LNp0;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, -0x2

    iput v0, p0, LPp0;->i:I

    iput v0, p0, LPp0;->j:I

    iget-object v0, p0, LPp0;->g:[I

    if-eqz v0, :cond_1

    iget-object v1, p0, LPp0;->h:[I

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LNp0;->size()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v0, p0, LPp0;->h:[I

    invoke-virtual {p0}, LNp0;->size()I

    move-result v1

    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    :cond_1
    invoke-super {p0}, LNp0;->clear()V

    return-void
.end method

.method public e()I
    .locals 2

    invoke-super {p0}, LNp0;->e()I

    move-result v0

    new-array v1, v0, [I

    iput-object v1, p0, LPp0;->g:[I

    new-array v1, v0, [I

    iput-object v1, p0, LPp0;->h:[I

    return v0
.end method

.method public f()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0}, LNp0;->f()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, LPp0;->g:[I

    iput-object v1, p0, LPp0;->h:[I

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, LHd3;->h(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    invoke-static {p0, p1}, LHd3;->i(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public v()I
    .locals 1

    iget v0, p0, LPp0;->i:I

    return v0
.end method

.method public w(I)I
    .locals 1

    invoke-virtual {p0}, LPp0;->S()[I

    move-result-object v0

    aget p1, v0, p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public z(I)V
    .locals 0

    invoke-super {p0, p1}, LNp0;->z(I)V

    const/4 p1, -0x2

    iput p1, p0, LPp0;->i:I

    iput p1, p0, LPp0;->j:I

    return-void
.end method
