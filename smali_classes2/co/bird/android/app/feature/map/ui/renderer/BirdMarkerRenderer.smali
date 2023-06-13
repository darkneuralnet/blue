.class public final Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapModelRenderer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/ui/MapModelRenderer<",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;",
        "Lco/bird/android/app/feature/map/ui/MapModelRenderer;",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "clusterManager",
        "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;",
        "(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;)V",
        "render",
        "",
        "models",
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
.field private final clusterManager:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;)V
    .locals 1

    const-string v0, "clusterManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;->clusterManager:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    return-void
.end method


# virtual methods
.method public render(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)V"
        }
    .end annotation

    const-string v0, "models"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;->clusterManager:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->set(Ljava/util/List;)V

    return-void
.end method
