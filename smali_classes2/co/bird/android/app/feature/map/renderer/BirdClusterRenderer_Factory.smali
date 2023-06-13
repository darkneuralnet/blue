.class public final Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer_Factory;
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer_Factory;

    invoke-direct {v0}, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer_Factory;-><init>()V

    return-object v0
.end method

.method public static newInstance(Lco/bird/android/app/feature/map/renderer/IconLoader;Landroid/content/Context;LcD1;LGl0;)Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/renderer/IconLoader;",
            "Landroid/content/Context;",
            "LcD1;",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;)",
            "Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;

    invoke-direct {v0, p0, p1, p2, p3}, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader;Landroid/content/Context;LcD1;LGl0;)V

    return-object v0
.end method


# virtual methods
.method public get(Lco/bird/android/app/feature/map/renderer/IconLoader;Landroid/content/Context;LcD1;LGl0;)Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/renderer/IconLoader;",
            "Landroid/content/Context;",
            "LcD1;",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;)",
            "Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;"
        }
    .end annotation

    invoke-static {p1, p2, p3, p4}, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer_Factory;->newInstance(Lco/bird/android/app/feature/map/renderer/IconLoader;Landroid/content/Context;LcD1;LGl0;)Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;

    move-result-object p1

    return-object p1
.end method
