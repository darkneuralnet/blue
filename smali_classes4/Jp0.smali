.class public interface abstract LJp0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\'J1\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\u00052\u001b\u0008\u0001\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0018\u00010\u0001\u00a2\u0006\u0002\u0008\t0\u0008H\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\u00052\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000eH\'J(\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u000b0\u00052\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0011H\'J.\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00190\u000b0\u00052\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0017H\'\u00a8\u0006\u001c"
    }
    d2 = {
        "LJp0;",
        "",
        "",
        "type",
        "birdId",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/ComplaintSchemaResponse;",
        "e",
        "",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "fields",
        "LHM4;",
        "Lco/bird/api/response/Complaint;",
        "b",
        "Lco/bird/api/request/UpdateComplaintPhotosBody;",
        "body",
        "c",
        "",
        "latitude",
        "longitude",
        "Lco/bird/api/response/RidesNearbyResponse;",
        "d",
        "rideId",
        "",
        "time",
        "",
        "Lco/bird/android/model/RideTrack;",
        "a",
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
.method public abstract a(Ljava/lang/String;J)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "rideId"
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime LXc4;
            value = "time"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "complaint/rides-nearby/{rideId}"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Lio/reactivex/F<",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/RideTrack;",
            ">;>;>;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/util/Map;)Lio/reactivex/F;
    .param p1    # Ljava/util/Map;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "complaint/submit"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/Complaint;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Lco/bird/api/request/UpdateComplaintPhotosBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/UpdateComplaintPhotosBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "complaint/update-photos"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/UpdateComplaintPhotosBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/Complaint;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract d(DD)Lio/reactivex/F;
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
    .annotation runtime LNA1;
        value = "complaint/rides-nearby"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD)",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/RidesNearbyResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "complaint/schema"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/ComplaintSchemaResponse;",
            ">;"
        }
    .end annotation
.end method
