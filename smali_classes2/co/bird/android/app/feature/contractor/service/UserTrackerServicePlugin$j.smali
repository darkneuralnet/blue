.class public final Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;-><init>(Landroid/content/Context;Lom3;LRh6;Ldr4;LTq4;Lde5;Landroid/content/Intent;Lgl;LLifecycleOwner;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/reactivex/Observable<",
        "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a&\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/reactivex/Observable;",
        "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;",
        "kotlin.jvm.PlatformType",
        "c",
        "()Lio/reactivex/Observable;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUserTrackerServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$shouldForegroundSetup$2\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,208:1\n61#2,2:209\n41#2,2:211\n22#2,2:213\n*S KotlinDebug\n*F\n+ 1 UserTrackerServicePlugin.kt\nco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$shouldForegroundSetup$2\n*L\n101#1:209,2\n114#1:211,2\n99#1:213,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final c()Lio/reactivex/Observable;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    iget-object v0, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {v0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getReactiveConfig$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->B3()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {v1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getUserStream$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)LRh6;

    move-result-object v1

    invoke-interface {v1}, LRh6;->h()LZ84;

    move-result-object v1

    sget-object v2, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$a;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$a;

    new-instance v3, Lgi6;

    invoke-direct {v3, v2}, Lgi6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "userStream.currentUserSt\u2026)?.isOperator() == true }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {v2}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getPreference$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lgl;

    move-result-object v2

    invoke-virtual {v2}, Lgl;->C0()Lio/reactivex/Observable;

    move-result-object v2

    iget-object v3, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {v3}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getLifecycleObservable$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lio/reactivex/Observable;

    move-result-object v3

    iget-object v4, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    new-instance v5, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$c;

    invoke-direct {v5, v4}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$c;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    invoke-static {v0, v1, v2, v3, v5}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/i;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "Observable.combineLatest\u2026nction(t1, t2, t3, t4) })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {v1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getLocationManager$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Ldr4;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Ldr4$a;->frequentLocationUpdates$default(Ldr4;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$b;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$b;

    new-instance v3, Lhi6;

    invoke-direct {v3, v2}, Lhi6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "locationManager\n        \u2026 }.distinctUntilChanged()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {v2}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getRxBleClient$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lde5;

    move-result-object v2

    invoke-virtual {v2}, Lde5;->d()Lio/reactivex/Observable;

    move-result-object v2

    iget-object v3, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {v3}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$getRxBleClient$p(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lde5;

    move-result-object v3

    invoke-virtual {v3}, Lde5;->c()Lde5$a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v2

    const-string v3, "rxBleClient.observeState\u2026e).distinctUntilChanged()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    invoke-static {v3}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;->access$observeNotificationsActive(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)Lio/reactivex/Observable;

    move-result-object v3

    new-instance v4, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$d;

    invoke-direct {v4}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$d;-><init>()V

    invoke-static {v1, v2, v3, v4}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/h;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "Observable.combineLatest\u2026neFunction(t1, t2, t3) })"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "Observables.combineLates\u2026  .distinctUntilChanged()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->g:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    new-instance v3, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$e;

    invoke-direct {v3, v2}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j$e;-><init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;)V

    invoke-static {v0, v1, v3}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "Observable.combineLatest\u2026ombineFunction(t1, t2) })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/reactivex/Observable;->share()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$j;->c()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
