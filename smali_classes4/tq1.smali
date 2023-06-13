.class public interface abstract Ltq1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\'J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\'J\u0018\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\'J\"\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0005H\'J\u0018\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00022\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000eH\'\u00a8\u0006\u0011"
    }
    d2 = {
        "Ltq1;",
        "",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/FleetStatusListResponse;",
        "c",
        "",
        "fleetId",
        "Lco/bird/api/response/FleetStatusResponse;",
        "a",
        "Lco/bird/api/response/FleetStatusPredictionResponse;",
        "d",
        "substate",
        "Lco/bird/android/model/wire/WireFleetList;",
        "b",
        "Lco/bird/api/request/BirdsByRatingBody;",
        "body",
        "e",
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
            value = "fleet_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "fleet-status/current"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/FleetStatusResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "fleet_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "substate"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "fleet-status/v2/birds/by-substate"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireFleetList;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()Lio/reactivex/F;
    .annotation runtime LNA1;
        value = "fleet-status"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/FleetStatusListResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "fleet_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "fleet-status/predictions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/FleetStatusPredictionResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/api/request/BirdsByRatingBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BirdsByRatingBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "fleet-status/birds/by-rating"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BirdsByRatingBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireFleetList;",
            ">;"
        }
    .end annotation
.end method
