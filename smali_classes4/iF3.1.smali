.class public interface abstract LiF3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001JO\u0010\u000c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\t0\u00082\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\'\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "LiF3;",
        "",
        "",
        "radius",
        "",
        "birdId",
        "latitude",
        "longitude",
        "Lio/reactivex/F;",
        "LHM4;",
        "",
        "Lco/bird/android/model/ParkingNest;",
        "a",
        "(DLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lio/reactivex/F;",
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
.method public abstract a(DLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lio/reactivex/F;
    .param p1    # D
        .annotation runtime LXc4;
            value = "radius"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Double;
        .annotation runtime LXc4;
            value = "latitude"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Double;
        .annotation runtime LXc4;
            value = "longitude"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "nest/nearby-parking-nests"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/ParkingNest;",
            ">;>;>;"
        }
    .end annotation
.end method
