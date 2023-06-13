.class public interface abstract LXW2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00082\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\u000c"
    }
    d2 = {
        "LXW2;",
        "",
        "Lio/reactivex/p;",
        "",
        "Lco/bird/android/model/wire/WireRide;",
        "i",
        "Lco/bird/api/request/StartRideBodyWithIntent;",
        "body",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/api/response/StartRideWithIntentResponse;",
        "j",
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
.method public abstract i()Lio/reactivex/p;
    .annotation runtime LNA1;
        value = "multi-ride/active"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireRide;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract j(Lco/bird/api/request/StartRideBodyWithIntent;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/StartRideBodyWithIntent;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "multi-ride/start"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/StartRideBodyWithIntent;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/StartRideWithIntentResponse;",
            ">;>;"
        }
    .end annotation
.end method
