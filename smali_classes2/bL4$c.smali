.class public final LbL4$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LbL4;->h(Lco/bird/api/request/CreateReservationWithIntentBody;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/api/response/CreateReservationWithIntentResponse;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/response/CreateReservationWithIntentResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LbL4;


# direct methods
.method public constructor <init>(LbL4;)V
    .locals 0

    iput-object p1, p0, LbL4$c;->g:LbL4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)Lio/reactivex/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/CreateReservationWithIntentResponse;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Lco/bird/api/response/CreateReservationWithIntentResponse;

    invoke-virtual {v0}, Lco/bird/api/response/CreateReservationWithIntentResponse;->getPayment()Lco/bird/api/response/ReservationPaymentResponse;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LbL4$c;->g:LbL4;

    invoke-virtual {v0}, Lco/bird/api/response/ReservationPaymentResponse;->getIntentId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v1}, LbL4;->access$getManager$p(LbL4;)LpM3;

    move-result-object v0

    invoke-interface {v0}, LpM3;->s()Lio/reactivex/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v1}, LbL4;->access$getManager$p(LbL4;)LpM3;

    move-result-object v0

    new-instance v2, Lco/bird/android/model/UNEXPECTED;

    new-instance v3, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;

    invoke-static {v1}, LbL4;->access$getActivity$p(LbL4;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    sget v4, Lnl4;->payment_error_retry_description:I

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "activity.getString(L.str\u2026_error_retry_description)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v1}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lco/bird/android/model/UNEXPECTED;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v2}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "{\n              manager.\u2026.complete()\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    if-nez v0, :cond_5

    :cond_1
    iget-object v0, p0, LbL4$c;->g:LbL4;

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lco/bird/api/response/CreateReservationWithIntentResponse;

    invoke-virtual {p1}, Lco/bird/api/response/CreateReservationWithIntentResponse;->getReservation()Lco/bird/android/model/Reservation;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v0}, LbL4;->access$getManager$p(LbL4;)LpM3;

    move-result-object v1

    invoke-interface {v1, p1}, LpM3;->t(Lco/bird/android/model/Reservation;)V

    invoke-static {v0}, LbL4;->access$getManager$p(LbL4;)LpM3;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/COMPLETE;->INSTANCE:Lco/bird/android/model/COMPLETE;

    invoke-interface {p1, v1}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_3

    invoke-static {v0}, LbL4;->access$getManager$p(LbL4;)LpM3;

    move-result-object p1

    new-instance v1, Lco/bird/android/model/UNEXPECTED;

    new-instance v2, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;

    invoke-static {v0}, LbL4;->access$getActivity$p(LbL4;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    sget v3, Lnl4;->reservation_free_expired:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "activity.getString(L.str\u2026reservation_free_expired)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lco/bird/android/model/UNEXPECTED;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, v1}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    :cond_3
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v0

    const-string p1, "complete()"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, LbL4$c;->g:LbL4;

    invoke-static {v0}, LbL4;->access$getManager$p(LbL4;)LpM3;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/UNEXPECTED;

    new-instance v2, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;

    iget-object v3, p0, LbL4$c;->g:LbL4;

    invoke-static {v3}, LbL4;->access$getActivity$p(LbL4;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v3

    sget v4, Lnl4;->payment_error_generic:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "activity.getString(L.string.payment_error_generic)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lco/bird/android/model/UNEXPECTED;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    invoke-static {p1}, LNM4;->d(LHM4;)Ltg1;

    move-result-object p1

    iget-object v0, p0, LbL4$c;->g:LbL4;

    invoke-static {v0}, LbL4;->access$getMutableErrorResponse$p(LbL4;)La94;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v0

    :cond_5
    :goto_2
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LbL4$c;->a(LHM4;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
