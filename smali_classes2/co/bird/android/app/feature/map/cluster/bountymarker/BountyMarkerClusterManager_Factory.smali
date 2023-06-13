.class public final Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final rendererFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager_Factory;->rendererFactoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory;",
            ">;)",
            "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager_Factory;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager_Factory;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory;)Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager;
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager;

    invoke-direct {v0, p0, p1, p2, p3}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory;)V

    return-object v0
.end method


# virtual methods
.method public get(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager_Factory;->rendererFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory;

    invoke-static {p1, p2, p3, v0}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager_Factory;->newInstance(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory;)Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager;

    move-result-object p1

    return-object p1
.end method
