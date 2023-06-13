.class public final Lco/bird/android/feature/rider/birdpay/input/d$H;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/input/d;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireCoupon;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "coupons",
        "",
        "Lco/bird/android/model/wire/WireCoupon;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdPayInputPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayInputPresenter.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputPresenterImpl$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,641:1\n1045#2:642\n288#2,2:643\n*S KotlinDebug\n*F\n+ 1 BirdPayInputPresenter.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputPresenterImpl$onCreate$1\n*L\n164#1:642\n165#1:643,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/birdpay/input/d;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/birdpay/input/d;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$H;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$H;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;)V"
        }
    .end annotation

    const-string v0, "coupons"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Lco/bird/android/feature/rider/birdpay/input/d$H$a;

    invoke-direct {v0}, Lco/bird/android/feature/rider/birdpay/input/d$H$a;-><init>()V

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireCoupon;->getRedeemedAt()Lorg/joda/time/DateTime;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireCoupon;->getKind()Lco/bird/android/model/constant/CouponKind;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/CouponKind;->MERCHANT_TRANSACTION:Lco/bird/android/model/constant/CouponKind;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    check-cast v0, Lco/bird/android/model/wire/WireCoupon;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$H;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getCouponRelay$p(Lco/bird/android/feature/rider/birdpay/input/d;)LAG;

    move-result-object v1

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2, v0}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v1, v2}, LAG;->accept(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireCoupon;->getMaxAmount()I

    move-result v1

    int-to-long v3, v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireCoupon;->getCurrency()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v5

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getUi$p(Lco/bird/android/feature/rider/birdpay/input/d;)LbO;

    move-result-object p1

    sget-object v2, Lxx1;->a:Lxx1;

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lxx1;->currency$default(Lxx1;JLjava/util/Currency;LUx1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, LbO;->rb(Ljava/lang/String;)V

    :cond_3
    return-void
.end method
