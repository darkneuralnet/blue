.class public final Lco/bird/android/app/feature/map/GoogleMap_Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0008\u001a\u00020\u0001*\u00020\u0001\u001a\u0010\u0010\n\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00030\t\u001a\u0015\u0010\r\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\r\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000fH\u0086\u0002\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001\u001a$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u00122\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0013\u001a$\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005\u001a\u000c\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002\u001a\u000c\u0010!\u001a\u00020\u001f*\u00020\u001eH\u0002\u001a\n\u0010#\u001a\u00020\u0003*\u00020\"\u001a\u0016\u0010%\u001a\u0004\u0018\u00010\u0003*\u00020$2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00000\'*\u00020&\u001a\n\u0010#\u001a\u00020\u0003*\u00020)\u001a\u0010\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u000b\u001a\n\u0010,\u001a\u00020+*\u00020\u000e\u001a\u0012\u0010/\u001a\u00020\u0003*\u00020\u00032\u0006\u0010.\u001a\u00020-\u001a\u0016\u00102\u001a\u0002012\u0006\u0010\n\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0001\u001a\u0010\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0013*\u000201\"\u0014\u00104\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00084\u00105\"\u0014\u00106\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00086\u00107\"\u0014\u00108\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00088\u00107\")\u0010<\u001a\u0014\u0012\u0004\u0012\u00020:\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020;0\u0013098\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\u00a8\u0006@"
    }
    d2 = {
        "LcD1;",
        "",
        "visibleRadius",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "latLng",
        "",
        "visibleRegionContains",
        "nearbyRadius",
        "adjustedNearbyRadius",
        "",
        "center",
        "Lco/bird/android/model/Polygon;",
        "location",
        "contains",
        "Lco/bird/android/model/persistence/Area;",
        "Landroid/location/Location;",
        "latitude",
        "longitude",
        "Lco/bird/android/app/feature/map/renderer/RichLayer;",
        "",
        "areas",
        "",
        "Lzp0;",
        "addPolygons",
        "LPT;",
        "bitmapDescriptor",
        "selected",
        "visible",
        "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
        "groundOverLayOptions",
        "",
        "",
        "inDemandAreaLabelOverlayWidth",
        "areaLabelOverlayWidth",
        "Lco/bird/android/model/Point;",
        "toLatLng",
        "LDX3;",
        "locationWithinClosestTo",
        "Lcom/google/android/gms/maps/MapView;",
        "Lio/reactivex/F;",
        "getMap",
        "Lco/bird/android/model/wire/WireLocation;",
        "toPoints",
        "Lco/bird/android/app/feature/map/ZIndexZoneType;",
        "zIndexType",
        "Lcom/google/android/gms/maps/model/LatLngBounds$a;",
        "builder",
        "includeInBounds",
        "radiusMeters",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "createBounds",
        "points",
        "AREA_BORDER_STROKE_THICKNESS_PX",
        "F",
        "NEARBY_RADIUS_PADDING_MULTIPLIER",
        "D",
        "METERS_IN_DEGREE_LATITUDE",
        "Landroid/util/LruCache;",
        "",
        "LVO4;",
        "simplifiedPolyCache",
        "Landroid/util/LruCache;",
        "getSimplifiedPolyCache",
        "()Landroid/util/LruCache;",
        "co.bird.android.feature.map"
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
        "SMAP\nGoogleMap+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap+.kt\nco/bird/android/app/feature/map/GoogleMap_Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,261:1\n11335#2:262\n11670#2,3:263\n11335#2:266\n11670#2,3:267\n1#3:270\n1229#4,2:271\n*S KotlinDebug\n*F\n+ 1 GoogleMap+.kt\nco/bird/android/app/feature/map/GoogleMap_Kt\n*L\n145#1:262\n145#1:263,3\n230#1:266\n230#1:267,3\n95#1:271,2\n*E\n"
    }
.end annotation


# static fields
.field private static final AREA_BORDER_STROKE_THICKNESS_PX:F = 3.0f

.field private static final METERS_IN_DEGREE_LATITUDE:D = 111319.9

.field private static final NEARBY_RADIUS_PADDING_MULTIPLIER:D = 1.2

.field private static final simplifiedPolyCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "LVO4;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x200

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    sput-object v0, Lco/bird/android/app/feature/map/GoogleMap_Kt;->simplifiedPolyCache:Landroid/util/LruCache;

    return-void
.end method

