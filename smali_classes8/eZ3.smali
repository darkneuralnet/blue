.class public LeZ3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LeZ3$a;
    }
.end annotation


# static fields
.field public static final e:LeZ3$a;

.field public static final f:LeZ3$a;

.field public static final g:LeZ3$a;

.field private static final serialVersionUID:J = 0x6bee6404e9a25c3bL


# instance fields
.field public b:LeZ3$a;

.field public c:D

.field public d:D


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LeZ3$a;

    const-string v1, "FIXED"

    invoke-direct {v0, v1}, LeZ3$a;-><init>(Ljava/lang/String;)V

    sput-object v0, LeZ3;->e:LeZ3$a;

    new-instance v0, LeZ3$a;

    const-string v1, "FLOATING"

    invoke-direct {v0, v1}, LeZ3$a;-><init>(Ljava/lang/String;)V

    sput-object v0, LeZ3;->f:LeZ3$a;

    new-instance v0, LeZ3$a;

    const-string v1, "FLOATING SINGLE"

    invoke-direct {v0, v1}, LeZ3$a;-><init>(Ljava/lang/String;)V

    sput-object v0, LeZ3;->g:LeZ3$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LeZ3;->f:LeZ3$a;

    iput-object v0, p0, LeZ3;->b:LeZ3$a;

    return-void
.end method

.method public constructor <init>(D)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LeZ3;->e:LeZ3$a;

    iput-object v0, p0, LeZ3;->b:LeZ3$a;

    invoke-virtual {p0, p1, p2}, LeZ3;->g(D)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 4

    iget-object v0, p0, LeZ3;->b:LeZ3$a;

    sget-object v1, LeZ3;->f:LeZ3$a;

    const/16 v2, 0x10

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, LeZ3;->g:LeZ3$a;

    if-ne v0, v1, :cond_1

    const/4 v2, 0x6

    goto :goto_0

    :cond_1
    sget-object v1, LeZ3;->e:LeZ3$a;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, LeZ3;->b()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v2, v0, 0x1

    :cond_2
    :goto_0
    return v2
.end method

.method public b()D
    .locals 2

    iget-wide v0, p0, LeZ3;->c:D

    return-wide v0
.end method

.method public c()LeZ3$a;
    .locals 1

    iget-object v0, p0, LeZ3;->b:LeZ3$a;

    return-object v0
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, LeZ3;

    invoke-virtual {p0}, LeZ3;->a()I

    move-result v0

    invoke-virtual {p1}, LeZ3;->a()I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, LeZ3;->b:LeZ3$a;

    sget-object v1, LeZ3;->f:LeZ3$a;

    if-eq v0, v1, :cond_1

    sget-object v1, LeZ3;->g:LeZ3$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e(D)D
    .locals 4

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    return-wide p1

    :cond_0
    iget-object v0, p0, LeZ3;->b:LeZ3$a;

    sget-object v1, LeZ3;->g:LeZ3$a;

    if-ne v0, v1, :cond_1

    double-to-float p1, p1

    float-to-double p1, p1

    return-wide p1

    :cond_1
    sget-object v1, LeZ3;->e:LeZ3$a;

    if-ne v0, v1, :cond_3

    iget-wide v0, p0, LeZ3;->d:D

    const-wide/16 v2, 0x0

    cmpl-double v2, v0, v2

    if-lez v2, :cond_2

    div-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-double p1, p1

    iget-wide v0, p0, LeZ3;->d:D

    mul-double/2addr p1, v0

    return-wide p1

    :cond_2
    iget-wide v0, p0, LeZ3;->c:D

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-double p1, p1

    iget-wide v0, p0, LeZ3;->c:D

    div-double/2addr p1, v0

    :cond_3
    return-wide p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, LeZ3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LeZ3;

    iget-object v0, p0, LeZ3;->b:LeZ3$a;

    iget-object v2, p1, LeZ3;->b:LeZ3$a;

    if-ne v0, v2, :cond_1

    iget-wide v2, p0, LeZ3;->c:D

    iget-wide v4, p1, LeZ3;->c:D

    cmpl-double p1, v2, v4

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f(LyB0;)V
    .locals 2

    iget-object v0, p0, LeZ3;->b:LeZ3$a;

    sget-object v1, LeZ3;->f:LeZ3$a;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-wide v0, p1, LyB0;->b:D

    invoke-virtual {p0, v0, v1}, LeZ3;->e(D)D

    move-result-wide v0

    iput-wide v0, p1, LyB0;->b:D

    iget-wide v0, p1, LyB0;->c:D

    invoke-virtual {p0, v0, v1}, LeZ3;->e(D)D

    move-result-wide v0

    iput-wide v0, p1, LyB0;->c:D

    return-void
.end method

.method public final g(D)V
    .locals 3

    const-wide/16 v0, 0x0

    cmpg-double v2, p1, v0

    if-gez v2, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    iput-wide p1, p0, LeZ3;->d:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    div-double/2addr v0, p1

    iput-wide v0, p0, LeZ3;->c:D

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    iput-wide p1, p0, LeZ3;->c:D

    iput-wide v0, p0, LeZ3;->d:D

    :goto_0
    return-void
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, LeZ3;->b:LeZ3$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    add-int/2addr v0, v1

    iget-wide v2, p0, LeZ3;->c:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    mul-int/2addr v0, v1

    const/16 v1, 0x20

    ushr-long v4, v2, v1

    xor-long v1, v2, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LeZ3;->b:LeZ3$a;

    sget-object v1, LeZ3;->f:LeZ3$a;

    if-ne v0, v1, :cond_0

    const-string v0, "Floating"

    goto :goto_0

    :cond_0
    sget-object v1, LeZ3;->g:LeZ3$a;

    if-ne v0, v1, :cond_1

    const-string v0, "Floating-Single"

    goto :goto_0

    :cond_1
    sget-object v1, LeZ3;->e:LeZ3$a;

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fixed (Scale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LeZ3;->b()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v0, "UNKNOWN"

    :goto_0
    return-object v0
.end method
