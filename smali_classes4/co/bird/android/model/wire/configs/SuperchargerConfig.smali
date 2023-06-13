.class public final Lco/bird/android/model/wire/configs/SuperchargerConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u001d\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BU\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003JY\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\"\u001a\u00020\u00032\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0016\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0013\u00a8\u0006\'"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/SuperchargerConfig;",
        "",
        "enableSupercharger",
        "",
        "userTracksReportingPeriodSeconds",
        "",
        "userTracksBluetoothScanDurationSeconds",
        "markMissingThresholdRadiusMeters",
        "",
        "markMissingBirdFinderRequiredIntervalSeconds",
        "specialTaskCapturedRequirementDisabledCountdownSeconds",
        "enableUpdatedPostCaptureRequirementFailurePopup",
        "enableUpdatedPostClaimRequirementFailurePopup",
        "(ZIIFIIZZ)V",
        "getEnableSupercharger",
        "()Z",
        "getEnableUpdatedPostCaptureRequirementFailurePopup",
        "getEnableUpdatedPostClaimRequirementFailurePopup",
        "getMarkMissingBirdFinderRequiredIntervalSeconds",
        "()I",
        "getMarkMissingThresholdRadiusMeters",
        "()F",
        "getSpecialTaskCapturedRequirementDisabledCountdownSeconds",
        "getUserTracksBluetoothScanDurationSeconds",
        "getUserTracksReportingPeriodSeconds",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
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
.field private final enableSupercharger:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_supercharger"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_supercharger"
    .end annotation
.end field

.field private final enableUpdatedPostCaptureRequirementFailurePopup:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_updated_post_capture_requirement_failure_popup"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_updated_post_capture_requirement_failure_popup"
    .end annotation
.end field

.field private final enableUpdatedPostClaimRequirementFailurePopup:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_updated_post_claim_requirement_failure_popup"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_updated_post_claim_requirement_failure_popup"
    .end annotation
.end field

.field private final markMissingBirdFinderRequiredIntervalSeconds:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mark_missing_bird_finder_required_interval_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "mark_missing_bird_finder_required_interval_seconds"
    .end annotation
.end field

.field private final markMissingThresholdRadiusMeters:F
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mark_missing_threshold_radius_meters"
    .end annotation

    .annotation runtime Lft5;
        value = "mark_missing_threshold_radius_meters"
    .end annotation
.end field

.field private final specialTaskCapturedRequirementDisabledCountdownSeconds:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "special_task_captured_requirement_disabled_countdown_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "special_task_captured_requirement_disabled_countdown_seconds"
    .end annotation
.end field

.field private final userTracksBluetoothScanDurationSeconds:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "user_tracks_bluetooth_scan_duration_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "user_tracks_bluetooth_scan_duration_seconds"
    .end annotation
.end field

