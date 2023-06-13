.class public Lco/bird/android/model/MultiPolygon;
.super Lco/bird/android/model/ComposedGeom;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x100L


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lco/bird/android/model/ComposedGeom;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/MultiPolygon;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x6

    invoke-direct {p0, v0, p1, p2}, Lco/bird/android/model/ComposedGeom;-><init>(ILjava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>([Lco/bird/android/model/Polygon;)V
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, v0, p1}, Lco/bird/android/model/ComposedGeom;-><init>(I[Lco/bird/android/model/Geometry;)V

    return-void
.end method


# virtual methods
.method public createSubGeomArray(I)[Lco/bird/android/model/Geometry;
    .locals 0

    new-array p1, p1, [Lco/bird/android/model/Polygon;

    return-object p1
.end method

.method public createSubGeomInstance(Ljava/lang/String;Z)Lco/bird/android/model/Geometry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    new-instance v0, Lco/bird/android/model/Polygon;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/Polygon;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public getPolygon(I)Lco/bird/android/model/Polygon;
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

    check-cast p1, Lco/bird/android/model/Polygon;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public getPolygons()[Lco/bird/android/model/Polygon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    check-cast v0, [Lco/bird/android/model/Polygon;

    return-object v0
.end method

.method public numPolygons()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v0, v0

    return v0
.end method
