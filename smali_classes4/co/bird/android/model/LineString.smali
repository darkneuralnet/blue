.class public Lco/bird/android/model/LineString;
.super Lco/bird/android/model/PointComposedGeom;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x100L


# instance fields
.field len:D


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lco/bird/android/model/PointComposedGeom;-><init>(I)V

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lco/bird/android/model/LineString;->len:D

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lco/bird/android/model/PointComposedGeom;-><init>(ILjava/lang/String;)V

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lco/bird/android/model/LineString;->len:D

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1, p2}, Lco/bird/android/model/PointComposedGeom;-><init>(ILjava/lang/String;Z)V

    const-wide/high16 p1, -0x4010000000000000L    # -1.0

    iput-wide p1, p0, Lco/bird/android/model/LineString;->len:D

    return-void
.end method

.method public constructor <init>([Lco/bird/android/model/Point;)V
    .locals 2

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lco/bird/android/model/PointComposedGeom;-><init>(I[Lco/bird/android/model/Point;)V

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lco/bird/android/model/LineString;->len:D

    return-void
.end method


# virtual methods
.method public concat(Lco/bird/android/model/LineString;)Lco/bird/android/model/LineString;
    .locals 7

    invoke-virtual {p0}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/ComposedGeom;->getLastPoint()Lco/bird/android/model/Point;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/ComposedGeom;->getLastPoint()Lco/bird/android/model/Point;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/ComposedGeom;->getFirstPoint()Lco/bird/android/model/Point;

    move-result-object v5

    invoke-virtual {v2, v5}, Lco/bird/android/model/Point;->equals(Lco/bird/android/model/Point;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v4

    :goto_1
    array-length v5, v0

    array-length v6, v1

    add-int/2addr v5, v6

    sub-int/2addr v5, v2

    new-array v5, v5, [Lco/bird/android/model/Point;

    :goto_2
    array-length v6, v0

    if-ge v3, v6, :cond_2

    aget-object v6, v0, v3

    aput-object v6, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    if-nez v2, :cond_3

    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p1}, Lco/bird/android/model/ComposedGeom;->getFirstPoint()Lco/bird/android/model/Point;

    move-result-object p1

    aput-object p1, v5, v3

    move v3, v0

    :cond_3
    move p1, v4

    :goto_3
    array-length v0, v1

    if-ge p1, v0, :cond_4

    aget-object v0, v1, p1

    aput-object v0, v5, v3

    add-int/lit8 p1, p1, 0x1

    add-int/2addr v3, v4

    goto :goto_3

    :cond_4
    new-instance p1, Lco/bird/android/model/LineString;

    invoke-direct {p1, v5}, Lco/bird/android/model/LineString;-><init>([Lco/bird/android/model/Point;)V

    return-object p1
.end method

.method public length()D
    .locals 6

    iget-wide v0, p0, Lco/bird/android/model/LineString;->len:D

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    invoke-virtual {p0}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object v0

    if-eqz v0, :cond_2

    array-length v1, v0

    const/4 v4, 0x2

    if-ge v1, v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    :goto_0
    array-length v4, v0

    if-ge v1, v4, :cond_1

    add-int/lit8 v4, v1, -0x1

    aget-object v4, v0, v4

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Lco/bird/android/model/Point;->distance(Lco/bird/android/model/Point;)D

    move-result-wide v4

    add-double/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iput-wide v2, p0, Lco/bird/android/model/LineString;->len:D

    goto :goto_2

    :cond_2
    :goto_1
    iput-wide v2, p0, Lco/bird/android/model/LineString;->len:D

    :cond_3
    :goto_2
    iget-wide v0, p0, Lco/bird/android/model/LineString;->len:D

    return-wide v0
.end method

.method public reverse()Lco/bird/android/model/LineString;
    .locals 6

    invoke-virtual {p0}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object v0

    array-length v1, v0

    new-array v2, v1, [Lco/bird/android/model/Point;

    add-int/lit8 v3, v1, -0x1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v5, v0, v3

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lco/bird/android/model/LineString;

    invoke-direct {v0, v2}, Lco/bird/android/model/LineString;-><init>([Lco/bird/android/model/Point;)V

    return-object v0
.end method
