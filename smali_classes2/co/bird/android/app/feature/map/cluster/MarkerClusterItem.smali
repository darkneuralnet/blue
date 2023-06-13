.class public abstract Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEl0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LEl0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00028\u00008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u00058&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "T",
        "LEl0;",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "getMarker",
        "()Ljava/lang/Object;",
        "marker",
        "getSelected",
        "()Z",
        "setSelected",
        "(Z)V",
        "selected",
        "",
        "getId",
        "()Ljava/lang/String;",
        "id",
        "<init>",
        "()V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract getMarker()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract synthetic getPosition()Lcom/google/android/gms/maps/model/LatLng;
.end method

.method public abstract getSelected()Z
.end method

.method public abstract synthetic getSnippet()Ljava/lang/String;
.end method

.method public abstract synthetic getTitle()Ljava/lang/String;
.end method

.method public abstract synthetic getZIndex()F
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public abstract synthetic isSelected()Z
.end method

.method public abstract setSelected(Z)V
.end method

.method public abstract synthetic shouldCluster()Z
.end method
