.class public final Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;
.super Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AddMarkers"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction<",
        "TK;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u0000*\u0004\u0008\u0003\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00030\u0004\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00030\u0004H\u00c6\u0003J\u001f\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00030\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00030\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00030\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;",
        "K",
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;",
        "markers",
        "",
        "(Ljava/util/List;)V",
        "getMarkers",
        "()Ljava/util/List;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final markers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TK;>;)V"
        }
    .end annotation

    const-string v0, "markers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;->markers:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;->markers:Ljava/util/List;

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;->copy(Ljava/util/List;)Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;->markers:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;)Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TK;>;)",
            "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers<",
            "TK;>;"
        }
    .end annotation

    const-string v0, "markers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;->markers:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;->markers:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMarkers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;->markers:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;->markers:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;->markers:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AddMarkers(markers="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
