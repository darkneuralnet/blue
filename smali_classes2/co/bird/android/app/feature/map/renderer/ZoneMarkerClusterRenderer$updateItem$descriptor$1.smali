.class final Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$updateItem$descriptor$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->updateItem(Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;LfM2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LPT;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LPT;",
        "invoke",
        "()LPT;",
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
.field final synthetic $item:Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

.field final synthetic this$0:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$updateItem$descriptor$1;->this$0:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$updateItem$descriptor$1;->$item:Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LPT;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$updateItem$descriptor$1;->this$0:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$updateItem$descriptor$1;->$item:Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

    invoke-static {v0, v1}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->access$bitmapDescriptor(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)LPT;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$updateItem$descriptor$1;->invoke()LPT;

    move-result-object v0

    return-object v0
.end method
