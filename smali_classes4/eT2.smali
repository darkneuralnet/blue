.class public interface abstract LeT2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J2\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u000b0\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u0007H\'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u000b0\u00042\u0008\u0008\u0001\u0010\r\u001a\u00020\u0002H\'J\u0018\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00042\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0002H\'J\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u000b0\u00042\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0012H\'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u000b0\u00042\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0016H\'J\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u000b0\u00042\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0018H\'J\u001e\u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u000b0\u00042\u0008\u0008\u0001\u0010\u001d\u001a\u00020\u001cH\'J\u0012\u0010\"\u001a\u00020!2\u0008\u0008\u0001\u0010 \u001a\u00020\u001fH\'J\u001e\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u000b0\u00042\u0008\u0008\u0001\u0010\u001d\u001a\u00020#H\'\u00a8\u0006%"
    }
    d2 = {
        "LeT2;",
        "",
        "",
        "merchantId",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/MerchantSiteResponse;",
        "e",
        "",
        "latitude",
        "longitude",
        "radius",
        "LHM4;",
        "j",
        "merchantSiteId",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "d",
        "id",
        "i",
        "LdL3;",
        "payMerchantBody",
        "LuL3;",
        "g",
        "LeL3;",
        "h",
        "LaT2;",
        "merchantScanBody",
        "LbT2;",
        "b",
        "LJe6;",
        "updateMerchantSiteBody",
        "c",
        "LHe6;",
        "body",
        "Lio/reactivex/c;",
        "a",
        "LIe6;",
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
.method public abstract a(LHe6;)Lio/reactivex/c;
    .param p1    # LHe6;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "v1/merchant/site/update/auto-location"
    .end annotation
.end method

.method public abstract b(LaT2;)Lio/reactivex/F;
    .param p1    # LaT2;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "v1/merchant/site/scan"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LaT2;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "LbT2;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(LJe6;)Lio/reactivex/F;
    .param p1    # LJe6;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "v1/merchant/site"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJe6;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/v1/merchant/site"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/v1/merchant/site/byMerchantId"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/MerchantSiteResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(LIe6;)Lio/reactivex/F;
    .param p1    # LIe6;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "v1/merchant/site"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LIe6;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract g(LdL3;)Lio/reactivex/F;
    .param p1    # LdL3;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "v1/merchant/site/pay"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LdL3;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "LuL3;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract h(LeL3;)Lio/reactivex/F;
    .param p1    # LeL3;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "v1/merchant/site/pay"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LeL3;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "LuL3;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract i(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/v1/merchant/site"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;"
        }
    .end annotation
.end method

.method public abstract j(DDD)Lio/reactivex/F;
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
    .param p5    # D
        .annotation runtime LXc4;
            value = "radius"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "v1/merchant/site/nearby"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDD)",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/MerchantSiteResponse;",
            ">;>;"
        }
    .end annotation
.end method
