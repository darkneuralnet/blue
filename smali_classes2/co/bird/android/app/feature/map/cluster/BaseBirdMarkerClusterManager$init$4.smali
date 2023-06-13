.class final Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014 \u0006*\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u0004j\u0002`\u0005H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "overrideId",
        "",
        "Lco/bird/android/coreinterface/manager/MarkerOverrideId;",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$4;->this$0:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$4;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$4;->this$0:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    move-result-object v0

    const-string v1, "overrideId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;->ready(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$4;->this$0:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->reload()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$4;->this$0:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->setOverrideReadyToRender(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
