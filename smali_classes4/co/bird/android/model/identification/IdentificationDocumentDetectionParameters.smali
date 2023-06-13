.class public final Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bc\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010%\u001a\u00020\tH\u00c6\u0003J|\u0010&\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\u0013\u0010(\u001a\u00020\t2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0014\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0019\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u001a\u0010\u0011R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006."
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;",
        "",
        "aspectRatio",
        "",
        "aspectRatioTolerancePercent",
        "quadratureToleranceDegrees",
        "minimumSize",
        "blurVarianceThreshold",
        "faceRequired",
        "",
        "stringRequirements",
        "",
        "Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;",
        "minLandmarkWidthRatio",
        "enableManualImageHeuristics",
        "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)V",
        "getAspectRatio",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getAspectRatioTolerancePercent",
        "getBlurVarianceThreshold",
        "getEnableManualImageHeuristics",
        "()Z",
        "getFaceRequired",
        "getMinLandmarkWidthRatio",
        "getMinimumSize",
        "getQuadratureToleranceDegrees",
        "getStringRequirements",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;",
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
.field private final aspectRatio:Ljava/lang/Double;

.field private final aspectRatioTolerancePercent:Ljava/lang/Double;

.field private final blurVarianceThreshold:Ljava/lang/Double;

.field private final enableManualImageHeuristics:Z

.field private final faceRequired:Z

.field private final minLandmarkWidthRatio:Ljava/lang/Double;

.field private final minimumSize:Ljava/lang/Double;

.field private final quadratureToleranceDegrees:Ljava/lang/Double;

.field private final stringRequirements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Z",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;",
            ">;",
            "Ljava/lang/Double;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatio:Ljava/lang/Double;

    iput-object p2, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatioTolerancePercent:Ljava/lang/Double;

    iput-object p3, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->quadratureToleranceDegrees:Ljava/lang/Double;

    iput-object p4, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minimumSize:Ljava/lang/Double;

    iput-object p5, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->blurVarianceThreshold:Ljava/lang/Double;

    iput-boolean p6, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->faceRequired:Z

    iput-object p7, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->stringRequirements:Ljava/util/List;

    iput-object p8, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minLandmarkWidthRatio:Ljava/lang/Double;

    iput-boolean p9, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->enableManualImageHeuristics:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v7, v0

    goto :goto_0

    :cond_0
    move/from16 v7, p6

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatio:Ljava/lang/Double;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatioTolerancePercent:Ljava/lang/Double;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->quadratureToleranceDegrees:Ljava/lang/Double;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minimumSize:Ljava/lang/Double;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->blurVarianceThreshold:Ljava/lang/Double;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->faceRequired:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->stringRequirements:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minLandmarkWidthRatio:Ljava/lang/Double;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-boolean v1, v0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->enableManualImageHeuristics:Z

    goto :goto_8

    :cond_8
    move/from16 v1, p9

    :goto_8
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatio:Ljava/lang/Double;

    return-object v0
.end method

.method public final component2()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatioTolerancePercent:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->quadratureToleranceDegrees:Ljava/lang/Double;

    return-object v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minimumSize:Ljava/lang/Double;

    return-object v0
.end method

.method public final component5()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->blurVarianceThreshold:Ljava/lang/Double;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->faceRequired:Z

    return v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->stringRequirements:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minLandmarkWidthRatio:Ljava/lang/Double;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->enableManualImageHeuristics:Z

    return v0
.end method

.method public final copy(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Z",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;",
            ">;",
            "Ljava/lang/Double;",
            "Z)",
            "Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;"
        }
    .end annotation

    new-instance v10, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-object v0, v10

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)V

    return-object v10
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatio:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatio:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatioTolerancePercent:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatioTolerancePercent:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->quadratureToleranceDegrees:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->quadratureToleranceDegrees:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minimumSize:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minimumSize:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->blurVarianceThreshold:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->blurVarianceThreshold:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->faceRequired:Z

    iget-boolean v3, p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->faceRequired:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->stringRequirements:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->stringRequirements:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minLandmarkWidthRatio:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minLandmarkWidthRatio:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->enableManualImageHeuristics:Z

    iget-boolean p1, p1, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->enableManualImageHeuristics:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAspectRatio()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatio:Ljava/lang/Double;

    return-object v0
.end method

.method public final getAspectRatioTolerancePercent()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatioTolerancePercent:Ljava/lang/Double;

    return-object v0
.end method

.method public final getBlurVarianceThreshold()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->blurVarianceThreshold:Ljava/lang/Double;

    return-object v0
.end method

.method public final getEnableManualImageHeuristics()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->enableManualImageHeuristics:Z

    return v0
.end method

.method public final getFaceRequired()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->faceRequired:Z

    return v0
.end method

.method public final getMinLandmarkWidthRatio()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minLandmarkWidthRatio:Ljava/lang/Double;

    return-object v0
.end method

.method public final getMinimumSize()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minimumSize:Ljava/lang/Double;

    return-object v0
.end method

.method public final getQuadratureToleranceDegrees()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->quadratureToleranceDegrees:Ljava/lang/Double;

    return-object v0
.end method

.method public final getStringRequirements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->stringRequirements:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatio:Ljava/lang/Double;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatioTolerancePercent:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->quadratureToleranceDegrees:Ljava/lang/Double;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minimumSize:Ljava/lang/Double;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->blurVarianceThreshold:Ljava/lang/Double;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->faceRequired:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_5

    move v2, v3

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->stringRequirements:Ljava/util/List;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_5

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minLandmarkWidthRatio:Ljava/lang/Double;

    if-nez v2, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->enableManualImageHeuristics:Z

    if-eqz v1, :cond_8

    goto :goto_7

    :cond_8
    move v3, v1

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatio:Ljava/lang/Double;

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->aspectRatioTolerancePercent:Ljava/lang/Double;

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->quadratureToleranceDegrees:Ljava/lang/Double;

    iget-object v3, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minimumSize:Ljava/lang/Double;

    iget-object v4, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->blurVarianceThreshold:Ljava/lang/Double;

    iget-boolean v5, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->faceRequired:Z

    iget-object v6, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->stringRequirements:Ljava/util/List;

    iget-object v7, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->minLandmarkWidthRatio:Ljava/lang/Double;

    iget-boolean v8, p0, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->enableManualImageHeuristics:Z

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "IdentificationDocumentDetectionParameters(aspectRatio="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aspectRatioTolerancePercent="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", quadratureToleranceDegrees="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", minimumSize="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", blurVarianceThreshold="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", faceRequired="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", stringRequirements="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", minLandmarkWidthRatio="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enableManualImageHeuristics="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
