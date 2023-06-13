.class public Lco/bird/android/model/MultiLineString;
.super Lco/bird/android/model/ComposedGeom;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x100L


# instance fields
.field len:D


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lco/bird/android/model/ComposedGeom;-><init>(I)V

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lco/bird/android/model/MultiLineString;->len:D

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

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/MultiLineString;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-direct {p0, v0, p1, p2}, Lco/bird/android/model/ComposedGeom;-><init>(ILjava/lang/String;Z)V

    const-wide/high16 p1, -0x4010000000000000L    # -1.0

    iput-wide p1, p0, Lco/bird/android/model/MultiLineString;->len:D

    return-void
.end method

.method public constructor <init>([Lco/bird/android/model/LineString;)V
    .locals 2

    const/4 v0, 0x5

    invoke-direct {p0, v0, p1}, Lco/bird/android/model/ComposedGeom;-><init>(I[Lco/bird/android/model/Geometry;)V

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lco/bird/android/model/MultiLineString;->len:D

    return-void
.end method


# virtual methods
.method public createSubGeomArray(I)[Lco/bird/android/model/Geometry;
    .locals 0

    new-array p1, p1, [Lco/bird/android/model/LineString;

    return-object p1
.end method

.method public createSubGeomInstance(Ljava/lang/String;Z)Lco/bird/android/model/Geometry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    new-instance v0, Lco/bird/android/model/LineString;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/LineString;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public getLine(I)Lco/bird/android/model/LineString;
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

    check-cast p1, Lco/bird/android/model/LineString;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public getLines()[Lco/bird/android/model/LineString;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    invoke-virtual {v0}, [Lco/bird/android/model/Geometry;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/LineString;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-super {p0}, Lco/bird/android/model/ComposedGeom;->hashCode()I

    move-result v0

    invoke-virtual {p0}, Lco/bird/android/model/MultiLineString;->length()D

    move-result-wide v1

    double-to-int v1, v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public length()D
    .locals 6

    iget-wide v0, p0, Lco/bird/android/model/MultiLineString;->len:D

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    check-cast v0, [Lco/bird/android/model/LineString;

    array-length v1, v0

    const/4 v4, 0x1

    if-ge v1, v4, :cond_0

    iput-wide v2, p0, Lco/bird/android/model/MultiLineString;->len:D

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    array-length v4, v0

    if-ge v1, v4, :cond_1

    aget-object v4, v0, v1

    invoke-virtual {v4}, Lco/bird/android/model/LineString;->length()D

    move-result-wide v4

    add-double/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iput-wide v2, p0, Lco/bird/android/model/MultiLineString;->len:D

    :cond_2
    :goto_1
    iget-wide v0, p0, Lco/bird/android/model/MultiLineString;->len:D

    return-wide v0
.end method

.method public numLines()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    array-length v0, v0

    return v0
.end method
