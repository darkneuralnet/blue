.class public final LVX4$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVX4;->n()Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/PaymentIntentStatus;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/wire/WireRide;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/PaymentIntentStatus;",
        "status",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/wire/WireRide;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/PaymentIntentStatus;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LVX4;


# direct methods
.method public constructor <init>(LVX4;)V
    .locals 0

    iput-object p1, p0, LVX4$d;->g:LVX4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/PaymentIntentStatus;)Lio/reactivex/u;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/PaymentIntentStatus;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/wire/WireRide;",
            ">;"
        }
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LVX4$d;->g:LVX4;

    invoke-static {v0}, LVX4;->access$getManager$p(LVX4;)LpM3;

    move-result-object v0

    invoke-interface {v0}, LpM3;->f()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireRide;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "observePaymentComplete switch map called with status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " and ride = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Lco/bird/android/model/COMPLETE;->INSTANCE:Lco/bird/android/model/COMPLETE;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    invoke-static {v0}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_1

    :cond_1
    new-instance v6, Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;

    const-string v2, "Received complete status response but no ride found"

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;-><init>(Lco/bird/android/model/PaymentIntentStatus;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_1

    :cond_2
    sget-object v0, Lco/bird/android/model/REQUIRES_AUTHENTICATION;->INSTANCE:Lco/bird/android/model/REQUIRES_AUTHENTICATION;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, LVX4$d;->g:LVX4;

    invoke-static {p1}, LVX4;->access$getManager$p(LVX4;)LpM3;

    move-result-object p1

    iget-object v0, p0, LVX4$d;->g:LVX4;

    invoke-static {v0}, LVX4;->access$getActivity$p(LVX4;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-interface {p1, v0}, LpM3;->m(Landroidx/appcompat/app/AppCompatActivity;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_1

    :cond_3
    sget-object v0, Lco/bird/android/model/REQUIRES_CONFIRMATION;->INSTANCE:Lco/bird/android/model/REQUIRES_CONFIRMATION;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p0, LVX4$d;->g:LVX4;

    invoke-static {p1}, LVX4;->access$getStartRideBody$p(LVX4;)La94;

    move-result-object v0

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/api/request/StartRideBodyWithIntent;

    invoke-static {p1, v0}, LVX4;->access$handleStartRidePaymentIntent(LVX4;Lco/bird/api/request/StartRideBodyWithIntent;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->f0()Lio/reactivex/p;

    move-result-object p1

    goto :goto_1

    :cond_4
    sget-object v0, Lco/bird/android/model/PAYMENT_METHOD_CREATED;->INSTANCE:Lco/bird/android/model/PAYMENT_METHOD_CREATED;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;

    const-string v3, "Received PAYMENT_METHOD_CREATED status response"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;-><init>(Lco/bird/android/model/PaymentIntentStatus;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_1

    :cond_5
    sget-object v0, Lco/bird/android/model/REQUIRES_PAYMENT_METHOD;->INSTANCE:Lco/bird/android/model/REQUIRES_PAYMENT_METHOD;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;

    const-string v3, "Received REQUIRES_PAYMENT_METHOD status response"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;-><init>(Lco/bird/android/model/PaymentIntentStatus;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_1

    :cond_6
    instance-of v0, p1, Lco/bird/android/model/UNEXPECTED;

    if-eqz v0, :cond_7

    new-instance v0, Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;

    move-object v1, p1

    check-cast v1, Lco/bird/android/model/UNEXPECTED;

    invoke-virtual {v1}, Lco/bird/android/model/UNEXPECTED;->getThrowable()Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "Received UNEXPECTED status response"

    invoke-direct {v0, p1, v2, v1}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;-><init>(Lco/bird/android/model/PaymentIntentStatus;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_1

    :cond_7
    instance-of v0, p1, Lco/bird/android/model/UNKNOWN;

    if-eqz v0, :cond_8

    new-instance v0, Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;

    move-object v1, p1

    check-cast v1, Lco/bird/android/model/UNKNOWN;

    invoke-virtual {v1}, Lco/bird/android/model/UNKNOWN;->getThrowable()Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "Received UNKNOWN status response"

    invoke-direct {v0, p1, v2, v1}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;-><init>(Lco/bird/android/model/PaymentIntentStatus;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/PaymentIntentStatus;

    invoke-virtual {p0, p1}, LVX4$d;->a(Lco/bird/android/model/PaymentIntentStatus;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
