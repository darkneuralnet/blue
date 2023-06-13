.class public final Lco/bird/api/response/OperatorBatchStatusResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0012\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0010H\u00c6\u0003J\u000f\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\u000f\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0012H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\t\u00107\u001a\u00020\u000eH\u00c6\u0003J\u00a3\u0001\u00108\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00122\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u00109\u001a\u00020:2\u0008\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u0006H\u00d6\u0001J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u001c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u001c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010 R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0016\u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u001b\u00a8\u0006>"
    }
    d2 = {
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        "",
        "batchId",
        "",
        "jobId",
        "failedCount",
        "",
        "failMessage",
        "successCount",
        "successMessage",
        "birdCount",
        "action",
        "Lco/bird/api/response/OpsBatchJobActionKind;",
        "state",
        "Lco/bird/api/response/OpsBatchJobStatus;",
        "kind",
        "Lco/bird/api/response/OpsBatchJobKind;",
        "errors",
        "",
        "Lco/bird/api/response/OperatorBatchError;",
        "notices",
        "Lco/bird/api/response/OperatorBatchNotice;",
        "batchNotice",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILco/bird/api/response/OpsBatchJobActionKind;Lco/bird/api/response/OpsBatchJobStatus;Lco/bird/api/response/OpsBatchJobKind;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V",
        "getAction",
        "()Lco/bird/api/response/OpsBatchJobActionKind;",
        "getBatchId",
        "()Ljava/lang/String;",
        "getBatchNotice",
        "getBirdCount",
        "()I",
        "getErrors",
        "()Ljava/util/List;",
        "getFailMessage",
        "getFailedCount",
        "getJobId",
        "getKind",
        "()Lco/bird/api/response/OpsBatchJobKind;",
        "getNotices",
        "getState",
        "()Lco/bird/api/response/OpsBatchJobStatus;",
        "getSuccessCount",
        "getSuccessMessage",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
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
.field private final action:Lco/bird/api/response/OpsBatchJobActionKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "action"
    .end annotation

    .annotation runtime Lft5;
        value = "action"
    .end annotation
.end field

.field private final batchId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "batch_id"
    .end annotation

    .annotation runtime Lft5;
        value = "batch_id"
    .end annotation
.end field

.field private final batchNotice:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "batch_notice"
    .end annotation

    .annotation runtime Lft5;
        value = "batch_notice"
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

.field private final errors:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "errors"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/response/OperatorBatchError;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "errors"
    .end annotation
.end field

.field private final failMessage:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fail_message"
    .end annotation

    .annotation runtime Lft5;
        value = "fail_message"
    .end annotation
.end field

.field private final failedCount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "failed_count"
    .end annotation

    .annotation runtime Lft5;
        value = "failed_count"
    .end annotation
.end field

.field private final jobId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "job_id"
    .end annotation

    .annotation runtime Lft5;
        value = "job_id"
    .end annotation
.end field

.field private final kind:Lco/bird/api/response/OpsBatchJobKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "kind"
    .end annotation

    .annotation runtime Lft5;
        value = "kind"
    .end annotation
.end field

.field private final notices:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "notices"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/response/OperatorBatchNotice;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "notices"
    .end annotation
.end field

.field private final state:Lco/bird/api/response/OpsBatchJobStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "state"
    .end annotation

    .annotation runtime Lft5;
        value = "state"
    .end annotation
.end field

.field private final successCount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "success_count"
    .end annotation

    .annotation runtime Lft5;
        value = "success_count"
    .end annotation
.end field

.field private final successMessage:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "success_message"
    .end annotation

    .annotation runtime Lft5;
        value = "success_message"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 16

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x1fff

    const/4 v15, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lco/bird/api/response/OperatorBatchStatusResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILco/bird/api/response/OpsBatchJobActionKind;Lco/bird/api/response/OpsBatchJobStatus;Lco/bird/api/response/OpsBatchJobKind;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILco/bird/api/response/OpsBatchJobActionKind;Lco/bird/api/response/OpsBatchJobStatus;Lco/bird/api/response/OpsBatchJobKind;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I",
            "Lco/bird/api/response/OpsBatchJobActionKind;",
            "Lco/bird/api/response/OpsBatchJobStatus;",
            "Lco/bird/api/response/OpsBatchJobKind;",
            "Ljava/util/List<",
            "Lco/bird/api/response/OperatorBatchError;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/api/response/OperatorBatchNotice;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errors"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notices"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->jobId:Ljava/lang/String;

    iput p3, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failedCount:I

    iput-object p4, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failMessage:Ljava/lang/String;

    iput p5, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successCount:I

    iput-object p6, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successMessage:Ljava/lang/String;

    iput p7, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->birdCount:I

    iput-object p8, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->action:Lco/bird/api/response/OpsBatchJobActionKind;

    iput-object p9, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->state:Lco/bird/api/response/OpsBatchJobStatus;

    iput-object p10, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->kind:Lco/bird/api/response/OpsBatchJobKind;

    iput-object p11, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->errors:Ljava/util/List;

    iput-object p12, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->notices:Ljava/util/List;

    iput-object p13, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchNotice:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILco/bird/api/response/OpsBatchJobActionKind;Lco/bird/api/response/OpsBatchJobStatus;Lco/bird/api/response/OpsBatchJobKind;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    move-object v6, v2

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    goto :goto_4

    :cond_4
    move/from16 v5, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move-object v7, v2

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/16 v8, 0x9

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move-object v9, v2

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    sget-object v10, Lco/bird/api/response/OpsBatchJobStatus;->INVALID:Lco/bird/api/response/OpsBatchJobStatus;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    sget-object v11, Lco/bird/api/response/OpsBatchJobKind;->INVALID:Lco/bird/api/response/OpsBatchJobKind;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v12

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v13

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    goto :goto_c

    :cond_c
    move-object/from16 v2, p13

    :goto_c
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 p5, v6

    move/from16 p6, v5

    move-object/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v2

    invoke-direct/range {p1 .. p14}, Lco/bird/api/response/OperatorBatchStatusResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILco/bird/api/response/OpsBatchJobActionKind;Lco/bird/api/response/OpsBatchJobStatus;Lco/bird/api/response/OpsBatchJobKind;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/OperatorBatchStatusResponse;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILco/bird/api/response/OpsBatchJobActionKind;Lco/bird/api/response/OpsBatchJobStatus;Lco/bird/api/response/OpsBatchJobKind;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/api/response/OperatorBatchStatusResponse;
    .locals 14

    move-object v0, p0

    move/from16 v1, p14

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->jobId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->failedCount:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->failMessage:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->successCount:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->successMessage:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->birdCount:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->action:Lco/bird/api/response/OpsBatchJobActionKind;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->state:Lco/bird/api/response/OpsBatchJobStatus;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->kind:Lco/bird/api/response/OpsBatchJobKind;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->errors:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->notices:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_c

    iget-object v1, v0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchNotice:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v1, p13

    :goto_c
    move-object p1, v2

    move-object/from16 p2, v3

    move/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v1

    invoke-virtual/range {p0 .. p13}, Lco/bird/api/response/OperatorBatchStatusResponse;->copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILco/bird/api/response/OpsBatchJobActionKind;Lco/bird/api/response/OpsBatchJobStatus;Lco/bird/api/response/OpsBatchJobKind;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lco/bird/api/response/OperatorBatchStatusResponse;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lco/bird/api/response/OpsBatchJobKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->kind:Lco/bird/api/response/OpsBatchJobKind;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/OperatorBatchError;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->errors:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/OperatorBatchNotice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->notices:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchNotice:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->jobId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failedCount:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successCount:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->birdCount:I

    return v0
.end method

.method public final component8()Lco/bird/api/response/OpsBatchJobActionKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->action:Lco/bird/api/response/OpsBatchJobActionKind;

    return-object v0
.end method

.method public final component9()Lco/bird/api/response/OpsBatchJobStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->state:Lco/bird/api/response/OpsBatchJobStatus;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILco/bird/api/response/OpsBatchJobActionKind;Lco/bird/api/response/OpsBatchJobStatus;Lco/bird/api/response/OpsBatchJobKind;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lco/bird/api/response/OperatorBatchStatusResponse;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I",
            "Lco/bird/api/response/OpsBatchJobActionKind;",
            "Lco/bird/api/response/OpsBatchJobStatus;",
            "Lco/bird/api/response/OpsBatchJobKind;",
            "Ljava/util/List<",
            "Lco/bird/api/response/OperatorBatchError;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/api/response/OperatorBatchNotice;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lco/bird/api/response/OperatorBatchStatusResponse;"
        }
    .end annotation

    const-string v0, "state"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errors"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notices"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/OperatorBatchStatusResponse;

    move-object v1, v0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lco/bird/api/response/OperatorBatchStatusResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILco/bird/api/response/OpsBatchJobActionKind;Lco/bird/api/response/OpsBatchJobStatus;Lco/bird/api/response/OpsBatchJobKind;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/OperatorBatchStatusResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/OperatorBatchStatusResponse;

    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->batchId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->jobId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->jobId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failedCount:I

    iget v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->failedCount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failMessage:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->failMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successCount:I

    iget v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->successCount:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successMessage:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->successMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->birdCount:I

    iget v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->birdCount:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->action:Lco/bird/api/response/OpsBatchJobActionKind;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->action:Lco/bird/api/response/OpsBatchJobActionKind;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->state:Lco/bird/api/response/OpsBatchJobStatus;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->state:Lco/bird/api/response/OpsBatchJobStatus;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->kind:Lco/bird/api/response/OpsBatchJobKind;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->kind:Lco/bird/api/response/OpsBatchJobKind;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->errors:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->errors:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->notices:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->notices:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchNotice:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/api/response/OperatorBatchStatusResponse;->batchNotice:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getAction()Lco/bird/api/response/OpsBatchJobActionKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->action:Lco/bird/api/response/OpsBatchJobActionKind;

    return-object v0
