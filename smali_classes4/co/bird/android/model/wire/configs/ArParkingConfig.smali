.class public final Lco/bird/android/model/wire/configs/ArParkingConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/ArParkingConfig;",
        "",
        "scan",
        "Lco/bird/android/model/wire/configs/ArParkingScanConfig;",
        "debug",
        "",
        "rawData",
        "(Lco/bird/android/model/wire/configs/ArParkingScanConfig;ZZ)V",
        "getDebug",
        "()Z",
        "getRawData",
        "getScan",
        "()Lco/bird/android/model/wire/configs/ArParkingScanConfig;",
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
.field private final debug:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "_debug"
    .end annotation

    .annotation runtime Lft5;
        value = "_debug"
    .end annotation
.end field

.field private final rawData:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "raw_data"
    .end annotation

    .annotation runtime Lft5;
        value = "raw_data"
    .end annotation
.end field

.field private final scan:Lco/bird/android/model/wire/configs/ArParkingScanConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scan"
    .end annotation

    .annotation runtime Lft5;
        value = "scan"
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

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/configs/ArParkingConfig;-><init>(Lco/bird/android/model/wire/configs/ArParkingScanConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/configs/ArParkingScanConfig;ZZ)V
    .locals 1

    const-string v0, "scan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->scan:Lco/bird/android/model/wire/configs/ArParkingScanConfig;

    iput-boolean p2, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->debug:Z

    iput-boolean p3, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->rawData:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/configs/ArParkingScanConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p5, :cond_0

    new-instance p1, Lco/bird/android/model/wire/configs/ArParkingScanConfig;

    const/4 p5, 0x0

    invoke-direct {p1, v0, v1, p5}, Lco/bird/android/model/wire/configs/ArParkingScanConfig;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v1

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/configs/ArParkingConfig;-><init>(Lco/bird/android/model/wire/configs/ArParkingScanConfig;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/ArParkingConfig;Lco/bird/android/model/wire/configs/ArParkingScanConfig;ZZILjava/lang/Object;)Lco/bird/android/model/wire/configs/ArParkingConfig;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->scan:Lco/bird/android/model/wire/configs/ArParkingScanConfig;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->debug:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->rawData:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/configs/ArParkingConfig;->copy(Lco/bird/android/model/wire/configs/ArParkingScanConfig;ZZ)Lco/bird/android/model/wire/configs/ArParkingConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/configs/ArParkingScanConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->scan:Lco/bird/android/model/wire/configs/ArParkingScanConfig;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->debug:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->rawData:Z

    return v0
.end method

.method public final copy(Lco/bird/android/model/wire/configs/ArParkingScanConfig;ZZ)Lco/bird/android/model/wire/configs/ArParkingConfig;
    .locals 1

    const-string v0, "scan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/ArParkingConfig;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/configs/ArParkingConfig;-><init>(Lco/bird/android/model/wire/configs/ArParkingScanConfig;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/ArParkingConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/ArParkingConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->scan:Lco/bird/android/model/wire/configs/ArParkingScanConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ArParkingConfig;->scan:Lco/bird/android/model/wire/configs/ArParkingScanConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->debug:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/ArParkingConfig;->debug:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->rawData:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/ArParkingConfig;->rawData:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDebug()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->debug:Z

    return v0
.end method

.method public final getRawData()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->rawData:Z

    return v0
.end method

.method public final getScan()Lco/bird/android/model/wire/configs/ArParkingScanConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->scan:Lco/bird/android/model/wire/configs/ArParkingScanConfig;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->scan:Lco/bird/android/model/wire/configs/ArParkingScanConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ArParkingScanConfig;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->debug:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->rawData:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->scan:Lco/bird/android/model/wire/configs/ArParkingScanConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->debug:Z

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/ArParkingConfig;->rawData:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ArParkingConfig(scan="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", debug="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", rawData="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
