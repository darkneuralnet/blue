.class public final Lco/bird/android/model/wire/configs/LeaseTypeConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\"\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bi\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003Jm\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\tH\u00c6\u0001J\u0013\u0010(\u001a\u00020\u00032\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\tH\u00d6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001R\u0016\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0014R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0014\u00a8\u0006-"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/LeaseTypeConfig;",
        "",
        "enabled",
        "",
        "initialChargeAmount",
        "",
        "delinquentFeeAmount",
        "returnRefundAmount",
        "leaseDurationSeconds",
        "",
        "autoscanTimeoutSeconds",
        "autoscanRequiredToStart",
        "autoscanRequiredToEnd",
        "returnLeaseAssetMaxUploadAttempts",
        "leaseExemptionDurationSeconds",
        "(ZJJJIJZZJI)V",
        "getAutoscanRequiredToEnd",
        "()Z",
        "getAutoscanRequiredToStart",
        "getAutoscanTimeoutSeconds",
        "()J",
        "getDelinquentFeeAmount",
        "getEnabled",
        "getInitialChargeAmount",
        "getLeaseDurationSeconds",
        "()I",
        "getLeaseExemptionDurationSeconds",
        "getReturnLeaseAssetMaxUploadAttempts",
        "getReturnRefundAmount",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
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
.field private final autoscanRequiredToEnd:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "autoscan_required_to_end"
    .end annotation

    .annotation runtime Lft5;
        value = "autoscan_required_to_end"
    .end annotation
.end field

.field private final autoscanRequiredToStart:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "autoscan_required_to_start"
    .end annotation

    .annotation runtime Lft5;
        value = "autoscan_required_to_start"
    .end annotation
.end field

.field private final autoscanTimeoutSeconds:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "autoscan_timeout_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "autoscan_timeout_seconds"
    .end annotation
.end field

.field private final delinquentFeeAmount:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "delinquent_fee_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "delinquent_fee_amount"
    .end annotation
.end field

.field private final enabled:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enabled"
    .end annotation

    .annotation runtime Lft5;
        value = "enabled"
    .end annotation
.end field

.field private final initialChargeAmount:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "initial_charge_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "initial_charge_amount"
    .end annotation
.end field

.field private final leaseDurationSeconds:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lease_duration_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "lease_duration_seconds"
    .end annotation
.end field

.field private final leaseExemptionDurationSeconds:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lease_exemption_duration_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "lease_exemption_duration_seconds"
    .end annotation
.end field

.field private final returnLeaseAssetMaxUploadAttempts:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "return_lease_asset_max_upload_attempts"
    .end annotation

    .annotation runtime Lft5;
        value = "return_lease_asset_max_upload_attempts"
    .end annotation
.end field

