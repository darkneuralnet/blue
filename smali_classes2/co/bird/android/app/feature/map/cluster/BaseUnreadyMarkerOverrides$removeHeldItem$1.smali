.class final Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$removeHeldItem$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;->removeHeldItem(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem<",
        "TT;>;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "it",
        "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;",
        "invoke",
        "(Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;)Ljava/lang/Boolean;"
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
.field final synthetic $marker:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides<",
            "TT;>;TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$removeHeldItem$1;->this$0:Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;

    iput-object p2, p0, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$removeHeldItem$1;->$marker:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;)Ljava/lang/Boolean;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem<",
            "TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;->getItem()Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$removeHeldItem$1;->this$0:Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$removeHeldItem$1;->$marker:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;->markerId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$removeHeldItem$1;->invoke(Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
