.class public interface abstract LxK4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00050\u00042\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\'J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u00050\u00042\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000fH\'\u00a8\u0006\u0012"
    }
    d2 = {
        "LxK4;",
        "",
        "Lco/bird/api/request/CreateReservationWithIntentBody;",
        "createReservationWithIntentBody",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/api/response/CreateReservationWithIntentResponse;",
        "g",
        "Lco/bird/api/request/CancelReservationBody;",
        "cancelReservationBody",
        "Lco/bird/api/response/ReservationCancelResponse;",
        "e",
        "Lio/reactivex/p;",
        "Lco/bird/android/model/Reservation;",
        "d",
        "Lco/bird/api/request/ReservationFeedbackBody;",
        "reservationFeedbackBody",
        "f",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract d()Lio/reactivex/p;
    .annotation runtime LNA1;
        value = "reservation/active"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/Reservation;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/api/request/CancelReservationBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/CancelReservationBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "reservation/cancel"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/CancelReservationBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/ReservationCancelResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract f(Lco/bird/api/request/ReservationFeedbackBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/ReservationFeedbackBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "reservation/feedback"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/ReservationFeedbackBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/Reservation;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract g(Lco/bird/api/request/CreateReservationWithIntentBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/CreateReservationWithIntentBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "reservation/create/v2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/CreateReservationWithIntentBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/CreateReservationWithIntentResponse;",
            ">;>;"
        }
    .end annotation
.end method
