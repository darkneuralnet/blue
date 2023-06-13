.class public final Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
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
            "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;->reactiveConfigProvider:LY94;

    iput-object p2, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;->rendererFactoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;",
            ">;)",
            "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;

    invoke-direct {v0, p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;)Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;
    .locals 7

    new-instance v6, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;)V

    return-object v6
.end method


# virtual methods
.method public get(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;->reactiveConfigProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;->rendererFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;

    invoke-static {p1, p2, p3, v0, v1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager_Factory;->newInstance(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;)Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;

    move-result-object p1

    return-object p1
.end method
