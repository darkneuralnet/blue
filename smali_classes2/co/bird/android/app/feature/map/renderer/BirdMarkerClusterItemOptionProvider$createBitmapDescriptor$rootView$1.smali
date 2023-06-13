.class final Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->createBitmapDescriptor(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)LPT;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/graphics/PointF;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "anchor",
        "Landroid/graphics/PointF;",
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
.field final synthetic $this_createBitmapDescriptor:Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$1;->this$0:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$1;->$this_createBitmapDescriptor:Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/graphics/PointF;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$1;->invoke(Landroid/graphics/PointF;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/graphics/PointF;)V
    .locals 3

    const-string v0, "anchor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$1;->this$0:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    invoke-static {v0}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->access$getAnchorCache$p(Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;)Landroid/util/LruCache;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$1;->this$0:Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$createBitmapDescriptor$rootView$1;->$this_createBitmapDescriptor:Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-static {v1, v2}, Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;->access$getAnchorKey(Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, LwE2;->b(Landroid/util/LruCache;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
