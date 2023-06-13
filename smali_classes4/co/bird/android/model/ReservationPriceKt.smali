.class public final Lco/bird/android/model/ReservationPriceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "reservationPrice",
        "Lco/bird/android/model/ReservationPrice;",
        "Lco/bird/android/model/wire/configs/Config;",
        "model_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final reservationPrice(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/ReservationPrice;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/Config;->getReservationConfig()Lco/bird/android/model/wire/configs/ReservationConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ReservationConfig;->getCurrency()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/Config;->getReservationConfig()Lco/bird/android/model/wire/configs/ReservationConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ReservationConfig;->getMinutePrice()J

    move-result-wide v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/Config;->getReservationConfig()Lco/bird/android/model/wire/configs/ReservationConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ReservationConfig;->getBasePrice()J

    move-result-wide v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/RideConfig;->getAdditionalFees()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;->getApplyTax()Z

    move-result v7

    new-instance p0, Lco/bird/android/model/ReservationPrice;

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/ReservationPrice;-><init>(Ljava/lang/String;JJZ)V

    return-object p0
.end method
