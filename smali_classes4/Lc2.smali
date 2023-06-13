.class public interface abstract LLc2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'J\u0018\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\nH\'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r0\u0004H\'J\u0018\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0010H\'\u00a8\u0006\u0013"
    }
    d2 = {
        "LLc2;",
        "",
        "Lco/bird/api/request/WireItemLeaseStartRequest;",
        "request",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/WireItemLeaseStartResponse;",
        "e",
        "Lco/bird/api/request/WireLeaseAssetRequest;",
        "Lco/bird/api/response/WireLeaseAssetResponse;",
        "f",
        "Lco/bird/api/request/WireLeaseReturnRequest;",
        "Lco/bird/api/response/WireLeaseReturnResponse;",
        "d",
        "Lco/bird/api/response/PagedCollection;",
        "Lco/bird/android/model/wire/WireLeaseObjectResponse;",
        "b",
        "Lco/bird/api/request/WireLeaseItemAvailabilityRequest;",
        "Lco/bird/api/response/WireLeaseItemAvailabilityResponse;",
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
.method public abstract b()Lio/reactivex/F;
    .annotation runtime LNA1;
        value = "api/v1/itemlease/active-leases"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/PagedCollection<",
            "Lco/bird/android/model/wire/WireLeaseObjectResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Lco/bird/api/request/WireLeaseItemAvailabilityRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/WireLeaseItemAvailabilityRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/v1/itemlease/item-availability"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/WireLeaseItemAvailabilityRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/WireLeaseItemAvailabilityResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Lco/bird/api/request/WireLeaseReturnRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/WireLeaseReturnRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/v1/itemlease/lease/return"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/WireLeaseReturnRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/WireLeaseReturnResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/api/request/WireItemLeaseStartRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/WireItemLeaseStartRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/v1/itemlease/lease/start"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/WireItemLeaseStartRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/WireItemLeaseStartResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(Lco/bird/api/request/WireLeaseAssetRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/WireLeaseAssetRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/v1/itemlease/lease/asset"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/WireLeaseAssetRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/WireLeaseAssetResponse;",
            ">;"
        }
    .end annotation
.end method
