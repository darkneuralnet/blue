.class public interface abstract Lkg6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J*\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\'J\u001e\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\'J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0005H\'\u00a8\u0006\u000e"
    }
    d2 = {
        "Lkg6;",
        "",
        "",
        "id",
        "partnerId",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/api/response/AgreementResponse;",
        "a",
        "Lco/bird/api/request/AgreementAgreeBody;",
        "body",
        "Lco/bird/api/response/AgreementAcceptResponse;",
        "c",
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
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "role"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "partner_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "user-agreement"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/AgreementResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b()Lio/reactivex/F;
    .annotation runtime LNA1;
        value = "user-agreement/signed"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/AgreementResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Lco/bird/api/request/AgreementAgreeBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/AgreementAgreeBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "user-agreement/accept"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/AgreementAgreeBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/AgreementAcceptResponse;",
            ">;>;"
        }
    .end annotation
.end method
