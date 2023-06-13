.class public final Lco/bird/api/request/ScheduleLongTermRentalBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00082\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\r\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/api/request/ScheduleLongTermRentalBody;",
        "",
        "deliveryWindowId",
        "",
        "planId",
        "location",
        "Lco/bird/api/request/DeliveryLocationBody;",
        "birdCare",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/DeliveryLocationBody;Z)V",
        "getBirdCare",
        "()Z",
        "getDeliveryWindowId",
        "()Ljava/lang/String;",
        "getLocation",
        "()Lco/bird/api/request/DeliveryLocationBody;",
        "getPlanId",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
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
.field private final birdCare:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_care"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_care"
    .end annotation
.end field

.field private final deliveryWindowId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "delivery_window_id"
    .end annotation

    .annotation runtime Lft5;
        value = "delivery_window_id"
    .end annotation
.end field

.field private final location:Lco/bird/api/request/DeliveryLocationBody;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "location"
    .end annotation

    .annotation runtime Lft5;
        value = "location"
    .end annotation
.end field

.field private final planId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "plan_id"
    .end annotation

    .annotation runtime Lft5;
        value = "plan_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/DeliveryLocationBody;Z)V
    .locals 1

    const-string v0, "deliveryWindowId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "planId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->deliveryWindowId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->planId:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->location:Lco/bird/api/request/DeliveryLocationBody;

    iput-boolean p4, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->birdCare:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/DeliveryLocationBody;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/api/request/ScheduleLongTermRentalBody;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/DeliveryLocationBody;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/ScheduleLongTermRentalBody;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/DeliveryLocationBody;ZILjava/lang/Object;)Lco/bird/api/request/ScheduleLongTermRentalBody;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->deliveryWindowId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->planId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->location:Lco/bird/api/request/DeliveryLocationBody;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->birdCare:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/api/request/ScheduleLongTermRentalBody;->copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/DeliveryLocationBody;Z)Lco/bird/api/request/ScheduleLongTermRentalBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->deliveryWindowId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lco/bird/api/request/DeliveryLocationBody;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->location:Lco/bird/api/request/DeliveryLocationBody;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->birdCare:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/DeliveryLocationBody;Z)Lco/bird/api/request/ScheduleLongTermRentalBody;
    .locals 1

    const-string v0, "deliveryWindowId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "planId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/ScheduleLongTermRentalBody;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/api/request/ScheduleLongTermRentalBody;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/DeliveryLocationBody;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/ScheduleLongTermRentalBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/ScheduleLongTermRentalBody;

    iget-object v1, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->deliveryWindowId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/ScheduleLongTermRentalBody;->deliveryWindowId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->planId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/ScheduleLongTermRentalBody;->planId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->location:Lco/bird/api/request/DeliveryLocationBody;

    iget-object v3, p1, Lco/bird/api/request/ScheduleLongTermRentalBody;->location:Lco/bird/api/request/DeliveryLocationBody;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->birdCare:Z

    iget-boolean p1, p1, Lco/bird/api/request/ScheduleLongTermRentalBody;->birdCare:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBirdCare()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->birdCare:Z

    return v0
.end method

.method public final getDeliveryWindowId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->deliveryWindowId:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocation()Lco/bird/api/request/DeliveryLocationBody;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->location:Lco/bird/api/request/DeliveryLocationBody;

    return-object v0
.end method

.method public final getPlanId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->deliveryWindowId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->planId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->location:Lco/bird/api/request/DeliveryLocationBody;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/api/request/DeliveryLocationBody;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->birdCare:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->deliveryWindowId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->planId:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->location:Lco/bird/api/request/DeliveryLocationBody;

    iget-boolean v3, p0, Lco/bird/api/request/ScheduleLongTermRentalBody;->birdCare:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ScheduleLongTermRentalBody(deliveryWindowId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", planId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", location="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", birdCare="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
