.class public final Lco/bird/api/response/WarehouseInventory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BI\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000cJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003JR\u0010 \u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0016\u00a8\u0006."
    }
    d2 = {
        "Lco/bird/api/response/WarehouseInventory;",
        "Landroid/os/Parcelable;",
        "name",
        "",
        "binCount",
        "",
        "binWeight",
        "",
        "binDefinition",
        "Lco/bird/api/response/WireBinDefinition;",
        "quantity",
        "excessInventoryQuantity",
        "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;II)V",
        "getBinCount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getBinDefinition",
        "()Lco/bird/api/response/WireBinDefinition;",
        "getBinWeight",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getExcessInventoryQuantity",
        "()I",
        "getName",
        "()Ljava/lang/String;",
        "getQuantity",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;II)Lco/bird/api/response/WarehouseInventory;",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/api/response/WarehouseInventory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final binCount:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bin_count"
    .end annotation

    .annotation runtime Lft5;
        value = "bin_count"
    .end annotation
.end field

.field private final binDefinition:Lco/bird/api/response/WireBinDefinition;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bin_definition"
    .end annotation

    .annotation runtime Lft5;
        value = "bin_definition"
    .end annotation
.end field

.field private final binWeight:Ljava/lang/Float;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bin_weight"
    .end annotation

    .annotation runtime Lft5;
        value = "bin_weight"
    .end annotation
.end field

.field private final excessInventoryQuantity:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "excess_inventory_quantity"
    .end annotation

    .annotation runtime Lft5;
        value = "excess_inventory_quantity"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "name"
    .end annotation

    .annotation runtime Lft5;
        value = "name"
    .end annotation
.end field

.field private final quantity:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "quantity"
    .end annotation

    .annotation runtime Lft5;
        value = "quantity"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/api/response/WarehouseInventory$Creator;

    invoke-direct {v0}, Lco/bird/api/response/WarehouseInventory$Creator;-><init>()V

    sput-object v0, Lco/bird/api/response/WarehouseInventory;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lco/bird/api/response/WarehouseInventory;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/WarehouseInventory;->name:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/response/WarehouseInventory;->binCount:Ljava/lang/Integer;

    iput-object p3, p0, Lco/bird/api/response/WarehouseInventory;->binWeight:Ljava/lang/Float;

    iput-object p4, p0, Lco/bird/api/response/WarehouseInventory;->binDefinition:Lco/bird/api/response/WireBinDefinition;

    iput p5, p0, Lco/bird/api/response/WarehouseInventory;->quantity:I

    iput p6, p0, Lco/bird/api/response/WarehouseInventory;->excessInventoryQuantity:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p8, v0

    goto :goto_0

    :cond_0
    move-object p8, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    move-object v2, v0

    goto :goto_2

    :cond_2
    move-object v2, p3

    :goto_2
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, p4

    :goto_3
    and-int/lit8 p1, p7, 0x10

    const/4 p2, 0x0

    if-eqz p1, :cond_4

    move v3, p2

    goto :goto_4

    :cond_4
    move v3, p5

    :goto_4
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_5

    move p7, p2

    goto :goto_5

    :cond_5
    move p7, p6

    :goto_5
    move-object p1, p0

    move-object p2, p8

    move-object p3, v1

    move-object p4, v2

    move-object p5, v0

    move p6, v3

    invoke-direct/range {p1 .. p7}, Lco/bird/api/response/WarehouseInventory;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;II)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/WarehouseInventory;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;IIILjava/lang/Object;)Lco/bird/api/response/WarehouseInventory;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lco/bird/api/response/WarehouseInventory;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lco/bird/api/response/WarehouseInventory;->binCount:Ljava/lang/Integer;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/api/response/WarehouseInventory;->binWeight:Ljava/lang/Float;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/api/response/WarehouseInventory;->binDefinition:Lco/bird/api/response/WireBinDefinition;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, Lco/bird/api/response/WarehouseInventory;->quantity:I

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget p6, p0, Lco/bird/api/response/WarehouseInventory;->excessInventoryQuantity:I

    :cond_5
    move v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/api/response/WarehouseInventory;->copy(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;II)Lco/bird/api/response/WarehouseInventory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->binCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->binWeight:Ljava/lang/Float;

    return-object v0