.method public static final addPolygons(Lco/bird/android/app/feature/map/renderer/RichLayer;Ljava/util/List;)Ljava/util/Map;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/renderer/RichLayer;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;)",
            "Ljava/util/Map<",
            "Lco/bird/android/model/persistence/Area;",
            "Lzp0;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "<this>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areas"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Number of areas: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v0, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/Area;->getZoomBehavior()Lco/bird/android/model/constant/ZoomBehavior;

    move-result-object v0

    sget-object v6, Lco/bird/android/model/constant/ZoomBehavior;->ALWAYS_HIDDEN:Lco/bird/android/model/constant/ZoomBehavior;

    if-ne v0, v6, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {v5}, Lco/bird/android/model/persistence/Area;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v0

    sget-object v6, Lco/bird/android/app/feature/map/GoogleMap_Kt;->simplifiedPolyCache:Landroid/util/LruCache;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lco/bird/android/app/feature/map/GoogleMap_Kt$addPolygons$simplified$1;

    invoke-direct {v8, v0}, Lco/bird/android/app/feature/map/GoogleMap_Kt$addPolygons$simplified$1;-><init>(Lco/bird/android/model/Polygon;)V

    invoke-static {v6, v7, v8}, LwE2;->a(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    new-instance v7, LXO4;

    invoke-direct {v7, v6}, LXO4;-><init>(Ljava/util/List;)V

    invoke-virtual {v5}, Lco/bird/android/model/persistence/Area;->getBorderColor()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v6}, LXO4;->f(Ljava/lang/Integer;)LXO4;

    move-result-object v6

    invoke-virtual {v5}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, LXO4;->e(Ljava/lang/Integer;)LXO4;

    move-result-object v6

    sget-object v7, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v7}, LXO4;->h(Landroid/graphics/Paint$Style;)LXO4;

    move-result-object v6

    const/4 v7, 0x3

    invoke-virtual {v6, v7}, LXO4;->g(I)LXO4;

    move-result-object v6

    invoke-static {v5}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->zIndexType(Lco/bird/android/model/persistence/Area;)Lco/bird/android/app/feature/map/ZIndexZoneType;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/app/feature/map/ZIndexZoneType;->zIndex()I

    move-result v7

    invoke-virtual {v6, v7}, LXO4;->i(I)LXO4;

    invoke-virtual {v0}, Lco/bird/android/model/Polygon;->numRings()I

    move-result v7

    const/4 v8, 0x1

    move v9, v8

    :goto_1
    if-ge v9, v7, :cond_2

    invoke-virtual {v0, v9}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object v10

    invoke-virtual {v10}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object v10

    const-string v11, "region.getRing(i).points"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v11, Ljava/util/ArrayList;

    array-length v12, v10

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    array-length v12, v10

    move v13, v3

    :goto_2
    if-ge v13, v12, :cond_1

    aget-object v14, v10, v13

    new-instance v15, LVO4;

    const-string v3, "it"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v14}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-direct {v15, v3}, LVO4;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-interface {v11, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    const/4 v3, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v6, v11}, LXO4;->c(Ljava/util/List;)LXO4;

    add-int/lit8 v9, v9, 0x1

    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, LXO4;->d()LWO4;

    move-result-object v0

    invoke-virtual {v5}, Lco/bird/android/model/persistence/Area;->isOperationalInverse()Z

    move-result v3

    if-eqz v3, :cond_3

    iput-boolean v8, v0, LZO4;->k:Z

    :cond_3
    invoke-virtual {v1, v0}, Lco/bird/android/app/feature/map/renderer/RichLayer;->addShape(LZO4;)V

    new-instance v3, Lzp0;

    invoke-direct {v3, v0}, Lzp0;-><init>(LWO4;)V

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Failed to add area: "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/Object;

    invoke-static {v0, v3, v6}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move v3, v5

    goto/16 :goto_0

    :cond_4
    return-object v4
.end method

.method public static final adjustedNearbyRadius(D)D
    .locals 2

    const-wide v0, 0x3ff3333333333333L    # 1.2

    mul-double/2addr p0, v0

    const-wide v0, 0x40b3880000000000L    # 5000.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method private static final areaLabelOverlayWidth(I)F
    .locals 1

    int-to-float p0, p0

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr p0, v0

    return p0
.end method

