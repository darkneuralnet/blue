.class public final LSs1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQs1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u000b\u001a\u00020\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "LSs1;",
        "LQs1;",
        "",
        "vehicleId",
        "Lco/bird/android/model/constant/FlightSheetContext;",
        "context",
        "Lio/reactivex/c;",
        "n0",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/FlightSheetDetails;",
        "Y",
        "clear",
        "LTk3;",
        "a",
        "LTk3;",
        "operatorClient",
        "LBs1;",
        "b",
        "LBs1;",
        "flightSheetDetailsDao",
        "<init>",
        "(LTk3;LBs1;)V",
        "co.bird.android.repository.flight-sheet"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LTk3;

.field public final b:LBs1;


# direct methods
.method public constructor <init>(LTk3;LBs1;)V
    .locals 1

    const-string v0, "operatorClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flightSheetDetailsDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSs1;->a:LTk3;

    iput-object p2, p0, LSs1;->b:LBs1;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LSs1;->L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getFlightSheetDetailsDao$p(LSs1;)LBs1;
    .locals 0

    iget-object p0, p0, LSs1;->b:LBs1;

    return-object p0
.end method


# virtual methods
.method public K1(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LQs1$a;->a(LQs1;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public Y(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/FlightSheetContext;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/FlightSheetDetails;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSs1;->b:LBs1;

    invoke-virtual {p2}, Lco/bird/android/model/constant/FlightSheetContext;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, LBs1;->b(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0, p1}, LSs1;->K1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public clear()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, LSs1;->b:LBs1;

    invoke-virtual {v0}, LBs1;->a()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public n0(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;)Lio/reactivex/c;
    .locals 2

    const-string v0, "vehicleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSs1;->a:LTk3;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, LTk3;->u(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LSs1$a;

    invoke-direct {v1, p1, p2, p0}, LSs1$a;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;LSs1;)V

    new-instance p1, LRs1;

    invoke-direct {p1, v1}, LRs1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun fetchFlight\u2026htSheetDetails)\n    }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
