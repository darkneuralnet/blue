.class public interface abstract LiB0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00082\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'\u00a8\u0006\u000c"
    }
    d2 = {
        "LiB0;",
        "",
        "Lco/bird/api/request/ContractorReportFraudBody;",
        "body",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/BirdFraudReport;",
        "b",
        "Lco/bird/api/request/ContractorReportFraudBatchBody;",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/android/model/BatchBirdFraudReport;",
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
.method public abstract a(Lco/bird/api/request/ContractorReportFraudBatchBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/ContractorReportFraudBatchBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "contractor/report-fraud-batch"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/ContractorReportFraudBatchBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/BatchBirdFraudReport;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/ContractorReportFraudBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/ContractorReportFraudBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "contractor/report-fraud"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/ContractorReportFraudBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdFraudReport;",
            ">;"
        }
    .end annotation
.end method
