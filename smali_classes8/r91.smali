.class public Lr91;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[LyB0;

.field public b:I

.field public c:I

.field public d:Z

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>([LyB0;LJ91;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lr91;->b:I

    const/4 v1, 0x0

    iput v1, p0, Lr91;->c:I

    iput-boolean v1, p0, Lr91;->d:Z

    iput v0, p0, Lr91;->e:I

    iput v1, p0, Lr91;->f:I

    iput-boolean v1, p0, Lr91;->g:Z

    iput-object p1, p0, Lr91;->a:[LyB0;

    invoke-virtual {p0, p2}, Lr91;->a(LJ91;)V

    return-void
.end method

.method public static c(I)I
    .locals 0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    if-gez p0, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static g(I)Z
    .locals 1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static h(IIZI)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-nez p0, :cond_0

    const-string p0, "A:"

    goto :goto_0

    :cond_0
    const-string p0, "B:"

    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LqA3;->b(I)C

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Lr91;->r(IZ)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(LqA3;IIIZ)V
    .locals 1

    invoke-static {p2, p3}, Lr91;->m(II)I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 p3, 0x3

    if-eq p2, p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p4}, LqA3;->h(IZ)V

    goto :goto_0

    :cond_1
    invoke-static {p3}, Lr91;->n(I)I

    move-result p2

    invoke-static {p3}, Lr91;->o(I)I

    move-result p3

    invoke-virtual {p0, p1, p2, p3, p4}, LqA3;->g(IIIZ)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, LqA3;->i(I)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, LqA3;->j(I)V

    :goto_0
    return-void
.end method

.method public static j([LyB0;)Z
    .locals 5

    array-length v0, p0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    aget-object v3, p0, v0

    aget-object v4, p0, v1

    invoke-virtual {v3, v4}, LyB0;->g(LyB0;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v1

    :cond_1
    array-length v3, p0

    if-le v3, v2, :cond_2

    array-length v3, p0

    sub-int/2addr v3, v1

    aget-object v3, p0, v3

    array-length v4, p0

    sub-int/2addr v4, v2

    aget-object p0, p0, v4

    invoke-virtual {v3, p0}, LyB0;->g(LyB0;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method public static k(ILr91;Lr91;)Z
    .locals 0

    invoke-virtual {p1, p0}, Lr91;->l(I)Z

    move-result p1

    invoke-virtual {p2, p0}, Lr91;->l(I)Z

    move-result p0

    const/4 p2, 0x1

    if-nez p1, :cond_1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p0, p2

    :goto_1
    xor-int/2addr p0, p2

    return p0
.end method

.method public static m(II)I
    .locals 1

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    return v0

    :cond_1
    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    const/4 p0, 0x3

    return p0

    :cond_3
    const/4 p0, 0x2

    return p0
.end method

.method public static n(I)I
    .locals 1

    invoke-static {p0}, Lr91;->c(I)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_2

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    sget p0, LqA3;->k:I

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    sget p0, LqA3;->k:I

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static o(I)I
    .locals 1

    invoke-static {p0}, Lr91;->c(I)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_2

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    sget p0, LqA3;->k:I

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    sget p0, LqA3;->k:I

    return p0

    :cond_2
    const/4 p0, 0x2

    return p0
.end method

.method public static r(IZ)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lr91;->g(I)Z

    move-result p0

    const-string v0, ""

    if-eqz p0, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LqA3;->B(Z)C

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static t([LyB0;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    aget-object v0, p0, v0

    array-length v1, p0

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    aget-object v1, p0, v1

    array-length v3, p0

    const/4 v4, 0x2

    if-le v3, v4, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p0, p0, v2

    invoke-static {p0}, Lkw6;->u(LyB0;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Lkw6;->u(LyB0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " .. "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lkw6;->u(LyB0;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LJ91;)V
    .locals 1

    invoke-virtual {p1}, LJ91;->c()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LJ91;->b()I

    move-result v0

    iput v0, p0, Lr91;->b:I

    invoke-virtual {p1}, LJ91;->d()Z

    move-result v0

    iput-boolean v0, p0, Lr91;->d:Z

    invoke-virtual {p1}, LJ91;->a()I

    move-result p1

    iput p1, p0, Lr91;->c:I

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LJ91;->b()I

    move-result v0

    iput v0, p0, Lr91;->e:I

    invoke-virtual {p1}, LJ91;->d()Z

    move-result v0

    iput-boolean v0, p0, Lr91;->g:Z

    invoke-virtual {p1}, LJ91;->a()I

    move-result p1

    iput p1, p0, Lr91;->f:I

    :goto_0
    return-void
.end method

.method public b()LqA3;
    .locals 5

    new-instance v0, LqA3;

    invoke-direct {v0}, LqA3;-><init>()V

    iget v1, p0, Lr91;->b:I

    iget v2, p0, Lr91;->c:I

    iget-boolean v3, p0, Lr91;->d:Z

    const/4 v4, 0x0

    invoke-static {v0, v4, v1, v2, v3}, Lr91;->i(LqA3;IIIZ)V

    iget v1, p0, Lr91;->e:I

    iget v2, p0, Lr91;->f:I

    iget-boolean v3, p0, Lr91;->g:Z

    const/4 v4, 0x1

    invoke-static {v0, v4, v1, v2, v3}, Lr91;->i(LqA3;IIIZ)V

    return-object v0
.end method

.method public d()Z
    .locals 8

    invoke-virtual {p0}, Lr91;->f()[LyB0;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_4

    const/4 v1, 0x0

    aget-object v3, v0, v1

    const/4 v4, 0x1

    aget-object v5, v0, v4

    array-length v6, v0

    sub-int/2addr v6, v4

    aget-object v6, v0, v6

    array-length v7, v0

    sub-int/2addr v7, v2

    aget-object v0, v0, v7

    invoke-virtual {v3, v6}, LyB0;->d(LyB0;)I

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, LyB0;->d(LyB0;)I

    move-result v0

    if-eqz v0, :cond_1

    move v2, v0

    :cond_1
    if-eqz v2, :cond_3

    const/4 v0, -0x1

    if-ne v2, v0, :cond_2

    move v1, v4

    :cond_2
    return v1

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Edge direction cannot be determined because endpoints are equal"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Edge must have >= 2 points"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(I)LyB0;
    .locals 1

    iget-object v0, p0, Lr91;->a:[LyB0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public f()[LyB0;
    .locals 1

    iget-object v0, p0, Lr91;->a:[LyB0;

    return-object v0
.end method

.method public final l(I)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-nez p1, :cond_1

    iget p1, p0, Lr91;->b:I

    if-ne p1, v2, :cond_0

    iget-boolean p1, p0, Lr91;->d:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    iget p1, p0, Lr91;->e:I

    if-ne p1, v2, :cond_2

    iget-boolean p1, p0, Lr91;->g:Z

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    return v0
.end method

.method public p(Lr91;)V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0, p0, p1}, Lr91;->k(ILr91;Lr91;)Z

    move-result v0

    iput-boolean v0, p0, Lr91;->d:Z

    const/4 v0, 0x1

    invoke-static {v0, p0, p1}, Lr91;->k(ILr91;Lr91;)Z

    move-result v1

    iput-boolean v1, p0, Lr91;->g:Z

    iget v1, p1, Lr91;->b:I

    iget v2, p0, Lr91;->b:I

    if-le v1, v2, :cond_0

    iput v1, p0, Lr91;->b:I

    :cond_0
    iget v1, p1, Lr91;->e:I

    iget v2, p0, Lr91;->e:I

    if-le v1, v2, :cond_1

    iput v1, p0, Lr91;->e:I

    :cond_1
    invoke-virtual {p0, p1}, Lr91;->q(Lr91;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    :goto_0
    iget v1, p0, Lr91;->c:I

    iget v2, p1, Lr91;->c:I

    mul-int/2addr v2, v0

    add-int/2addr v1, v2

    iput v1, p0, Lr91;->c:I

    iget v1, p0, Lr91;->f:I

    iget p1, p1, Lr91;->f:I

    mul-int/2addr v0, p1

    add-int/2addr v1, v0

    iput v1, p0, Lr91;->f:I

    return-void
.end method

.method public q(Lr91;)Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lr91;->e(I)LyB0;

    move-result-object v1

    invoke-virtual {p1, v0}, Lr91;->e(I)LyB0;

    move-result-object v2

    invoke-virtual {v1, v2}, LyB0;->g(LyB0;)Z

    move-result v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lr91;->e(I)LyB0;

    move-result-object v2

    invoke-virtual {p1, v1}, Lr91;->e(I)LyB0;

    move-result-object p1

    invoke-virtual {v2, p1}, LyB0;->g(LyB0;)Z

    move-result p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    return v1
.end method

.method public s()I
    .locals 1

    iget-object v0, p0, Lr91;->a:[LyB0;

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lr91;->a:[LyB0;

    invoke-static {v0}, Lr91;->t([LyB0;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lr91;->b:I

    iget-boolean v2, p0, Lr91;->d:Z

    iget v3, p0, Lr91;->c:I

    const/4 v4, 0x0

    invoke-static {v4, v1, v2, v3}, Lr91;->h(IIZI)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lr91;->e:I

    iget-boolean v3, p0, Lr91;->g:Z

    iget v4, p0, Lr91;->f:I

    const/4 v5, 0x1

    invoke-static {v5, v2, v3, v4}, Lr91;->h(IIZI)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Edge( "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ) "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