.end method

.method public final component4()Lco/bird/api/response/WireBinDefinition;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->binDefinition:Lco/bird/api/response/WireBinDefinition;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/WarehouseInventory;->quantity:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/WarehouseInventory;->excessInventoryQuantity:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;II)Lco/bird/api/response/WarehouseInventory;
    .locals 8

    new-instance v7, Lco/bird/api/response/WarehouseInventory;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lco/bird/api/response/WarehouseInventory;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;II)V

    return-object v7
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/WarehouseInventory;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/WarehouseInventory;

    iget-object v1, p0, Lco/bird/api/response/WarehouseInventory;->name:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/WarehouseInventory;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/WarehouseInventory;->binCount:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/api/response/WarehouseInventory;->binCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/WarehouseInventory;->binWeight:Ljava/lang/Float;

    iget-object v3, p1, Lco/bird/api/response/WarehouseInventory;->binWeight:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/response/WarehouseInventory;->binDefinition:Lco/bird/api/response/WireBinDefinition;

    iget-object v3, p1, Lco/bird/api/response/WarehouseInventory;->binDefinition:Lco/bird/api/response/WireBinDefinition;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/bird/api/response/WarehouseInventory;->quantity:I

    iget v3, p1, Lco/bird/api/response/WarehouseInventory;->quantity:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/bird/api/response/WarehouseInventory;->excessInventoryQuantity:I

    iget p1, p1, Lco/bird/api/response/WarehouseInventory;->excessInventoryQuantity:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBinCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->binCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getBinDefinition()Lco/bird/api/response/WireBinDefinition;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->binDefinition:Lco/bird/api/response/WireBinDefinition;

    return-object v0
.end method

.method public final getBinWeight()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->binWeight:Ljava/lang/Float;

    return-object v0
.end method

.method public final getExcessInventoryQuantity()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/WarehouseInventory;->excessInventoryQuantity:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuantity()I
    .locals 1

    iget v0, p0, Lco/bird/api/response/WarehouseInventory;->quantity:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->name:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WarehouseInventory;->binCount:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WarehouseInventory;->binWeight:Ljava/lang/Float;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WarehouseInventory;->binDefinition:Lco/bird/api/response/WireBinDefinition;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lco/bird/api/response/WireBinDefinition;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/response/WarehouseInventory;->quantity:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/response/WarehouseInventory;->excessInventoryQuantity:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->name:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/response/WarehouseInventory;->binCount:Ljava/lang/Integer;

    iget-object v2, p0, Lco/bird/api/response/WarehouseInventory;->binWeight:Ljava/lang/Float;

    iget-object v3, p0, Lco/bird/api/response/WarehouseInventory;->binDefinition:Lco/bird/api/response/WireBinDefinition;

    iget v4, p0, Lco/bird/api/response/WarehouseInventory;->quantity:I

    iget v5, p0, Lco/bird/api/response/WarehouseInventory;->excessInventoryQuantity:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "WarehouseInventory(name="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", binCount="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", binWeight="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", binDefinition="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", quantity="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", excessInventoryQuantity="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->binCount:Ljava/lang/Integer;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->binWeight:Ljava/lang/Float;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    :goto_1
    iget-object v0, p0, Lco/bird/api/response/WarehouseInventory;->binDefinition:Lco/bird/api/response/WireBinDefinition;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/api/response/WireBinDefinition;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget p2, p0, Lco/bird/api/response/WarehouseInventory;->quantity:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lco/bird/api/response/WarehouseInventory;->excessInventoryQuantity:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