.field private final returnRefundAmount:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "return_refund_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "return_refund_amount"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x3ff

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lco/bird/android/model/wire/configs/LeaseTypeConfig;-><init>(ZJJJIJZZJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZJJJIJZZJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->enabled:Z

    iput-wide p2, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->initialChargeAmount:J

    iput-wide p4, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->delinquentFeeAmount:J

    iput-wide p6, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnRefundAmount:J

    iput p8, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseDurationSeconds:I

    iput-wide p9, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanTimeoutSeconds:J

    iput-boolean p11, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToStart:Z

    iput-boolean p12, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToEnd:Z

    iput-wide p13, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnLeaseAssetMaxUploadAttempts:J

    iput p15, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseExemptionDurationSeconds:I

    return-void
.end method

.method public synthetic constructor <init>(ZJJJIJZZJIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_1

    move-wide v6, v4

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    move-wide v8, v4

    goto :goto_2

    :cond_2
    move-wide/from16 v8, p4

    :goto_2
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    move-wide/from16 v4, p6

    :goto_3
    and-int/lit8 v3, v0, 0x10

    if-eqz v3, :cond_4

    move v3, v2

    goto :goto_4

    :cond_4
    move/from16 v3, p8

    :goto_4
    and-int/lit8 v10, v0, 0x20

    const-wide/16 v11, 0x5

    if-eqz v10, :cond_5

    move-wide v13, v11

    goto :goto_5

    :cond_5
    move-wide/from16 v13, p9

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    move v10, v2

    goto :goto_6

    :cond_6
    move/from16 v10, p11

    :goto_6
    and-int/lit16 v15, v0, 0x80

    if-eqz v15, :cond_7

    goto :goto_7

    :cond_7
    move/from16 v2, p12

    :goto_7
    and-int/lit16 v15, v0, 0x100

    if-eqz v15, :cond_8

    goto :goto_8

    :cond_8
    move-wide/from16 v11, p13

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    const/16 v0, 0x12c

    goto :goto_9

    :cond_9
    move/from16 v0, p15

    :goto_9
    move-object/from16 p1, p0

    move/from16 p2, v1

    move-wide/from16 p3, v6

    move-wide/from16 p5, v8

    move-wide/from16 p7, v4

    move/from16 p9, v3

    move-wide/from16 p10, v13

    move/from16 p12, v10

    move/from16 p13, v2

    move-wide/from16 p14, v11

    move/from16 p16, v0

    invoke-direct/range {p1 .. p16}, Lco/bird/android/model/wire/configs/LeaseTypeConfig;-><init>(ZJJJIJZZJI)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/LeaseTypeConfig;ZJJJIJZZJIILjava/lang/Object;)Lco/bird/android/model/wire/configs/LeaseTypeConfig;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->enabled:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->initialChargeAmount:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-wide v5, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->delinquentFeeAmount:J

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p4

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-wide v7, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnRefundAmount:J

    goto :goto_3

    :cond_3
    move-wide/from16 v7, p6

    :goto_3
    and-int/lit8 v9, v1, 0x10

    if-eqz v9, :cond_4

    iget v9, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseDurationSeconds:I

    goto :goto_4

    :cond_4
    move/from16 v9, p8

    :goto_4
    and-int/lit8 v10, v1, 0x20

    if-eqz v10, :cond_5

    iget-wide v10, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanTimeoutSeconds:J

    goto :goto_5

    :cond_5
    move-wide/from16 v10, p9

    :goto_5
    and-int/lit8 v12, v1, 0x40

    if-eqz v12, :cond_6

    iget-boolean v12, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToStart:Z

    goto :goto_6

    :cond_6
    move/from16 v12, p11

    :goto_6
    and-int/lit16 v13, v1, 0x80

    if-eqz v13, :cond_7

    iget-boolean v13, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToEnd:Z

    goto :goto_7

    :cond_7
    move/from16 v13, p12

    :goto_7
    and-int/lit16 v14, v1, 0x100

    if-eqz v14, :cond_8

    iget-wide v14, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnLeaseAssetMaxUploadAttempts:J

    goto :goto_8

    :cond_8
    move-wide/from16 v14, p13

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget v1, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseExemptionDurationSeconds:I

    goto :goto_9

    :cond_9
    move/from16 v1, p15

    :goto_9
    move/from16 p1, v2

    move-wide/from16 p2, v3

    move-wide/from16 p4, v5

    move-wide/from16 p6, v7

    move/from16 p8, v9

    move-wide/from16 p9, v10

    move/from16 p11, v12

    move/from16 p12, v13

    move-wide/from16 p13, v14

    move/from16 p15, v1

    invoke-virtual/range {p0 .. p15}, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->copy(ZJJJIJZZJI)Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->enabled:Z

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseExemptionDurationSeconds:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->initialChargeAmount:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->delinquentFeeAmount:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnRefundAmount:J

    return-wide v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseDurationSeconds:I

    return v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanTimeoutSeconds:J

    return-wide v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToStart:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToEnd:Z

    return v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnLeaseAssetMaxUploadAttempts:J

    return-wide v0
.end method

.method public final copy(ZJJJIJZZJI)Lco/bird/android/model/wire/configs/LeaseTypeConfig;
    .locals 17

    new-instance v16, Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    move-object/from16 v0, v16

    move/from16 v1, p1

    move-wide/from16 v2, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move/from16 v8, p8

    move-wide/from16 v9, p9

    move/from16 v11, p11

    move/from16 v12, p12

    move-wide/from16 v13, p13

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Lco/bird/android/model/wire/configs/LeaseTypeConfig;-><init>(ZJJJIJZZJI)V

    return-object v16
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->enabled:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->enabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->initialChargeAmount:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->initialChargeAmount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->delinquentFeeAmount:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->delinquentFeeAmount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnRefundAmount:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnRefundAmount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseDurationSeconds:I

    iget v3, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseDurationSeconds:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanTimeoutSeconds:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanTimeoutSeconds:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToStart:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToStart:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToEnd:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToEnd:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnLeaseAssetMaxUploadAttempts:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnLeaseAssetMaxUploadAttempts:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseExemptionDurationSeconds:I

    iget p1, p1, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseExemptionDurationSeconds:I

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAutoscanRequiredToEnd()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToEnd:Z

    return v0
.end method

.method public final getAutoscanRequiredToStart()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToStart:Z

    return v0
.end method

.method public final getAutoscanTimeoutSeconds()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanTimeoutSeconds:J

    return-wide v0
.end method

.method public final getDelinquentFeeAmount()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->delinquentFeeAmount:J

    return-wide v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->enabled:Z

    return v0
.end method

.method public final getInitialChargeAmount()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->initialChargeAmount:J

    return-wide v0
.end method

.method public final getLeaseDurationSeconds()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseDurationSeconds:I

    return v0
.end method

.method public final getLeaseExemptionDurationSeconds()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseExemptionDurationSeconds:I

    return v0
.end method

.method public final getReturnLeaseAssetMaxUploadAttempts()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnLeaseAssetMaxUploadAttempts:J

    return-wide v0
.end method

.method public final getReturnRefundAmount()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnRefundAmount:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->enabled:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->initialChargeAmount:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->delinquentFeeAmount:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnRefundAmount:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseDurationSeconds:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanTimeoutSeconds:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToStart:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToEnd:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnLeaseAssetMaxUploadAttempts:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseExemptionDurationSeconds:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->enabled:Z

    iget-wide v2, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->initialChargeAmount:J

    iget-wide v4, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->delinquentFeeAmount:J

    iget-wide v6, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnRefundAmount:J

    iget v8, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseDurationSeconds:I

    iget-wide v9, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanTimeoutSeconds:J

    iget-boolean v11, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToStart:Z

    iget-boolean v12, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->autoscanRequiredToEnd:Z

    iget-wide v13, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->returnLeaseAssetMaxUploadAttempts:J

    iget v15, v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->leaseExemptionDurationSeconds:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v16, v15

    const-string v15, "LeaseTypeConfig(enabled="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", initialChargeAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", delinquentFeeAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", returnRefundAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", leaseDurationSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", autoscanTimeoutSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", autoscanRequiredToStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", autoscanRequiredToEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", returnLeaseAssetMaxUploadAttempts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", leaseExemptionDurationSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
