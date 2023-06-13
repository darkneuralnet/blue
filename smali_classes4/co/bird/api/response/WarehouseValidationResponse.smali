.class public final Lco/bird/api/response/WarehouseValidationResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/api/response/WarehouseValidationResponse;",
        "",
        "valid",
        "",
        "warehouse",
        "Lco/bird/android/model/Warehouse;",
        "(ZLco/bird/android/model/Warehouse;)V",
        "getValid",
        "()Z",
        "getWarehouse",
        "()Lco/bird/android/model/Warehouse;",
        "component1",
        "component2",
        "copy",
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
.field private final valid:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "valid"
    .end annotation

    .annotation runtime Lft5;
        value = "valid"
    .end annotation
.end field

.field private final warehouse:Lco/bird/android/model/Warehouse;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "warehouse"
    .end annotation

    .annotation runtime Lft5;
        value = "warehouse"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lco/bird/api/response/WarehouseValidationResponse;-><init>(ZLco/bird/android/model/Warehouse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLco/bird/android/model/Warehouse;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/api/response/WarehouseValidationResponse;->valid:Z

    iput-object p2, p0, Lco/bird/api/response/WarehouseValidationResponse;->warehouse:Lco/bird/android/model/Warehouse;

    return-void
.end method

.method public synthetic constructor <init>(ZLco/bird/android/model/Warehouse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-direct {p0, p1, p2}, Lco/bird/api/response/WarehouseValidationResponse;-><init>(ZLco/bird/android/model/Warehouse;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/WarehouseValidationResponse;ZLco/bird/android/model/Warehouse;ILjava/lang/Object;)Lco/bird/api/response/WarehouseValidationResponse;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lco/bird/api/response/WarehouseValidationResponse;->valid:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/api/response/WarehouseValidationResponse;->warehouse:Lco/bird/android/model/Warehouse;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/api/response/WarehouseValidationResponse;->copy(ZLco/bird/android/model/Warehouse;)Lco/bird/api/response/WarehouseValidationResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/response/WarehouseValidationResponse;->valid:Z

    return v0
.end method

.method public final component2()Lco/bird/android/model/Warehouse;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WarehouseValidationResponse;->warehouse:Lco/bird/android/model/Warehouse;

    return-object v0
.end method

.method public final copy(ZLco/bird/android/model/Warehouse;)Lco/bird/api/response/WarehouseValidationResponse;
    .locals 1

    new-instance v0, Lco/bird/api/response/WarehouseValidationResponse;

    invoke-direct {v0, p1, p2}, Lco/bird/api/response/WarehouseValidationResponse;-><init>(ZLco/bird/android/model/Warehouse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/WarehouseValidationResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/WarehouseValidationResponse;

    iget-boolean v1, p0, Lco/bird/api/response/WarehouseValidationResponse;->valid:Z

    iget-boolean v3, p1, Lco/bird/api/response/WarehouseValidationResponse;->valid:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/WarehouseValidationResponse;->warehouse:Lco/bird/android/model/Warehouse;

    iget-object p1, p1, Lco/bird/api/response/WarehouseValidationResponse;->warehouse:Lco/bird/android/model/Warehouse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getValid()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/response/WarehouseValidationResponse;->valid:Z

    return v0
.end method

.method public final getWarehouse()Lco/bird/android/model/Warehouse;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WarehouseValidationResponse;->warehouse:Lco/bird/android/model/Warehouse;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lco/bird/api/response/WarehouseValidationResponse;->valid:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/WarehouseValidationResponse;->warehouse:Lco/bird/android/model/Warehouse;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/Warehouse;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lco/bird/api/response/WarehouseValidationResponse;->valid:Z

    iget-object v1, p0, Lco/bird/api/response/WarehouseValidationResponse;->warehouse:Lco/bird/android/model/Warehouse;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WarehouseValidationResponse(valid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", warehouse="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
