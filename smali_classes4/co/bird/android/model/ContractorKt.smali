.class public final Lco/bird/android/model/ContractorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "getDrawerRoleIcon",
        "",
        "Lco/bird/android/model/Contractor;",
        "getDrawerRoleString",
        "isFlyerLevelTwoOrAbove",
        "",
        "model_release"
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
.method public static final getDrawerRoleIcon(Lco/bird/android/model/Contractor;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/Contractor;->getContractorLevel()Lco/bird/android/model/ContractorLevel;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/ContractorLevel;->getRoleIcon()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_0
    sget p0, Lrg4;->ic_role_flyer:I

    :goto_0
    return p0
.end method

.method public static final getDrawerRoleString(Lco/bird/android/model/Contractor;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/Contractor;->getContractorLevel()Lco/bird/android/model/ContractorLevel;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/ContractorLevel;->getRoleLabel()I

    move-result p0

    goto :goto_0

    :cond_0
    sget p0, Lnl4;->drawer_ride_switch_flyer:I

    :goto_0
    return p0
.end method

.method public static final isFlyerLevelTwoOrAbove(Lco/bird/android/model/Contractor;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/Contractor;->getContractorLevel()Lco/bird/android/model/ContractorLevel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/Contractor;->getContractorLevel()Lco/bird/android/model/ContractorLevel;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/ContractorLevel;->CHARGER:Lco/bird/android/model/ContractorLevel;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/Contractor;->getContractorLevel()Lco/bird/android/model/ContractorLevel;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/ContractorLevel;->SUPERCHARGER:Lco/bird/android/model/ContractorLevel;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
