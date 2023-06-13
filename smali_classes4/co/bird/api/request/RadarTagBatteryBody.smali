.class public final Lco/bird/api/request/RadarTagBatteryBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/api/request/RadarTagBatteryBody;",
        "",
        "charge",
        "",
        "temperature",
        "voltage",
        "(III)V",
        "getCharge",
        "()I",
        "getTemperature",
        "getVoltage",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "co.bird.android.api"
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
.field private final charge:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "charge"
    .end annotation

    .annotation runtime Lft5;
        value = "charge"
    .end annotation
.end field

.field private final temperature:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "temperature"
    .end annotation

    .annotation runtime Lft5;
        value = "temperature"
    .end annotation
.end field

.field private final voltage:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "voltage"
    .end annotation

    .annotation runtime Lft5;
        value = "voltage"
    .end annotation
.end field


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lco/bird/api/request/RadarTagBatteryBody;->charge:I

    iput p2, p0, Lco/bird/api/request/RadarTagBatteryBody;->temperature:I

    iput p3, p0, Lco/bird/api/request/RadarTagBatteryBody;->voltage:I

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/RadarTagBatteryBody;IIIILjava/lang/Object;)Lco/bird/api/request/RadarTagBatteryBody;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lco/bird/api/request/RadarTagBatteryBody;->charge:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lco/bird/api/request/RadarTagBatteryBody;->temperature:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lco/bird/api/request/RadarTagBatteryBody;->voltage:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/request/RadarTagBatteryBody;->copy(III)Lco/bird/api/request/RadarTagBatteryBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagBatteryBody;->charge:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagBatteryBody;->temperature:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagBatteryBody;->voltage:I

    return v0
.end method

.method public final copy(III)Lco/bird/api/request/RadarTagBatteryBody;
    .locals 1

    new-instance v0, Lco/bird/api/request/RadarTagBatteryBody;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/request/RadarTagBatteryBody;-><init>(III)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/RadarTagBatteryBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/RadarTagBatteryBody;

    iget v1, p0, Lco/bird/api/request/RadarTagBatteryBody;->charge:I

    iget v3, p1, Lco/bird/api/request/RadarTagBatteryBody;->charge:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/api/request/RadarTagBatteryBody;->temperature:I

    iget v3, p1, Lco/bird/api/request/RadarTagBatteryBody;->temperature:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/api/request/RadarTagBatteryBody;->voltage:I

    iget p1, p1, Lco/bird/api/request/RadarTagBatteryBody;->voltage:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCharge()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagBatteryBody;->charge:I

    return v0
.end method

.method public final getTemperature()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagBatteryBody;->temperature:I

    return v0
.end method

.method public final getVoltage()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagBatteryBody;->voltage:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lco/bird/api/request/RadarTagBatteryBody;->charge:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/request/RadarTagBatteryBody;->temperature:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/request/RadarTagBatteryBody;->voltage:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lco/bird/api/request/RadarTagBatteryBody;->charge:I

    iget v1, p0, Lco/bird/api/request/RadarTagBatteryBody;->temperature:I

    iget v2, p0, Lco/bird/api/request/RadarTagBatteryBody;->voltage:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RadarTagBatteryBody(charge="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", temperature="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", voltage="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
