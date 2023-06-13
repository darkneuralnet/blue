.class public final Lco/bird/android/model/persistence/extensions/Bird_Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\u0018\u0010\u000e\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\u0018\u0010\u000f\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\n\u0010\u0010\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0011\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0012\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0013\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0014\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0015\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0016\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0017\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0019\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u001b"
    }
    d2 = {
        "MODEL_BIRD_AIR",
        "",
        "MODEL_BIRD_B4",
        "MODEL_BIRD_BIKE_PAIRABLE",
        "MODEL_BIRD_BIKE_UNPAIRED",
        "MODEL_BIRD_FLEX",
        "privateIdentifier",
        "Lco/bird/android/model/persistence/Bird;",
        "getPrivateIdentifier",
        "(Lco/bird/android/model/persistence/Bird;)Ljava/lang/String;",
        "vehicleIsEb100",
        "",
        "model",
        "serialNumber",
        "vehicleIsEs400",
        "vehicleIsEs500",
        "isAsleep",
        "isBirdAir",
        "isBirdBike",
        "isBirdBikePairable",
        "isBirdBikeUnpaired",
        "isEB100",
        "isES400",
        "isES500",
        "isRetailBird",
        "isSwappable",
        "localBrandName",
        "model-persistence_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final MODEL_BIRD_AIR:Ljava/lang/String; = "birdair"

.field public static final MODEL_BIRD_B4:Ljava/lang/String; = "b4"

.field public static final MODEL_BIRD_BIKE_PAIRABLE:Ljava/lang/String; = "hje"

.field public static final MODEL_BIRD_BIKE_UNPAIRED:Ljava/lang/String; = "rb1"

.field public static final MODEL_BIRD_FLEX:Ljava/lang/String; = "es500"


# direct methods
.method public static final getPrivateIdentifier(Lco/bird/android/model/persistence/Bird;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getPrivateBird()Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getNickname()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static final isAsleep(Lco/bird/android/model/persistence/Bird;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getLifecycle()Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->getBrainState()Lco/bird/android/model/constant/BrainState;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/BrainState;->ASLEEP:Lco/bird/android/model/constant/BrainState;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getAsleep()Z

    move-result p0

    if-eqz p0, :cond_0

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

.method public static final isBirdAir(Lco/bird/android/model/persistence/Bird;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "birdair"

    const/4 v2, 0x1

    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-ne p0, v2, :cond_0

    move v0, v2

    :cond_0
    return v0
.end method

.method public static final isBirdBike(Lco/bird/android/model/persistence/Bird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isBirdBikeUnpaired(Lco/bird/android/model/persistence/Bird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isBirdBikePairable(Lco/bird/android/model/persistence/Bird;)Z

    move-result p0

    if-eqz p0, :cond_0

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

.method public static final isBirdBikePairable(Lco/bird/android/model/persistence/Bird;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "hje"

    const/4 v2, 0x1

    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-ne p0, v2, :cond_0

    move v0, v2

    :cond_0
    return v0
.end method

.method public static final isBirdBikeUnpaired(Lco/bird/android/model/persistence/Bird;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "rb1"

    const/4 v2, 0x1

    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-ne p0, v2, :cond_0

    move v0, v2

    :cond_0
    return v0
.end method

.method public static final isEB100(Lco/bird/android/model/persistence/Bird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->vehicleIsEb100(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isES400(Lco/bird/android/model/persistence/Bird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->vehicleIsEs400(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isES500(Lco/bird/android/model/persistence/Bird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->vehicleIsEs500(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isRetailBird(Lco/bird/android/model/persistence/Bird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isBirdAir(Lco/bird/android/model/persistence/Bird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isBirdBike(Lco/bird/android/model/persistence/Bird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isES500(Lco/bird/android/model/persistence/Bird;)Z

    move-result p0

    if-eqz p0, :cond_0

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

.method public static final isSwappable(Lco/bird/android/model/persistence/Bird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isEB100(Lco/bird/android/model/persistence/Bird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isES400(Lco/bird/android/model/persistence/Bird;)Z

    move-result p0

    if-eqz p0, :cond_0

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

.method public static final localBrandName(Lco/bird/android/model/persistence/Bird;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isES500(Lco/bird/android/model/persistence/Bird;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Bird Flex"

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isBirdBike(Lco/bird/android/model/persistence/Bird;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "Bird Bike"

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isBirdAir(Lco/bird/android/model/persistence/Bird;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "Bird Air"

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isEB100(Lco/bird/android/model/persistence/Bird;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "Bird Bikeshare EB100"

    goto :goto_0

    :cond_3
    invoke-static {p0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isES400(Lco/bird/android/model/persistence/Bird;)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "Bird Swappable ES400"

    goto :goto_0

    :cond_4
    const-string p0, "Bird"

    :goto_0
    return-object p0
.end method

.method public static final vehicleIsEb100(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    const-string v0, "eb100"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-ne p0, v1, :cond_0

    move p1, v1

    :cond_0
    return p1
.end method

.method public static final vehicleIsEs400(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    const-string v0, "es400"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-ne p0, v1, :cond_0

    move p1, v1

    :cond_0
    return p1
.end method

.method public static final vehicleIsEs500(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    const-string v0, "es500"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-ne p0, v1, :cond_0

    move p1, v1

    :cond_0
    return p1
.end method
