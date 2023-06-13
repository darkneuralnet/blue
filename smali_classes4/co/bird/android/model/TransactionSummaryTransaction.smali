.class public final Lco/bird/android/model/TransactionSummaryTransaction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BO\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003JS\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006+"
    }
    d2 = {
        "Lco/bird/android/model/TransactionSummaryTransaction;",
        "",
        "id",
        "",
        "amount",
        "",
        "transactionKind",
        "Lco/bird/android/model/constant/IncomingTransactionKind;",
        "sourceKind",
        "Lco/bird/android/model/constant/IncomingTransactionSourceKind;",
        "currency",
        "createdAt",
        "Lorg/joda/time/DateTime;",
        "metadata",
        "Lco/bird/android/model/TransactionMetadata;",
        "(Ljava/lang/String;JLco/bird/android/model/constant/IncomingTransactionKind;Lco/bird/android/model/constant/IncomingTransactionSourceKind;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/TransactionMetadata;)V",
        "getAmount",
        "()J",
        "getCreatedAt",
        "()Lorg/joda/time/DateTime;",
        "getCurrency",
        "()Ljava/lang/String;",
        "getId",
        "getMetadata",
        "()Lco/bird/android/model/TransactionMetadata;",
        "getSourceKind",
        "()Lco/bird/android/model/constant/IncomingTransactionSourceKind;",
        "getTransactionKind",
        "()Lco/bird/android/model/constant/IncomingTransactionKind;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final amount:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "amount"
    .end annotation

    .annotation runtime Lft5;
        value = "amount"
    .end annotation
.end field

.field private final createdAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "created_at"
    .end annotation

    .annotation runtime Lft5;
        value = "created_at"
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

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "id"
    .end annotation

    .annotation runtime Lft5;
        value = "id"
    .end annotation
.end field

.field private final metadata:Lco/bird/android/model/TransactionMetadata;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "metadata"
    .end annotation

    .annotation runtime Lft5;
        value = "metadata"
    .end annotation
.end field

.field private final sourceKind:Lco/bird/android/model/constant/IncomingTransactionSourceKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "source_kind"
    .end annotation

    .annotation runtime Lft5;
        value = "source_kind"
    .end annotation
.end field

.field private final transactionKind:Lco/bird/android/model/constant/IncomingTransactionKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "transaction_kind"
    .end annotation

    .annotation runtime Lft5;
        value = "transaction_kind"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 11

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x7f

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lco/bird/android/model/TransactionSummaryTransaction;-><init>(Ljava/lang/String;JLco/bird/android/model/constant/IncomingTransactionKind;Lco/bird/android/model/constant/IncomingTransactionSourceKind;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/TransactionMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLco/bird/android/model/constant/IncomingTransactionKind;Lco/bird/android/model/constant/IncomingTransactionSourceKind;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/TransactionMetadata;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionKind"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceKind"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->id:Ljava/lang/String;

    iput-wide p2, p0, Lco/bird/android/model/TransactionSummaryTransaction;->amount:J

    iput-object p4, p0, Lco/bird/android/model/TransactionSummaryTransaction;->transactionKind:Lco/bird/android/model/constant/IncomingTransactionKind;

    iput-object p5, p0, Lco/bird/android/model/TransactionSummaryTransaction;->sourceKind:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    iput-object p6, p0, Lco/bird/android/model/TransactionSummaryTransaction;->currency:Ljava/lang/String;

    iput-object p7, p0, Lco/bird/android/model/TransactionSummaryTransaction;->createdAt:Lorg/joda/time/DateTime;

    iput-object p8, p0, Lco/bird/android/model/TransactionSummaryTransaction;->metadata:Lco/bird/android/model/TransactionMetadata;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLco/bird/android/model/constant/IncomingTransactionKind;Lco/bird/android/model/constant/IncomingTransactionSourceKind;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/TransactionMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    and-int/lit8 v1, p9, 0x2

    if-eqz v1, :cond_1

    const-wide/16 v1, 0x0

    goto :goto_1

    :cond_1
    move-wide v1, p2

    :goto_1
    and-int/lit8 v3, p9, 0x4

    if-eqz v3, :cond_2

    sget-object v3, Lco/bird/android/model/constant/IncomingTransactionKind;->UNKNOWN:Lco/bird/android/model/constant/IncomingTransactionKind;

    goto :goto_2

    :cond_2
    move-object v3, p4

    :goto_2
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_3

    sget-object v4, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->UNKNOWN:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    goto :goto_3

    :cond_3
    move-object v4, p5

    :goto_3
    and-int/lit8 v5, p9, 0x10

    if-eqz v5, :cond_4

    const-string v5, "usd"

    goto :goto_4

    :cond_4
    move-object v5, p6

    :goto_4
    and-int/lit8 v6, p9, 0x20

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    move-object v6, v7

    goto :goto_5

    :cond_5
    move-object/from16 v6, p7

    :goto_5
    and-int/lit8 v8, p9, 0x40

    if-eqz v8, :cond_6

    goto :goto_6

    :cond_6
    move-object/from16 v7, p8

    :goto_6
    move-object p1, p0

    move-object p2, v0

    move-wide p3, v1

    move-object p5, v3

    move-object p6, v4

    move-object/from16 p7, v5

    move-object/from16 p8, v6

    move-object/from16 p9, v7

    invoke-direct/range {p1 .. p9}, Lco/bird/android/model/TransactionSummaryTransaction;-><init>(Ljava/lang/String;JLco/bird/android/model/constant/IncomingTransactionKind;Lco/bird/android/model/constant/IncomingTransactionSourceKind;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/TransactionMetadata;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/TransactionSummaryTransaction;Ljava/lang/String;JLco/bird/android/model/constant/IncomingTransactionKind;Lco/bird/android/model/constant/IncomingTransactionSourceKind;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/TransactionMetadata;ILjava/lang/Object;)Lco/bird/android/model/TransactionSummaryTransaction;
    .locals 9

    move-object v0, p0

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lco/bird/android/model/TransactionSummaryTransaction;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_1

    iget-wide v2, v0, Lco/bird/android/model/TransactionSummaryTransaction;->amount:J

    goto :goto_1

    :cond_1
    move-wide v2, p2

    :goto_1
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/TransactionSummaryTransaction;->transactionKind:Lco/bird/android/model/constant/IncomingTransactionKind;

    goto :goto_2

    :cond_2
    move-object v4, p4

    :goto_2
    and-int/lit8 v5, p9, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/TransactionSummaryTransaction;->sourceKind:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    goto :goto_3

    :cond_3
    move-object v5, p5

    :goto_3
    and-int/lit8 v6, p9, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/TransactionSummaryTransaction;->currency:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object v6, p6

    :goto_4
    and-int/lit8 v7, p9, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/TransactionSummaryTransaction;->createdAt:Lorg/joda/time/DateTime;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p7

    :goto_5
    and-int/lit8 v8, p9, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/TransactionSummaryTransaction;->metadata:Lco/bird/android/model/TransactionMetadata;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p8

    :goto_6
    move-object p1, v1

    move-wide p2, v2

    move-object p4, v4

    move-object p5, v5

    move-object p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    invoke-virtual/range {p0 .. p8}, Lco/bird/android/model/TransactionSummaryTransaction;->copy(Ljava/lang/String;JLco/bird/android/model/constant/IncomingTransactionKind;Lco/bird/android/model/constant/IncomingTransactionSourceKind;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/TransactionMetadata;)Lco/bird/android/model/TransactionSummaryTransaction;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->amount:J

    return-wide v0
.end method

.method public final component3()Lco/bird/android/model/constant/IncomingTransactionKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->transactionKind:Lco/bird/android/model/constant/IncomingTransactionKind;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/IncomingTransactionSourceKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->sourceKind:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/TransactionMetadata;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->metadata:Lco/bird/android/model/TransactionMetadata;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JLco/bird/android/model/constant/IncomingTransactionKind;Lco/bird/android/model/constant/IncomingTransactionSourceKind;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/TransactionMetadata;)Lco/bird/android/model/TransactionSummaryTransaction;
    .locals 10

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionKind"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceKind"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/TransactionSummaryTransaction;

    move-object v1, v0

    move-wide v3, p2

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/TransactionSummaryTransaction;-><init>(Ljava/lang/String;JLco/bird/android/model/constant/IncomingTransactionKind;Lco/bird/android/model/constant/IncomingTransactionSourceKind;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/TransactionMetadata;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/TransactionSummaryTransaction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/TransactionSummaryTransaction;

    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/TransactionSummaryTransaction;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/TransactionSummaryTransaction;->amount:J

    iget-wide v5, p1, Lco/bird/android/model/TransactionSummaryTransaction;->amount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->transactionKind:Lco/bird/android/model/constant/IncomingTransactionKind;

    iget-object v3, p1, Lco/bird/android/model/TransactionSummaryTransaction;->transactionKind:Lco/bird/android/model/constant/IncomingTransactionKind;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->sourceKind:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    iget-object v3, p1, Lco/bird/android/model/TransactionSummaryTransaction;->sourceKind:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/TransactionSummaryTransaction;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->createdAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/TransactionSummaryTransaction;->createdAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->metadata:Lco/bird/android/model/TransactionMetadata;

    iget-object p1, p1, Lco/bird/android/model/TransactionSummaryTransaction;->metadata:Lco/bird/android/model/TransactionMetadata;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAmount()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->amount:J

    return-wide v0
.end method

.method public final getCreatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetadata()Lco/bird/android/model/TransactionMetadata;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->metadata:Lco/bird/android/model/TransactionMetadata;

    return-object v0
.end method

.method public final getSourceKind()Lco/bird/android/model/constant/IncomingTransactionSourceKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->sourceKind:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    return-object v0
.end method

.method public final getTransactionKind()Lco/bird/android/model/constant/IncomingTransactionKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->transactionKind:Lco/bird/android/model/constant/IncomingTransactionKind;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->amount:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->transactionKind:Lco/bird/android/model/constant/IncomingTransactionKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->sourceKind:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->currency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->createdAt:Lorg/joda/time/DateTime;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->metadata:Lco/bird/android/model/TransactionMetadata;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/TransactionMetadata;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lco/bird/android/model/TransactionSummaryTransaction;->id:Ljava/lang/String;

    iget-wide v1, p0, Lco/bird/android/model/TransactionSummaryTransaction;->amount:J

    iget-object v3, p0, Lco/bird/android/model/TransactionSummaryTransaction;->transactionKind:Lco/bird/android/model/constant/IncomingTransactionKind;

    iget-object v4, p0, Lco/bird/android/model/TransactionSummaryTransaction;->sourceKind:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    iget-object v5, p0, Lco/bird/android/model/TransactionSummaryTransaction;->currency:Ljava/lang/String;

    iget-object v6, p0, Lco/bird/android/model/TransactionSummaryTransaction;->createdAt:Lorg/joda/time/DateTime;

    iget-object v7, p0, Lco/bird/android/model/TransactionSummaryTransaction;->metadata:Lco/bird/android/model/TransactionMetadata;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "TransactionSummaryTransaction(id="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", amount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", transactionKind="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sourceKind="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currency="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
