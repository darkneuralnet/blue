.class public final Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0016\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BA\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003JE\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u000bH\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006#"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;",
        "",
        "enableInspection",
        "",
        "inspectionFlow",
        "Lco/bird/android/model/constant/InspectionFlow;",
        "enableRepair",
        "repairFlow",
        "Lco/bird/android/model/constant/RepairFlow;",
        "enableWorkOrderHistory",
        "pastWorkOrdersDisplayCount",
        "",
        "(ZLco/bird/android/model/constant/InspectionFlow;ZLco/bird/android/model/constant/RepairFlow;ZI)V",
        "getEnableInspection",
        "()Z",
        "getEnableRepair",
        "getEnableWorkOrderHistory",
        "getInspectionFlow",
        "()Lco/bird/android/model/constant/InspectionFlow;",
        "getPastWorkOrdersDisplayCount",
        "()I",
        "getRepairFlow",
        "()Lco/bird/android/model/constant/RepairFlow;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final enableInspection:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_inspection"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_inspection"
    .end annotation
.end field

.field private final enableRepair:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_repair"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_repair"
    .end annotation
.end field

.field private final enableWorkOrderHistory:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_work_order_history"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_work_order_history"
    .end annotation
.end field

.field private final inspectionFlow:Lco/bird/android/model/constant/InspectionFlow;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "inspection_flow"
    .end annotation

    .annotation runtime Lft5;
        value = "inspection_flow"
    .end annotation
.end field

.field private final pastWorkOrdersDisplayCount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "past_work_orders_display_count"
    .end annotation

    .annotation runtime Lft5;
        value = "past_work_orders_display_count"
    .end annotation
.end field

.field private final repairFlow:Lco/bird/android/model/constant/RepairFlow;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "repair_flow"
    .end annotation

    .annotation runtime Lft5;
        value = "repair_flow"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;-><init>(ZLco/bird/android/model/constant/InspectionFlow;ZLco/bird/android/model/constant/RepairFlow;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLco/bird/android/model/constant/InspectionFlow;ZLco/bird/android/model/constant/RepairFlow;ZI)V
    .locals 1

    const-string v0, "inspectionFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repairFlow"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableInspection:Z

    iput-object p2, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->inspectionFlow:Lco/bird/android/model/constant/InspectionFlow;

    iput-boolean p3, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableRepair:Z

    iput-object p4, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->repairFlow:Lco/bird/android/model/constant/RepairFlow;

    iput-boolean p5, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableWorkOrderHistory:Z

    iput p6, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->pastWorkOrdersDisplayCount:I

    return-void
.end method

.method public synthetic constructor <init>(ZLco/bird/android/model/constant/InspectionFlow;ZLco/bird/android/model/constant/RepairFlow;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p8, v0

    goto :goto_0

    :cond_0
    move p8, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    sget-object p2, Lco/bird/android/model/constant/InspectionFlow;->LEGACY:Lco/bird/android/model/constant/InspectionFlow;

    :cond_1
    move-object v1, p2

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    move v2, v0

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    sget-object p4, Lco/bird/android/model/constant/RepairFlow;->LEGACY:Lco/bird/android/model/constant/RepairFlow;

    :cond_3
    move-object v3, p4

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    move v0, p5

    :goto_2
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_5

    const/4 p6, 0x3

    :cond_5
    move p7, p6

    move-object p1, p0

    move p2, p8

    move-object p3, v1

    move p4, v2

    move-object p5, v3

    move p6, v0

    invoke-direct/range {p1 .. p7}, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;-><init>(ZLco/bird/android/model/constant/InspectionFlow;ZLco/bird/android/model/constant/RepairFlow;ZI)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;ZLco/bird/android/model/constant/InspectionFlow;ZLco/bird/android/model/constant/RepairFlow;ZIILjava/lang/Object;)Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableInspection:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->inspectionFlow:Lco/bird/android/model/constant/InspectionFlow;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableRepair:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->repairFlow:Lco/bird/android/model/constant/RepairFlow;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableWorkOrderHistory:Z

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget p6, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->pastWorkOrdersDisplayCount:I

    :cond_5
    move v3, p6

    move-object p2, p0

    move p3, p1

    move-object p4, p8

    move p5, v0

    move-object p6, v1

    move p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->copy(ZLco/bird/android/model/constant/InspectionFlow;ZLco/bird/android/model/constant/RepairFlow;ZI)Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableInspection:Z

    return v0
.end method

.method public final component2()Lco/bird/android/model/constant/InspectionFlow;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->inspectionFlow:Lco/bird/android/model/constant/InspectionFlow;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableRepair:Z

    return v0
.end method

.method public final component4()Lco/bird/android/model/constant/RepairFlow;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->repairFlow:Lco/bird/android/model/constant/RepairFlow;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableWorkOrderHistory:Z

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->pastWorkOrdersDisplayCount:I

    return v0
.end method

.method public final copy(ZLco/bird/android/model/constant/InspectionFlow;ZLco/bird/android/model/constant/RepairFlow;ZI)Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;
    .locals 8

    const-string v0, "inspectionFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repairFlow"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;

    move-object v1, v0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;-><init>(ZLco/bird/android/model/constant/InspectionFlow;ZLco/bird/android/model/constant/RepairFlow;ZI)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableInspection:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableInspection:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->inspectionFlow:Lco/bird/android/model/constant/InspectionFlow;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->inspectionFlow:Lco/bird/android/model/constant/InspectionFlow;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableRepair:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableRepair:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->repairFlow:Lco/bird/android/model/constant/RepairFlow;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->repairFlow:Lco/bird/android/model/constant/RepairFlow;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableWorkOrderHistory:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableWorkOrderHistory:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->pastWorkOrdersDisplayCount:I

    iget p1, p1, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->pastWorkOrdersDisplayCount:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getEnableInspection()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableInspection:Z

    return v0
.end method

.method public final getEnableRepair()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableRepair:Z

    return v0
.end method

.method public final getEnableWorkOrderHistory()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableWorkOrderHistory:Z

    return v0
.end method

.method public final getInspectionFlow()Lco/bird/android/model/constant/InspectionFlow;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->inspectionFlow:Lco/bird/android/model/constant/InspectionFlow;

    return-object v0
.end method

.method public final getPastWorkOrdersDisplayCount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->pastWorkOrdersDisplayCount:I

    return v0
.end method

.method public final getRepairFlow()Lco/bird/android/model/constant/RepairFlow;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->repairFlow:Lco/bird/android/model/constant/RepairFlow;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableInspection:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->inspectionFlow:Lco/bird/android/model/constant/InspectionFlow;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableRepair:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->repairFlow:Lco/bird/android/model/constant/RepairFlow;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableWorkOrderHistory:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->pastWorkOrdersDisplayCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableInspection:Z

    iget-object v1, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->inspectionFlow:Lco/bird/android/model/constant/InspectionFlow;

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableRepair:Z

    iget-object v3, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->repairFlow:Lco/bird/android/model/constant/RepairFlow;

    iget-boolean v4, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->enableWorkOrderHistory:Z

    iget v5, p0, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->pastWorkOrdersDisplayCount:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "OperatorWorkOrderConfig(enableInspection="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", inspectionFlow="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enableRepair="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", repairFlow="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enableWorkOrderHistory="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", pastWorkOrdersDisplayCount="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
