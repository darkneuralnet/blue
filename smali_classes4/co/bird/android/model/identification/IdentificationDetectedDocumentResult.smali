.class public final Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003JJ\u0010\u001c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u0014\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006$"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;",
        "",
        "rectangleDetected",
        "",
        "blurVariance",
        "",
        "faceDetected",
        "stringDetectionResult",
        "Lco/bird/android/model/identification/IdentificationDetectedStringsResult;",
        "image",
        "",
        "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Lco/bird/android/model/identification/IdentificationDetectedStringsResult;[B)V",
        "getBlurVariance",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getFaceDetected",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getImage",
        "()[B",
        "getRectangleDetected",
        "getStringDetectionResult",
        "()Lco/bird/android/model/identification/IdentificationDetectedStringsResult;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Lco/bird/android/model/identification/IdentificationDetectedStringsResult;[B)Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;",
        "equals",
        "other",
        "hashCode",
        "",
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
.field private final blurVariance:Ljava/lang/Double;

.field private final faceDetected:Ljava/lang/Boolean;

.field private final image:[B

.field private final rectangleDetected:Ljava/lang/Boolean;

.field private final stringDetectionResult:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Lco/bird/android/model/identification/IdentificationDetectedStringsResult;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->rectangleDetected:Ljava/lang/Boolean;

    iput-object p2, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->blurVariance:Ljava/lang/Double;

    iput-object p3, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->faceDetected:Ljava/lang/Boolean;

    iput-object p4, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->stringDetectionResult:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;

    iput-object p5, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->image:[B

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Lco/bird/android/model/identification/IdentificationDetectedStringsResult;[BILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->rectangleDetected:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->blurVariance:Ljava/lang/Double;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->faceDetected:Ljava/lang/Boolean;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->stringDetectionResult:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->image:[B

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->copy(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Lco/bird/android/model/identification/IdentificationDetectedStringsResult;[B)Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->rectangleDetected:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->blurVariance:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->faceDetected:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/identification/IdentificationDetectedStringsResult;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->stringDetectionResult:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;

    return-object v0
.end method

.method public final component5()[B
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->image:[B

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Lco/bird/android/model/identification/IdentificationDetectedStringsResult;[B)Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;
    .locals 7

    new-instance v6, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Lco/bird/android/model/identification/IdentificationDetectedStringsResult;[B)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const-class v1, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type co.bird.android.model.identification.IdentificationDetectedDocumentResult"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->rectangleDetected:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->rectangleDetected:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->blurVariance:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->blurVariance:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Double;Ljava/lang/Double;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->faceDetected:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->faceDetected:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->stringDetectionResult:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->stringDetectionResult:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->image:[B

    if-eqz v1, :cond_8

    iget-object p1, p1, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->image:[B

    if-nez p1, :cond_7

    return v2

    :cond_7
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_8
    iget-object p1, p1, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->image:[B

    if-eqz p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBlurVariance()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->blurVariance:Ljava/lang/Double;

    return-object v0
.end method

.method public final getFaceDetected()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->faceDetected:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getImage()[B
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->image:[B

    return-object v0
.end method

.method public final getRectangleDetected()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->rectangleDetected:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStringDetectionResult()Lco/bird/android/model/identification/IdentificationDetectedStringsResult;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->stringDetectionResult:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->rectangleDetected:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->blurVariance:Ljava/lang/Double;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->faceDetected:Ljava/lang/Boolean;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->stringDetectionResult:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    move v2, v1

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->image:[B

    if-eqz v2, :cond_4

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    :cond_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->rectangleDetected:Ljava/lang/Boolean;

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->blurVariance:Ljava/lang/Double;

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->faceDetected:Ljava/lang/Boolean;

    iget-object v3, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->stringDetectionResult:Lco/bird/android/model/identification/IdentificationDetectedStringsResult;

    iget-object v4, p0, Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;->image:[B

    invoke-static {v4}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "IdentificationDetectedDocumentResult(rectangleDetected="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", blurVariance="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", faceDetected="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stringDetectionResult="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", image="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
