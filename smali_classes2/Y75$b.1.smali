.class public final synthetic LY75$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY75;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "b"
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
    .locals 6

    invoke-static {}, Lco/bird/android/model/wire/configs/WarningPresentationKind;->values()[Lco/bird/android/model/wire/configs/WarningPresentationKind;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lco/bird/android/model/wire/configs/WarningPresentationKind;->FULL_SCREEN:Lco/bird/android/model/wire/configs/WarningPresentationKind;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lco/bird/android/model/wire/configs/WarningPresentationKind;->ACTION_SHEET:Lco/bird/android/model/wire/configs/WarningPresentationKind;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v3, 0x3

    :try_start_2
    sget-object v4, Lco/bird/android/model/wire/configs/WarningPresentationKind;->ALERT:Lco/bird/android/model/wire/configs/WarningPresentationKind;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const/4 v4, 0x4

    :try_start_3
    sget-object v5, Lco/bird/android/model/wire/configs/WarningPresentationKind;->LEGACY:Lco/bird/android/model/wire/configs/WarningPresentationKind;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    sput-object v0, LY75$b;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lco/bird/android/model/constant/PhysicalLockPurpose;->values()[Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_4
    sget-object v5, Lco/bird/android/model/constant/PhysicalLockPurpose;->HELMET:Lco/bird/android/model/constant/PhysicalLockPurpose;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    sput-object v0, LY75$b;->$EnumSwitchMapping$1:[I

    invoke-static {}, Lco/bird/android/model/constant/ScanButtonStyle;->values()[Lco/bird/android/model/constant/ScanButtonStyle;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_5
    sget-object v5, Lco/bird/android/model/constant/ScanButtonStyle;->RIDE:Lco/bird/android/model/constant/ScanButtonStyle;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v5, Lco/bird/android/model/constant/ScanButtonStyle;->SCAN:Lco/bird/android/model/constant/ScanButtonStyle;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v2, v0, v5
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v2, Lco/bird/android/model/constant/ScanButtonStyle;->QR_SCAN:Lco/bird/android/model/constant/ScanButtonStyle;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v3, v0, v2
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v2, Lco/bird/android/model/constant/ScanButtonStyle;->QR_GRID:Lco/bird/android/model/constant/ScanButtonStyle;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v4, v0, v2
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    sput-object v0, LY75$b;->$EnumSwitchMapping$2:[I

    invoke-static {}, Lco/bird/android/model/constant/ScanButtonShape;->values()[Lco/bird/android/model/constant/ScanButtonShape;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_9
    sget-object v2, Lco/bird/android/model/constant/ScanButtonShape;->PILL:Lco/bird/android/model/constant/ScanButtonShape;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    sput-object v0, LY75$b;->$EnumSwitchMapping$3:[I

    return-void
.end method
