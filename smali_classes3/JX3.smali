.class public final LJX3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a&\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u0000*\u0008\u0012\u0004\u0012\u00020\u00000\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/model/Polygon;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "location",
        "",
        "c",
        "Landroid/location/Location;",
        "",
        "accuracyLimit",
        "additionalAccuracyBuffer",
        "b",
        "meters",
        "e",
        "(Lco/bird/android/model/Polygon;DLandroid/location/Location;D)Ljava/lang/Boolean;",
        "Lco/bird/android/model/Point;",
        "a",
        "Lkotlin/reflect/KClass;",
        "f",
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
        "SMAP\nPolygon+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polygon+.kt\nco/bird/android/geo/extension/Polygon_Kt\n+ 2 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,64:1\n35#2:65\n45#2,2:66\n35#2:68\n47#2,3:69\n35#2:72\n1#3:73\n1229#4,2:74\n*S KotlinDebug\n*F\n+ 1 Polygon+.kt\nco/bird/android/geo/extension/Polygon_Kt\n*L\n41#1:65\n57#1:66,2\n57#1:68\n57#1:69,3\n60#1:72\n20#1:74,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/Polygon;)Lco/bird/android/model/Point;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LFj2;->d()Landroid/util/LruCache;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, LCX3;

    invoke-virtual {p0}, LWB1;->U()LFW3;

    move-result-object p0

    new-instance v0, Lco/bird/android/model/Point;

    invoke-virtual {p0}, LFW3;->M0()D

    move-result-wide v1

    invoke-virtual {p0}, LFW3;->O0()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lco/bird/android/model/Point;-><init>(DD)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type org.locationtech.jts.geom.Polygon"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lco/bird/android/model/Polygon;Landroid/location/Location;DD)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v0, v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p2

    add-double/2addr p2, p4

    invoke-static {}, LFj2;->d()Landroid/util/LruCache;

    move-result-object p4

    invoke-virtual {p4, p0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, LCX3;

    invoke-static {p1, p2, p3}, LFj2;->a(Landroid/location/Location;D)LWB1;

    move-result-object p1

    invoke-virtual {p0, p1}, LWB1;->q0(LWB1;)Z

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type org.locationtech.jts.geom.Polygon"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Lco/bird/android/model/Polygon;Lcom/google/android/gms/maps/model/LatLng;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/Polygon;->numRings()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, p0, v1, v0}, LJX3;->d(Lcom/google/android/gms/maps/model/LatLng;Lco/bird/android/model/Polygon;II)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/Polygon;->numRings()I

    move-result v2

    invoke-static {p1, p0, v0, v2}, LJX3;->d(Lcom/google/android/gms/maps/model/LatLng;Lco/bird/android/model/Polygon;II)Z

    move-result p0

    if-nez p0, :cond_1

    move v1, v0

    :cond_1
    return v1
.end method

.method public static synthetic contains$default(Lco/bird/android/model/Polygon;Landroid/location/Location;DDILjava/lang/Object;)Z
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const-wide p2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const-wide/16 p4, 0x0

    :cond_1
    move-wide v4, p4

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, LJX3;->b(Lco/bird/android/model/Polygon;Landroid/location/Location;DD)Z

    move-result p0

    return p0
.end method

.method public static final d(Lcom/google/android/gms/maps/model/LatLng;Lco/bird/android/model/Polygon;II)Z
    .locals 0

    invoke-static {p2, p3}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p2

    new-instance p3, LJX3$a;

    invoke-direct {p3, p1}, LJX3$a;-><init>(Lco/bird/android/model/Polygon;)V

    invoke-static {p2, p3}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    const/4 p3, 0x1

    invoke-static {p0, p2, p3}, LBX3;->b(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/List;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    :goto_0
    return p3
.end method

.method public static final e(Lco/bird/android/model/Polygon;DLandroid/location/Location;D)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v0, v0

    invoke-static {p4, p5, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p4

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, LFj2;->d()Landroid/util/LruCache;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, LCX3;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type org.locationtech.jts.geom.Polygon"

    invoke-direct {p0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    add-double/2addr p4, p1

    invoke-static {p3, p4, p5}, LFj2;->a(Landroid/location/Location;D)LWB1;

    move-result-object p1

    invoke-virtual {p0, p1}, LWB1;->q0(LWB1;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static final f(Lkotlin/reflect/KClass;)Lco/bird/android/model/Polygon;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KClass<",
            "Lco/bird/android/model/Polygon;",
            ">;)",
            "Lco/bird/android/model/Polygon;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "POLYGON((-146.57092524067605 28.541664128618446,-144.72522211567605 28.541664128618446,-144.72522211567605 26.75108895354207,-146.57092524067605 26.75108895354207,-146.57092524067605 28.541664128618446))"

    invoke-static {p0}, Lco/bird/android/model/GeometryBuilder;->geomFromString(Ljava/lang/String;)Lco/bird/android/model/Geometry;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type co.bird.android.model.Polygon"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lco/bird/android/model/Polygon;

    return-object p0
.end method

.method public static synthetic maybeWithinMetersOfLocation$default(Lco/bird/android/model/Polygon;DLandroid/location/Location;DILjava/lang/Object;)Ljava/lang/Boolean;
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const-wide p4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :cond_0
    move-wide v4, p4

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-static/range {v0 .. v5}, LJX3;->e(Lco/bird/android/model/Polygon;DLandroid/location/Location;D)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
