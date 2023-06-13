.class public final LVX4$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVX4;->j(Lco/bird/api/request/StartRideBodyWithIntent;)Lio/reactivex/F;
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
        "Lco/bird/api/response/StartRideWithIntentResponse;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "LHM4<",
        "Lco/bird/api/response/StartRideWithIntentResponse;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/response/StartRideWithIntentResponse;",
        "response",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(LHM4;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePaymentIntentDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePaymentIntentDelegateImpl.kt\nco/bird/android/app/feature/ride/presenter/RidePaymentIntentDelegateImpl$handleStartRidePaymentIntent$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LVX4;


# direct methods
.method public constructor <init>(LVX4;)V
    .locals 0

    iput-object p1, p0, LVX4$b;->g:LVX4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LVX4$b;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(LHM4;)Lio/reactivex/K;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/StartRideWithIntentResponse;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "LHM4<",
            "Lco/bird/api/response/StartRideWithIntentResponse;",
            ">;>;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/api/response/StartRideWithIntentResponse;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/api/response/StartRideWithIntentResponse;->getPayment()Lco/bird/api/response/StartRidePaymentResponse;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/api/response/StartRideWithIntentResponse;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    :cond_2
    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v3

    const-string v4, "just(response)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "activity.getString(R.string.payment_error_generic)"

    const/4 v5, 0x0

    if-nez v0, :cond_5

    invoke-virtual {p1}, LHM4;->b()I

    move-result v0

    const/16 v1, 0x190

    if-gt v1, v0, :cond_3

    const/16 v1, 0x258

    if-ge v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    move v0, v5

    :goto_2
    if-eqz v0, :cond_4

    const-string v0, "http 4xx or 5xx error encountered, will let ride error handler handle"

    new-array v1, v5, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LVX4$b;->g:LVX4;

    invoke-static {v0}, LVX4;->access$getManager$p(LVX4;)LpM3;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/UNKNOWN;

    iget-object v2, p0, LVX4$b;->g:LVX4;

    invoke-static {v2}, LVX4;->access$getJsonDeserializer$p(LVX4;)Lwi2;

    move-result-object v2

    invoke-static {p1, v2}, Lco/bird/api/error/RetrofitException;->d(LHM4;Lwi2;)Lco/bird/api/error/RetrofitException;

    move-result-object p1

    invoke-direct {v1, p1}, Lco/bird/android/model/UNKNOWN;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    goto/16 :goto_4

    :cond_4
    const-string p1, "empty response body in handleStartRidePaymentIntent, return unexpected"

    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LVX4$b;->g:LVX4;

    invoke-static {p1}, LVX4;->access$getManager$p(LVX4;)LpM3;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/UNEXPECTED;

    new-instance v1, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;

    iget-object v2, p0, LVX4$b;->g:LVX4;

    invoke-static {v2}, LVX4;->access$getActivity$p(LVX4;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    sget v5, Lnl4;->payment_error_generic:I

    invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lco/bird/android/model/UNEXPECTED;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    goto/16 :goto_4

    :cond_5
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lco/bird/api/response/StartRidePaymentResponse;->getIntentId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    const-string p1, "non-empty response payment body in handleStartRidePaymentIntent with valid intent id, processing payment..."

    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LVX4$b;->g:LVX4;

    invoke-static {p1}, LVX4;->access$getManager$p(LVX4;)LpM3;

    move-result-object p1

    invoke-interface {p1}, LpM3;->s()Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1, v3}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LVX4$b$a;->g:LVX4$b$a;

    new-instance v1, LWX4;

    invoke-direct {v1, v0}, LWX4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v3

    goto :goto_3

    :cond_6
    const-string p1, "non-empty response payment body in handleStartRidePaymentIntent with invalid intent id, return unexpected"

    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LVX4$b;->g:LVX4;

    invoke-static {p1}, LVX4;->access$getManager$p(LVX4;)LpM3;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/UNEXPECTED;

    new-instance v1, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;

    iget-object v2, p0, LVX4$b;->g:LVX4;

    invoke-static {v2}, LVX4;->access$getActivity$p(LVX4;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    sget v5, Lnl4;->payment_error_generic:I

    invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lco/bird/android/model/UNEXPECTED;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    :goto_3
    const-string p1, "{\n            if (respon\u2026            }\n          }"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    if-eqz v1, :cond_8

    const-string p1, "non-empty response payment body in handleStartRidePaymentIntent with valid ride, we\'re done."

    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LVX4$b;->g:LVX4;

    invoke-static {p1}, LVX4;->access$getManager$p(LVX4;)LpM3;

    move-result-object p1

    invoke-interface {p1, v1}, LpM3;->p(Lco/bird/android/model/wire/WireRide;)V

    iget-object p1, p0, LVX4$b;->g:LVX4;

    invoke-static {p1}, LVX4;->access$getManager$p(LVX4;)LpM3;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/COMPLETE;->INSTANCE:Lco/bird/android/model/COMPLETE;

    invoke-interface {p1, v0}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    goto :goto_4

    :cond_8
    const-string p1, "unknown state in handleStartRidePaymentIntent, return unexpected."

    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LVX4$b;->g:LVX4;

    invoke-static {p1}, LVX4;->access$getManager$p(LVX4;)LpM3;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/UNEXPECTED;

    new-instance v1, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;

    iget-object v2, p0, LVX4$b;->g:LVX4;

    invoke-static {v2}, LVX4;->access$getActivity$p(LVX4;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    sget v5, Lnl4;->payment_error_generic:I

    invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lco/bird/android/model/UNEXPECTED;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    :goto_4
    return-object v3
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LVX4$b;->b(LHM4;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
