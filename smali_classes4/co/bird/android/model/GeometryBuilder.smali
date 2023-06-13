.class public Lco/bird/android/model/GeometryBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final SRIDPREFIX:Ljava/lang/String; = "SRID="


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static geomFromString(Ljava/lang/String;)Lco/bird/android/model/Geometry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lco/bird/android/model/GeometryBuilder;->geomFromString(Ljava/lang/String;Z)Lco/bird/android/model/Geometry;

    move-result-object p0

    return-object p0
.end method

.method public static geomFromString(Ljava/lang/String;Lco/bird/android/model/binary/BinaryParser;)Lco/bird/android/model/Geometry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lco/bird/android/model/GeometryBuilder;->geomFromString(Ljava/lang/String;Lco/bird/android/model/binary/BinaryParser;Z)Lco/bird/android/model/Geometry;

    move-result-object p0

    return-object p0
.end method

.method public static geomFromString(Ljava/lang/String;Lco/bird/android/model/binary/BinaryParser;Z)Lco/bird/android/model/Geometry;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v0, "SRID="

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lco/bird/android/model/GeometryBuilder;->splitSRID(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    aget-object v0, p0, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    aget-object p0, p0, v1

    const/4 v1, 0x5

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Lco/bird/android/model/Geometry;->parseSRID(I)I

    move-result v1

    move-object p0, v0

    :cond_0
    const-string v0, "00"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "01"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string p1, "EMPTY"

    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p0, Lco/bird/android/model/GeometryCollection;

    invoke-direct {p0}, Lco/bird/android/model/GeometryCollection;-><init>()V

    goto/16 :goto_2

    :cond_2
    const-string p1, "MULTIPOLYGON"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lco/bird/android/model/MultiPolygon;

    invoke-direct {p1, p0, p2}, Lco/bird/android/model/MultiPolygon;-><init>(Ljava/lang/String;Z)V

    :goto_0
    move-object p0, p1

    goto/16 :goto_2

    :cond_3
    const-string p1, "MULTILINESTRING"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Lco/bird/android/model/MultiLineString;

    invoke-direct {p1, p0, p2}, Lco/bird/android/model/MultiLineString;-><init>(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_4
    const-string p1, "MULTIPOINT"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Lco/bird/android/model/MultiPoint;

    invoke-direct {p1, p0, p2}, Lco/bird/android/model/MultiPoint;-><init>(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_5
    const-string p1, "POLYGON"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Lco/bird/android/model/Polygon;

    invoke-direct {p1, p0, p2}, Lco/bird/android/model/Polygon;-><init>(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_6
    const-string p1, "LINESTRING"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lco/bird/android/model/LineString;

    invoke-direct {p1, p0, p2}, Lco/bird/android/model/LineString;-><init>(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_7
    const-string p1, "POINT"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance p1, Lco/bird/android/model/Point;

    invoke-direct {p1, p0, p2}, Lco/bird/android/model/Point;-><init>(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_8
    const-string p1, "GEOMETRYCOLLECTION"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Lco/bird/android/model/GeometryCollection;

    invoke-direct {p1, p0, p2}, Lco/bird/android/model/GeometryCollection;-><init>(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_9
    new-instance p1, Ljava/sql/SQLException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown type: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    :goto_1
    invoke-virtual {p1, p0}, Lco/bird/android/model/binary/BinaryParser;->parse(Ljava/lang/String;)Lco/bird/android/model/Geometry;

    move-result-object p0

    :goto_2
    if-eqz v1, :cond_b

    iput v1, p0, Lco/bird/android/model/Geometry;->srid:I

    :cond_b
    return-object p0
.end method

.method public static geomFromString(Ljava/lang/String;Z)Lco/bird/android/model/Geometry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    new-instance v0, Lco/bird/android/model/binary/BinaryParser;

    invoke-direct {v0}, Lco/bird/android/model/binary/BinaryParser;-><init>()V

    invoke-static {p0, v0, p1}, Lco/bird/android/model/GeometryBuilder;->geomFromString(Ljava/lang/String;Lco/bird/android/model/binary/BinaryParser;Z)Lco/bird/android/model/Geometry;

    move-result-object p0

    return-object p0
.end method

.method public static splitSRID(Ljava/lang/String;)[Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/16 v0, 0x3b

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v2

    return-object v1

    :cond_0
    new-instance p0, Ljava/sql/SQLException;

    const-string v0, "Error parsing Geometry - SRID not delimited with \';\' "

    invoke-direct {p0, v0}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
