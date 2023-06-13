.class public interface abstract LVg6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVg6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u0002H\'JG\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r0\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00072\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0001\u0010\n\u001a\u00020\u00072\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\'\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\r0\u00042\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011H\'\u00a8\u0006\u0015"
    }
    d2 = {
        "LVg6;",
        "",
        "Lco/bird/api/request/UserGuestRequest;",
        "request",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/UserGuestResponse;",
        "c",
        "",
        "id",
        "partnerId",
        "userGuestId",
        "",
        "noAgreementContentRequested",
        "LHM4;",
        "Lco/bird/api/response/AgreementResponse;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/F;",
        "Lco/bird/api/request/AgreementAgreeBody;",
        "body",
        "Lco/bird/api/response/AgreementAcceptResponse;",
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
.method public abstract a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/F;
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
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "user_guest_id"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime LXc4;
            value = "no_agreement_content"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "user-guest/agreement"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/AgreementResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/AgreementAgreeBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/AgreementAgreeBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "user-guest/agreement/accept"
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

.method public abstract c(Lco/bird/api/request/UserGuestRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/UserGuestRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "user-guest"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/UserGuestRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/UserGuestResponse;",
            ">;"
        }
    .end annotation
.end method
