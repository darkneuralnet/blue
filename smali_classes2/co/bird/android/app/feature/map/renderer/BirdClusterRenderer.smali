.class public final Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;
.super LEW0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEW0<",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001B=\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u0014\u0008\u0001\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0004H\u0014J\u001e\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0014J\u001e\u0010\u000f\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u001e\u0010\u0010\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001e\u0010\u0011\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001e\u0010\u0012\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;",
        "LEW0;",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "Lco/bird/android/model/wire/WireBird;",
        "LDl0;",
        "cluster",
        "",
        "shouldRenderAsCluster",
        "item",
        "Lcom/google/android/gms/maps/model/MarkerOptions;",
        "markerOptions",
        "",
        "onBeforeClusterItemRendered",
        "LfM2;",
        "marker",
        "onClusterItemRendered",
        "selectItem",
        "deselectItem",
        "renderMapMarkerState",
        "Lco/bird/android/app/feature/map/renderer/IconLoader;",
        "iconLoader",
        "Lco/bird/android/app/feature/map/renderer/IconLoader;",
        "Landroid/content/Context;",
        "context",
        "LcD1;",
        "map",
        "LGl0;",
        "clusterManager",
        "<init>",
        "(Lco/bird/android/app/feature/map/renderer/IconLoader;Landroid/content/Context;LcD1;LGl0;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final iconLoader:Lco/bird/android/app/feature/map/renderer/IconLoader;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/IconLoader;Landroid/content/Context;LcD1;LGl0;)V
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
            ">;>;)V"
        }
    .end annotation

    const-string v0, "iconLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clusterManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4}, LEW0;-><init>(Landroid/content/Context;LcD1;LGl0;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;->iconLoader:Lco/bird/android/app/feature/map/renderer/IconLoader;

    return-void
.end method


# virtual methods
.method public bridge synthetic deselectItem(LEl0;LfM2;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;->deselectItem(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public deselectItem(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "LfM2;",
            ")V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LnM2;

    invoke-direct {v0}, LnM2;-><init>()V

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;->iconLoader:Lco/bird/android/app/feature/map/renderer/IconLoader;

    invoke-virtual {v1, p1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->renderDeselected(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LnM2;)LnM2;

    move-result-object p1

    invoke-virtual {p1, p2}, LnM2;->b(LfM2;)V

    invoke-virtual {p2}, LfM2;->d()V

    return-void
.end method

.method public bridge synthetic onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;->onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    return-void
.end method

.method public onBeforeClusterItemRendered(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "Lcom/google/android/gms/maps/model/MarkerOptions;",
            ")V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LnM2;

    invoke-direct {v0}, LnM2;-><init>()V

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;->iconLoader:Lco/bird/android/app/feature/map/renderer/IconLoader;

    invoke-virtual {v1, p1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->renderForState(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LnM2;)LnM2;

    move-result-object p1

    invoke-virtual {p1, p2}, LnM2;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)V

    return-void
.end method

.method public bridge synthetic onClusterItemRendered(LEl0;LfM2;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;->onClusterItemRendered(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public onClusterItemRendered(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "LfM2;",
            ")V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->Companion:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;

    invoke-virtual {v0, p2, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;->showInfoWindow(LfM2;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic renderMapMarkerState(LEl0;LfM2;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;->renderMapMarkerState(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public renderMapMarkerState(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "LfM2;",
            ")V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LnM2;

    invoke-direct {v0}, LnM2;-><init>()V

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;->iconLoader:Lco/bird/android/app/feature/map/renderer/IconLoader;

    invoke-virtual {v1, p1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->renderForState(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LnM2;)LnM2;

    move-result-object p1

    invoke-virtual {p1, p2}, LnM2;->b(LfM2;)V

    return-void
.end method

.method public bridge synthetic selectItem(LEl0;LfM2;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;->selectItem(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V

    return-void
.end method

.method public selectItem(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LfM2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "LfM2;",
            ")V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "marker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LnM2;

    invoke-direct {v0}, LnM2;-><init>()V

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BirdClusterRenderer;->iconLoader:Lco/bird/android/app/feature/map/renderer/IconLoader;

    invoke-virtual {v1, p1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader;->renderSelected(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LnM2;)LnM2;

    move-result-object v0

    invoke-virtual {v0, p2}, LnM2;->b(LfM2;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->Companion:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;

    invoke-virtual {v0, p2, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;->showInfoWindow(LfM2;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V

    :cond_0
    return-void
.end method

.method public shouldRenderAsCluster(LDl0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;)Z"
        }
    .end annotation

    const-string v0, "cluster"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LDl0;->a()I

    move-result p1

    const/16 v0, 0x14

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
