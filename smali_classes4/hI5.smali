.class public interface abstract LhI5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LhI5$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\t0\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u000cH\'J0\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00042\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000f2\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\'J\u0018\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0015H\'J\u0018\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0017H\'\u00a8\u0006\u0019"
    }
    d2 = {
        "LhI5;",
        "",
        "Lco/bird/api/request/NokelockMessage;",
        "message",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/NokelockResponse;",
        "e",
        "Lco/bird/api/request/ProvisionSmartlockBody;",
        "body",
        "LHM4;",
        "Lco/bird/api/response/ProvisionSmartlockResponse;",
        "b",
        "Lco/bird/api/request/PromoteProvisionalSmartlockBody;",
        "Lco/bird/api/response/ProvisionalSmartlock;",
        "c",
        "",
        "macAddress",
        "serialNumber",
        "vendor",
        "Lco/bird/api/response/SmartlockResponse;",
        "a",
        "Lco/bird/api/request/GenerateKeyBody;",
        "d",
        "Lco/bird/api/request/PromoteKeyBody;",
        "f",
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
.method public abstract a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "mac_address"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "serial_number"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "vendor"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "smartlock/by-identifier"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/SmartlockResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/ProvisionSmartlockBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/ProvisionSmartlockBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "smartlock/nokelock/provisional"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/ProvisionSmartlockBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/ProvisionSmartlockResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Lco/bird/api/request/PromoteProvisionalSmartlockBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/PromoteProvisionalSmartlockBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/smartlock/nokelock/promote-provisional"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/PromoteProvisionalSmartlockBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/ProvisionalSmartlock;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract d(Lco/bird/api/request/GenerateKeyBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/GenerateKeyBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "smartlock/generate-key"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/GenerateKeyBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/SmartlockResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/api/request/NokelockMessage;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/NokelockMessage;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "smartlock/nokelock/handle"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/NokelockMessage;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/NokelockResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(Lco/bird/api/request/PromoteKeyBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/PromoteKeyBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "smartlock/promote-key"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/PromoteKeyBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/SmartlockResponse;",
            ">;"
        }
    .end annotation
.end method
