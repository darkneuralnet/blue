.class public final Lco/bird/api/request/RideStatusBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0018\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003JB\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\r\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/api/request/RideStatusBody;",
        "",
        "rideId",
        "",
        "field",
        "Lco/bird/android/model/constant/RideStatusField;",
        "value",
        "",
        "distance",
        "",
        "correction",
        "(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;Z)V",
        "getCorrection",
        "()Z",
        "getDistance",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getField",
        "()Lco/bird/android/model/constant/RideStatusField;",
        "getRideId",
        "()Ljava/lang/String;",
        "getValue",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;Z)Lco/bird/api/request/RideStatusBody;",
        "equals",
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
.field private final correction:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "correction"
    .end annotation

    .annotation runtime Lft5;
        value = "correction"
    .end annotation
.end field

.field private final distance:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "distance"
    .end annotation

    .annotation runtime Lft5;
        value = "distance"
    .end annotation
.end field

.field private final field:Lco/bird/android/model/constant/RideStatusField;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "field"
    .end annotation

    .annotation runtime Lft5;
        value = "field"
    .end annotation
.end field

.field private final rideId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ride_id"
    .end annotation

    .annotation runtime Lft5;
        value = "ride_id"
    .end annotation
.end field

.field private final value:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "value"
    .end annotation

    .annotation runtime Lft5;
        value = "value"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lco/bird/api/request/RideStatusBody;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;Z)V
    .locals 1

    const-string v0, "rideId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "field"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/RideStatusBody;->rideId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/request/RideStatusBody;->field:Lco/bird/android/model/constant/RideStatusField;

    iput-boolean p3, p0, Lco/bird/api/request/RideStatusBody;->value:Z

    iput-object p4, p0, Lco/bird/api/request/RideStatusBody;->distance:Ljava/lang/Integer;

    iput-boolean p5, p0, Lco/bird/api/request/RideStatusBody;->correction:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    sget-object p2, Lco/bird/android/model/constant/RideStatusField;->LOCKED:Lco/bird/android/model/constant/RideStatusField;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    const/4 p3, 0x1

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    const/4 p4, 0x0

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    const/4 p5, 0x0

    :cond_4
    move v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move p5, v0

    move-object p6, v1

    move p7, v2

    invoke-direct/range {p2 .. p7}, Lco/bird/api/request/RideStatusBody;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/RideStatusBody;Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;ZILjava/lang/Object;)Lco/bird/api/request/RideStatusBody;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/api/request/RideStatusBody;->rideId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/api/request/RideStatusBody;->field:Lco/bird/android/model/constant/RideStatusField;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lco/bird/api/request/RideStatusBody;->value:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/api/request/RideStatusBody;->distance:Ljava/lang/Integer;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lco/bird/api/request/RideStatusBody;->correction:Z

    :cond_4
    move v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move p5, v0

    move-object p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/api/request/RideStatusBody;->copy(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;Z)Lco/bird/api/request/RideStatusBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RideStatusBody;->rideId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/constant/RideStatusField;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RideStatusBody;->field:Lco/bird/android/model/constant/RideStatusField;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/RideStatusBody;->value:Z

    return v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RideStatusBody;->distance:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/RideStatusBody;->correction:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;Z)Lco/bird/api/request/RideStatusBody;
    .locals 7

    const-string v0, "rideId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "field"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/RideStatusBody;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/api/request/RideStatusBody;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/RideStatusBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/RideStatusBody;

    iget-object v1, p0, Lco/bird/api/request/RideStatusBody;->rideId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/RideStatusBody;->rideId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/RideStatusBody;->field:Lco/bird/android/model/constant/RideStatusField;

    iget-object v3, p1, Lco/bird/api/request/RideStatusBody;->field:Lco/bird/android/model/constant/RideStatusField;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/api/request/RideStatusBody;->value:Z

    iget-boolean v3, p1, Lco/bird/api/request/RideStatusBody;->value:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/request/RideStatusBody;->distance:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/api/request/RideStatusBody;->distance:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/api/request/RideStatusBody;->correction:Z

    iget-boolean p1, p1, Lco/bird/api/request/RideStatusBody;->correction:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCorrection()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/RideStatusBody;->correction:Z

    return v0
.end method

.method public final getDistance()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RideStatusBody;->distance:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getField()Lco/bird/android/model/constant/RideStatusField;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RideStatusBody;->field:Lco/bird/android/model/constant/RideStatusField;

    return-object v0
.end method

.method public final getRideId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/RideStatusBody;->rideId:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/RideStatusBody;->value:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/request/RideStatusBody;->rideId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/RideStatusBody;->field:Lco/bird/android/model/constant/RideStatusField;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/request/RideStatusBody;->value:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/RideStatusBody;->distance:Ljava/lang/Integer;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/request/RideStatusBody;->correction:Z

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/api/request/RideStatusBody;->rideId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/request/RideStatusBody;->field:Lco/bird/android/model/constant/RideStatusField;

    iget-boolean v2, p0, Lco/bird/api/request/RideStatusBody;->value:Z

    iget-object v3, p0, Lco/bird/api/request/RideStatusBody;->distance:Ljava/lang/Integer;

    iget-boolean v4, p0, Lco/bird/api/request/RideStatusBody;->correction:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "RideStatusBody(rideId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", field="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", distance="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", correction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
