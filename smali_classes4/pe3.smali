.class public interface abstract Lpe3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00072\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\'J\u0018\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\'\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpe3;",
        "",
        "",
        "latitude",
        "longitude",
        "",
        "radius",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/CollectionResponse;",
        "Lco/bird/android/model/offer/WireCouponOffer;",
        "a",
        "LD1;",
        "body",
        "Lco/bird/android/model/offer/WireCouponDeal;",
        "b",
        "co.bird.android.manager.offer"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(DDI)Lio/reactivex/F;
    .param p1    # D
        .annotation runtime LXc4;
            value = "latitude"
        .end annotation
    .end param
    .param p3    # D
        .annotation runtime LXc4;
            value = "longitude"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime LXc4;
            value = "radius"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/v1/offer/nearby"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDI)",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/CollectionResponse<",
            "Lco/bird/android/model/offer/WireCouponOffer;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(LD1;)Lio/reactivex/F;
    .param p1    # LD1;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/v1/offer/accept"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LD1;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/offer/WireCouponDeal;",
            ">;"
        }
    .end annotation
.end method
