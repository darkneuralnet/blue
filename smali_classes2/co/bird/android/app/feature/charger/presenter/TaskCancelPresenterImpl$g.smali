.class public final Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->K()V
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
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lkotlin/Unit;)Lio/reactivex/h;"
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

    iput-object p1, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->d(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-static {p0, v2, v0, v1, v0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->P(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;ZLjava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/Unit;)Lio/reactivex/h;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-static {p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->access$getUi$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)LrZ5;

    move-result-object p1

    invoke-virtual {p1}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object p1

    sget v0, Lnl4;->task_indirect_cancel_request_subject:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ui.activity.getString(L.\u2026t_cancel_request_subject)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->access$getUi$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)LrZ5;

    move-result-object v0

    invoke-virtual {v0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    sget v1, Lnl4;->task_indirect_cancel_request_description:I

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-static {v3}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->access$getBirdCode$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    const-string v3, "birdCode"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v4

    :cond_0
    const/4 v5, 0x0

    aput-object v3, v2, v5

    iget-object v3, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-static {v3}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->access$getTaskId$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "taskId"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v4

    :cond_1
    const/4 v6, 0x1

    aput-object v3, v2, v6

    iget-object v3, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-static {v3}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->access$getUi$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)LrZ5;

    move-result-object v3

    invoke-virtual {v3}, LrZ5;->Ql()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x2

    aput-object v3, v2, v6

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ui.activity.getString(\n \u2026ui.reasonText()\n        )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, LiZ5;->a(Ljava/lang/String;Ljava/lang/String;)Lzendesk/support/CreateRequest;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->E(Lzendesk/support/CreateRequest;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->access$getUi$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)LrZ5;

    move-result-object v0

    invoke-static {p1, v0, v5, v6, v4}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g$a;

    iget-object v1, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g$a;-><init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V

    new-instance v1, LgZ5;

    invoke-direct {v1, v0}, LgZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    new-instance v1, LhZ5;

    invoke-direct {v1, v0}, LhZ5;-><init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;->c(Lkotlin/Unit;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
