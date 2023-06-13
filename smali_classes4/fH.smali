.class public interface abstract LfH;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\'J\u0018\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u000bH\'J\u0018\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\'J\u0018\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u000fH\'J\u0018\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0011H\'J\u0018\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0014H\'J\u0018\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0016H\'J\u0018\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0018H\'J\u0018\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u001aH\'\u00a8\u0006\u001c"
    }
    d2 = {
        "LfH;",
        "",
        "",
        "birdId",
        "Lio/reactivex/F;",
        "LT24;",
        "b",
        "Lco/bird/api/request/PairBody;",
        "body",
        "Lco/bird/android/model/wire/WireBird;",
        "c",
        "Lco/bird/api/request/WireBirdActionPairRequest;",
        "Lco/bird/api/response/WireBirdActionPairResponse;",
        "a",
        "i",
        "Lco/bird/api/request/BirdSettingsBody;",
        "e",
        "LZG;",
        "LzT;",
        "d",
        "LaH;",
        "j",
        "LWG;",
        "h",
        "LcH;",
        "f",
        "LXG;",
        "g",
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
.method public abstract a(Lco/bird/api/request/WireBirdActionPairRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/WireBirdActionPairRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/bird/action/pair/v2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/WireBirdActionPairRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/WireBirdActionPairResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/bird/action/permissions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LT24;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Lco/bird/api/request/PairBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/PairBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/bird/action/pair"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/PairBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(LZG;)Lio/reactivex/F;
    .param p1    # LZG;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/bird/action/lights"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZG;",
            ")",
            "Lio/reactivex/F<",
            "LzT;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/api/request/BirdSettingsBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BirdSettingsBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/bird/action/settings"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BirdSettingsBody;",
            ")",
            "Lio/reactivex/F<",
            "LT24;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(LcH;)Lio/reactivex/F;
    .param p1    # LcH;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/bird/action/sleep"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LcH;",
            ")",
            "Lio/reactivex/F<",
            "LzT;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g(LXG;)Lio/reactivex/F;
    .param p1    # LXG;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/bird/action/ack_sleep"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXG;",
            ")",
            "Lio/reactivex/F<",
            "LzT;",
            ">;"
        }
    .end annotation
.end method

.method public abstract h(LWG;)Lio/reactivex/F;
    .param p1    # LWG;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/bird/action/ack_lock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWG;",
            ")",
            "Lio/reactivex/F<",
            "LzT;",
            ">;"
        }
    .end annotation
.end method

.method public abstract i(Lco/bird/api/request/PairBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/PairBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/bird/action/unpair"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/PairBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end method

.method public abstract j(LaH;)Lio/reactivex/F;
    .param p1    # LaH;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/bird/action/lock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LaH;",
            ")",
            "Lio/reactivex/F<",
            "LzT;",
            ">;"
        }
    .end annotation
.end method
