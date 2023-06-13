.class final Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds$holdNonReadyItems$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds;->holdNonReadyItems(Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;",
        "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;",
        "Lco/bird/android/model/wire/WireBird;",
        "it",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds$holdNonReadyItems$1;->this$0:Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)",
            "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds$holdNonReadyItems$1;->this$0:Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds;

    invoke-static {v1}, Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds;->access$getMarkerOverridesManager(Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds;)LBK2;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireBird;

    invoke-interface {v1, v2}, LBK2;->c(Lco/bird/android/model/wire/WireBird;)LLt2;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;-><init>(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LLt2;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds$holdNonReadyItems$1;->invoke(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;

    move-result-object p1

    return-object p1
.end method
