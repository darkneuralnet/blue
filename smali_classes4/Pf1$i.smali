.class public final LPf1$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPf1;-><init>(LJT0;LV74;LTq4;LYR4;LRh6;)V
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
        "sortedCouponList",
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
        "SMAP\nEphemeralPromoManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EphemeralPromoManagerImpl.kt\nco/bird/android/manager/ride/EphemeralPromoManagerImpl$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n766#2:163\n857#2,2:164\n1855#2,2:166\n*S KotlinDebug\n*F\n+ 1 EphemeralPromoManagerImpl.kt\nco/bird/android/manager/ride/EphemeralPromoManagerImpl$7\n*L\n86#1:163\n86#1:164,2\n86#1:166,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LTq4;

.field public final synthetic h:LPf1;


# direct methods
.method public constructor <init>(LTq4;LPf1;)V
    .locals 0

    iput-object p1, p0, LPf1$i;->g:LTq4;

    iput-object p2, p0, LPf1$i;->h:LPf1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LPf1$i;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LPf1$i;->g:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getReservationConfig()Lco/bird/android/model/wire/configs/ReservationConfig;

    move-result-object v0

    iget-object v1, p0, LPf1$i;->g:LTq4;

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ReservationConfig;->getEnableReservePromoOnBadScan()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ReservationConfig;->getEnableReservePromoOnCancelledRide()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ReservationConfig;->getEnableReservePromoOnLowBatteryCancelledRide()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableFreeUnlockAfterCancelledRide()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableFreeUnlockAfterBadScan()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableFreeUnlockAfterLowBatteryRide()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_0
    const-string v0, "sortedCouponList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/wire/WireCoupon;

    invoke-static {v2}, Lco/bird/android/model/wire/WireCouponKt;->expired(Lco/bird/android/model/wire/WireCoupon;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object p1, p0, LPf1$i;->h:LPf1;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireCoupon;->getKind()Lco/bird/android/model/constant/CouponKind;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/CouponKind;->FREE_RESERVE:Lco/bird/android/model/constant/CouponKind;

    if-ne v2, v3, :cond_4

    invoke-static {p1, v1}, LPf1;->access$isExistingPromoCoupon(LPf1;Lco/bird/android/model/wire/WireCoupon;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {p1}, LPf1;->access$getMutableFreeReservationCoupon$p(LPf1;)La94;

    move-result-object v2

    sget-object v3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v3, v1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v2, v1}, La94;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireCoupon;->getKind()Lco/bird/android/model/constant/CouponKind;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/CouponKind;->FREE_UNLOCK:Lco/bird/android/model/constant/CouponKind;

    if-ne v2, v3, :cond_3

    invoke-static {p1, v1}, LPf1;->access$isExistingPromoCoupon(LPf1;Lco/bird/android/model/wire/WireCoupon;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {p1}, LPf1;->access$getMutableFreeUnlockCoupon$p(LPf1;)La94;

    move-result-object v2

    sget-object v3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v3, v1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v2, v1}, La94;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    return-void
.end method
