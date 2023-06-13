.class public final LJ14$t;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ14;->b0(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/User;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "user",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/User;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LJ14;

.field public final synthetic h:Lcom/braintreepayments/api/models/PaymentMethodNonce;


# direct methods
.method public constructor <init>(LJ14;Lcom/braintreepayments/api/models/PaymentMethodNonce;)V
    .locals 0

    iput-object p1, p0, LJ14$t;->g:LJ14;

    iput-object p2, p0, LJ14$t;->h:Lcom/braintreepayments/api/models/PaymentMethodNonce;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/User;)Lio/reactivex/h;
    .locals 7

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ14$t;->g:LJ14;

    invoke-static {v0}, LJ14;->access$getPaymentManagerV2$p(LJ14;)LAM3;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, LJ14$t;->h:Lcom/braintreepayments/api/models/PaymentMethodNonce;

    check-cast p1, Lcom/braintreepayments/api/models/PayPalAccountNonce;

    invoke-virtual {p1}, Lcom/braintreepayments/api/models/PayPalAccountNonce;->i()Ljava/lang/String;

    move-result-object v3

    const-string p1, "paymentMethodNonce.email"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LJ14$t;->h:Lcom/braintreepayments/api/models/PaymentMethodNonce;

    check-cast p1, Lcom/braintreepayments/api/models/PayPalAccountNonce;

    invoke-virtual {p1}, Lcom/braintreepayments/api/models/PaymentMethodNonce;->c()Ljava/lang/String;

    move-result-object v4

    const-string p1, "paymentMethodNonce.nonce"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lco/bird/android/model/constant/PaymentProvider;->BRAINTREE:Lco/bird/android/model/constant/PaymentProvider;

    sget-object v6, Lco/bird/android/model/PaymentAddSource;->QUICK_PAYMENT_SCREEN:Lco/bird/android/model/PaymentAddSource;

    invoke-interface/range {v1 .. v6}, LAM3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PaymentProvider;Lco/bird/android/model/PaymentAddSource;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, LJ14$t;->a(Lco/bird/android/model/User;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
