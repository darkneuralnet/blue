.class public interface abstract Lr43;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\'J\u0012\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u000bH\'J\u000e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0004H\'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u00110\u00042\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0002H\'J\u0012\u0010\u0015\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0014H\'J\u0012\u0010\u0017\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0016H\'J\u0018\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0018H\'J\u0012\u0010\u001c\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u001bH\'J\u0012\u0010\u001d\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0002H\'\u00a8\u0006\u001e"
    }
    d2 = {
        "Lr43;",
        "",
        "",
        "id",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WireNest;",
        "a",
        "Lco/bird/api/request/NestClaimRequest;",
        "body",
        "Lco/bird/android/model/wire/WireNestClaim;",
        "b",
        "Lco/bird/api/request/ReleaseNestClaimRequest;",
        "Lio/reactivex/c;",
        "h",
        "Lco/bird/api/response/ClaimedNestResponse;",
        "i",
        "nestId",
        "",
        "Lco/bird/android/model/wire/WireFlagNestReason;",
        "c",
        "Lco/bird/api/request/FlagNestRequest;",
        "e",
        "Lco/bird/api/request/UnflagNestRequest;",
        "f",
        "Lco/bird/api/request/NestSuggestionRequest;",
        "Lco/bird/api/response/NestSuggestionResponse;",
        "d",
        "Lco/bird/api/request/NestFavoriteRequest;",
        "j",
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
.method public abstract a(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "api/v1/external/nest"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireNest;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/NestClaimRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/NestClaimRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/v1/external/nest-claims/claim"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/NestClaimRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireNestClaim;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "nest_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/v1/external/nest/flag-reasons"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlagNestReason;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract d(Lco/bird/api/request/NestSuggestionRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/NestSuggestionRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/api/v1/external/nest/suggest"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/NestSuggestionRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/NestSuggestionResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/api/request/FlagNestRequest;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/FlagNestRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/api/v1/external/nest/flag-nest"
    .end annotation
.end method

.method public abstract f(Lco/bird/api/request/UnflagNestRequest;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/UnflagNestRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/api/v1/external/nest/unflag-nest"
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;)Lio/reactivex/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "nest_id"
        .end annotation
    .end param
    .annotation runtime LKF0;
        value = "/api/v1/external/nest/favorite"
    .end annotation
.end method

.method public abstract h(Lco/bird/api/request/ReleaseNestClaimRequest;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/ReleaseNestClaimRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/v1/external/nest-claims/unclaim"
    .end annotation
.end method

.method public abstract i()Lio/reactivex/F;
    .annotation runtime LNA1;
        value = "api/v1/external/nest-claims"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/ClaimedNestResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract j(Lco/bird/api/request/NestFavoriteRequest;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/NestFavoriteRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "/api/v1/external/nest/favorite"
    .end annotation
.end method
