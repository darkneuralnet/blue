.class public final Ll84$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll84;->h0()Lio/reactivex/F;
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
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireCoupon;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WireCoupon;",
        "coupons",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Ljava/util/List;"
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
        "SMAP\nPromoManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl$fetchCoupon$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n766#2:240\n857#2,2:241\n*S KotlinDebug\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl$fetchCoupon$3\n*L\n232#1:240\n232#1:241,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ll84;


# direct methods
.method public constructor <init>(Ll84;)V
    .locals 0

    iput-object p1, p0, Ll84$h;->g:Ll84;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation

    const-string v0, "coupons"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Ll84$h;->g:Ll84;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireCoupon;->getCurrency()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Ll84;->access$getReactiveConfig$p(Ll84;)LTq4;

    move-result-object v5

    invoke-virtual {v5}, LTq4;->f8()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v3}, Lco/bird/android/model/wire/WireCouponKt;->expired(Lco/bird/android/model/wire/WireCoupon;)Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ll84$h;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
