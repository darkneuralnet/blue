.class public Lco/bird/android/model/binary/BinaryParser;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private parseCollection(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/GeometryCollection;
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getInt()I

    move-result v0

    new-array v0, v0, [Lco/bird/android/model/Geometry;

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/binary/BinaryParser;->parseGeometryArray(Lco/bird/android/model/binary/ValueGetter;[Lco/bird/android/model/Geometry;)V

    new-instance p1, Lco/bird/android/model/GeometryCollection;

    invoke-direct {p1, v0}, Lco/bird/android/model/GeometryCollection;-><init>([Lco/bird/android/model/Geometry;)V

    return-object p1
.end method

.method private parseGeometryArray(Lco/bird/android/model/binary/ValueGetter;[Lco/bird/android/model/Geometry;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lco/bird/android/model/binary/BinaryParser;->parseGeometry(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/Geometry;

    move-result-object v1

    aput-object v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private parseLineString(Lco/bird/android/model/binary/ValueGetter;ZZ)Lco/bird/android/model/LineString;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/binary/BinaryParser;->parsePointArray(Lco/bird/android/model/binary/ValueGetter;ZZ)[Lco/bird/android/model/Point;

    move-result-object p1

    new-instance p2, Lco/bird/android/model/LineString;

    invoke-direct {p2, p1}, Lco/bird/android/model/LineString;-><init>([Lco/bird/android/model/Point;)V

    return-object p2
.end method

.method private parseLinearRing(Lco/bird/android/model/binary/ValueGetter;ZZ)Lco/bird/android/model/LinearRing;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/binary/BinaryParser;->parsePointArray(Lco/bird/android/model/binary/ValueGetter;ZZ)[Lco/bird/android/model/Point;

    move-result-object p1

    new-instance p2, Lco/bird/android/model/LinearRing;

    invoke-direct {p2, p1}, Lco/bird/android/model/LinearRing;-><init>([Lco/bird/android/model/Point;)V

    return-object p2
.end method

.method private parseMultiLineString(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/MultiLineString;
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getInt()I

    move-result v0

    new-array v0, v0, [Lco/bird/android/model/LineString;

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/binary/BinaryParser;->parseGeometryArray(Lco/bird/android/model/binary/ValueGetter;[Lco/bird/android/model/Geometry;)V

    new-instance p1, Lco/bird/android/model/MultiLineString;

    invoke-direct {p1, v0}, Lco/bird/android/model/MultiLineString;-><init>([Lco/bird/android/model/LineString;)V

    return-object p1
.end method

.method private parseMultiPoint(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/MultiPoint;
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getInt()I

    move-result v0

    new-array v0, v0, [Lco/bird/android/model/Point;

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/binary/BinaryParser;->parseGeometryArray(Lco/bird/android/model/binary/ValueGetter;[Lco/bird/android/model/Geometry;)V

    new-instance p1, Lco/bird/android/model/MultiPoint;

    invoke-direct {p1, v0}, Lco/bird/android/model/MultiPoint;-><init>([Lco/bird/android/model/Point;)V

    return-object p1
.end method

.method private parseMultiPolygon(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/MultiPolygon;
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getInt()I

    move-result v0

    new-array v0, v0, [Lco/bird/android/model/Polygon;

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/binary/BinaryParser;->parseGeometryArray(Lco/bird/android/model/binary/ValueGetter;[Lco/bird/android/model/Geometry;)V

    new-instance p1, Lco/bird/android/model/MultiPolygon;

    invoke-direct {p1, v0}, Lco/bird/android/model/MultiPolygon;-><init>([Lco/bird/android/model/Polygon;)V

    return-object p1
.end method

.method private parsePoint(Lco/bird/android/model/binary/ValueGetter;ZZ)Lco/bird/android/model/Point;
    .locals 7

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getDouble()D

    move-result-wide v1

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getDouble()D

    move-result-wide v3

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getDouble()D

    move-result-wide v5

    new-instance p2, Lco/bird/android/model/Point;

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/Point;-><init>(DDD)V

    goto :goto_0

    :cond_0
    new-instance p2, Lco/bird/android/model/Point;

    invoke-direct {p2, v1, v2, v3, v4}, Lco/bird/android/model/Point;-><init>(DD)V

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getDouble()D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lco/bird/android/model/Point;->setM(D)V

    :cond_1
    return-object p2
.end method

.method private parsePointArray(Lco/bird/android/model/binary/ValueGetter;ZZ)[Lco/bird/android/model/Point;
    .locals 4

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getInt()I

    move-result v0

    new-array v1, v0, [Lco/bird/android/model/Point;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/binary/BinaryParser;->parsePoint(Lco/bird/android/model/binary/ValueGetter;ZZ)Lco/bird/android/model/Point;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private parsePolygon(Lco/bird/android/model/binary/ValueGetter;ZZ)Lco/bird/android/model/Polygon;
    .locals 4

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getInt()I

    move-result v0

    new-array v1, v0, [Lco/bird/android/model/LinearRing;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/binary/BinaryParser;->parseLinearRing(Lco/bird/android/model/binary/ValueGetter;ZZ)Lco/bird/android/model/LinearRing;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lco/bird/android/model/Polygon;

    invoke-direct {p1, v1}, Lco/bird/android/model/Polygon;-><init>([Lco/bird/android/model/LinearRing;)V

    return-object p1
.end method

.method public static valueGetterForEndian(Lco/bird/android/model/binary/ByteGetter;)Lco/bird/android/model/binary/ValueGetter;
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Lco/bird/android/model/binary/ValueGetter$XDR;

    invoke-direct {v0, p0}, Lco/bird/android/model/binary/ValueGetter$XDR;-><init>(Lco/bird/android/model/binary/ByteGetter;)V

    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    new-instance v0, Lco/bird/android/model/binary/ValueGetter$NDR;

    invoke-direct {v0, p0}, Lco/bird/android/model/binary/ValueGetter$NDR;-><init>(Lco/bird/android/model/binary/ByteGetter;)V

    return-object v0

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0, v0}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown Endian type:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public declared-synchronized parse(Ljava/lang/String;)Lco/bird/android/model/Geometry;
    .locals 1

    monitor-enter p0

    :try_start_0
    new-instance v0, Lco/bird/android/model/binary/ByteGetter$StringByteGetter;

    invoke-direct {v0, p1}, Lco/bird/android/model/binary/ByteGetter$StringByteGetter;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lco/bird/android/model/binary/BinaryParser;->valueGetterForEndian(Lco/bird/android/model/binary/ByteGetter;)Lco/bird/android/model/binary/ValueGetter;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/model/binary/BinaryParser;->parseGeometry(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/Geometry;

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

.method public declared-synchronized parse([B)Lco/bird/android/model/Geometry;
    .locals 1

    monitor-enter p0

    :try_start_0
    new-instance v0, Lco/bird/android/model/binary/ByteGetter$BinaryByteGetter;

    invoke-direct {v0, p1}, Lco/bird/android/model/binary/ByteGetter$BinaryByteGetter;-><init>([B)V

    invoke-static {v0}, Lco/bird/android/model/binary/BinaryParser;->valueGetterForEndian(Lco/bird/android/model/binary/ByteGetter;)Lco/bird/android/model/binary/ValueGetter;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/model/binary/BinaryParser;->parseGeometry(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/Geometry;

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

.method public parseGeometry(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/Geometry;
    .locals 7

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getByte()B

    move-result v0

    iget-byte v1, p1, Lco/bird/android/model/binary/ValueGetter;->endian:B

    if-ne v0, v1, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getInt()I

    move-result v0

    const v1, 0x1fffffff

    and-int/2addr v1, v0

    const/high16 v2, -0x80000000

    and-int/2addr v2, v0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    const/high16 v5, 0x40000000    # 2.0f

    and-int/2addr v5, v0

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    const/high16 v6, 0x20000000

    and-int/2addr v0, v6

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/binary/ValueGetter;->getInt()I

    move-result v0

    invoke-static {v0}, Lco/bird/android/model/Geometry;->parseSRID(I)I

    move-result v4

    :cond_3
    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown Geometry Type: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryParser;->parseCollection(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/GeometryCollection;

    move-result-object p1

    goto :goto_3

    :pswitch_1
    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryParser;->parseMultiPolygon(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/MultiPolygon;

    move-result-object p1

    goto :goto_3

    :pswitch_2
    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryParser;->parseMultiLineString(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/MultiLineString;

    move-result-object p1

    goto :goto_3

    :pswitch_3
    invoke-direct {p0, p1}, Lco/bird/android/model/binary/BinaryParser;->parseMultiPoint(Lco/bird/android/model/binary/ValueGetter;)Lco/bird/android/model/MultiPoint;

    move-result-object p1

    goto :goto_3

    :pswitch_4
    invoke-direct {p0, p1, v2, v5}, Lco/bird/android/model/binary/BinaryParser;->parsePolygon(Lco/bird/android/model/binary/ValueGetter;ZZ)Lco/bird/android/model/Polygon;

    move-result-object p1

    goto :goto_3

    :pswitch_5
    invoke-direct {p0, p1, v2, v5}, Lco/bird/android/model/binary/BinaryParser;->parseLineString(Lco/bird/android/model/binary/ValueGetter;ZZ)Lco/bird/android/model/LineString;

    move-result-object p1

    goto :goto_3

    :pswitch_6
    invoke-direct {p0, p1, v2, v5}, Lco/bird/android/model/binary/BinaryParser;->parsePoint(Lco/bird/android/model/binary/ValueGetter;ZZ)Lco/bird/android/model/Point;

    move-result-object p1

    :goto_3
    if-eqz v4, :cond_4

    invoke-virtual {p1, v4}, Lco/bird/android/model/Geometry;->setSrid(I)V

    :cond_4
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Endian inconsistency!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

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
