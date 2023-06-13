.class public final Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final markerOptionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final timerMarkerOptionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;",
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
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;->contextProvider:LY94;

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;->markerOptionProvider:LY94;

    iput-object p3, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;->timerMarkerOptionProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;",
            ">;)",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(LGl0;LcD1;Landroid/content/Context;Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;)Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;
    .locals 7
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
            ")",
            "Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;"
        }
    .end annotation

    new-instance v6, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;-><init>(LGl0;LcD1;Landroid/content/Context;Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;)V

    return-object v6
.end method


# virtual methods
.method public get(LGl0;LcD1;)Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;
    .locals 3
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

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;->markerOptionProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;->timerMarkerOptionProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;

    invoke-static {p1, p2, v0, v1, v2}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer_Factory;->newInstance(LGl0;LcD1;Landroid/content/Context;Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;)Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;

    move-result-object p1

    return-object p1
.end method
