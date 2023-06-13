.class public final Lr24;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lr24;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lco/bird/android/model/wire/WireBird;",
        "vehicle",
        "Lco/bird/android/model/wire/configs/Config;",
        "config",
        "",
        "c",
        "Lco/bird/android/model/wire/configs/RideConfig;",
        "rideConfig",
        "b",
        "Lco/bird/android/model/wire/WireRidePrice;",
        "pricing",
        "a",
        "<init>",
        "()V",
        "core-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPrice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Price.kt\nco/bird/android/core/base/Price\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lr24;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr24;

    invoke-direct {v0}, Lr24;-><init>()V

    sput-object v0, Lr24;->a:Lr24;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lco/bird/android/model/wire/WireRidePrice;)Ljava/lang/String;
    .locals 12

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pricing"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getOverwriteString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x3

    const-wide/16 v3, 0x0

    const-string v5, "context.getString(\n     \u2026Option.SHOW_IF_NON_ZERO))"

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-lez v0, :cond_1

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v9

    cmp-long v0, v9, v3

    if-lez v0, :cond_1

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getSalesTax()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lnl4;->dynamic_pricing_minimum_included_minutes_plus_tax:I

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v3, Lxx1;->a:Lxx1;

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getBasePrice()J

    move-result-wide v9

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    sget-object v11, LUx1;->d:LUx1;

    invoke-virtual {v3, v9, v10, v4, v11}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v7

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinutePrice()J

    move-result-wide v7

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    invoke-virtual {v3, v7, v8, v4, v11}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v6

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v6

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p2

    invoke-virtual {v3, v6, v7, p2, v11}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v9

    cmp-long v0, v9, v3

    if-lez v0, :cond_2

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getSalesTax()Z

    move-result v0

    if-nez v0, :cond_2

    sget v0, Lnl4;->dynamic_pricing_minimum_included_minutes:I

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v3, Lxx1;->a:Lxx1;

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getBasePrice()J

    move-result-wide v9

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    sget-object v11, LUx1;->d:LUx1;

    invoke-virtual {v3, v9, v10, v4, v11}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v7

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinutePrice()J

    move-result-wide v7

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    invoke-virtual {v3, v7, v8, v4, v11}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v6

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v6

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p2

    invoke-virtual {v3, v6, v7, p2, v11}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-nez v0, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getSalesTax()Z

    move-result v0

    if-eqz v0, :cond_3

    sget v0, Lnl4;->dynamic_pricing_included_minutes_plus_tax:I

    new-array v1, v2, [Ljava/lang/Object;

    sget-object v2, Lxx1;->a:Lxx1;

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getBasePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v9

    sget-object v10, LUx1;->d:LUx1;

    invoke-virtual {v2, v3, v4, v9, v10}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v7

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinutePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p2

    invoke-virtual {v2, v3, v4, p2, v10}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v6

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_3
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-nez v0, :cond_4

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getSalesTax()Z

    move-result v0

    if-nez v0, :cond_4

    sget v0, Lnl4;->dynamic_pricing_included_minutes:I

    new-array v1, v2, [Ljava/lang/Object;

    sget-object v2, Lxx1;->a:Lxx1;

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getBasePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v9

    sget-object v10, LUx1;->d:LUx1;

    invoke-virtual {v2, v3, v4, v9, v10}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v7

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinutePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p2

    invoke-virtual {v2, v3, v4, p2, v10}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v6

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_4
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-lez v0, :cond_5

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getSalesTax()Z

    move-result v0

    if-eqz v0, :cond_5

    sget v0, Lnl4;->dynamic_pricing_minimum_plus_tax:I

    new-array v1, v2, [Ljava/lang/Object;

    sget-object v2, Lxx1;->a:Lxx1;

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getBasePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v9

    sget-object v10, LUx1;->d:LUx1;

    invoke-virtual {v2, v3, v4, v9, v10}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinutePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v8

    invoke-virtual {v2, v3, v4, v8, v10}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v7

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p2

    invoke-virtual {v2, v3, v4, p2, v10}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v6

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_5
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-lez v0, :cond_6

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getSalesTax()Z

    move-result v0

    if-nez v0, :cond_6

    sget v0, Lnl4;->dynamic_pricing_minimum:I

    new-array v1, v2, [Ljava/lang/Object;

    sget-object v2, Lxx1;->a:Lxx1;

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getBasePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v9

    sget-object v10, LUx1;->d:LUx1;

    invoke-virtual {v2, v3, v4, v9, v10}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinutePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v8

    invoke-virtual {v2, v3, v4, v8, v10}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v7

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p2

    invoke-virtual {v2, v3, v4, p2, v10}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v6

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_6
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-nez v0, :cond_7

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getSalesTax()Z

    move-result v0

    if-eqz v0, :cond_7

    sget v0, Lnl4;->dynamic_pricing_base_plus_tax:I

    new-array v1, v6, [Ljava/lang/Object;

    sget-object v2, Lxx1;->a:Lxx1;

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getBasePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v6

    sget-object v9, LUx1;->d:LUx1;

    invoke-virtual {v2, v3, v4, v6, v9}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinutePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p2

    invoke-virtual {v2, v3, v4, p2, v9}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v7

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_7
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-nez v0, :cond_8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getSalesTax()Z

    move-result v0

    if-nez v0, :cond_8

    sget v0, Lnl4;->dynamic_pricing_base:I

    new-array v1, v6, [Ljava/lang/Object;

    sget-object v2, Lxx1;->a:Lxx1;

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getBasePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v6

    sget-object v9, LUx1;->d:LUx1;

    invoke-virtual {v2, v3, v4, v6, v9}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinutePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p2

    invoke-virtual {v2, v3, v4, p2, v9}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v7

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_8
    sget v0, Lnl4;->dynamic_pricing_base:I

    new-array v1, v6, [Ljava/lang/Object;

    sget-object v2, Lxx1;->a:Lxx1;

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getBasePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v6

    sget-object v9, LUx1;->d:LUx1;

    invoke-virtual {v2, v3, v4, v6, v9}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getMinutePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p2

    invoke-virtual {v2, v3, v4, p2, v9}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v7

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(Landroid/content/Context;Lco/bird/android/model/wire/configs/RideConfig;)Ljava/lang/String;
    .locals 13

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lr24;->a:Lr24;

    new-instance v12, Lco/bird/android/model/wire/WireRidePrice;

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getBasePrice()J

    move-result-wide v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getMinutePrice()J

    move-result-wide v5

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getAdditionalFees()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;->getApplyTax()Z

    move-result v7

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getMinimumRidePrice()J

    move-result-wide v8

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getIncludedMinutes()I

    move-result v10

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getLocalizedDynamicPriceString()Ljava/lang/String;

    move-result-object v11

    move-object v1, v12

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/wire/WireRidePrice;-><init>(Ljava/lang/String;JJZJILjava/lang/String;)V

    invoke-virtual {v0, p1, v12}, Lr24;->a(Landroid/content/Context;Lco/bird/android/model/wire/WireRidePrice;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c(Landroid/content/Context;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Ljava/lang/String;
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vehicle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lco/bird/android/model/wire/configs/Config;->getMarketManifestConfig()Lco/bird/android/model/wire/configs/MarketManifestConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/MarketManifestConfig;->getBrands()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/wire/WireBrand;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBrand;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireBird;->getBrandName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lco/bird/android/model/wire/WireBrand;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBrand;->getVehicleModels()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/wire/WireVehicleModel;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireVehicleModel;->getModel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v2, v1

    :cond_3
    check-cast v2, Lco/bird/android/model/wire/WireVehicleModel;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireVehicleModel;->getPricing()Lco/bird/android/model/wire/WireRidePrice;

    move-result-object p2

    if-eqz p2, :cond_4

    sget-object p3, Lr24;->a:Lr24;

    invoke-virtual {p3, p1, p2}, Lr24;->a(Landroid/content/Context;Lco/bird/android/model/wire/WireRidePrice;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p3}, LFv0;->a(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lr24;->a(Landroid/content/Context;Lco/bird/android/model/wire/WireRidePrice;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
