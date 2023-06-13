.class public LC91;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "LC91;",
        ">;"
    }
.end annotation


# instance fields
.field public b:D

.field public c:D

.field public d:D

.field public e:D


# direct methods
.method public constructor <init>(Lr91;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, LC91;->f(Lr91;)V

    return-void
.end method

.method public static b(Lr91;)LC91;
    .locals 1

    new-instance v0, LC91;

    invoke-direct {v0, p0}, LC91;-><init>(Lr91;)V

    return-object v0
.end method

.method public static d(D)I
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p0

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method


# virtual methods
.method public a(LC91;)I
    .locals 8

    iget-wide v0, p0, LC91;->b:D

    iget-wide v2, p1, LC91;->b:D

    cmpg-double v4, v0, v2

    const/4 v5, -0x1

    if-gez v4, :cond_0

    return v5

    :cond_0
    cmpl-double v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_1

    return v1

    :cond_1
    iget-wide v2, p0, LC91;->c:D

    iget-wide v6, p1, LC91;->c:D

    cmpg-double v0, v2, v6

    if-gez v0, :cond_2

    return v5

    :cond_2
    cmpl-double v0, v2, v6

    if-lez v0, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LC91;->d:D

    iget-wide v6, p1, LC91;->d:D

    cmpg-double v0, v2, v6

    if-gez v0, :cond_4

    return v5

    :cond_4
    cmpl-double v0, v2, v6

    if-lez v0, :cond_5

    return v1

    :cond_5
    iget-wide v2, p0, LC91;->e:D

    iget-wide v6, p1, LC91;->e:D

    cmpg-double p1, v2, v6

    if-gez p1, :cond_6

    return v5

    :cond_6
    cmpl-double p1, v2, v6

    if-lez p1, :cond_7

    return v1

    :cond_7
    const/4 p1, 0x0

    return p1
.end method

.method public final c(DD)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, LBy3;->b:LBy3;

    invoke-virtual {v1, p1, p2}, LBy3;->c(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, LBy3;->b:LBy3;

    invoke-virtual {p1, p3, p4}, LBy3;->c(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LC91;

    invoke-virtual {p0, p1}, LC91;->a(LC91;)I

    move-result p1

    return p1
.end method

.method public final e(LyB0;LyB0;)V
    .locals 2

    invoke-virtual {p1}, LyB0;->k()D

    move-result-wide v0

    iput-wide v0, p0, LC91;->b:D

    invoke-virtual {p1}, LyB0;->l()D

    move-result-wide v0

    iput-wide v0, p0, LC91;->c:D

    invoke-virtual {p2}, LyB0;->k()D

    move-result-wide v0

    iput-wide v0, p0, LC91;->d:D

    invoke-virtual {p2}, LyB0;->l()D

    move-result-wide p1

    iput-wide p1, p0, LC91;->e:D

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, LC91;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LC91;

    iget-wide v2, p0, LC91;->b:D

    iget-wide v4, p1, LC91;->b:D

    cmpl-double v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, LC91;->c:D

    iget-wide v4, p1, LC91;->c:D

    cmpl-double v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, LC91;->d:D

    iget-wide v4, p1, LC91;->d:D

    cmpl-double v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, LC91;->e:D

    iget-wide v4, p1, LC91;->e:D

    cmpl-double p1, v2, v4

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final f(Lr91;)V
    .locals 2

    invoke-virtual {p1}, Lr91;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr91;->e(I)LyB0;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lr91;->e(I)LyB0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LC91;->e(LyB0;LyB0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lr91;->s()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p1, v1}, Lr91;->e(I)LyB0;

    move-result-object v1

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p1, v0}, Lr91;->e(I)LyB0;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, LC91;->e(LyB0;LyB0;)V

    :goto_0
    return-void
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, LC91;->b:D

    invoke-static {v0, v1}, LC91;->d(D)I

    move-result v0

    const/16 v1, 0x275

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x25

    iget-wide v2, p0, LC91;->c:D

    invoke-static {v2, v3}, LC91;->d(D)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x25

    iget-wide v2, p0, LC91;->d:D

    invoke-static {v2, v3}, LC91;->d(D)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x25

    iget-wide v2, p0, LC91;->e:D

    invoke-static {v2, v3}, LC91;->d(D)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EdgeKey("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LC91;->b:D

    iget-wide v3, p0, LC91;->c:D

    invoke-virtual {p0, v1, v2, v3, v4}, LC91;->c(DD)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LC91;->d:D

    iget-wide v3, p0, LC91;->e:D

    invoke-virtual {p0, v1, v2, v3, v4}, LC91;->c(DD)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
