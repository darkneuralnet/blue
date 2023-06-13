.class public final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$Companion;,
        Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001-\u0018\u0000 52\u00020\u0001:\u000256B1\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u00083\u00104J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u00082\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006J\u001c\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006J\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000e0\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R.\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 #*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00060\u00060\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010$RF\u0010\'\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0006 #*\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0006\u0018\u00010&0&0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R:\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002 #*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e0\u000e0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010$R\u001e\u0010+\u001a\u000c\u0012\u0008\u0012\u00060*R\u00020\u00000)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\u00a8\u0006B\u00b2\u0006\u0014\u00108\u001a\n #*\u0004\u0018\u000107078\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010:\u001a\u0002098\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010;\u001a\u0004\u0018\u0001078\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010<\u001a\u0002098\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010=\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010?\u001a\u00020>8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010@\u001a\u00020>8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010A\u001a\u00020>8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;",
        "",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "latLng",
        "Lco/bird/android/model/Polygonable;",
        "resolveClickedPolygonable",
        "",
        "polygonables",
        "",
        "setPolygonables",
        "",
        "key",
        "setAdditionalPolygonable",
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "polygonClicks",
        "LcD1;",
        "map",
        "LcD1;",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scope",
        "Lcom/uber/autodispose/ScopeProvider;",
        "Lco/bird/android/model/wire/configs/MobileMapConfigView;",
        "mapConfig",
        "Lco/bird/android/model/wire/configs/MobileMapConfigView;",
        "Ldr4;",
        "locationManager",
        "Ldr4;",
        "Lg46$b;",
        "logger",
        "Lg46$b;",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "Lma4;",
        "LAG;",
        "",
        "additionalPolygonables",
        "LAG;",
        "Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;",
        "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;",
        "polygonablePolygons",
        "Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;",
        "co/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1",
        "worldPolygonable$delegate",
        "Lkotlin/Lazy;",
        "getWorldPolygonable",
        "()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;",
        "worldPolygonable",
        "<init>",
        "(LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/configs/MobileMapConfigView;Ldr4;)V",
        "Companion",
        "PolygonWrapper",
        "LCX3;",
        "visibleRegionGeom",
        "",
        "visibleSize",
        "geom",
        "polygonableSize",
        "zoomModifiedPolygon",
        "",
        "visibleRegionIntersects",
        "polygonRelativeSizeMet",
        "polygonZoomMet",
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
        "SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,518:1\n161#2:519\n180#2:520\n125#3:521\n152#3,3:522\n1549#4:525\n1620#4,3:526\n766#4:536\n857#4,2:537\n2333#4,14:539\n515#5:529\n500#5,6:530\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer\n*L\n237#1:519\n257#1:520\n270#1:521\n270#1:522,3\n275#1:525\n275#1:526,3\n292#1:536\n292#1:537,2\n293#1:539,14\n290#1:529\n290#1:530,6\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$Companion;

.field private static final FRAME_RENDER_TIME_US:J = 0x208aL

.field private static final POLYGONABLE_BORDER_STROKE_THICKNESS_DP:I = 0x1

.field private static final POLYGONABLE_VISIBILITY_THRESHOLD_PERCENTAGE:D = 5.0E-4

.field private static final POLYGONABLE_ZOOM_LEVEL_ALWAYS_SHOW_THRESHOLD:F = 15.0f

.field private static final WORLD_POLYGONABLE_ID:Ljava/lang/String;

.field private static final WORLD_RING:Lco/bird/android/model/LinearRing;


# instance fields
.field private final additionalPolygonables:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/Polygonable;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final locationManager:Ldr4;

.field private final logger:Lg46$b;

.field private final map:LcD1;

.field private final mapConfig:Lco/bird/android/model/wire/configs/MobileMapConfigView;

.field private final polygonClicks:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Polygonable;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;"
        }
    .end annotation
.end field

.field private final polygonablePolygons:Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap<",
            "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;",
            ">;"
        }
    .end annotation
.end field

.field private final polygonables:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/Polygonable;",
            ">;>;"
        }
    .end annotation
.end field

.field private final reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

.field private final scope:Lcom/uber/autodispose/ScopeProvider;

