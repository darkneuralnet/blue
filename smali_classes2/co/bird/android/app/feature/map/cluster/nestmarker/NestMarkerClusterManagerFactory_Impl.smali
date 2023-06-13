.class public final Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;


# instance fields
.field private final delegateFactory:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;

    return-void
.end method

.method public static create(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;",
            ")",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;",
            ">;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory_Impl;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory_Impl;-><init>(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;

    invoke-virtual {v0, p1, p2, p3}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;->get(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;

    move-result-object p1

    return-object p1
.end method
