.class public final enum Lco/bird/android/model/constant/PartKind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/PartKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0012\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/model/constant/PartKind;",
        "",
        "(Ljava/lang/String;I)V",
        "CHASSIS",
        "BRAIN",
        "SIM_CARD",
        "STICKER",
        "PLATE",
        "PCM",
        "GERMAN_PLATE",
        "BATTERY_SERIAL",
        "US_CA_PLATE",
        "MOTOR",
        "BEACON",
        "IL_PLATE",
        "HELMET",
        "PHYSICAL_LOCK_STICKER",
        "BLE_MAC_ADDRESS",
        "UNKNOWN",
        "model-constant"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/PartKind;

.field public static final enum BATTERY_SERIAL:Lco/bird/android/model/constant/PartKind;

.field public static final enum BEACON:Lco/bird/android/model/constant/PartKind;

.field public static final enum BLE_MAC_ADDRESS:Lco/bird/android/model/constant/PartKind;

.field public static final enum BRAIN:Lco/bird/android/model/constant/PartKind;

.field public static final enum CHASSIS:Lco/bird/android/model/constant/PartKind;

.field public static final enum GERMAN_PLATE:Lco/bird/android/model/constant/PartKind;

.field public static final enum HELMET:Lco/bird/android/model/constant/PartKind;

.field public static final enum IL_PLATE:Lco/bird/android/model/constant/PartKind;

.field public static final enum MOTOR:Lco/bird/android/model/constant/PartKind;

.field public static final enum PCM:Lco/bird/android/model/constant/PartKind;

.field public static final enum PHYSICAL_LOCK_STICKER:Lco/bird/android/model/constant/PartKind;

.field public static final enum PLATE:Lco/bird/android/model/constant/PartKind;

.field public static final enum SIM_CARD:Lco/bird/android/model/constant/PartKind;

.field public static final enum STICKER:Lco/bird/android/model/constant/PartKind;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/PartKind;

.field public static final enum US_CA_PLATE:Lco/bird/android/model/constant/PartKind;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/PartKind;
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [Lco/bird/android/model/constant/PartKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/PartKind;->CHASSIS:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/PartKind;->BRAIN:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/PartKind;->SIM_CARD:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/PartKind;->PLATE:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/PartKind;->PCM:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/PartKind;->GERMAN_PLATE:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/constant/PartKind;->BATTERY_SERIAL:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/constant/PartKind;->US_CA_PLATE:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/constant/PartKind;->MOTOR:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/constant/PartKind;->BEACON:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/constant/PartKind;->IL_PLATE:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lco/bird/android/model/constant/PartKind;->HELMET:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lco/bird/android/model/constant/PartKind;->PHYSICAL_LOCK_STICKER:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lco/bird/android/model/constant/PartKind;->BLE_MAC_ADDRESS:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lco/bird/android/model/constant/PartKind;->UNKNOWN:Lco/bird/android/model/constant/PartKind;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "CHASSIS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->CHASSIS:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "BRAIN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->BRAIN:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "SIM_CARD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->SIM_CARD:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "STICKER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "PLATE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->PLATE:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "PCM"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->PCM:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "GERMAN_PLATE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->GERMAN_PLATE:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "BATTERY_SERIAL"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->BATTERY_SERIAL:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "US_CA_PLATE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->US_CA_PLATE:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "MOTOR"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->MOTOR:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "BEACON"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->BEACON:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "IL_PLATE"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->IL_PLATE:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "HELMET"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->HELMET:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "PHYSICAL_LOCK_STICKER"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->PHYSICAL_LOCK_STICKER:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "BLE_MAC_ADDRESS"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->BLE_MAC_ADDRESS:Lco/bird/android/model/constant/PartKind;

    new-instance v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/PartKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/PartKind;->UNKNOWN:Lco/bird/android/model/constant/PartKind;

    invoke-static {}, Lco/bird/android/model/constant/PartKind;->$values()[Lco/bird/android/model/constant/PartKind;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/PartKind;->$VALUES:[Lco/bird/android/model/constant/PartKind;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/PartKind;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/PartKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/PartKind;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/PartKind;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/PartKind;->$VALUES:[Lco/bird/android/model/constant/PartKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/PartKind;

    return-object v0
.end method
