.class public final LIT4$Q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->V3(Lco/bird/android/model/wire/WireRide;LbF0;LvT3;Z)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/CompleteRideResponse;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/CompleteRideResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/CompleteRideResponse;",
        "response",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lco/bird/android/model/CompleteRideResponse;)Lio/reactivex/K;"
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

.field public final synthetic i:LvT3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvT3<",
            "Lco/bird/android/model/CompleteRideResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LIT4;Lco/bird/android/model/wire/WireRide;LvT3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LIT4;",
            "Lco/bird/android/model/wire/WireRide;",
            "LvT3<",
            "Lco/bird/android/model/CompleteRideResponse;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LIT4$Q;->g:LIT4;

    iput-object p2, p0, LIT4$Q;->h:Lco/bird/android/model/wire/WireRide;

    iput-object p3, p0, LIT4$Q;->i:LvT3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/model/CompleteRideResponse;Ljava/lang/Throwable;)Lco/bird/android/model/CompleteRideResponse;
    .locals 0

    invoke-static {p0, p1}, LIT4$Q;->g(Lco/bird/android/model/CompleteRideResponse;Ljava/lang/Throwable;)Lco/bird/android/model/CompleteRideResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LIT4$Q;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/CompleteRideResponse;
    .locals 0

    invoke-static {p0, p1}, LIT4$Q;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/CompleteRideResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/CompleteRideResponse;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/CompleteRideResponse;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lco/bird/android/model/CompleteRideResponse;Ljava/lang/Throwable;)Lco/bird/android/model/CompleteRideResponse;
    .locals 1

    const-string v0, "$response"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final d(Lco/bird/android/model/CompleteRideResponse;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/CompleteRideResponse;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/CompleteRideResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIT4$Q;->g:LIT4;

    iget-object v1, p0, LIT4$Q;->h:Lco/bird/android/model/wire/WireRide;

    invoke-static {v0, v1}, LIT4;->access$endBluetoothRide(LIT4;Lco/bird/android/model/wire/WireRide;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LIT4$Q$a;

    invoke-direct {v1, p1}, LIT4$Q$a;-><init>(Lco/bird/android/model/CompleteRideResponse;)V

    new-instance v2, LUT4;

    invoke-direct {v2, v1}, LUT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, LIT4$Q$b;->g:LIT4$Q$b;

    new-instance v2, LVT4;

    invoke-direct {v2, v1}, LVT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LWT4;

    invoke-direct {v1, p1}, LWT4;-><init>(Lco/bird/android/model/CompleteRideResponse;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->Q(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "response ->\n          en\u2026nErrorReturn { response }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIT4$Q;->i:LvT3;

    invoke-static {p1, v0}, LMm4;->n(Lio/reactivex/F;LvT3;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/CompleteRideResponse;

    invoke-virtual {p0, p1}, LIT4$Q;->d(Lco/bird/android/model/CompleteRideResponse;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
