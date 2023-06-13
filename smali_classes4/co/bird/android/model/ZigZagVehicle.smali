.class public final Lco/bird/android/model/ZigZagVehicle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008<\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00e9\u0001\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\nH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\nH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\t\u0010>\u001a\u00020\nH\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\nH\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010H\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u0010J\u001a\u00020\nH\u00c6\u0003J\u00f2\u0001\u0010K\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\n2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\n2\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0019\u001a\u00020\n2\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020\n2\u0008\u0010N\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010O\u001a\u00020\u0007H\u00d6\u0001J\t\u0010P\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\u0008!\u0010\"R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\u0008\'\u0010\"R\u001a\u0010\u000c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\u0008(\u0010\"R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\u0008)\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010&R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0016\u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010&R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\u00083\u0010\u001fR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\u001dR\u0016\u0010\u0019\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010&R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010\u001d\u00a8\u0006Q"
    }
    d2 = {
        "Lco/bird/android/model/ZigZagVehicle;",
        "",
        "address",
        "",
        "boardBatteryVoltage",
        "",
        "centerId",
        "",
        "code",
        "electricMode",
        "",
        "freeMinutes",
        "fuelLevel",
        "fuelLevelVoltage",
        "helmet",
        "helmet2",
        "id",
        "instrumentPanel",
        "internalBoxState",
        "plate",
        "position",
        "Lco/bird/android/model/ZigZagPosition;",
        "saddle",
        "scooterBatteryVoltage",
        "status",
        "topBox",
        "vehicleType",
        "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;)V",
        "getAddress",
        "()Ljava/lang/String;",
        "getBoardBatteryVoltage",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getCenterId",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getCode",
        "getElectricMode",
        "()Z",
        "getFreeMinutes",
        "getFuelLevel",
        "getFuelLevelVoltage",
        "getHelmet",
        "getHelmet2",
        "getId",
        "getInstrumentPanel",
        "getInternalBoxState",
        "getPlate",
        "getPosition",
        "()Lco/bird/android/model/ZigZagPosition;",
        "getSaddle",
        "getScooterBatteryVoltage",
        "getStatus",
        "getTopBox",
        "getVehicleType",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;)Lco/bird/android/model/ZigZagVehicle;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "model_release"
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
.field private final address:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "address"
    .end annotation

    .annotation runtime Lft5;
        value = "address"
    .end annotation
.end field

.field private final boardBatteryVoltage:Ljava/lang/Float;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "boardBatteryVoltage"
    .end annotation

    .annotation runtime Lft5;
        value = "boardBatteryVoltage"
    .end annotation
.end field

.field private final centerId:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "centerid"
    .end annotation

    .annotation runtime Lft5;
        value = "centerid"
    .end annotation
.end field

.field private final code:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "code"
    .end annotation

    .annotation runtime Lft5;
        value = "code"
    .end annotation
.end field

.field private final electricMode:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "electricmode"
    .end annotation

    .annotation runtime Lft5;
        value = "electricmode"
    .end annotation
.end field

.field private final freeMinutes:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "freeMinutes"
    .end annotation

    .annotation runtime Lft5;
        value = "freeMinutes"
    .end annotation
.end field

.field private final fuelLevel:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fuelLevel"
    .end annotation

    .annotation runtime Lft5;
        value = "fuelLevel"
    .end annotation
.end field

.field private final fuelLevelVoltage:Ljava/lang/Float;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fuelLevelVoltage"
    .end annotation

    .annotation runtime Lft5;
        value = "fuelLevelVoltage"
    .end annotation
.end field

.field private final helmet:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "helmet"
    .end annotation

    .annotation runtime Lft5;
        value = "helmet"
    .end annotation
.end field

.field private final helmet2:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "helmet2"
    .end annotation

    .annotation runtime Lft5;
        value = "helmet2"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "id"
    .end annotation

    .annotation runtime Lft5;
        value = "id"
    .end annotation
.end field

.field private final instrumentPanel:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "instrumentPanel"
    .end annotation

    .annotation runtime Lft5;
        value = "instrumentPanel"
    .end annotation
.end field

.field private final internalBoxState:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "internalBoxState"
    .end annotation

    .annotation runtime Lft5;
        value = "internalBoxState"
    .end annotation
.end field

.field private final plate:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "plate"
    .end annotation

    .annotation runtime Lft5;
        value = "plate"
    .end annotation
.end field

.field private final position:Lco/bird/android/model/ZigZagPosition;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "position"
    .end annotation

    .annotation runtime Lft5;
        value = "position"
    .end annotation
.end field

.field private final saddle:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "saddle"
    .end annotation

    .annotation runtime Lft5;
        value = "saddle"
    .end annotation
