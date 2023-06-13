.class final Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->observeDone()Lio/reactivex/Observable;
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
        "Lco/bird/android/model/LocationSelectionModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "Lco/bird/android/model/LocationSelectionModel;",
        "kotlin.jvm.PlatformType",
        "address",
        "",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$4;->this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Lco/bird/android/model/LocationSelectionModel;
    .locals 2

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/LocationSelectionModel;

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$4;->this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    invoke-static {v1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->access$getUi$p(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    move-result-object v1

    invoke-interface {v1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lco/bird/android/model/LocationSelectionModel;-><init>(Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$4;->invoke(Ljava/lang/String;)Lco/bird/android/model/LocationSelectionModel;

    move-result-object p1

    return-object p1
.end method
