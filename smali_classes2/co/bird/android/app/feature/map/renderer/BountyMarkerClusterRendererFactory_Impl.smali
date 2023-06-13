.class public final Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory;


# instance fields
.field private final delegateFactory:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;

    return-void
.end method

.method public static create(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;",
            ")",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory;",
            ">;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory_Impl;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory_Impl;-><init>(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(LGl0;LcD1;)Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;",
            ">;",
            "LcD1;",
            ")",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRendererFactory_Impl;->delegateFactory:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;->get(LGl0;LcD1;)Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;

    move-result-object p1

    return-object p1
.end method
