.class public interface abstract LML3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LML3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\'J\"\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u0007H\'J\"\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u0007H\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\rH\'J\u0012\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0011H\'J\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00042\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\'J\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00042\n\u0008\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\'J\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00042\n\u0008\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\'\u00a8\u0006\u001c"
    }
    d2 = {
        "LML3;",
        "",
        "Lco/bird/api/request/AddPaymentRequest;",
        "body",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/SavedPaymentMethodResponse;",
        "g",
        "",
        "userId",
        "h",
        "paymentMethodId",
        "d",
        "f",
        "Lco/bird/api/request/PreloadAndMaybeConfigureAutoReloadRequest;",
        "LHM4;",
        "Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;",
        "i",
        "Lco/bird/api/request/ConfigureAutoReloadRequest;",
        "Lio/reactivex/c;",
        "b",
        "currency",
        "Lco/bird/api/response/ReloadConfigResponse;",
        "e",
        "receiptId",
        "Lco/bird/api/response/ReceiptDetailResponse;",
        "c",
        "Lco/bird/api/response/DownloadRideReceiptResponse;",
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
.method public abstract a(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "receipt_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "v1/payment/receipt/invoice-by-receipt-id"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/DownloadRideReceiptResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/ConfigureAutoReloadRequest;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/ConfigureAutoReloadRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "v1/payment/charge/configure-auto-reload"
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "receipt_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "v1/payment/receipt/detail"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/ReceiptDetailResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "user_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "payment_method_id"
        .end annotation
    .end param
    .annotation runtime LKF0;
        value = "v3/payment-method/remove"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/SavedPaymentMethodResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "currency"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "v1/payment/charge/reload-config"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/ReloadConfigResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "user_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "payment_method_id"
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "v3/payment-method/set-default"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/SavedPaymentMethodResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g(Lco/bird/api/request/AddPaymentRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/AddPaymentRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "v3/payment-method/add"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/AddPaymentRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/SavedPaymentMethodResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "user_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "v3/payment-method/list"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/SavedPaymentMethodResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract i(Lco/bird/api/request/PreloadAndMaybeConfigureAutoReloadRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/PreloadAndMaybeConfigureAutoReloadRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "v1/payment/charge/preload-and-maybe-configure-auto-reload"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/PreloadAndMaybeConfigureAutoReloadRequest;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;",
            ">;>;"
        }
    .end annotation
.end method
