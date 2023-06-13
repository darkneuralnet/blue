.class public final Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;
.super Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem<",
        "Lco/bird/android/model/persistence/NestMarker;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\u0017\u001a\u00020\u0018H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0016J\u0008\u0010\u001b\u001a\u00020\u001cH\u0016J\u0008\u0010\u001d\u001a\u00020\u0005H\u0016J\u0008\u0010\u001e\u001a\u00020\u0005H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;",
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "Lco/bird/android/model/persistence/NestMarker;",
        "marker",
        "selected",
        "",
        "claimedProgress",
        "",
        "(Lco/bird/android/model/persistence/NestMarker;ZI)V",
        "getClaimedProgress",
        "()I",
        "setClaimedProgress",
        "(I)V",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "getMarker",
        "()Lco/bird/android/model/persistence/NestMarker;",
        "getSelected",
        "()Z",
        "setSelected",
        "(Z)V",
        "getPosition",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "getSnippet",
        "getTitle",
        "getZIndex",
        "",
        "isSelected",
        "shouldCluster",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private claimedProgress:I

.field private final id:Ljava/lang/String;

.field private final marker:Lco/bird/android/model/persistence/NestMarker;

.field private selected:Z


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/NestMarker;ZI)V
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->marker:Lco/bird/android/model/persistence/NestMarker;

    iput-boolean p2, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->selected:Z

    iput p3, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->claimedProgress:I

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/NestMarker;->getId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->id:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/persistence/NestMarker;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;-><init>(Lco/bird/android/model/persistence/NestMarker;ZI)V

    return-void
.end method


# virtual methods
.method public final getClaimedProgress()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->claimedProgress:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getMarker()Lco/bird/android/model/persistence/NestMarker;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->marker:Lco/bird/android/model/persistence/NestMarker;

    return-object v0
.end method

.method public bridge synthetic getMarker()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v0

    return-object v0
.end method

.method public getPosition()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/NestMarker;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    move-result-object v0

    invoke-static {v0}, LLB0;->a(Lco/bird/android/model/persistence/nestedstructures/Coordinate;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    return-object v0
.end method

.method public getSelected()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->selected:Z

    return v0
.end method

.method public getSnippet()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getZIndex()F
    .locals 6

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x64

    goto :goto_3

    :cond_0
    iget v0, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->claimedProgress:I

    const/4 v1, 0x0

    if-lez v0, :cond_1

    const/4 v0, 0x5

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/NestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v0

    const/4 v2, -0x1

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    sget-object v3, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    :goto_0
    const/4 v3, 0x1

    const/4 v4, 0x4

    if-eq v0, v3, :cond_5

    const/4 v3, 0x3

    const/4 v5, 0x2

    if-eq v0, v5, :cond_4

    if-eq v0, v3, :cond_3

    if-eq v0, v4, :cond_6

    move v2, v1

    goto :goto_1

    :cond_3
    move v2, v5

    goto :goto_1

    :cond_4
    move v2, v3

    goto :goto_1

    :cond_5
    move v2, v4

    :cond_6
    :goto_1
    add-int/lit8 v0, v2, 0x0

    :goto_2
    add-int/2addr v0, v1

    :goto_3
    int-to-float v0, v0

    const/high16 v1, 0x424c0000    # 51.0f

    add-float/2addr v1, v0

    return v1
.end method

.method public isSelected()Z
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getSelected()Z

    move-result v0

    return v0
.end method

.method public final setClaimedProgress(I)V
    .locals 0

    iput p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->claimedProgress:I

    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->selected:Z

    return-void
.end method

.method public shouldCluster()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
