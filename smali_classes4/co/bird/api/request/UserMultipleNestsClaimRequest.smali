.class public final Lco/bird/api/request/UserMultipleNestsClaimRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/api/request/UserMultipleNestsClaimRequest;",
        "",
        "request",
        "Lco/bird/api/request/MultipleNestsClaimRequest;",
        "multiClaimRequestEnabled",
        "",
        "multiClaimRequestBlocked",
        "remainingUnfulfilledRequestsBeforeBlock",
        "",
        "(Lco/bird/api/request/MultipleNestsClaimRequest;ZZI)V",
        "getMultiClaimRequestBlocked",
        "()Z",
        "getMultiClaimRequestEnabled",
        "getRemainingUnfulfilledRequestsBeforeBlock",
        "()I",
        "getRequest",
        "()Lco/bird/api/request/MultipleNestsClaimRequest;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final multiClaimRequestBlocked:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "multi_claim_request_blocked"
    .end annotation

    .annotation runtime Lft5;
        value = "multi_claim_request_blocked"
    .end annotation
.end field

.field private final multiClaimRequestEnabled:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "multi_claim_request_enabled"
    .end annotation

    .annotation runtime Lft5;
        value = "multi_claim_request_enabled"
    .end annotation
.end field

.field private final remainingUnfulfilledRequestsBeforeBlock:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "remaining_unfulfilled_requests_before_block"
    .end annotation

    .annotation runtime Lft5;
        value = "remaining_unfulfilled_requests_before_block"
    .end annotation
.end field

.field private final request:Lco/bird/api/request/MultipleNestsClaimRequest;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "request"
    .end annotation

    .annotation runtime Lft5;
        value = "request"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/api/request/MultipleNestsClaimRequest;ZZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->request:Lco/bird/api/request/MultipleNestsClaimRequest;

    iput-boolean p2, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestEnabled:Z

    iput-boolean p3, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestBlocked:Z

    iput p4, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->remainingUnfulfilledRequestsBeforeBlock:I

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/UserMultipleNestsClaimRequest;Lco/bird/api/request/MultipleNestsClaimRequest;ZZIILjava/lang/Object;)Lco/bird/api/request/UserMultipleNestsClaimRequest;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->request:Lco/bird/api/request/MultipleNestsClaimRequest;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestEnabled:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestBlocked:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->remainingUnfulfilledRequestsBeforeBlock:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/api/request/UserMultipleNestsClaimRequest;->copy(Lco/bird/api/request/MultipleNestsClaimRequest;ZZI)Lco/bird/api/request/UserMultipleNestsClaimRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/api/request/MultipleNestsClaimRequest;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->request:Lco/bird/api/request/MultipleNestsClaimRequest;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestEnabled:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestBlocked:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->remainingUnfulfilledRequestsBeforeBlock:I

    return v0
.end method

.method public final copy(Lco/bird/api/request/MultipleNestsClaimRequest;ZZI)Lco/bird/api/request/UserMultipleNestsClaimRequest;
    .locals 1

    new-instance v0, Lco/bird/api/request/UserMultipleNestsClaimRequest;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/api/request/UserMultipleNestsClaimRequest;-><init>(Lco/bird/api/request/MultipleNestsClaimRequest;ZZI)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/UserMultipleNestsClaimRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/UserMultipleNestsClaimRequest;

    iget-object v1, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->request:Lco/bird/api/request/MultipleNestsClaimRequest;

    iget-object v3, p1, Lco/bird/api/request/UserMultipleNestsClaimRequest;->request:Lco/bird/api/request/MultipleNestsClaimRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestEnabled:Z

    iget-boolean v3, p1, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestEnabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestBlocked:Z

    iget-boolean v3, p1, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestBlocked:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->remainingUnfulfilledRequestsBeforeBlock:I

    iget p1, p1, Lco/bird/api/request/UserMultipleNestsClaimRequest;->remainingUnfulfilledRequestsBeforeBlock:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMultiClaimRequestBlocked()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestBlocked:Z

    return v0
.end method

.method public final getMultiClaimRequestEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestEnabled:Z

    return v0
.end method

.method public final getRemainingUnfulfilledRequestsBeforeBlock()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->remainingUnfulfilledRequestsBeforeBlock:I

    return v0
.end method

.method public final getRequest()Lco/bird/api/request/MultipleNestsClaimRequest;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->request:Lco/bird/api/request/MultipleNestsClaimRequest;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->request:Lco/bird/api/request/MultipleNestsClaimRequest;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/api/request/MultipleNestsClaimRequest;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestEnabled:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestBlocked:Z

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->remainingUnfulfilledRequestsBeforeBlock:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->request:Lco/bird/api/request/MultipleNestsClaimRequest;

    iget-boolean v1, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestEnabled:Z

    iget-boolean v2, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->multiClaimRequestBlocked:Z

    iget v3, p0, Lco/bird/api/request/UserMultipleNestsClaimRequest;->remainingUnfulfilledRequestsBeforeBlock:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "UserMultipleNestsClaimRequest(request="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", multiClaimRequestEnabled="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", multiClaimRequestBlocked="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", remainingUnfulfilledRequestsBeforeBlock="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
