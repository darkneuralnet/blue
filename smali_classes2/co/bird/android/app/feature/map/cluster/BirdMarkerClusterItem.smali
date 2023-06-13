.class public abstract Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
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
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u0003\u00a2\u0006\u0004\u0008#\u0010$J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016J\u0008\u0010\n\u001a\u00020\u0008H\u0016J\u0008\u0010\u000c\u001a\u00020\u000bH\u0016J\u0013\u0010\u000f\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\u0008\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0012\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00028\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006%"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "T",
        "LEl0;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "getPosition",
        "",
        "getTitle",
        "getSnippet",
        "",
        "isSelected",
        "shouldCluster",
        "",
        "getZIndex",
        "",
        "other",
        "equals",
        "",
        "hashCode",
        "id",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "marker",
        "Ljava/lang/Object;",
        "getMarker",
        "()Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        "state",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        "getState",
        "()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        "setState",
        "(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V",
        "position",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lcom/google/android/gms/maps/model/LatLng;)V",
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
.field private final id:Ljava/lang/String;

.field private final marker:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private position:Lcom/google/android/gms/maps/model/LatLng;

.field private state:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;",
            "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->marker:Ljava/lang/Object;

    iput-object p3, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->state:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    iput-object p4, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->position:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lcom/google/android/gms/maps/model/LatLng;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    sget-object p3, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;-><init>(Ljava/lang/String;Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->id:Ljava/lang/String;

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    iget-object p1, p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->id:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMarker()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->marker:Ljava/lang/Object;

    return-object v0
.end method

.method public getPosition()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->position:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public getSnippet()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->state:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getZIndex()F
    .locals 1

    const/high16 v0, 0x42480000    # 50.0f

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isSelected()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->state:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    sget-object v1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final setState(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->state:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    return-void
.end method

.method public shouldCluster()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
