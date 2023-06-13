.class public final Lte3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lco/bird/android/model/offer/WireCouponOffer;",
        "Lne3;",
        "b",
        "(Lco/bird/android/model/offer/WireCouponOffer;)Lne3;",
        "asOffer",
        "Lco/bird/android/model/offer/WireCouponDeal;",
        "a",
        "(Lco/bird/android/model/offer/WireCouponDeal;)Lne3;",
        "bird-pay_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/offer/WireCouponDeal;)Lne3;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lne3;

    invoke-virtual {p0}, Lco/bird/android/model/offer/WireCouponDeal;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/offer/WireCouponDeal;->getUi()Lco/bird/android/model/offer/WireCouponDeal$Ui;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/offer/WireCouponDeal$Ui;->getBannerTitle()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/offer/WireCouponDeal;->getUi()Lco/bird/android/model/offer/WireCouponDeal$Ui;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/offer/WireCouponDeal$Ui;->getBannerBody()Ljava/lang/String;

    move-result-object p0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p0, v3}, Lne3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/offer/WireCouponOffer;)Lne3;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lne3;

    invoke-virtual {p0}, Lco/bird/android/model/offer/WireCouponOffer;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/offer/WireCouponOffer;->getUi()Lco/bird/android/model/offer/WireCouponOffer$Ui;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/offer/WireCouponOffer$Ui;->getBannerTitle()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/offer/WireCouponOffer;->getUi()Lco/bird/android/model/offer/WireCouponOffer$Ui;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/offer/WireCouponOffer$Ui;->getBannerBody()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/offer/WireCouponOffer;->getExplicitAccept()Z

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Lne3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method
