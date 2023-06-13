.class final Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2;->invoke(Lkotlin/Pair;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LNn;",
        "Lkotlin/Pair;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0004\u0010\u0008\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LNn;",
        "it",
        "Lkotlin/Pair;",
        "Landroid/location/Location;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(LNn;)Lkotlin/Pair;",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2$1;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LNn;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2$1;->invoke(LNn;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(LNn;)Lkotlin/Pair;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/location/Location;

    const-string v0, ""

    invoke-direct {p1, v0}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2$1;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->access$getUi$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Lco/bird/android/app/feature/map/ui/MapUi;

    move-result-object v0

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->getCenterLocation()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    iget-wide v1, v0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-virtual {p1, v1, v2}, Landroid/location/Location;->setLatitude(D)V

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-virtual {p1, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
