.class public final Li25$w1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->Q5(Landroid/content/Intent;)V
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
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$66\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1747#2,3:4446\n1747#2,3:4449\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$66\n*L\n1173#1:4446,3\n1174#1:4449,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$w1;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Li25$w1;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 7
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

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireCoupon;->getActivatedAt()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireCoupon;->getExpiresAt()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/Seconds;->getSeconds()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    div-int/lit8 v0, v0, 0x3c

    check-cast p1, Ljava/lang/Iterable;

    instance-of v1, p1, Ljava/util/Collection;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v4, p1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    move v4, v3

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireCoupon;->getKind()Lco/bird/android/model/constant/CouponKind;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/constant/CouponKind;->FREE_RESERVE:Lco/bird/android/model/constant/CouponKind;

    if-ne v5, v6, :cond_3

    move v5, v2

    goto :goto_0

    :cond_3
    move v5, v3

    :goto_0
    if-eqz v5, :cond_2

    move v4, v2

    :goto_1
    if-eqz v1, :cond_5

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    move v2, v3

    goto :goto_3

    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireCoupon;->getKind()Lco/bird/android/model/constant/CouponKind;

    move-result-object v1

    sget-object v5, Lco/bird/android/model/constant/CouponKind;->FREE_UNLOCK:Lco/bird/android/model/constant/CouponKind;

    if-ne v1, v5, :cond_7

    move v1, v2

    goto :goto_2

    :cond_7
    move v1, v3

    :goto_2
    if-eqz v1, :cond_6

    :goto_3
    if-eqz v4, :cond_8

    if-eqz v2, :cond_8

    iget-object p1, p0, Li25$w1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1, v0}, LP75;->Zc(I)V

    goto :goto_4

    :cond_8
    if-eqz v4, :cond_9

    iget-object p1, p0, Li25$w1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1, v0}, LP75;->od(I)V

    goto :goto_4

    :cond_9
    if-eqz v2, :cond_a

    iget-object p1, p0, Li25$w1;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideUi$p(Li25;)LP75;

    move-result-object p1

    invoke-interface {p1, v0}, LP75;->Jc(I)V

    :cond_a
    :goto_4
    iget-object p1, p0, Li25$w1;->g:Li25;

    invoke-static {p1}, Li25;->access$getEphemeralPromoManager$p(Li25;)LBf1;

    move-result-object p1

    invoke-interface {p1}, LBf1;->c()V

    return-void
.end method
