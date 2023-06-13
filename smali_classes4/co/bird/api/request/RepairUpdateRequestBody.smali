.class public final Lco/bird/api/request/RepairUpdateRequestBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0015\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003JC\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\n2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0011\u00a8\u0006\""
    }
    d2 = {
        "Lco/bird/api/request/RepairUpdateRequestBody;",
        "",
        "vehicleId",
        "",
        "issueId",
        "selectedRepairs",
        "",
        "selectedNonRepair",
        "Lco/bird/api/request/RepairUpdateNonRepairRequestBody;",
        "disputeIssue",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/api/request/RepairUpdateNonRepairRequestBody;Z)V",
        "getDisputeIssue$annotations",
        "()V",
        "getDisputeIssue",
        "()Z",
        "getIssueId",
        "()Ljava/lang/String;",
        "getSelectedNonRepair",
        "()Lco/bird/api/request/RepairUpdateNonRepairRequestBody;",
        "getSelectedRepairs",
        "()Ljava/util/List;",
        "getVehicleId",
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
        "co.bird.android.api"
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
.field private final disputeIssue:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "dispute_issue"
    .end annotation

    .annotation runtime Lft5;
        value = "dispute_issue"
    .end annotation
.end field

.field private final issueId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "issue_id"
    .end annotation

    .annotation runtime Lft5;
        value = "issue_id"
    .end annotation
.end field

.field private final selectedNonRepair:Lco/bird/api/request/RepairUpdateNonRepairRequestBody;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "selected_non_repair"
    .end annotation

    .annotation runtime Lft5;
        value = "selected_non_repair"
    .end annotation
.end field

.field private final selectedRepairs:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "selected_repairs"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "selected_repairs"
    .end annotation
.end field

.field private final vehicleId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "vehicle_id"
    .end annotation

    .annotation runtime Lft5;
        value = "vehicle_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/api/request/RepairUpdateNonRepairRequestBody;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/api/request/RepairUpdateNonRepairRequestBody;",
            "Z)V"
        }
    .end annotation

    const-string v0, "vehicleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "issueId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedRepairs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->vehicleId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/request/RepairUpdateRequestBody;->issueId:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedRepairs:Ljava/util/List;

    iput-object p4, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedNonRepair:Lco/bird/api/request/RepairUpdateNonRepairRequestBody;

    iput-boolean p5, p0, Lco/bird/api/request/RepairUpdateRequestBody;->disputeIssue:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/api/request/RepairUpdateNonRepairRequestBody;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lco/bird/api/request/RepairUpdateRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/api/request/RepairUpdateNonRepairRequestBody;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/RepairUpdateRequestBody;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/api/request/RepairUpdateNonRepairRequestBody;ZILjava/lang/Object;)Lco/bird/api/request/RepairUpdateRequestBody;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->vehicleId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/api/request/RepairUpdateRequestBody;->issueId:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedRepairs:Ljava/util/List;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedNonRepair:Lco/bird/api/request/RepairUpdateNonRepairRequestBody;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lco/bird/api/request/RepairUpdateRequestBody;->disputeIssue:Z

    :cond_4
    move v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/api/request/RepairUpdateRequestBody;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/api/request/RepairUpdateNonRepairRequestBody;Z)Lco/bird/api/request/RepairUpdateRequestBody;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDisputeIssue$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "API is expecting a false for this field"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "selectedNonRepair"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->vehicleId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->issueId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedRepairs:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lco/bird/api/request/RepairUpdateNonRepairRequestBody;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedNonRepair:Lco/bird/api/request/RepairUpdateNonRepairRequestBody;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->disputeIssue:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/api/request/RepairUpdateNonRepairRequestBody;Z)Lco/bird/api/request/RepairUpdateRequestBody;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/api/request/RepairUpdateNonRepairRequestBody;",
            "Z)",
            "Lco/bird/api/request/RepairUpdateRequestBody;"
        }
    .end annotation

    const-string v0, "vehicleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "issueId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedRepairs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/RepairUpdateRequestBody;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/api/request/RepairUpdateRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/api/request/RepairUpdateNonRepairRequestBody;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/RepairUpdateRequestBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/RepairUpdateRequestBody;

    iget-object v1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->vehicleId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/RepairUpdateRequestBody;->vehicleId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->issueId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/RepairUpdateRequestBody;->issueId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedRepairs:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/request/RepairUpdateRequestBody;->selectedRepairs:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedNonRepair:Lco/bird/api/request/RepairUpdateNonRepairRequestBody;

    iget-object v3, p1, Lco/bird/api/request/RepairUpdateRequestBody;->selectedNonRepair:Lco/bird/api/request/RepairUpdateNonRepairRequestBody;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->disputeIssue:Z

    iget-boolean p1, p1, Lco/bird/api/request/RepairUpdateRequestBody;->disputeIssue:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDisputeIssue()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->disputeIssue:Z

    return v0
.end method

.method public final getIssueId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->issueId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectedNonRepair()Lco/bird/api/request/RepairUpdateNonRepairRequestBody;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedNonRepair:Lco/bird/api/request/RepairUpdateNonRepairRequestBody;

    return-object v0
.end method

.method public final getSelectedRepairs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedRepairs:Ljava/util/List;

    return-object v0
.end method

.method public final getVehicleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->vehicleId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->vehicleId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->issueId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedRepairs:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedNonRepair:Lco/bird/api/request/RepairUpdateNonRepairRequestBody;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/api/request/RepairUpdateNonRepairRequestBody;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->disputeIssue:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/api/request/RepairUpdateRequestBody;->vehicleId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/request/RepairUpdateRequestBody;->issueId:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedRepairs:Ljava/util/List;

    iget-object v3, p0, Lco/bird/api/request/RepairUpdateRequestBody;->selectedNonRepair:Lco/bird/api/request/RepairUpdateNonRepairRequestBody;

    iget-boolean v4, p0, Lco/bird/api/request/RepairUpdateRequestBody;->disputeIssue:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "RepairUpdateRequestBody(vehicleId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", issueId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedRepairs="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedNonRepair="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", disputeIssue="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
