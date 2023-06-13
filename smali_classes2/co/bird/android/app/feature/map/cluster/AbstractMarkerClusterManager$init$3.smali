.class final Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$3;
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
        "Lkotlin/Unit;",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\u0008\u0000\u0010\u0003\"\u000e\u0008\u0001\u0010\u0004*\u0008\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        "kotlin.jvm.PlatformType",
        "K",
        "T",
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "it",
        "",
        "invoke",
        "(Lkotlin/Unit;)Lcom/google/android/gms/maps/model/VisibleRegion;"
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

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$3;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Unit;)Lcom/google/android/gms/maps/model/VisibleRegion;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$3;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getMap()LcD1;

    move-result-object p1

    invoke-virtual {p1}, LcD1;->k()LU74;

    move-result-object p1

    invoke-virtual {p1}, LU74;->b()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$3;->invoke(Lkotlin/Unit;)Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object p1

    return-object p1
.end method
