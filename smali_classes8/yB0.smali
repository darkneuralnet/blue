.class public LyB0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "LyB0;",
        ">;",
        "Ljava/lang/Cloneable;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x5cbf2c235c7e583eL


# instance fields
.field public b:D

.field public c:D

.field public d:D


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1, v0, v1}, LyB0;-><init>(DD)V

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 7

    const-wide/high16 v5, 0x7ff8000000000000L    # Double.NaN

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v6}, LyB0;-><init>(DDD)V

    return-void
.end method

.method public constructor <init>(DDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LyB0;->b:D

    iput-wide p3, p0, LyB0;->c:D

    iput-wide p5, p0, LyB0;->d:D

    return-void
.end method

.method public constructor <init>(LyB0;)V
    .locals 7

    iget-wide v1, p1, LyB0;->b:D

    iget-wide v3, p1, LyB0;->c:D

    invoke-virtual {p1}, LyB0;->m()D

    move-result-wide v5

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, LyB0;-><init>(DDD)V

    return-void
.end method

.method public static n(D)I
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
.method public clone()Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LyB0;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "this shouldn\'t happen because this class is Cloneable"

    invoke-static {v0}, LKo;->f(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LyB0;

    invoke-virtual {p0, p1}, LyB0;->d(LyB0;)I

    move-result p1

    return p1
.end method

.method public d(LyB0;)I
    .locals 8

    iget-wide v0, p0, LyB0;->b:D

    iget-wide v2, p1, LyB0;->b:D

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
    iget-wide v2, p0, LyB0;->c:D

    iget-wide v6, p1, LyB0;->c:D

    cmpg-double p1, v2, v6

    if-gez p1, :cond_2

    return v5

    :cond_2
    cmpl-double p1, v2, v6

    if-lez p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public e()LyB0;
    .locals 1

    new-instance v0, LyB0;

    invoke-direct {v0, p0}, LyB0;-><init>(LyB0;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LyB0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LyB0;

    invoke-virtual {p0, p1}, LyB0;->g(LyB0;)Z

    move-result p1

    return p1
.end method

.method public f(LyB0;)D
    .locals 6

    iget-wide v0, p0, LyB0;->b:D

    iget-wide v2, p1, LyB0;->b:D

    sub-double/2addr v0, v2

    iget-wide v2, p0, LyB0;->c:D

    iget-wide v4, p1, LyB0;->c:D

    sub-double/2addr v2, v4

    mul-double/2addr v0, v0

    mul-double/2addr v2, v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public g(LyB0;)Z
    .locals 6

    iget-wide v0, p0, LyB0;->b:D

    iget-wide v2, p1, LyB0;->b:D

    cmpl-double v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-wide v2, p0, LyB0;->c:D

    iget-wide v4, p1, LyB0;->c:D

    cmpl-double p1, v2, v4

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public h()D
    .locals 2

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, LyB0;->b:D

    invoke-static {v0, v1}, LyB0;->n(D)I

    move-result v0

    const/16 v1, 0x275

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x25

    iget-wide v2, p0, LyB0;->c:D

    invoke-static {v2, v3}, LyB0;->n(D)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public j(I)D
    .locals 3

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LyB0;->m()D

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid ordinate index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v0, p0, LyB0;->c:D

    return-wide v0

    :cond_2
    iget-wide v0, p0, LyB0;->b:D

    return-wide v0
.end method

.method public k()D
    .locals 2

    iget-wide v0, p0, LyB0;->b:D

    return-wide v0
.end method

.method public l()D
    .locals 2

    iget-wide v0, p0, LyB0;->c:D

    return-wide v0
.end method

.method public m()D
    .locals 2

    iget-wide v0, p0, LyB0;->d:D

    return-wide v0
.end method

.method public o(LyB0;)V
    .locals 2

    iget-wide v0, p1, LyB0;->b:D

    iput-wide v0, p0, LyB0;->b:D

    iget-wide v0, p1, LyB0;->c:D

    iput-wide v0, p0, LyB0;->c:D

    invoke-virtual {p1}, LyB0;->m()D

    move-result-wide v0

    iput-wide v0, p0, LyB0;->d:D

    return-void
.end method

.method public p(ID)V
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    invoke-virtual {p0, p2, p3}, LyB0;->q(D)V

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid ordinate index: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    iput-wide p2, p0, LyB0;->c:D

    goto :goto_0

    :cond_2
    iput-wide p2, p0, LyB0;->b:D

    :goto_0
    return-void
.end method

.method public q(D)V
    .locals 0

    iput-wide p1, p0, LyB0;->d:D

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LyB0;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LyB0;->c:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LyB0;->m()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