.method public static final center(Ljava/util/List;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lcom/google/android/gms/maps/model/LatLng;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds$a;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p0

    const-string v0, "builder.build()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/maps/model/LatLngBounds;->v()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p0

    const-string v0, "bounds.center"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final contains(Lco/bird/android/model/Polygon;Lcom/google/android/gms/maps/model/LatLng;)Z
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

    invoke-static {p1, p0, v1, v0}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->contains$insideRings(Lcom/google/android/gms/maps/model/LatLng;Lco/bird/android/model/Polygon;II)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/Polygon;->numRings()I

    move-result v2

    invoke-static {p1, p0, v0, v2}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->contains$insideRings(Lcom/google/android/gms/maps/model/LatLng;Lco/bird/android/model/Polygon;II)Z

    move-result p0

    if-nez p0, :cond_1

    move v1, v0

    :cond_1
    return v1
.end method

.method public static final contains(Lco/bird/android/model/persistence/Area;DD)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {p0, v0}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->contains(Lco/bird/android/model/Polygon;Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result p0

    return p0
.end method

.method public static final contains(Lco/bird/android/model/persistence/Area;Landroid/location/Location;)Z
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {p0, v0}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->contains(Lco/bird/android/model/Polygon;Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result p0

    return p0
.end method

.method private static final contains$insideRings(Lcom/google/android/gms/maps/model/LatLng;Lco/bird/android/model/Polygon;II)Z
    .locals 0

    invoke-static {p2, p3}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p2

    new-instance p3, Lco/bird/android/app/feature/map/GoogleMap_Kt$contains$insideRings$1;

    invoke-direct {p3, p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt$contains$insideRings$1;-><init>(Lco/bird/android/model/Polygon;)V

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

.method public static final createBounds(Lcom/google/android/gms/maps/model/LatLng;D)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 8

    const-string v0, "center"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide v0, 0x40fb2d7e66666666L    # 111319.9

    div-double/2addr p1, v0

    iget-wide v0, p0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v2, p0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    new-instance p0, Lcom/google/android/gms/maps/model/LatLng;

    sub-double v4, v0, p1

    sub-double v6, v2, p1

    invoke-direct {p0, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    add-double/2addr v0, p1

    add-double/2addr v2, p1

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance p1, Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-direct {p1, p0, v4}, Lcom/google/android/gms/maps/model/LatLngBounds;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    return-object p1
.end method

.method public static final getMap(Lcom/google/android/gms/maps/MapView;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/MapView;",
            ")",
            "Lio/reactivex/F<",
            "LcD1;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/GoogleMap_Kt$getMap$1;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/GoogleMap_Kt$getMap$1;-><init>(Lcom/google/android/gms/maps/MapView;)V

    invoke-static {v0}, Lnh5;->k(Lkotlin/jvm/functions/Function1;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final getSimplifiedPolyCache()Landroid/util/LruCache;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "LVO4;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lco/bird/android/app/feature/map/GoogleMap_Kt;->simplifiedPolyCache:Landroid/util/LruCache;

    return-object v0
.end method

.method public static final groundOverLayOptions(Lco/bird/android/model/persistence/Area;LPT;ZZ)Lcom/google/android/gms/maps/model/GroundOverlayOptions;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmapDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getSelectedOverlayLabel()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getOverlayLabel()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v0

    :goto_1
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    new-instance v0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/GroundOverlayOptions;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->D0(LPT;)Lcom/google/android/gms/maps/model/GroundOverlayOptions;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v0

    invoke-static {v0}, LJX3;->a(Lco/bird/android/model/Polygon;)Lco/bird/android/model/Point;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->isDemandArea()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p2}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->inDemandAreaLabelOverlayWidth(I)F

    move-result p2

    goto :goto_2

    :cond_2
    invoke-static {p2}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->areaLabelOverlayWidth(I)F

    move-result p2

    :goto_2
    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->W0(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/model/GroundOverlayOptions;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->isDemandArea()Z

    move-result p0

    const/high16 p2, 0x3f000000    # 0.5f

    if-eqz p0, :cond_3

    move p0, p2

    goto :goto_3

    :cond_3
    const/high16 p0, 0x3f800000    # 1.0f

    :goto_3
    invoke-virtual {p1, p2, p0}, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->s(FF)Lcom/google/android/gms/maps/model/GroundOverlayOptions;

    move-result-object p0

    invoke-virtual {p0, p3}, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->Y0(Z)Lcom/google/android/gms/maps/model/GroundOverlayOptions;

    move-result-object p0

    const/high16 p1, 0x447a0000    # 1000.0f

    invoke-virtual {p0, p1}, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->j1(F)Lcom/google/android/gms/maps/model/GroundOverlayOptions;

    move-result-object v0

    :cond_4
    return-object v0
.end method

.method private static final inDemandAreaLabelOverlayWidth(I)F
    .locals 1

    int-to-float p0, p0

    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr p0, v0

    const/high16 v0, 0x41a00000    # 20.0f

    add-float/2addr p0, v0

    return p0
.end method

.method public static final includeInBounds(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLngBounds$a;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    return-object p0
.end method

.method public static final locationWithinClosestTo(LDX3;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LDX3;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LBX3;->b(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LDX3;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    const/4 v4, 0x0

    :cond_1
    :goto_0
    if-ge v4, v1, :cond_2

    invoke-virtual {p0}, LDX3;->a()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0}, LDX3;->a()Ljava/util/List;

    move-result-object v6

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {p0}, LDX3;->a()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    rem-int v7, v4, v7

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/maps/model/LatLng;

    sget-object v7, LYw2;->a:LYw2;

    const-string v8, "point1"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "point2"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, p1, v5, v6}, LYw2;->a(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    invoke-static {v5, p1}, LRN5;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v6

    cmpg-double v8, v6, v2

    if-gez v8, :cond_1

    move-object v0, v5

    move-wide v2, v6

    goto :goto_0

    :cond_2
    move-object p1, v0

    if-nez p1, :cond_3

    invoke-virtual {p0}, LDX3;->a()Ljava/util/List;

    move-result-object p0

    const-string p1, "points"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    move-object p1, p0

    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    :cond_3
    :goto_1
    return-object p1
.end method

.method public static final nearbyRadius(LcD1;)D
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->visibleRadius(LcD1;)D

    move-result-wide v0

    const-wide v2, 0x3ff3333333333333L    # 1.2

    mul-double/2addr v0, v2

    const-wide v2, 0x40b3880000000000L    # 5000.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public static final points(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;
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

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public static final toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v1, p0, Lco/bird/android/model/Point;->y:D

    iget-wide v3, p0, Lco/bird/android/model/Point;->x:D

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method public static final toLatLng(Lco/bird/android/model/wire/WireLocation;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method public static final toPoints(Lco/bird/android/model/Polygon;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Polygon;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object p0

    const-string v1, "getRing(0).points"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p0, v0

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v5, v3, Lco/bird/android/model/Point;->y:D

    iget-wide v7, v3, Lco/bird/android/model/Point;->x:D

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static final visibleRadius(LcD1;)D
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LcD1;->k()LU74;

    move-result-object p0

    invoke-virtual {p0}, LU74;->b()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object p0

    const-string v0, "projection.visibleRegion"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYw2;->a:LYw2;

    iget-object v1, p0, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds;->v()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iget-wide v1, v1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-object v3, p0, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/model/LatLngBounds;->v()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    iget-wide v3, v3, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-virtual {v0, v1, v2, v3, v4}, LYw2;->h(DD)Landroid/location/Location;

    move-result-object v1

    iget-object p0, p0, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object p0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->b:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, p0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v4, p0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-virtual {v0, v2, v3, v4, v5}, LYw2;->h(DD)Landroid/location/Location;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p0

    float-to-double v0, p0

    return-wide v0
.end method

.method public static final visibleRegionContains(LcD1;Lcom/google/android/gms/maps/model/LatLng;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latLng"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LcD1;->k()LU74;

    move-result-object p0

    invoke-virtual {p0}, LU74;->b()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object p0

    iget-object p0, p0, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result p0

    return p0
.end method

.method public static final zIndexType(Lco/bird/android/model/persistence/Area;)Lco/bird/android/app/feature/map/ZIndexZoneType;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->isOperationalInverse()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lco/bird/android/app/feature/map/ZIndexZoneType;->INVERTED_OPERATIONAL_ZONE:Lco/bird/android/app/feature/map/ZIndexZoneType;

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->isReleaseConstrained()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getReleaseCapacity()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object p0, Lco/bird/android/app/feature/map/ZIndexZoneType;->NO_DROP_ZONE:Lco/bird/android/app/feature/map/ZIndexZoneType;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->isReleaseConstrained()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getReleaseCapacity()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_3

    sget-object p0, Lco/bird/android/app/feature/map/ZIndexZoneType;->NO_CAPS_REMAINING_ZONE:Lco/bird/android/app/feature/map/ZIndexZoneType;

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->isReleaseConstrained()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getOperational()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object p0, Lco/bird/android/app/feature/map/ZIndexZoneType;->LIMITED_CAPS_REMAINING_ZONE:Lco/bird/android/app/feature/map/ZIndexZoneType;

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Area;->getOperational()Z

    move-result p0

    if-eqz p0, :cond_5

    sget-object p0, Lco/bird/android/app/feature/map/ZIndexZoneType;->OPERATIONAL_ZONE:Lco/bird/android/app/feature/map/ZIndexZoneType;

    goto :goto_1

    :cond_5
    sget-object p0, Lco/bird/android/app/feature/map/ZIndexZoneType;->BASE_ZONE:Lco/bird/android/app/feature/map/ZIndexZoneType;

    :goto_1
    return-object p0
.end method
