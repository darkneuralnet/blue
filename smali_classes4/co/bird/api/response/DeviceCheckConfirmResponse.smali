.class public final Lco/bird/api/response/DeviceCheckConfirmResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ0\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/api/response/DeviceCheckConfirmResponse;",
        "",
        "success",
        "",
        "sendTimestamp",
        "",
        "confirmTimestamp",
        "(ZLjava/lang/Long;Ljava/lang/Long;)V",
        "getConfirmTimestamp",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getSendTimestamp",
        "getSuccess",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "(ZLjava/lang/Long;Ljava/lang/Long;)Lco/bird/api/response/DeviceCheckConfirmResponse;",
        "equals",
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
.field private final confirmTimestamp:Ljava/lang/Long;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "confirm_timestamp"
    .end annotation

    .annotation runtime Lft5;
        value = "confirm_timestamp"
    .end annotation
.end field

.field private final sendTimestamp:Ljava/lang/Long;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "send_timestamp"
    .end annotation

    .annotation runtime Lft5;
        value = "send_timestamp"
    .end annotation
.end field

.field private final success:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "success"
    .end annotation

    .annotation runtime Lft5;
        value = "success"
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLjava/lang/Long;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->success:Z

    iput-object p2, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->sendTimestamp:Ljava/lang/Long;

    iput-object p3, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->confirmTimestamp:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Long;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/api/response/DeviceCheckConfirmResponse;-><init>(ZLjava/lang/Long;Ljava/lang/Long;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/DeviceCheckConfirmResponse;ZLjava/lang/Long;Ljava/lang/Long;ILjava/lang/Object;)Lco/bird/api/response/DeviceCheckConfirmResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->success:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->sendTimestamp:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->confirmTimestamp:Ljava/lang/Long;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/response/DeviceCheckConfirmResponse;->copy(ZLjava/lang/Long;Ljava/lang/Long;)Lco/bird/api/response/DeviceCheckConfirmResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->success:Z

    return v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->sendTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->confirmTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(ZLjava/lang/Long;Ljava/lang/Long;)Lco/bird/api/response/DeviceCheckConfirmResponse;
    .locals 1

    new-instance v0, Lco/bird/api/response/DeviceCheckConfirmResponse;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/response/DeviceCheckConfirmResponse;-><init>(ZLjava/lang/Long;Ljava/lang/Long;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/DeviceCheckConfirmResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/DeviceCheckConfirmResponse;

    iget-boolean v1, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->success:Z

    iget-boolean v3, p1, Lco/bird/api/response/DeviceCheckConfirmResponse;->success:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->sendTimestamp:Ljava/lang/Long;

    iget-object v3, p1, Lco/bird/api/response/DeviceCheckConfirmResponse;->sendTimestamp:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->confirmTimestamp:Ljava/lang/Long;

    iget-object p1, p1, Lco/bird/api/response/DeviceCheckConfirmResponse;->confirmTimestamp:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getConfirmTimestamp()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->confirmTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public final getSendTimestamp()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->sendTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->success:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->success:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->sendTimestamp:Ljava/lang/Long;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->confirmTimestamp:Ljava/lang/Long;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->success:Z

    iget-object v1, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->sendTimestamp:Ljava/lang/Long;

    iget-object v2, p0, Lco/bird/api/response/DeviceCheckConfirmResponse;->confirmTimestamp:Ljava/lang/Long;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DeviceCheckConfirmResponse(success="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", sendTimestamp="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", confirmTimestamp="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
