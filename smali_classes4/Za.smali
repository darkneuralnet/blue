.class public final LZa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;LEa;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;->h:LEa;

    return-void
.end method


# virtual methods
.method public b(Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;)V
    .locals 1

    iget-object v0, p0, LZa;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, LZa;->a(Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;LEa;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;

    invoke-virtual {p0, p1}, LZa;->b(Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;)V

    return-void
.end method
