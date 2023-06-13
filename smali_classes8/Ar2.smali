.class public LAr2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x2d2172135f411b63L


# instance fields
.field public b:LyB0;

.field public c:LyB0;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, LyB0;

    invoke-direct {v0}, LyB0;-><init>()V

    new-instance v1, LyB0;

    invoke-direct {v1}, LyB0;-><init>()V

    invoke-direct {p0, v0, v1}, LAr2;-><init>(LyB0;LyB0;)V

    return-void
.end method

.method public constructor <init>(LyB0;LyB0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAr2;->b:LyB0;

    iput-object p2, p0, LAr2;->c:LyB0;

    return-void
.end method


# virtual methods
.method public a(LyB0;)D
    .locals 2

    iget-object v0, p0, LAr2;->b:LyB0;

    iget-object v1, p0, LAr2;->c:LyB0;

    invoke-static {p1, v0, v1}, LG51;->a(LyB0;LyB0;LyB0;)D

    move-result-wide v0

    return-wide v0
.end method

.method public b(I)LyB0;
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, LAr2;->b:LyB0;

    return-object p1

    :cond_0
    iget-object p1, p0, LAr2;->c:LyB0;

    return-object p1
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, LAr2;

    iget-object v0, p0, LAr2;->b:LyB0;

    iget-object v1, p1, LAr2;->b:LyB0;

    invoke-virtual {v0, v1}, LyB0;->d(LyB0;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, LAr2;->c:LyB0;

    iget-object p1, p1, LAr2;->c:LyB0;

    invoke-virtual {v0, p1}, LyB0;->d(LyB0;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LAr2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LAr2;

    iget-object v0, p0, LAr2;->b:LyB0;

    iget-object v2, p1, LAr2;->b:LyB0;

    invoke-virtual {v0, v2}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LAr2;->c:LyB0;

    iget-object p1, p1, LAr2;->c:LyB0;

    invoke-virtual {v0, p1}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, LAr2;->b:LyB0;

    iget-wide v0, v0, LyB0;->b:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1ed

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1d

    iget-object v0, p0, LAr2;->b:LyB0;

    iget-wide v2, v0, LyB0;->c:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1d

    iget-object v0, p0, LAr2;->c:LyB0;

    iget-wide v2, v0, LyB0;->b:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1d

    iget-object v0, p0, LAr2;->c:LyB0;

    iget-wide v2, v0, LyB0;->c:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LINESTRING( "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LAr2;->b:LyB0;

    iget-wide v1, v1, LyB0;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LAr2;->b:LyB0;

    iget-wide v2, v2, LyB0;->c:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LAr2;->c:LyB0;

    iget-wide v2, v2, LyB0;->b:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LAr2;->c:LyB0;

    iget-wide v1, v1, LyB0;->c:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
