.class public final Lco/bird/android/model/wire/WireLeaseObjectResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008*\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00c9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\u0008\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010\u001aJ\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u000fH\u00c6\u0003J\t\u00104\u001a\u00020\u000fH\u00c6\u0003J\t\u00105\u001a\u00020\u000fH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u00c6\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\tH\u00c6\u0003J\t\u0010?\u001a\u00020\tH\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u00cf\u0001\u0010B\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\u0008\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001J\u0013\u0010C\u001a\u00020D2\u0008\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\u000fH\u00d6\u0001J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0016\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010!R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010#R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010!R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010!R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010\u001c\u00a8\u0006H"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireLeaseObjectResponse;",
        "",
        "id",
        "",
        "principalId",
        "leaseType",
        "leasedItemId",
        "associatedItemId",
        "startedAt",
        "Lorg/joda/time/DateTime;",
        "dueAt",
        "returnedAt",
        "finalizedAt",
        "currency",
        "initialChargeAmount",
        "",
        "returnRefundAmount",
        "delinquentFeeAmount",
        "delinquencySettledAt",
        "validations",
        "",
        "Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;",
        "assets",
        "Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;",
        "metadata",
        "Lco/bird/android/model/wire/WireLeaseMetadata;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireLeaseMetadata;)V",
        "getAssets",
        "()Ljava/util/List;",
        "getAssociatedItemId",
        "()Ljava/lang/String;",
        "getCurrency",
        "getDelinquencySettledAt",
        "()Lorg/joda/time/DateTime;",
        "getDelinquentFeeAmount",
        "()I",
        "getDueAt",
        "getFinalizedAt",
        "getId",
        "getInitialChargeAmount",
        "getLeaseType",
        "getLeasedItemId",
        "getMetadata",
        "()Lco/bird/android/model/wire/WireLeaseMetadata;",
        "getPrincipalId",
        "getReturnRefundAmount",
        "getReturnedAt",
        "getStartedAt",
        "getValidations",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
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
.field private final assets:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "assets"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "assets"
    .end annotation
.end field

.field private final associatedItemId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "associated_item_id"
    .end annotation

    .annotation runtime Lft5;
        value = "associated_item_id"
    .end annotation
.end field

.field private final currency:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "currency"
    .end annotation

    .annotation runtime Lft5;
        value = "currency"
    .end annotation
.end field

.field private final delinquencySettledAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "delinquency_settled_at"
    .end annotation

    .annotation runtime Lft5;
        value = "delinquency_settled_at"
    .end annotation
.end field

.field private final delinquentFeeAmount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "delinquent_fee_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "delinquent_fee_amount"
    .end annotation
.end field

.field private final dueAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "due_at"
    .end annotation

    .annotation runtime Lft5;
        value = "due_at"
    .end annotation
.end field

.field private final finalizedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "finalized_at"
    .end annotation

    .annotation runtime Lft5;
        value = "finalized_at"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "id"
    .end annotation

    .annotation runtime Lft5;
        value = "id"
    .end annotation
.end field

.field private final initialChargeAmount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "initial_charge_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "initial_charge_amount"
    .end annotation
.end field

.field private final leaseType:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lease_type"
    .end annotation

    .annotation runtime Lft5;
        value = "lease_type"
    .end annotation
.end field

.field private final leasedItemId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "leased_item_id"
    .end annotation

    .annotation runtime Lft5;
        value = "leased_item_id"
    .end annotation
.end field

.field private final metadata:Lco/bird/android/model/wire/WireLeaseMetadata;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "metadata"
    .end annotation

    .annotation runtime Lft5;
        value = "metadata"
    .end annotation
.end field

.field private final principalId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "principal_id"
    .end annotation

    .annotation runtime Lft5;
        value = "principal_id"
    .end annotation
.end field

.field private final returnRefundAmount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "return_refund_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "return_refund_amount"
    .end annotation
.end field

.field private final returnedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "returned_at"
    .end annotation

    .annotation runtime Lft5;
        value = "returned_at"
    .end annotation
.end field

.field private final startedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "started_at"
    .end annotation

    .annotation runtime Lft5;
        value = "started_at"
    .end annotation
.end field

