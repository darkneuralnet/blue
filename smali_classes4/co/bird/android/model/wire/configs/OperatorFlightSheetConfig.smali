.class public final Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;",
        "",
        "enableFlightSheet",
        "",
        "version",
        "Lco/bird/android/model/constant/FlightSheetVersion;",
        "(ZLco/bird/android/model/constant/FlightSheetVersion;)V",
        "getEnableFlightSheet",
        "()Z",
        "getVersion",
        "()Lco/bird/android/model/constant/FlightSheetVersion;",
        "component1",
        "component2",
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
.field private final enableFlightSheet:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_flight_sheet"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_flight_sheet"
    .end annotation
.end field

.field private final version:Lco/bird/android/model/constant/FlightSheetVersion;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "version"
    .end annotation

    .annotation runtime Lft5;
        value = "version"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;-><init>(ZLco/bird/android/model/constant/FlightSheetVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLco/bird/android/model/constant/FlightSheetVersion;)V
    .locals 1

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->enableFlightSheet:Z

    iput-object p2, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->version:Lco/bird/android/model/constant/FlightSheetVersion;

    return-void
.end method

.method public synthetic constructor <init>(ZLco/bird/android/model/constant/FlightSheetVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Lco/bird/android/model/constant/FlightSheetVersion;->UNKNOWN:Lco/bird/android/model/constant/FlightSheetVersion;

    :cond_1
    invoke-direct {p0, p1, p2}, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;-><init>(ZLco/bird/android/model/constant/FlightSheetVersion;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;ZLco/bird/android/model/constant/FlightSheetVersion;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->enableFlightSheet:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->version:Lco/bird/android/model/constant/FlightSheetVersion;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->copy(ZLco/bird/android/model/constant/FlightSheetVersion;)Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->enableFlightSheet:Z

    return v0
.end method

.method public final component2()Lco/bird/android/model/constant/FlightSheetVersion;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->version:Lco/bird/android/model/constant/FlightSheetVersion;

    return-object v0
.end method

.method public final copy(ZLco/bird/android/model/constant/FlightSheetVersion;)Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;
    .locals 1

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;-><init>(ZLco/bird/android/model/constant/FlightSheetVersion;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->enableFlightSheet:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->enableFlightSheet:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->version:Lco/bird/android/model/constant/FlightSheetVersion;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->version:Lco/bird/android/model/constant/FlightSheetVersion;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getEnableFlightSheet()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->enableFlightSheet:Z

    return v0
.end method

.method public final getVersion()Lco/bird/android/model/constant/FlightSheetVersion;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->version:Lco/bird/android/model/constant/FlightSheetVersion;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->enableFlightSheet:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->version:Lco/bird/android/model/constant/FlightSheetVersion;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->enableFlightSheet:Z

    iget-object v1, p0, Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;->version:Lco/bird/android/model/constant/FlightSheetVersion;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OperatorFlightSheetConfig(enableFlightSheet="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", version="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
