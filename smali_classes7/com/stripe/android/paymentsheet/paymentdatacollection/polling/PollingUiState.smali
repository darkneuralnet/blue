.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J*\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001c\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
        "",
        "durationRemaining",
        "Lkotlin/time/Duration;",
        "pollingState",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;",
        "(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getDurationRemaining-UwyO8pc",
        "()J",
        "J",
        "getPollingState",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;",
        "component1",
        "component1-UwyO8pc",
        "component2",
        "copy",
        "copy-VtjQ1oo",
        "(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "paymentsheet_release"
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
.field private final durationRemaining:J

.field private final pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;


# direct methods
.method private constructor <init>(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    return-void
.end method

.method public synthetic constructor <init>(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->Active:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    :cond_0
    const/4 p4, 0x0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;-><init>(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;-><init>(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V

    return-void
.end method

.method public static synthetic copy-VtjQ1oo$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-wide p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->copy-VtjQ1oo(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1-UwyO8pc()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    return-wide v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    return-object v0
.end method

.method public final copy-VtjQ1oo(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;
    .locals 2

    const-string v0, "pollingState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;-><init>(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    iget-wide v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    iget-wide v5, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDurationRemaining-UwyO8pc()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    return-wide v0
.end method

.method public final getPollingState()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PollingUiState(durationRemaining="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", pollingState="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
