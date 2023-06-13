.class public interface abstract LIT0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0008H\'\u00a8\u0006\n"
    }
    d2 = {
        "LIT0;",
        "",
        "Lco/bird/api/request/DealStateUpdateRequest;",
        "body",
        "Lio/reactivex/F;",
        "LHM4;",
        "",
        "a",
        "Lco/bird/api/request/DealAcceptRequest;",
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
.method public abstract a(Lco/bird/api/request/DealStateUpdateRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/DealStateUpdateRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "deal/update-acknowledgment-state"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/DealStateUpdateRequest;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/DealAcceptRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/DealAcceptRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "deal/accept"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/DealAcceptRequest;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end method
