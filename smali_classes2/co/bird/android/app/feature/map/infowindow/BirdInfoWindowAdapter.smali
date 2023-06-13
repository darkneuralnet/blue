.class public final Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcD1$b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006\""
    }
    d2 = {
        "Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;",
        "LcD1$b;",
        "LfM2;",
        "marker",
        "Landroid/view/View;",
        "getInfoWindow",
        "getInfoContents",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Lco/bird/android/model/constant/MapMode;",
        "mode",
        "Lco/bird/android/model/constant/MapMode;",
        "getMode",
        "()Lco/bird/android/model/constant/MapMode;",
        "",
        "useRange",
        "Z",
        "Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;",
        "areaView",
        "Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;",
        "Lco/bird/android/app/feature/map/infowindow/widget/BatteryInfoWindowView;",
        "batteryView",
        "Lco/bird/android/app/feature/map/infowindow/widget/BatteryInfoWindowView;",
        "Lco/bird/android/widget/RangeInfoWindowView;",
        "rangeView",
        "Lco/bird/android/widget/RangeInfoWindowView;",
        "Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;",
        "operatorView",
        "Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;",
        "<init>",
        "(Landroid/content/Context;Lco/bird/android/model/constant/MapMode;Z)V",
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
.field private final areaView:Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;

.field private final batteryView:Lco/bird/android/app/feature/map/infowindow/widget/BatteryInfoWindowView;

.field private final context:Landroid/content/Context;

.field private final mode:Lco/bird/android/model/constant/MapMode;

.field private final operatorView:Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;

.field private final rangeView:Lco/bird/android/widget/RangeInfoWindowView;

.field private final useRange:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lco/bird/android/model/constant/MapMode;Z)V
    .locals 7

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mode"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->context:Landroid/content/Context;

    iput-object p2, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->mode:Lco/bird/android/model/constant/MapMode;

    iput-boolean p3, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->useRange:Z

    new-instance v6, Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->areaView:Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;

    new-instance v6, Lco/bird/android/app/feature/map/infowindow/widget/BatteryInfoWindowView;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lco/bird/android/app/feature/map/infowindow/widget/BatteryInfoWindowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->batteryView:Lco/bird/android/app/feature/map/infowindow/widget/BatteryInfoWindowView;

    new-instance v6, Lco/bird/android/widget/RangeInfoWindowView;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lco/bird/android/widget/RangeInfoWindowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->rangeView:Lco/bird/android/widget/RangeInfoWindowView;

    new-instance v6, Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->operatorView:Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getInfoContents(LfM2;)Landroid/view/View;
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LfM2;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->areaView:Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;

    check-cast p1, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;->show(Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->areaView:Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getInfoWindow(LfM2;)Landroid/view/View;
    .locals 4

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LfM2;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    instance-of v2, v0, Lco/bird/android/model/wire/WireBird;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->mode:Lco/bird/android/model/constant/MapMode;

    sget-object v3, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-ne v2, v3, :cond_3

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->useRange:Z

    if-eqz p1, :cond_2

    move-object p1, v0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->rangeView:Lco/bird/android/widget/RangeInfoWindowView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lco/bird/android/widget/RangeInfoWindowView;->setRange(I)V

    move-object v1, v0

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->batteryView:Lco/bird/android/app/feature/map/infowindow/widget/BatteryInfoWindowView;

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1, v0}, Lco/bird/android/app/feature/map/infowindow/widget/BatteryInfoWindowView;->setBird(Lco/bird/android/model/wire/WireBird;)V

    move-object v1, p1

    goto :goto_1

    :cond_3
    instance-of p1, v0, Lco/bird/android/model/persistence/BirdMapMarker;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->mode:Lco/bird/android/model/constant/MapMode;

    sget-object v2, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    if-ne p1, v2, :cond_4

    iget-object v1, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->operatorView:Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;

    check-cast v0, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v1, v0}, Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;->setBirdMarker(Lco/bird/android/model/persistence/BirdMapMarker;)V

    :cond_4
    :goto_1
    return-object v1
.end method

.method public final getMode()Lco/bird/android/model/constant/MapMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;->mode:Lco/bird/android/model/constant/MapMode;

    return-object v0
.end method
