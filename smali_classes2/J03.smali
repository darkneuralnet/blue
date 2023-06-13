.class public final LJ03;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ03$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/Config;",
        "config",
        "Lco/bird/android/buava/Optional;",
        "",
        "Lco/bird/android/model/CurrentRental;",
        "rentals",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/wire/configs/DeliveryRequestKind;",
        "a",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/buava/Optional;)Lkotlin/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/configs/Config;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/List<",
            "Lco/bird/android/model/CurrentRental;",
            ">;>;)",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lco/bird/android/model/wire/configs/DeliveryRequestKind;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/Config;->getDeliveryConfig()Lco/bird/android/model/wire/configs/DeliveryConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/DeliveryConfig;->getActiveRequestKind()Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    move-result-object v0

    sget-object v1, LJ03$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-eq v0, v2, :cond_1

    :cond_0
    move v1, v3

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/Config;->getRentalConfigs()Lco/bird/android/model/wire/configs/BaseRentalConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/BaseRentalConfig;->getAtLeastOneEnabled()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    goto :goto_0

    :cond_2
    move p1, v3

    :goto_0
    if-eqz p1, :cond_0

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/Config;->getDeliveryConfig()Lco/bird/android/model/wire/configs/DeliveryConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/DeliveryConfig;->getEnableDeliveryMenuItem()Z

    move-result v1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/Config;->getDeliveryConfig()Lco/bird/android/model/wire/configs/DeliveryConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/DeliveryConfig;->getEnableDeliveryMenuItem()Z

    move-result v1

    :cond_5
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/Config;->getDeliveryConfig()Lco/bird/android/model/wire/configs/DeliveryConfig;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/DeliveryConfig;->getActiveRequestKind()Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$shouldShowDeliveryInSideMenu(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/buava/Optional;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LJ03;->a(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/buava/Optional;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method
