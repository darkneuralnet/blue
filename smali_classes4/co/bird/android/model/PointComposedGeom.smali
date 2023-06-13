.class public abstract Lco/bird/android/model/PointComposedGeom;
.super Lco/bird/android/model/ComposedGeom;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x100L


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/model/ComposedGeom;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lco/bird/android/model/PointComposedGeom;-><init>(ILjava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/ComposedGeom;-><init>(ILjava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(I[Lco/bird/android/model/Point;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/ComposedGeom;-><init>(I[Lco/bird/android/model/Geometry;)V

    return-void
.end method


# virtual methods
.method public createSubGeomArray(I)[Lco/bird/android/model/Geometry;
    .locals 0

    new-array p1, p1, [Lco/bird/android/model/Point;

    return-object p1
.end method

.method public createSubGeomInstance(Ljava/lang/String;Z)Lco/bird/android/model/Geometry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    new-instance v0, Lco/bird/android/model/Point;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/Point;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public getPoint(I)Lco/bird/android/model/Point;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    iget-object v3, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v4, v3

    if-ge p1, v4, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/2addr v0, v2

    if-eqz v0, :cond_2

    aget-object p1, v3, p1

    check-cast p1, Lco/bird/android/model/Point;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public getPoints()[Lco/bird/android/model/Point;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    check-cast v0, [Lco/bird/android/model/Point;

    return-object v0
.end method

.method public innerWKT(Ljava/lang/StringBuilder;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Lco/bird/android/model/Geometry;->innerWKT(Ljava/lang/StringBuilder;)V

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/16 v1, 0x2c

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Lco/bird/android/model/Geometry;->innerWKT(Ljava/lang/StringBuilder;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public numPoints()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v0, v0

    return v0
.end method
