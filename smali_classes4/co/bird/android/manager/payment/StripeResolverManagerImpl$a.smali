.class public final Lco/bird/android/manager/payment/StripeResolverManagerImpl$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/payment/StripeResolverManagerImpl;->onStart(LLifecycleOwner;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "key",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/payment/StripeResolverManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl$a;->g:Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/payment/StripeResolverManagerImpl$a;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 9

    iget-object v0, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl$a;->g:Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->access$getCurrentUserStripeRelay$p(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)La94;

    move-result-object v0

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/stripe/android/Stripe;

    iget-object v1, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl$a;->g:Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    invoke-static {v1}, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->access$getContext$p(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v1, "context.applicationContext"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "key"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl$a;->g:Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    invoke-static {v1}, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->access$getReactiveConfig$p(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getPaymentConfig()Lco/bird/android/model/wire/configs/PaymentConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/PaymentConfig;->getConnectedAccountId()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl$a;->g:Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    invoke-static {v1}, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->access$getAppBuildConfig$p(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)LOh;

    move-result-object v1

    invoke-interface {v1}, LOh;->k()Z

    move-result v5

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v1, v0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/Stripe;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl$a;->g:Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->access$getCurrentUserStripeRelay$p(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)La94;

    move-result-object v0

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
