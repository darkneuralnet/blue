.class public final Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;
.super Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager<",
        "Lco/bird/android/model/persistence/NestMarker;",
        "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0014J\u000c\u0010\t\u001a\u00020\u0008*\u00020\u0002H\u0014J\u000c\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0014J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002R\u001a\u0010\u0012\u001a\u00020\u00118\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\""
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;",
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;",
        "Lco/bird/android/model/persistence/NestMarker;",
        "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;",
        "marker",
        "newMarker",
        "existingClusterItem",
        "updateMarker",
        "",
        "id",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "latLng",
        "",
        "claimProgress",
        "",
        "claim",
        "unclaim",
        "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;",
        "renderer",
        "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;",
        "getRenderer",
        "()Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "LcD1;",
        "map",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "LTq4;",
        "reactiveConfig",
        "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;",
        "rendererFactory",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;)V",
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
        "SMAP\nNestMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,115:1\n180#2:116\n180#2:117\n*S KotlinDebug\n*F\n+ 1 NestMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager\n*L\n56#1:116\n66#1:117\n*E\n"
    }
.end annotation


# instance fields
.field private final renderer:Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveMapEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rendererFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object v0

    invoke-interface {p5, v0, p2}, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;->create(LGl0;LcD1;)Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;

    move-result-object p5

    iput-object p5, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->renderer:Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init()V

    invoke-virtual {p4}, LTq4;->T3()Lio/reactivex/Observable;

    move-result-object p5

    new-instance v0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1;

    invoke-direct {v0, p3, p4}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$1;-><init>(Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;)V

    new-instance p3, LV33;

    invoke-direct {p3, v0}, LV33;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p5, p3}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p3

    new-instance p5, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$2;

    invoke-direct {p5, p2}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$2;-><init>(LcD1;)V

    new-instance p2, LW33;

    invoke-direct {p2, p5}, LW33;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p2

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p2

    const-string p3, "reactiveConfig.enableExp\u2026dSchedulers.mainThread())"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p2

    const-string p3, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p5, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3;

    invoke-direct {p5, p0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3;-><init>(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;)V

    new-instance v0, LX33;

    invoke-direct {v0, p5}, LX33;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual {p4}, LTq4;->T3()Lio/reactivex/Observable;

    move-result-object p2

    sget-object p4, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$4;->INSTANCE:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$4;

    new-instance p5, LY33;

    invoke-direct {p5, p4}, LY33;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p2

    const-string p4, "reactiveConfig.enableExp\u2026r { enabled -> !enabled }"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$5;

    invoke-direct {p2, p0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$5;-><init>(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;)V

    new-instance p3, LZ33;

    invoke-direct {p3, p2}, LZ33;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

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

.method private static final _init_$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final _init_$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method private static final _init_$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getClusterManager(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;)LGl0;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$safeUpdateItem(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->safeUpdateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)V

    return-void
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->_init_$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->_init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->_init_$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->_init_$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->_init_$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final claim(Lco/bird/android/model/persistence/NestMarker;I)V
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    move-result-object p1

    check-cast p1, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->setClaimedProgress(I)V

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->safeUpdateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)V

    return-void
.end method

.method public bridge synthetic getRenderer()Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->getRenderer()Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;

    move-result-object v0

    return-object v0
.end method

.method public getRenderer()Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->renderer:Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;

    return-object v0
.end method

.method public id(Lco/bird/android/model/persistence/NestMarker;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/NestMarker;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic id(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/NestMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->id(Lco/bird/android/model/persistence/NestMarker;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public latLng(Lco/bird/android/model/persistence/NestMarker;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/NestMarker;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    move-result-object p1

    invoke-static {p1}, LLB0;->a(Lco/bird/android/model/persistence/nestedstructures/Coordinate;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic latLng(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/NestMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->latLng(Lco/bird/android/model/persistence/NestMarker;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newMarker(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/NestMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->newMarker(Lco/bird/android/model/persistence/NestMarker;)Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    move-result-object p1

    return-object p1
.end method

.method public newMarker(Lco/bird/android/model/persistence/NestMarker;)Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;
    .locals 7

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;-><init>(Lco/bird/android/model/persistence/NestMarker;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final unclaim(Lco/bird/android/model/persistence/NestMarker;)V
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    move-result-object p1

    check-cast p1, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->setClaimedProgress(I)V

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->safeUpdateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)V

    return-void
.end method

.method public bridge synthetic updateMarker(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/NestMarker;

    check-cast p2, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->updateMarker(Lco/bird/android/model/persistence/NestMarker;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    move-result-object p1

    return-object p1
.end method

.method public updateMarker(Lco/bird/android/model/persistence/NestMarker;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;
    .locals 2

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "existingClusterItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v1

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getClaimedProgress()I

    move-result p2

    invoke-direct {v0, p1, v1, p2}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;-><init>(Lco/bird/android/model/persistence/NestMarker;ZI)V

    return-object v0
.end method
