.class public Lco/bird/android/model/GeometryCollection;
.super Lco/bird/android/model/ComposedGeom;
.source "SourceFile"


# static fields
.field public static final GeoCollID:Ljava/lang/String; = "GEOMETRYCOLLECTION"

.field private static final serialVersionUID:J = 0x100L


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x7

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

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/GeometryCollection;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x7

    invoke-direct {p0, v0, p1, p2}, Lco/bird/android/model/ComposedGeom;-><init>(ILjava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>([Lco/bird/android/model/Geometry;)V
    .locals 1

    const/4 v0, 0x7

    invoke-direct {p0, v0, p1}, Lco/bird/android/model/ComposedGeom;-><init>(I[Lco/bird/android/model/Geometry;)V

    return-void
.end method


# virtual methods
.method public createSubGeomArray(I)[Lco/bird/android/model/Geometry;
    .locals 0

    new-array p1, p1, [Lco/bird/android/model/Geometry;

    return-object p1
.end method

.method public createSubGeomInstance(Ljava/lang/String;Z)Lco/bird/android/model/Geometry;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    invoke-static {p1, p2}, Lco/bird/android/model/GeometryBuilder;->geomFromString(Ljava/lang/String;Z)Lco/bird/android/model/Geometry;

    move-result-object p1

    return-object p1
.end method

.method public getGeometries()[Lco/bird/android/model/Geometry;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    return-object v0
.end method

.method public innerWKT(Ljava/lang/StringBuilder;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lco/bird/android/model/Geometry;->outerWKT(Ljava/lang/StringBuilder;Z)V

    move v0, v1

    :goto_0
    iget-object v2, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    const/16 v2, 0x2c

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    aget-object v2, v2, v0

    invoke-virtual {v2, p1, v1}, Lco/bird/android/model/Geometry;->outerWKT(Ljava/lang/StringBuilder;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
