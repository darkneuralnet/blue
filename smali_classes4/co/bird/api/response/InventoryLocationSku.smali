.class public final Lco/bird/api/response/InventoryLocationSku;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/api/response/InventoryLocationSku;",
        "",
        "sku",
        "Lco/bird/api/response/Sku;",
        "count",
        "Lco/bird/api/response/InventoryLocationCount;",
        "metric",
        "Lco/bird/api/response/InventoryLocationMetric;",
        "(Lco/bird/api/response/Sku;Lco/bird/api/response/InventoryLocationCount;Lco/bird/api/response/InventoryLocationMetric;)V",
        "getCount",
        "()Lco/bird/api/response/InventoryLocationCount;",
        "getMetric",
        "()Lco/bird/api/response/InventoryLocationMetric;",
        "getSku",
        "()Lco/bird/api/response/Sku;",
        "component1",
        "component2",
        "component3",
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
.field private final count:Lco/bird/api/response/InventoryLocationCount;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "count"
    .end annotation

    .annotation runtime Lft5;
        value = "count"
    .end annotation
.end field

.field private final metric:Lco/bird/api/response/InventoryLocationMetric;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "metric"
    .end annotation

    .annotation runtime Lft5;
        value = "metric"
    .end annotation
.end field

.field private final sku:Lco/bird/api/response/Sku;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "sku"
    .end annotation

    .annotation runtime Lft5;
        value = "sku"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/api/response/Sku;Lco/bird/api/response/InventoryLocationCount;Lco/bird/api/response/InventoryLocationMetric;)V
    .locals 1

    const-string v0, "sku"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/InventoryLocationSku;->sku:Lco/bird/api/response/Sku;

    iput-object p2, p0, Lco/bird/api/response/InventoryLocationSku;->count:Lco/bird/api/response/InventoryLocationCount;

    iput-object p3, p0, Lco/bird/api/response/InventoryLocationSku;->metric:Lco/bird/api/response/InventoryLocationMetric;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/api/response/Sku;Lco/bird/api/response/InventoryLocationCount;Lco/bird/api/response/InventoryLocationMetric;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lco/bird/api/response/InventoryLocationSku;-><init>(Lco/bird/api/response/Sku;Lco/bird/api/response/InventoryLocationCount;Lco/bird/api/response/InventoryLocationMetric;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/InventoryLocationSku;Lco/bird/api/response/Sku;Lco/bird/api/response/InventoryLocationCount;Lco/bird/api/response/InventoryLocationMetric;ILjava/lang/Object;)Lco/bird/api/response/InventoryLocationSku;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/api/response/InventoryLocationSku;->sku:Lco/bird/api/response/Sku;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/api/response/InventoryLocationSku;->count:Lco/bird/api/response/InventoryLocationCount;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/api/response/InventoryLocationSku;->metric:Lco/bird/api/response/InventoryLocationMetric;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/response/InventoryLocationSku;->copy(Lco/bird/api/response/Sku;Lco/bird/api/response/InventoryLocationCount;Lco/bird/api/response/InventoryLocationMetric;)Lco/bird/api/response/InventoryLocationSku;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/api/response/Sku;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/InventoryLocationSku;->sku:Lco/bird/api/response/Sku;

    return-object v0
.end method

.method public final component2()Lco/bird/api/response/InventoryLocationCount;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/InventoryLocationSku;->count:Lco/bird/api/response/InventoryLocationCount;

    return-object v0
.end method

.method public final component3()Lco/bird/api/response/InventoryLocationMetric;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/InventoryLocationSku;->metric:Lco/bird/api/response/InventoryLocationMetric;

    return-object v0
.end method

.method public final copy(Lco/bird/api/response/Sku;Lco/bird/api/response/InventoryLocationCount;Lco/bird/api/response/InventoryLocationMetric;)Lco/bird/api/response/InventoryLocationSku;
    .locals 1

    const-string v0, "sku"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/InventoryLocationSku;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/response/InventoryLocationSku;-><init>(Lco/bird/api/response/Sku;Lco/bird/api/response/InventoryLocationCount;Lco/bird/api/response/InventoryLocationMetric;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/InventoryLocationSku;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/InventoryLocationSku;

    iget-object v1, p0, Lco/bird/api/response/InventoryLocationSku;->sku:Lco/bird/api/response/Sku;

    iget-object v3, p1, Lco/bird/api/response/InventoryLocationSku;->sku:Lco/bird/api/response/Sku;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/InventoryLocationSku;->count:Lco/bird/api/response/InventoryLocationCount;

    iget-object v3, p1, Lco/bird/api/response/InventoryLocationSku;->count:Lco/bird/api/response/InventoryLocationCount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/InventoryLocationSku;->metric:Lco/bird/api/response/InventoryLocationMetric;

    iget-object p1, p1, Lco/bird/api/response/InventoryLocationSku;->metric:Lco/bird/api/response/InventoryLocationMetric;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCount()Lco/bird/api/response/InventoryLocationCount;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/InventoryLocationSku;->count:Lco/bird/api/response/InventoryLocationCount;

    return-object v0
.end method

.method public final getMetric()Lco/bird/api/response/InventoryLocationMetric;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/InventoryLocationSku;->metric:Lco/bird/api/response/InventoryLocationMetric;

    return-object v0
.end method

.method public final getSku()Lco/bird/api/response/Sku;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/InventoryLocationSku;->sku:Lco/bird/api/response/Sku;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/InventoryLocationSku;->sku:Lco/bird/api/response/Sku;

    invoke-virtual {v0}, Lco/bird/api/response/Sku;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/InventoryLocationSku;->count:Lco/bird/api/response/InventoryLocationCount;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/api/response/InventoryLocationCount;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/InventoryLocationSku;->metric:Lco/bird/api/response/InventoryLocationMetric;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/api/response/InventoryLocationMetric;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/api/response/InventoryLocationSku;->sku:Lco/bird/api/response/Sku;

    iget-object v1, p0, Lco/bird/api/response/InventoryLocationSku;->count:Lco/bird/api/response/InventoryLocationCount;

    iget-object v2, p0, Lco/bird/api/response/InventoryLocationSku;->metric:Lco/bird/api/response/InventoryLocationMetric;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "InventoryLocationSku(sku="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", count="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metric="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
