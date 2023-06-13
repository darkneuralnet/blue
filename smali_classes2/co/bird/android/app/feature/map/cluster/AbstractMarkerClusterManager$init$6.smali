.class final Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$6;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction<",
        "TT;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u000e\u0008\u0001\u0010\u0003*\u0008\u0012\u0004\u0012\u0002H\u00020\u00042*\u0010\u0005\u001a&\u0012\u000c\u0012\n \u0007*\u0004\u0018\u0001H\u0003H\u0003 \u0007*\u0012\u0012\u000c\u0012\n \u0007*\u0004\u0018\u0001H\u0003H\u0003\u0018\u00010\u00060\u0006H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "K",
        "T",
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "markerAction",
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager<",
            "TK;TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager<",
            "TK;TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$6;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$6;->invoke(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction<",
            "TT;>;)V"
        }
    .end annotation

    instance-of v0, p1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$RemoveMarkers;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$6;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object v0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$RemoveMarkers;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$RemoveMarkers;->getMarkers()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LGl0;->q(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$6;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object v0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;->getMarkers()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LGl0;->h(Ljava/util/Collection;)V

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$ClearMarkers;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$6;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object p1

    invoke-virtual {p1}, LGl0;->i()V

    :cond_2
    :goto_0
    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$6;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object p1

    invoke-virtual {p1}, LGl0;->j()V

    return-void
.end method
