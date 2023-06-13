.class public final LIT4$M;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;-><init>(Landroid/content/Context;LNP4;LXW2;Lef6;LKn6;LpJ;LpM3;LTq4;LUz1;LpU4;LEa;LTo0;LV74;LEg1;LRh6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LZ84<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/RideState;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/RideState;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()LZ84;",
        "<anonymous>"
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
        "SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$focusedRideState$2\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1626:1\n52#2,2:1627\n1#3:1629\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$focusedRideState$2\n*L\n175#1:1627,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LIT4;


# direct methods
.method public constructor <init>(LIT4;)V
    .locals 0

    iput-object p1, p0, LIT4$M;->g:LIT4;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, LIT4$M;->b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method


# virtual methods
.method public final invoke()LZ84;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/RideState;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lee3;->a:Lee3;

    iget-object v0, p0, LIT4$M;->g:LIT4;

    invoke-static {v0}, LIT4;->access$getRideMapStateManager$p(LIT4;)LpU4;

    move-result-object v0

    invoke-interface {v0}, LpU4;->i()LZ84;

    move-result-object v0

    iget-object v1, p0, LIT4$M;->g:LIT4;

    invoke-static {v1}, LIT4;->access$getMutableRideStates$p(LIT4;)La94;

    move-result-object v1

    sget-object v2, LIT4$M$b;->a:LIT4$M$b;

    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "combineLatest(source1, s\u2026, t2: T2 -> (t1 to t2) })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LIT4$M$a;->g:LIT4$M$a;

    new-instance v2, LTT4;

    invoke-direct {v2, v1}, LTT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    iget-object v2, p0, LIT4$M;->g:LIT4;

    invoke-static {v2}, LIT4;->access$getRideMapStateManager$p(LIT4;)LpU4;

    move-result-object v2

    invoke-interface {v2}, LpU4;->i()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireBird;

    if-eqz v2, :cond_2

    iget-object v3, p0, LIT4$M;->g:LIT4;

    invoke-virtual {v3}, LIT4;->o0()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/RideStates;

    invoke-virtual {v3, v2}, Lco/bird/android/model/RideStates;->rideForBird(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/RideState;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-static {v2}, Lco/bird/android/model/RideStateKt;->isInRide(Lco/bird/android/model/RideState;)Z

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    move v3, v5

    :cond_0
    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_3

    :cond_2
    iget-object v2, p0, LIT4$M;->g:LIT4;

    invoke-virtual {v2}, LIT4;->o0()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/RideStates;

    invoke-static {v2}, Lco/bird/android/model/RideStatesKt;->firstActivePrimaryThenGuestOrNull(Lco/bird/android/model/RideStates;)Lco/bird/android/model/RideState;

    move-result-object v2

    :cond_3
    invoke-virtual {v1, v2}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    sget-object v2, LZ84;->d:LZ84$a;

    const-string v3, "focusedRideStateObservable"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, LZ84$a;->c(Lio/reactivex/Observable;Ljava/lang/Object;)LZ84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIT4$M;->invoke()LZ84;

    move-result-object v0

    return-object v0
.end method
