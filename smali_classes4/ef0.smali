.class public interface abstract Lef0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'J\u0018\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\nH\'J\u0018\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\nH\'J\u0018\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00042\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000fH\'\u00a8\u0006\u0013"
    }
    d2 = {
        "Lef0;",
        "",
        "Lco/bird/api/request/CaptureValidationRequest;",
        "body",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WireCaptureValidation;",
        "i",
        "Lco/bird/api/request/BulkCaptureRequest;",
        "Lco/bird/api/response/BulkCaptureResponse;",
        "k",
        "Lco/bird/api/request/BirdIdBody;",
        "Lco/bird/api/response/QuickCaptureResponse;",
        "j",
        "Lco/bird/api/response/QuickCaptureCancelResponse;",
        "l",
        "",
        "birdId",
        "Lco/bird/api/response/QuickCaptureStateResponse;",
        "h",
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
.method public abstract h(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "capture/quick-capture-state"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/QuickCaptureStateResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract i(Lco/bird/api/request/CaptureValidationRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/CaptureValidationRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "capture/validate"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/CaptureValidationRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireCaptureValidation;",
            ">;"
        }
    .end annotation
.end method

.method public abstract j(Lco/bird/api/request/BirdIdBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BirdIdBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "capture/quick-capture"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BirdIdBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/QuickCaptureResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract k(Lco/bird/api/request/BulkCaptureRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BulkCaptureRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "capture/capture"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BulkCaptureRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/BulkCaptureResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract l(Lco/bird/api/request/BirdIdBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BirdIdBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "capture/cancel-quick-capture"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BirdIdBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/QuickCaptureCancelResponse;",
            ">;"
        }
    .end annotation
.end method
