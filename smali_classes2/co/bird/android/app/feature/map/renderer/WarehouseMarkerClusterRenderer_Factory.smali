.class public final Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer_Factory;
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


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer_Factory;->contextProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer_Factory;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer_Factory;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(LGl0;LcD1;Landroid/content/Context;)Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;",
            ">;",
            "LcD1;",
            "Landroid/content/Context;",
            ")",
            "Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;-><init>(LGl0;LcD1;Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public get(LGl0;LcD1;)Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;",
            ">;",
            "LcD1;",
            ")",
            "Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer_Factory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {p1, p2, v0}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer_Factory;->newInstance(LGl0;LcD1;Landroid/content/Context;)Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;

    move-result-object p1

    return-object p1
.end method
