.class public Le9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements LGB0;


# instance fields
.field public b:D

.field public c:D

.field public d:D

.field public e:D

.field public f:D

.field public g:D


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Le9;->h()Le9;

    return-void
.end method

.method public static f(DDD)Le9;
    .locals 8

    invoke-static {p0, p1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    invoke-static {p0, p1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    move-wide v4, p2

    move-wide v6, p4

    invoke-static/range {v0 .. v7}, Le9;->g(DDDD)Le9;

    move-result-object p0

    return-object p0
.end method

.method public static g(DDDD)Le9;
    .locals 10

    new-instance v9, Le9;

    invoke-direct {v9}, Le9;-><init>()V

    move-object v0, v9

    move-wide v1, p0

    move-wide v3, p2

    move-wide v5, p4

    move-wide/from16 v7, p6

    invoke-virtual/range {v0 .. v8}, Le9;->j(DDDD)Le9;

    return-object v9
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    invoke-static {}, LKo;->e()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public d(LEB0;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Le9;->k(LEB0;I)V

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Le9;

    if-nez v1, :cond_1

    return v0

    :cond_1
    check-cast p1, Le9;

    iget-wide v1, p0, Le9;->b:D

    iget-wide v3, p1, Le9;->b:D

    cmpl-double v1, v1, v3

    if-nez v1, :cond_2

    iget-wide v1, p0, Le9;->c:D

    iget-wide v3, p1, Le9;->c:D

    cmpl-double v1, v1, v3

    if-nez v1, :cond_2

    iget-wide v1, p0, Le9;->d:D

    iget-wide v3, p1, Le9;->d:D

    cmpl-double v1, v1, v3

    if-nez v1, :cond_2

    iget-wide v1, p0, Le9;->e:D

    iget-wide v3, p1, Le9;->e:D

    cmpl-double v1, v1, v3

    if-nez v1, :cond_2

    iget-wide v1, p0, Le9;->f:D

    iget-wide v3, p1, Le9;->f:D

    cmpl-double v1, v1, v3

    if-nez v1, :cond_2

    iget-wide v1, p0, Le9;->g:D

    iget-wide v3, p1, Le9;->g:D

    cmpl-double p1, v1, v3

    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public h()Le9;
    .locals 4

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Le9;->b:D

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Le9;->c:D

    iput-wide v2, p0, Le9;->d:D

    iput-wide v2, p0, Le9;->e:D

    iput-wide v0, p0, Le9;->f:D

    iput-wide v2, p0, Le9;->g:D

    return-object p0
.end method

.method public hashCode()I
    .locals 7

    iget-wide v0, p0, Le9;->b:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v0, v0

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    iget-wide v3, p0, Le9;->c:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    mul-int/2addr v0, v1

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v0, v3

    iget-wide v3, p0, Le9;->d:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    mul-int/2addr v0, v1

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v0, v3

    iget-wide v3, p0, Le9;->e:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    mul-int/2addr v0, v1

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v0, v3

    iget-wide v3, p0, Le9;->f:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    mul-int/2addr v0, v1

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v0, v3

    iget-wide v3, p0, Le9;->g:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    mul-int/2addr v0, v1

    ushr-long v1, v3, v2

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isDone()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j(DDDD)Le9;
    .locals 4

    iput-wide p3, p0, Le9;->b:D

    neg-double v0, p1

    iput-wide v0, p0, Le9;->c:D

    mul-double v0, p5, p3

    sub-double v0, p5, v0

    mul-double v2, p7, p1

    add-double/2addr v0, v2

    iput-wide v0, p0, Le9;->d:D

    iput-wide p1, p0, Le9;->e:D

    iput-wide p3, p0, Le9;->f:D

    mul-double/2addr p5, p1

    sub-double p1, p7, p5

    mul-double/2addr p7, p3

    sub-double/2addr p1, p7

    iput-wide p1, p0, Le9;->g:D

    return-object p0
.end method

.method public k(LEB0;I)V
    .locals 10

    iget-wide v0, p0, Le9;->b:D

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2}, LEB0;->a3(II)D

    move-result-wide v3

    mul-double/2addr v0, v3

    iget-wide v3, p0, Le9;->c:D

    const/4 v5, 0x1

    invoke-interface {p1, p2, v5}, LEB0;->a3(II)D

    move-result-wide v6

    mul-double/2addr v3, v6

    add-double/2addr v0, v3

    iget-wide v3, p0, Le9;->d:D

    add-double/2addr v0, v3

    iget-wide v3, p0, Le9;->e:D

    invoke-interface {p1, p2, v2}, LEB0;->a3(II)D

    move-result-wide v6

    mul-double/2addr v3, v6

    iget-wide v6, p0, Le9;->f:D

    invoke-interface {p1, p2, v5}, LEB0;->a3(II)D

    move-result-wide v8

    mul-double/2addr v6, v8

    add-double/2addr v3, v6

    iget-wide v6, p0, Le9;->g:D

    add-double/2addr v3, v6

    invoke-interface {p1, p2, v2, v0, v1}, LEB0;->y1(IID)V

    invoke-interface {p1, p2, v5, v3, v4}, LEB0;->y1(IID)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AffineTransformation[["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Le9;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Le9;->c:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Le9;->d:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, "], ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Le9;->e:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Le9;->f:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Le9;->g:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "]]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
