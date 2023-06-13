.class public interface abstract Ly00;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0012\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0012\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'\u00a8\u0006\t"
    }
    d2 = {
        "Ly00;",
        "",
        "Lco/bird/api/request/IdsRequest;",
        "body",
        "Lio/reactivex/c;",
        "c",
        "a",
        "Lco/bird/api/request/DesignatedBountyRequest;",
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
.method public abstract a(Lco/bird/api/request/IdsRequest;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/IdsRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "bounties/v2/external/cancel-designated-bounties"
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/DesignatedBountyRequest;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/DesignatedBountyRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "bounties/v2/external/re-accept-designated-bounty"
    .end annotation
.end method

.method public abstract c(Lco/bird/api/request/IdsRequest;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/IdsRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "bounties/v2/external/accept-designated-bounties"
    .end annotation
.end method
