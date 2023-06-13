.class public final Lco/bird/android/model/identification/IdentificationDebugResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationDebugResponse;",
        "",
        "userAge",
        "",
        "expirationDays",
        "score",
        "",
        "ingestionResult",
        "Lco/bird/android/model/identification/IdentificationIngestionResult;",
        "secondsToResult",
        "(IIDLco/bird/android/model/identification/IdentificationIngestionResult;I)V",
        "getExpirationDays",
        "()I",
        "getIngestionResult",
        "()Lco/bird/android/model/identification/IdentificationIngestionResult;",
        "getScore",
        "()D",
        "getSecondsToResult",
        "getUserAge",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "model_release"
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
.field private final expirationDays:I

.field private final ingestionResult:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field private final score:D

.field private final secondsToResult:I

.field private final userAge:I


# direct methods
.method public constructor <init>(IIDLco/bird/android/model/identification/IdentificationIngestionResult;I)V
    .locals 1

    const-string v0, "ingestionResult"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->userAge:I

    iput p2, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->expirationDays:I

    iput-wide p3, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->score:D

    iput-object p5, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->ingestionResult:Lco/bird/android/model/identification/IdentificationIngestionResult;

    iput p6, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->secondsToResult:I

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/identification/IdentificationDebugResponse;IIDLco/bird/android/model/identification/IdentificationIngestionResult;IILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDebugResponse;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->userAge:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->expirationDays:I

    :cond_1
    move p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-wide p3, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->score:D

    :cond_2
    move-wide v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p5, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->ingestionResult:Lco/bird/android/model/identification/IdentificationIngestionResult;

    :cond_3
    move-object v2, p5

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget p6, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->secondsToResult:I

    :cond_4
    move v3, p6

    move-object p2, p0

    move p3, p1

    move p4, p8

    move-wide p5, v0

    move-object p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/android/model/identification/IdentificationDebugResponse;->copy(IIDLco/bird/android/model/identification/IdentificationIngestionResult;I)Lco/bird/android/model/identification/IdentificationDebugResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->userAge:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->expirationDays:I

    return v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->score:D

    return-wide v0
.end method

.method public final component4()Lco/bird/android/model/identification/IdentificationIngestionResult;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->ingestionResult:Lco/bird/android/model/identification/IdentificationIngestionResult;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->secondsToResult:I

    return v0
.end method

.method public final copy(IIDLco/bird/android/model/identification/IdentificationIngestionResult;I)Lco/bird/android/model/identification/IdentificationDebugResponse;
    .locals 8

    const-string v0, "ingestionResult"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/identification/IdentificationDebugResponse;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-wide v4, p3

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/identification/IdentificationDebugResponse;-><init>(IIDLco/bird/android/model/identification/IdentificationIngestionResult;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/identification/IdentificationDebugResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/identification/IdentificationDebugResponse;

    iget v1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->userAge:I

    iget v3, p1, Lco/bird/android/model/identification/IdentificationDebugResponse;->userAge:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->expirationDays:I

    iget v3, p1, Lco/bird/android/model/identification/IdentificationDebugResponse;->expirationDays:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->score:D

    iget-wide v5, p1, Lco/bird/android/model/identification/IdentificationDebugResponse;->score:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->ingestionResult:Lco/bird/android/model/identification/IdentificationIngestionResult;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDebugResponse;->ingestionResult:Lco/bird/android/model/identification/IdentificationIngestionResult;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->secondsToResult:I

    iget p1, p1, Lco/bird/android/model/identification/IdentificationDebugResponse;->secondsToResult:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getExpirationDays()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->expirationDays:I

    return v0
.end method

.method public final getIngestionResult()Lco/bird/android/model/identification/IdentificationIngestionResult;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->ingestionResult:Lco/bird/android/model/identification/IdentificationIngestionResult;

    return-object v0
.end method

.method public final getScore()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->score:D

    return-wide v0
.end method

.method public final getSecondsToResult()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->secondsToResult:I

    return v0
.end method

.method public final getUserAge()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->userAge:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->userAge:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->expirationDays:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->score:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->ingestionResult:Lco/bird/android/model/identification/IdentificationIngestionResult;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->secondsToResult:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->userAge:I

    iget v1, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->expirationDays:I

    iget-wide v2, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->score:D

    iget-object v4, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->ingestionResult:Lco/bird/android/model/identification/IdentificationIngestionResult;

    iget v5, p0, Lco/bird/android/model/identification/IdentificationDebugResponse;->secondsToResult:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "IdentificationDebugResponse(userAge="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", expirationDays="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", score="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", ingestionResult="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondsToResult="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