.end field

.field private final scooterBatteryVoltage:Ljava/lang/Float;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scooterBatteryVoltage"
    .end annotation

    .annotation runtime Lft5;
        value = "scooterBatteryVoltage"
    .end annotation
.end field

.field private final status:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation

    .annotation runtime Lft5;
        value = "status"
    .end annotation
.end field

.field private final topBox:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "topBox"
    .end annotation

    .annotation runtime Lft5;
        value = "topBox"
    .end annotation
.end field

.field private final vehicleType:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "vehicletype"
    .end annotation

    .annotation runtime Lft5;
        value = "vehicletype"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 23

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0xfffff

    const/16 v22, 0x0

    invoke-direct/range {v0 .. v22}, Lco/bird/android/model/ZigZagVehicle;-><init>(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->address:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->boardBatteryVoltage:Ljava/lang/Float;

    move-object v1, p3

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->centerId:Ljava/lang/Integer;

    move-object v1, p4

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->code:Ljava/lang/String;

    move v1, p5

    iput-boolean v1, v0, Lco/bird/android/model/ZigZagVehicle;->electricMode:Z

    move-object v1, p6

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->freeMinutes:Ljava/lang/Integer;

    move-object v1, p7

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->fuelLevel:Ljava/lang/Integer;

    move-object v1, p8

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->fuelLevelVoltage:Ljava/lang/Float;

    move v1, p9

    iput-boolean v1, v0, Lco/bird/android/model/ZigZagVehicle;->helmet:Z

    move v1, p10

    iput-boolean v1, v0, Lco/bird/android/model/ZigZagVehicle;->helmet2:Z

    move-object v1, p11

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->id:Ljava/lang/String;

    move v1, p12

    iput-boolean v1, v0, Lco/bird/android/model/ZigZagVehicle;->instrumentPanel:Z

    move-object v1, p13

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->internalBoxState:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->plate:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->position:Lco/bird/android/model/ZigZagPosition;

    move/from16 v1, p16

    iput-boolean v1, v0, Lco/bird/android/model/ZigZagVehicle;->saddle:Z

    move-object/from16 v1, p17

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->scooterBatteryVoltage:Ljava/lang/Float;

    move-object/from16 v1, p18

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->status:Ljava/lang/String;

    move/from16 v1, p19

    iput-boolean v1, v0, Lco/bird/android/model/ZigZagVehicle;->topBox:Z

    move-object/from16 v1, p20

    iput-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->vehicleType:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v2, p14

    :goto_d
    and-int/lit16 v7, v0, 0x4000

    if-eqz v7, :cond_e

    const/4 v7, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v7, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    const/16 v19, 0x0

    goto :goto_12

    :cond_12
    move/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v0, v0, v20

    if-eqz v0, :cond_13

    const/4 v0, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v0, p20

    :goto_13
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v13

    move/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, v2

    move-object/from16 p16, v7

    move/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    move/from16 p20, v19

    move-object/from16 p21, v0

    invoke-direct/range {p1 .. p21}, Lco/bird/android/model/ZigZagVehicle;-><init>(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/ZigZagVehicle;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/ZigZagVehicle;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/ZigZagVehicle;->address:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/ZigZagVehicle;->boardBatteryVoltage:Ljava/lang/Float;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/ZigZagVehicle;->centerId:Ljava/lang/Integer;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/ZigZagVehicle;->code:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lco/bird/android/model/ZigZagVehicle;->electricMode:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/ZigZagVehicle;->freeMinutes:Ljava/lang/Integer;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/ZigZagVehicle;->fuelLevel:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/ZigZagVehicle;->fuelLevelVoltage:Ljava/lang/Float;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lco/bird/android/model/ZigZagVehicle;->helmet:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lco/bird/android/model/ZigZagVehicle;->helmet2:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/android/model/ZigZagVehicle;->id:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lco/bird/android/model/ZigZagVehicle;->instrumentPanel:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lco/bird/android/model/ZigZagVehicle;->internalBoxState:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/ZigZagVehicle;->plate:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/ZigZagVehicle;->position:Lco/bird/android/model/ZigZagPosition;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-boolean v15, v0, Lco/bird/android/model/ZigZagVehicle;->saddle:Z

    goto :goto_f

    :cond_f
    move/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lco/bird/android/model/ZigZagVehicle;->scooterBatteryVoltage:Ljava/lang/Float;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lco/bird/android/model/ZigZagVehicle;->status:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget-boolean v15, v0, Lco/bird/android/model/ZigZagVehicle;->topBox:Z

    goto :goto_12

    :cond_12
    move/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v1, v1, v16

    if-eqz v1, :cond_13

    iget-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->vehicleType:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move-object/from16 p11, v12

    move/from16 p12, v13

    move-object/from16 p13, v14

    move/from16 p19, v15

    move-object/from16 p20, v1

    invoke-virtual/range {p0 .. p20}, Lco/bird/android/model/ZigZagVehicle;->copy(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;)Lco/bird/android/model/ZigZagVehicle;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->address:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->helmet2:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->instrumentPanel:Z

    return v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->internalBoxState:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->plate:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Lco/bird/android/model/ZigZagPosition;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->position:Lco/bird/android/model/ZigZagPosition;

    return-object v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->saddle:Z

    return v0
.end method

.method public final component17()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->scooterBatteryVoltage:Ljava/lang/Float;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->topBox:Z

    return v0
.end method

.method public final component2()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->boardBatteryVoltage:Ljava/lang/Float;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->vehicleType:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->centerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->electricMode:Z

    return v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->freeMinutes:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->fuelLevel:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->fuelLevelVoltage:Ljava/lang/Float;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->helmet:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;)Lco/bird/android/model/ZigZagVehicle;
    .locals 22

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v20, p20

    new-instance v21, Lco/bird/android/model/ZigZagVehicle;

    move-object/from16 v0, v21

    invoke-direct/range {v0 .. v20}, Lco/bird/android/model/ZigZagVehicle;-><init>(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/ZigZagPosition;ZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v21
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/ZigZagVehicle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/ZigZagVehicle;

    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->address:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->address:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->boardBatteryVoltage:Ljava/lang/Float;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->boardBatteryVoltage:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->centerId:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->centerId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->code:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->code:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/android/model/ZigZagVehicle;->electricMode:Z

    iget-boolean v3, p1, Lco/bird/android/model/ZigZagVehicle;->electricMode:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->freeMinutes:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->freeMinutes:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->fuelLevel:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->fuelLevel:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->fuelLevelVoltage:Ljava/lang/Float;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->fuelLevelVoltage:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lco/bird/android/model/ZigZagVehicle;->helmet:Z

    iget-boolean v3, p1, Lco/bird/android/model/ZigZagVehicle;->helmet:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lco/bird/android/model/ZigZagVehicle;->helmet2:Z

    iget-boolean v3, p1, Lco/bird/android/model/ZigZagVehicle;->helmet2:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lco/bird/android/model/ZigZagVehicle;->instrumentPanel:Z

    iget-boolean v3, p1, Lco/bird/android/model/ZigZagVehicle;->instrumentPanel:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->internalBoxState:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->internalBoxState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->plate:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->plate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->position:Lco/bird/android/model/ZigZagPosition;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->position:Lco/bird/android/model/ZigZagPosition;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lco/bird/android/model/ZigZagVehicle;->saddle:Z

    iget-boolean v3, p1, Lco/bird/android/model/ZigZagVehicle;->saddle:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->scooterBatteryVoltage:Ljava/lang/Float;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->scooterBatteryVoltage:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->status:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ZigZagVehicle;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lco/bird/android/model/ZigZagVehicle;->topBox:Z

    iget-boolean v3, p1, Lco/bird/android/model/ZigZagVehicle;->topBox:Z

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lco/bird/android/model/ZigZagVehicle;->vehicleType:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/ZigZagVehicle;->vehicleType:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->address:Ljava/lang/String;

    return-object v0
.end method

.method public final getBoardBatteryVoltage()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->boardBatteryVoltage:Ljava/lang/Float;

    return-object v0
.end method

.method public final getCenterId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->centerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getElectricMode()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->electricMode:Z

    return v0
.end method

.method public final getFreeMinutes()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->freeMinutes:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getFuelLevel()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->fuelLevel:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getFuelLevelVoltage()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->fuelLevelVoltage:Ljava/lang/Float;

    return-object v0
.end method

.method public final getHelmet()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->helmet:Z

    return v0
.end method

.method public final getHelmet2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->helmet2:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstrumentPanel()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->instrumentPanel:Z

    return v0
.end method

.method public final getInternalBoxState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->internalBoxState:Ljava/lang/String;

    return-object v0
.end method

.method public final getPlate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->plate:Ljava/lang/String;

    return-object v0
.end method

.method public final getPosition()Lco/bird/android/model/ZigZagPosition;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->position:Lco/bird/android/model/ZigZagPosition;

    return-object v0
.end method

.method public final getSaddle()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->saddle:Z

    return v0
.end method

.method public final getScooterBatteryVoltage()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->scooterBatteryVoltage:Ljava/lang/Float;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final getTopBox()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ZigZagVehicle;->topBox:Z

    return v0
.end method

.method public final getVehicleType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->vehicleType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/ZigZagVehicle;->address:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->boardBatteryVoltage:Ljava/lang/Float;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->centerId:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->code:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/ZigZagVehicle;->electricMode:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    move v2, v3

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->freeMinutes:Ljava/lang/Integer;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_4

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->fuelLevel:Ljava/lang/Integer;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_5

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->fuelLevelVoltage:Ljava/lang/Float;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_6

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/ZigZagVehicle;->helmet:Z

    if-eqz v2, :cond_8

    move v2, v3

    :cond_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/ZigZagVehicle;->helmet2:Z

    if-eqz v2, :cond_9

    move v2, v3

    :cond_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->id:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v1

    goto :goto_7

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/ZigZagVehicle;->instrumentPanel:Z

    if-eqz v2, :cond_b

    move v2, v3

    :cond_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->internalBoxState:Ljava/lang/String;

    if-nez v2, :cond_c

    move v2, v1

    goto :goto_8

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->plate:Ljava/lang/String;

    if-nez v2, :cond_d

    move v2, v1

    goto :goto_9

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->position:Lco/bird/android/model/ZigZagPosition;

    if-nez v2, :cond_e

    move v2, v1

    goto :goto_a

    :cond_e
    invoke-virtual {v2}, Lco/bird/android/model/ZigZagPosition;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/ZigZagVehicle;->saddle:Z

    if-eqz v2, :cond_f

    move v2, v3

    :cond_f
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->scooterBatteryVoltage:Ljava/lang/Float;

    if-nez v2, :cond_10

    move v2, v1

    goto :goto_b

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->status:Ljava/lang/String;

    if-nez v2, :cond_11

    move v2, v1

    goto :goto_c

    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/ZigZagVehicle;->topBox:Z

    if-eqz v2, :cond_12

    goto :goto_d

    :cond_12
    move v3, v2

    :goto_d
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/ZigZagVehicle;->vehicleType:Ljava/lang/String;

    if-nez v2, :cond_13

    goto :goto_e

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/ZigZagVehicle;->address:Ljava/lang/String;

    iget-object v2, v0, Lco/bird/android/model/ZigZagVehicle;->boardBatteryVoltage:Ljava/lang/Float;

    iget-object v3, v0, Lco/bird/android/model/ZigZagVehicle;->centerId:Ljava/lang/Integer;

    iget-object v4, v0, Lco/bird/android/model/ZigZagVehicle;->code:Ljava/lang/String;

    iget-boolean v5, v0, Lco/bird/android/model/ZigZagVehicle;->electricMode:Z

    iget-object v6, v0, Lco/bird/android/model/ZigZagVehicle;->freeMinutes:Ljava/lang/Integer;

    iget-object v7, v0, Lco/bird/android/model/ZigZagVehicle;->fuelLevel:Ljava/lang/Integer;

    iget-object v8, v0, Lco/bird/android/model/ZigZagVehicle;->fuelLevelVoltage:Ljava/lang/Float;

    iget-boolean v9, v0, Lco/bird/android/model/ZigZagVehicle;->helmet:Z

    iget-boolean v10, v0, Lco/bird/android/model/ZigZagVehicle;->helmet2:Z

    iget-object v11, v0, Lco/bird/android/model/ZigZagVehicle;->id:Ljava/lang/String;

    iget-boolean v12, v0, Lco/bird/android/model/ZigZagVehicle;->instrumentPanel:Z

    iget-object v13, v0, Lco/bird/android/model/ZigZagVehicle;->internalBoxState:Ljava/lang/String;

    iget-object v14, v0, Lco/bird/android/model/ZigZagVehicle;->plate:Ljava/lang/String;

    iget-object v15, v0, Lco/bird/android/model/ZigZagVehicle;->position:Lco/bird/android/model/ZigZagPosition;

    move-object/from16 v16, v15

    iget-boolean v15, v0, Lco/bird/android/model/ZigZagVehicle;->saddle:Z

    move/from16 v17, v15

    iget-object v15, v0, Lco/bird/android/model/ZigZagVehicle;->scooterBatteryVoltage:Ljava/lang/Float;

    move-object/from16 v18, v15

    iget-object v15, v0, Lco/bird/android/model/ZigZagVehicle;->status:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-boolean v15, v0, Lco/bird/android/model/ZigZagVehicle;->topBox:Z

    move/from16 v20, v15

    iget-object v15, v0, Lco/bird/android/model/ZigZagVehicle;->vehicleType:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v21, v15

    const-string v15, "ZigZagVehicle(address="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", boardBatteryVoltage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", centerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", electricMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", freeMinutes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fuelLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fuelLevelVoltage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", helmet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", helmet2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", instrumentPanel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", internalBoxState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", plate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", saddle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", scooterBatteryVoltage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", topBox="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", vehicleType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
