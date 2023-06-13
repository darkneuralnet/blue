.class public final LLK$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK;->b1(Lco/bird/android/model/Vehicle;Ljava/lang/String;ZLorg/joda/time/DateTime;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/Vehicle;",
        "+",
        "Lco/bird/android/model/Vehicle;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/Vehicle;",
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
.field public final synthetic g:LLK;

.field public final synthetic h:Lorg/joda/time/DateTime;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(LLK;Lorg/joda/time/DateTime;Z)V
    .locals 0

    iput-object p1, p0, LLK$o;->g:LLK;

    iput-object p2, p0, LLK$o;->h:Lorg/joda/time/DateTime;

    iput-boolean p3, p0, LLK$o;->i:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LLK$o;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lorg/joda/time/DateTime;
    .locals 0

    invoke-static {p0, p1}, LLK$o;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lorg/joda/time/DateTime;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LLK$o;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lorg/joda/time/DateTime;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/joda/time/DateTime;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LLK$o;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Vehicle;",
            "Lco/bird/android/model/Vehicle;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/Vehicle;

    iget-object v0, p0, LLK$o;->g:LLK;

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-virtual {v0, v1}, LLK;->i(Lco/bird/android/model/wire/WireBird;)V

    iget-object v0, p0, LLK$o;->h:Lorg/joda/time/DateTime;

    if-eqz v0, :cond_0

    iget-object v0, p0, LLK$o;->g:LLK;

    invoke-static {v0}, LLK;->access$getAnalyticsManager$p(LLK;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/BluetoothAutoReconnected;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v2

    iget-object v4, p0, LLK$o;->h:Lorg/joda/time/DateTime;

    invoke-virtual {v4}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Lco/bird/android/model/analytics/BluetoothAutoReconnected;-><init>(J)V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    :cond_0
    iget-object v0, p0, LLK$o;->g:LLK;

    invoke-static {v0}, LLK;->access$getVehicleManager$p(LLK;)Lsm6;

    move-result-object v0

    const-string v1, "vehicleWithNewToken"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lsm6;->l(Lco/bird/android/model/Vehicle;)Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, LLK$o$a;->g:LLK$o$a;

    new-instance v2, LMK;

    invoke-direct {v2, v1}, LMK;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LLK$o$b;

    iget-object v2, p0, LLK$o;->g:LLK;

    iget-boolean v3, p0, LLK$o;->i:Z

    invoke-direct {v1, v2, p1, v3}, LLK$o$b;-><init>(LLK;Lco/bird/android/model/Vehicle;Z)V

    new-instance v2, LNK;

    invoke-direct {v2, v1}, LNK;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LLK$o;->g:LLK;

    invoke-static {v1}, LLK;->access$getStopAutoReconnectingSubject$p(LLK;)Lio/reactivex/subjects/d;

    move-result-object v1

    new-instance v2, LLK$o$c;

    invoke-direct {v2, p1}, LLK$o$c;-><init>(Lco/bird/android/model/Vehicle;)V

    new-instance v3, LOK;

    invoke-direct {v3, v2}, LOK;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v1

    iget-object v2, p0, LLK$o;->g:LLK;

    invoke-static {v2}, LLK;->access$getVehicleManager$p(LLK;)Lsm6;

    move-result-object v2

    invoke-interface {v2, p1}, Lsm6;->k(Lco/bird/android/model/Vehicle;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {v1, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method
