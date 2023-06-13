.class public final Lco/bird/android/feature/rider/birdpay/input/d$D;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/input/d;->V()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Balance;",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/Balance;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/Balance;",
        "userBalance",
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Balance;)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/birdpay/input/d;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/birdpay/input/d;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$D;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Balance;)Lkotlin/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Balance;",
            ")",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Balance;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "userBalance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/input/d$D;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getAmountDoubleSubject$p(Lco/bird/android/feature/rider/birdpay/input/d;)Lio/reactivex/subjects/a;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    if-nez v1, :cond_0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    iget-object v3, p0, Lco/bird/android/feature/rider/birdpay/input/d$D;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v3}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getMerchantCurrency$p(Lco/bird/android/feature/rider/birdpay/input/d;)Ljava/util/Currency;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lco/bird/android/feature/rider/birdpay/input/d;->access$toAmount(Lco/bird/android/feature/rider/birdpay/input/d;DLjava/util/Currency;)I

    move-result v0

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/input/d$D;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    int-to-long v2, v0

    invoke-static {v1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getReactiveConfig$p(Lco/bird/android/feature/rider/birdpay/input/d;)LTq4;

    move-result-object v0

    invoke-static {v1, v2, v3, p1, v0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$paymentSourceRequired(Lco/bird/android/feature/rider/birdpay/input/d;JLco/bird/android/model/Balance;LTq4;)Z

    move-result v0

    new-instance v1, Lkotlin/Pair;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Balance;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$D;->a(Lco/bird/android/model/Balance;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
