.class public final Lco/bird/android/model/ReservationPrice;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0018\u0010\u0016\u001a\u00020\u00082\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u0008J\u0013\u0010\u0016\u001a\u00020\u00082\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\r\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/android/model/ReservationPrice;",
        "",
        "currency",
        "",
        "basePrice",
        "",
        "minutePrice",
        "applyTax",
        "",
        "(Ljava/lang/String;JJZ)V",
        "getApplyTax",
        "()Z",
        "getBasePrice",
        "()J",
        "getCurrency",
        "()Ljava/lang/String;",
        "getMinutePrice",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "ignoreCurrency",
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
.field private final applyTax:Z

.field private final basePrice:J

.field private final currency:Ljava/lang/String;

.field private final minutePrice:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JJZ)V
    .locals 1

    const-string v0, "currency"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/ReservationPrice;->currency:Ljava/lang/String;

    iput-wide p2, p0, Lco/bird/android/model/ReservationPrice;->basePrice:J

    iput-wide p4, p0, Lco/bird/android/model/ReservationPrice;->minutePrice:J

    iput-boolean p6, p0, Lco/bird/android/model/ReservationPrice;->applyTax:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/ReservationPrice;-><init>(Ljava/lang/String;JJZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/ReservationPrice;Ljava/lang/String;JJZILjava/lang/Object;)Lco/bird/android/model/ReservationPrice;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lco/bird/android/model/ReservationPrice;->currency:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-wide p2, p0, Lco/bird/android/model/ReservationPrice;->basePrice:J

    :cond_1
    move-wide v0, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-wide p4, p0, Lco/bird/android/model/ReservationPrice;->minutePrice:J

    :cond_2
    move-wide v2, p4

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-boolean p6, p0, Lco/bird/android/model/ReservationPrice;->applyTax:Z

    :cond_3
    move p8, p6

    move-object p2, p0

    move-object p3, p1

    move-wide p4, v0

    move-wide p6, v2

    invoke-virtual/range {p2 .. p8}, Lco/bird/android/model/ReservationPrice;->copy(Ljava/lang/String;JJZ)Lco/bird/android/model/ReservationPrice;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ReservationPrice;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/ReservationPrice;->basePrice:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/ReservationPrice;->minutePrice:J

    return-wide v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ReservationPrice;->applyTax:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;JJZ)Lco/bird/android/model/ReservationPrice;
    .locals 8

    const-string v0, "currency"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/ReservationPrice;

    move-object v1, v0

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/ReservationPrice;-><init>(Ljava/lang/String;JJZ)V

    return-object v0
.end method

.method public final equals(Lco/bird/android/model/ReservationPrice;Z)Z
    .locals 9

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz p2, :cond_1

    const-string v1, ""

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Lco/bird/android/model/ReservationPrice;->copy$default(Lco/bird/android/model/ReservationPrice;Ljava/lang/String;JJZILjava/lang/Object;)Lco/bird/android/model/ReservationPrice;

    move-result-object p2

    const-string v1, ""

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Lco/bird/android/model/ReservationPrice;->copy$default(Lco/bird/android/model/ReservationPrice;Ljava/lang/String;JJZILjava/lang/Object;)Lco/bird/android/model/ReservationPrice;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Lco/bird/android/model/ReservationPrice;->copy$default(Lco/bird/android/model/ReservationPrice;Ljava/lang/String;JJZILjava/lang/Object;)Lco/bird/android/model/ReservationPrice;

    move-result-object p2

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Lco/bird/android/model/ReservationPrice;->copy$default(Lco/bird/android/model/ReservationPrice;Ljava/lang/String;JJZILjava/lang/Object;)Lco/bird/android/model/ReservationPrice;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/ReservationPrice;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/ReservationPrice;

    iget-object v1, p0, Lco/bird/android/model/ReservationPrice;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ReservationPrice;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/ReservationPrice;->basePrice:J

    iget-wide v5, p1, Lco/bird/android/model/ReservationPrice;->basePrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/model/ReservationPrice;->minutePrice:J

    iget-wide v5, p1, Lco/bird/android/model/ReservationPrice;->minutePrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/ReservationPrice;->applyTax:Z

    iget-boolean p1, p1, Lco/bird/android/model/ReservationPrice;->applyTax:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getApplyTax()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/ReservationPrice;->applyTax:Z

    return v0
.end method

.method public final getBasePrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/ReservationPrice;->basePrice:J

    return-wide v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ReservationPrice;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getMinutePrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/ReservationPrice;->minutePrice:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/ReservationPrice;->currency:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/ReservationPrice;->basePrice:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/ReservationPrice;->minutePrice:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/ReservationPrice;->applyTax:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lco/bird/android/model/ReservationPrice;->currency:Ljava/lang/String;

    iget-wide v1, p0, Lco/bird/android/model/ReservationPrice;->basePrice:J

    iget-wide v3, p0, Lco/bird/android/model/ReservationPrice;->minutePrice:J

    iget-boolean v5, p0, Lco/bird/android/model/ReservationPrice;->applyTax:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ReservationPrice(currency="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", basePrice="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", minutePrice="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", applyTax="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
