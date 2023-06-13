.class public abstract Lco/bird/android/model/ComposedGeom;
.super Lco/bird/android/model/Geometry;
.source "SourceFile"


# static fields
.field public static final EMPTY:[Lco/bird/android/model/Geometry;

.field private static final serialVersionUID:J = 0x100L


# instance fields
.field hashcode:I

.field nohash:Z

.field protected subgeoms:[Lco/bird/android/model/Geometry;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lco/bird/android/model/Geometry;

    sput-object v0, Lco/bird/android/model/ComposedGeom;->EMPTY:[Lco/bird/android/model/Geometry;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/model/Geometry;-><init>(I)V

    sget-object p1, Lco/bird/android/model/ComposedGeom;->EMPTY:[Lco/bird/android/model/Geometry;

    iput-object p1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/model/ComposedGeom;->nohash:Z

    const/4 p1, 0x0

    iput p1, p0, Lco/bird/android/model/ComposedGeom;->hashcode:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lco/bird/android/model/Geometry;-><init>(I)V

    sget-object p1, Lco/bird/android/model/ComposedGeom;->EMPTY:[Lco/bird/android/model/Geometry;

    iput-object p1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/model/ComposedGeom;->nohash:Z

    const/4 v0, 0x0

    iput v0, p0, Lco/bird/android/model/ComposedGeom;->hashcode:I

    invoke-virtual {p0, p2}, Lco/bird/android/model/Geometry;->initSRID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lco/bird/android/model/Geometry;->getTypeString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x4d

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    move p3, p1

    :cond_0
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v2, 0x28

    if-ne p1, v2, :cond_4

    :goto_0
    const-string p1, "(EMPTY)"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    const-string p1, "("

    const-string v1, ")"

    invoke-static {p2, p1, v1}, Lco/bird/android/model/GeometryTokenizer;->removeLeadingAndTrailingStrings(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x2c

    invoke-static {p1, p2}, Lco/bird/android/model/GeometryTokenizer;->tokenize(Ljava/lang/String;C)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p0, p2}, Lco/bird/android/model/ComposedGeom;->createSubGeomArray(I)[Lco/bird/android/model/Geometry;

    move-result-object v1

    iput-object v1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    move v1, v0

    :goto_1
    if-ge v1, p2, :cond_3

    iget-object v2, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3, p3}, Lco/bird/android/model/ComposedGeom;->createSubGeomInstance(Ljava/lang/String;Z)Lco/bird/android/model/Geometry;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    aget-object p1, p1, v0

    iget p2, p1, Lco/bird/android/model/Geometry;->dimension:I

    iput p2, p0, Lco/bird/android/model/Geometry;->dimension:I

    iget-boolean p1, p1, Lco/bird/android/model/Geometry;->haveMeasure:Z

    iput-boolean p1, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    return-void

    :cond_4
    new-instance p1, Ljava/sql/SQLException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error parsing a "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " out of "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(I[Lco/bird/android/model/Geometry;)V
    .locals 1

    invoke-direct {p0, p1}, Lco/bird/android/model/ComposedGeom;-><init>(I)V

    iput-object p2, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length p1, p2

    const/4 v0, 0x0

    if-lez p1, :cond_0

    aget-object p1, p2, v0

    iget p2, p1, Lco/bird/android/model/Geometry;->dimension:I

    iput p2, p0, Lco/bird/android/model/Geometry;->dimension:I

    iget-boolean p1, p1, Lco/bird/android/model/Geometry;->haveMeasure:Z

    iput-boolean p1, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    goto :goto_0

    :cond_0
    iput v0, p0, Lco/bird/android/model/Geometry;->dimension:I

    :goto_0
    return-void
.end method


# virtual methods
.method public checkConsistency()Z
    .locals 8

    invoke-super {p0}, Lco/bird/android/model/Geometry;->checkConsistency()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lco/bird/android/model/ComposedGeom;->isEmpty()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    return v2

    :cond_0
    iget v0, p0, Lco/bird/android/model/Geometry;->dimension:I

    iget-boolean v3, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    iget v4, p0, Lco/bird/android/model/Geometry;->srid:I

    move v5, v1

    :goto_0
    iget-object v6, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v7, v6

    if-ge v5, v7, :cond_3

    aget-object v6, v6, v5

    invoke-virtual {v6}, Lco/bird/android/model/Geometry;->checkConsistency()Z

    move-result v7

    if-eqz v7, :cond_2

    iget v7, v6, Lco/bird/android/model/Geometry;->dimension:I

    if-ne v7, v0, :cond_2

    iget-boolean v7, v6, Lco/bird/android/model/Geometry;->haveMeasure:Z

    if-ne v7, v3, :cond_2

    iget v6, v6, Lco/bird/android/model/Geometry;->srid:I

    if-eq v6, v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1

    :cond_3
    return v2

    :cond_4
    return v1
.end method

.method public abstract createSubGeomArray(I)[Lco/bird/android/model/Geometry;
.end method

.method public abstract createSubGeomInstance(Ljava/lang/String;Z)Lco/bird/android/model/Geometry;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation
.end method

.method public equalsintern(Lco/bird/android/model/Geometry;)Z
    .locals 5

    check-cast p1, Lco/bird/android/model/ComposedGeom;

    iget-object v0, p1, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v2, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    if-nez v2, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-eqz v0, :cond_6

    iget-object v3, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    array-length v0, v0

    array-length v4, v3

    if-eq v0, v4, :cond_2

    return v2

    :cond_2
    array-length v0, v3

    if-nez v0, :cond_3

    return v1

    :cond_3
    move v0, v2

    :goto_0
    iget-object v3, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v4, v3

    if-ge v0, v4, :cond_5

    iget-object v4, p1, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    aget-object v4, v4, v0

    aget-object v3, v3, v0

    invoke-virtual {v4, v3}, Lco/bird/android/model/Geometry;->equalsintern(Lco/bird/android/model/Geometry;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    return v1

    :cond_6
    :goto_1
    return v2
.end method

.method public getFirstPoint()Lco/bird/android/model/Point;
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lco/bird/android/model/Geometry;->getFirstPoint()Lco/bird/android/model/Point;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "Empty Geometry has no Points!"

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getLastPoint()Lco/bird/android/model/Point;
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-eqz v1, :cond_0

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lco/bird/android/model/Geometry;->getLastPoint()Lco/bird/android/model/Point;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "Empty Geometry has no Points!"

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getPoint(I)Lco/bird/android/model/Point;
    .locals 3

    if-ltz p1, :cond_3

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    if-eqz v0, :cond_2

    array-length v0, v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lco/bird/android/model/Geometry;->numPoints()I

    move-result v2

    if-ge p1, v2, :cond_0

    invoke-virtual {v1, p1}, Lco/bird/android/model/Geometry;->getPoint(I)Lco/bird/android/model/Point;

    move-result-object p1

    return-object p1

    :cond_0
    sub-int/2addr p1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v0, "Index too large!"

    invoke-direct {p1, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v0, "Empty Geometry has no Points!"

    invoke-direct {p1, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v0, "Negative index not allowed"

    invoke-direct {p1, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getSubGeometry(I)Lco/bird/android/model/Geometry;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lco/bird/android/model/ComposedGeom;->nohash:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Lco/bird/android/model/Geometry;->hashCode()I

    move-result v0

    iget-object v1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    iput v0, p0, Lco/bird/android/model/ComposedGeom;->hashcode:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lco/bird/android/model/ComposedGeom;->nohash:Z

    :cond_0
    iget v0, p0, Lco/bird/android/model/ComposedGeom;->hashcode:I

    return v0
.end method

.method public innerWKT(Ljava/lang/StringBuilder;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Lco/bird/android/model/Geometry;->mediumWKT(Ljava/lang/StringBuilder;)V

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/16 v1, 0x2c

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Lco/bird/android/model/Geometry;->mediumWKT(Ljava/lang/StringBuilder;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    if-eqz v0, :cond_1

    array-length v0, v0

    if-nez v0, :cond_0

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

.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public numGeoms()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v0, v0

    return v0
.end method

.method public numPoints()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    array-length v0, v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lco/bird/android/model/Geometry;->numPoints()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_1
    return v1
.end method

.method public setSrid(I)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/model/Geometry;->setSrid(I)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Lco/bird/android/model/Geometry;->setSrid(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
