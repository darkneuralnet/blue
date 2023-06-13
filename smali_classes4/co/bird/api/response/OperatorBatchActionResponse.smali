.class public final Lco/bird/api/response/OperatorBatchActionResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B!\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/api/response/OperatorBatchActionResponse;",
        "",
        "batchId",
        "",
        "status",
        "Lco/bird/api/response/OpsBatchJobStatus;",
        "birdCount",
        "",
        "(Ljava/lang/String;Lco/bird/api/response/OpsBatchJobStatus;I)V",
        "getBatchId",
        "()Ljava/lang/String;",
        "getBirdCount",
        "()I",
        "getStatus",
        "()Lco/bird/api/response/OpsBatchJobStatus;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final batchId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "batch_id"
    .end annotation

    .annotation runtime Lft5;
        value = "batch_id"
    .end annotation
.end field

.field private final birdCount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_count"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_count"
    .end annotation
.end field

.field private final status:Lco/bird/api/response/OpsBatchJobStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation

    .annotation runtime Lft5;
        value = "status"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/api/response/OpsBatchJobStatus;I)V
    .locals 1

    const-string v0, "batchId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/OperatorBatchActionResponse;->batchId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/response/OperatorBatchActionResponse;->status:Lco/bird/api/response/OpsBatchJobStatus;

    iput p3, p0, Lco/bird/api/response/OperatorBatchActionResponse;->birdCount:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/api/response/OpsBatchJobStatus;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/api/response/OperatorBatchActionResponse;-><init>(Ljava/lang/String;Lco/bird/api/response/OpsBatchJobStatus;I)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/OperatorBatchActionResponse;Ljava/lang/String;Lco/bird/api/response/OpsBatchJobStatus;IILjava/lang/Object;)Lco/bird/api/response/OperatorBatchActionResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/api/response/OperatorBatchActionResponse;->batchId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/api/response/OperatorBatchActionResponse;->status:Lco/bird/api/response/OpsBatchJobStatus;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lco/bird/api/response/OperatorBatchActionResponse;->birdCount:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/response/OperatorBatchActionResponse;->copy(Ljava/lang/String;Lco/bird/api/response/OpsBatchJobStatus;I)Lco/bird/api/response/OperatorBatchActionResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchActionResponse;->batchId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/api/response/OpsBatchJobStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchActionResponse;->status:Lco/bird/api/response/OpsBatchJobStatus;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/OperatorBatchActionResponse;->birdCount:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/api/response/OpsBatchJobStatus;I)Lco/bird/api/response/OperatorBatchActionResponse;
    .locals 1

    const-string v0, "batchId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/OperatorBatchActionResponse;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/response/OperatorBatchActionResponse;-><init>(Ljava/lang/String;Lco/bird/api/response/OpsBatchJobStatus;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/OperatorBatchActionResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/OperatorBatchActionResponse;

    iget-object v1, p0, Lco/bird/api/response/OperatorBatchActionResponse;->batchId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchActionResponse;->batchId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/OperatorBatchActionResponse;->status:Lco/bird/api/response/OpsBatchJobStatus;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchActionResponse;->status:Lco/bird/api/response/OpsBatchJobStatus;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/api/response/OperatorBatchActionResponse;->birdCount:I

    iget p1, p1, Lco/bird/api/response/OperatorBatchActionResponse;->birdCount:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBatchId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchActionResponse;->batchId:Ljava/lang/String;

    return-object v0
.end method

.method public final getBirdCount()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/OperatorBatchActionResponse;->birdCount:I

    return v0
.end method

.method public final getStatus()Lco/bird/api/response/OpsBatchJobStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchActionResponse;->status:Lco/bird/api/response/OpsBatchJobStatus;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchActionResponse;->batchId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/OperatorBatchActionResponse;->status:Lco/bird/api/response/OpsBatchJobStatus;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/response/OperatorBatchActionResponse;->birdCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchActionResponse;->batchId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/response/OperatorBatchActionResponse;->status:Lco/bird/api/response/OpsBatchJobStatus;

    iget v2, p0, Lco/bird/api/response/OperatorBatchActionResponse;->birdCount:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "OperatorBatchActionResponse(batchId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", birdCount="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
