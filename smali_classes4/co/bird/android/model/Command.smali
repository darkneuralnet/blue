.class public final enum Lco/bird/android/model/Command;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/Command$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/Command;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008:\u0008\u0086\u0001\u0018\u0000 <2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001<B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(j\u0002\u0008)j\u0002\u0008*j\u0002\u0008+j\u0002\u0008,j\u0002\u0008-j\u0002\u0008.j\u0002\u0008/j\u0002\u00080j\u0002\u00081j\u0002\u00082j\u0002\u00083j\u0002\u00084j\u0002\u00085j\u0002\u00086j\u0002\u00087j\u0002\u00088j\u0002\u00089j\u0002\u0008:j\u0002\u0008;\u00a8\u0006="
    }
    d2 = {
        "Lco/bird/android/model/Command;",
        "",
        "data",
        "",
        "(Ljava/lang/String;I[B)V",
        "getData",
        "()[B",
        "AUTH",
        "LOCK",
        "UNLOCK_LIGHT_ON",
        "UNLOCK_LIGHT_OFF",
        "UNLOCK_BATTERY",
        "LIGHT_ON",
        "LIGHT_OFF",
        "CRUISE_ON",
        "CRUISE_OFF",
        "ALARM_CHIRP",
        "ALARM_SHORT",
        "ALARM_LONG",
        "DISCONNECT",
        "DEEP_SLEEP_ON",
        "DEEP_SLEEP_OFF",
        "MAX_SPEED",
        "RENTAL_MODE",
        "RETAIL_MODE",
        "SOFT_RESET",
        "FLASH_LIGHTS",
        "SPEED_MODE_1",
        "SPEED_MODE_2",
        "SPEED_MODE_3",
        "BIRD_AIR_HEADLIGHT_OFF",
        "BIRD_AIR_HEADLIGHT_ON",
        "BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY",
        "BIRD_AIR_DASH_HARDWARE_FIRMWARE_VERSION_INQUIRY",
        "BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY",
        "BIRD_AIR_INITIATE_CHALLENGE",
        "BIRD_AIR_SEND_PASSCODE",
        "BIRD_AIR_INITIATE_OTA_UPDATE",
        "BIRD_AIR_SYNC_OTA_UPDATE",
        "BIRD_AIR_OTA_UPDATE_HEADER",
        "BIRD_AIR_OTA_UPDATE_FILE_WRITE",
        "BIRD_AIR_STOP_UPDATE",
        "BIRD_AIR_PCM_MODE",
        "BIRD_AIR_PCM_UPDATE_START",
        "BIRD_AIR_PCM_UPDATE_END",
        "BIRD_BIKE_GET_TOKEN",
        "BIRD_BIKE_GET_BATTERY",
        "BIRD_BIKE_QUERY_RIDE_DATA",
        "BIRD_BIKE_HEADLIGHT_OFF",
        "BIRD_BIKE_HEADLIGHT_ON",
        "BIRD_BIKE_READ_HEADLIGHT_STATE",
        "BIRD_BIKE_CLEAR_TRIP_ODOMETER",
        "BIRD_BIKE_CLEAR_TOTAL_ODOMETER",
        "BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE",
        "BIRD_BIKE_QUERY_DISPLAY_FIRMWARE",
        "BIRD_BIKE_QUERY_ECU_FIRMWARE",
        "BIRD_BIKE_QUERY_BMS_FIRMWARE",
        "BIRD_BIKE_QUERY_MOTOR_LOCK",
        "BIRD_BIKE_SET_MOTOR_LOCK_LOCKED",
        "BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED",
        "Companion",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/Command;

.field public static final enum ALARM_CHIRP:Lco/bird/android/model/Command;

.field public static final enum ALARM_LONG:Lco/bird/android/model/Command;

.field public static final enum ALARM_SHORT:Lco/bird/android/model/Command;

.field public static final enum AUTH:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_DASH_HARDWARE_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_HEADLIGHT_OFF:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_HEADLIGHT_ON:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_INITIATE_CHALLENGE:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_INITIATE_OTA_UPDATE:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_OTA_UPDATE_FILE_WRITE:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_OTA_UPDATE_HEADER:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_PCM_MODE:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_PCM_UPDATE_END:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_PCM_UPDATE_START:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_SEND_PASSCODE:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_STOP_UPDATE:Lco/bird/android/model/Command;

.field public static final enum BIRD_AIR_SYNC_OTA_UPDATE:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_CLEAR_TOTAL_ODOMETER:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_CLEAR_TRIP_ODOMETER:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_GET_BATTERY:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_GET_TOKEN:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_HEADLIGHT_OFF:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_HEADLIGHT_ON:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_QUERY_BMS_FIRMWARE:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_QUERY_DISPLAY_FIRMWARE:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_QUERY_ECU_FIRMWARE:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_QUERY_MOTOR_LOCK:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_QUERY_RIDE_DATA:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_READ_HEADLIGHT_STATE:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_SET_MOTOR_LOCK_LOCKED:Lco/bird/android/model/Command;

.field public static final enum BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED:Lco/bird/android/model/Command;

.field public static final enum CRUISE_OFF:Lco/bird/android/model/Command;

.field public static final enum CRUISE_ON:Lco/bird/android/model/Command;

.field public static final Companion:Lco/bird/android/model/Command$Companion;

.field public static final enum DEEP_SLEEP_OFF:Lco/bird/android/model/Command;

.field public static final enum DEEP_SLEEP_ON:Lco/bird/android/model/Command;

.field public static final enum DISCONNECT:Lco/bird/android/model/Command;

.field public static final enum FLASH_LIGHTS:Lco/bird/android/model/Command;

.field public static final enum LIGHT_OFF:Lco/bird/android/model/Command;

.field public static final enum LIGHT_ON:Lco/bird/android/model/Command;

.field public static final enum LOCK:Lco/bird/android/model/Command;

.field public static final enum MAX_SPEED:Lco/bird/android/model/Command;

.field public static final enum RENTAL_MODE:Lco/bird/android/model/Command;

.field public static final enum RETAIL_MODE:Lco/bird/android/model/Command;

.field public static final enum SOFT_RESET:Lco/bird/android/model/Command;

.field public static final enum SPEED_MODE_1:Lco/bird/android/model/Command;

.field public static final enum SPEED_MODE_2:Lco/bird/android/model/Command;

.field public static final enum SPEED_MODE_3:Lco/bird/android/model/Command;

.field public static final enum UNLOCK_BATTERY:Lco/bird/android/model/Command;

.field public static final enum UNLOCK_LIGHT_OFF:Lco/bird/android/model/Command;

.field public static final enum UNLOCK_LIGHT_ON:Lco/bird/android/model/Command;

.field private static final values:[Lco/bird/android/model/Command;


# instance fields
.field private final data:[B


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/Command;
    .locals 3

    const/16 v0, 0x35

    new-array v0, v0, [Lco/bird/android/model/Command;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/Command;->AUTH:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/Command;->LOCK:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/Command;->UNLOCK_LIGHT_ON:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/Command;->UNLOCK_LIGHT_OFF:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/Command;->UNLOCK_BATTERY:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/Command;->LIGHT_ON:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/Command;->LIGHT_OFF:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/Command;->CRUISE_ON:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/Command;->CRUISE_OFF:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/Command;->ALARM_CHIRP:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/Command;->ALARM_SHORT:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/Command;->ALARM_LONG:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lco/bird/android/model/Command;->DISCONNECT:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lco/bird/android/model/Command;->DEEP_SLEEP_ON:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lco/bird/android/model/Command;->DEEP_SLEEP_OFF:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lco/bird/android/model/Command;->MAX_SPEED:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lco/bird/android/model/Command;->RENTAL_MODE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lco/bird/android/model/Command;->RETAIL_MODE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lco/bird/android/model/Command;->SOFT_RESET:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lco/bird/android/model/Command;->FLASH_LIGHTS:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lco/bird/android/model/Command;->SPEED_MODE_1:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lco/bird/android/model/Command;->SPEED_MODE_2:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lco/bird/android/model/Command;->SPEED_MODE_3:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x17

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_HEADLIGHT_OFF:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x18

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_HEADLIGHT_ON:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x19

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_DASH_HARDWARE_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_INITIATE_CHALLENGE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_SEND_PASSCODE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_INITIATE_OTA_UPDATE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_SYNC_OTA_UPDATE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x20

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_OTA_UPDATE_HEADER:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x21

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_OTA_UPDATE_FILE_WRITE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x22

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_STOP_UPDATE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x23

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_PCM_MODE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x24

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_PCM_UPDATE_START:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x25

    sget-object v2, Lco/bird/android/model/Command;->BIRD_AIR_PCM_UPDATE_END:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x26

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_GET_TOKEN:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x27

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_GET_BATTERY:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x28

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_RIDE_DATA:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x29

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_HEADLIGHT_OFF:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x2a

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_HEADLIGHT_ON:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x2b

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_READ_HEADLIGHT_STATE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x2c

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_CLEAR_TRIP_ODOMETER:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x2d

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_CLEAR_TOTAL_ODOMETER:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x2e

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x2f

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_DISPLAY_FIRMWARE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x30

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_ECU_FIRMWARE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x31

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_BMS_FIRMWARE:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x32

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_MOTOR_LOCK:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x33

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_SET_MOTOR_LOCK_LOCKED:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    const/16 v1, 0x34

    sget-object v2, Lco/bird/android/model/Command;->BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED:Lco/bird/android/model/Command;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Lco/bird/android/model/Command;

    const/4 v1, 0x2

    new-array v2, v1, [B

    fill-array-data v2, :array_0

    const-string v3, "AUTH"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v2}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->AUTH:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    const-string v3, "LOCK"

    const/4 v5, 0x1

    invoke-direct {v0, v3, v5, v2}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->LOCK:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    const/4 v2, 0x3

    new-array v3, v2, [B

    fill-array-data v3, :array_2

    const-string v5, "UNLOCK_LIGHT_ON"

    invoke-direct {v0, v5, v1, v3}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->UNLOCK_LIGHT_ON:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v3, v2, [B

    fill-array-data v3, :array_3

    const-string v5, "UNLOCK_LIGHT_OFF"

    invoke-direct {v0, v5, v2, v3}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->UNLOCK_LIGHT_OFF:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    const/16 v2, 0xa

    new-array v3, v2, [B

    fill-array-data v3, :array_4

    const-string v5, "UNLOCK_BATTERY"

    const/4 v6, 0x4

    invoke-direct {v0, v5, v6, v3}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->UNLOCK_BATTERY:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    const/4 v3, 0x6

    new-array v5, v3, [B

    fill-array-data v5, :array_5

    const-string v7, "LIGHT_ON"

    const/4 v8, 0x5

    invoke-direct {v0, v7, v8, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->LIGHT_ON:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v3, [B

    fill-array-data v5, :array_6

    const-string v7, "LIGHT_OFF"

    invoke-direct {v0, v7, v3, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->LIGHT_OFF:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_7

    const-string v7, "CRUISE_ON"

    const/4 v8, 0x7

    invoke-direct {v0, v7, v8, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->CRUISE_ON:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_8

    const-string v7, "CRUISE_OFF"

    const/16 v9, 0x8

    invoke-direct {v0, v7, v9, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->CRUISE_OFF:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_9

    const-string v7, "ALARM_CHIRP"

    const/16 v9, 0x9

    invoke-direct {v0, v7, v9, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->ALARM_CHIRP:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_a

    const-string v7, "ALARM_SHORT"

    invoke-direct {v0, v7, v2, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->ALARM_SHORT:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_b

    const-string v7, "ALARM_LONG"

    const/16 v9, 0xb

    invoke-direct {v0, v7, v9, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->ALARM_LONG:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_c

    const-string v7, "DISCONNECT"

    const/16 v9, 0xc

    invoke-direct {v0, v7, v9, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->DISCONNECT:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_d

    const-string v7, "DEEP_SLEEP_ON"

    const/16 v9, 0xd

    invoke-direct {v0, v7, v9, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->DEEP_SLEEP_ON:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_e

    const-string v7, "DEEP_SLEEP_OFF"

    const/16 v9, 0xe

    invoke-direct {v0, v7, v9, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->DEEP_SLEEP_OFF:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_f

    const-string v7, "MAX_SPEED"

    const/16 v9, 0xf

    invoke-direct {v0, v7, v9, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->MAX_SPEED:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_10

    const-string v7, "RENTAL_MODE"

    const/16 v9, 0x10

    invoke-direct {v0, v7, v9, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->RENTAL_MODE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_11

    const-string v7, "RETAIL_MODE"

    const/16 v9, 0x11

    invoke-direct {v0, v7, v9, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->RETAIL_MODE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v5, v1, [B

    fill-array-data v5, :array_12

    const-string v7, "SOFT_RESET"

    const/16 v9, 0x12

    invoke-direct {v0, v7, v9, v5}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->SOFT_RESET:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v1, [B

    fill-array-data v1, :array_13

    const-string v5, "FLASH_LIGHTS"

    const/16 v7, 0x13

    invoke-direct {v0, v5, v7, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->FLASH_LIGHTS:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v8, [B

    fill-array-data v1, :array_14

    const-string v5, "SPEED_MODE_1"

    const/16 v7, 0x14

    invoke-direct {v0, v5, v7, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->SPEED_MODE_1:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v8, [B

    fill-array-data v1, :array_15

    const-string v5, "SPEED_MODE_2"

    const/16 v9, 0x15

    invoke-direct {v0, v5, v9, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->SPEED_MODE_2:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v8, [B

    fill-array-data v1, :array_16

    const-string v5, "SPEED_MODE_3"

    const/16 v9, 0x16

    invoke-direct {v0, v5, v9, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->SPEED_MODE_3:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v8, [B

    fill-array-data v1, :array_17

    const-string v5, "BIRD_AIR_HEADLIGHT_OFF"

    const/16 v9, 0x17

    invoke-direct {v0, v5, v9, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_HEADLIGHT_OFF:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v8, [B

    fill-array-data v1, :array_18

    const-string v5, "BIRD_AIR_HEADLIGHT_ON"

    const/16 v9, 0x18

    invoke-direct {v0, v5, v9, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_HEADLIGHT_ON:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v8, [B

    fill-array-data v1, :array_19

    const-string v5, "BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY"

    const/16 v9, 0x19

    invoke-direct {v0, v5, v9, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v8, [B

    fill-array-data v1, :array_1a

    const-string v5, "BIRD_AIR_DASH_HARDWARE_FIRMWARE_VERSION_INQUIRY"

    const/16 v8, 0x1a

    invoke-direct {v0, v5, v8, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_DASH_HARDWARE_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v2, [B

    fill-array-data v1, :array_1b

    const-string v5, "BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY"

    const/16 v8, 0x1b

    invoke-direct {v0, v5, v8, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v3, [B

    fill-array-data v1, :array_1c

    const-string v3, "BIRD_AIR_INITIATE_CHALLENGE"

    const/16 v5, 0x1c

    invoke-direct {v0, v3, v5, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_INITIATE_CHALLENGE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_1d

    const-string v3, "BIRD_AIR_SEND_PASSCODE"

    const/16 v5, 0x1d

    invoke-direct {v0, v3, v5, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_SEND_PASSCODE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_1e

    const-string v3, "BIRD_AIR_INITIATE_OTA_UPDATE"

    const/16 v5, 0x1e

    invoke-direct {v0, v3, v5, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_INITIATE_OTA_UPDATE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_1f

    const-string v3, "BIRD_AIR_SYNC_OTA_UPDATE"

    const/16 v5, 0x1f

    invoke-direct {v0, v3, v5, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_SYNC_OTA_UPDATE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_20

    const-string v3, "BIRD_AIR_OTA_UPDATE_HEADER"

    const/16 v5, 0x20

    invoke-direct {v0, v3, v5, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_OTA_UPDATE_HEADER:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_21

    const-string v3, "BIRD_AIR_OTA_UPDATE_FILE_WRITE"

    const/16 v5, 0x21

    invoke-direct {v0, v3, v5, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_OTA_UPDATE_FILE_WRITE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_22

    const-string v3, "BIRD_AIR_STOP_UPDATE"

    const/16 v5, 0x22

    invoke-direct {v0, v3, v5, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_STOP_UPDATE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v2, [B

    fill-array-data v1, :array_23

    const-string v2, "BIRD_AIR_PCM_MODE"

    const/16 v3, 0x23

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_AIR_PCM_MODE:Lco/bird/android/model/Command;

    new-array v0, v7, [B

    move v1, v4

    :goto_0
    if-ge v1, v7, :cond_0

    const/16 v2, 0x44

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Lco/bird/android/model/Command;

    const-string v2, "BIRD_AIR_PCM_UPDATE_START"

    const/16 v3, 0x24

    invoke-direct {v1, v2, v3, v0}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v1, Lco/bird/android/model/Command;->BIRD_AIR_PCM_UPDATE_START:Lco/bird/android/model/Command;

    new-array v0, v7, [B

    :goto_1
    if-ge v4, v7, :cond_1

    const/16 v1, 0x55

    aput-byte v1, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    new-instance v1, Lco/bird/android/model/Command;

    const-string v2, "BIRD_AIR_PCM_UPDATE_END"

    const/16 v3, 0x25

    invoke-direct {v1, v2, v3, v0}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v1, Lco/bird/android/model/Command;->BIRD_AIR_PCM_UPDATE_END:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_24

    const-string v2, "BIRD_BIKE_GET_TOKEN"

    const/16 v3, 0x26

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_GET_TOKEN:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_25

    const-string v2, "BIRD_BIKE_GET_BATTERY"

    const/16 v3, 0x27

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_GET_BATTERY:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_26

    const-string v2, "BIRD_BIKE_QUERY_RIDE_DATA"

    const/16 v3, 0x28

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_RIDE_DATA:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_27

    const-string v2, "BIRD_BIKE_HEADLIGHT_OFF"

    const/16 v3, 0x29

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_HEADLIGHT_OFF:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_28

    const-string v2, "BIRD_BIKE_HEADLIGHT_ON"

    const/16 v3, 0x2a

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_HEADLIGHT_ON:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_29

    const-string v2, "BIRD_BIKE_READ_HEADLIGHT_STATE"

    const/16 v3, 0x2b

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_READ_HEADLIGHT_STATE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_2a

    const-string v2, "BIRD_BIKE_CLEAR_TRIP_ODOMETER"

    const/16 v3, 0x2c

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_CLEAR_TRIP_ODOMETER:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_2b

    const-string v2, "BIRD_BIKE_CLEAR_TOTAL_ODOMETER"

    const/16 v3, 0x2d

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_CLEAR_TOTAL_ODOMETER:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_2c

    const-string v2, "BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE"

    const/16 v3, 0x2e

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_2d

    const-string v2, "BIRD_BIKE_QUERY_DISPLAY_FIRMWARE"

    const/16 v3, 0x2f

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_DISPLAY_FIRMWARE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_2e

    const-string v2, "BIRD_BIKE_QUERY_ECU_FIRMWARE"

    const/16 v3, 0x30

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_ECU_FIRMWARE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_2f

    const-string v2, "BIRD_BIKE_QUERY_BMS_FIRMWARE"

    const/16 v3, 0x31

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_BMS_FIRMWARE:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_30

    const-string v2, "BIRD_BIKE_QUERY_MOTOR_LOCK"

    const/16 v3, 0x32

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_MOTOR_LOCK:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_31

    const-string v2, "BIRD_BIKE_SET_MOTOR_LOCK_LOCKED"

    const/16 v3, 0x33

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_SET_MOTOR_LOCK_LOCKED:Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command;

    new-array v1, v6, [B

    fill-array-data v1, :array_32

    const-string v2, "BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED"

    const/16 v3, 0x34

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Command;-><init>(Ljava/lang/String;I[B)V

    sput-object v0, Lco/bird/android/model/Command;->BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED:Lco/bird/android/model/Command;

    invoke-static {}, Lco/bird/android/model/Command;->$values()[Lco/bird/android/model/Command;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/Command;->$VALUES:[Lco/bird/android/model/Command;

    new-instance v0, Lco/bird/android/model/Command$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/Command$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Command;->Companion:Lco/bird/android/model/Command$Companion;

    invoke-static {}, Lco/bird/android/model/Command;->values()[Lco/bird/android/model/Command;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/Command;->values:[Lco/bird/android/model/Command;

    return-void

    :array_0
    .array-data 1
        -0x4ft
        0x3dt
    .end array-data

    nop

    :array_1
    .array-data 1
        0x0t
        0x15t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x0t
        0x16t
        0x0t
    .end array-data

    :array_3
    .array-data 1
        0x0t
        0x16t
        0xft
    .end array-data

    :array_4
    .array-data 1
        0x0t
        -0x80t
        0x7t
        0x1t
        0x33t
        0x31t
        0x1t
        0x2t
        0x6t
        0x1t
    .end array-data

    nop

    :array_5
    .array-data 1
        0x0t
        0x42t
        0x7ft
        0x7ft
        0x7ft
        0x7ft
    .end array-data

    nop

    :array_6
    .array-data 1
        0x0t
        0x43t
        0x7ft
        0x7ft
        0x7ft
        0x7ft
    .end array-data

    nop

    :array_7
    .array-data 1
        0x0t
        0x19t
    .end array-data

    nop

    :array_8
    .array-data 1
        0x0t
        0x20t
    .end array-data

    nop

    :array_9
    .array-data 1
        0x0t
        0x21t
    .end array-data

    nop

    :array_a
    .array-data 1
        0x0t
        0x22t
    .end array-data

    nop

    :array_b
    .array-data 1
        0x0t
        0x23t
    .end array-data

    nop

    :array_c
    .array-data 1
        0x0t
        0x60t
    .end array-data

    nop

    :array_d
    .array-data 1
        0x0t
        0x33t
    .end array-data

    nop

    :array_e
    .array-data 1
        0x0t
        0x31t
    .end array-data

    nop

    :array_f
    .array-data 1
        0x0t
        0x32t
    .end array-data

    nop

    :array_10
    .array-data 1
        0x0t
        0x28t
    .end array-data

    nop

    :array_11
    .array-data 1
        0x0t
        0x45t
    .end array-data

    nop

    :array_12
    .array-data 1
        0x0t
        0x41t
    .end array-data

    nop

    :array_13
    .array-data 1
        0x0t
        0x63t
    .end array-data

    nop

    :array_14
    .array-data 1
        0x2bt
        0x4dt
        0x4ft
        0x44t
        0x45t
        0x3dt
        0x31t
    .end array-data

    :array_15
    .array-data 1
        0x2bt
        0x4dt
        0x4ft
        0x44t
        0x45t
        0x3dt
        0x32t
    .end array-data

    :array_16
    .array-data 1
        0x2bt
        0x4dt
        0x4ft
        0x44t
        0x45t
        0x3dt
        0x33t
    .end array-data

    :array_17
    .array-data 1
        0x2bt
        0x48t
        0x4ct
        0x47t
        0x54t
        0x3dt
        0x30t
    .end array-data

    :array_18
    .array-data 1
        0x2bt
        0x48t
        0x4ct
        0x47t
        0x54t
        0x3dt
        0x31t
    .end array-data

    :array_19
    .array-data 1
        0x2bt
        0x53t
        0x56t
        0x47t
        0x54t
        0x3dt
        0x3ft
    .end array-data

    :array_1a
    .array-data 1
        0x2bt
        0x48t
        0x56t
        0x47t
        0x54t
        0x3dt
        0x3ft
    .end array-data

    :array_1b
    .array-data 1
        0x3at
        0x17t
        0x11t
        0x2t
        0x46t
        0x57t
        -0x39t
        0x0t
        0xdt
        0xat
    .end array-data

    nop

    :array_1c
    .array-data 1
        -0x52t
        0x4bt
        0x45t
        0x59t
        0x3ft
        -0x2at
    .end array-data

    nop

    :array_1d
    .array-data 1
        -0x52t
        0x4bt
        0x45t
        0x59t
    .end array-data

    :array_1e
    .array-data 1
        -0x52t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1f
    .array-data 1
        -0x5ct
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_20
    .array-data 1
        -0x60t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_21
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_22
    .array-data 1
        -0x1t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_23
    .array-data 1
        0x3at
        0x17t
        0x52t
        0x2t
        0x53t
        0x54t
        0x12t
        0x1t
        0xdt
        0xat
    .end array-data

    nop

    :array_24
    .array-data 1
        0x6t
        0x1t
        0x1t
        0x1t
    .end array-data

    :array_25
    .array-data 1
        0x2t
        0x1t
        0x1t
        0x1t
    .end array-data

    :array_26
    .array-data 1
        0x5t
        0x48t
        0x1t
        0x1t
    .end array-data

    :array_27
    .array-data 1
        0x5t
        0x47t
        0x1t
        0x0t
    .end array-data

    :array_28
    .array-data 1
        0x5t
        0x47t
        0x1t
        0x1t
    .end array-data

    :array_29
    .array-data 1
        0x5t
        0x45t
        0x1t
        0x1t
    .end array-data

    :array_2a
    .array-data 1
        0x2t
        0x20t
        0x1t
        0x1t
    .end array-data

    :array_2b
    .array-data 1
        0x2t
        0x20t
        0x1t
        0x2t
    .end array-data

    :array_2c
    .array-data 1
        0x2t
        0x20t
        0x1t
        0x3t
    .end array-data

    :array_2d
    .array-data 1
        0x1t
        0x4t
        0x1t
        0x1t
    .end array-data

    :array_2e
    .array-data 1
        0x1t
        0x6t
        0x1t
        0x1t
    .end array-data

    :array_2f
    .array-data 1
        0x1t
        0x8t
        0x1t
        0x1t
    .end array-data

    :array_30
    .array-data 1
        0x5t
        0xet
        0x1t
        0x1t
    .end array-data

    :array_31
    .array-data 1
        0x5t
        0xct
        0x1t
        0x1t
    .end array-data

    :array_32
    .array-data 1
        0x5t
        0x1t
        0x1t
        0x1t
    .end array-data
.end method

.method private constructor <init>(Ljava/lang/String;I[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/bird/android/model/Command;->data:[B

    return-void
.end method

.method public static final synthetic access$getValues$cp()[Lco/bird/android/model/Command;
    .locals 1

    sget-object v0, Lco/bird/android/model/Command;->values:[Lco/bird/android/model/Command;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/Command;
    .locals 1

    const-class v0, Lco/bird/android/model/Command;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/Command;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/Command;
    .locals 1

    sget-object v0, Lco/bird/android/model/Command;->$VALUES:[Lco/bird/android/model/Command;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/Command;

    return-object v0
.end method


# virtual methods
.method public final getData()[B
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Command;->data:[B

    return-object v0
.end method
