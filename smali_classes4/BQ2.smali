.class public interface abstract LBQ2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J8\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u000b0\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u00082\u0008\u0008\u0001\u0010\n\u001a\u00020\u0008H\'J\u0018\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00042\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000fH\'\u00a8\u0006\u0013"
    }
    d2 = {
        "LBQ2;",
        "",
        "",
        "id",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WireMerchantDescription;",
        "b",
        "merchantId",
        "",
        "offset",
        "limit",
        "LHM4;",
        "Lco/bird/api/response/CollectionResponse;",
        "Lco/bird/android/model/wire/WireMerchantTransaction;",
        "a",
        "LLD0;",
        "body",
        "LMD0;",
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
.method public abstract a(Ljava/lang/String;II)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "merchant_id"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime LXc4;
            value = "offset"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LXc4;
            value = "limit"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/v1/merchant/merchant-transaction/history"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/CollectionResponse<",
            "Lco/bird/android/model/wire/WireMerchantTransaction;",
            ">;>;>;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/v1/merchant/byUserId"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireMerchantDescription;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(LLD0;)Lio/reactivex/F;
    .param p1    # LLD0;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/v1/merchant/coupon-extension/by-coupon-ids"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLD0;",
            ")",
            "Lio/reactivex/F<",
            "LMD0;",
            ">;"
        }
    .end annotation
.end method