.end method

.method public final getBatchId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchId:Ljava/lang/String;

    return-object v0
.end method

.method public final getBatchNotice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchNotice:Ljava/lang/String;

    return-object v0
.end method

.method public final getBirdCount()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->birdCount:I

    return v0
.end method

.method public final getErrors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/OperatorBatchError;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->errors:Ljava/util/List;

    return-object v0
.end method

.method public final getFailMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getFailedCount()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failedCount:I

    return v0
.end method

.method public final getJobId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->jobId:Ljava/lang/String;

    return-object v0
.end method

.method public final getKind()Lco/bird/api/response/OpsBatchJobKind;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->kind:Lco/bird/api/response/OpsBatchJobKind;

    return-object v0
.end method

.method public final getNotices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/OperatorBatchNotice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->notices:Ljava/util/List;

    return-object v0
.end method

.method public final getState()Lco/bird/api/response/OpsBatchJobStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->state:Lco/bird/api/response/OpsBatchJobStatus;

    return-object v0
.end method

.method public final getSuccessCount()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successCount:I

    return v0
.end method

.method public final getSuccessMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successMessage:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->jobId:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failedCount:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failMessage:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successCount:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successMessage:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->birdCount:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->action:Lco/bird/api/response/OpsBatchJobActionKind;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->state:Lco/bird/api/response/OpsBatchJobStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->kind:Lco/bird/api/response/OpsBatchJobKind;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->errors:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->notices:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchNotice:Ljava/lang/String;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->jobId:Ljava/lang/String;

    iget v2, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failedCount:I

    iget-object v3, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->failMessage:Ljava/lang/String;

    iget v4, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successCount:I

    iget-object v5, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->successMessage:Ljava/lang/String;

    iget v6, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->birdCount:I

    iget-object v7, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->action:Lco/bird/api/response/OpsBatchJobActionKind;

    iget-object v8, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->state:Lco/bird/api/response/OpsBatchJobStatus;

    iget-object v9, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->kind:Lco/bird/api/response/OpsBatchJobKind;

    iget-object v10, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->errors:Ljava/util/List;

    iget-object v11, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->notices:Ljava/util/List;

    iget-object v12, p0, Lco/bird/api/response/OperatorBatchStatusResponse;->batchNotice:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "OperatorBatchStatusResponse(batchId="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", jobId="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", failedCount="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", failMessage="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", successCount="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", successMessage="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", birdCount="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", action="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", kind="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", errors="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", notices="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", batchNotice="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
