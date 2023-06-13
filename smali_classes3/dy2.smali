.class public final Ldy2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\u0008#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007R\u0014\u0010\u000c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0018R\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006%"
    }
    d2 = {
        "Ldy2;",
        "",
        "",
        "b",
        "",
        "e",
        "a",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/DialogResponse;",
        "c",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "Le13;",
        "Le13;",
        "navigator",
        "Lgl;",
        "d",
        "Lgl;",
        "preference",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "lock",
        "Ljava/util/concurrent/locks/Condition;",
        "kotlin.jvm.PlatformType",
        "f",
        "Ljava/util/concurrent/locks/Condition;",
        "condition",
        "",
        "g",
        "Z",
        "mainActivityLoaded",
        "<init>",
        "(LEa;Landroid/content/Context;Le13;Lgl;)V",
        "login-exception-handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LEa;

.field public final b:Landroid/content/Context;

.field public final c:Le13;

.field public final d:Lgl;

.field public final e:Ljava/util/concurrent/locks/ReentrantLock;

.field public final f:Ljava/util/concurrent/locks/Condition;

.field public g:Z


# direct methods
.method public constructor <init>(LEa;Landroid/content/Context;Le13;Lgl;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldy2;->a:LEa;

    iput-object p2, p0, Ldy2;->b:Landroid/content/Context;

    iput-object p3, p0, Ldy2;->c:Le13;

    iput-object p4, p0, Ldy2;->d:Lgl;

    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Ldy2;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    iput-object p1, p0, Ldy2;->f:Ljava/util/concurrent/locks/Condition;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 4

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/android/model/LoginException;

    if-eqz v0, :cond_4

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    check-cast p1, Lco/bird/android/model/LoginException;

    instance-of v0, p1, Lco/bird/android/model/NotLoggedInException;

    const-string v1, "IntroMagicLink"

    if-eqz v0, :cond_0

    iget-object p1, p0, Ldy2;->a:LEa;

    new-instance v0, Lco/bird/android/model/analytics/SplashScreenNavigation;

    const-string v2, "checkConfig_no_token"

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/SplashScreenNavigation;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, Ldy2;->c:Le13;

    invoke-interface {p1}, Le13;->C2()V

    iget-object p1, p0, Ldy2;->c:Le13;

    invoke-interface {p1}, Le13;->close()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/AuthenticationException;

    if-eqz v0, :cond_1

    iget-object p1, p0, Ldy2;->a:LEa;

    new-instance v0, Lco/bird/android/model/analytics/SplashScreenNavigation;

    const-string v2, "checkConfig_existing_token"

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/SplashScreenNavigation;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, Ldy2;->d:Lgl;

    invoke-virtual {p1}, Lgl;->d()V

    iget-object p1, p0, Ldy2;->c:Le13;

    invoke-interface {p1}, Le13;->C2()V

    iget-object p1, p0, Ldy2;->c:Le13;

    invoke-interface {p1}, Le13;->close()V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/UpdateRequiredException;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object p1, p0, Ldy2;->a:LEa;

    new-instance v0, Lco/bird/android/model/analytics/SplashScreenNavigation;

    const-string v3, "PlayStore"

    invoke-direct {v0, v3, v2, v1, v2}, Lco/bird/android/model/analytics/SplashScreenNavigation;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, Ldy2;->c:Le13;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Le13;->D2(I)V

    iget-object p1, p0, Ldy2;->c:Le13;

    invoke-interface {p1}, Le13;->close()V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lco/bird/android/model/UserSuspendedException;

    if-eqz v0, :cond_3

    iget-object p1, p0, Ldy2;->a:LEa;

    new-instance v0, Lco/bird/android/model/analytics/SplashScreenNavigation;

    const-string v3, "AppClose"

    invoke-direct {v0, v3, v2, v1, v2}, Lco/bird/android/model/analytics/SplashScreenNavigation;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, Ldy2;->c:Le13;

    invoke-interface {p1}, Le13;->close()V

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lco/bird/android/model/UpdateRequestException;

    :cond_4
    :goto_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Ldy2;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Ldy2;->g:Z

    iget-object v1, p0, Ldy2;->f:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signalAll()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public final c()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldy2;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, LXE0;

    if-eqz v1, :cond_0

    check-cast v0, LXE0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, LXE0;->getActivity()Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ldy2$a;

    invoke-direct {v1, v0}, Ldy2$a;-><init>(Landroid/app/Activity;)V

    invoke-static {v1}, Lnh5;->k(Lkotlin/jvm/functions/Function1;)Lio/reactivex/F;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_1
    invoke-static {}, Lio/reactivex/F;->M()Lio/reactivex/F;

    move-result-object v0

    const-string v1, "never()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
