.class public final enum Lco/bird/android/model/IssueKind;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/IssueKind;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\'\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0005H\u00d6\u0001j\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(j\u0002\u0008)j\u0002\u0008*j\u0002\u0008+j\u0002\u0008,j\u0002\u0008-j\u0002\u0008.j\u0002\u0008/j\u0002\u00080j\u0002\u00081\u00a8\u00062"
    }
    d2 = {
        "Lco/bird/android/model/IssueKind;",
        "",
        "Landroid/os/Parcelable;",
        "(Ljava/lang/String;I)V",
        "describeContents",
        "",
        "displayName",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "FLAT_TIRE",
        "BRAKE",
        "MOTOR",
        "NOISE",
        "UNLOCK",
        "LOCK",
        "HANDLEBARS",
        "SHAFT",
        "HEADLIGHTS",
        "BROKEN",
        "MISSING",
        "SLOW",
        "PHYSICAL_LOCK",
        "PHYSICAL_LOCK_MISSING",
        "DAMAGED_BRAIN",
        "NEEDS_PARTS",
        "TOO_DAMAGED",
        "WONT_STOP",
        "BUMPY",
        "SHAKY",
        "WONT_START",
        "TEST_RIDE_SLOW",
        "BRAKES",
        "BRAIN",
        "CUT_WIRES",
        "BELL",
        "WHEEL",
        "LIGHTS_OFF",
        "SCREWS",
        "THROTTLE",
        "QR_CODE",
        "OFFLINE",
        "KICKSTAND",
        "FENDER",
        "BLUETOOTH_CONNECTION",
        "BLUETOOTH_COMMUNICATION",
        "OTHER",
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


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/IssueKind;

.field public static final enum BELL:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bell"
    .end annotation

    .annotation runtime Lft5;
        value = "bell"
    .end annotation
.end field

.field public static final enum BLUETOOTH_COMMUNICATION:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bluetooth_communication"
    .end annotation

    .annotation runtime Lft5;
        value = "bluetooth_communication"
    .end annotation
.end field

.field public static final enum BLUETOOTH_CONNECTION:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bluetooth_connection"
    .end annotation

    .annotation runtime Lft5;
        value = "bluetooth_connection"
    .end annotation
.end field

.field public static final enum BRAIN:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "brain"
    .end annotation

    .annotation runtime Lft5;
        value = "brain"
    .end annotation
.end field

.field public static final enum BRAKE:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "brake"
    .end annotation

    .annotation runtime Lft5;
        value = "brake"
    .end annotation
.end field

.field public static final enum BRAKES:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "brakes"
    .end annotation

    .annotation runtime Lft5;
        value = "brakes"
    .end annotation
.end field

.field public static final enum BROKEN:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "broken"
    .end annotation

    .annotation runtime Lft5;
        value = "broken"
    .end annotation
.end field

.field public static final enum BUMPY:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bumpy"
    .end annotation

    .annotation runtime Lft5;
        value = "bumpy"
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/IssueKind;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum CUT_WIRES:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "cut_wires"
    .end annotation

    .annotation runtime Lft5;
        value = "cut_wires"
    .end annotation
.end field

.field public static final enum DAMAGED_BRAIN:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "damaged_brain"
    .end annotation

    .annotation runtime Lft5;
        value = "damaged_brain"
    .end annotation
.end field

.field public static final enum FENDER:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fender"
    .end annotation

    .annotation runtime Lft5;
        value = "fender"
    .end annotation
.end field

.field public static final enum FLAT_TIRE:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "flat_tire"
    .end annotation

    .annotation runtime Lft5;
        value = "flat_tire"
    .end annotation
.end field

.field public static final enum HANDLEBARS:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "handlebars"
    .end annotation

    .annotation runtime Lft5;
        value = "handlebars"
    .end annotation
.end field

.field public static final enum HEADLIGHTS:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "headlights"
    .end annotation

    .annotation runtime Lft5;
        value = "headlights"
    .end annotation
.end field

.field public static final enum KICKSTAND:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "kickstand"
    .end annotation

    .annotation runtime Lft5;
        value = "kickstand"
    .end annotation
.end field

.field public static final enum LIGHTS_OFF:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lights_off"
    .end annotation

    .annotation runtime Lft5;
        value = "lights_off"
    .end annotation
.end field

.field public static final enum LOCK:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lock"
    .end annotation

    .annotation runtime Lft5;
        value = "lock"
    .end annotation
.end field

.field public static final enum MISSING:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "missing"
    .end annotation

    .annotation runtime Lft5;
        value = "missing"
    .end annotation
.end field

.field public static final enum MOTOR:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "motor"
    .end annotation

    .annotation runtime Lft5;
        value = "motor"
    .end annotation
.end field

.field public static final enum NEEDS_PARTS:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "needs_parts"
    .end annotation

    .annotation runtime Lft5;
        value = "needs_parts"
    .end annotation
.end field

.field public static final enum NOISE:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "noise"
    .end annotation

    .annotation runtime Lft5;
        value = "noise"
    .end annotation
.end field

.field public static final enum OFFLINE:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "offline"
    .end annotation

    .annotation runtime Lft5;
        value = "offline"
    .end annotation
.end field

.field public static final enum OTHER:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "other"
    .end annotation

    .annotation runtime Lft5;
        value = "other"
    .end annotation
.end field

.field public static final enum PHYSICAL_LOCK:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "physical_lock"
    .end annotation

    .annotation runtime Lft5;
        value = "physical_lock"
    .end annotation
.end field

.field public static final enum PHYSICAL_LOCK_MISSING:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "physical_lock_missing"
    .end annotation

    .annotation runtime Lft5;
        value = "physical_lock_missing"
    .end annotation
.end field

.field public static final enum QR_CODE:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "qr_code"
    .end annotation

    .annotation runtime Lft5;
        value = "qr_code"
    .end annotation
.end field

.field public static final enum SCREWS:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "screws"
    .end annotation

    .annotation runtime Lft5;
        value = "screws"
    .end annotation
.end field

.field public static final enum SHAFT:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "shaft"
    .end annotation

    .annotation runtime Lft5;
        value = "shaft"
    .end annotation
.end field

.field public static final enum SHAKY:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "shaky"
    .end annotation

    .annotation runtime Lft5;
        value = "shaky"
    .end annotation
.end field

.field public static final enum SLOW:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "slow"
    .end annotation

    .annotation runtime Lft5;
        value = "slow"
    .end annotation
.end field

.field public static final enum TEST_RIDE_SLOW:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "test_ride_slow"
    .end annotation

    .annotation runtime Lft5;
        value = "test_ride_slow"
    .end annotation
.end field

.field public static final enum THROTTLE:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "throttle"
    .end annotation

    .annotation runtime Lft5;
        value = "throttle"
    .end annotation
.end field

.field public static final enum TOO_DAMAGED:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "too_damaged"
    .end annotation

    .annotation runtime Lft5;
        value = "too_damaged"
    .end annotation
.end field

.field public static final enum UNLOCK:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "unlock"
    .end annotation

    .annotation runtime Lft5;
        value = "unlock"
    .end annotation
.end field

.field public static final enum WHEEL:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "wheel"
    .end annotation

    .annotation runtime Lft5;
        value = "wheel"
    .end annotation
.end field

.field public static final enum WONT_START:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "wont_start"
    .end annotation

    .annotation runtime Lft5;
        value = "wont_start"
    .end annotation
.end field

.field public static final enum WONT_STOP:Lco/bird/android/model/IssueKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "wont_stop"
    .end annotation

    .annotation runtime Lft5;
        value = "wont_stop"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/IssueKind;
    .locals 3

    const/16 v0, 0x25

    new-array v0, v0, [Lco/bird/android/model/IssueKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/IssueKind;->FLAT_TIRE:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/IssueKind;->BRAKE:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/IssueKind;->MOTOR:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/IssueKind;->NOISE:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/IssueKind;->UNLOCK:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/IssueKind;->LOCK:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/IssueKind;->HANDLEBARS:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/IssueKind;->SHAFT:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/IssueKind;->HEADLIGHTS:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/IssueKind;->BROKEN:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/IssueKind;->MISSING:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/IssueKind;->SLOW:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lco/bird/android/model/IssueKind;->PHYSICAL_LOCK:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lco/bird/android/model/IssueKind;->PHYSICAL_LOCK_MISSING:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lco/bird/android/model/IssueKind;->DAMAGED_BRAIN:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lco/bird/android/model/IssueKind;->NEEDS_PARTS:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lco/bird/android/model/IssueKind;->TOO_DAMAGED:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lco/bird/android/model/IssueKind;->WONT_STOP:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lco/bird/android/model/IssueKind;->BUMPY:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lco/bird/android/model/IssueKind;->SHAKY:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lco/bird/android/model/IssueKind;->WONT_START:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lco/bird/android/model/IssueKind;->TEST_RIDE_SLOW:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lco/bird/android/model/IssueKind;->BRAKES:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x17

    sget-object v2, Lco/bird/android/model/IssueKind;->BRAIN:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x18

    sget-object v2, Lco/bird/android/model/IssueKind;->CUT_WIRES:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x19

    sget-object v2, Lco/bird/android/model/IssueKind;->BELL:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    sget-object v2, Lco/bird/android/model/IssueKind;->WHEEL:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    sget-object v2, Lco/bird/android/model/IssueKind;->LIGHTS_OFF:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    sget-object v2, Lco/bird/android/model/IssueKind;->SCREWS:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    sget-object v2, Lco/bird/android/model/IssueKind;->THROTTLE:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    sget-object v2, Lco/bird/android/model/IssueKind;->QR_CODE:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    sget-object v2, Lco/bird/android/model/IssueKind;->OFFLINE:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x20

    sget-object v2, Lco/bird/android/model/IssueKind;->KICKSTAND:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x21

    sget-object v2, Lco/bird/android/model/IssueKind;->FENDER:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x22

    sget-object v2, Lco/bird/android/model/IssueKind;->BLUETOOTH_CONNECTION:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x23

    sget-object v2, Lco/bird/android/model/IssueKind;->BLUETOOTH_COMMUNICATION:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    const/16 v1, 0x24

    sget-object v2, Lco/bird/android/model/IssueKind;->OTHER:Lco/bird/android/model/IssueKind;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "FLAT_TIRE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->FLAT_TIRE:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "BRAKE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->BRAKE:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "MOTOR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->MOTOR:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "NOISE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->NOISE:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "UNLOCK"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->UNLOCK:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "LOCK"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->LOCK:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "HANDLEBARS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->HANDLEBARS:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "SHAFT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->SHAFT:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "HEADLIGHTS"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->HEADLIGHTS:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "BROKEN"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->BROKEN:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "MISSING"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->MISSING:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "SLOW"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->SLOW:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "PHYSICAL_LOCK"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->PHYSICAL_LOCK:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "PHYSICAL_LOCK_MISSING"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->PHYSICAL_LOCK_MISSING:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "DAMAGED_BRAIN"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->DAMAGED_BRAIN:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "NEEDS_PARTS"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->NEEDS_PARTS:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "TOO_DAMAGED"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->TOO_DAMAGED:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "WONT_STOP"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->WONT_STOP:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "BUMPY"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->BUMPY:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "SHAKY"

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->SHAKY:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "WONT_START"

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->WONT_START:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "TEST_RIDE_SLOW"

    const/16 v2, 0x15

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->TEST_RIDE_SLOW:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "BRAKES"

    const/16 v2, 0x16

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->BRAKES:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "BRAIN"

    const/16 v2, 0x17

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->BRAIN:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "CUT_WIRES"

    const/16 v2, 0x18

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->CUT_WIRES:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "BELL"

    const/16 v2, 0x19

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->BELL:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "WHEEL"

    const/16 v2, 0x1a

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->WHEEL:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "LIGHTS_OFF"

    const/16 v2, 0x1b

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->LIGHTS_OFF:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "SCREWS"

    const/16 v2, 0x1c

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->SCREWS:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "THROTTLE"

    const/16 v2, 0x1d

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->THROTTLE:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "QR_CODE"

    const/16 v2, 0x1e

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->QR_CODE:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "OFFLINE"

    const/16 v2, 0x1f

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->OFFLINE:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "KICKSTAND"

    const/16 v2, 0x20

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->KICKSTAND:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "FENDER"

    const/16 v2, 0x21

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->FENDER:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "BLUETOOTH_CONNECTION"

    const/16 v2, 0x22

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->BLUETOOTH_CONNECTION:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "BLUETOOTH_COMMUNICATION"

    const/16 v2, 0x23

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->BLUETOOTH_COMMUNICATION:Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind;

    const-string v1, "OTHER"

    const/16 v2, 0x24

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/IssueKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/IssueKind;->OTHER:Lco/bird/android/model/IssueKind;

    invoke-static {}, Lco/bird/android/model/IssueKind;->$values()[Lco/bird/android/model/IssueKind;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/IssueKind;->$VALUES:[Lco/bird/android/model/IssueKind;

    new-instance v0, Lco/bird/android/model/IssueKind$Creator;

    invoke-direct {v0}, Lco/bird/android/model/IssueKind$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/IssueKind;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/IssueKind;
    .locals 1

    const-class v0, Lco/bird/android/model/IssueKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/IssueKind;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/IssueKind;
    .locals 1

    sget-object v0, Lco/bird/android/model/IssueKind;->$VALUES:[Lco/bird/android/model/IssueKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/IssueKind;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final displayName()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_"

    const-string v2, " "

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
