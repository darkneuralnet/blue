.class public final LBd1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "",
        "byte",
        "Lco/bird/android/model/constant/EnergyMode;",
        "b",
        "Lco/bird/android/model/VehicleDescriptor;",
        "a",
        "extension_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/VehicleDescriptor;B)Lco/bird/android/model/constant/EnergyMode;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/VehicleDescriptor;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/VehicleDescriptor;->getSerialNumber()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    invoke-static {v0, v1}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsEsModel(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p1, :cond_1

    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->POWER_SAVING:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    if-ne p1, p0, :cond_2

    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->NORMAL:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_0

    :cond_2
    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->SPORT:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lco/bird/android/model/VehicleDescriptor;->getModel()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsM365Model(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    if-nez p1, :cond_4

    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->NORMAL:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_0

    :cond_4
    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->POWER_SAVING:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_0

    :cond_5
    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->NORMAL:Lco/bird/android/model/constant/EnergyMode;

    :goto_0
    return-object p0
.end method

.method public static final b(Lco/bird/android/model/wire/WireBird;B)Lco/bird/android/model/constant/EnergyMode;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isEsModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->POWER_SAVING:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    if-ne p1, p0, :cond_1

    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->NORMAL:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_0

    :cond_1
    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->SPORT:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isM365Model(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    if-eqz p0, :cond_4

    if-nez p1, :cond_3

    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->NORMAL:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_0

    :cond_3
    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->POWER_SAVING:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_0

    :cond_4
    sget-object p0, Lco/bird/android/model/constant/EnergyMode;->NORMAL:Lco/bird/android/model/constant/EnergyMode;

    :goto_0
    return-object p0
.end method
