.class public final Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->n(Lcom/uber/autodispose/ScopeProvider;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$f;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$f;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;)Lio/reactivex/h;
    .locals 4

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;->a()Z

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;->b()Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    move-result-object p1

    if-eqz v0, :cond_0

    sget-object v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;->b:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$b;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$f;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getReactiveConfig$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getUserTracking()Lco/bird/android/model/wire/configs/UserTrackingConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/UserTrackingConfig;->getTrackIntervalSeconds()I

    move-result p1

    int-to-long v0, p1

    const-wide/16 v2, 0x0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v0, v1, p1}, Lio/reactivex/Observable;->interval(JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lio/reactivex/b;->f:Lio/reactivex/b;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lio/reactivex/k;->t0(Lio/reactivex/E;ZI)Lio/reactivex/k;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$f$a;

    iget-object v1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$f;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$f$a;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    new-instance v1, Lei6;

    invoke-direct {v1, v0}, Lei6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/k;->Z(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$f;->b(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
