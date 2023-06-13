.class public final synthetic Lmo0$k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmo0$k;
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


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lco/bird/android/model/constant/InspectionFlow;->values()[Lco/bird/android/model/constant/InspectionFlow;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lco/bird/android/model/constant/InspectionFlow;->LIST:Lco/bird/android/model/constant/InspectionFlow;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sput-object v0, Lmo0$k$a;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lco/bird/android/model/constant/RepairFlow;->values()[Lco/bird/android/model/constant/RepairFlow;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_1
    sget-object v2, Lco/bird/android/model/constant/RepairFlow;->CARDS:Lco/bird/android/model/constant/RepairFlow;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Lmo0$k$a;->$EnumSwitchMapping$1:[I

    invoke-static {}, Lco/bird/android/model/constant/QualityControlFlow;->values()[Lco/bird/android/model/constant/QualityControlFlow;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_2
    sget-object v2, Lco/bird/android/model/constant/QualityControlFlow;->LIST:Lco/bird/android/model/constant/QualityControlFlow;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-object v0, Lmo0$k$a;->$EnumSwitchMapping$2:[I

    return-void
.end method
