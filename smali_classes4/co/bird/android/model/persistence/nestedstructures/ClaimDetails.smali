.class public final Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;",
        "",
        "status",
        "Lco/bird/android/model/constant/ClaimStatus;",
        "spaces",
        "",
        "claimId",
        "",
        "(Lco/bird/android/model/constant/ClaimStatus;ILjava/lang/String;)V",
        "getClaimId",
        "()Ljava/lang/String;",
        "getSpaces",
        "()I",
        "getStatus",
        "()Lco/bird/android/model/constant/ClaimStatus;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "model-persistence_release"
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
.field private final claimId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "claim_id"
    .end annotation

    .annotation runtime Lft5;
        value = "claim_id"
    .end annotation
.end field

.field private final spaces:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "spaces"
    .end annotation

    .annotation runtime Lft5;
        value = "spaces"
    .end annotation
.end field

.field private final status:Lco/bird/android/model/constant/ClaimStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation

    .annotation runtime Lft5;
        value = "status"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;-><init>(Lco/bird/android/model/constant/ClaimStatus;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/constant/ClaimStatus;ILjava/lang/String;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->status:Lco/bird/android/model/constant/ClaimStatus;

    iput p2, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->spaces:I

    iput-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->claimId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/ClaimStatus;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lco/bird/android/model/constant/ClaimStatus;->UNKNOWN:Lco/bird/android/model/constant/ClaimStatus;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;-><init>(Lco/bird/android/model/constant/ClaimStatus;ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;Lco/bird/android/model/constant/ClaimStatus;ILjava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->status:Lco/bird/android/model/constant/ClaimStatus;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->spaces:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->claimId:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->copy(Lco/bird/android/model/constant/ClaimStatus;ILjava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/ClaimStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->status:Lco/bird/android/model/constant/ClaimStatus;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->spaces:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->claimId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/ClaimStatus;ILjava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;-><init>(Lco/bird/android/model/constant/ClaimStatus;ILjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->status:Lco/bird/android/model/constant/ClaimStatus;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->status:Lco/bird/android/model/constant/ClaimStatus;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->spaces:I

    iget v3, p1, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->spaces:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->claimId:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->claimId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getClaimId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->claimId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSpaces()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->spaces:I

    return v0
.end method

.method public final getStatus()Lco/bird/android/model/constant/ClaimStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->status:Lco/bird/android/model/constant/ClaimStatus;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->status:Lco/bird/android/model/constant/ClaimStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->spaces:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->claimId:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->status:Lco/bird/android/model/constant/ClaimStatus;

    iget v1, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->spaces:I

    iget-object v2, p0, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->claimId:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ClaimDetails(status="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", spaces="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", claimId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
