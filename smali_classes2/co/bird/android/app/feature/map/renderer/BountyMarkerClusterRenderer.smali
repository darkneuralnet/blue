.class public final Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;
.super Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer<",
        "Lco/bird/android/model/persistence/BountyMapMarker;",
        "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B;\u0008\u0007\u0012\u000e\u0008\u0001\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0010\u0012\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\"\u0010#J\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003H\u0002J\u000c\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0002J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0014J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006%"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;",
        "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;",
        "Lco/bird/android/model/persistence/BountyMapMarker;",
        "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;",
        "LPT;",
        "bitmapDescriptor",
        "Landroid/graphics/PointF;",
        "anchorPoint",
        "item",
        "Lcom/google/android/gms/maps/model/MarkerOptions;",
        "markerOptions",
        "",
        "onBeforeClusterItemRendered",
        "LfM2;",
        "marker",
        "updateItem",
        "LGl0;",
        "clusterManager",
        "LGl0;",
        "LcD1;",
        "map",
        "LcD1;",
        "Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;",
        "markerOptionProvider",
        "Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;",
        "Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;",
        "timerMarkerOptionProvider",
        "Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;",
        "",
        "",
        "markersToAnimate",
        "Ljava/util/Map;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(LGl0;LcD1;Landroid/content/Context;Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;)V",
        "Companion",
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
        "SMAP\nBountyMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n180#2:126\n1#3:127\n*S KotlinDebug\n*F\n+ 1 BountyMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer\n*L\n81#1:126\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$Companion;

.field private static final UNKNOWN_ANCHOR_POINT:Landroid/graphics/PointF;


# instance fields
.field private final clusterManager:LGl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;",
            ">;"
        }
    .end annotation
.end field

.field private final map:LcD1;

.field private final markerOptionProvider:Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;

.field private final markersToAnimate:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/BountyMapMarker;",
            ">;"
        }
    .end annotation
.end field

.field private final timerMarkerOptionProvider:Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->Companion:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$Companion;

    new-instance v0, Landroid/graphics/PointF;

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->UNKNOWN_ANCHOR_POINT:Landroid/graphics/PointF;

    return-void
.end method

.method public constructor <init>(LGl0;LcD1;Landroid/content/Context;Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;",
            ">;",
            "LcD1;",
            "Landroid/content/Context;",
            "Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "clusterManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOptionProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timerMarkerOptionProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p2, p1}, Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;-><init>(Landroid/content/Context;LcD1;LGl0;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->clusterManager:LGl0;

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->map:LcD1;

    iput-object p4, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->markerOptionProvider:Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;

    iput-object p5, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->timerMarkerOptionProvider:Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->markersToAnimate:Ljava/util/Map;

    const-wide/16 p1, 0x1

    sget-object p3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, p2, p3}, Lio/reactivex/Observable;->interval(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$1;

    invoke-direct {p2, p0}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$1;-><init>(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;)V

    new-instance p3, LO00;

    invoke-direct {p3, p2}, LO00;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2;

    invoke-direct {p2, p0}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2;-><init>(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;)V

    new-instance p3, LP00;

    invoke-direct {p3, p2}, LP00;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$3;->INSTANCE:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$3;

    new-instance p3, LQ00;

    invoke-direct {p3, p2}, LQ00;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "interval(1L, TimeUnit.SE\u2026Timber::e)\n      .retry()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string p3, "UNBOUND"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    sget-object p2, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$4;->INSTANCE:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$4;

    new-instance p3, LR00;

    invoke-direct {p3, p2}, LR00;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object p2, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$5;->INSTANCE:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$5;

    new-instance p4, LS00;

    invoke-direct {p4, p2}, LS00;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3, p4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method private static final _init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method private static final _init_$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$bitmapDescriptor(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;)LPT;
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;)LPT;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getClusterManager$p(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;)LGl0;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->clusterManager:LGl0;

    return-object p0
.end method

.method public static final synthetic access$getMarkersToAnimate$p(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->markersToAnimate:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getTimerMarkerOptionProvider$p(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;)Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->timerMarkerOptionProvider:Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;

    return-object p0
.end method

.method private final anchorPoint(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;)Landroid/graphics/PointF;
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BountyMapMarker;->getCountdownUntil()Lorg/joda/time/DateTime;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->timerMarkerOptionProvider:Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object p1

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->anchorPoint(Lco/bird/android/model/persistence/BountyMapMarker;)Landroid/graphics/PointF;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyMapMarker;->getMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->markerOptionProvider:Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;->anchorPoint(Lco/bird/android/model/persistence/FleetMarker;)Landroid/graphics/PointF;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    sget-object p1, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->UNKNOWN_ANCHOR_POINT:Landroid/graphics/PointF;

    :cond_2
    :goto_0
    return-object p1
.end method

.method private final declared-synchronized bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;)LPT;
    .locals 6

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BountyMapMarker;->getCountdownUntil()Lorg/joda/time/DateTime;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->markersToAnimate:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/BountyMapMarker;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->timerMarkerOptionProvider:Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object p1

    invoke-static {v0, p1, v2, v1, v3}, Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider$DefaultImpls;->bitmapDescriptor$default(Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;Ljava/lang/Object;ZILjava/lang/Object;)LPT;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyMapMarker;->getMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->markerOptionProvider:Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;

    invoke-static {v0, p1, v2, v1, v3}, Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider$DefaultImpls;->bitmapDescriptor$default(Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;Ljava/lang/Object;ZILjava/lang/Object;)LPT;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p0

    return-object v3

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->_init_$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->_init_$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->_init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->_init_$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->_init_$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    return-void
.end method

.method public onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, LEW0;->onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;)LPT;

    move-result-object v0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->anchorPoint(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;)Landroid/graphics/PointF;

    move-result-object p1

    invoke-virtual {p2, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p2

    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    return-void
.end method

.method public bridge synthetic updateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;LfM2;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->updateItem(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public updateItem(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;LfM2;)V
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->bitmapDescriptor(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;)LPT;

    move-result-object v0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->anchorPoint(Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-virtual {p2, v0}, LfM2;->k(LPT;)V

    iget v0, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2, v0, v1}, LfM2;->h(FF)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getZIndex()F

    move-result p1

    invoke-virtual {p2, p1}, LfM2;->s(F)V

    return-void
.end method
