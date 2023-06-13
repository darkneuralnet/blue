.class public final Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->F()V
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
        "Lio/reactivex/K<",
        "+",
        "LHM4<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0008\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/K;",
        "LHM4;",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)Lio/reactivex/K;",
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
.field public final synthetic g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$c;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Unit;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LHM4<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$c;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-static {p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->access$getContractorManager$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)LjB0;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$c;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->access$getTaskId$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "taskId"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$c;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-static {v1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->access$getUi$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)LrZ5;

    move-result-object v1

    invoke-virtual {v1}, LrZ5;->Ql()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LjB0;->d(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$c;->invoke(Lkotlin/Unit;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