.field private final userTracksReportingPeriodSeconds:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "user_tracks_reporting_period_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "user_tracks_reporting_period_seconds"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 11

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xff

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lco/bird/android/model/wire/configs/SuperchargerConfig;-><init>(ZIIFIIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZIIFIIZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableSupercharger:Z

    iput p2, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksReportingPeriodSeconds:I

    iput p3, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksBluetoothScanDurationSeconds:I

    iput p4, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingThresholdRadiusMeters:F

    iput p5, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingBirdFinderRequiredIntervalSeconds:I

    iput p6, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->specialTaskCapturedRequirementDisabledCountdownSeconds:I

    iput-boolean p7, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostCaptureRequirementFailurePopup:Z

    iput-boolean p8, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostClaimRequirementFailurePopup:Z

    return-void
.end method

.method public synthetic constructor <init>(ZIIFIIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/16 v3, 0x1e

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x5

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/high16 v5, 0x42c80000    # 100.0f

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/16 v6, 0xa

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/16 v7, 0x12c

    goto :goto_5

    :cond_5
    move v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move v8, v2

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    goto :goto_7

    :cond_7
    move/from16 v2, p8

    :goto_7
    move-object p1, p0

    move p2, v1

    move p3, v3

    move p4, v4

    move p5, v5

    move p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v2

    invoke-direct/range {p1 .. p9}, Lco/bird/android/model/wire/configs/SuperchargerConfig;-><init>(ZIIFIIZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/SuperchargerConfig;ZIIFIIZZILjava/lang/Object;)Lco/bird/android/model/wire/configs/SuperchargerConfig;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableSupercharger:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksReportingPeriodSeconds:I

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksBluetoothScanDurationSeconds:I

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingThresholdRadiusMeters:F

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingBirdFinderRequiredIntervalSeconds:I

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->specialTaskCapturedRequirementDisabledCountdownSeconds:I

    goto :goto_5

    :cond_5
    move v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostCaptureRequirementFailurePopup:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-boolean v1, v0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostClaimRequirementFailurePopup:Z

    goto :goto_7

    :cond_7
    move/from16 v1, p8

    :goto_7
    move p1, v2

    move p2, v3

    move p3, v4

    move p4, v5

    move p5, v6

    move p6, v7

    move/from16 p7, v8

    move/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lco/bird/android/model/wire/configs/SuperchargerConfig;->copy(ZIIFIIZZ)Lco/bird/android/model/wire/configs/SuperchargerConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableSupercharger:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksReportingPeriodSeconds:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksBluetoothScanDurationSeconds:I

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingThresholdRadiusMeters:F

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingBirdFinderRequiredIntervalSeconds:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->specialTaskCapturedRequirementDisabledCountdownSeconds:I

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostCaptureRequirementFailurePopup:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostClaimRequirementFailurePopup:Z

    return v0
.end method

.method public final copy(ZIIFIIZZ)Lco/bird/android/model/wire/configs/SuperchargerConfig;
    .locals 10

    new-instance v9, Lco/bird/android/model/wire/configs/SuperchargerConfig;

    move-object v0, v9

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/wire/configs/SuperchargerConfig;-><init>(ZIIFIIZZ)V

    return-object v9
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/SuperchargerConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/SuperchargerConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableSupercharger:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableSupercharger:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksReportingPeriodSeconds:I

    iget v3, p1, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksReportingPeriodSeconds:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksBluetoothScanDurationSeconds:I

    iget v3, p1, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksBluetoothScanDurationSeconds:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingThresholdRadiusMeters:F

    iget v3, p1, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingThresholdRadiusMeters:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingBirdFinderRequiredIntervalSeconds:I

    iget v3, p1, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingBirdFinderRequiredIntervalSeconds:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->specialTaskCapturedRequirementDisabledCountdownSeconds:I

    iget v3, p1, Lco/bird/android/model/wire/configs/SuperchargerConfig;->specialTaskCapturedRequirementDisabledCountdownSeconds:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostCaptureRequirementFailurePopup:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostCaptureRequirementFailurePopup:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostClaimRequirementFailurePopup:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostClaimRequirementFailurePopup:Z

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getEnableSupercharger()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableSupercharger:Z

    return v0
.end method

.method public final getEnableUpdatedPostCaptureRequirementFailurePopup()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostCaptureRequirementFailurePopup:Z

    return v0
.end method

.method public final getEnableUpdatedPostClaimRequirementFailurePopup()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostClaimRequirementFailurePopup:Z

    return v0
.end method

.method public final getMarkMissingBirdFinderRequiredIntervalSeconds()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingBirdFinderRequiredIntervalSeconds:I

    return v0
.end method

.method public final getMarkMissingThresholdRadiusMeters()F
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingThresholdRadiusMeters:F

    return v0
.end method

.method public final getSpecialTaskCapturedRequirementDisabledCountdownSeconds()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->specialTaskCapturedRequirementDisabledCountdownSeconds:I

    return v0
.end method

.method public final getUserTracksBluetoothScanDurationSeconds()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksBluetoothScanDurationSeconds:I

    return v0
.end method

.method public final getUserTracksReportingPeriodSeconds()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksReportingPeriodSeconds:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableSupercharger:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksReportingPeriodSeconds:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksBluetoothScanDurationSeconds:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingThresholdRadiusMeters:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingBirdFinderRequiredIntervalSeconds:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->specialTaskCapturedRequirementDisabledCountdownSeconds:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostCaptureRequirementFailurePopup:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostClaimRequirementFailurePopup:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableSupercharger:Z

    iget v1, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksReportingPeriodSeconds:I

    iget v2, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->userTracksBluetoothScanDurationSeconds:I

    iget v3, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingThresholdRadiusMeters:F

    iget v4, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->markMissingBirdFinderRequiredIntervalSeconds:I

    iget v5, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->specialTaskCapturedRequirementDisabledCountdownSeconds:I

    iget-boolean v6, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostCaptureRequirementFailurePopup:Z

    iget-boolean v7, p0, Lco/bird/android/model/wire/configs/SuperchargerConfig;->enableUpdatedPostClaimRequirementFailurePopup:Z

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SuperchargerConfig(enableSupercharger="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", userTracksReportingPeriodSeconds="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", userTracksBluetoothScanDurationSeconds="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", markMissingThresholdRadiusMeters="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", markMissingBirdFinderRequiredIntervalSeconds="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", specialTaskCapturedRequirementDisabledCountdownSeconds="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", enableUpdatedPostCaptureRequirementFailurePopup="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableUpdatedPostClaimRequirementFailurePopup="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
