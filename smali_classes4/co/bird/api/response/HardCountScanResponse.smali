.class public final Lco/bird/api/response/HardCountScanResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BE\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003JI\u0010\u001b\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000f\u00a8\u0006\""
    }
    d2 = {
        "Lco/bird/api/response/HardCountScanResponse;",
        "",
        "hardCountBird",
        "Lco/bird/android/model/wire/WireHardCountBird;",
        "errorCode",
        "Lco/bird/android/model/constant/InventoryScanningError;",
        "failureScans",
        "",
        "successScans",
        "userFailureScans",
        "userSuccessScans",
        "(Lco/bird/android/model/wire/WireHardCountBird;Lco/bird/android/model/constant/InventoryScanningError;IIII)V",
        "getErrorCode",
        "()Lco/bird/android/model/constant/InventoryScanningError;",
        "getFailureScans",
        "()I",
        "getHardCountBird",
        "()Lco/bird/android/model/wire/WireHardCountBird;",
        "getSuccessScans",
        "getUserFailureScans",
        "getUserSuccessScans",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
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
.field private final errorCode:Lco/bird/android/model/constant/InventoryScanningError;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "error_code"
    .end annotation

    .annotation runtime Lft5;
        value = "error_code"
    .end annotation
.end field

.field private final failureScans:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "failure_count"
    .end annotation

    .annotation runtime Lft5;
        value = "failure_count"
    .end annotation
.end field

.field private final hardCountBird:Lco/bird/android/model/wire/WireHardCountBird;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "vehicle"
    .end annotation

    .annotation runtime Lft5;
        value = "vehicle"
    .end annotation
.end field

.field private final successScans:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "success_count"
    .end annotation

    .annotation runtime Lft5;
        value = "success_count"
    .end annotation
.end field

.field private final userFailureScans:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "user_failure_count"
    .end annotation

    .annotation runtime Lft5;
        value = "user_failure_count"
    .end annotation
.end field

.field private final userSuccessScans:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "user_success_count"
    .end annotation

    .annotation runtime Lft5;
        value = "user_success_count"
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

    invoke-direct/range {v0 .. v8}, Lco/bird/api/response/HardCountScanResponse;-><init>(Lco/bird/android/model/wire/WireHardCountBird;Lco/bird/android/model/constant/InventoryScanningError;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireHardCountBird;Lco/bird/android/model/constant/InventoryScanningError;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/HardCountScanResponse;->hardCountBird:Lco/bird/android/model/wire/WireHardCountBird;

    iput-object p2, p0, Lco/bird/api/response/HardCountScanResponse;->errorCode:Lco/bird/android/model/constant/InventoryScanningError;

    iput p3, p0, Lco/bird/api/response/HardCountScanResponse;->failureScans:I

    iput p4, p0, Lco/bird/api/response/HardCountScanResponse;->successScans:I

    iput p5, p0, Lco/bird/api/response/HardCountScanResponse;->userFailureScans:I

    iput p6, p0, Lco/bird/api/response/HardCountScanResponse;->userSuccessScans:I

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireHardCountBird;Lco/bird/android/model/constant/InventoryScanningError;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p8, v0

    goto :goto_0

    :cond_0
    move-object p8, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p2

    :goto_1
    and-int/lit8 p1, p7, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    move v1, p2

    goto :goto_2

    :cond_2
    move v1, p3

    :goto_2
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    move v2, p2

    goto :goto_3

    :cond_3
    move v2, p4

    :goto_3
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    move v3, p2

    goto :goto_4

    :cond_4
    move v3, p5

    :goto_4
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_5

    move p7, p2

    goto :goto_5

    :cond_5
    move p7, p6

    :goto_5
    move-object p1, p0

    move-object p2, p8

    move-object p3, v0

    move p4, v1

    move p5, v2

    move p6, v3

    invoke-direct/range {p1 .. p7}, Lco/bird/api/response/HardCountScanResponse;-><init>(Lco/bird/android/model/wire/WireHardCountBird;Lco/bird/android/model/constant/InventoryScanningError;IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/HardCountScanResponse;Lco/bird/android/model/wire/WireHardCountBird;Lco/bird/android/model/constant/InventoryScanningError;IIIIILjava/lang/Object;)Lco/bird/api/response/HardCountScanResponse;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lco/bird/api/response/HardCountScanResponse;->hardCountBird:Lco/bird/android/model/wire/WireHardCountBird;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lco/bird/api/response/HardCountScanResponse;->errorCode:Lco/bird/android/model/constant/InventoryScanningError;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lco/bird/api/response/HardCountScanResponse;->failureScans:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lco/bird/api/response/HardCountScanResponse;->successScans:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, Lco/bird/api/response/HardCountScanResponse;->userFailureScans:I

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget p6, p0, Lco/bird/api/response/HardCountScanResponse;->userSuccessScans:I

    :cond_5
    move v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/api/response/HardCountScanResponse;->copy(Lco/bird/android/model/wire/WireHardCountBird;Lco/bird/android/model/constant/InventoryScanningError;IIII)Lco/bird/api/response/HardCountScanResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireHardCountBird;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/HardCountScanResponse;->hardCountBird:Lco/bird/android/model/wire/WireHardCountBird;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/constant/InventoryScanningError;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/HardCountScanResponse;->errorCode:Lco/bird/android/model/constant/InventoryScanningError;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/HardCountScanResponse;->failureScans:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/HardCountScanResponse;->successScans:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/HardCountScanResponse;->userFailureScans:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/HardCountScanResponse;->userSuccessScans:I

    return v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireHardCountBird;Lco/bird/android/model/constant/InventoryScanningError;IIII)Lco/bird/api/response/HardCountScanResponse;
    .locals 8

    new-instance v7, Lco/bird/api/response/HardCountScanResponse;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lco/bird/api/response/HardCountScanResponse;-><init>(Lco/bird/android/model/wire/WireHardCountBird;Lco/bird/android/model/constant/InventoryScanningError;IIII)V

    return-object v7
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/HardCountScanResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/HardCountScanResponse;

    iget-object v1, p0, Lco/bird/api/response/HardCountScanResponse;->hardCountBird:Lco/bird/android/model/wire/WireHardCountBird;

    iget-object v3, p1, Lco/bird/api/response/HardCountScanResponse;->hardCountBird:Lco/bird/android/model/wire/WireHardCountBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/HardCountScanResponse;->errorCode:Lco/bird/android/model/constant/InventoryScanningError;

    iget-object v3, p1, Lco/bird/api/response/HardCountScanResponse;->errorCode:Lco/bird/android/model/constant/InventoryScanningError;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/api/response/HardCountScanResponse;->failureScans:I

    iget v3, p1, Lco/bird/api/response/HardCountScanResponse;->failureScans:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/api/response/HardCountScanResponse;->successScans:I

    iget v3, p1, Lco/bird/api/response/HardCountScanResponse;->successScans:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/bird/api/response/HardCountScanResponse;->userFailureScans:I

    iget v3, p1, Lco/bird/api/response/HardCountScanResponse;->userFailureScans:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/bird/api/response/HardCountScanResponse;->userSuccessScans:I

    iget p1, p1, Lco/bird/api/response/HardCountScanResponse;->userSuccessScans:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getErrorCode()Lco/bird/android/model/constant/InventoryScanningError;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/HardCountScanResponse;->errorCode:Lco/bird/android/model/constant/InventoryScanningError;

    return-object v0
.end method

.method public final getFailureScans()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/HardCountScanResponse;->failureScans:I

    return v0
.end method

.method public final getHardCountBird()Lco/bird/android/model/wire/WireHardCountBird;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/HardCountScanResponse;->hardCountBird:Lco/bird/android/model/wire/WireHardCountBird;

    return-object v0
.end method

.method public final getSuccessScans()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/HardCountScanResponse;->successScans:I

    return v0
.end method

.method public final getUserFailureScans()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/HardCountScanResponse;->userFailureScans:I

    return v0
.end method

.method public final getUserSuccessScans()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/HardCountScanResponse;->userSuccessScans:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/HardCountScanResponse;->hardCountBird:Lco/bird/android/model/wire/WireHardCountBird;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireHardCountBird;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/HardCountScanResponse;->errorCode:Lco/bird/android/model/constant/InventoryScanningError;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/response/HardCountScanResponse;->failureScans:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/response/HardCountScanResponse;->successScans:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/response/HardCountScanResponse;->userFailureScans:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/response/HardCountScanResponse;->userSuccessScans:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lco/bird/api/response/HardCountScanResponse;->hardCountBird:Lco/bird/android/model/wire/WireHardCountBird;

    iget-object v1, p0, Lco/bird/api/response/HardCountScanResponse;->errorCode:Lco/bird/android/model/constant/InventoryScanningError;

    iget v2, p0, Lco/bird/api/response/HardCountScanResponse;->failureScans:I

    iget v3, p0, Lco/bird/api/response/HardCountScanResponse;->successScans:I

    iget v4, p0, Lco/bird/api/response/HardCountScanResponse;->userFailureScans:I

    iget v5, p0, Lco/bird/api/response/HardCountScanResponse;->userSuccessScans:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "HardCountScanResponse(hardCountBird="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", errorCode="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", failureScans="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", successScans="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", userFailureScans="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", userSuccessScans="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
