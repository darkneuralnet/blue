.class public final LIT4$F;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->a0(Lco/bird/android/model/wire/WireRide;LbF0;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/CompleteRideResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "e",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/CompleteRideResponse;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Throwable;)Lio/reactivex/K;",
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
.field public final synthetic g:LIT4;

.field public final synthetic h:Lco/bird/android/model/wire/WireRide;


# direct methods
.method public constructor <init>(LIT4;Lco/bird/android/model/wire/WireRide;)V
    .locals 0

    iput-object p1, p0, LIT4$F;->g:LIT4;

    iput-object p2, p0, LIT4$F;->h:Lco/bird/android/model/wire/WireRide;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/CompleteRideResponse;
    .locals 0

    invoke-static {p0, p1}, LIT4$F;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/CompleteRideResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lco/bird/android/model/wire/WireRide;LIT4;)V
    .locals 0

    invoke-static {p0, p1}, LIT4$F;->i(Lco/bird/android/model/wire/WireRide;LIT4;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, LIT4$F;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LIT4$F;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireRide;
    .locals 0

    invoke-static {p0, p1}, LIT4$F;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireRide;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LIT4$F;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireRide;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireRide;

    return-object p0
.end method

.method public static final i(Lco/bird/android/model/wire/WireRide;LIT4;)V
    .locals 9

    const-string v0, "$ride"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No active rides found, gonna set ride "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " to ended"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lco/bird/android/model/RideState;

    sget-object v4, Lco/bird/android/model/RideState$Status;->ENDED:Lco/bird/android/model/RideState$Status;

    invoke-virtual {p1}, LIT4;->r()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lco/bird/android/model/wire/configs/Config;

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Lco/bird/android/model/RideState;-><init>(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v0}, LIT4;->access$updateExistingRideState(LIT4;Lco/bird/android/model/RideState;)Z

    return-void
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/CompleteRideResponse;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/CompleteRideResponse;

    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Throwable;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/CompleteRideResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Error while calling ride/complete, attempting to get active ride(s) to recover gracefully..."

    invoke-static {p1, v1, v0}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LIT4$F;->g:LIT4;

    invoke-static {v0}, LIT4;->access$getMultiRideClient$p(LIT4;)LXW2;

    move-result-object v0

    invoke-interface {v0}, LXW2;->i()Lio/reactivex/p;

    move-result-object v0

    new-instance v1, LIT4$F$a;

    iget-object v2, p0, LIT4$F;->h:Lco/bird/android/model/wire/WireRide;

    invoke-direct {v1, v2}, LIT4$F$a;-><init>(Lco/bird/android/model/wire/WireRide;)V

    new-instance v2, LMT4;

    invoke-direct {v2, v1}, LMT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/p;->x(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object v0

    new-instance v1, LIT4$F$b;

    iget-object v2, p0, LIT4$F;->h:Lco/bird/android/model/wire/WireRide;

    invoke-direct {v1, v2}, LIT4$F$b;-><init>(Lco/bird/android/model/wire/WireRide;)V

    new-instance v2, LNT4;

    invoke-direct {v2, v1}, LNT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object v0

    iget-object v1, p0, LIT4$F;->h:Lco/bird/android/model/wire/WireRide;

    iget-object v2, p0, LIT4$F;->g:LIT4;

    new-instance v3, LOT4;

    invoke-direct {v3, v1, v2}, LOT4;-><init>(Lco/bird/android/model/wire/WireRide;LIT4;)V

    invoke-virtual {v0, v3}, Lio/reactivex/p;->n(Lio/reactivex/functions/a;)Lio/reactivex/p;

    move-result-object v0

    new-instance v1, LIT4$F$c;

    iget-object v2, p0, LIT4$F;->g:LIT4;

    invoke-direct {v1, v2}, LIT4$F$c;-><init>(LIT4;)V

    new-instance v2, LPT4;

    invoke-direct {v2, v1}, LPT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/p;->s(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object v0

    new-instance v1, LIT4$F$d;

    iget-object v2, p0, LIT4$F;->h:Lco/bird/android/model/wire/WireRide;

    iget-object v3, p0, LIT4$F;->g:LIT4;

    invoke-direct {v1, v2, v3}, LIT4$F$d;-><init>(Lco/bird/android/model/wire/WireRide;LIT4;)V

    new-instance v2, LQT4;

    invoke-direct {v2, v1}, LQT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/p;->p(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object v0

    new-instance v1, LIT4$F$e;

    iget-object v2, p0, LIT4$F;->g:LIT4;

    invoke-direct {v1, v2, p1}, LIT4$F$e;-><init>(LIT4;Ljava/lang/Throwable;)V

    new-instance v2, LRT4;

    invoke-direct {v2, v1}, LRT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object v0

    iget-object v1, p0, LIT4$F;->g:LIT4;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, p1, v2, v3, v2}, LIT4;->R3(LIT4;Ljava/lang/Throwable;Lco/bird/android/model/wire/WireRide;ILjava/lang/Object;)Lco/bird/android/model/CompleteRideResponse;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/p;->j(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object v0

    iget-object v1, p0, LIT4$F;->g:LIT4;

    invoke-static {v1, p1, v2, v3, v2}, LIT4;->R3(LIT4;Ljava/lang/Throwable;Lco/bird/android/model/wire/WireRide;ILjava/lang/Object;)Lco/bird/android/model/CompleteRideResponse;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/p;->O(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object v0

    iget-object v1, p0, LIT4$F;->g:LIT4;

    invoke-static {v1, p1, v2, v3, v2}, LIT4;->R3(LIT4;Ljava/lang/Throwable;Lco/bird/android/model/wire/WireRide;ILjava/lang/Object;)Lco/bird/android/model/CompleteRideResponse;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/p;->f0(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LIT4$F;->invoke(Ljava/lang/Throwable;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
