.class public final Lco/bird/api/response/NokelockResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/api/response/NokelockResponse;",
        "",
        "type",
        "Lco/bird/android/model/constant/NokelockResponseType;",
        "data",
        "Lco/bird/android/model/wire/WireNokelockResponseData;",
        "(Lco/bird/android/model/constant/NokelockResponseType;Lco/bird/android/model/wire/WireNokelockResponseData;)V",
        "getData",
        "()Lco/bird/android/model/wire/WireNokelockResponseData;",
        "getType",
        "()Lco/bird/android/model/constant/NokelockResponseType;",
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
.field private final data:Lco/bird/android/model/wire/WireNokelockResponseData;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "data"
    .end annotation

    .annotation runtime Lft5;
        value = "data"
    .end annotation
.end field

.field private final type:Lco/bird/android/model/constant/NokelockResponseType;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "type"
    .end annotation

    .annotation runtime Lft5;
        value = "type"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/NokelockResponseType;Lco/bird/android/model/wire/WireNokelockResponseData;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/NokelockResponse;->type:Lco/bird/android/model/constant/NokelockResponseType;

    iput-object p2, p0, Lco/bird/api/response/NokelockResponse;->data:Lco/bird/android/model/wire/WireNokelockResponseData;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/NokelockResponse;Lco/bird/android/model/constant/NokelockResponseType;Lco/bird/android/model/wire/WireNokelockResponseData;ILjava/lang/Object;)Lco/bird/api/response/NokelockResponse;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/api/response/NokelockResponse;->type:Lco/bird/android/model/constant/NokelockResponseType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/api/response/NokelockResponse;->data:Lco/bird/android/model/wire/WireNokelockResponseData;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/api/response/NokelockResponse;->copy(Lco/bird/android/model/constant/NokelockResponseType;Lco/bird/android/model/wire/WireNokelockResponseData;)Lco/bird/api/response/NokelockResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/NokelockResponseType;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/NokelockResponse;->type:Lco/bird/android/model/constant/NokelockResponseType;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireNokelockResponseData;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/NokelockResponse;->data:Lco/bird/android/model/wire/WireNokelockResponseData;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/NokelockResponseType;Lco/bird/android/model/wire/WireNokelockResponseData;)Lco/bird/api/response/NokelockResponse;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/NokelockResponse;

    invoke-direct {v0, p1, p2}, Lco/bird/api/response/NokelockResponse;-><init>(Lco/bird/android/model/constant/NokelockResponseType;Lco/bird/android/model/wire/WireNokelockResponseData;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/NokelockResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/NokelockResponse;

    iget-object v1, p0, Lco/bird/api/response/NokelockResponse;->type:Lco/bird/android/model/constant/NokelockResponseType;

    iget-object v3, p1, Lco/bird/api/response/NokelockResponse;->type:Lco/bird/android/model/constant/NokelockResponseType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/NokelockResponse;->data:Lco/bird/android/model/wire/WireNokelockResponseData;

    iget-object p1, p1, Lco/bird/api/response/NokelockResponse;->data:Lco/bird/android/model/wire/WireNokelockResponseData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getData()Lco/bird/android/model/wire/WireNokelockResponseData;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/NokelockResponse;->data:Lco/bird/android/model/wire/WireNokelockResponseData;

    return-object v0
.end method

.method public final getType()Lco/bird/android/model/constant/NokelockResponseType;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/NokelockResponse;->type:Lco/bird/android/model/constant/NokelockResponseType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/response/NokelockResponse;->type:Lco/bird/android/model/constant/NokelockResponseType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/NokelockResponse;->data:Lco/bird/android/model/wire/WireNokelockResponseData;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/api/response/NokelockResponse;->type:Lco/bird/android/model/constant/NokelockResponseType;

    iget-object v1, p0, Lco/bird/api/response/NokelockResponse;->data:Lco/bird/android/model/wire/WireNokelockResponseData;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NokelockResponse(type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", data="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method