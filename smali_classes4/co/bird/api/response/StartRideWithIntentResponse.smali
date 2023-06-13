.class public final Lco/bird/api/response/StartRideWithIntentResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/api/response/StartRideWithIntentResponse;",
        "",
        "ride",
        "Lco/bird/android/model/wire/WireRide;",
        "payment",
        "Lco/bird/api/response/StartRidePaymentResponse;",
        "(Lco/bird/android/model/wire/WireRide;Lco/bird/api/response/StartRidePaymentResponse;)V",
        "getPayment",
        "()Lco/bird/api/response/StartRidePaymentResponse;",
        "getRide",
        "()Lco/bird/android/model/wire/WireRide;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final payment:Lco/bird/api/response/StartRidePaymentResponse;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "payment"
    .end annotation

    .annotation runtime Lft5;
        value = "payment"
    .end annotation
.end field

.field private final ride:Lco/bird/android/model/wire/WireRide;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ride"
    .end annotation

    .annotation runtime Lft5;
        value = "ride"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lco/bird/api/response/StartRideWithIntentResponse;-><init>(Lco/bird/android/model/wire/WireRide;Lco/bird/api/response/StartRidePaymentResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireRide;Lco/bird/api/response/StartRidePaymentResponse;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/StartRideWithIntentResponse;->ride:Lco/bird/android/model/wire/WireRide;

    iput-object p2, p0, Lco/bird/api/response/StartRideWithIntentResponse;->payment:Lco/bird/api/response/StartRidePaymentResponse;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireRide;Lco/bird/api/response/StartRidePaymentResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lco/bird/api/response/StartRideWithIntentResponse;-><init>(Lco/bird/android/model/wire/WireRide;Lco/bird/api/response/StartRidePaymentResponse;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/StartRideWithIntentResponse;Lco/bird/android/model/wire/WireRide;Lco/bird/api/response/StartRidePaymentResponse;ILjava/lang/Object;)Lco/bird/api/response/StartRideWithIntentResponse;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/api/response/StartRideWithIntentResponse;->ride:Lco/bird/android/model/wire/WireRide;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/api/response/StartRideWithIntentResponse;->payment:Lco/bird/api/response/StartRidePaymentResponse;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/api/response/StartRideWithIntentResponse;->copy(Lco/bird/android/model/wire/WireRide;Lco/bird/api/response/StartRidePaymentResponse;)Lco/bird/api/response/StartRideWithIntentResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireRide;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/StartRideWithIntentResponse;->ride:Lco/bird/android/model/wire/WireRide;

    return-object v0
.end method

.method public final component2()Lco/bird/api/response/StartRidePaymentResponse;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/StartRideWithIntentResponse;->payment:Lco/bird/api/response/StartRidePaymentResponse;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireRide;Lco/bird/api/response/StartRidePaymentResponse;)Lco/bird/api/response/StartRideWithIntentResponse;
    .locals 1

    new-instance v0, Lco/bird/api/response/StartRideWithIntentResponse;

    invoke-direct {v0, p1, p2}, Lco/bird/api/response/StartRideWithIntentResponse;-><init>(Lco/bird/android/model/wire/WireRide;Lco/bird/api/response/StartRidePaymentResponse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/StartRideWithIntentResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/StartRideWithIntentResponse;

    iget-object v1, p0, Lco/bird/api/response/StartRideWithIntentResponse;->ride:Lco/bird/android/model/wire/WireRide;

    iget-object v3, p1, Lco/bird/api/response/StartRideWithIntentResponse;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/StartRideWithIntentResponse;->payment:Lco/bird/api/response/StartRidePaymentResponse;

    iget-object p1, p1, Lco/bird/api/response/StartRideWithIntentResponse;->payment:Lco/bird/api/response/StartRidePaymentResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getPayment()Lco/bird/api/response/StartRidePaymentResponse;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/StartRideWithIntentResponse;->payment:Lco/bird/api/response/StartRidePaymentResponse;

    return-object v0
.end method

.method public final getRide()Lco/bird/android/model/wire/WireRide;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/StartRideWithIntentResponse;->ride:Lco/bird/android/model/wire/WireRide;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/StartRideWithIntentResponse;->ride:Lco/bird/android/model/wire/WireRide;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/StartRideWithIntentResponse;->payment:Lco/bird/api/response/StartRidePaymentResponse;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lco/bird/api/response/StartRidePaymentResponse;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/api/response/StartRideWithIntentResponse;->ride:Lco/bird/android/model/wire/WireRide;

    iget-object v1, p0, Lco/bird/api/response/StartRideWithIntentResponse;->payment:Lco/bird/api/response/StartRidePaymentResponse;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StartRideWithIntentResponse(ride="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", payment="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
