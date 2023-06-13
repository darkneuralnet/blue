.class public final Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;
.super Landroidx/work/RxWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\u000c\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;",
        "Landroidx/work/RxWorker;",
        "Lio/reactivex/F;",
        "Landroidx/work/c$a;",
        "r",
        "LEa;",
        "h",
        "LEa;",
        "A",
        "()LEa;",
        "setAnalyticsManager",
        "(LEa;)V",
        "analyticsManager",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "i",
        "a",
        "analytics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final i:Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker$a;


# instance fields
.field public h:LEa;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;->i:Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/RxWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroidx/work/c;->b()Landroid/content/Context;

    move-result-object p2

    const-string v0, "applicationContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type co.bird.android.manager.analytics.workers.AnalyticsWorkerComponent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcb;

    invoke-interface {p1, p0}, Lcb;->u3(Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;)V

    return-void
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;->y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;->z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w()V
    .locals 0

    invoke-static {}, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;->x()V

    return-void
.end method

.method public static final x()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "submitted analytics"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final A()LEa;
    .locals 1

    iget-object v0, p0, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;->h:LEa;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "analyticsManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public r()Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;->A()LEa;

    move-result-object v0

    invoke-interface {v0}, LEa;->C()Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LWa;

    invoke-direct {v1}, LWa;-><init>()V

    invoke-virtual {v0, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v0

    sget-object v1, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker$b;->g:Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker$b;

    new-instance v2, LXa;

    invoke-direct {v2, v1}, LXa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    sget-object v1, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker$c;->g:Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker$c;

    new-instance v2, LYa;

    invoke-direct {v2, v1}, LYa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->j0(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Landroidx/work/c$a;->b()Landroidx/work/c$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->R(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "analyticsManager.submitS\u2026eturnItem(Result.retry())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