.field private final validations:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "validations"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "validations"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireLeaseMetadata;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "III",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;",
            ">;",
            "Lco/bird/android/model/wire/WireLeaseMetadata;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move-object v5, p7

    move-object/from16 v6, p10

    const-string v7, "id"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "principalId"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "leaseType"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "startedAt"

    invoke-static {p6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "dueAt"

    invoke-static {p7, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "currency"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->id:Ljava/lang/String;

    iput-object v2, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->principalId:Ljava/lang/String;

    iput-object v3, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leaseType:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leasedItemId:Ljava/lang/String;

    move-object v1, p5

    iput-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->associatedItemId:Ljava/lang/String;

    iput-object v4, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->startedAt:Lorg/joda/time/DateTime;

    iput-object v5, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->dueAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p8

    iput-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p9

    iput-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->finalizedAt:Lorg/joda/time/DateTime;

    iput-object v6, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->currency:Ljava/lang/String;

    move/from16 v1, p11

    iput v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->initialChargeAmount:I

    move/from16 v1, p12

    iput v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnRefundAmount:I

    move/from16 v1, p13

    iput v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquentFeeAmount:I

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquencySettledAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->validations:Ljava/util/List;

    move-object/from16 v1, p16

    iput-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->assets:Ljava/util/List;

    move-object/from16 v1, p17

    iput-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->metadata:Lco/bird/android/model/wire/WireLeaseMetadata;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireLeaseMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x2

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move-object v3, v4

    goto :goto_2

    :cond_2
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_3

    move-object v5, v4

    goto :goto_3

    :cond_3
    move-object/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    const-string v7, "now()"

    if-eqz v6, :cond_4

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v6

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    move-object/from16 v6, p6

    :goto_4
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_5

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_6

    move-object v7, v4

    goto :goto_6

    :cond_6
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_7

    move-object v9, v4

    goto :goto_7

    :cond_7
    move-object/from16 v9, p9

    :goto_7
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_8

    const-string v10, "usd"

    goto :goto_8

    :cond_8
    move-object/from16 v10, p10

    :goto_8
    and-int/lit16 v11, v0, 0x400

    const/4 v12, 0x0

    if-eqz v11, :cond_9

    move v11, v12

    goto :goto_9

    :cond_9
    move/from16 v11, p11

    :goto_9
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_a

    move v13, v12

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_b

    goto :goto_b

    :cond_b
    move/from16 v12, p13

    :goto_b
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_c

    move-object v14, v4

    goto :goto_c

    :cond_c
    move-object/from16 v14, p14

    :goto_c
    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_d

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v15

    goto :goto_d

    :cond_d
    move-object/from16 v15, p15

    :goto_d
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_e

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v16

    goto :goto_e

    :cond_e
    move-object/from16 v16, p16

    :goto_e
    const/high16 v17, 0x10000

    and-int v0, v0, v17

    if-eqz v0, :cond_f

    new-instance v0, Lco/bird/android/model/wire/WireLeaseMetadata;

    move-object/from16 p19, v15

    const/4 v15, 0x3

    invoke-direct {v0, v4, v4, v15, v4}, Lco/bird/android/model/wire/WireLeaseMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_f

    :cond_f
    move-object/from16 p19, v15

    move-object/from16 v0, p17

    :goto_f
    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v5

    move-object/from16 p8, v6

    move-object/from16 p9, v8

    move-object/from16 p10, v7

    move-object/from16 p11, v9

    move-object/from16 p12, v10

    move/from16 p13, v11

    move/from16 p14, v13

    move/from16 p15, v12

    move-object/from16 p16, v14

    move-object/from16 p17, p19

    move-object/from16 p18, v16

    move-object/from16 p19, v0

    invoke-direct/range {p2 .. p19}, Lco/bird/android/model/wire/WireLeaseObjectResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireLeaseMetadata;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireLeaseObjectResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireLeaseMetadata;ILjava/lang/Object;)Lco/bird/android/model/wire/WireLeaseObjectResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->principalId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leaseType:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leasedItemId:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->associatedItemId:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->startedAt:Lorg/joda/time/DateTime;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->dueAt:Lorg/joda/time/DateTime;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnedAt:Lorg/joda/time/DateTime;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->finalizedAt:Lorg/joda/time/DateTime;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->currency:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->initialChargeAmount:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnRefundAmount:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquentFeeAmount:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquencySettledAt:Lorg/joda/time/DateTime;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->validations:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->assets:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v1, v1, v16

    if-eqz v1, :cond_10

    iget-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->metadata:Lco/bird/android/model/wire/WireLeaseMetadata;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move-object/from16 p16, v15

    move-object/from16 p17, v1

    invoke-virtual/range {p0 .. p17}, Lco/bird/android/model/wire/WireLeaseObjectResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireLeaseMetadata;)Lco/bird/android/model/wire/WireLeaseObjectResponse;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->initialChargeAmount:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnRefundAmount:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquentFeeAmount:I

    return v0
