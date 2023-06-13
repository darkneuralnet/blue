.class public Lco/bird/android/model/binary/BinaryWriter;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private estimateCollection(Lco/bird/android/model/GeometryCollection;)I
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/GeometryCollection;->getGeometries()[Lco/bird/android/model/Geometry;

    move-result-object p1

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateGeometryArray([Lco/bird/android/model/Geometry;)I

    move-result p1

    add-int/lit8 p1, p1, 0x4

    return p1
.end method

.method private estimateGeometryArray([Lco/bird/android/model/Geometry;)I
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_0

    aget-object v2, p1, v0

    invoke-virtual {p0, v2}, Lco/bird/android/model/binary/BinaryWriter;->estimateBytes(Lco/bird/android/model/Geometry;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method private estimateLineString(Lco/bird/android/model/LineString;)I
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object p1

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimatePointArray([Lco/bird/android/model/Point;)I

    move-result p1

    return p1
.end method

.method private estimateLinearRing(Lco/bird/android/model/LinearRing;)I
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object p1

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimatePointArray([Lco/bird/android/model/Point;)I

    move-result p1

    return p1
.end method

.method private estimateMultiLineString(Lco/bird/android/model/MultiLineString;)I
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/MultiLineString;->getLines()[Lco/bird/android/model/LineString;

    move-result-object p1

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateGeometryArray([Lco/bird/android/model/Geometry;)I

    move-result p1

    add-int/lit8 p1, p1, 0x4

    return p1
.end method

.method private estimateMultiPoint(Lco/bird/android/model/MultiPoint;)I
    .locals 2

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->numPoints()I

    move-result v0

    const/4 v1, 0x4

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->numPoints()I

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/model/ComposedGeom;->getFirstPoint()Lco/bird/android/model/Point;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateBytes(Lco/bird/android/model/Geometry;)I

    move-result p1

    mul-int/2addr v0, p1

    add-int/2addr v1, v0

    :cond_0
    return v1
.end method

.method private estimateMultiPolygon(Lco/bird/android/model/MultiPolygon;)I
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/MultiPolygon;->getPolygons()[Lco/bird/android/model/Polygon;

    move-result-object p1

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateGeometryArray([Lco/bird/android/model/Geometry;)I

    move-result p1

    add-int/lit8 p1, p1, 0x4

    return p1
.end method

.method private estimatePoint(Lco/bird/android/model/Point;)I
    .locals 2

    iget v0, p1, Lco/bird/android/model/Geometry;->dimension:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/16 v0, 0x18

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    iget-boolean p1, p1, Lco/bird/android/model/Geometry;->haveMeasure:Z

    if-eqz p1, :cond_1

    add-int/lit8 v0, v0, 0x8

    :cond_1
    return v0
.end method

.method private estimatePointArray([Lco/bird/android/model/Point;)I
    .locals 3

    array-length v0, p1

    const/4 v1, 0x4

    if-lez v0, :cond_0

    array-length v0, p1

    const/4 v2, 0x0

    aget-object p1, p1, v2

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimatePoint(Lco/bird/android/model/Point;)I

    move-result p1

    mul-int/2addr v0, p1

    add-int/2addr v1, v0

    :cond_0
    return v1
.end method

.method private estimatePolygon(Lco/bird/android/model/Polygon;)I
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lco/bird/android/model/Polygon;->numRings()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object v2

    invoke-direct {p0, v2}, Lco/bird/android/model/binary/BinaryWriter;->estimateLinearRing(Lco/bird/android/model/LinearRing;)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static valueSetterForEndian(Lco/bird/android/model/binary/ByteSetter;B)Lco/bird/android/model/binary/ValueSetter;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Lco/bird/android/model/binary/ValueSetter$XDR;

    invoke-direct {p1, p0}, Lco/bird/android/model/binary/ValueSetter$XDR;-><init>(Lco/bird/android/model/binary/ByteSetter;)V

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    new-instance p1, Lco/bird/android/model/binary/ValueSetter$NDR;

    invoke-direct {p1, p0}, Lco/bird/android/model/binary/ValueSetter$NDR;-><init>(Lco/bird/android/model/binary/ByteSetter;)V

    return-object p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Endian type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private writeCollection(Lco/bird/android/model/GeometryCollection;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/model/ComposedGeom;->numGeoms()I

    move-result v0

    invoke-virtual {p2, v0}, Lco/bird/android/model/binary/ValueSetter;->setInt(I)V

    invoke-virtual {p1}, Lco/bird/android/model/GeometryCollection;->getGeometries()[Lco/bird/android/model/Geometry;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeGeometryArray([Lco/bird/android/model/Geometry;Lco/bird/android/model/binary/ValueSetter;)V

    return-void
.end method

.method private writeGeometryArray([Lco/bird/android/model/Geometry;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    aget-object v1, p1, v0

    invoke-virtual {p0, v1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeGeometry(Lco/bird/android/model/Geometry;Lco/bird/android/model/binary/ValueSetter;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeLineString(Lco/bird/android/model/LineString;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writePointArray([Lco/bird/android/model/Point;Lco/bird/android/model/binary/ValueSetter;)V

    return-void
.end method

.method private writeLinearRing(Lco/bird/android/model/LinearRing;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 0

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writePointArray([Lco/bird/android/model/Point;Lco/bird/android/model/binary/ValueSetter;)V

    return-void
.end method

.method private writeMultiLineString(Lco/bird/android/model/MultiLineString;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/model/MultiLineString;->numLines()I

    move-result v0

    invoke-virtual {p2, v0}, Lco/bird/android/model/binary/ValueSetter;->setInt(I)V

    invoke-virtual {p1}, Lco/bird/android/model/MultiLineString;->getLines()[Lco/bird/android/model/LineString;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeGeometryArray([Lco/bird/android/model/Geometry;Lco/bird/android/model/binary/ValueSetter;)V

    return-void
.end method

.method private writeMultiPoint(Lco/bird/android/model/MultiPoint;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->numPoints()I

    move-result v0

    invoke-virtual {p2, v0}, Lco/bird/android/model/binary/ValueSetter;->setInt(I)V

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeGeometryArray([Lco/bird/android/model/Geometry;Lco/bird/android/model/binary/ValueSetter;)V

    return-void
.end method

.method private writeMultiPolygon(Lco/bird/android/model/MultiPolygon;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/model/MultiPolygon;->numPolygons()I

    move-result v0

    invoke-virtual {p2, v0}, Lco/bird/android/model/binary/ValueSetter;->setInt(I)V

    invoke-virtual {p1}, Lco/bird/android/model/MultiPolygon;->getPolygons()[Lco/bird/android/model/Polygon;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeGeometryArray([Lco/bird/android/model/Geometry;Lco/bird/android/model/binary/ValueSetter;)V

    return-void
.end method

.method private writePoint(Lco/bird/android/model/Point;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 2

    iget-wide v0, p1, Lco/bird/android/model/Point;->x:D

    invoke-virtual {p2, v0, v1}, Lco/bird/android/model/binary/ValueSetter;->setDouble(D)V

    iget-wide v0, p1, Lco/bird/android/model/Point;->y:D

    invoke-virtual {p2, v0, v1}, Lco/bird/android/model/binary/ValueSetter;->setDouble(D)V

    iget v0, p1, Lco/bird/android/model/Geometry;->dimension:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-wide v0, p1, Lco/bird/android/model/Point;->z:D

    invoke-virtual {p2, v0, v1}, Lco/bird/android/model/binary/ValueSetter;->setDouble(D)V

    :cond_0
    iget-boolean v0, p1, Lco/bird/android/model/Geometry;->haveMeasure:Z

    if-eqz v0, :cond_1

    iget-wide v0, p1, Lco/bird/android/model/Point;->m:D

    invoke-virtual {p2, v0, v1}, Lco/bird/android/model/binary/ValueSetter;->setDouble(D)V

    :cond_1
    return-void
.end method

.method private writePointArray([Lco/bird/android/model/Point;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 2

    array-length v0, p1

    invoke-virtual {p2, v0}, Lco/bird/android/model/binary/ValueSetter;->setInt(I)V

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    aget-object v1, p1, v0

    invoke-direct {p0, v1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writePoint(Lco/bird/android/model/Point;Lco/bird/android/model/binary/ValueSetter;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writePolygon(Lco/bird/android/model/Polygon;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 2

    invoke-virtual {p1}, Lco/bird/android/model/Polygon;->numRings()I

    move-result v0

    invoke-virtual {p2, v0}, Lco/bird/android/model/binary/ValueSetter;->setInt(I)V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lco/bird/android/model/Polygon;->numRings()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeLinearRing(Lco/bird/android/model/LinearRing;Lco/bird/android/model/binary/ValueSetter;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public estimateBytes(Lco/bird/android/model/Geometry;)I
    .locals 3

    iget v0, p1, Lco/bird/android/model/Geometry;->srid:I

    if-eqz v0, :cond_0

    const/16 v0, 0x9

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    :goto_0
    iget v1, p1, Lco/bird/android/model/Geometry;->type:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    iget p1, p1, Lco/bird/android/model/Geometry;->type:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown Geometry Type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    check-cast p1, Lco/bird/android/model/GeometryCollection;

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateCollection(Lco/bird/android/model/GeometryCollection;)I

    move-result p1

    goto :goto_1

    :pswitch_1
    check-cast p1, Lco/bird/android/model/MultiPolygon;

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateMultiPolygon(Lco/bird/android/model/MultiPolygon;)I

    move-result p1

    goto :goto_1

    :pswitch_2
    check-cast p1, Lco/bird/android/model/MultiLineString;

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateMultiLineString(Lco/bird/android/model/MultiLineString;)I

    move-result p1

    goto :goto_1

    :pswitch_3
    check-cast p1, Lco/bird/android/model/MultiPoint;

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateMultiPoint(Lco/bird/android/model/MultiPoint;)I

    move-result p1

    goto :goto_1

    :pswitch_4
    check-cast p1, Lco/bird/android/model/Polygon;

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimatePolygon(Lco/bird/android/model/Polygon;)I

    move-result p1

    goto :goto_1

    :pswitch_5
    check-cast p1, Lco/bird/android/model/LineString;

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateLineString(Lco/bird/android/model/LineString;)I

    move-result p1

    goto :goto_1

    :pswitch_6
    check-cast p1, Lco/bird/android/model/Point;

    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimatePoint(Lco/bird/android/model/Point;)I

    move-result p1

    :goto_1
    add-int/2addr v0, p1

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized writeBinary(Lco/bird/android/model/Geometry;)[B
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lco/bird/android/model/binary/BinaryWriter;->writeBinary(Lco/bird/android/model/Geometry;B)[B

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized writeBinary(Lco/bird/android/model/Geometry;B)[B
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateBytes(Lco/bird/android/model/Geometry;)I

    move-result v0

    new-instance v1, Lco/bird/android/model/binary/ByteSetter$BinaryByteSetter;

    invoke-direct {v1, v0}, Lco/bird/android/model/binary/ByteSetter$BinaryByteSetter;-><init>(I)V

    invoke-static {v1, p2}, Lco/bird/android/model/binary/BinaryWriter;->valueSetterForEndian(Lco/bird/android/model/binary/ByteSetter;B)Lco/bird/android/model/binary/ValueSetter;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeGeometry(Lco/bird/android/model/Geometry;Lco/bird/android/model/binary/ValueSetter;)V

    invoke-virtual {v1}, Lco/bird/android/model/binary/ByteSetter$BinaryByteSetter;->result()[B

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public writeGeometry(Lco/bird/android/model/Geometry;Lco/bird/android/model/binary/ValueSetter;)V
    .locals 3

    iget-byte v0, p2, Lco/bird/android/model/binary/ValueSetter;->endian:B

    invoke-virtual {p2, v0}, Lco/bird/android/model/binary/ValueSetter;->setByte(B)V

    iget v0, p1, Lco/bird/android/model/Geometry;->type:I

    iget v1, p1, Lco/bird/android/model/Geometry;->dimension:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    :cond_0
    iget-boolean v1, p1, Lco/bird/android/model/Geometry;->haveMeasure:Z

    if-eqz v1, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    or-int/2addr v0, v1

    :cond_1
    iget v1, p1, Lco/bird/android/model/Geometry;->srid:I

    if-eqz v1, :cond_2

    const/high16 v1, 0x20000000

    or-int/2addr v0, v1

    :cond_2
    invoke-virtual {p2, v0}, Lco/bird/android/model/binary/ValueSetter;->setInt(I)V

    iget v0, p1, Lco/bird/android/model/Geometry;->srid:I

    if-eqz v0, :cond_3

    invoke-virtual {p2, v0}, Lco/bird/android/model/binary/ValueSetter;->setInt(I)V

    :cond_3
    iget v0, p1, Lco/bird/android/model/Geometry;->type:I

    packed-switch v0, :pswitch_data_0

    new-instance p2, Ljava/lang/IllegalArgumentException;

    iget p1, p1, Lco/bird/android/model/Geometry;->type:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Geometry Type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    check-cast p1, Lco/bird/android/model/GeometryCollection;

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeCollection(Lco/bird/android/model/GeometryCollection;Lco/bird/android/model/binary/ValueSetter;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lco/bird/android/model/MultiPolygon;

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeMultiPolygon(Lco/bird/android/model/MultiPolygon;Lco/bird/android/model/binary/ValueSetter;)V

    goto :goto_0

    :pswitch_2
    check-cast p1, Lco/bird/android/model/MultiLineString;

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeMultiLineString(Lco/bird/android/model/MultiLineString;Lco/bird/android/model/binary/ValueSetter;)V

    goto :goto_0

    :pswitch_3
    check-cast p1, Lco/bird/android/model/MultiPoint;

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeMultiPoint(Lco/bird/android/model/MultiPoint;Lco/bird/android/model/binary/ValueSetter;)V

    goto :goto_0

    :pswitch_4
    check-cast p1, Lco/bird/android/model/Polygon;

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writePolygon(Lco/bird/android/model/Polygon;Lco/bird/android/model/binary/ValueSetter;)V

    goto :goto_0

    :pswitch_5
    check-cast p1, Lco/bird/android/model/LineString;

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeLineString(Lco/bird/android/model/LineString;Lco/bird/android/model/binary/ValueSetter;)V

    goto :goto_0

    :pswitch_6
    check-cast p1, Lco/bird/android/model/Point;

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writePoint(Lco/bird/android/model/Point;Lco/bird/android/model/binary/ValueSetter;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized writeHexed(Lco/bird/android/model/Geometry;)Ljava/lang/String;
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lco/bird/android/model/binary/BinaryWriter;->writeHexed(Lco/bird/android/model/Geometry;B)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized writeHexed(Lco/bird/android/model/Geometry;B)Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lco/bird/android/model/binary/BinaryWriter;->estimateBytes(Lco/bird/android/model/Geometry;)I

    move-result v0

    new-instance v1, Lco/bird/android/model/binary/ByteSetter$StringByteSetter;

    invoke-direct {v1, v0}, Lco/bird/android/model/binary/ByteSetter$StringByteSetter;-><init>(I)V

    invoke-static {v1, p2}, Lco/bird/android/model/binary/BinaryWriter;->valueSetterForEndian(Lco/bird/android/model/binary/ByteSetter;B)Lco/bird/android/model/binary/ValueSetter;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/binary/BinaryWriter;->writeGeometry(Lco/bird/android/model/Geometry;Lco/bird/android/model/binary/ValueSetter;)V

    invoke-virtual {v1}, Lco/bird/android/model/binary/ByteSetter$StringByteSetter;->result()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
