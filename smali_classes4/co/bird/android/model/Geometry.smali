.class public abstract Lco/bird/android/model/Geometry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ALLTYPES:[Ljava/lang/String;

.field public static final GEOMETRYCOLLECTION:I = 0x7

.field public static final LINEARRING:I = 0x0

.field public static final LINESTRING:I = 0x2

.field public static final MULTILINESTRING:I = 0x5

.field public static final MULTIPOINT:I = 0x4

.field public static final MULTIPOLYGON:I = 0x6

.field public static final POINT:I = 0x1

.field public static final POLYGON:I = 0x3

.field public static final UNKNOWN_SRID:I = 0x0

.field private static final serialVersionUID:J = 0x100L


# instance fields
.field public dimension:I

.field public haveMeasure:Z

.field public srid:I

.field public final type:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const-string v0, ""

    const-string v1, "POINT"

    const-string v2, "LINESTRING"

    const-string v3, "POLYGON"

    const-string v4, "MULTIPOINT"

    const-string v5, "MULTILINESTRING"

    const-string v6, "MULTIPOLYGON"

    const-string v7, "GEOMETRYCOLLECTION"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/Geometry;->ALLTYPES:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    iput v0, p0, Lco/bird/android/model/Geometry;->srid:I

    iput p1, p0, Lco/bird/android/model/Geometry;->type:I

    return-void
.end method

.method public static getTypeString(I)Ljava/lang/String;
    .locals 3

    if-ltz p0, :cond_0

    const/4 v0, 0x7

    if-gt p0, v0, :cond_0

    sget-object v0, Lco/bird/android/model/Geometry;->ALLTYPES:[Ljava/lang/String;

    aget-object p0, v0, p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown Geometry type"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static parseSRID(I)I
    .locals 0

    if-gez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return p0
.end method


# virtual methods
.method public checkConsistency()Z
    .locals 2

    iget v0, p0, Lco/bird/android/model/Geometry;->dimension:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    iget v0, p0, Lco/bird/android/model/Geometry;->type:I

    if-ltz v0, :cond_0

    const/4 v1, 0x7

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Lco/bird/android/model/Geometry;)Z
    .locals 2

    if-eqz p1, :cond_0

    iget v0, p0, Lco/bird/android/model/Geometry;->dimension:I

    iget v1, p1, Lco/bird/android/model/Geometry;->dimension:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lco/bird/android/model/Geometry;->type:I

    iget v1, p1, Lco/bird/android/model/Geometry;->type:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lco/bird/android/model/Geometry;->srid:I

    iget v1, p1, Lco/bird/android/model/Geometry;->srid:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    iget-boolean v1, p1, Lco/bird/android/model/Geometry;->haveMeasure:Z

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lco/bird/android/model/Geometry;->equalsintern(Lco/bird/android/model/Geometry;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    instance-of v0, p1, Lco/bird/android/model/Geometry;

    if-eqz v0, :cond_0

    check-cast p1, Lco/bird/android/model/Geometry;

    invoke-virtual {p0, p1}, Lco/bird/android/model/Geometry;->equals(Lco/bird/android/model/Geometry;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract equalsintern(Lco/bird/android/model/Geometry;)Z
.end method

.method public getDimension()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/Geometry;->dimension:I

    return v0
.end method

.method public abstract getFirstPoint()Lco/bird/android/model/Point;
.end method

.method public abstract getLastPoint()Lco/bird/android/model/Point;
.end method

.method public abstract getPoint(I)Lco/bird/android/model/Point;
.end method

.method public getSrid()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/Geometry;->srid:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/Geometry;->type:I

    return v0
.end method

.method public getTypeString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lco/bird/android/model/Geometry;->type:I

    invoke-static {v0}, Lco/bird/android/model/Geometry;->getTypeString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Lco/bird/android/model/Geometry;->mediumWKT(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lco/bird/android/model/Geometry;->dimension:I

    iget v1, p0, Lco/bird/android/model/Geometry;->type:I

    mul-int/lit8 v1, v1, 0x4

    or-int/2addr v0, v1

    iget v1, p0, Lco/bird/android/model/Geometry;->srid:I

    mul-int/lit8 v1, v1, 0x20

    or-int/2addr v0, v1

    return v0
.end method

.method public initSRID(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SRID="

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x3b

    const/4 v1, 0x5

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lco/bird/android/model/Geometry;->srid:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Error parsing Geometry - SRID not delimited with \';\' "

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object p1
.end method

.method public abstract innerWKT(Ljava/lang/StringBuilder;)V
.end method

.method public isMeasured()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    return v0
.end method

.method public mediumWKT(Ljava/lang/StringBuilder;)V
    .locals 1

    const/16 v0, 0x28

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lco/bird/android/model/Geometry;->innerWKT(Ljava/lang/StringBuilder;)V

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public abstract numPoints()I
.end method

.method public final outerWKT(Ljava/lang/StringBuilder;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lco/bird/android/model/Geometry;->outerWKT(Ljava/lang/StringBuilder;Z)V

    return-void
.end method

.method public outerWKT(Ljava/lang/StringBuilder;Z)V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/Geometry;->getTypeString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    iget-boolean p2, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    if-eqz p2, :cond_0

    iget p2, p0, Lco/bird/android/model/Geometry;->dimension:I

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    const/16 p2, 0x4d

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/model/Geometry;->mediumWKT(Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public setSrid(I)V
    .locals 0

    iput p1, p0, Lco/bird/android/model/Geometry;->srid:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lco/bird/android/model/Geometry;->srid:I

    if-eqz v1, :cond_0

    const-string v1, "SRID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/bird/android/model/Geometry;->srid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x3b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lco/bird/android/model/Geometry;->outerWKT(Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
