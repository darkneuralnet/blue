.class public final Lco/bird/android/model/wire/configs/PricingUiConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/PricingUiConfig;",
        "",
        "enabled",
        "",
        "enableScannerTapToSeePricing",
        "flightBarPricing",
        "Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;",
        "(ZZLco/bird/android/model/wire/configs/PricingUiFlightBarConfig;)V",
        "getEnableScannerTapToSeePricing",
        "()Z",
        "getEnabled",
        "getFlightBarPricing",
        "()Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
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


# instance fields
.field private final enableScannerTapToSeePricing:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_scanner_tap_to_see_pricing"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_scanner_tap_to_see_pricing"
    .end annotation
.end field

.field private final enabled:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enabled"
    .end annotation

    .annotation runtime Lft5;
        value = "enabled"
    .end annotation
.end field

.field private final flightBarPricing:Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "flight_bar_pricing"
    .end annotation

    .annotation runtime Lft5;
        value = "flight_bar_pricing"
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

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/configs/PricingUiConfig;-><init>(ZZLco/bird/android/model/wire/configs/PricingUiFlightBarConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZLco/bird/android/model/wire/configs/PricingUiFlightBarConfig;)V
    .locals 1

    const-string v0, "flightBarPricing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enabled:Z

    iput-boolean p2, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enableScannerTapToSeePricing:Z

    iput-object p3, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->flightBarPricing:Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    return-void
.end method

.method public synthetic constructor <init>(ZZLco/bird/android/model/wire/configs/PricingUiFlightBarConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

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

    new-instance p3, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;-><init>(ZILco/bird/android/model/wire/configs/RideCostMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/configs/PricingUiConfig;-><init>(ZZLco/bird/android/model/wire/configs/PricingUiFlightBarConfig;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/PricingUiConfig;ZZLco/bird/android/model/wire/configs/PricingUiFlightBarConfig;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/PricingUiConfig;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enabled:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enableScannerTapToSeePricing:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->flightBarPricing:Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/configs/PricingUiConfig;->copy(ZZLco/bird/android/model/wire/configs/PricingUiFlightBarConfig;)Lco/bird/android/model/wire/configs/PricingUiConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enabled:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enableScannerTapToSeePricing:Z

    return v0
.end method

.method public final component3()Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->flightBarPricing:Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    return-object v0
.end method

.method public final copy(ZZLco/bird/android/model/wire/configs/PricingUiFlightBarConfig;)Lco/bird/android/model/wire/configs/PricingUiConfig;
    .locals 1

    const-string v0, "flightBarPricing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/PricingUiConfig;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/configs/PricingUiConfig;-><init>(ZZLco/bird/android/model/wire/configs/PricingUiFlightBarConfig;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/PricingUiConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/PricingUiConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enabled:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/PricingUiConfig;->enabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enableScannerTapToSeePricing:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/PricingUiConfig;->enableScannerTapToSeePricing:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->flightBarPricing:Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/PricingUiConfig;->flightBarPricing:Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEnableScannerTapToSeePricing()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enableScannerTapToSeePricing:Z

    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enabled:Z

    return v0
.end method

.method public final getFlightBarPricing()Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->flightBarPricing:Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enabled:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enableScannerTapToSeePricing:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->flightBarPricing:Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enabled:Z

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->enableScannerTapToSeePricing:Z

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PricingUiConfig;->flightBarPricing:Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "PricingUiConfig(enabled="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableScannerTapToSeePricing="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", flightBarPricing="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
