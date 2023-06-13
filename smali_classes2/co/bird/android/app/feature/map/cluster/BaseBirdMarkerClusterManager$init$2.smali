.class final Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$2;
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
        "LfM2;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "LfM2;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "invoke",
        "(LfM2;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
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

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$2;->this$0:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LfM2;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$2;->invoke(LfM2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LfM2;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$2;->this$0:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object v0

    invoke-virtual {v0, p1}, LGl0;->c(LfM2;)Z

    return-void
.end method