.field private final worldPolygonable$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->Companion:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$Companion;

    new-instance v0, Lco/bird/android/model/LinearRing;

    const/4 v1, 0x5

    new-array v1, v1, [Lco/bird/android/model/Point;

    new-instance v2, Lco/bird/android/model/Point;

    const-wide v3, -0x3fa9800000000046L    # -89.999999999999

    const-wide v5, -0x3f99800000000000L    # -180.0

    invoke-direct {v2, v5, v6, v3, v4}, Lco/bird/android/model/Point;-><init>(DD)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lco/bird/android/model/Point;

    const-wide v3, 0x40567ffffffffd40L    # 89.99999999999

    invoke-direct {v2, v5, v6, v3, v4}, Lco/bird/android/model/Point;-><init>(DD)V

    const/4 v5, 0x1

    aput-object v2, v1, v5

    new-instance v2, Lco/bird/android/model/Point;

    const-wide v5, 0x40667ffffffaa19cL    # 179.99999999

    invoke-direct {v2, v5, v6, v3, v4}, Lco/bird/android/model/Point;-><init>(DD)V

    const/4 v3, 0x2

    aput-object v2, v1, v3

    new-instance v2, Lco/bird/android/model/Point;

    const-wide v3, -0x3fa98000000002c0L    # -89.99999999999

    invoke-direct {v2, v5, v6, v3, v4}, Lco/bird/android/model/Point;-><init>(DD)V

    const/4 v5, 0x3

    aput-object v2, v1, v5

    new-instance v2, Lco/bird/android/model/Point;

    const-wide/16 v5, 0x0

    invoke-direct {v2, v5, v6, v3, v4}, Lco/bird/android/model/Point;-><init>(DD)V

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lco/bird/android/model/LinearRing;-><init>([Lco/bird/android/model/Point;)V

    sput-object v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->WORLD_RING:Lco/bird/android/model/LinearRing;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "randomUUID().toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->WORLD_POLYGONABLE_ID:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/configs/MobileMapConfigView;Ldr4;)V
    .locals 4

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveMapEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->map:LcD1;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    iput-object p3, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->scope:Lcom/uber/autodispose/ScopeProvider;

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->mapConfig:Lco/bird/android/model/wire/configs/MobileMapConfigView;

    iput-object p5, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->locationManager:Ldr4;

    const-string p1, "MapPolygonableRenderer"

    invoke-static {p1}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object p1

    const-string p4, "tag(\"MapPolygonableRenderer\")"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->logger:Lg46$b;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    const-string p4, "create<List<Polygonable>>()"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->polygonables:Lma4;

    invoke-static {}, LAG;->g()LAG;

    move-result-object p4

    const-string p5, "create<Map<String, List<Polygonable>>>()"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->additionalPolygonables:LAG;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p5

    const-string v0, "create<Pair<Polygonable, LatLng>>()"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->polygonClicks:Lma4;

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    invoke-direct {v0}, Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;-><init>()V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->polygonablePolygons:Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2;-><init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->worldPolygonable$delegate:Lkotlin/Lazy;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p4, v0}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p4

    invoke-interface {p2}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->cameraMoves()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->startWith(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$1;-><init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)V

    new-instance v2, LDK2;

    invoke-direct {v2, v1}, LDK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x208a

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/Observable;->throttleLatest(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$2;->INSTANCE:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$2;

    new-instance v2, LEK2;

    invoke-direct {v2, v1}, LEK2;-><init>(Lkotlin/jvm/functions/Function3;)V

    invoke-static {p1, p4, v0, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/h;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p4

    invoke-static {p4}, Lio/reactivex/schedulers/a;->b(Ljava/util/concurrent/Executor;)Lio/reactivex/E;

    move-result-object p4

    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p4, Lio/reactivex/b;->f:Lio/reactivex/b;

    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object p1

    new-instance p4, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3;

    invoke-direct {p4, p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3;-><init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)V

    new-instance v0, LFK2;

    invoke-direct {v0, p4}, LFK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/k;->b1(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    const/4 p4, 0x0

    sget-object v0, Lio/reactivex/a;->d:Lio/reactivex/a;

    const-wide/16 v1, 0x78

    invoke-virtual {p1, v1, v2, p4, v0}, Lio/reactivex/k;->w0(JLio/reactivex/functions/a;Lio/reactivex/a;)Lio/reactivex/k;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p4

    invoke-virtual {p1, p4}, Lio/reactivex/k;->s0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object p1

    const-string p4, "combineLatest(\n      pol\u2026dSchedulers.mainThread())"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p4

    invoke-virtual {p1, p4}, Lio/reactivex/k;->f(Lio/reactivex/l;)Ljava/lang/Object;

    move-result-object p1

    const-string p4, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/FlowableSubscribeProxy;

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$4;-><init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)V

    new-instance v1, LGK2;

    invoke-direct {v1, v0}, LGK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/FlowableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p2}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->mapClicks()Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$5;

    invoke-direct {p2, p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$5;-><init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)V

    new-instance v0, LHK2;

    invoke-direct {v0, p2}, LHK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$6;->INSTANCE:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$6;

    new-instance v0, LIK2;

    invoke-direct {v0, p2}, LIK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$7;->INSTANCE:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$7;

    new-instance v0, LJK2;

    invoke-direct {v0, p2}, LJK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "reactiveMapEvent.mapClic\u2026ygonable, LatLng>\n      }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$8;

    invoke-direct {p2, p5}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$8;-><init>(Ljava/lang/Object;)V

    new-instance p3, LKK2;

    invoke-direct {p3, p2}, LKK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method private static final _init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method private static final _init_$lambda$1(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Triple;

    return-object p0
.end method

.method private static final _init_$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lna4;

    return-object p0
.end method

.method private static final _init_$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method private static final _init_$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final _init_$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method private static final _init_$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->_init_$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getLocationManager$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Ldr4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->locationManager:Ldr4;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lg46$b;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->logger:Lg46$b;

    return-object p0
.end method

.method public static final synthetic access$getMap$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)LcD1;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->map:LcD1;

    return-object p0
.end method

.method public static final synthetic access$getMapConfig$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/model/wire/configs/MobileMapConfigView;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->mapConfig:Lco/bird/android/model/wire/configs/MobileMapConfigView;

    return-object p0
.end method

.method public static final synthetic access$getPolygonablePolygons$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->polygonablePolygons:Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    return-object p0
.end method

.method public static final synthetic access$getWORLD_POLYGONABLE_ID$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->WORLD_POLYGONABLE_ID:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getWORLD_RING$cp()Lco/bird/android/model/LinearRing;
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->WORLD_RING:Lco/bird/android/model/LinearRing;

    return-object v0
.end method

.method public static final synthetic access$getWorldPolygonable(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;
    .locals 0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->getWorldPolygonable()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$resolveClickedPolygonable(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/Polygonable;
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->resolveClickedPolygonable(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/Polygonable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->_init_$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->_init_$lambda$1(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->_init_$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->_init_$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->_init_$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->_init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private final getWorldPolygonable()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->worldPolygonable$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$worldPolygonable$2$1;

    return-object v0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->_init_$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final resolveClickedPolygonable(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/Polygonable;
    .locals 7

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->polygonablePolygons:Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    invoke-virtual {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->isAdded()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/Polygonable;

    invoke-interface {v3}, Lco/bird/android/model/Polygonable;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v3

    invoke-static {v3, p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->contains(Lco/bird/android/model/Polygon;Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 p1, 0x0

    goto :goto_3

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_5

    :goto_2
    move-object p1, v0

    goto :goto_3

    :cond_5
    move-object v1, v0

    check-cast v1, Lco/bird/android/model/Polygonable;

    invoke-interface {v1}, Lco/bird/android/model/Polygonable;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v1

    invoke-static {v1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toPoints(Lco/bird/android/model/Polygon;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LRN5;->b(Ljava/util/List;)D

    move-result-wide v1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/Polygonable;

    invoke-interface {v4}, Lco/bird/android/model/Polygonable;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v4

    invoke-static {v4}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toPoints(Lco/bird/android/model/Polygon;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, LRN5;->b(Ljava/util/List;)D

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v6

    if-lez v6, :cond_7

    move-object v0, v3

    move-wide v1, v4

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_2

    :goto_3
    check-cast p1, Lco/bird/android/model/Polygonable;

    return-object p1
.end method


# virtual methods
.method public final polygonClicks()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Polygonable;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->polygonClicks:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "polygonClicks.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setAdditionalPolygonable(Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/Polygonable;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "polygonables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->additionalPolygonables:LAG;

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->additionalPolygonables:LAG;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v3, p2

    :cond_1
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :cond_4
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v1, p1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPolygonables(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/Polygonable;",
            ">;)V"
        }
    .end annotation

    const-string v0, "polygonables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->polygonables:Lma4;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method
