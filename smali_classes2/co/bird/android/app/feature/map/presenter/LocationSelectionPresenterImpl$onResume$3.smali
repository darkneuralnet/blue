.class final Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume()V
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
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$3;->this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$3;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$3;->this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->access$getUi$p(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    move-result-object v0

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->hideKeyboard()V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$3;->this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->access$getUi$p(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    move-result-object v0

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->setAddress(Ljava/lang/String;)V

    return-void
.end method
