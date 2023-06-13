.class public final Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory;


# instance fields
.field private final delegateFactory:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer_Factory;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer_Factory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer_Factory;

    return-void
.end method

.method public static create(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer_Factory;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer_Factory;",
            ")",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory;",
            ">;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory_Impl;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory_Impl;-><init>(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer_Factory;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(LGl0;LcD1;)Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;",
            ">;",
            "LcD1;",
            ")",
            "Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer_Factory;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer_Factory;->get(LGl0;LcD1;)Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;

    move-result-object p1

    return-object p1
.end method
