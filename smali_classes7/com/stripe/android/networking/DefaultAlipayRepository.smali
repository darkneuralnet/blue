.class public final Lcom/stripe/android/networking/DefaultAlipayRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/networking/AlipayRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/networking/DefaultAlipayRepository;",
        "Lcom/stripe/android/networking/AlipayRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "(Lcom/stripe/android/networking/StripeRepository;)V",
        "authenticate",
        "Lcom/stripe/android/model/AlipayAuthResult;",
        "paymentIntent",
        "Lcom/stripe/android/model/PaymentIntent;",
        "authenticator",
        "Lcom/stripe/android/AlipayAuthenticator;",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ALIPAY_RESULT_FIELD:Ljava/lang/String; = "resultStatus"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;


# instance fields
.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/networking/DefaultAlipayRepository;->Companion:Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;)V
    .locals 1

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/networking/DefaultAlipayRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-void
.end method


# virtual methods
.method public authenticate(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentIntent;",
            "Lcom/stripe/android/AlipayAuthenticator;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/AlipayAuthResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;

    iget v1, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;-><init>(Lcom/stripe/android/networking/DefaultAlipayRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p4

    const/4 v2, 0x0

    if-eqz p4, :cond_3

    iget-boolean p4, p4, Lcom/stripe/android/model/PaymentMethod;->liveMode:Z

    if-nez p4, :cond_3

    move p4, v3

    goto :goto_1

    :cond_3
    move p4, v2

    :goto_1
    if-nez p4, :cond_d

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p1

    instance-of p4, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;

    if-eqz p4, :cond_c

    check-cast p1, Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;

    invoke-virtual {p1}, Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;->getData()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p4}, Lcom/stripe/android/AlipayAuthenticator;->onAuthenticationRequest(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    const-string p4, "resultStatus"

    invoke-interface {p2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p4

    const v4, 0x185d7c

    if-eq p4, v4, :cond_8

    const v4, 0x19463b

    if-eq p4, v4, :cond_6

    const v4, 0x1aa357

    if-eq p4, v4, :cond_4

    goto :goto_3

    :cond_4
    const-string p4, "9000"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {p1}, Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;->getAuthCompleteUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_b

    iget-object p2, p0, Lcom/stripe/android/networking/DefaultAlipayRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput v3, v0, Lcom/stripe/android/networking/DefaultAlipayRepository$authenticate$1;->label:I

    invoke-virtual {p2, p1, p3, v0}, Lcom/stripe/android/networking/StripeRepository;->retrieveObject$payments_core_release(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p4, Lcom/stripe/android/core/networking/StripeResponse;

    goto :goto_4

    :cond_6
    const-string p1, "6001"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    const/4 v3, 0x3

    goto :goto_4

    :cond_8
    const-string p1, "4000"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_3

    :cond_9
    const/4 v3, 0x2

    goto :goto_4

    :cond_a
    :goto_3
    move v3, v2

    :cond_b
    :goto_4
    new-instance p1, Lcom/stripe/android/model/AlipayAuthResult;

    invoke-direct {p1, v3}, Lcom/stripe/android/model/AlipayAuthResult;-><init>(I)V

    return-object p1

    :cond_c
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unable to authenticate Payment Intent with Alipay SDK"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Attempted to authenticate test mode PaymentIntent with the Alipay SDK.\nThe Alipay SDK does not support test mode payments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
