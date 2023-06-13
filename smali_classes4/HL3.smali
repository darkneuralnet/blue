.class public final LHL3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDL3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHL3$a;,
        LHL3$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0008B!\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J2\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00050\u0007\"\u0008\u0008\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00050\u0004H\u0016J!\u0010\u000b\u001a\u00020\n\"\u0008\u0008\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001b"
    }
    d2 = {
        "LHL3;",
        "LDL3;",
        "Lco/bird/api/response/WirePaymentActionRequiredResponse;",
        "T",
        "Lio/reactivex/F;",
        "LHM4;",
        "baseRequest",
        "Lio/reactivex/p;",
        "a",
        "response",
        "Lio/reactivex/c;",
        "e",
        "(Lco/bird/api/response/WirePaymentActionRequiredResponse;)Lio/reactivex/c;",
        "Lco/bird/android/manager/payment/StripeResolverManagerImpl;",
        "Lco/bird/android/manager/payment/StripeResolverManagerImpl;",
        "stripeResolverManagerImpl",
        "LpM3;",
        "b",
        "LpM3;",
        "paymentIntentManager",
        "Lwi2;",
        "c",
        "Lwi2;",
        "deserializer",
        "<init>",
        "(Lco/bird/android/manager/payment/StripeResolverManagerImpl;LpM3;Lwi2;)V",
        "d",
        "payment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final d:LHL3$a;


# instance fields
.field public final a:Lco/bird/android/manager/payment/StripeResolverManagerImpl;

.field public final b:LpM3;

.field public final c:Lwi2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHL3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LHL3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LHL3;->d:LHL3$a;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/manager/payment/StripeResolverManagerImpl;LpM3;Lwi2;)V
    .locals 1

    const-string v0, "stripeResolverManagerImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentIntentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHL3;->a:Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    iput-object p2, p0, LHL3;->b:LpM3;

    iput-object p3, p0, LHL3;->c:Lwi2;

    return-void
.end method

.method public static final synthetic access$getDeserializer$p(LHL3;)Lwi2;
    .locals 0

    iget-object p0, p0, LHL3;->c:Lwi2;

    return-object p0
.end method

.method public static final synthetic access$getPaymentIntentManager$p(LHL3;)LpM3;
    .locals 0

    iget-object p0, p0, LHL3;->b:LpM3;

    return-object p0
.end method

.method public static final synthetic access$handlePaymentResponse(LHL3;Lco/bird/api/response/WirePaymentActionRequiredResponse;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0, p1}, LHL3;->e(Lco/bird/api/response/WirePaymentActionRequiredResponse;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, LHL3;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LHL3;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LHL3;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method


# virtual methods
.method public a(Lio/reactivex/F;)Lio/reactivex/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lco/bird/api/response/WirePaymentActionRequiredResponse;",
            ">(",
            "Lio/reactivex/F<",
            "LHM4<",
            "TT;>;>;)",
            "Lio/reactivex/p<",
            "LHM4<",
            "TT;>;>;"
        }
    .end annotation

    const-string v0, "baseRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LHL3$c;

    invoke-direct {v0, p0}, LHL3$c;-><init>(LHL3;)V

    new-instance v1, LEL3;

    invoke-direct {v1, v0}, LEL3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LHL3$d;->g:LHL3$d;

    new-instance v1, LFL3;

    invoke-direct {v1, v0}, LFL3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LHL3$e;

    invoke-direct {v0, p0}, LHL3$e;-><init>(LHL3;)V

    new-instance v1, LGL3;

    invoke-direct {v1, v0}, LGL3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    const-string v0, "override fun <T : WirePa\u2026  }\n        }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final e(Lco/bird/api/response/WirePaymentActionRequiredResponse;)Lio/reactivex/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lco/bird/api/response/WirePaymentActionRequiredResponse;",
            ">(TT;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    invoke-interface {p1}, Lco/bird/api/response/WirePaymentActionRequiredResponse;->getAction()Lco/bird/api/request/PaymentAction;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/api/request/PaymentAction;->getGatewayKind()Lco/bird/android/model/constant/PaymentGatewayKind;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, -0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    sget-object v3, LHL3$b;->$EnumSwitchMapping$1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    :goto_1
    const-string v3, "error(IllegalArgumentExc\u2026andle payment response\"))"

    const/4 v4, 0x1

    if-ne v0, v4, :cond_9

    iget-object v0, p0, LHL3;->a:Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    invoke-virtual {v0}, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->a()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/Stripe;

    invoke-interface {p1}, Lco/bird/api/response/WirePaymentActionRequiredResponse;->getAction()Lco/bird/api/request/PaymentAction;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/api/request/PaymentAction;->getActionKind()Lco/bird/android/model/constant/PaymentActionKind;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    sget-object v0, LHL3$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v2, v0, v1

    :goto_2
    if-ne v2, v4, :cond_8

    invoke-interface {p1}, Lco/bird/api/response/WirePaymentActionRequiredResponse;->getAction()Lco/bird/api/request/PaymentAction;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lco/bird/api/request/PaymentAction;->getActionPayload()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v1, "client_secret"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-interface {p1}, Lco/bird/api/response/WirePaymentActionRequiredResponse;->getAction()Lco/bird/api/request/PaymentAction;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lco/bird/api/request/PaymentAction;->getActionPayload()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_6

    const-string v1, "intent_id"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parsed intentId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to set to payment intent manager"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, LHL3;->b:LpM3;

    invoke-interface {v1, p1, v0}, LpM3;->h(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "complete()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_6
    :goto_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "missing expected intent_id from api response"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "error(NullPointerExcepti\u2026t_id from api response\"))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_7
    :goto_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "missing expected client_secret from api response"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "error(NullPointerExcepti\u2026cret from api response\"))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown actionKind returned, cannot handle payment response"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown gatewayKind returned, cannot handle payment response"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
