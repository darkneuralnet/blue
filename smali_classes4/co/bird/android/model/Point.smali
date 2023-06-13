.class public Lco/bird/android/model/Point;
.super Lco/bird/android/model/Geometry;
.source "SourceFile"


# static fields
.field public static final CUTINTS:Z = true

.field private static final serialVersionUID:J = 0x100L


# instance fields
.field public m:D

.field public x:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "longitude"
    .end annotation

    .annotation runtime Lft5;
        value = "longitude"
    .end annotation
.end field

.field public y:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "latitude"
    .end annotation

    .annotation runtime Lft5;
        value = "latitude"
    .end annotation
.end field

.field public z:D


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lco/bird/android/model/Geometry;-><init>(I)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lco/bird/android/model/Point;->m:D

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/Point;-><init>()V

    iput-wide p1, p0, Lco/bird/android/model/Point;->x:D

    iput-wide p3, p0, Lco/bird/android/model/Point;->y:D

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lco/bird/android/model/Point;->z:D

    const/4 p1, 0x2

    iput p1, p0, Lco/bird/android/model/Geometry;->dimension:I

    return-void
.end method

.method public constructor <init>(DDD)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/Point;-><init>()V

    iput-wide p1, p0, Lco/bird/android/model/Point;->x:D

    iput-wide p3, p0, Lco/bird/android/model/Point;->y:D

    iput-wide p5, p0, Lco/bird/android/model/Point;->z:D

    const/4 p1, 0x3

    iput p1, p0, Lco/bird/android/model/Geometry;->dimension:I

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

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/Point;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    invoke-direct {p0}, Lco/bird/android/model/Point;-><init>()V

    invoke-virtual {p0, p1}, Lco/bird/android/model/Geometry;->initSRID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "POINTM"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    move p2, v1

    goto :goto_0

    :cond_0
    const-string v0, "POINT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    :cond_1
    :goto_0
    const-string v0, "("

    const-string v2, ")"

    invoke-static {p1, v0, v2}, Lco/bird/android/model/GeometryTokenizer;->removeLeadingAndTrailingStrings(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x20

    invoke-static {p1, v0}, Lco/bird/android/model/GeometryTokenizer;->tokenize(Ljava/lang/String;C)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    iput-wide v2, p0, Lco/bird/android/model/Point;->x:D

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    iput-wide v2, p0, Lco/bird/android/model/Point;->y:D

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_2

    goto :goto_1

    :cond_2
    move v1, v0

    :goto_1
    or-int/2addr p2, v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x3

    if-ne v0, v2, :cond_3

    if-eqz p2, :cond_4

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v3, :cond_5

    :cond_4
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lco/bird/android/model/Point;->z:D

    iput v2, p0, Lco/bird/android/model/Geometry;->dimension:I

    goto :goto_2

    :cond_5
    iput v1, p0, Lco/bird/android/model/Geometry;->dimension:I

    :goto_2
    if-eqz p2, :cond_6

    iget v0, p0, Lco/bird/android/model/Geometry;->dimension:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lco/bird/android/model/Point;->m:D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    iput-boolean p2, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/sql/SQLException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error parsing Point: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private static cutint(Ljava/lang/StringBuilder;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v1

    const/16 v2, 0x2e

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    :cond_0
    return-void
.end method

.method public static double_equals(DD)Z
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    cmpl-double p0, p0, p2

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private findClosestPointToLine(Lco/bird/android/model/Point;Lco/bird/android/model/Point;)Lco/bird/android/model/Point;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-wide v3, v0, Lco/bird/android/model/Point;->x:D

    iget-wide v5, v0, Lco/bird/android/model/Point;->y:D

    iget-wide v7, v1, Lco/bird/android/model/Point;->x:D

    iget-wide v9, v1, Lco/bird/android/model/Point;->y:D

    iget-wide v11, v2, Lco/bird/android/model/Point;->x:D

    iget-wide v1, v2, Lco/bird/android/model/Point;->y:D

    sub-double v13, v3, v7

    sub-double v15, v5, v9

    sub-double v17, v11, v7

    sub-double v19, v1, v9

    mul-double v13, v13, v17

    mul-double v15, v15, v19

    add-double/2addr v13, v15

    mul-double v15, v17, v17

    mul-double v21, v19, v19

    add-double v15, v15, v21

    const-wide/16 v21, 0x0

    cmpl-double v23, v15, v21

    if-eqz v23, :cond_0

    div-double/2addr v13, v15

    goto :goto_0

    :cond_0
    const-wide/high16 v13, -0x4010000000000000L    # -1.0

    :goto_0
    cmpg-double v15, v13, v21

    if-gez v15, :cond_1

    goto :goto_1

    :cond_1
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    cmpl-double v15, v13, v15

    if-lez v15, :cond_2

    move-wide v9, v1

    move-wide v7, v11

    goto :goto_1

    :cond_2
    mul-double v17, v17, v13

    add-double v7, v7, v17

    mul-double v13, v13, v19

    add-double/2addr v9, v13

    :goto_1
    sub-double v12, v3, v7

    sub-double v14, v5, v9

    new-instance v1, Lco/bird/android/model/Point;

    mul-double v2, v12, v12

    mul-double v4, v14, v14

    add-double v16, v2, v4

    move-object v11, v1

    invoke-direct/range {v11 .. v17}, Lco/bird/android/model/Point;-><init>(DDD)V

    return-object v1
.end method

.method public static hashCode(D)I
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p0

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method


# virtual methods
.method public checkConsistency()Z
    .locals 4

    invoke-super {p0}, Lco/bird/android/model/Geometry;->checkConsistency()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lco/bird/android/model/Geometry;->dimension:I

    const/4 v1, 0x3

    const-wide/16 v2, 0x0

    if-eq v0, v1, :cond_0

    iget-wide v0, p0, Lco/bird/android/model/Point;->z:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_2

    :cond_0
    iget-boolean v0, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lco/bird/android/model/Point;->m:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public distance(Lco/bird/android/model/Point;)D
    .locals 9

    iget v0, p0, Lco/bird/android/model/Geometry;->dimension:I

    iget v1, p1, Lco/bird/android/model/Geometry;->dimension:I

    if-ne v0, v1, :cond_3

    iget-wide v1, p0, Lco/bird/android/model/Point;->x:D

    iget-wide v3, p1, Lco/bird/android/model/Point;->x:D

    sub-double/2addr v1, v3

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x3

    if-ne v0, v3, :cond_0

    iget-wide v3, p0, Lco/bird/android/model/Point;->y:D

    iget-wide v5, p1, Lco/bird/android/model/Point;->y:D

    sub-double/2addr v3, v5

    iget-wide v5, p0, Lco/bird/android/model/Point;->z:D

    iget-wide v7, p1, Lco/bird/android/model/Point;->z:D

    sub-double/2addr v5, v7

    mul-double/2addr v1, v1

    mul-double/2addr v3, v3

    add-double/2addr v1, v3

    mul-double/2addr v5, v5

    add-double/2addr v1, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    iget v0, p0, Lco/bird/android/model/Geometry;->dimension:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal dimension of Point"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v3, p0, Lco/bird/android/model/Point;->y:D

    iget-wide v5, p1, Lco/bird/android/model/Point;->y:D

    sub-double/2addr v3, v5

    mul-double/2addr v1, v1

    mul-double/2addr v3, v3

    add-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    return-wide v0

    :cond_2
    mul-double/2addr v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    return-wide v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Points have different dimensions!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final equals(Lco/bird/android/model/Point;)Z
    .locals 10

    iget-wide v0, p0, Lco/bird/android/model/Point;->x:D

    iget-wide v2, p1, Lco/bird/android/model/Point;->x:D

    invoke-static {v0, v1, v2, v3}, Lco/bird/android/model/Point;->double_equals(DD)Z

    move-result v0

    iget-wide v1, p0, Lco/bird/android/model/Point;->y:D

    iget-wide v3, p1, Lco/bird/android/model/Point;->y:D

    invoke-static {v1, v2, v3, v4}, Lco/bird/android/model/Point;->double_equals(DD)Z

    move-result v1

    iget v2, p0, Lco/bird/android/model/Geometry;->dimension:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_1

    iget-wide v2, p0, Lco/bird/android/model/Point;->z:D

    iget-wide v6, p1, Lco/bird/android/model/Point;->z:D

    invoke-static {v2, v3, v6, v7}, Lco/bird/android/model/Point;->double_equals(DD)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v5

    :goto_1
    iget-boolean v3, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    if-eqz v3, :cond_3

    iget-wide v6, p0, Lco/bird/android/model/Point;->m:D

    iget-wide v8, p1, Lco/bird/android/model/Point;->m:D

    invoke-static {v6, v7, v8, v9}, Lco/bird/android/model/Point;->double_equals(DD)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move p1, v4

    goto :goto_3

    :cond_3
    :goto_2
    move p1, v5

    :goto_3
    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    if-eqz v2, :cond_4

    if-eqz p1, :cond_4

    move v4, v5

    :cond_4
    return v4
.end method

.method public equalsintern(Lco/bird/android/model/Geometry;)Z
    .locals 0

    check-cast p1, Lco/bird/android/model/Point;

    invoke-virtual {p0, p1}, Lco/bird/android/model/Point;->equals(Lco/bird/android/model/Point;)Z

    move-result p1

    return p1
.end method

.method public findClosestPointInPolygons(Ljava/util/List;)Lco/bird/android/model/Point;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/Polygon;",
            ">;)",
            "Lco/bird/android/model/Point;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const-wide v1, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/Polygon;

    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v3}, Lco/bird/android/model/Polygon;->numRings()I

    move-result v5

    if-ge v4, v5, :cond_0

    invoke-virtual {v3, v4}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object v5

    iget-object v6, v5, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v6, v6

    const/4 v7, 0x1

    :goto_1
    if-ge v7, v6, :cond_2

    invoke-virtual {v5, v7}, Lco/bird/android/model/PointComposedGeom;->getPoint(I)Lco/bird/android/model/Point;

    move-result-object v8

    add-int/lit8 v9, v7, -0x1

    invoke-virtual {v5, v9}, Lco/bird/android/model/PointComposedGeom;->getPoint(I)Lco/bird/android/model/Point;

    move-result-object v9

    invoke-direct {p0, v8, v9}, Lco/bird/android/model/Point;->findClosestPointToLine(Lco/bird/android/model/Point;Lco/bird/android/model/Point;)Lco/bird/android/model/Point;

    move-result-object v8

    iget-wide v9, v8, Lco/bird/android/model/Point;->z:D

    cmpl-double v11, v1, v9

    if-lez v11, :cond_1

    move-object v0, v8

    move-wide v1, v9

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-eqz v0, :cond_4

    new-instance p1, Lco/bird/android/model/Point;

    iget-wide v1, p0, Lco/bird/android/model/Point;->x:D

    iget-wide v3, v0, Lco/bird/android/model/Point;->x:D

    sub-double/2addr v1, v3

    iget-wide v3, p0, Lco/bird/android/model/Point;->y:D

    iget-wide v5, v0, Lco/bird/android/model/Point;->y:D

    sub-double/2addr v3, v5

    invoke-direct {p1, v1, v2, v3, v4}, Lco/bird/android/model/Point;-><init>(DD)V

    move-object v0, p1

    :cond_4
    return-object v0
.end method

.method public getFirstPoint()Lco/bird/android/model/Point;
    .locals 0

    return-object p0
.end method

.method public getLastPoint()Lco/bird/android/model/Point;
    .locals 0

    return-object p0
.end method

.method public getM()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/Point;->m:D

    return-wide v0
.end method

.method public getPoint(I)Lco/bird/android/model/Point;
    .locals 3

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Point only has a single Point! "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getX()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/Point;->x:D

    return-wide v0
.end method

.method public getY()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/Point;->y:D

    return-wide v0
.end method

.method public getZ()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/Point;->z:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    invoke-super {p0}, Lco/bird/android/model/Geometry;->hashCode()I

    move-result v0

    iget-wide v1, p0, Lco/bird/android/model/Point;->x:D

    invoke-static {v1, v2}, Lco/bird/android/model/Point;->hashCode(D)I

    move-result v1

    xor-int/2addr v0, v1

    iget-wide v1, p0, Lco/bird/android/model/Point;->y:D

    invoke-static {v1, v2}, Lco/bird/android/model/Point;->hashCode(D)I

    move-result v1

    xor-int/2addr v0, v1

    iget-wide v1, p0, Lco/bird/android/model/Point;->z:D

    invoke-static {v1, v2}, Lco/bird/android/model/Point;->hashCode(D)I

    move-result v1

    xor-int/2addr v0, v1

    iget-wide v1, p0, Lco/bird/android/model/Point;->m:D

    invoke-static {v1, v2}, Lco/bird/android/model/Point;->hashCode(D)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public innerWKT(Ljava/lang/StringBuilder;)V
    .locals 3

    iget-wide v0, p0, Lco/bird/android/model/Point;->x:D

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lco/bird/android/model/Point;->cutint(Ljava/lang/StringBuilder;)V

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/bird/android/model/Point;->y:D

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lco/bird/android/model/Point;->cutint(Ljava/lang/StringBuilder;)V

    iget v1, p0, Lco/bird/android/model/Geometry;->dimension:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/bird/android/model/Point;->z:D

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lco/bird/android/model/Point;->cutint(Ljava/lang/StringBuilder;)V

    :cond_0
    iget-boolean v1, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lco/bird/android/model/Point;->m:D

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lco/bird/android/model/Point;->cutint(Ljava/lang/StringBuilder;)V

    :cond_1
    return-void
.end method

.method public numPoints()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setM(D)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    iput-wide p1, p0, Lco/bird/android/model/Point;->m:D

    return-void
.end method

.method public setX(D)V
    .locals 0

    iput-wide p1, p0, Lco/bird/android/model/Point;->x:D

    return-void
.end method

.method public setX(I)V
    .locals 2

    int-to-double v0, p1

    iput-wide v0, p0, Lco/bird/android/model/Point;->x:D

    return-void
.end method

.method public setY(D)V
    .locals 0

    iput-wide p1, p0, Lco/bird/android/model/Point;->y:D

    return-void
.end method

.method public setY(I)V
    .locals 2

    int-to-double v0, p1

    iput-wide v0, p0, Lco/bird/android/model/Point;->y:D

    return-void
.end method

.method public setZ(D)V
    .locals 0

    iput-wide p1, p0, Lco/bird/android/model/Point;->z:D

    return-void
.end method

.method public setZ(I)V
    .locals 2

    int-to-double v0, p1

    iput-wide v0, p0, Lco/bird/android/model/Point;->z:D

    return-void
.end method
