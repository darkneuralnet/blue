.class public final Lco/bird/android/model/wire/configs/OperatorRepairConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\n\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/OperatorRepairConfig;",
        "",
        "enableRepairV3",
        "",
        "enableMlKitScanner",
        "removeManualEntryFromInspectionScanner",
        "requireVehicleScanConfirmationForInspection",
        "requireVehicleScanConfirmationForRepair",
        "(ZZZZZ)V",
        "getEnableMlKitScanner",
        "()Z",
        "getEnableRepairV3",
        "getRemoveManualEntryFromInspectionScanner",
        "getRequireVehicleScanConfirmationForInspection",
        "getRequireVehicleScanConfirmationForRepair",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
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
.field private final enableMlKitScanner:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_ml_kit_scanner"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_ml_kit_scanner"
    .end annotation
.end field

.field private final enableRepairV3:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_repair_v3"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_repair_v3"
    .end annotation
.end field

.field private final removeManualEntryFromInspectionScanner:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "remove_manual_entry_from_inspection_scanner"
    .end annotation

    .annotation runtime Lft5;
        value = "remove_manual_entry_from_inspection_scanner"
    .end annotation
.end field

.field private final requireVehicleScanConfirmationForInspection:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "require_vehicle_scan_confirmation_for_inspection"
    .end annotation

    .annotation runtime Lft5;
        value = "require_vehicle_scan_confirmation_for_inspection"
    .end annotation
.end field

.field private final requireVehicleScanConfirmationForRepair:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "require_vehicle_scan_confirmation_for_repair"
    .end annotation

    .annotation runtime Lft5;
        value = "require_vehicle_scan_confirmation_for_repair"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/wire/configs/OperatorRepairConfig;-><init>(ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableRepairV3:Z

    iput-boolean p2, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableMlKitScanner:Z

    iput-boolean p3, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->removeManualEntryFromInspectionScanner:Z

    iput-boolean p4, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForInspection:Z

    iput-boolean p5, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForRepair:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p7, v0

    goto :goto_0

    :cond_0
    move p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    move v2, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move v3, v0

    goto :goto_3

    :cond_3
    move v3, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move p6, v0

    goto :goto_4

    :cond_4
    move p6, p5

    :goto_4
    move-object p1, p0

    move p2, p7

    move p3, v1

    move p4, v2

    move p5, v3

    invoke-direct/range {p1 .. p6}, Lco/bird/android/model/wire/configs/OperatorRepairConfig;-><init>(ZZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/OperatorRepairConfig;ZZZZZILjava/lang/Object;)Lco/bird/android/model/wire/configs/OperatorRepairConfig;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableRepairV3:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableMlKitScanner:Z

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->removeManualEntryFromInspectionScanner:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForInspection:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForRepair:Z

    :cond_4
    move v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->copy(ZZZZZ)Lco/bird/android/model/wire/configs/OperatorRepairConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableRepairV3:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableMlKitScanner:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->removeManualEntryFromInspectionScanner:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForInspection:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForRepair:Z

    return v0
.end method

.method public final copy(ZZZZZ)Lco/bird/android/model/wire/configs/OperatorRepairConfig;
    .locals 7

    new-instance v6, Lco/bird/android/model/wire/configs/OperatorRepairConfig;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/configs/OperatorRepairConfig;-><init>(ZZZZZ)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/OperatorRepairConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/OperatorRepairConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableRepairV3:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableRepairV3:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableMlKitScanner:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableMlKitScanner:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->removeManualEntryFromInspectionScanner:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->removeManualEntryFromInspectionScanner:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForInspection:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForInspection:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForRepair:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForRepair:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getEnableMlKitScanner()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableMlKitScanner:Z

    return v0
.end method

.method public final getEnableRepairV3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableRepairV3:Z

    return v0
.end method

.method public final getRemoveManualEntryFromInspectionScanner()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->removeManualEntryFromInspectionScanner:Z

    return v0
.end method

.method public final getRequireVehicleScanConfirmationForInspection()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForInspection:Z

    return v0
.end method

.method public final getRequireVehicleScanConfirmationForRepair()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForRepair:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableRepairV3:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableMlKitScanner:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->removeManualEntryFromInspectionScanner:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForInspection:Z

    if-eqz v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForRepair:Z

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableRepairV3:Z

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->enableMlKitScanner:Z

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->removeManualEntryFromInspectionScanner:Z

    iget-boolean v3, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForInspection:Z

    iget-boolean v4, p0, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->requireVehicleScanConfirmationForRepair:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "OperatorRepairConfig(enableRepairV3="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableMlKitScanner="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", removeManualEntryFromInspectionScanner="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", requireVehicleScanConfirmationForInspection="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", requireVehicleScanConfirmationForRepair="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
