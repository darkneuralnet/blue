.class public interface abstract LdT1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'\u00a8\u0006\t"
    }
    d2 = {
        "LdT1;",
        "",
        "Lco/bird/api/request/WireIdentificationIntentPermissionRequest;",
        "request",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/WireIdentificationIntentPermissionResponse;",
        "a",
        "Lco/bird/api/request/WireIdentificationSubmitRequest;",
        "b",
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
.method public abstract a(Lco/bird/api/request/WireIdentificationIntentPermissionRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/WireIdentificationIntentPermissionRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/identification/v1/query-intent-permission"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/WireIdentificationIntentPermissionRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/WireIdentificationIntentPermissionResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/WireIdentificationSubmitRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/WireIdentificationSubmitRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/identification/v1/submit"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/WireIdentificationSubmitRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/WireIdentificationIntentPermissionResponse;",
            ">;"
        }
    .end annotation
.end method
