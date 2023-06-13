.class public final Lie1$m$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie1$m$a;->b(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/api/request/BraintreeTokenResponse;",
        ">;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/SetupIntentStatus;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/request/BraintreeTokenResponse;",
        "brainTreeResponse",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/SetupIntentStatus;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lie1;


# direct methods
.method public constructor <init>(Lie1;)V
    .locals 0

    iput-object p1, p0, Lie1$m$a$a;->g:Lie1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)Lio/reactivex/u;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/request/BraintreeTokenResponse;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/SetupIntentStatus;",
            ">;"
        }
    .end annotation

    const-string v0, "brainTreeResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/request/BraintreeTokenResponse;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/api/request/BraintreeTokenResponse;->getToken()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lie1$m$a$a;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getUi$p(Lie1;)Lpe1;

    move-result-object v0

    invoke-interface {v0, p1}, Lpe1;->R(Ljava/lang/String;)LG10;

    move-result-object p1

    iget-object v0, p0, Lie1$m$a$a;->g:Lie1;

    new-instance v1, Lcom/braintreepayments/api/models/PayPalRequest;

    invoke-direct {v1}, Lcom/braintreepayments/api/models/PayPalRequest;-><init>()V

    if-eqz p1, :cond_1

    invoke-static {p1, v1}, LfL3;->t(LG10;Lcom/braintreepayments/api/models/PayPalRequest;)V

    invoke-static {v0}, Lie1;->access$getAnalyticsManager$p(Lie1;)LEa;

    move-result-object p1

    new-instance v6, LWP3;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LWP3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v6}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Braintree fragment found"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    :goto_1
    sget-object p1, Lco/bird/android/model/SetupIntentStatus;->UNEXPECTED:Lco/bird/android/model/SetupIntentStatus;

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lie1$m$a$a;->a(LHM4;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
