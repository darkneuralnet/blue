.class public interface abstract LsZ5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0012\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a8\u0006\u0007"
    }
    d2 = {
        "LsZ5;",
        "",
        "Lco/bird/api/request/TaskOrderRequest;",
        "body",
        "Lio/reactivex/c;",
        "b",
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
.method public abstract a(Lco/bird/api/request/TaskOrderRequest;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/TaskOrderRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/task-order/decline"
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/TaskOrderRequest;)Lio/reactivex/c;
    .param p1    # Lco/bird/api/request/TaskOrderRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/task-order/accept"
    .end annotation
.end method
