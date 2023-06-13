.class public final Lco/bird/android/feature/rider/birdpay/input/d$l;
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
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "+",
        "Lco/bird/android/model/Balance;",
        "+",
        "Ljava/lang/Integer;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lwb4<",
        "+",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "+",
        "Lco/bird/android/model/Balance;",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "LHM4<",
        "LuL3;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\n\u001a\u00a2\u0001\u0012J\u0008\u0001\u0012F\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007 \t*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0018\u00010\u00060\u0006 \t*P\u0012J\u0008\u0001\u0012F\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007 \t*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "Lco/bird/android/model/Balance;",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lwb4;",
        "LHM4;",
        "LuL3;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lkotlin/Triple;)Lio/reactivex/K;"
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

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$l;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lwb4;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$l;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lwb4;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lwb4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwb4;

    return-object p0
.end method


# virtual methods
.method public final b(Lkotlin/Triple;)Lio/reactivex/K;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            "Lco/bird/android/model/Balance;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lwb4<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            "Lco/bird/android/model/Balance;",
            "Ljava/lang/Integer;",
            "LHM4<",
            "LuL3;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Balance;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    iget-object v2, p0, Lco/bird/android/feature/rider/birdpay/input/d$l;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v2}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getAmountDoubleSubject$p(Lco/bird/android/feature/rider/birdpay/input/d;)Lio/reactivex/subjects/a;

    move-result-object v3

    invoke-virtual {v3}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    iget-object v5, p0, Lco/bird/android/feature/rider/birdpay/input/d$l;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v5}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getMerchantCurrency$p(Lco/bird/android/feature/rider/birdpay/input/d;)Ljava/util/Currency;

    move-result-object v5

    invoke-static {v2, v3, v4, v5}, Lco/bird/android/feature/rider/birdpay/input/d;->access$toAmount(Lco/bird/android/feature/rider/birdpay/input/d;DLjava/util/Currency;)I

    move-result v2

    iget-object v3, p0, Lco/bird/android/feature/rider/birdpay/input/d$l;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v3}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getBirdPayManager$p(Lco/bird/android/feature/rider/birdpay/input/d;)LiO;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2, p1}, LiO;->h(Ljava/lang/String;ILjava/lang/Integer;)Lio/reactivex/F;

    move-result-object p1

    new-instance v3, Lco/bird/android/feature/rider/birdpay/input/d$l$a;

    invoke-direct {v3, v0, v1, v2}, Lco/bird/android/feature/rider/birdpay/input/d$l$a;-><init>(Lco/bird/android/model/wire/WireMerchantSite;Lco/bird/android/model/Balance;I)V

    new-instance v0, LWN;

    invoke-direct {v0, v3}, LWN;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$l;->b(Lkotlin/Triple;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
