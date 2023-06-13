.class public final Lts3$E;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts3;->I1(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/TaskOrderData;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/TaskOrderData;",
        "taskOrderData",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lco/bird/android/model/TaskOrderData;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lts3;


# direct methods
.method public constructor <init>(Lts3;)V
    .locals 0

    iput-object p1, p0, Lts3$E;->g:Lts3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lts3;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, Lts3$E;->f(Lts3;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lts3$E;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic c(Lio/reactivex/c;Lts3;)Lio/reactivex/c;
    .locals 0

    invoke-static {p0, p1}, Lts3$E;->e(Lio/reactivex/c;Lts3;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lio/reactivex/c;Lts3;)Lio/reactivex/c;
    .locals 3

    new-instance v0, LCs3;

    invoke-direct {v0, p1}, LCs3;-><init>(Lts3;)V

    invoke-static {v0}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p0

    new-instance v0, Lts3$E$f;

    invoke-direct {v0, p1}, Lts3$E$f;-><init>(Lts3;)V

    new-instance v1, LDs3;

    invoke-direct {v1, v0}, LDs3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p0

    const-string v0, "override fun onCreate(zo\u2026cribe(loadBirdsRelay)\n  }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lts3;->access$getUi$p(Lts3;)LCw3;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lts3;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lts3;->access$getTaskOrderManager$p(Lts3;)LtZ5;

    move-result-object p0

    invoke-interface {p0}, LtZ5;->refresh()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lco/bird/android/model/TaskOrderData;)Lio/reactivex/h;
    .locals 11

    const-string v0, "taskOrderData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/TaskOrderData;->getTaskOrderInfo()Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;->getCanOperate()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lts3$E;->g:Lts3;

    invoke-static {v0}, Lts3;->access$getUi$p(Lts3;)LCw3;

    move-result-object v1

    new-instance v2, LkD3;

    invoke-virtual {p1}, Lco/bird/android/model/TaskOrderData;->getBirdCode()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, LkD3;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lts3$E$a;

    iget-object p1, p0, Lts3$E;->g:Lts3;

    invoke-direct {v5, p1}, Lts3$E$a;-><init>(Lts3;)V

    new-instance v6, Lts3$E$b;

    iget-object p1, p0, Lts3$E;->g:Lts3;

    invoke-direct {v6, p1}, Lts3$E$b;-><init>(Lts3;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x66

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, LH31$a;->showDialogCompletable$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lts3$E;->g:Lts3;

    invoke-static {p1}, Lts3;->access$getUi$p(Lts3;)LCw3;

    move-result-object v0

    sget-object v1, La93;->d:La93;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lts3$E$c;

    iget-object p1, p0, Lts3$E;->g:Lts3;

    invoke-direct {v4, p1}, Lts3$E$c;-><init>(Lts3;)V

    new-instance v5, Lts3$E$d;

    iget-object p1, p0, Lts3$E;->g:Lts3;

    invoke-direct {v5, p1}, Lts3$E$d;-><init>(Lts3;)V

    new-instance v6, Lts3$E$e;

    iget-object p1, p0, Lts3$E;->g:Lts3;

    invoke-direct {v6, p1}, Lts3$E$e;-><init>(Lts3;)V

    const/4 v7, 0x0

    const/16 v8, 0x46

    const/4 v9, 0x0

    invoke-static/range {v0 .. v9}, LH31$a;->showDialogCompletable$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/TaskOrderData;

    invoke-virtual {p0, p1}, Lts3$E;->d(Lco/bird/android/model/TaskOrderData;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
