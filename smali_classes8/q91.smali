.class public Lq91;
.super LSD1;
.source "SourceFile"


# instance fields
.field public f:[LyB0;

.field public g:LB91;

.field public h:Ljava/lang/String;

.field public i:LEV2;

.field public j:Z

.field public k:Lr01;

.field public l:I


# direct methods
.method public constructor <init>([LyB0;LSl2;)V
    .locals 1

    invoke-direct {p0}, LSD1;-><init>()V

    new-instance v0, LB91;

    invoke-direct {v0, p0}, LB91;-><init>(Lq91;)V

    iput-object v0, p0, Lq91;->g:LB91;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq91;->j:Z

    new-instance v0, Lr01;

    invoke-direct {v0}, Lr01;-><init>()V

    iput-object v0, p0, Lq91;->k:Lr01;

    const/4 v0, 0x0

    iput v0, p0, Lq91;->l:I

    iput-object p1, p0, Lq91;->f:[LyB0;

    iput-object p2, p0, LSD1;->a:LSl2;

    return-void
.end method

.method public static x(LSl2;LP62;)V
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, LSl2;->e(II)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2, v0}, LSl2;->e(II)I

    move-result v3

    invoke-virtual {p1, v1, v3, v2}, LP62;->q(III)V

    invoke-virtual {p0}, LSl2;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0, v2}, LSl2;->e(II)I

    move-result v1

    invoke-virtual {p0, v2, v2}, LSl2;->e(II)I

    move-result v3

    const/4 v4, 0x2

    invoke-virtual {p1, v1, v3, v4}, LP62;->q(III)V

    invoke-virtual {p0, v0, v4}, LSl2;->e(II)I

    move-result v0

    invoke-virtual {p0, v2, v4}, LSl2;->e(II)I

    move-result p0

    invoke-virtual {p1, v0, p0, v4}, LP62;->q(III)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(LP62;)V
    .locals 1

    iget-object v0, p0, LSD1;->a:LSl2;

    invoke-static {v0, p1}, Lq91;->x(LSl2;LP62;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8

    instance-of v0, p1, Lq91;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lq91;

    iget-object v0, p0, Lq91;->f:[LyB0;

    array-length v2, v0

    iget-object v3, p1, Lq91;->f:[LyB0;

    array-length v3, v3

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    array-length v0, v0

    const/4 v2, 0x1

    move v3, v1

    move v4, v2

    move v5, v4

    :goto_0
    iget-object v6, p0, Lq91;->f:[LyB0;

    array-length v7, v6

    if-ge v3, v7, :cond_5

    aget-object v6, v6, v3

    iget-object v7, p1, Lq91;->f:[LyB0;

    aget-object v7, v7, v3

    invoke-virtual {v6, v7}, LyB0;->g(LyB0;)Z

    move-result v6

    if-nez v6, :cond_2

    move v4, v1

    :cond_2
    iget-object v6, p0, Lq91;->f:[LyB0;

    aget-object v6, v6, v3

    iget-object v7, p1, Lq91;->f:[LyB0;

    add-int/lit8 v0, v0, -0x1

    aget-object v7, v7, v0

    invoke-virtual {v6, v7}, LyB0;->g(LyB0;)Z

    move-result v6

    if-nez v6, :cond_3

    move v5, v1

    :cond_3
    if-nez v4, :cond_4

    if-nez v5, :cond_4

    return v1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return v2
.end method

.method public hashCode()I
    .locals 7

    iget-object v0, p0, Lq91;->f:[LyB0;

    array-length v1, v0

    const/16 v2, 0x1f

    add-int/2addr v1, v2

    array-length v3, v0

    if-lez v3, :cond_1

    const/4 v3, 0x0

    aget-object v4, v0, v3

    array-length v5, v0

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    aget-object v0, v0, v5

    invoke-virtual {v4, v0}, LyB0;->d(LyB0;)I

    move-result v5

    if-ne v6, v5, :cond_0

    iget-object v0, p0, Lq91;->f:[LyB0;

    array-length v4, v0

    sub-int/2addr v4, v6

    aget-object v4, v0, v4

    aget-object v0, v0, v3

    :cond_0
    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v4}, LyB0;->hashCode()I

    move-result v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    invoke-virtual {v0}, LyB0;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    :cond_1
    return v1
.end method

.method public i(Lsr2;III)V
    .locals 3

    new-instance v0, LyB0;

    invoke-virtual {p1, p4}, Lsr2;->f(I)LyB0;

    move-result-object v1

    invoke-direct {v0, v1}, LyB0;-><init>(LyB0;)V

    invoke-virtual {p1, p3, p4}, Lsr2;->e(II)D

    move-result-wide p3

    add-int/lit8 p1, p2, 0x1

    iget-object v1, p0, Lq91;->f:[LyB0;

    array-length v2, v1

    if-ge p1, v2, :cond_0

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, LyB0;->g(LyB0;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide/16 p3, 0x0

    move p2, p1

    :cond_0
    iget-object p1, p0, Lq91;->g:LB91;

    invoke-virtual {p1, v0, p2, p3, p4}, LB91;->a(LyB0;ID)LA91;

    return-void
.end method

.method public j(Lsr2;II)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lsr2;->g()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, p1, p2, p3, v0}, Lq91;->i(Lsr2;III)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k()Lq91;
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [LyB0;

    iget-object v1, p0, Lq91;->f:[LyB0;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    aput-object v3, v0, v2

    const/4 v2, 0x1

    aget-object v1, v1, v2

    aput-object v1, v0, v2

    new-instance v1, Lq91;

    iget-object v2, p0, LSD1;->a:LSl2;

    invoke-static {v2}, LSl2;->q(LSl2;)LSl2;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lq91;-><init>([LyB0;LSl2;)V

    return-object v1
.end method

.method public l()LyB0;
    .locals 2

    iget-object v0, p0, Lq91;->f:[LyB0;

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public m(I)LyB0;
    .locals 1

    iget-object v0, p0, Lq91;->f:[LyB0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public n()[LyB0;
    .locals 1

    iget-object v0, p0, Lq91;->f:[LyB0;

    return-object v0
.end method

.method public o()Lr01;
    .locals 1

    iget-object v0, p0, Lq91;->k:Lr01;

    return-object v0
.end method

.method public p()LB91;
    .locals 1

    iget-object v0, p0, Lq91;->g:LB91;

    return-object v0
.end method

.method public q()LEV2;
    .locals 1

    iget-object v0, p0, Lq91;->i:LEV2;

    if-nez v0, :cond_0

    new-instance v0, LEV2;

    invoke-direct {v0, p0}, LEV2;-><init>(Lq91;)V

    iput-object v0, p0, Lq91;->i:LEV2;

    :cond_0
    iget-object v0, p0, Lq91;->i:LEV2;

    return-object v0
.end method

.method public r()I
    .locals 1

    iget-object v0, p0, Lq91;->f:[LyB0;

    array-length v0, v0

    return v0
.end method

.method public s()Z
    .locals 3

    iget-object v0, p0, Lq91;->f:[LyB0;

    const/4 v1, 0x0

    aget-object v1, v0, v1

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public t()Z
    .locals 4

    iget-object v0, p0, LSD1;->a:LSl2;

    invoke-virtual {v0}, LSl2;->g()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lq91;->f:[LyB0;

    array-length v2, v0

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    aget-object v2, v0, v1

    const/4 v3, 0x2

    aget-object v0, v0, v3

    invoke-virtual {v2, v0}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "edge "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lq91;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "LINESTRING ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lq91;->f:[LyB0;

    array-length v2, v2

    const-string v3, " "

    if-ge v1, v2, :cond_1

    if-lez v1, :cond_0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lq91;->f:[LyB0;

    aget-object v4, v4, v1

    iget-wide v4, v4, LyB0;->b:D

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lq91;->f:[LyB0;

    aget-object v3, v3, v1

    iget-wide v3, v3, LyB0;->c:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ")  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LSD1;->a:LSl2;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lq91;->l:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lq91;->j:Z

    return v0
.end method

.method public v(Lq91;)Z
    .locals 4

    iget-object v0, p0, Lq91;->f:[LyB0;

    array-length v0, v0

    iget-object v1, p1, Lq91;->f:[LyB0;

    array-length v1, v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    move v0, v2

    :goto_0
    iget-object v1, p0, Lq91;->f:[LyB0;

    array-length v3, v1

    if-ge v0, v3, :cond_2

    aget-object v1, v1, v0

    iget-object v3, p1, Lq91;->f:[LyB0;

    aget-object v3, v3, v0

    invoke-virtual {v1, v3}, LyB0;->g(LyB0;)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public w(Z)V
    .locals 0

    iput-boolean p1, p0, Lq91;->j:Z

    return-void
.end method
