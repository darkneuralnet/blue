.class public final LZx4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "Lco/bird/android/model/DeliveryWindow;",
        "window",
        "LBx4;",
        "a",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/DeliveryWindow;)LBx4;
    .locals 4

    const-string v0, "window"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LBx4;

    invoke-virtual {p0}, Lco/bird/android/model/DeliveryWindow;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/DeliveryWindow;->getStart()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/DeliveryWindow;->getEnd()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/DeliveryWindow;->getAddress()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, LBx4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V

    return-object v0
.end method
