.class public final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0015\u0010\u000b\u001a\u00020\u000c*\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0082\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u000c*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0008H\u0082\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u000c*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\"\u001e\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\" \u0010\u0006\u001a\u00020\u0003*\n\u0012\u0006\u0008\u0001\u0012\u00020\u00080\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "points",
        "",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "getPoints",
        "(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;",
        "toLatLngBounds",
        "",
        "Lco/bird/android/model/Point;",
        "getToLatLngBounds",
        "([Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLngBounds;",
        "contains",
        "",
        "visibleRegion",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        "point",
        "shouldInvert",
        "Lco/bird/android/model/wire/configs/MobileMapConfigView;",
        "zoomLevel",
        "",
        "co.bird.android.feature.map"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n1747#2,3:519\n13579#3,2:522\n1#4:524\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt\n*L\n435#1:519,3\n453#1:522,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$contains(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/VisibleRegion;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;->contains(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/VisibleRegion;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$contains(Lcom/google/android/gms/maps/model/VisibleRegion;Lco/bird/android/model/Point;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;->contains(Lcom/google/android/gms/maps/model/VisibleRegion;Lco/bird/android/model/Point;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getPoints(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;->getPoints(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getToLatLngBounds([Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;->getToLatLngBounds([Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$shouldInvert(Lco/bird/android/model/wire/configs/MobileMapConfigView;F)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;->shouldInvert(Lco/bird/android/model/wire/configs/MobileMapConfigView;F)Z

    move-result p0

    return p0
.end method

.method private static final contains(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/VisibleRegion;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    const-string v0, "visibleRegion.latLngBounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;->getPoints(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1
.end method

.method private static final contains(Lcom/google/android/gms/maps/model/VisibleRegion;Lco/bird/android/model/Point;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result p0

    return p0
.end method

.method private static final getPoints(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->c:Lcom/google/android/gms/maps/model/LatLng;

    const-string v2, "northeast"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->c:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-object v4, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->b:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->b:Lcom/google/android/gms/maps/model/LatLng;

    const-string v2, "southwest"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->b:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-object p0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->c:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, p0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/4 p0, 0x3

    aput-object v1, v0, p0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final getToLatLngBounds([Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 15

    array-length v0, p0

    const-wide/16 v1, 0x1

    const-wide v3, 0x7fefffffffffffffL    # Double.MAX_VALUE

    const/4 v5, 0x0

    move-wide v7, v3

    move v9, v5

    move-wide v3, v1

    move-wide v5, v7

    :goto_0
    if-ge v9, v0, :cond_4

    aget-object v10, p0, v9

    iget-wide v11, v10, Lco/bird/android/model/Point;->y:D

    cmpl-double v13, v11, v1

    if-lez v13, :cond_0

    move-wide v1, v11

    :cond_0
    iget-wide v13, v10, Lco/bird/android/model/Point;->x:D

    cmpg-double v10, v13, v7

    if-gez v10, :cond_1

    move-wide v7, v13

    :cond_1
    cmpg-double v10, v11, v5

    if-gez v10, :cond_2

    move-wide v5, v11

    :cond_2
    cmpl-double v10, v13, v3

    if-lez v10, :cond_3

    move-wide v3, v13

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_4
    new-instance p0, Lcom/google/android/gms/maps/model/LatLngBounds;

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v0, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v5, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v5, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-direct {p0, v0, v5}, Lcom/google/android/gms/maps/model/LatLngBounds;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    return-object p0
.end method

.method private static final shouldInvert(Lco/bird/android/model/wire/configs/MobileMapConfigView;F)Z
    .locals 3

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getOperationalZoneInversion()Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;->getEnabled()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;->getZoomLevelThreshold()Ljava/lang/Float;

    move-result-object p0

    const/4 v1, 0x1

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    cmpl-float p0, p1, p0

    if-ltz p0, :cond_1

    move p0, v1

    goto :goto_0

    :cond_1
    move p0, v0

    :goto_0
    if-ne p0, v1, :cond_2

    move p0, v1

    goto :goto_1

    :cond_2
    move p0, v0

    :goto_1
    if-eqz p0, :cond_3

    move v0, v1

    :cond_3
    return v0
.end method
