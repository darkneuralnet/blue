.class public final Lco/bird/android/model/PhotoReviewStatusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toPhotoReviewStatus",
        "",
        "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;",
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
.method public static final toPhotoReviewStatus(Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;->getProperParking()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lco/bird/android/model/PhotoReviewStatus;->GOOD:Lco/bird/android/model/PhotoReviewStatus;

    goto :goto_0

    :cond_0
    sget-object p0, Lco/bird/android/model/PhotoReviewStatus;->BAD:Lco/bird/android/model/PhotoReviewStatus;

    :goto_0
    if-nez p0, :cond_2

    :cond_1
    sget-object p0, Lco/bird/android/model/PhotoReviewStatus;->IN_REVIEW:Lco/bird/android/model/PhotoReviewStatus;

    :cond_2
    invoke-virtual {p0}, Lco/bird/android/model/PhotoReviewStatus;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
