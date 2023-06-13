.class public final synthetic Lht1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lht1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I

.field public static final synthetic $EnumSwitchMapping$3:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    invoke-static {}, Lco/bird/android/model/constant/QuickCaptureState;->values()[Lco/bird/android/model/constant/QuickCaptureState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lco/bird/android/model/constant/QuickCaptureState;->READY:Lco/bird/android/model/constant/QuickCaptureState;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lco/bird/android/model/constant/QuickCaptureState;->INITIATED:Lco/bird/android/model/constant/QuickCaptureState;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Lht1$a;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lco/bird/android/model/constant/FlightSheetSummaryAction;->values()[Lco/bird/android/model/constant/FlightSheetSummaryAction;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_2
    sget-object v3, Lco/bird/android/model/constant/FlightSheetSummaryAction;->QUICK_CAPTURE:Lco/bird/android/model/constant/FlightSheetSummaryAction;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v1, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-object v0, Lht1$a;->$EnumSwitchMapping$1:[I

    invoke-static {}, Lco/bird/android/model/constant/FlightSheetCommand;->values()[Lco/bird/android/model/constant/FlightSheetCommand;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_3
    sget-object v3, Lco/bird/android/model/constant/FlightSheetCommand;->LOCK_BT:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v1, v0, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v3, Lco/bird/android/model/constant/FlightSheetCommand;->LOCK_CELL:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    const/4 v3, 0x3

    :try_start_5
    sget-object v4, Lco/bird/android/model/constant/FlightSheetCommand;->BATTERY_LOCK_BT:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    const/4 v4, 0x4

    :try_start_6
    sget-object v5, Lco/bird/android/model/constant/FlightSheetCommand;->BATTERY_LOCK_CELL:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    const/4 v5, 0x5

    :try_start_7
    sget-object v6, Lco/bird/android/model/constant/FlightSheetCommand;->CABLE_LOCK_BT:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aput v5, v0, v6
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    const/4 v6, 0x6

    :try_start_8
    sget-object v7, Lco/bird/android/model/constant/FlightSheetCommand;->CABLE_LOCK_CELL:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aput v6, v0, v7
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    const/4 v7, 0x7

    :try_start_9
    sget-object v8, Lco/bird/android/model/constant/FlightSheetCommand;->HELMET_UNLOCK_CELL:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aput v7, v0, v8
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    const/16 v8, 0x8

    :try_start_a
    sget-object v9, Lco/bird/android/model/constant/FlightSheetCommand;->HELMET_UNLOCK_BT:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aput v8, v0, v9
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    const/16 v9, 0x9

    :try_start_b
    sget-object v10, Lco/bird/android/model/constant/FlightSheetCommand;->ALARM_BT:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aput v9, v0, v10
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    const/16 v10, 0xa

    :try_start_c
    sget-object v11, Lco/bird/android/model/constant/FlightSheetCommand;->ALARM_CELL:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v10, v0, v11
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    const/16 v11, 0xb

    :try_start_d
    sget-object v12, Lco/bird/android/model/constant/FlightSheetCommand;->FLASH_LIGHTS_BT:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aput v11, v0, v12
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    const/16 v12, 0xc

    :try_start_e
    sget-object v13, Lco/bird/android/model/constant/FlightSheetCommand;->SOFT_RESET_BT:Lco/bird/android/model/constant/FlightSheetCommand;

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aput v12, v0, v13
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    sput-object v0, Lht1$a;->$EnumSwitchMapping$2:[I

    invoke-static {}, Lco/bird/android/model/constant/FlightSheetAction;->values()[Lco/bird/android/model/constant/FlightSheetAction;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_f
    sget-object v13, Lco/bird/android/model/constant/FlightSheetAction;->BATTERY_SWAP:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aput v1, v0, v13
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    :try_start_10
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->OTHER_POSSIBLE_LOCATIONS:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    :catch_10
    :try_start_11
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->SEARCH_NEARBY:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    :catch_11
    :try_start_12
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->CANNOT_ACCESS:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v4, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    :catch_12
    :try_start_13
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->PRIVATE_PROPERTY:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v5, v0, v1
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    :catch_13
    :try_start_14
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->MARK_MISSING:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v6, v0, v1
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    :catch_14
    :try_start_15
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->MARK_DAMAGED:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v7, v0, v1
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_15} :catch_15

    :catch_15
    :try_start_16
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->UNMARK_DAMAGED:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v8, v0, v1
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_16} :catch_16

    :catch_16
    :try_start_17
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->PAST_REPAIRS:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v9, v0, v1
    :try_end_17
    .catch Ljava/lang/NoSuchFieldError; {:try_start_17 .. :try_end_17} :catch_17

    :catch_17
    :try_start_18
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->DIAGNOSTICS:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v10, v0, v1
    :try_end_18
    .catch Ljava/lang/NoSuchFieldError; {:try_start_18 .. :try_end_18} :catch_18

    :catch_18
    :try_start_19
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->INSPECTION:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v11, v0, v1
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_19} :catch_19

    :catch_19
    :try_start_1a
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->LAST_RIDE:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v12, v0, v1
    :try_end_1a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1a .. :try_end_1a} :catch_1a

    :catch_1a
    :try_start_1b
    sget-object v1, Lco/bird/android/model/constant/FlightSheetAction;->MARK_FOR_INSPECTION:Lco/bird/android/model/constant/FlightSheetAction;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0xd

    aput v2, v0, v1
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1b .. :try_end_1b} :catch_1b

    :catch_1b
    sput-object v0, Lht1$a;->$EnumSwitchMapping$3:[I

    return-void
.end method
