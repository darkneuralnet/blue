.class public final Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapModelRenderer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/ui/MapModelRenderer<",
        "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u001b\u0010\'\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010!\u001a\u0004\u0008&\u0010#\u00a8\u0006*"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;",
        "Lco/bird/android/app/feature/map/ui/MapModelRenderer;",
        "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;",
        "Lco/bird/android/model/ParkingNest;",
        "nest",
        "Lcom/google/android/gms/maps/model/MarkerOptions;",
        "createMarkerOptions",
        "LfM2;",
        "getOrCreateMarker",
        "Lcom/google/android/gms/maps/model/PolygonOptions;",
        "createPolygonOptions",
        "LDX3;",
        "getOrCreatePolygon",
        "",
        "items",
        "",
        "render",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "LcD1;",
        "map",
        "LcD1;",
        "",
        "showNestRadius",
        "Z",
        "",
        "",
        "markers",
        "Ljava/util/Map;",
        "polygons",
        "LPT;",
        "parkingBitmapDescriptor$delegate",
        "Lkotlin/Lazy;",
        "getParkingBitmapDescriptor",
        "()LPT;",
        "parkingBitmapDescriptor",
        "parkingUnavailableBitmapDescriptor$delegate",
        "getParkingUnavailableBitmapDescriptor",
        "parkingUnavailableBitmapDescriptor",
        "<init>",
        "(Landroid/content/Context;LcD1;Z)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nParkingNestRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingNestRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,80:1\n361#2,7:81\n361#2,7:88\n1194#3,2:95\n1222#3,4:97\n1855#3,2:101\n215#4,2:103\n215#4,2:105\n*S KotlinDebug\n*F\n+ 1 ParkingNestRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer\n*L\n36#1:81,7\n49#1:88,7\n54#1:95,2\n54#1:97,4\n55#1:101,2\n67#1:103,2\n73#1:105,2\n*E\n"
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private final map:LcD1;

.field private final markers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LfM2;",
            ">;"
        }
    .end annotation
.end field

.field private final parkingBitmapDescriptor$delegate:Lkotlin/Lazy;

.field private final parkingUnavailableBitmapDescriptor$delegate:Lkotlin/Lazy;

.field private final polygons:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LDX3;",
            ">;"
        }
    .end annotation
.end field

.field private final showNestRadius:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;LcD1;Z)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->context:Landroid/content/Context;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->map:LcD1;

    iput-boolean p3, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->showNestRadius:Z

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->markers:Ljava/util/Map;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->polygons:Ljava/util/Map;

    new-instance p1, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer$parkingBitmapDescriptor$2;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer$parkingBitmapDescriptor$2;-><init>(Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->parkingBitmapDescriptor$delegate:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer$parkingUnavailableBitmapDescriptor$2;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer$parkingUnavailableBitmapDescriptor$2;-><init>(Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->parkingUnavailableBitmapDescriptor$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getContext$p(Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->context:Landroid/content/Context;

    return-object p0
.end method

.method private final createMarkerOptions(Lco/bird/android/model/ParkingNest;)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 6

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getAvailableParkingCapacity()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->getParkingUnavailableBitmapDescriptor()LPT;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->getParkingBitmapDescriptor()LPT;

    move-result-object p1

    :goto_1
    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    const/high16 v0, 0x42340000    # 45.0f

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->Y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    const-string v0, "MarkerOptions()\n    .pos\u2026PARK_NEST_MARKER_Z_INDEX)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final createPolygonOptions(Lco/bird/android/model/ParkingNest;)Lcom/google/android/gms/maps/model/PolygonOptions;
    .locals 3

    new-instance v0, Lcom/google/android/gms/maps/model/PolygonOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolygonOptions;-><init>()V

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getShape()Lco/bird/android/model/Polygon;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toPoints(Lco/bird/android/model/Polygon;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/PolygonOptions;->s(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/PolygonOptions;->N0(I)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object p1

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->context:Landroid/content/Context;

    sget v2, LDf4;->birdESBlue20:I

    invoke-static {v1, v2}, LfB0;->f(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/model/PolygonOptions;->E(I)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/PolygonOptions;->v(Z)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/PolygonOptions;->W0(F)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object p1

    const-string v0, "PolygonOptions()\n    .ad\u2026lse)\n    .strokeWidth(0f)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getOrCreateMarker(Lco/bird/android/model/ParkingNest;)LfM2;
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->markers:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->map:LcD1;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->createMarkerOptions(Lco/bird/android/model/ParkingNest;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    invoke-virtual {v2, v3}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, LfM2;->p(Ljava/lang/Object;)V

    const-string p1, "map.addMarker(createMark\u2026 {\n      tag = nest\n    }"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v2, LfM2;

    return-object v2
.end method

.method private final getOrCreatePolygon(Lco/bird/android/model/ParkingNest;)LDX3;
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->polygons:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->map:LcD1;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->createPolygonOptions(Lco/bird/android/model/ParkingNest;)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object p1

    invoke-virtual {v2, p1}, LcD1;->d(Lcom/google/android/gms/maps/model/PolygonOptions;)LDX3;

    move-result-object v2

    const-string p1, "map.addPolygon(createPolygonOptions(nest))"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v2, LDX3;

    return-object v2
.end method

.method private final getParkingBitmapDescriptor()LPT;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->parkingBitmapDescriptor$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPT;

    return-object v0
.end method

.method private final getParkingUnavailableBitmapDescriptor()LPT;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->parkingUnavailableBitmapDescriptor$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPT;

    return-object v0
.end method


# virtual methods
.method public render(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;

    invoke-virtual {v3}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object v2

    invoke-direct {p0, v2}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->getOrCreateMarker(Lco/bird/android/model/ParkingNest;)LfM2;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, LfM2;->r(Z)V

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object v3

    invoke-virtual {v2, v3}, LfM2;->p(Ljava/lang/Object;)V

    iget-boolean v2, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->showNestRadius:Z

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object v2

    invoke-direct {p0, v2}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->getOrCreatePolygon(Lco/bird/android/model/ParkingNest;)LDX3;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;->isRadiusVisible()Z

    move-result v3

    invoke-virtual {v2, v3}, LDX3;->e(Z)V

    invoke-virtual {v2, v0}, LDX3;->d(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->markers:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfM2;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0, v2}, LfM2;->r(Z)V

    goto :goto_2

    :cond_4
    iget-boolean p1, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->showNestRadius:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->polygons:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDX3;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v0, v2}, LDX3;->e(Z)V

    goto :goto_3

    :cond_6
    return-void
.end method
