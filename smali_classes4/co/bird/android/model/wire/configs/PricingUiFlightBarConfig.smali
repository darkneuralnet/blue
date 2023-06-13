.class public final Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;",
        "",
        "showRidePriceInBanners",
        "",
        "bannerRidePriceMaxNumberOfLines",
        "",
        "rideCostMode",
        "Lco/bird/android/model/wire/configs/RideCostMode;",
        "(ZILco/bird/android/model/wire/configs/RideCostMode;)V",
        "androidSpecificBannerRidePriceMaxNumberOfLines",
        "getAndroidSpecificBannerRidePriceMaxNumberOfLines",
        "()I",
        "getBannerRidePriceMaxNumberOfLines",
        "getRideCostMode",
        "()Lco/bird/android/model/wire/configs/RideCostMode;",
        "getShowRidePriceInBanners",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "model-wire_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPricingUiFlightBarConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PricingUiFlightBarConfig.kt\nco/bird/android/model/wire/configs/PricingUiFlightBarConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"
    }
.end annotation


# instance fields
.field private final androidSpecificBannerRidePriceMaxNumberOfLines:I

.field private final bannerRidePriceMaxNumberOfLines:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "number_of_lines"
    .end annotation

    .annotation runtime Lft5;
        value = "number_of_lines"
    .end annotation
.end field

.field private final rideCostMode:Lco/bird/android/model/wire/configs/RideCostMode;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ride_cost_mode"
    .end annotation

    .annotation runtime Lft5;
        value = "ride_cost_mode"
    .end annotation
.end field

.field private final showRidePriceInBanners:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enabled"
    .end annotation

    .annotation runtime Lft5;
        value = "enabled"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;-><init>(ZILco/bird/android/model/wire/configs/RideCostMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZILco/bird/android/model/wire/configs/RideCostMode;)V
    .locals 1

    const-string v0, "rideCostMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->showRidePriceInBanners:Z

    iput p2, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->bannerRidePriceMaxNumberOfLines:I

    iput-object p3, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->rideCostMode:Lco/bird/android/model/wire/configs/RideCostMode;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_2
    const p1, 0x7fffffff

    :goto_2
    iput p1, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->androidSpecificBannerRidePriceMaxNumberOfLines:I

    return-void
.end method

.method public synthetic constructor <init>(ZILco/bird/android/model/wire/configs/RideCostMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p3, Lco/bird/android/model/wire/configs/RideCostMode;->UNKNOWN:Lco/bird/android/model/wire/configs/RideCostMode;

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;-><init>(ZILco/bird/android/model/wire/configs/RideCostMode;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;ZILco/bird/android/model/wire/configs/RideCostMode;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->showRidePriceInBanners:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->bannerRidePriceMaxNumberOfLines:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->rideCostMode:Lco/bird/android/model/wire/configs/RideCostMode;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->copy(ZILco/bird/android/model/wire/configs/RideCostMode;)Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->showRidePriceInBanners:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->bannerRidePriceMaxNumberOfLines:I

    return v0
.end method

.method public final component3()Lco/bird/android/model/wire/configs/RideCostMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->rideCostMode:Lco/bird/android/model/wire/configs/RideCostMode;

    return-object v0
.end method

.method public final copy(ZILco/bird/android/model/wire/configs/RideCostMode;)Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;
    .locals 1

    const-string v0, "rideCostMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;-><init>(ZILco/bird/android/model/wire/configs/RideCostMode;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->showRidePriceInBanners:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->showRidePriceInBanners:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->bannerRidePriceMaxNumberOfLines:I

    iget v3, p1, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->bannerRidePriceMaxNumberOfLines:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->rideCostMode:Lco/bird/android/model/wire/configs/RideCostMode;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->rideCostMode:Lco/bird/android/model/wire/configs/RideCostMode;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAndroidSpecificBannerRidePriceMaxNumberOfLines()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->androidSpecificBannerRidePriceMaxNumberOfLines:I

    return v0
.end method

.method public final getBannerRidePriceMaxNumberOfLines()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->bannerRidePriceMaxNumberOfLines:I

    return v0
.end method

.method public final getRideCostMode()Lco/bird/android/model/wire/configs/RideCostMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->rideCostMode:Lco/bird/android/model/wire/configs/RideCostMode;

    return-object v0
.end method

.method public final getShowRidePriceInBanners()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->showRidePriceInBanners:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->showRidePriceInBanners:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->bannerRidePriceMaxNumberOfLines:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->rideCostMode:Lco/bird/android/model/wire/configs/RideCostMode;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->showRidePriceInBanners:Z

    iget v1, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->bannerRidePriceMaxNumberOfLines:I

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->rideCostMode:Lco/bird/android/model/wire/configs/RideCostMode;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "PricingUiFlightBarConfig(showRidePriceInBanners="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", bannerRidePriceMaxNumberOfLines="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", rideCostMode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
