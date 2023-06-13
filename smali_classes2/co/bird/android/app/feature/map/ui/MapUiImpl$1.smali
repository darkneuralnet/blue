.class final Lco/bird/android/app/feature/map/ui/MapUiImpl$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/MapUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLdr4;)V
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$1;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl$1;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 2

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$1;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    invoke-static {p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->access$getCameraPosition$p(Lco/bird/android/app/feature/map/ui/MapUiImpl;)Lio/reactivex/subjects/d;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$1;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getMap()LcD1;

    move-result-object v0

    invoke-virtual {v0}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$1;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getMutableZoomLevelObservable()La94;

    move-result-object p1

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$1;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getMap()LcD1;

    move-result-object v1

    invoke-virtual {v1}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/maps/model/CameraPosition;->c:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$1;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    invoke-static {p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->access$getTeleportMarker$p(Lco/bird/android/app/feature/map/ui/MapUiImpl;)LfM2;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LfM2;->f()V

    :cond_0
    return-void
.end method
