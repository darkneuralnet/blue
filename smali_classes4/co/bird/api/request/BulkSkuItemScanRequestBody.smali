.class public final Lco/bird/api/request/BulkSkuItemScanRequestBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00082\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/api/request/BulkSkuItemScanRequestBody;",
        "",
        "skuOrderId",
        "",
        "scannedItems",
        "",
        "Lco/bird/api/request/SkuScannedItemRequest;",
        "inbound",
        "",
        "nonServiceCenter",
        "(Ljava/lang/String;Ljava/util/List;ZZ)V",
        "getInbound",
        "()Z",
        "getNonServiceCenter",
        "getScannedItems",
        "()Ljava/util/List;",
        "getSkuOrderId",
        "()Ljava/lang/String;",
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
.field private final inbound:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "inbound"
    .end annotation

    .annotation runtime Lft5;
        value = "inbound"
    .end annotation
.end field

.field private final nonServiceCenter:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "non_service_center"
    .end annotation

    .annotation runtime Lft5;
        value = "non_service_center"
    .end annotation
.end field

.field private final scannedItems:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanned_items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/request/SkuScannedItemRequest;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "scanned_items"
    .end annotation
.end field

.field private final skuOrderId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "sku_order_id"
    .end annotation

    .annotation runtime Lft5;
        value = "sku_order_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/api/request/SkuScannedItemRequest;",
            ">;ZZ)V"
        }
    .end annotation

    const-string v0, "skuOrderId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scannedItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->skuOrderId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->scannedItems:Ljava/util/List;

    iput-boolean p3, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->inbound:Z

    iput-boolean p4, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->nonServiceCenter:Z

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/BulkSkuItemScanRequestBody;Ljava/lang/String;Ljava/util/List;ZZILjava/lang/Object;)Lco/bird/api/request/BulkSkuItemScanRequestBody;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->skuOrderId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->scannedItems:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->inbound:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->nonServiceCenter:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/api/request/BulkSkuItemScanRequestBody;->copy(Ljava/lang/String;Ljava/util/List;ZZ)Lco/bird/api/request/BulkSkuItemScanRequestBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->skuOrderId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/request/SkuScannedItemRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->scannedItems:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->inbound:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->nonServiceCenter:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;ZZ)Lco/bird/api/request/BulkSkuItemScanRequestBody;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/api/request/SkuScannedItemRequest;",
            ">;ZZ)",
            "Lco/bird/api/request/BulkSkuItemScanRequestBody;"
        }
    .end annotation

    const-string v0, "skuOrderId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scannedItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/BulkSkuItemScanRequestBody;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/api/request/BulkSkuItemScanRequestBody;-><init>(Ljava/lang/String;Ljava/util/List;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/BulkSkuItemScanRequestBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/BulkSkuItemScanRequestBody;

    iget-object v1, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->skuOrderId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/BulkSkuItemScanRequestBody;->skuOrderId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->scannedItems:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/request/BulkSkuItemScanRequestBody;->scannedItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->inbound:Z

    iget-boolean v3, p1, Lco/bird/api/request/BulkSkuItemScanRequestBody;->inbound:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->nonServiceCenter:Z

    iget-boolean p1, p1, Lco/bird/api/request/BulkSkuItemScanRequestBody;->nonServiceCenter:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getInbound()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->inbound:Z

    return v0
.end method

.method public final getNonServiceCenter()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->nonServiceCenter:Z

    return v0
.end method

.method public final getScannedItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/request/SkuScannedItemRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->scannedItems:Ljava/util/List;

    return-object v0
.end method

.method public final getSkuOrderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->skuOrderId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->skuOrderId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->scannedItems:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->inbound:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->nonServiceCenter:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->skuOrderId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->scannedItems:Ljava/util/List;

    iget-boolean v2, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->inbound:Z

    iget-boolean v3, p0, Lco/bird/api/request/BulkSkuItemScanRequestBody;->nonServiceCenter:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "BulkSkuItemScanRequestBody(skuOrderId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", scannedItems="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", inbound="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", nonServiceCenter="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
