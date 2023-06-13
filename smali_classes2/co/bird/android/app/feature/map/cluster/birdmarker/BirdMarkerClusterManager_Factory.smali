.class public final Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final fleetMarkerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final reactiveConfigProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field private final rendererFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;->reactiveConfigProvider:LY94;

    iput-object p2, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;->fleetMarkerProvider:LY94;

    iput-object p3, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;->rendererFactoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;",
            ">;)",
            "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(LTq4;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;
    .locals 10

    new-instance v9, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;-><init>(LTq4;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)V

    return-object v9
.end method


# virtual methods
.method public get(Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;
    .locals 9

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;->reactiveConfigProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTq4;

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;->fleetMarkerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;->rendererFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-static/range {v1 .. v8}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;->newInstance(LTq4;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    move-result-object p1

    return-object p1
.end method
