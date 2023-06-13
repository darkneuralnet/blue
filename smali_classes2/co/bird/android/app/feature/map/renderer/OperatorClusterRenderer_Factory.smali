.class public final Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer_Factory;
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer_Factory;

    invoke-direct {v0}, Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer_Factory;-><init>()V

    return-object v0
.end method

.method public static newInstance(Landroid/content/Context;LcD1;LGl0;)Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LcD1;",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;)",
            "Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer;-><init>(Landroid/content/Context;LcD1;LGl0;)V

    return-object v0
.end method


# virtual methods
.method public get(Landroid/content/Context;LcD1;LGl0;)Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LcD1;",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;)",
            "Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer_Factory;->newInstance(Landroid/content/Context;LcD1;LGl0;)Lco/bird/android/app/feature/map/renderer/OperatorClusterRenderer;

    move-result-object p1

    return-object p1
.end method
