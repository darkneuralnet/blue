.class public final Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;


# instance fields
.field private final delegateFactory:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;

    return-void
.end method

.method public static create(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;",
            ")",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;",
            ">;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory_Impl;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory_Impl;-><init>(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;
    .locals 6

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager_Factory;->get(Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    move-result-object p1

    return-object p1
.end method
