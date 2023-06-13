.class public final Lco/bird/android/model/wire/configs/BountyConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/BountyConfig;",
        "",
        "currency",
        "",
        "chargerPowerSupplyDepositAmount",
        "",
        "bountyFilterPriceMax",
        "bountyFilterPriceStep",
        "(Ljava/lang/String;JJJ)V",
        "getBountyFilterPriceMax",
        "()J",
        "getBountyFilterPriceStep",
        "getChargerPowerSupplyDepositAmount",
        "getCurrency",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final bountyFilterPriceMax:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bounty_filter_price_max"
    .end annotation

    .annotation runtime Lft5;
        value = "bounty_filter_price_max"
    .end annotation
.end field

.field private final bountyFilterPriceStep:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bounty_filter_price_step"
    .end annotation

    .annotation runtime Lft5;
        value = "bounty_filter_price_step"
    .end annotation
.end field

.field private final chargerPowerSupplyDepositAmount:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "charger_power_supply_deposit_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "charger_power_supply_deposit_amount"
    .end annotation
.end field

.field private final currency:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "currency"
    .end annotation

    .annotation runtime Lft5;
        value = "currency"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/16 v8, 0xf

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lco/bird/android/model/wire/configs/BountyConfig;-><init>(Ljava/lang/String;JJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JJJ)V
    .locals 1

    const-string v0, "currency"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/configs/BountyConfig;->currency:Ljava/lang/String;

    iput-wide p2, p0, Lco/bird/android/model/wire/configs/BountyConfig;->chargerPowerSupplyDepositAmount:J

    iput-wide p4, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceMax:J

    iput-wide p6, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceStep:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    const-string p1, "usd"

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    const-wide/16 p2, 0x3e8

    :cond_1
    move-wide v0, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    const-wide/16 p4, 0x7d0

    :cond_2
    move-wide v2, p4

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    const-wide/16 p6, 0x64

    :cond_3
    move-wide p8, p6

    move-object p2, p0

    move-object p3, p1

    move-wide p4, v0

    move-wide p6, v2

    invoke-direct/range {p2 .. p9}, Lco/bird/android/model/wire/configs/BountyConfig;-><init>(Ljava/lang/String;JJJ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/BountyConfig;Ljava/lang/String;JJJILjava/lang/Object;)Lco/bird/android/model/wire/configs/BountyConfig;
    .locals 4

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/configs/BountyConfig;->currency:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-wide p2, p0, Lco/bird/android/model/wire/configs/BountyConfig;->chargerPowerSupplyDepositAmount:J

    :cond_1
    move-wide v0, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-wide p4, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceMax:J

    :cond_2
    move-wide v2, p4

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-wide p6, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceStep:J

    :cond_3
    move-wide p8, p6

    move-object p2, p0

    move-object p3, p1

    move-wide p4, v0

    move-wide p6, v2

    invoke-virtual/range {p2 .. p9}, Lco/bird/android/model/wire/configs/BountyConfig;->copy(Ljava/lang/String;JJJ)Lco/bird/android/model/wire/configs/BountyConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BountyConfig;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/BountyConfig;->chargerPowerSupplyDepositAmount:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceMax:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceStep:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;JJJ)Lco/bird/android/model/wire/configs/BountyConfig;
    .locals 9

    const-string v0, "currency"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/BountyConfig;

    move-object v1, v0

    move-wide v3, p2

    move-wide v5, p4

    move-wide v7, p6

    invoke-direct/range {v1 .. v8}, Lco/bird/android/model/wire/configs/BountyConfig;-><init>(Ljava/lang/String;JJJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/BountyConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/BountyConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/BountyConfig;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/BountyConfig;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/BountyConfig;->chargerPowerSupplyDepositAmount:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/BountyConfig;->chargerPowerSupplyDepositAmount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceMax:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceMax:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceStep:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceStep:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBountyFilterPriceMax()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceMax:J

    return-wide v0
.end method

.method public final getBountyFilterPriceStep()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceStep:J

    return-wide v0
.end method

.method public final getChargerPowerSupplyDepositAmount()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/BountyConfig;->chargerPowerSupplyDepositAmount:J

    return-wide v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BountyConfig;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BountyConfig;->currency:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/BountyConfig;->chargerPowerSupplyDepositAmount:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceMax:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceStep:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BountyConfig;->currency:Ljava/lang/String;

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/BountyConfig;->chargerPowerSupplyDepositAmount:J

    iget-wide v3, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceMax:J

    iget-wide v5, p0, Lco/bird/android/model/wire/configs/BountyConfig;->bountyFilterPriceStep:J

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "BountyConfig(currency="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", chargerPowerSupplyDepositAmount="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", bountyFilterPriceMax="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", bountyFilterPriceStep="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
