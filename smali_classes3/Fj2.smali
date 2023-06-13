.class public final LFj2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a$\u0010\u0004\u001a\u00028\u0000\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a \u0010\u0007\u001a\u00028\u0000\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0006H\u0086\u0008\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\"\u0010\t\u001a\u0004\u0018\u00018\u0000\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0006H\u0086\u0008\u00a2\u0006\u0004\u0008\t\u0010\u0008\u001a\u0014\u0010\r\u001a\u00020\u0000*\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\n\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\"#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "LWB1;",
        "T",
        "",
        "wkt",
        "geometryFromWkt",
        "(Ljava/lang/String;)LWB1;",
        "Lco/bird/android/model/Geometry;",
        "toJtsGeometry",
        "(Lco/bird/android/model/Geometry;)LWB1;",
        "maybeToJtsGeometry",
        "Landroid/location/Location;",
        "",
        "radius",
        "a",
        "LFW3;",
        "c",
        "Lco/bird/android/model/Polygon;",
        "b",
        "Landroid/util/LruCache;",
        "Landroid/util/LruCache;",
        "d",
        "()Landroid/util/LruCache;",
        "geometryCache",
        "geo_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nJtsGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,87:1\n35#1:88\n11335#2:89\n11670#2,3:90\n37#3,2:93\n*S KotlinDebug\n*F\n+ 1 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n*L\n46#1:88\n82#1:89\n82#1:90,3\n82#1:93,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Lco/bird/android/model/Geometry;",
            "LWB1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFj2$a;

    invoke-direct {v0}, LFj2$a;-><init>()V

    sput-object v0, LFj2;->a:Landroid/util/LruCache;

    return-void
.end method

.method public static final a(Landroid/location/Location;D)LWB1;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance p1, LbC1;

    invoke-direct {p1}, LbC1;-><init>()V

    new-instance p2, LyB0;

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-direct {p2, v0, v1, v2, v3}, LyB0;-><init>(DD)V

    invoke-virtual {p1, p2}, LbC1;->t(LyB0;)LFW3;

    move-result-object p0

    const-string p1, "GeometryFactory().create\u2026ate(longitude, latitude))"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_1
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double/2addr p1, v0

    new-instance v0, LVB1;

    invoke-direct {v0}, LVB1;-><init>()V

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, LVB1;->f(I)V

    new-instance v1, LyB0;

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, LyB0;-><init>(DD)V

    invoke-virtual {v0, v1}, LVB1;->d(LyB0;)V

    const-wide v1, 0x40fb2d8000000000L    # 111320.0

    div-double v1, p1, v1

    invoke-virtual {v0, v1, v2}, LVB1;->e(D)V

    const v1, 0x2637ef8

    int-to-double v1, v1

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    mul-double/2addr v1, v3

    const/16 p0, 0x168

    int-to-double v3, p0

    div-double/2addr v1, v3

    div-double/2addr p1, v1

    invoke-virtual {v0, p1, p2}, LVB1;->g(D)V

    invoke-virtual {v0}, LVB1;->b()LCX3;

    move-result-object p0

    const-string p1, "with(GeometricShapeFacto\u2026)\n    createEllipse()\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(Landroid/location/Location;D)Lco/bird/android/model/Polygon;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LFj2;->a(Landroid/location/Location;D)LWB1;

    move-result-object p0

    instance-of p1, p0, LCX3;

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    check-cast p0, LCX3;

    invoke-virtual {p0}, LCX3;->L0()LKr2;

    move-result-object p0

    invoke-virtual {p0}, LBr2;->Y()[LyB0;

    move-result-object p0

    const-string p1, "geometry.exteriorRing.coordinates"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    new-instance v4, Lco/bird/android/model/Point;

    iget-wide v5, v3, LyB0;->b:D

    iget-wide v7, v3, LyB0;->c:D

    invoke-direct {v4, v5, v6, v7, v8}, Lco/bird/android/model/Point;-><init>(DD)V

    invoke-interface {p1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-array p0, v0, [Lco/bird/android/model/Point;

    invoke-interface {p1, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lco/bird/android/model/Point;

    goto :goto_1

    :cond_1
    new-array p1, p2, [Lco/bird/android/model/Point;

    new-instance v1, Lco/bird/android/model/Point;

    invoke-virtual {p0}, LWB1;->W()LyB0;

    move-result-object v2

    iget-wide v2, v2, LyB0;->b:D

    invoke-virtual {p0}, LWB1;->W()LyB0;

    move-result-object p0

    iget-wide v4, p0, LyB0;->c:D

    invoke-direct {v1, v2, v3, v4, v5}, Lco/bird/android/model/Point;-><init>(DD)V

    aput-object v1, p1, v0

    move-object p0, p1

    :goto_1
    new-instance p1, Lco/bird/android/model/Polygon;

    new-array p2, p2, [Lco/bird/android/model/LinearRing;

    new-instance v1, Lco/bird/android/model/LinearRing;

    invoke-direct {v1, p0}, Lco/bird/android/model/LinearRing;-><init>([Lco/bird/android/model/Point;)V

    aput-object v1, p2, v0

    invoke-direct {p1, p2}, Lco/bird/android/model/Polygon;-><init>([Lco/bird/android/model/LinearRing;)V

    return-object p1
.end method

.method public static final c(Landroid/location/Location;)LFW3;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LbC1;

    invoke-direct {v0}, LbC1;-><init>()V

    new-instance v1, LyB0;

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, LyB0;-><init>(DD)V

    invoke-virtual {v0, v1}, LbC1;->t(LyB0;)LFW3;

    move-result-object p0

    const-string v0, "GeometryFactory().create\u2026ate(longitude, latitude))"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic createCircleGeometry$default(Landroid/location/Location;DILjava/lang/Object;)LWB1;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    float-to-double p1, p1

    :cond_0
    invoke-static {p0, p1, p2}, LFj2;->a(Landroid/location/Location;D)LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createCirclePolygon$default(Landroid/location/Location;DILjava/lang/Object;)Lco/bird/android/model/Polygon;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    float-to-double p1, p1

    :cond_0
    invoke-static {p0, p1, p2}, LFj2;->b(Landroid/location/Location;D)Lco/bird/android/model/Polygon;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Landroid/util/LruCache;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/LruCache<",
            "Lco/bird/android/model/Geometry;",
            "LWB1;",
            ">;"
        }
    .end annotation

    sget-object v0, LFj2;->a:Landroid/util/LruCache;

    return-object v0
.end method

.method public static final synthetic geometryFromWkt(Ljava/lang/String;)LWB1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LWB1;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-string v0, "wkt"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljw6;

    invoke-direct {v0}, Ljw6;-><init>()V

    invoke-virtual {v0, p0}, Ljw6;->v(Ljava/lang/String;)LWB1;

    move-result-object p0

    const/4 v0, 0x1

    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    return-object p0
.end method

.method public static final synthetic maybeToJtsGeometry(Lco/bird/android/model/Geometry;)LWB1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LWB1;",
            ">(",
            "Lco/bird/android/model/Geometry;",
            ")TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, LFj2;->d()Landroid/util/LruCache;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "T"

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    check-cast p0, LWB1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final synthetic toJtsGeometry(Lco/bird/android/model/Geometry;)LWB1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LWB1;",
            ">(",
            "Lco/bird/android/model/Geometry;",
            ")TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LFj2;->d()Landroid/util/LruCache;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x1

    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    check-cast p0, LWB1;

    return-object p0
.end method
