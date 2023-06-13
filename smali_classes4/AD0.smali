.class public interface abstract LAD0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAD0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\'J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\'J\u0018\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00042\u0008\u0008\u0001\u0010\u000e\u001a\u00020\rH\'\u00a8\u0006\u0010"
    }
    d2 = {
        "LAD0;",
        "",
        "",
        "redeemed",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/CollectionResponse;",
        "Lco/bird/android/model/wire/WireCoupon;",
        "e",
        "Lco/bird/api/request/CreateCouponBody;",
        "body",
        "f",
        "Lco/bird/api/response/PromotionsResponse;",
        "d",
        "",
        "id",
        "c",
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
.method public abstract c(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "coupon_id"
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "coupon/activate"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Lio/reactivex/F;
    .annotation runtime LNA1;
        value = "coupon/promotions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/PromotionsResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Z)Lio/reactivex/F;
    .param p1    # Z
        .annotation runtime LXc4;
            value = "redeemed"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "coupon"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/CollectionResponse<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract f(Lco/bird/api/request/CreateCouponBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/CreateCouponBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "coupon"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/CreateCouponBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation
.end method
