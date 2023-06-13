.class public final Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J8\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;",
        "",
        "enableAutoDetect",
        "",
        "detectionParameters",
        "Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;",
        "minLandmarkWidthRatio",
        "",
        "enableManualImageHeuristics",
        "(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Z)V",
        "getDetectionParameters",
        "()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;",
        "getEnableAutoDetect",
        "()Z",
        "getEnableManualImageHeuristics",
        "getMinLandmarkWidthRatio",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Z)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Companion",
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


# static fields
.field private static final ASPECT_RATIO_TOLERANCE_PERCENTAGE:D = 0.1

.field private static final BLUR_VARIANCE_TOLERANCE:D = 2.0

.field public static final Companion:Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;

.field private static final ISO_7810_ID_1_ASPECT_RATIO:D = 1.58577

.field private static final ISO_7810_ID_2_ASPECT_RATIO:D = 1.41892

.field private static final ISO_7810_ID_3_ASPECT_RATIO:D = 1.42045

.field private static final QUADRATURE_TOLERANCE_DEGREES:D = 7.0

.field private static final STANDARD_DETECTION_PARAMETERS:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

.field private static final STANDARD_MIN_SIZE:D = 0.5

.field private static final STANDARD_SELFIE_DETECTION_PARAMETERS:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

.field private static final UNRESTRICTED_MANUAL_CAPTURE:Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;


# instance fields
.field private final detectionParameters:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

.field private final enableAutoDetect:Z

.field private final enableManualImageHeuristics:Z

.field private final minLandmarkWidthRatio:Ljava/lang/Double;


# direct methods
.method public static constructor <clinit>()V
    .locals 29

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->Companion:Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v3, 0x0

    new-instance v1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v13}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)V

    const/4 v6, 0x0

    const/16 v7, 0xc

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->UNRESTRICTED_MANUAL_CAPTURE:Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    const-wide v1, 0x3ff95f505d0fa58fL    # 1.58577

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    const-wide v1, 0x3fb999999999999aL    # 0.1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    const-wide/high16 v1, 0x401c000000000000L    # 7.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v13

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v14

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v18}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->STANDARD_DETECTION_PARAMETERS:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x1

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v19, v0

    invoke-direct/range {v19 .. v28}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->STANDARD_SELFIE_DETECTION_PARAMETERS:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    return-void
.end method

.method public constructor <init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Z)V
    .locals 1

    const-string v0, "detectionParameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableAutoDetect:Z

    iput-object p2, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->detectionParameters:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    iput-object p3, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->minLandmarkWidthRatio:Ljava/lang/Double;

    iput-boolean p4, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableManualImageHeuristics:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Z)V

    return-void
.end method

.method public static final synthetic access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->STANDARD_DETECTION_PARAMETERS:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    return-object v0
.end method

.method public static final synthetic access$getSTANDARD_SELFIE_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->STANDARD_SELFIE_DETECTION_PARAMETERS:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    return-object v0
.end method

.method public static final synthetic access$getUNRESTRICTED_MANUAL_CAPTURE$cp()Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->UNRESTRICTED_MANUAL_CAPTURE:Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    return-object v0
.end method

.method public static synthetic copy$default(Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableAutoDetect:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->detectionParameters:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->minLandmarkWidthRatio:Ljava/lang/Double;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableManualImageHeuristics:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->copy(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Z)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableAutoDetect:Z

    return v0
.end method

.method public final component2()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->detectionParameters:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    return-object v0
.end method

.method public final component3()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->minLandmarkWidthRatio:Ljava/lang/Double;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableManualImageHeuristics:Z

    return v0
.end method

.method public final copy(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Z)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;
    .locals 1

    const-string v0, "detectionParameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    iget-boolean v1, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableAutoDetect:Z

    iget-boolean v3, p1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableAutoDetect:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->detectionParameters:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->detectionParameters:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->minLandmarkWidthRatio:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->minLandmarkWidthRatio:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableManualImageHeuristics:Z

    iget-boolean p1, p1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableManualImageHeuristics:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDetectionParameters()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->detectionParameters:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    return-object v0
.end method

.method public final getEnableAutoDetect()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableAutoDetect:Z

    return v0
.end method

.method public final getEnableManualImageHeuristics()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableManualImageHeuristics:Z

    return v0
.end method

.method public final getMinLandmarkWidthRatio()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->minLandmarkWidthRatio:Ljava/lang/Double;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableAutoDetect:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->detectionParameters:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->minLandmarkWidthRatio:Ljava/lang/Double;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableManualImageHeuristics:Z

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableAutoDetect:Z

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->detectionParameters:Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->minLandmarkWidthRatio:Ljava/lang/Double;

    iget-boolean v3, p0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->enableManualImageHeuristics:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "IdentificationDocumentScannerStrategy(enableAutoDetect="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", detectionParameters="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", minLandmarkWidthRatio="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enableManualImageHeuristics="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
