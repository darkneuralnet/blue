.class public interface abstract LhY;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a8\u0006\u0008"
    }
    d2 = {
        "LhY;",
        "",
        "Lco/bird/api/request/BleScanReportBody;",
        "bleScanReportBody",
        "Lio/reactivex/F;",
        "LHM4;",
        "",
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
.method public abstract a(Lco/bird/api/request/BleScanReportBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BleScanReportBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/bluetooth-scan/ble"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BleScanReportBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end method