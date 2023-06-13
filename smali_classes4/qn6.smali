.class public interface abstract Lqn6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\'J\u0018\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00042\u0008\u0008\u0001\u0010\n\u001a\u00020\u000eH\'J\u0012\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0001\u0010\n\u001a\u00020\u0010H\'\u00a8\u0006\u0013"
    }
    d2 = {
        "Lqn6;",
        "",
        "",
        "vehicleId",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/RepairFlowStatus;",
        "a",
        "Lco/bird/android/model/InspectionFlow;",
        "c",
        "Lco/bird/api/request/InspectionUpdateRequestBody;",
        "body",
        "f",
        "Lco/bird/android/model/RepairFlow;",
        "b",
        "Lco/bird/api/request/RepairUpdateRequestBody;",
        "e",
        "Lco/bird/api/request/VehicleIdRequestBody;",
        "Lio/reactivex/c;",
        "d",
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
            value = "vehicle_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "repair-flow/status"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/RepairFlowStatus;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "vehicle_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "repair-flow/by-vehicle-id"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/RepairFlow;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "vehicle_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "inspection-flow/by-vehicle-id"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/InspectionFlow;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Lco/bird/api/request/VehicleIdRequestBody;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/VehicleIdRequestBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "repair-flow/finish"
    .end annotation
.end method

.method public abstract e(Lco/bird/api/request/RepairUpdateRequestBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/RepairUpdateRequestBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "repair-flow/update"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/RepairUpdateRequestBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/RepairFlow;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(Lco/bird/api/request/InspectionUpdateRequestBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/InspectionUpdateRequestBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "inspection-flow/update"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/InspectionUpdateRequestBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/InspectionFlow;",
            ">;"
        }
    .end annotation
.end method