.end method

.method public final component14()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquencySettledAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->validations:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->assets:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Lco/bird/android/model/wire/WireLeaseMetadata;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->metadata:Lco/bird/android/model/wire/WireLeaseMetadata;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->principalId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leaseType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leasedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->associatedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->startedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component7()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->dueAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component8()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component9()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->finalizedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireLeaseMetadata;)Lco/bird/android/model/wire/WireLeaseObjectResponse;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "III",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;",
            ">;",
            "Lco/bird/android/model/wire/WireLeaseMetadata;",
            ")",
            "Lco/bird/android/model/wire/WireLeaseObjectResponse;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    const-string v0, "id"

    move-object/from16 v18, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "principalId"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startedAt"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dueAt"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    move-object/from16 v1, p10

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v19, Lco/bird/android/model/wire/WireLeaseObjectResponse;

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-direct/range {v0 .. v17}, Lco/bird/android/model/wire/WireLeaseObjectResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireLeaseMetadata;)V

    return-object v19
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->principalId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->principalId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leaseType:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leaseType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leasedItemId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leasedItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->associatedItemId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->associatedItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->startedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->startedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->dueAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->dueAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->finalizedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->finalizedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->initialChargeAmount:I

    iget v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->initialChargeAmount:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnRefundAmount:I

    iget v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnRefundAmount:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquentFeeAmount:I

    iget v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquentFeeAmount:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquencySettledAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquencySettledAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->validations:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->validations:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->assets:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->assets:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->metadata:Lco/bird/android/model/wire/WireLeaseMetadata;

    iget-object p1, p1, Lco/bird/android/model/wire/WireLeaseObjectResponse;->metadata:Lco/bird/android/model/wire/WireLeaseMetadata;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getAssets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->assets:Ljava/util/List;

    return-object v0
.end method

.method public final getAssociatedItemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->associatedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getDelinquencySettledAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquencySettledAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getDelinquentFeeAmount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquentFeeAmount:I

    return v0
.end method

.method public final getDueAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->dueAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getFinalizedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->finalizedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialChargeAmount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->initialChargeAmount:I

    return v0
.end method

.method public final getLeaseType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leaseType:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeasedItemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leasedItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetadata()Lco/bird/android/model/wire/WireLeaseMetadata;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->metadata:Lco/bird/android/model/wire/WireLeaseMetadata;

    return-object v0
.end method

.method public final getPrincipalId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->principalId:Ljava/lang/String;

    return-object v0
.end method

.method public final getReturnRefundAmount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnRefundAmount:I

    return v0
.end method

.method public final getReturnedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getStartedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->startedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getValidations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->validations:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->principalId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leaseType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leasedItemId:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->associatedItemId:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->startedAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->dueAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->finalizedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->currency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->initialChargeAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnRefundAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquentFeeAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquencySettledAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->validations:Ljava/util/List;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->assets:Ljava/util/List;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->metadata:Lco/bird/android/model/wire/WireLeaseMetadata;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLeaseMetadata;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->id:Ljava/lang/String;

    iget-object v2, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->principalId:Ljava/lang/String;

    iget-object v3, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leaseType:Ljava/lang/String;

    iget-object v4, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->leasedItemId:Ljava/lang/String;

    iget-object v5, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->associatedItemId:Ljava/lang/String;

    iget-object v6, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->startedAt:Lorg/joda/time/DateTime;

    iget-object v7, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->dueAt:Lorg/joda/time/DateTime;

    iget-object v8, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnedAt:Lorg/joda/time/DateTime;

    iget-object v9, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->finalizedAt:Lorg/joda/time/DateTime;

    iget-object v10, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->currency:Ljava/lang/String;

    iget v11, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->initialChargeAmount:I

    iget v12, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->returnRefundAmount:I

    iget v13, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquentFeeAmount:I

    iget-object v14, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->delinquencySettledAt:Lorg/joda/time/DateTime;

    iget-object v15, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->validations:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->assets:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireLeaseObjectResponse;->metadata:Lco/bird/android/model/wire/WireLeaseMetadata;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v18, v15

    const-string v15, "WireLeaseObjectResponse(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", principalId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", leaseType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", leasedItemId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", associatedItemId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dueAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", returnedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", finalizedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", initialChargeAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", returnRefundAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", delinquentFeeAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", delinquencySettledAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", validations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", assets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
