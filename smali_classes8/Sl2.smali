.class public LSl2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[LQ56;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [LQ56;

    iput-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    invoke-direct {v1, p1}, LQ56;-><init>(I)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    invoke-direct {v1, p1}, LQ56;-><init>(I)V

    const/4 p1, 0x1

    aput-object v1, v0, p1

    return-void
.end method

.method public constructor <init>(II)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [LQ56;

    iput-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    const/4 v2, -0x1

    invoke-direct {v1, v2}, LQ56;-><init>(I)V

    const/4 v3, 0x0

    aput-object v1, v0, v3

    iget-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    invoke-direct {v1, v2}, LQ56;-><init>(I)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2}, LQ56;->l(I)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [LQ56;

    iput-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    invoke-direct {v1, p1, p2, p3}, LQ56;-><init>(III)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    invoke-direct {v1, p1, p2, p3}, LQ56;-><init>(III)V

    const/4 p1, 0x1

    aput-object v1, v0, p1

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [LQ56;

    iput-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2, v2}, LQ56;-><init>(III)V

    const/4 v3, 0x0

    aput-object v1, v0, v3

    iget-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    invoke-direct {v1, v2, v2, v2}, LQ56;-><init>(III)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2, p3, p4}, LQ56;->n(III)V

    return-void
.end method

.method public constructor <init>(LSl2;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [LQ56;

    iput-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    iget-object v2, p1, LSl2;->a:[LQ56;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-direct {v1, v2}, LQ56;-><init>(LQ56;)V

    aput-object v1, v0, v3

    iget-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    iget-object p1, p1, LSl2;->a:[LQ56;

    const/4 v2, 0x1

    aget-object p1, p1, v2

    invoke-direct {v1, p1}, LQ56;-><init>(LQ56;)V

    aput-object v1, v0, v2

    return-void
.end method

.method public static q(LSl2;)LSl2;
    .locals 3

    new-instance v0, LSl2;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, LSl2;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v1}, LSl2;->d(I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, LSl2;->n(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(II)Z
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2}, LQ56;->a(I)Z

    move-result p1

    return p1
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, LSl2;->a:[LQ56;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, LQ56;->b()V

    iget-object v0, p0, LSl2;->a:[LQ56;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, LQ56;->b()V

    return-void
.end method

.method public c()I
    .locals 3

    iget-object v0, p0, LSl2;->a:[LQ56;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, LQ56;->h()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-object v2, p0, LSl2;->a:[LQ56;

    aget-object v1, v2, v1

    invoke-virtual {v1}, LQ56;->h()Z

    move-result v1

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    return v0
.end method

.method public d(I)I
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LQ56;->c(I)I

    move-result p1

    return p1
.end method

.method public e(II)I
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2}, LQ56;->c(I)I

    move-result p1

    return p1
.end method

.method public f(I)Z
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1}, LQ56;->e()Z

    move-result p1

    return p1
.end method

.method public g()Z
    .locals 3

    iget-object v0, p0, LSl2;->a:[LQ56;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, LQ56;->f()Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object v0, v0, v2

    invoke-virtual {v0}, LQ56;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v1, v2

    :cond_1
    return v1
.end method

.method public h(I)Z
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1}, LQ56;->f()Z

    move-result p1

    return p1
.end method

.method public i(I)Z
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1}, LQ56;->g()Z

    move-result p1

    return p1
.end method

.method public j(I)Z
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1}, LQ56;->h()Z

    move-result p1

    return p1
.end method

.method public k(LSl2;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LSl2;->a:[LQ56;

    aget-object v2, v1, v0

    if-nez v2, :cond_0

    iget-object v3, p1, LSl2;->a:[LQ56;

    aget-object v3, v3, v0

    if-eqz v3, :cond_0

    new-instance v2, LQ56;

    invoke-direct {v2, v3}, LQ56;-><init>(LQ56;)V

    aput-object v2, v1, v0

    goto :goto_1

    :cond_0
    iget-object v1, p1, LSl2;->a:[LQ56;

    aget-object v1, v1, v0

    invoke-virtual {v2, v1}, LQ56;->i(LQ56;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public l(II)V
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2}, LQ56;->j(I)V

    return-void
.end method

.method public m(II)V
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2}, LQ56;->k(I)V

    return-void
.end method

.method public n(II)V
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, LQ56;->m(II)V

    return-void
.end method

.method public o(III)V
    .locals 1

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2, p3}, LQ56;->m(II)V

    return-void
.end method

.method public p(I)V
    .locals 4

    iget-object v0, p0, LSl2;->a:[LQ56;

    aget-object v0, v0, p1

    invoke-virtual {v0}, LQ56;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LSl2;->a:[LQ56;

    new-instance v1, LQ56;

    aget-object v2, v0, p1

    iget-object v2, v2, LQ56;->a:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    invoke-direct {v1, v2}, LQ56;-><init>(I)V

    aput-object v1, v0, p1

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v1, p0, LSl2;->a:[LQ56;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    if-eqz v1, :cond_0

    const-string v1, "A:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, LSl2;->a:[LQ56;

    aget-object v1, v1, v2

    invoke-virtual {v1}, LQ56;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    iget-object v1, p0, LSl2;->a:[LQ56;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    if-eqz v1, :cond_1

    const-string v1, " B:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, LSl2;->a:[LQ56;

    aget-object v1, v1, v2

    invoke-virtual {v1}, LQ56;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
