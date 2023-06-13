.class public final Lco/bird/android/model/wire/configs/RentalConfigKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/wire/configs/RentalConfigKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "getConfig",
        "Lco/bird/android/model/wire/configs/RentalConfig;",
        "Lco/bird/android/model/wire/configs/BaseRentalConfig;",
        "rentalKind",
        "Lco/bird/android/model/constant/RentalKind;",
        "model-wire_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getConfig(Lco/bird/android/model/wire/configs/BaseRentalConfig;)Lco/bird/android/model/wire/configs/RentalConfig;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/wire/configs/RentalConfigKt;->rentalKind(Lco/bird/android/model/wire/configs/BaseRentalConfig;)Lco/bird/android/model/constant/RentalKind;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/wire/configs/RentalConfigKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/BaseRentalConfig;->getDropOffConfig()Lco/bird/android/model/wire/configs/RentalConfig;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/BaseRentalConfig;->getPickUpConfig()Lco/bird/android/model/wire/configs/RentalConfig;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/BaseRentalConfig;->getOnDemandConfig()Lco/bird/android/model/wire/configs/RentalConfig;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final rentalKind(Lco/bird/android/model/wire/configs/BaseRentalConfig;)Lco/bird/android/model/constant/RentalKind;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/BaseRentalConfig;->getOnDemandConfig()Lco/bird/android/model/wire/configs/RentalConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RentalConfig;->getEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lco/bird/android/model/constant/RentalKind;->ON_DEMAND:Lco/bird/android/model/constant/RentalKind;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/BaseRentalConfig;->getPickUpConfig()Lco/bird/android/model/wire/configs/RentalConfig;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/RentalConfig;->getEnabled()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lco/bird/android/model/constant/RentalKind;->PICK_UP:Lco/bird/android/model/constant/RentalKind;

    goto :goto_0

    :cond_1
    sget-object p0, Lco/bird/android/model/constant/RentalKind;->DROP_OFF:Lco/bird/android/model/constant/RentalKind;

    :goto_0
    return-object p0
.end method
