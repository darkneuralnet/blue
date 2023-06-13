.class public Lco/bird/android/model/LinearRing;
.super Lco/bird/android/model/PointComposedGeom;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x100L


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/LinearRing;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/bird/android/model/PointComposedGeom;-><init>(I)V

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v1, "("

    const-string v2, ")"

    invoke-static {p1, v1, v2}, Lco/bird/android/model/GeometryTokenizer;->removeLeadingAndTrailingStrings(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x2c

    invoke-static {p1, v1}, Lco/bird/android/model/GeometryTokenizer;->tokenize(Ljava/lang/String;C)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [Lco/bird/android/model/Point;

    move v3, v0

    :goto_0
    if-ge v3, v1, :cond_0

    new-instance v4, Lco/bird/android/model/Point;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v4, v5, p2}, Lco/bird/android/model/Point;-><init>(Ljava/lang/String;Z)V

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    aget-object p1, v2, v0

    iget p2, p1, Lco/bird/android/model/Geometry;->dimension:I

    iput p2, p0, Lco/bird/android/model/Geometry;->dimension:I

    iget-boolean p1, p1, Lco/bird/android/model/Geometry;->haveMeasure:Z

    iput-boolean p1, p0, Lco/bird/android/model/Geometry;->haveMeasure:Z

    iput-object v2, p0, Lco/bird/android/model/ComposedGeom;->subgeoms:[Lco/bird/android/model/Geometry;

    return-void
.end method

.method public constructor <init>([Lco/bird/android/model/Point;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lco/bird/android/model/PointComposedGeom;-><init>(I[Lco/bird/android/model/Point;)V

    return-void
.end method
